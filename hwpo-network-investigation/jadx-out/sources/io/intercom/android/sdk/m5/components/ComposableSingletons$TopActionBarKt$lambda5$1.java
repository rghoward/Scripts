package io.intercom.android.sdk.m5.components;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-5$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TopActionBarKt$lambda5$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$TopActionBarKt$lambda5$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda5$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(149719268);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new w();
            jt1Var.C(objF);
        }
        jt1Var.B();
        TopActionBarKt.m90TopActionBarNpQZenA(null, "Hannah", null, null, null, (mh4) objF, null, false, 0L, 0L, 0L, null, null, jt1Var, 196656, 0, 8157);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
