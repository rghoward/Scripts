package io.intercom.android.sdk.articles;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.utilities.LinkOpener;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ArticleWebViewClient extends WebViewClient {
    private final String articleUrl;
    private final ArticleWebViewListener articleWebViewListener;
    private boolean isArticleNotFound = false;
    private boolean isLoadError;

    public ArticleWebViewClient(String str, ArticleWebViewListener articleWebViewListener) {
        this.articleUrl = str;
        this.articleWebViewListener = articleWebViewListener;
    }

    private String extractArticleId(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf(45);
        return iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
    }

    private float getDensityIndependentPixels(int i, Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scrollToAnchorIfNeeded$0(WebView webView, String str) {
        try {
            this.articleWebViewListener.scrollArticleViewTo((int) getDensityIndependentPixels(Integer.parseInt(str), webView.getContext()));
        } catch (NumberFormatException unused) {
        }
    }

    private void scrollToAnchorIfNeeded(final WebView webView, String str) {
        String fragment = Uri.parse(str).getFragment();
        if (fragment != null) {
            webView.evaluateJavascript("document.getElementById(" + JSONObject.quote(fragment) + ").offsetTop", new ValueCallback() { // from class: g40
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    this.a.lambda$scrollToAnchorIfNeeded$0(webView, (String) obj);
                }
            });
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.isLoadError || this.isArticleNotFound) {
            return;
        }
        scrollToAnchorIfNeeded(webView, str);
        this.articleWebViewListener.onArticleFinishedLoading();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.isArticleNotFound) {
            return;
        }
        this.isLoadError = false;
        this.articleWebViewListener.onArticleStartedLoading();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            this.isLoadError = true;
            this.articleWebViewListener.onArticleLoadingError();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            if (webResourceResponse.getStatusCode() == 404 || webResourceResponse.getStatusCode() == 401) {
                this.isLoadError = true;
                this.isArticleNotFound = true;
                this.articleWebViewListener.articleNotFound();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        Uri uri2 = Uri.parse(this.articleUrl);
        String lastPathSegment = uri.getLastPathSegment();
        String lastPathSegment2 = uri2.getLastPathSegment();
        String strExtractArticleId = extractArticleId(lastPathSegment);
        String strExtractArticleId2 = extractArticleId(lastPathSegment2);
        if (!TextUtils.isEmpty(strExtractArticleId) && !TextUtils.isEmpty(strExtractArticleId2) && strExtractArticleId.equals(strExtractArticleId2)) {
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
