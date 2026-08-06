package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k16 {
    public final c26 a;
    public final List<Integer> b;
    public final x06 c;
    public final x16 d;
    public final long e;
    public final boolean f;
    public final tw5 g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final t72 m;
    public final boolean n;
    public final List<w06> o;
    public final jo4 p;
    public final j16 q;
    public final h16 r;
    public final int s;

    public k16(c26 c26Var, List list, x06 x06Var, x16 x16Var, long j, boolean z, tw5 tw5Var, int i, long j2, int i2, int i3, int i4, t72 t72Var, boolean z2, List list2, jo4 jo4Var) {
        this.a = c26Var;
        this.b = list;
        this.c = x06Var;
        this.d = x16Var;
        this.e = j;
        this.f = z;
        this.g = tw5Var;
        this.h = i;
        this.i = j2;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = t72Var;
        this.n = z2;
        this.o = list2;
        this.p = jo4Var;
        this.q = new j16(this, z, x06Var, tw5Var, x16Var);
        this.r = c26Var.e;
        this.s = x16Var.b.length;
    }

    public final long a(x06 x06Var, int i, int i2) {
        x06Var.h().a(i);
        return (((long) i2) << 32) | (((long) (i2 + 1)) & 4294967295L);
    }
}
