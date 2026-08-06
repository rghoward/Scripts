package io.intercom.android.sdk.m5.home.ui.header;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.ph1;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.ws0;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HomeHeaderBackdropKt$lambda4$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$HomeHeaderBackdropKt$lambda4$1 INSTANCE = new ComposableSingletons$HomeHeaderBackdropKt$lambda4$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        List listI = ws0.i("#142C4D", "#0057FF", "#CAF4F7");
        ArrayList arrayList = new ArrayList(ph1.n(listI, 10));
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(new uh1(u7d.c(ColorUtils.parseColor((String) it.next()))));
        }
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient gradient = new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(arrayList, true);
        List listI2 = ws0.i("#8B0000", "#4B0000", "#2B0000");
        ArrayList arrayList2 = new ArrayList(ph1.n(listI2, 10));
        Iterator it2 = listI2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new uh1(u7d.c(ColorUtils.parseColor((String) it2.next()))));
        }
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient gradient2 = new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(arrayList2, true);
        jt1Var.K(1458782087);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new d();
            jt1Var.C(objF);
        }
        jt1Var.B();
        HomeHeaderBackdropKt.m359HomeHeaderBackdropAjpBEmI(200.0f, gradient, gradient2, (mh4) objF, jt1Var, 3078, 0);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
