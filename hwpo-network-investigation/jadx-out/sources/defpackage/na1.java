package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class na1 extends i98<Character, char[], la1> {
    public static final na1 c = new na1(ra1.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        la1 la1Var = (la1) obj;
        la1Var.getClass();
        char cI = rt1Var.I(this.b, i);
        la1Var.b(la1Var.d() + 1);
        char[] cArr = la1Var.a;
        int i2 = la1Var.b;
        la1Var.b = i2 + 1;
        cArr[i2] = cI;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        la1 la1Var = new la1();
        la1Var.a = cArr;
        la1Var.b = cArr.length;
        la1Var.b(10);
        return la1Var;
    }

    @Override // defpackage.i98
    public final char[] j() {
        return new char[0];
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, char[] cArr, int i) {
        char[] cArr2 = cArr;
        st1Var.getClass();
        cArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.t(this.b, i2, cArr2[i2]);
        }
    }
}
