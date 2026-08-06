package defpackage;

import android.content.ContentResolver;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ld3 implements thb.c {
    public final hy8 a;
    public final hl4 b;
    public final zz8 c;
    public final ee1 d;
    public final fp1 e;
    public final t1b f;
    public final n89 g;
    public final p43 h;
    public final oz9 i;
    public final s31 j;
    public final ov8 k;
    public final bf7 l;
    public final e70 m;
    public final bu8 n;
    public final ContentResolver o;
    public final cm3 p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public String u;
    public tc8 v;
    public zc8 w;

    public ld3(hy8 hy8Var, hl4 hl4Var, zz8 zz8Var, ee1 ee1Var, fp1 fp1Var, t1b t1bVar, n89 n89Var, p43 p43Var, oz9 oz9Var, s31 s31Var, ov8 ov8Var, bf7 bf7Var, e70 e70Var, bu8 bu8Var, ContentResolver contentResolver, cm3 cm3Var) {
        hy8Var.getClass();
        p43Var.getClass();
        e70Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        this.a = hy8Var;
        this.b = hl4Var;
        this.c = zz8Var;
        this.d = ee1Var;
        this.e = fp1Var;
        this.f = t1bVar;
        this.g = n89Var;
        this.h = p43Var;
        this.i = oz9Var;
        this.j = s31Var;
        this.k = ov8Var;
        this.l = bf7Var;
        this.m = e70Var;
        this.n = bu8Var;
        this.o = contentResolver;
        this.p = cm3Var;
        this.q = -1;
        this.r = -1;
        this.u = BuildConfig.FLAVOR;
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls) {
        cls.getClass();
        boolean z = this.t;
        tc8 tc8Var = this.v;
        if (tc8Var == null) {
            xj5.e("initPerformance");
            throw null;
        }
        zc8 zc8Var = this.w;
        if (zc8Var != null) {
            return new pc3(z, tc8Var, zc8Var, this.u, this.s, this.q, this.r, this.a, this.b, this.c, this.d, this.e, this.m, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.n, this.o, this.p);
        }
        xj5.e("initScore");
        throw null;
    }
}
