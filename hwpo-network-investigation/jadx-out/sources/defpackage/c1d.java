package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1d implements yh4 {
    public static final /* synthetic */ c1d t = new c1d();

    @Override // defpackage.yh4
    public final Object apply(Object obj) {
        htc htcVar = (htc) obj;
        h1d h1dVarD = i1d.D();
        if (htcVar == null) {
            return (i1d) h1dVarD.j();
        }
        for (ktc ktcVar : htcVar.B()) {
            j1d j1dVarD = k1d.D();
            String strX = ktcVar.x();
            j1dVarD.h();
            ((k1d) j1dVarD.u).E(strX);
            int iL = ktcVar.L();
            int i = iL - 1;
            if (iL == 0) {
                throw null;
            }
            if (i == 0) {
                long jY = ktcVar.y();
                j1dVarD.h();
                ((k1d) j1dVarD.u).F(jY);
            } else if (i == 1) {
                boolean z = ktcVar.z();
                j1dVarD.h();
                ((k1d) j1dVarD.u).G(z);
            } else if (i == 2) {
                double dA = ktcVar.A();
                j1dVarD.h();
                ((k1d) j1dVarD.u).H(dA);
            } else if (i == 3) {
                String strB = ktcVar.B();
                j1dVarD.h();
                ((k1d) j1dVarD.u).I(strB);
            } else {
                if (i != 4) {
                    aa0.c("No known flag type");
                    return null;
                }
                p0c p0cVarC = ktcVar.C();
                j1dVarD.h();
                ((k1d) j1dVarD.u).J(p0cVarC);
            }
            k1d k1dVar = (k1d) j1dVarD.j();
            h1dVarD.h();
            ((i1d) h1dVarD.u).J(k1dVar);
        }
        String strA = htcVar.A();
        h1dVarD.h();
        ((i1d) h1dVarD.u).H(strA);
        String strX2 = htcVar.x();
        h1dVarD.h();
        ((i1d) h1dVarD.u).F(strX2);
        long jC = htcVar.C();
        h1dVarD.h();
        ((i1d) h1dVarD.u).I(jC);
        if (htcVar.y()) {
            p0c p0cVarZ = htcVar.z();
            h1dVarD.h();
            ((i1d) h1dVarD.u).G(p0cVarZ);
        }
        return (i1d) h1dVarD.j();
    }
}
