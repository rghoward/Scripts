package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z3a implements ei4<b4a, jt1, Integer, g2b> {
    public final /* synthetic */ fi4<b4a, f50.a.c, jt1, Integer, g2b> t;
    public final /* synthetic */ fi4<b4a, f50.a.b, jt1, Integer, g2b> u;

    public z3a(fi4 fi4Var, fi4 fi4Var2) {
        this.t = fi4Var;
        this.u = fi4Var2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ei4
    public final g2b invoke(b4a b4aVar, jt1 jt1Var, Integer num) {
        b4a b4aVar2 = b4aVar;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= jt1Var2.J(b4aVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && jt1Var2.r()) {
            jt1Var2.u();
        } else {
            f50.a aVar = (f50.a) b4aVar2.h().K.getValue();
            boolean z = false;
            boolean z2 = true;
            if (aVar instanceof f50.a.c) {
                jt1Var2.e(1739512213);
                fi4<b4a, f50.a.c, jt1, Integer, g2b> fi4Var = this.t;
                if (fi4Var != null) {
                    fi4Var.invoke(b4aVar2, (f50.a.c) aVar, jt1Var2, Integer.valueOf((iIntValue & 14) | 64));
                    g2b g2bVar = g2b.a;
                } else {
                    z = true;
                }
                jt1Var2.H();
            } else {
                if (aVar instanceof f50.a.d) {
                    jt1Var2.e(1739605461);
                    jt1Var2.H();
                } else if (aVar instanceof f50.a.b) {
                    jt1Var2.e(1739696601);
                    fi4<b4a, f50.a.b, jt1, Integer, g2b> fi4Var2 = this.u;
                    if (fi4Var2 != null) {
                        fi4Var2.invoke(b4aVar2, (f50.a.b) aVar, jt1Var2, Integer.valueOf((iIntValue & 14) | 64));
                        g2b g2bVar2 = g2b.a;
                    } else {
                        z = true;
                    }
                    jt1Var2.H();
                } else {
                    if (!(aVar instanceof f50.a.C0085a)) {
                        jt1Var2.e(-82435959);
                        jt1Var2.H();
                        u.b();
                        return null;
                    }
                    jt1Var2.e(1739782316);
                    jt1Var2.H();
                }
                if (z2) {
                    a4a.c(b4aVar2, null, null, null, null, null, 0.0f, null, false, jt1Var2, iIntValue & 14);
                }
            }
            z2 = z;
            if (z2) {
                a4a.c(b4aVar2, null, null, null, null, null, 0.0f, null, false, jt1Var2, iIntValue & 14);
            }
        }
        return g2b.a;
    }
}
