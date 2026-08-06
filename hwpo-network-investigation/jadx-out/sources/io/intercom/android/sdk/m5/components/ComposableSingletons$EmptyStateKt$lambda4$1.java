package io.intercom.android.sdk.m5.components;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import io.intercom.android.sdk.ui.R;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$EmptyStateKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$EmptyStateKt$lambda4$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$EmptyStateKt$lambda4$1 INSTANCE = new ComposableSingletons$EmptyStateKt$lambda4$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        Integer numValueOf = Integer.valueOf(R.drawable.intercom_send);
        jt1Var.K(1386990567);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new k();
            jt1Var.C(objF);
        }
        jt1Var.B();
        IntercomPrimaryButtonKt.IntercomPrimaryButton("Send us a message", null, numValueOf, (mh4) objF, jt1Var, 3078, 2);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
