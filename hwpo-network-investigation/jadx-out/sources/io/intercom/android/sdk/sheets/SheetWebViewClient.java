package io.intercom.android.sdk.sheets;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class SheetWebViewClient extends WebViewClient {
    private final SheetListener sheetListener;

    public SheetWebViewClient(SheetListener sheetListener) {
        this.sheetListener = sheetListener;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.sheetListener.onWebViewFinishedLoad();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String scheme = Uri.parse(str).getScheme();
        if (scheme.equals("http") || scheme.equals("https")) {
            webView.loadUrl(str);
            return false;
        }
        LinkOpener.handleUrl(str, webView.getContext(), Injector.get().getApi());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
