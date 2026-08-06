package defpackage;

import android.content.Context;
import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql3 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ ql3(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                rl3 rl3Var = (rl3) obj2;
                String str = (String) obj;
                ml3 ml3Var = rl3Var.b;
                if (ml3Var == null) {
                    Enum[] enumArr = rl3Var.a;
                    ml3Var = new ml3(str, enumArr.length);
                    for (Enum r0 : enumArr) {
                        ml3Var.k(r0.name(), false);
                    }
                }
                return ml3Var;
            default:
                zba.a((Context) obj2, (TextClassification) obj);
                return g2b.a;
        }
    }
}
