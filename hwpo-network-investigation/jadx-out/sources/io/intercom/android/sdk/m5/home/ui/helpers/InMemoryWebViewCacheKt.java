package io.intercom.android.sdk.m5.home.ui.helpers;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.intercom.twig.BuildConfig;
import defpackage.z2a;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InMemoryWebViewCacheKt {
    private static Map<String, CardWebView> webViewCache = new LinkedHashMap();

    public static final void cacheWebView(String str, CardWebView cardWebView) {
        str.getClass();
        cardWebView.getClass();
        String idFromURL = getIdFromURL(str);
        ViewParent parent = cardWebView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(cardWebView);
        }
        webViewCache.put(idFromURL, cardWebView);
    }

    public static final void clearWebViewCache() {
        for (CardWebView cardWebView : webViewCache.values()) {
            ViewParent parent = cardWebView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(cardWebView);
            }
            cardWebView.destroy();
        }
        webViewCache.clear();
    }

    public static final CardWebView getCachedWebView(String str) {
        str.getClass();
        CardWebView cardWebView = webViewCache.get(getIdFromURL(str));
        if (cardWebView != null) {
            ViewParent parent = cardWebView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(cardWebView);
            }
        }
        return cardWebView;
    }

    private static final String getFromURL(String str, String str2, String str3) {
        return z2a.P(z2a.L(str, str2 + '=', str3), "&");
    }

    public static /* synthetic */ String getFromURL$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return getFromURL(str, str2, str3);
    }

    private static final String getIdFromURL(String str) {
        return getFromURL$default(str, "card_id", null, 4, null) + '#' + getFromURL(str, "theme", BuildConfig.FLAVOR);
    }
}
