package io.intercom.android.sdk.m5.helpcenter.ui;

import defpackage.ei4;
import defpackage.eo7;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.ox6;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HelpCenterCollectionDetailsScreenKt {
    public static final ComposableSingletons$HelpCenterCollectionDetailsScreenKt INSTANCE = new ComposableSingletons$HelpCenterCollectionDetailsScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<fv5, jt1, Integer, g2b> f208lambda1 = new fr1(false, 904350452, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionDetailsScreenKt$lambda-1$1
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
    public static ei4<fv5, jt1, Integer, g2b> f209lambda2 = new fr1(false, -1111496463, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionDetailsScreenKt$lambda-2$1
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

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ei4<fv5, jt1, Integer, g2b> f210lambda3 = new fr1(false, 999489967, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionDetailsScreenKt$lambda-3$1
        public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
            fv5Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
            } else {
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(eo7.m(ox6.a.t, 0.0f, 24.0f, 0.0f, 0.0f, 13), jt1Var, 6, 0);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
            invoke(fv5Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<fv5, jt1, Integer, g2b> m297getLambda1$intercom_sdk_base_release() {
        return f208lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<fv5, jt1, Integer, g2b> m298getLambda2$intercom_sdk_base_release() {
        return f209lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<fv5, jt1, Integer, g2b> m299getLambda3$intercom_sdk_base_release() {
        return f210lambda3;
    }
}
