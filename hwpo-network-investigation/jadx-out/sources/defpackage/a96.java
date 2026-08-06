package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a96 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ a96(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                jz7.a aVar = (jz7.a) obj;
                ArrayList arrayListD = um0.d(((b96) obj2).a, (List) obj3);
                if (arrayListD != null) {
                    int size = arrayListD.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        js7 js7Var = (js7) arrayListD.get(i2);
                        jz7 jz7Var = (jz7) js7Var.t;
                        mh4 mh4Var = (mh4) js7Var.u;
                        jz7.a.q(aVar, jz7Var, mh4Var != null ? ((bg5) mh4Var.invoke()).a : 0L);
                    }
                }
                break;
            default:
                bg7 bg7Var = (bg7) obj3;
                jz7 jz7Var2 = (jz7) obj2;
                jz7.a aVar2 = (jz7.a) obj;
                boolean z = bg7Var.J;
                float f = bg7Var.H;
                if (z) {
                    jz7.a.t(aVar2, jz7Var2, aVar2.n1(f), aVar2.n1(bg7Var.I));
                } else {
                    aVar2.l(jz7Var2, aVar2.n1(f), aVar2.n1(bg7Var.I), 0.0f);
                }
                break;
        }
        return g2b.a;
    }
}
