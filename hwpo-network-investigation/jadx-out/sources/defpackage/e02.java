package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e02 {
    public final fv9<ei4<b02, jt1, Integer, g2b>> a = new fv9<>();

    public static void b(final e02 e02Var, final ci4 ci4Var, final fr1 fr1Var, final mh4 mh4Var, int i) {
        if ((i & 8) != 0) {
            fr1Var = null;
        }
        e02Var.a.add(new fr1(true, -1789283891, new ei4() { // from class: d02
            @Override // defpackage.ei4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                b02 b02Var = (b02) obj;
                jt1 jt1Var = (jt1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= jt1Var.J(b02Var) ? 4 : 2;
                }
                if (jt1Var.A(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = (String) ci4Var.invoke(jt1Var, 0);
                    if (z2a.w(str)) {
                        xc5.c("Label must not be blank");
                    }
                    e02Var.getClass();
                    qr1.a.a(str, Boolean.TRUE, b02Var, fr1Var, mh4Var, jt1Var, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    jt1Var.u();
                }
                return g2b.a;
            }
        }));
    }

    public final void a(final b02 b02Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-798501095);
        int i2 = (bj4VarO.J(b02Var) ? 4 : 2) | i | (bj4VarO.J(this) ? 32 : 16);
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            fv9<ei4<b02, jt1, Integer, g2b>> fv9Var = this.a;
            int size = fv9Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                fv9Var.get(i3).invoke(b02Var, bj4VarO, Integer.valueOf(i2 & 14));
            }
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(b02Var, i) { // from class: c02
                public final /* synthetic */ b02 u;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    this.t.a(this.u, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
