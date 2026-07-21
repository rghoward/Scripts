package com.o2bkids.honeycomb.family;

import android.os.Bundle;
import android.webkit.WebView;

import com.getcapacitor.BridgeActivity;
import com.getcapacitor.WebViewListener;
import androidx.activity.OnBackPressedCallback;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class MainActivity extends BridgeActivity {
    private String dashboardScript = "";
    private String loginThemeScript = "";
    private OnBackPressedCallback dashboardBackCallback;
    private HoneycombDownloadBridge downloadBridge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dashboardScript = readDashboardScript();
        loginThemeScript = readAsset("public/login-theme.js");
        bridgeBuilder.addWebViewListener(new WebViewListener() {
            @Override
            public void onPageLoaded(WebView webView) {
                webView.evaluateJavascript(loginThemeScript, null);
                injectDashboardWhenAuthenticated(webView);
            }
        });
        super.onCreate(savedInstanceState);
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
