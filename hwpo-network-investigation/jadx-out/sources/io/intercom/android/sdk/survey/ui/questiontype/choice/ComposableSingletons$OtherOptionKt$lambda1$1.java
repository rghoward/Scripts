package io.intercom.android.sdk.survey.ui.questiontype.choice;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.ux1;
import defpackage.xr1;
import io.intercom.android.sdk.survey.SurveyUiColors;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$OtherOptionKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$OtherOptionKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$OtherOptionKt$lambda1$1 INSTANCE = new ComposableSingletons$OtherOptionKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$3$lambda$2(String str) {
        str.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        SurveyUiColors surveyUiColorsA = ux1.a(null, null, 3, null);
        jt1Var.K(-1133347294);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new a();
            jt1Var.C(objF);
        }
        mh4 mh4Var = (mh4) objF;
        Object objA = xr1.a(jt1Var, -1133346270);
        if (objA == c0187a) {
            objA = new b();
            jt1Var.C(objA);
        }
        jt1Var.B();
        OtherOptionKt.m473OtherOptionYCJL08c(true, surveyUiColorsA, "none", mh4Var, (oh4) objA, 0L, 0.0f, 0L, null, 0L, jt1Var, 28038, 992);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
