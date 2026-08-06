package defpackage;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xc1 {
    public final tg0 a;
    public final hsa b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public xc1(int i, tg0 tg0Var, hsa hsaVar) {
        int i2 = tg0Var.d;
        this.a = tg0Var;
        int iA = tg0Var.a();
        boolean z = true;
        if (iA != 1 && iA != 2) {
            z = false;
        }
        xl7.g(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) tg0Var.b) * 1000000;
        long j2 = tg0Var.c;
        String str = n6b.a;
        this.e = n6b.U(i2, j, j2, RoundingMode.DOWN);
        this.b = hsaVar;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final v89 a(int i) {
        return new v89((this.e / ((long) this.f)) * ((long) this.n[i]), this.m[i]);
    }

    public final t89.a b(long j) {
        if (this.k == 0) {
            v89 v89Var = new v89(0L, this.l);
            return new t89.a(v89Var, v89Var);
        }
        int i = (int) (j / (this.e / ((long) this.f)));
        int iE = n6b.e(this.n, i, true, true);
        if (this.n[iE] == i) {
            v89 v89VarA = a(iE);
            return new t89.a(v89VarA, v89VarA);
        }
        v89 v89VarA2 = a(iE);
        int i2 = iE + 1;
        return i2 < this.m.length ? new t89.a(v89VarA2, a(i2)) : new t89.a(v89VarA2, v89VarA2);
    }
}
