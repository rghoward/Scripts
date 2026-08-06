package io.intercom.android.sdk.m5.home.ui.components;

import defpackage.ae8;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$LegacyMessengerAppCardKt {
    public static final ComposableSingletons$LegacyMessengerAppCardKt INSTANCE = new ComposableSingletons$LegacyMessengerAppCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f241lambda1 = new fr1(false, -1061808800, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$LegacyMessengerAppCardKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                ae8.a(null, 0L, 0.0f, 0L, 0, 0.0f, jt1Var, 0, 63);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f242lambda2 = new fr1(false, -570136522, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$LegacyMessengerAppCardKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LegacyMessengerAppCardKt.INSTANCE.m339getLambda1$intercom_sdk_base_release(), jt1Var, 3072, 7);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m339getLambda1$intercom_sdk_base_release() {
        return f241lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m340getLambda2$intercom_sdk_base_release() {
        return f242lambda2;
    }
}
