package io.intercom.android.sdk.ui.component;

import defpackage.al8;
import defpackage.ci4;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.jv0;
import defpackage.ox6;
import defpackage.uh1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$PulsatingBoxKt {
    public static final ComposableSingletons$PulsatingBoxKt INSTANCE = new ComposableSingletons$PulsatingBoxKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<jv0, jt1, Integer, g2b> f387lambda1 = new fr1(false, -188171614, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PulsatingBoxKt$lambda-1$1
        public final void invoke(jv0 jv0Var, jt1 jt1Var, int i) {
            jv0Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
            } else {
                dv0.a(gi0.c(ir9.j(ox6.a.t, 100.0f), uh1.e, al8.a), jt1Var, 6);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var, Integer num) {
            invoke(jv0Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f388lambda2 = new fr1(false, -579145229, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PulsatingBoxKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                PulsatingBoxKt.m593PulsatingBoxFU0evQE(null, 1.5f, 0L, null, true, ComposableSingletons$PulsatingBoxKt.INSTANCE.m567getLambda1$intercom_sdk_ui_release(), jt1Var, 221232, 13);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final ei4<jv0, jt1, Integer, g2b> m567getLambda1$intercom_sdk_ui_release() {
        return f387lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_ui_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m568getLambda2$intercom_sdk_ui_release() {
        return f388lambda2;
    }
}
