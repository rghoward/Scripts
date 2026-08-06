package io.intercom.android.sdk.blocks.messengercard;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MessengerCardWebViewClient extends WebViewClient {
    private static final int WEBVIEW_FADE_IN_TIME_MS = 150;
    private final String cardHost;

    public MessengerCardWebViewClient(String str) {
        this.cardHost = str;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        webView.animate().alpha(1.0f).setStartDelay(150L).setDuration(150L).start();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String host = Uri.parse(str).getHost();
        if (TextUtils.isEmpty(this.cardHost) || !this.cardHost.equals(host)) {
            LinkOpener.handleUrl(str, webView.getContext(), Injector.get().getApi());
            return true;
        }
        webView.loadUrl(str);
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
