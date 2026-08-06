package io.intercom.android.sdk.m5.helpcenter.ui;

import defpackage.al8;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.jt1;
import defpackage.ox6;
import defpackage.zg5;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HelpCenterLoadingScreenKt {
    public static final ComposableSingletons$HelpCenterLoadingScreenKt INSTANCE = new ComposableSingletons$HelpCenterLoadingScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f216lambda1 = new fr1(false, -1677282275, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterLoadingScreenKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(null, jt1Var, 0, 1);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f217lambda2 = new fr1(false, 1260403416, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterLoadingScreenKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(gi0.c(ox6.a.t, zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), al8.a), jt1Var, 0, 0);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m305getLambda1$intercom_sdk_base_release() {
        return f216lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m306getLambda2$intercom_sdk_base_release() {
        return f217lambda2;
    }
}
