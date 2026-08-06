package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class om2 implements thb.c {
    public final tpb a;
    public final wk4 b;
    public final uc9 c;
    public final td8 d;
    public final pf9 e;
    public final de9 f;
    public final n89 g;
    public final p43 h;
    public final bu8 i;
    public long j;
    public hy8 k;

    public om2(tpb tpbVar, wk4 wk4Var, uc9 uc9Var, td8 td8Var, pf9 pf9Var, de9 de9Var, n89 n89Var, p43 p43Var, bu8 bu8Var) {
        tpbVar.getClass();
        td8Var.getClass();
        pf9Var.getClass();
        de9Var.getClass();
        p43Var.getClass();
        bu8Var.getClass();
        this.a = tpbVar;
        this.b = wk4Var;
        this.c = uc9Var;
        this.d = td8Var;
        this.e = pf9Var;
        this.f = de9Var;
        this.g = n89Var;
        this.h = p43Var;
        this.i = bu8Var;
        this.j = -1L;
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls) {
        cls.getClass();
        hy8 hy8Var = this.k;
        if (hy8Var == null) {
            z90.a("Required value was null.");
            return null;
        }
        return new cm2(this.a.a(hy8Var), this.j, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
