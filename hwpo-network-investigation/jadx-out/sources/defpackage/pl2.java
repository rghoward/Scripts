package defpackage;

import androidx.recyclerview.widget.a0;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pl2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ pl2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ql2.a aVar = ql2.Companion;
                cm2 cm2VarQ = ((ql2) obj).q();
                oy0.d(rhb.b(cm2VarQ), null, null, new nm2(cm2VarQ, null), 3);
                return g2b.a;
            case 1:
                return new v06((oh4) ((h37) obj).getValue());
            default:
                g7a g7aVar = (g7a) ((rbb) obj).F.getValue();
                g7aVar.getClass();
                return new a0(g7aVar);
        }
    }
}
