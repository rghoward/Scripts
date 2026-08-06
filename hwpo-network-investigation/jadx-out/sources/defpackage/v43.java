package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v43 implements ca9 {
    @Override // defpackage.ca9
    public ba9 a(rq9 rq9Var) {
        ba9.a aVarB;
        ba9.a aVarB2;
        boolean z;
        ba9 ba9Var = rq9Var.b;
        if (ba9Var == null) {
            return fa9.a(rq9Var, ca9.a.b.a);
        }
        ba9.a aVar = ba9Var.b;
        ba9.a aVar2 = ba9Var.a;
        boolean z2 = rq9Var.a;
        u99 u99Var = rq9Var.c;
        if (z2) {
            aVarB2 = fa9.b(rq9Var, u99Var, aVar2);
            aVarB = aVar;
            aVar = aVar2;
            aVar2 = aVarB2;
        } else {
            aVarB = fa9.b(rq9Var, u99Var, aVar);
            aVarB2 = aVarB;
        }
        if (xj5.a(aVarB2, aVar)) {
            return ba9Var;
        }
        boolean z3 = false;
        ba9 ba9Var2 = new ba9(aVar2, aVarB, rq9Var.a() == pb2.t || (rq9Var.a() == pb2.v && aVar2.b > aVarB.b));
        ba9 ba9Var3 = rq9Var.b;
        u99 u99Var2 = rq9Var.c;
        boolean z4 = rq9Var.a;
        ba9.a aVar3 = ba9Var2.a;
        long j = aVar3.c;
        ba9.a aVar4 = ba9Var2.b;
        if (j == aVar4.c) {
            z = aVar3.b == aVar4.b;
        } else {
            boolean z5 = ba9Var2.c;
            if ((z5 ? aVar3 : aVar4).b == 0) {
                if (u99Var2.d.a.a.u.length() == (z5 ? aVar4 : aVar3).b) {
                    new cl8().t = true;
                }
            }
        }
        if (!z) {
            return ba9Var2;
        }
        String str = u99Var2.d.a.a.u;
        if (ba9Var3 == null || str.length() == 0) {
            return ba9Var2;
        }
        String str2 = u99Var2.d.a.a.u;
        int i = u99Var2.a;
        int length = str2.length();
        if (i == 0) {
            int iC = rh0.c(0, str2);
            return z4 ? ba9.a(ba9Var2, fa9.d(aVar3, u99Var2, iC), null, true, 2) : ba9.a(ba9Var2, null, fa9.d(aVar4, u99Var2, iC), false, 1);
        }
        if (i == length) {
            int iD = rh0.d(length, str2);
            return z4 ? ba9.a(ba9Var2, fa9.d(aVar3, u99Var2, iD), null, false, 2) : ba9.a(ba9Var2, null, fa9.d(aVar4, u99Var2, iD), true, 1);
        }
        if (ba9Var3 != null && ba9Var3.c) {
            z3 = true;
        }
        int iD2 = z4 ^ z3 ? rh0.d(i, str2) : rh0.c(i, str2);
        return z4 ? ba9.a(ba9Var2, fa9.d(aVar3, u99Var2, iD2), null, z3, 2) : ba9.a(ba9Var2, null, fa9.d(aVar4, u99Var2, iD2), z3, 1);
    }
}
