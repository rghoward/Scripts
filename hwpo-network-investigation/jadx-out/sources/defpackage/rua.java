package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rua extends ec7 {
    public final zx0 f;
    public dz9 g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }

        public final a a(a aVar) {
            return new a(vf7.e(this.a, aVar.a), Math.max(this.b, aVar.b), this.c || aVar.c);
        }
    }

    public rua(z79 z79Var, m79 m79Var, tx2 tx2Var) {
        super(z79Var, m79Var, tx2Var);
        this.f = da1.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
    
        if (r0.invoke(r3, r4) == r9) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, rua$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.rua r18, defpackage.z79 r19, rua.a r20, defpackage.u02 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rua.c(rua, z79, rua$a, u02):java.lang.Object");
    }

    public static a e(zx0 zx0Var) {
        a aVar = null;
        zc9 zc9VarB = xs.b(new gc7(new up1(5, zx0Var), null));
        while (zc9VarB.hasNext()) {
            a aVarA = (a) zc9VarB.next();
            if (aVar != null) {
                aVarA = aVar.a(aVarA);
            }
            aVar = aVarA;
        }
        return aVar;
    }

    public final boolean d(r48 r48Var) {
        boolean z;
        boolean z2;
        boolean z3;
        zx0 zx0Var;
        z79 z79Var;
        a58 a58Var = (a58) th1.A(r48Var.a);
        if (a58Var != null) {
            List list = a58Var.m;
            if (list == null) {
                list = hf3.t;
            }
            int size = list.size();
            int i = 0;
            z3 = false;
            while (true) {
                zx0Var = this.f;
                z79Var = this.a;
                if (i >= size) {
                    break;
                }
                ty4 ty4Var = (ty4) list.get(i);
                long j = ty4Var.d ^ (-9223372034707292160L);
                if (!(z79Var.i(z79Var.e(j)) == 0.0f)) {
                    z3 = !(zx0Var.n(new a(j, ty4Var.a, false)) instanceof ga1.b) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = a58Var.l ^ (-9223372034707292160L);
            boolean z4 = r48Var.f == 12;
            if (!(z79Var.i(z79Var.e(j2)) == 0.0f) || z4) {
                if (!(zx0Var.n(new a(j2, a58Var.b, z4)) instanceof ga1.b) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
