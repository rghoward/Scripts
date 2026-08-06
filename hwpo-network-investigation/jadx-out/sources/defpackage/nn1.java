package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nn1 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ nn1(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = qn1.a0;
                return ((ko1) obj).e;
            case 1:
                int i2 = cm2.I;
                return ((cm2.c) obj).c;
            default:
                iu1 iu1Var = (iu1) obj;
                int i3 = mp.a;
                Context context = (Context) iu1Var.o(AndroidCompositionLocals_androidKt.b);
                tx2 tx2Var = (tx2) iu1Var.o(qu1.h);
                fn7 fn7Var = (fn7) iu1Var.o(hn7.a);
                if (fn7Var == null) {
                    return null;
                }
                return new co(context, tx2Var, fn7Var.a, fn7Var.b);
        }
    }
}
