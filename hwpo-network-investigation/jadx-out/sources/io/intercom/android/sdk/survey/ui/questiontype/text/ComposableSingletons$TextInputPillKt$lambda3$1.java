package io.intercom.android.sdk.survey.ui.questiontype.text;

import defpackage.aj1;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.yi1;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$TextInputPillKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TextInputPillKt$lambda3$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$TextInputPillKt$lambda3$1 INSTANCE = new ComposableSingletons$TextInputPillKt$lambda3$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$2$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ox6 ox6VarI = eo7.i(ox6.a.t, 16.0f);
        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
        int iHashCode = Long.hashCode(jt1Var.v());
        kw7 kw7VarY = jt1Var.y();
        ox6 ox6VarC = it1.c(jt1Var, ox6VarI);
        bt1.c.getClass();
        qr5.a aVar = bt1.a.b;
        if (jt1Var.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var.q();
        if (jt1Var.l()) {
            jt1Var.k(aVar);
        } else {
            jt1Var.z();
        }
        rd7.d(jt1Var, bt1.a.f, aj1VarA);
        rd7.d(jt1Var, bt1.a.e, kw7VarY);
        rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
        rd7.c(jt1Var, bt1.a.h);
        rd7.d(jt1Var, bt1.a.d, ox6VarC);
        jt1Var.K(2123840542);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new g();
            jt1Var.C(objF);
        }
        jt1Var.B();
        TextInputPillKt.m507TextInputPillg5ZjG94("some text", null, (oh4) objF, null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)).m404getButton0d7_KjU(), 0, false, null, 0, 0, true, null, false, 0.0f, jt1Var, 390, 6, 15338);
        jt1Var.I();
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
