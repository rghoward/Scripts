package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dq9 extends toa {
    public static final Object o = new Object();
    public final long b;
    public final long c;
    public final long d = -9223372036854775807L;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Object l;
    public final co6 m;
    public final co6.e n;

    static {
        co6.b.a aVar = new co6.b.a();
        vl8 vl8Var = vl8.z;
        k95.b bVar = k95.u;
        ul8 ul8Var = ul8.x;
        List list = Collections.EMPTY_LIST;
        ul8 ul8Var2 = ul8.x;
        co6.e.a aVar2 = new co6.e.a();
        co6.g gVar = co6.g.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new co6.f(uri, null, null, list, ul8Var2, null, -9223372036854775807L);
        }
        aVar.a();
        aVar2.a();
        np6 np6Var = np6.B;
    }

    public dq9(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, p84 p84Var, co6 co6Var, co6.e eVar) {
        this.b = j;
        this.c = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = p84Var;
        co6Var.getClass();
        this.m = co6Var;
        this.n = eVar;
    }

    @Override // defpackage.toa
    public final int b(Object obj) {
        return o != obj ? -1 : 0;
    }

    @Override // defpackage.toa
    public final toa.b f(int i, toa.b bVar, boolean z) {
        xl7.k(i, 1);
        Object obj = z ? o : null;
        long j = -this.g;
        bVar.getClass();
        bVar.h(null, obj, 0, this.e, j, sa.c, false);
        return bVar;
    }

    @Override // defpackage.toa
    public final int h() {
        return 1;
    }

    @Override // defpackage.toa
    public final Object l(int i) {
        xl7.k(i, 1);
        return o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r1
      0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.toa
    public final toa.c m(int i, toa.c cVar, long j) {
        long j2;
        xl7.k(i, 1);
        long j3 = this.h;
        boolean z = this.j;
        if (!z || this.k || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        Object obj = toa.c.q;
        cVar.b(this.m, this.l, this.b, this.c, this.d, this.i, z, this.n, j2, this.f, this.g);
        return cVar;
    }

    @Override // defpackage.toa
    public final int o() {
        return 1;
    }
}
