package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gy5 extends rv5<dy5> implements bz5 {
    public final j27<dy5> a = new j27<>();

    public gy5(oh4<? super bz5, g2b> oh4Var) {
        oh4Var.invoke(this);
    }

    @Override // defpackage.bz5
    public final void a(int i, oh4 oh4Var, oh4 oh4Var2, fr1 fr1Var) {
        this.a.a(i, new dy5(oh4Var, oh4Var2, fr1Var));
    }

    @Override // defpackage.bz5
    public final void c(Object obj, final ei4 ei4Var) {
        this.a.a(1, new dy5(obj != null ? new yt0(3, obj) : null, new ey5(0), new fr1(true, -857469575, new fi4() { // from class: fy5
            @Override // defpackage.fi4
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                fv5 fv5Var = (fv5) obj2;
                ((Integer) obj3).getClass();
                jt1 jt1Var = (jt1) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= jt1Var.J(fv5Var) ? 4 : 2;
                }
                if (jt1Var.A(iIntValue & 1, (iIntValue & 131) != 130)) {
                    ei4Var.invoke(fv5Var, jt1Var, Integer.valueOf(iIntValue & 14));
                } else {
                    jt1Var.u();
                }
                return g2b.a;
            }
        })));
    }

    @Override // defpackage.rv5
    public final j27 g() {
        return this.a;
    }
}
