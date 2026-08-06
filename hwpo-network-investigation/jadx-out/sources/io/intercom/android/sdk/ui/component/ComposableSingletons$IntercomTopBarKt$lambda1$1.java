package io.intercom.android.sdk.ui.component;

import defpackage.ci4;
import defpackage.di;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import io.intercom.android.sdk.ui.R;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$IntercomTopBarKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$IntercomTopBarKt$lambda1$1 INSTANCE = new ComposableSingletons$IntercomTopBarKt$lambda1$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        int i2 = R.drawable.intercom_ic_back;
        jt1Var.K(-62762186);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new d();
            jt1Var.C(objF);
        }
        jt1Var.B();
        IntercomTopBarKt.m589IntercomTopBarbogVsAg(null, "TopBar Title", new IntercomTopBarIcon(i2, null, (mh4) objF), di.a.n, 0L, 0L, null, null, jt1Var, 3120, 241);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
