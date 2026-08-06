package io.intercom.android.sdk.helpcenter.utils;

import android.content.Context;
import com.intercom.twig.BuildConfig;
import defpackage.th1;
import defpackage.w2a;
import defpackage.z2a;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterUrlUtilsKt {
    public static final String extractIdFromLastSegment(String str) {
        str.getClass();
        List listI = z2a.I(str, new String[]{"-"}, 6);
        return !listI.isEmpty() ? (String) listI.get(0) : BuildConfig.FLAVOR;
    }

    public static final boolean isHelpCenterArticleUrl(String str, Set<String> set) {
        str.getClass();
        set.getClass();
        return isHelpCenterUrl(str, set) && z2a.o(str, "/articles/", false);
    }

    public static final boolean isHelpCenterCollectionUrl(String str, Set<String> set) {
        str.getClass();
        set.getClass();
        return isHelpCenterUrl(str, set) && z2a.o(str, "/collections/", false);
    }

    private static final boolean isHelpCenterUrl(String str, Set<String> set) {
        Set<String> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (w2a.n(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void openArticle(Context context, String str, String str2, boolean z) {
        context.getClass();
        str.getClass();
        str2.getClass();
        context.startActivity(IntercomArticleActivity.Companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(str, str2, false, z, 4, null)));
    }

    public static /* synthetic */ void openArticle$default(Context context, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        openArticle(context, str, str2, z);
    }

    public static final void openCollection(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, str, str2);
    }

    public static final void openCollections(Context context, List<String> list, String str) {
        context.getClass();
        list.getClass();
        str.getClass();
        if (list.size() == 1) {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, (String) th1.y(list), str);
        } else {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, list, str);
        }
    }

    public static final void openArticle(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        openArticle$default(context, str, str2, false, 8, null);
    }
}
