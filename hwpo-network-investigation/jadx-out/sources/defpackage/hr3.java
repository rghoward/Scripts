package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hr3 extends yq3 {
    public final /* synthetic */ p94 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ h37<Boolean> c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ xv9 g;
    public final /* synthetic */ h37<tq3> h;
    public final /* synthetic */ oh4<Boolean, g2b> i;
    public final /* synthetic */ g27 j;
    public final /* synthetic */ g27 k;

    /* JADX WARN: Multi-variable type inference failed */
    public hr3(p94 p94Var, boolean z, h37<Boolean> h37Var, String str, String str2, String str3, xv9 xv9Var, h37<tq3> h37Var2, oh4<? super Boolean, g2b> oh4Var, g27 g27Var, g27 g27Var2) {
        this.a = p94Var;
        this.b = z;
        this.c = h37Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = xv9Var;
        this.h = h37Var2;
        this.i = oh4Var;
        this.j = g27Var;
        this.k = g27Var2;
    }

    @Override // defpackage.xq3
    public final ox6 b(ox6 ox6Var, final boolean z) {
        final g27 g27Var = this.j;
        final g27 g27Var2 = this.k;
        return kr5.a(ox6Var, new ei4() { // from class: er3
            @Override // defpackage.ei4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                hl6 hl6Var = (hl6) obj;
                cl6 cl6Var = (cl6) obj2;
                xx1 xx1Var = (xx1) obj3;
                int iG = zx1.g(g27Var.k(), xx1Var.a);
                long j = xx1Var.a;
                int iF = zx1.f(g27Var2.k(), j);
                boolean z2 = z;
                int iJ = z2 ? iG : xx1.j(j);
                if (!z2) {
                    iG = xx1.h(j);
                }
                jz7 jz7VarE = cl6Var.E(xx1.a(iJ, iG, 0, iF, 4, xx1Var.a));
                return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new gr3(0, jz7VarE));
            }
        });
    }

    @Override // defpackage.xq3
    public final boolean c() {
        return this.c.getValue().booleanValue();
    }

    @Override // defpackage.xq3
    public final String d() {
        this.h.getValue().getClass();
        return "PrimaryNotEditable";
    }

    @Override // defpackage.xq3
    public final ox6 e(ox6 ox6Var) {
        ox6 ox6VarB = ym2.b(ox6Var, this.a);
        h37<tq3> h37Var = this.h;
        ox6 ox6VarH = ox6VarB.H(new rq3(new gb3(1, h37Var)));
        oh4<Boolean, g2b> oh4Var = this.i;
        boolean z = this.b;
        fr3 fr3Var = new fr3(h37Var, oh4Var, z);
        return ox6VarH.H(pb9.b(ro5.a(t6a.b(ox6.a.t, fr3Var, new ir3(fr3Var)), new jr3(fr3Var, z, this.c)), false, new mh0(z, this.d, this.e, this.f, fr3Var, this.g)));
    }
}
