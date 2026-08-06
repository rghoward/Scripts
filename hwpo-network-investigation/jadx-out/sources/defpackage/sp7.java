package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sp7 implements pw0 {
    public final dr7 b;
    public final pw0 c;
    public final tq5 d;

    public sp7(dr7 dr7Var, pw0 pw0Var, tq5 tq5Var) {
        this.b = dr7Var;
        this.c = pw0Var;
        this.d = tq5Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    @Override // defpackage.pw0
    public final float a(float f, float f2, float f3) {
        int iQ;
        int iQ2;
        int iQ3;
        float fA = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            Map<cza<?, ?>, Float> map = njb.a;
            if (f4 <= 1.0f) {
                z = true;
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fA);
        tq5 tq5Var = tq5.u;
        fl7 fl7Var = fl7.u;
        tq5 tq5Var2 = this.d;
        dr7 dr7Var = this.b;
        if (fAbs != 0.0f && z) {
            if (tq5Var2 == tq5Var && dr7Var.n().c() == fl7Var) {
                iQ3 = dr7Var.q() + (-dr7Var.f);
            } else {
                iQ3 = dr7Var.f;
            }
            float fQ = iQ3 * (-1.0f);
            while (fA > 0.0f && fQ < fA) {
                fQ += dr7Var.q();
            }
            while (fA < 0.0f && fQ > fA) {
                fQ -= dr7Var.q();
            }
            return fQ;
        }
        if (Math.abs(dr7Var.f) < 1.0E-6d) {
            return 0.0f;
        }
        if (tq5Var2 == tq5Var && dr7Var.n().c() == fl7Var) {
            iQ = dr7Var.q() + (-dr7Var.f);
        } else {
            iQ = dr7Var.f;
        }
        float f5 = iQ * (-1.0f);
        if (tq5Var2 == tq5Var && dr7Var.n().c() == fl7Var) {
            if (!dr7Var.m()) {
                iQ2 = dr7Var.q();
                f5 += iQ2;
            }
        } else if (dr7Var.m()) {
            iQ2 = dr7Var.q();
            f5 += iQ2;
        }
        return uh8.f(f5, -f3, f3);
    }
}
