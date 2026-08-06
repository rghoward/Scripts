package io.intercom.android.sdk.ui.component;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.uh1;
import defpackage.ws0;
import io.intercom.android.sdk.ui.R;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$IntercomButtonKt$lambda3$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$IntercomButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$IntercomButtonKt$lambda3$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        int i2 = R.drawable.intercom_send;
        IntercomButton.Style styleM569outlinedStyleKlgxPg = IntercomButton.INSTANCE.m569outlinedStyleKlgxPg(uh1.e, uh1.b, ws0.b(1.0f, uh1.c), jt1Var, 3510, 0);
        Integer numValueOf = Integer.valueOf(i2);
        jt1Var.K(79915108);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new c();
            jt1Var.C(objF);
        }
        jt1Var.B();
        IntercomButtonKt.IntercomButton(null, styleM569outlinedStyleKlgxPg, "Button", numValueOf, (mh4) objF, jt1Var, 24960, 1);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
