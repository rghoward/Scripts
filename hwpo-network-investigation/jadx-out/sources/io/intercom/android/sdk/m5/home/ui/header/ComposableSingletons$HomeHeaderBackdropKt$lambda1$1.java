package io.intercom.android.sdk.m5.home.ui.header;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.qq2;
import defpackage.u7d;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorUtils;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HomeHeaderBackdropKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$HomeHeaderBackdropKt$lambda1$1 INSTANCE = new ComposableSingletons$HomeHeaderBackdropKt$lambda1$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        boolean z = false;
        qq2 qq2Var = null;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid solid = new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(u7d.c(ColorUtils.parseColor("#326D7D")), z, qq2Var);
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid solid2 = new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(u7d.c(ColorUtils.parseColor("#8B0000")), z, qq2Var);
        jt1Var.K(1231018180);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new a();
            jt1Var.C(objF);
        }
        jt1Var.B();
        HomeHeaderBackdropKt.m359HomeHeaderBackdropAjpBEmI(200.0f, solid, solid2, (mh4) objF, jt1Var, 3078, 0);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
