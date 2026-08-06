package io.intercom.android.sdk.m5.helpcenter.ui.components;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.xr1;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$HelpCenterTopBarKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HelpCenterTopBarKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$HelpCenterTopBarKt$lambda1$1 INSTANCE = new ComposableSingletons$HelpCenterTopBarKt$lambda1$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(171143410);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new d();
            jt1Var.C(objF);
        }
        mh4 mh4Var = (mh4) objF;
        Object objA = xr1.a(jt1Var, 171144434);
        if (objA == c0187a) {
            objA = new e();
            jt1Var.C(objA);
        }
        jt1Var.B();
        HelpCenterTopBarKt.HelpCenterTopBar(mh4Var, (mh4) objA, 0, null, jt1Var, 54, 12);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
