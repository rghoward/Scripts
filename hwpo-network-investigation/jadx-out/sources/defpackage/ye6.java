package defpackage;

import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ye6 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ye6(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return LongTextQuestionKt.LongTextQuestion$lambda$5$lambda$4$lambda$3$lambda$2((oh4) obj2, (String) obj);
            case 1:
                mj7 mj7Var = (mj7) obj2;
                gm3 gm3Var = (gm3) obj;
                mj7.a aVar = mj7.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof jj7.a) {
                    mj7Var.m(null);
                    throw null;
                }
                if (gm3Var instanceof jj7.b) {
                    mj7Var.n(((jj7.b) gm3Var).b);
                } else if (gm3Var instanceof jj7.c) {
                    int i2 = ((jj7.c) gm3Var).b;
                    er8.Companion.getClass();
                    er8 er8Var = new er8();
                    er8Var.setArguments(uy0.c(new js7("arg_title", Integer.valueOf(i2))));
                    hk0.l(mj7Var, er8Var);
                }
                return g2b.a;
            default:
                x69 x69Var = (x69) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                bt7 bt7Var = x69Var.a;
                float fK = bt7Var.k() + fFloatValue + x69Var.f;
                float f = uh8.f(fK, 0.0f, x69Var.e.k());
                boolean z = fK == f;
                float fK2 = f - bt7Var.k();
                int iRound = Math.round(fK2);
                bt7Var.j(bt7Var.k() + iRound);
                x69Var.f = fK2 - iRound;
                if (!z) {
                    fFloatValue = fK2;
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
