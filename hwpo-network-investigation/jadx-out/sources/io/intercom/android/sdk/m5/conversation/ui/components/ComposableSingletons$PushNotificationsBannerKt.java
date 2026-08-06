package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.is7;
import defpackage.jt1;
import defpackage.m65;
import defpackage.nr1;
import defpackage.ox6;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$PushNotificationsBannerKt {
    public static final ComposableSingletons$PushNotificationsBannerKt INSTANCE = new ComposableSingletons$PushNotificationsBannerKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f106lambda1 = new fr1(false, 772935366, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$PushNotificationsBannerKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                m65.b(is7.a(R.drawable.intercom_ic_close, jt1Var, 0), nr1.f(jt1Var, io.intercom.android.sdk.R.string.intercom_close), ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var, IntercomTheme.$stable).getIcon().m809getMuted0d7_KjU(), jt1Var, 392, 0);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f107lambda2 = new fr1(false, -353143684, ComposableSingletons$PushNotificationsBannerKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m137getLambda1$intercom_sdk_base_release() {
        return f106lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m138getLambda2$intercom_sdk_base_release() {
        return f107lambda2;
    }
}
