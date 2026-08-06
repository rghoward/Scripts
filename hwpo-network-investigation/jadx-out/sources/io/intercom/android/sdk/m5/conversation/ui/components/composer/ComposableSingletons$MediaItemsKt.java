package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.ci4;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FileStyle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MediaItemsKt {
    public static final ComposableSingletons$MediaItemsKt INSTANCE = new ComposableSingletons$MediaItemsKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<FileStyle, jt1, Integer, g2b> f129lambda1 = new fr1(false, -1898051135, new ei4<FileStyle, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MediaItemsKt$lambda-1$1
        public final void invoke(FileStyle fileStyle, jt1 jt1Var, int i) {
            fileStyle.getClass();
            if ((i & 6) == 0) {
                i |= jt1Var.J(fileStyle) ? 4 : 2;
            }
            if ((i & 19) == 18 && jt1Var.r()) {
                jt1Var.u();
            } else {
                MediaItemsKt.m190MediaProgressIndicatorkbKKJSQ(20.0f, fileStyle.m279getIconColor0d7_KjU(), jt1Var, 6, 0);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(FileStyle fileStyle, jt1 jt1Var, Integer num) {
            invoke(fileStyle, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ei4<FileStyle, jt1, Integer, g2b> f130lambda2 = new fr1(false, -1081903419, new ei4<FileStyle, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MediaItemsKt$lambda-2$1
        public final void invoke(FileStyle fileStyle, jt1 jt1Var, int i) {
            fileStyle.getClass();
            if ((i & 6) == 0) {
                i |= jt1Var.J(fileStyle) ? 4 : 2;
            }
            if ((i & 19) == 18 && jt1Var.r()) {
                jt1Var.u();
            } else {
                MediaItemsKt.m191MediaRetryIconkbKKJSQ(20.0f, fileStyle.m279getIconColor0d7_KjU(), jt1Var, 6, 0);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(FileStyle fileStyle, jt1 jt1Var, Integer num) {
            invoke(fileStyle, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f131lambda3 = new fr1(false, 795159307, ComposableSingletons$MediaItemsKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f132lambda4 = new fr1(false, -2147443468, ComposableSingletons$MediaItemsKt$lambda4$1.INSTANCE);

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<FileStyle, jt1, Integer, g2b> m163getLambda1$intercom_sdk_base_release() {
        return f129lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<FileStyle, jt1, Integer, g2b> m164getLambda2$intercom_sdk_base_release() {
        return f130lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m165getLambda3$intercom_sdk_base_release() {
        return f131lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m166getLambda4$intercom_sdk_base_release() {
        return f132lambda4;
    }
}
