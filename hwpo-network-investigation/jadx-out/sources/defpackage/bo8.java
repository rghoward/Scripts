package defpackage;

import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bo8 implements do8 {
    public final rr3 a;

    public bo8(rr3 rr3Var) {
        rr3Var.getClass();
        this.a = rr3Var;
    }

    @Override // defpackage.do8
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.do8
    public final void b(final long j, final String str) {
        str.getClass();
        rf4 rf4Var = new rf4("javaClass", new mb2() { // from class: yn8
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                pka.Companion.getClass();
                return pka.a.a(j, str);
            }
        }, true);
        rr3 rr3Var = this.a;
        rr3Var.getClass();
        rr3Var.a(new tn8(rf4Var));
    }

    @Override // defpackage.do8
    public final void c(final long j, final String str) {
        str.getClass();
        rf4 rf4Var = new rf4("javaClass", new mb2() { // from class: zn8
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                pka.Companion.getClass();
                return pka.a.a(j, str);
            }
        }, true);
        rr3 rr3Var = this.a;
        rr3Var.getClass();
        rr3Var.a(new vn8(rf4Var));
    }

    @Override // defpackage.do8
    public final void d(final long j, final int i, final Integer num) {
        this.a.c(new rf4("javaClass", new mb2() { // from class: ao8
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                pl7.Companion.getClass();
                pl7 pl7Var = new pl7();
                pl7Var.setArguments(uy0.c(new js7("com.hwpo_training_app.report.presentation.other_reason.OtherReasonFragment.COMMENT_ID_EXTRA", Long.valueOf(j)), new js7("com.hwpo_training_app.report.presentation.other_reason.OtherReasonFragment.SCORE_ID_EXTRA", Integer.valueOf(i)), new js7("com.hwpo_training_app.report.presentation.other_reason.OtherReasonFragment.SCORE_VALUE_ID_EXTRA", num)));
                return pl7Var;
            }
        }, true));
    }
}
