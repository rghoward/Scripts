package defpackage;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jkb implements t89 {
    public final hkb a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public jkb(hkb hkbVar, int i, long j, long j2) {
        this.a = hkbVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) hkbVar.c);
        this.d = j3;
        this.e = h(j3);
    }

    @Override // defpackage.t89
    public final boolean b() {
        return true;
    }

    @Override // defpackage.t89
    public final t89.a e(long j) {
        hkb hkbVar = this.a;
        long j2 = (((long) hkbVar.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d - 1;
        long j4 = n6b.j(j2, 0L, j3);
        int i = hkbVar.c;
        long j5 = this.c;
        long jH = h(j4);
        v89 v89Var = new v89(jH, (((long) i) * j4) + j5);
        if (jH >= j || j4 == j3) {
            return new t89.a(v89Var, v89Var);
        }
        long j6 = j4 + 1;
        return new t89.a(v89Var, new v89(h(j6), (((long) i) * j6) + j5));
    }

    @Override // defpackage.t89
    public final long g() {
        return this.e;
    }

    public final long h(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.a.b;
        String str = n6b.a;
        return n6b.U(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
