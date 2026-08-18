package com.o2bkids.honeycomb.family;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.getcapacitor.BridgeActivity;
import com.getcapacitor.WebViewListener;
import androidx.activity.OnBackPressedCallback;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class MainActivity extends BridgeActivity {
    public static final String EXTRA_NOTIFICATION_CHILD_ID = "honeycomb_notification_child_id";
    public static final String EXTRA_NOTIFICATION_TAB = "honeycomb_notification_tab";
    public static final String EXTRA_NOTIFICATION_PHOTO_ID = "honeycomb_notification_photo_id";

    private String dashboardScript = "";
    private String loginThemeScript = "";
    private String pendingNotificationChildId = "";
    private String pendingNotificationTab = "";
    private String pendingNotificationPhotoId = "";
    private OnBackPressedCallback dashboardBackCallback;
    private HoneycombDownloadBridge downloadBridge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        captureNotificationTarget(getIntent());
        dashboardScript = readDashboardScript();
        loginThemeScript = readAsset("public/login-theme.js");
        bridgeBuilder.addWebViewListener(new WebViewListener() {
            @Override
            public void onPageLoaded(WebView webView) {
                webView.evaluateJavascript(loginThemeScript, null);
                injectDashboardWhenAuthenticated(webView);
                dispatchNotificationTarget(webView);
            }
        });
        super.onCreate(savedInstanceState);
        subscribeToPushUpdates();
        downloadBridge = new HoneycombDownloadBridge(this, bridge.getWebView());
        bridge.getWebView().addJavascriptInterface(downloadBridge, "HoneycombDownloads");
        dashboardBackCallback = new OnBackPressedCallback(true) {
            @Override public void handleOnBackPressed() {
                if (bridge == null || bridge.getWebView() == null) {
                    passBackToAndroid();
                    return;
                }
                bridge.getWebView().evaluateJavascript(
                    "Boolean(window.__HCFD_HANDLE_BACK__ && window.__HCFD_HANDLE_BACK__())",
                    result -> { if (!"true".equals(result)) passBackToAndroid(); }
                );
            }
        };
        getOnBackPressedDispatcher().addCallback(this, dashboardBackCallback);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        captureNotificationTarget(intent);
        if (bridge != null && bridge.getWebView() != null) {
            dispatchNotificationTarget(bridge.getWebView());
        }
    }

    private void captureNotificationTarget(Intent intent) {
        if (intent == null) return;
        String childId = intent.getStringExtra(EXTRA_NOTIFICATION_CHILD_ID);
        String tab = intent.getStringExtra(EXTRA_NOTIFICATION_TAB);
        String photoId = intent.getStringExtra(EXTRA_NOTIFICATION_PHOTO_ID);
        if (childId == null || childId.trim().isEmpty()) return;
        pendingNotificationChildId = childId.trim();
        pendingNotificationTab = allowedNotificationTab(tab);
        pendingNotificationPhotoId = photoId == null ? "" : photoId.trim();
        // Older Ubuntu photo alerts already on the device only contain the
        // former Photos destination. Open the newest loaded photo for those
        // alerts; newer alerts carry an exact photo ID.
        if (pendingNotificationPhotoId.isEmpty() && "photos".equals(tab)) {
            pendingNotificationPhotoId = "latest";
        }
    }

    private String allowedNotificationTab(String tab) {
        // Every server alert returns to the child's Today screen. The alert
        // itself already identifies its category, while Today is the most
        // useful landing view after the family has been away from the app.
        return "home";
    }

    private void dispatchNotificationTarget(WebView webView) {
        if (pendingNotificationChildId.isEmpty()) return;
        String target = "{childId:" + JSONObject.quote(pendingNotificationChildId)
            + ",tab:" + JSONObject.quote(pendingNotificationTab)
            + ",photoId:" + JSONObject.quote(pendingNotificationPhotoId) + "}";
        String script = "(function(target){"
            + "window.__HCFD_PENDING_NOTIFICATION__=target;"
            + "if(window.__HCFD_OPEN_NOTIFICATION__)window.__HCFD_OPEN_NOTIFICATION__(target);"
            + "})(" + target + ");";
        webView.evaluateJavascript(script, null);
    }

    private void subscribeToPushUpdates() {
        try {
            FirebaseMessaging.getInstance()
                .subscribeToTopic(getString(R.string.push_topic))
                .addOnSuccessListener(unused -> Log.i("HoneycombPush", "Subscribed to family updates."))
                .addOnFailureListener(error -> Log.w("HoneycombPush", "Could not subscribe to family updates.", error));
        } catch (IllegalStateException error) {
            // The development APK can be built without google-services.json.
            // It remains fully usable, but does not receive FCM until Firebase
            // is configured as documented in ubuntu-monitor/ANDROID_PUSH_EXPECTATIONS.md.
            Log.i("HoneycombPush", "Firebase is not configured for this APK.");
        }
    }

    private String readDashboardScript() {
        return readAsset("public/honeycomb.js");
    }

    private String readAsset(String path) {
        try (InputStream stream = getAssets().open(path)) {
            byte[] bytes = new byte[stream.available()];
            int total = 0;
            while (total < bytes.length) {
                int count = stream.read(bytes, total, bytes.length - total);
                if (count < 0) break;
                total += count;
            }
            return new String(bytes, 0, total, StandardCharsets.UTF_8);
        } catch (IOException error) {
            return "console.error('[Honeycomb mobile] Dashboard asset missing');";
        }
    }

    private void injectDashboardWhenAuthenticated(WebView webView) {
        String url = webView.getUrl();
        if (url == null || !url.startsWith("https://honeycomb.o2bkids.com/")) return;

        String guardedScript = "(function(){"
            + "if(window.__HCFD_MOBILE_WATCHING__)return;"
            + "window.__HCFD_MOBILE_WATCHING__=true;"
            + "var authenticated=false,failures=0;"
            + "function check(){"
            + "fetch('/api/membership/children',{credentials:'same-origin',headers:{Accept:'application/json'}})"
            + ".then(function(r){return r.ok?r.json():null})"
            + ".then(function(j){if(j&&j.Success){"
            + "authenticated=true;failures=0;if(!window.__HCFD_MOBILE_INJECTED__){window.__HCFD_MOBILE_INJECTED__=true;"
            + dashboardScript + "}"
            + "}else if(authenticated&&++failures>=2){authenticated=false;Promise.resolve(window.__HCFD_CLEAR_PRIVATE_DATA__&&window.__HCFD_CLEAR_PRIVATE_DATA__());}})"
            + ".catch(function(){/* The user may still be signing in. */});"
            + "}"
            + "check();setInterval(check,15000);"
            + "})();";
        webView.evaluateJavascript(guardedScript, null);
    }

    private void passBackToAndroid() {
        dashboardBackCallback.setEnabled(false);
        getOnBackPressedDispatcher().onBackPressed();
        dashboardBackCallback.setEnabled(true);
    }

    @Override
    public void onDestroy() {
        if (downloadBridge != null) downloadBridge.shutdown();
        super.onDestroy();
    }
}
