package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mg9 implements thb.c {
    public final nf9 a;
    public final ih9 b;
    public final pf9 c;
    public final dh9 d;
    public final de9 e;
    public final hl4 f;
    public final fp1 g;
    public final af7 h;
    public final mz9 i;
    public final r31 j;
    public final t1b k;
    public final mf7 l;
    public final r60 m;
    public final k55 n;
    public final n89 o;
    public final p43 p;
    public final uc8 q;
    public final ad8 r;
    public final cm3 s;
    public final bu8 t;
    public hy8 u;
    public int v;
    public int w;
    public String x;

    public mg9(nf9 nf9Var, ih9 ih9Var, pf9 pf9Var, dh9 dh9Var, de9 de9Var, hl4 hl4Var, fp1 fp1Var, af7 af7Var, mz9 mz9Var, r31 r31Var, t1b t1bVar, mf7 mf7Var, r60 r60Var, k55 k55Var, n89 n89Var, p43 p43Var, uc8 uc8Var, ad8 ad8Var, cm3 cm3Var, bu8 bu8Var) {
        nf9Var.getClass();
        ih9Var.getClass();
        pf9Var.getClass();
        dh9Var.getClass();
        de9Var.getClass();
        k55Var.getClass();
        p43Var.getClass();
        uc8Var.getClass();
        ad8Var.getClass();
        cm3Var.getClass();
        bu8Var.getClass();
        this.a = nf9Var;
        this.b = ih9Var;
        this.c = pf9Var;
        this.d = dh9Var;
        this.e = de9Var;
        this.f = hl4Var;
        this.g = fp1Var;
        this.h = af7Var;
        this.i = mz9Var;
        this.j = r31Var;
        this.k = t1bVar;
        this.l = mf7Var;
        this.m = r60Var;
        this.n = k55Var;
        this.o = n89Var;
        this.p = p43Var;
        this.q = uc8Var;
        this.r = ad8Var;
        this.s = cm3Var;
        this.t = bu8Var;
        this.v = -1;
        this.w = -1;
        this.x = BuildConfig.FLAVOR;
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls) {
        cls.getClass();
        return new qf9(this.v, this.w, this.x, this.a.a(this.u), this.f, this.g, this.k, this.l, this.c, this.h, this.i, this.j, this.d, this.b, this.e, this.n, this.o, this.p, this.q, this.r, this.m, this.s, this.t);
    }
}
