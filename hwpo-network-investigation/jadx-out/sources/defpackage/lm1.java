package defpackage;

import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lm1 extends pi4 implements mh4<g2b> {
    @Override // defpackage.mh4
    public final g2b invoke() {
        final qn1 qn1Var = (qn1) this.receiver;
        Long l = qn1Var.S;
        if (l != null) {
            final long jLongValue = l.longValue();
            qn1Var.x.c(new rf4(to8.class.getName(), new mb2() { // from class: pn1
                @Override // defpackage.mb2
                public final Object c(i iVar) {
                    int i = qn1.a0;
                    iVar.getClass();
                    to8.a aVar = to8.Companion;
                    qn1 qn1Var2 = qn1Var;
                    int iA = qn1Var2.R.a();
                    am1.b bVar = qn1Var2.R;
                    am1.b.a aVar2 = bVar instanceof am1.b.a ? (am1.b.a) bVar : null;
                    Integer numValueOf = aVar2 != null ? Integer.valueOf(aVar2.u) : null;
                    aVar.getClass();
                    to8 to8Var = new to8();
                    to8Var.setArguments(uy0.c(new js7("com.hwpo_training_app.report.presentation.reasons.ReportReasonsFragment.COMMENT_ID_EXTRA", Long.valueOf(jLongValue)), new js7("com.hwpo_training_app.report.presentation.reasons.ReportReasonsFragment.SCORE_ID_EXTRA", Integer.valueOf(iA)), new js7("com.hwpo_training_app.report.presentation.reasons.ReportReasonsFragment.SCORE_VALUE_ID_EXTRA", numValueOf)));
                    return to8Var;
                }
            }, true));
        }
        return g2b.a;
    }
}
