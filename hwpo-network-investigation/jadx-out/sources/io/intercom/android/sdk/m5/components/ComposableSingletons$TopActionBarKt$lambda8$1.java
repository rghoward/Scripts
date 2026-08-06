package io.intercom.android.sdk.m5.components;

import defpackage.ei4;
import defpackage.g2b;
import defpackage.h65;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.oy8;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-8$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TopActionBarKt$lambda8$1 implements ei4<oy8, jt1, Integer, g2b> {
    public static final ComposableSingletons$TopActionBarKt$lambda8$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda8$1();

    public final void invoke(oy8 oy8Var, jt1 jt1Var, int i) {
        oy8Var.getClass();
        if ((i & 17) == 16 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(377417767);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new x();
            jt1Var.C(objF);
        }
        jt1Var.B();
        h65.b(1572870, 62, jt1Var, (mh4) objF, ComposableSingletons$TopActionBarKt.INSTANCE.m85getLambda7$intercom_sdk_base_release(), null, null, null, false);
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
        invoke(oy8Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
