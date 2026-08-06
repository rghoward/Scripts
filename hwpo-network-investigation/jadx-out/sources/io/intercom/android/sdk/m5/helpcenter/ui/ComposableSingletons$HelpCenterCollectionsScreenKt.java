package io.intercom.android.sdk.m5.helpcenter.ui;

import defpackage.ei4;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.jt1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HelpCenterCollectionsScreenKt {
    public static final ComposableSingletons$HelpCenterCollectionsScreenKt INSTANCE = new ComposableSingletons$HelpCenterCollectionsScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<fv5, jt1, Integer, g2b> f211lambda1 = new fr1(false, -1194363873, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionsScreenKt$lambda-1$1
        public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
            fv5Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
            } else {
                HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(null, jt1Var, 0, 1);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
            invoke(fv5Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ei4<fv5, jt1, Integer, g2b> f212lambda2 = new fr1(false, 493330652, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionsScreenKt$lambda-2$1
        public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
            fv5Var.getClass();
            if ((i & 6) == 0) {
                i |= jt1Var.J(fv5Var) ? 4 : 2;
            }
            if ((i & 19) == 18 && jt1Var.r()) {
                jt1Var.u();
            } else {
                HelpCenterEmptyScreenKt.HelpCenterEmptyScreen(fv5Var.a(), jt1Var, 0, 0);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
            invoke(fv5Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<fv5, jt1, Integer, g2b> m300getLambda1$intercom_sdk_base_release() {
        return f211lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<fv5, jt1, Integer, g2b> m301getLambda2$intercom_sdk_base_release() {
        return f212lambda2;
    }
}
