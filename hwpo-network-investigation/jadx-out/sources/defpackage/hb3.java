package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hb3 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ hb3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() throws IOException {
        int iK;
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                rb3.a aVar = rb3.Companion;
                ((kx3) ((rb3) obj).E.getValue()).c();
                return g2b.a;
            default:
                dr7 dr7Var = (dr7) obj;
                boolean zA = dr7Var.k.a();
                bt7 bt7Var = dr7Var.q;
                if (!zA) {
                    iK = dr7Var.k();
                } else if (bt7Var.k() != -1) {
                    iK = bt7Var.k();
                } else {
                    float fAbs = Math.abs(dr7Var.l());
                    tx2 tx2Var = dr7Var.n;
                    hr7.b bVar = hr7.a;
                    if (fAbs >= Math.abs(Math.min(tx2Var.U0(56.0f), dr7Var.p() / 2.0f) / dr7Var.p())) {
                        boolean zM = dr7Var.m();
                        int i2 = dr7Var.e;
                        iK = zM ? i2 + 1 : i2;
                    } else {
                        iK = dr7Var.k();
                    }
                }
                return Integer.valueOf(dr7Var.j(iK));
        }
    }
}
