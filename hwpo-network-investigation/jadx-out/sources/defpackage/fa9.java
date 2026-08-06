package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fa9 {
    public static final ba9 a(rq9 rq9Var, pu0 pu0Var) {
        u99 u99Var = rq9Var.c;
        boolean z = rq9Var.a() == pb2.t;
        return new ba9(c(u99Var, z, true, 1, pu0Var), c(u99Var, z, false, 1, pu0Var), z);
    }

    public static final ba9.a b(final rq9 rq9Var, final u99 u99Var, ba9.a aVar) {
        pb2 pb2Var;
        boolean z = rq9Var.a;
        final int i = z ? u99Var.a : u99Var.b;
        u99Var.getClass();
        int i2 = u99Var.a;
        int i3 = u99Var.b;
        ria riaVar = u99Var.d;
        int i4 = u99Var.c;
        mh4 mh4Var = new mh4() { // from class: da9
            @Override // defpackage.mh4
            public final Object invoke() {
                return Integer.valueOf(u99Var.d.b.d(i));
            }
        };
        j26 j26Var = j26.u;
        final ss5 ss5VarC = hv5.c(j26Var, mh4Var);
        final int i5 = z ? i3 : i2;
        ss5 ss5VarC2 = hv5.c(j26Var, new mh4() { // from class: ea9
            @Override // defpackage.mh4
            public final Object invoke() {
                int iIntValue = ((Number) ss5VarC.getValue()).intValue();
                rq9 rq9Var2 = rq9Var;
                boolean z2 = rq9Var2.a;
                boolean z3 = rq9Var2.a() == pb2.t;
                u99 u99Var2 = u99Var;
                ria riaVar2 = u99Var2.d;
                int i6 = i;
                long j = riaVar2.j(i6);
                ria riaVar3 = u99Var2.d;
                l07 l07Var = riaVar3.b;
                int i7 = lja.c;
                int iG = (int) (j >> 32);
                int iD = l07Var.d(iG);
                int i8 = l07Var.f;
                if (iD != iIntValue) {
                    iG = iIntValue >= i8 ? riaVar3.g(i8 - 1) : riaVar3.g(iIntValue);
                }
                int iC = (int) (j & 4294967295L);
                if (l07Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i8 ? l07Var.c(i8 - 1, false) : l07Var.c(iIntValue, false);
                }
                int i9 = i5;
                if (iG == i9) {
                    return u99Var2.a(iC);
                }
                if (iC == i9) {
                    return u99Var2.a(iG);
                }
                if (!(z2 ^ z3) ? i6 >= iG : i6 > iC) {
                    iG = iC;
                }
                return u99Var2.a(iG);
            }
        });
        if (1 != aVar.c) {
            return (ba9.a) ss5VarC2.getValue();
        }
        if (i == i4) {
            return aVar;
        }
        if (((Number) ss5VarC.getValue()).intValue() != riaVar.b.d(i4)) {
            return (ba9.a) ss5VarC2.getValue();
        }
        int i6 = aVar.b;
        long j = riaVar.j(i6);
        if (i4 != -1) {
            if (i != i4) {
                pb2 pb2Var2 = pb2.t;
                if (i2 < i3) {
                    pb2Var = pb2.u;
                } else {
                    pb2Var = i2 > i3 ? pb2Var2 : pb2.v;
                }
                if (!((pb2Var == pb2Var2) ^ z)) {
                }
            }
            return u99Var.a(i);
        }
        int i7 = lja.c;
        return (i6 == ((int) (j >> 32)) || i6 == ((int) (4294967295L & j))) ? (ba9.a) ss5VarC2.getValue() : u99Var.a(i);
    }

    public static final ba9.a c(u99 u99Var, boolean z, boolean z2, int i, pu0 pu0Var) {
        long j;
        int i2 = z2 ? u99Var.a : u99Var.b;
        u99Var.getClass();
        if (i != 1) {
            return u99Var.a(i2);
        }
        long jA = pu0Var.a(u99Var, i2);
        if (z ^ z2) {
            int i3 = lja.c;
            j = jA >> 32;
        } else {
            int i4 = lja.c;
            j = 4294967295L & jA;
        }
        return u99Var.a((int) j);
    }

    public static final ba9.a d(ba9.a aVar, u99 u99Var, int i) {
        return new ba9.a(u99Var.d.a(i), i, aVar.c);
    }
}
