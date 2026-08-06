package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kp0 implements thb.c {
    public final pf9 a;
    public final hy8 b;
    public final cb c;
    public final hl4 d;
    public final n89 e;
    public final p43 f;
    public final cm3 g;
    public final bu8 h;
    public int i;
    public int j;
    public List<vn0> k;

    public kp0(pf9 pf9Var, hy8 hy8Var, cb cbVar, hl4 hl4Var, n89 n89Var, p43 p43Var, cm3 cm3Var, bu8 bu8Var) {
        pf9Var.getClass();
        hy8Var.getClass();
        p43Var.getClass();
        cm3Var.getClass();
        bu8Var.getClass();
        this.a = pf9Var;
        this.b = hy8Var;
        this.c = cbVar;
        this.d = hl4Var;
        this.e = n89Var;
        this.f = p43Var;
        this.g = cm3Var;
        this.h = bu8Var;
        this.i = -1;
        this.j = -1;
        this.k = hf3.t;
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls) {
        cls.getClass();
        return new fp0(this.i, this.j, this.k, this.b, this.c, this.d, this.a, this.e, this.f, this.g, this.h);
    }
}
