package io.intercom.android.sdk.m5;

import android.content.Context;
import android.content.Intent;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationScreenOpenerKt {
    public static final Intent getComposerIntent(Context context, String str, boolean z, ArticleMetadata articleMetadata, String str2, Class<?> cls) {
        context.getClass();
        str.getClass();
        cls.getClass();
        return IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(str2, str, z, articleMetadata != null ? articleMetadata.getId() : null, articleMetadata != null ? articleMetadata.getTitle() : null, null, 32, null), cls, null, 8, null);
    }

    public static /* synthetic */ Intent getComposerIntent$default(Context context, String str, boolean z, ArticleMetadata articleMetadata, String str2, Class cls, int i, Object obj) {
        if ((i & 2) != 0) {
            str = BuildConfig.FLAVOR;
        }
        if ((i & 32) != 0) {
            cls = IntercomRootActivity.class;
        }
        return getComposerIntent(context, str, z, articleMetadata, str2, cls);
    }

    public static final Intent getConversationIntent(Context context, String str) {
        context.getClass();
        return IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(str, BuildConfig.FLAVOR, false, null, null, null, 48, null), null, null, 12, null);
    }

    public static final void openComposer(Context context, String str, boolean z, ArticleMetadata articleMetadata, String str2) {
        context.getClass();
        str.getClass();
        context.startActivity(getComposerIntent$default(context, str, z, articleMetadata, str2, null, 32, null));
    }

    public static /* synthetic */ void openComposer$default(Context context, String str, boolean z, ArticleMetadata articleMetadata, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = BuildConfig.FLAVOR;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            articleMetadata = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        openComposer(context, str, z, articleMetadata, str2);
    }
}
