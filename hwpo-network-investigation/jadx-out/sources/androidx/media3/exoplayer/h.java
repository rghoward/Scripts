package androidx.media3.exoplayer;

import android.util.Pair;
import defpackage.bq6;
import defpackage.k95;
import defpackage.kt4;
import defpackage.op1;
import defpackage.ri;
import defpackage.toa;
import defpackage.vp6;
import defpackage.wp6;
import defpackage.xl7;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final ri c;
    public final kt4 d;
    public final op1 e;
    public long f;
    public int g;
    public boolean h;
    public ExoPlayer.c i;
    public vp6 j;
    public vp6 k;
    public vp6 l;
    public vp6 m;
    public vp6 n;
    public int o;
    public Object p;
    public long q;
    public final toa.b a = new toa.b();
    public final toa.c b = new toa.c();
    public ArrayList r = new ArrayList();

    public h(ri riVar, kt4 kt4Var, op1 op1Var, ExoPlayer.c cVar) {
        this.c = riVar;
        this.d = kt4Var;
        this.e = op1Var;
        this.i = cVar;
    }

    public static bq6.b p(toa toaVar, Object obj, long j, long j2, toa.c cVar, toa.b bVar) {
        toaVar.g(obj, bVar);
        toaVar.n(bVar.c, cVar);
        toaVar.b(obj);
        int i = bVar.g.a;
        if (i != 0) {
            if (i == 1) {
                bVar.f(0);
            }
            bVar.g.getClass();
            bVar.g(0);
        }
        toaVar.g(obj, bVar);
        int iC = bVar.c(j);
        return iC == -1 ? new bq6.b(obj, j2, bVar.b(j)) : new bq6.b(obj, iC, bVar.e(iC), j2, -1);
    }

    public final vp6 a() {
        vp6 vp6Var = this.j;
        if (vp6Var == null) {
            return null;
        }
        if (vp6Var == this.k) {
            this.k = vp6Var.m;
        }
        if (vp6Var == this.l) {
            this.l = vp6Var.m;
        }
        vp6Var.i();
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.m = null;
            vp6 vp6Var2 = this.j;
            this.p = vp6Var2.b;
            this.q = vp6Var2.g.a.d;
        }
        this.j = this.j.m;
        l();
        return this.j;
    }

    public final void b() {
        if (this.o == 0) {
            return;
        }
        vp6 vp6Var = this.j;
        vp6Var.getClass();
        this.p = vp6Var.b;
        this.q = vp6Var.g.a.d;
        while (vp6Var != null) {
            vp6Var.i();
            vp6Var = vp6Var.m;
        }
        this.j = null;
        this.m = null;
        this.k = null;
        this.l = null;
        this.o = 0;
        l();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    public final wp6 c(toa toaVar, vp6 vp6Var, long j) {
        toa toaVar2;
        long j2;
        wp6 wp6Var;
        toa.b bVar;
        Object obj;
        long j3;
        long j4;
        long j5;
        long jMax;
        long jR;
        wp6 wp6Var2 = vp6Var.g;
        long j6 = (vp6Var.p + wp6Var2.f) - j;
        boolean z = wp6Var2.i;
        toa.c cVar = this.b;
        long j7 = 0;
        long jMax2 = -9223372036854775807L;
        if (!z) {
            bq6.b bVar2 = wp6Var2.a;
            Object obj2 = bVar2.a;
            int i = bVar2.e;
            toa.b bVar3 = this.a;
            toaVar.g(obj2, bVar3);
            boolean z2 = wp6Var2.h;
            if (!bVar2.b()) {
                if (i != -1) {
                    bVar3.f(i);
                }
                int iE = bVar3.e(i);
                bVar3.g(i);
                if (iE != bVar3.g.a(i).a) {
                    return e(toaVar, bVar2.a, bVar2.e, iE, wp6Var2.f, bVar2.d, z2);
                }
                toaVar.g(obj2, bVar3);
                bVar3.d(i);
                bVar3.g.a(i).getClass();
                return f(toaVar, bVar2.a, 0L, -9223372036854775807L, wp6Var2.f, bVar2.d, false);
            }
            int i2 = bVar2.b;
            int i3 = bVar3.g.a(i2).a;
            if (i3 != -1) {
                int iA = bVar3.g.a(i2).a(bVar2.c);
                if (iA < i3) {
                    return e(toaVar, bVar2.a, i2, iA, wp6Var2.d, bVar2.d, z2);
                }
                long jLongValue = wp6Var2.d;
                if (jLongValue == -9223372036854775807L) {
                    int i4 = bVar3.c;
                    if (bVar3.d == -9223372036854775807L) {
                        toaVar.n(i4, cVar);
                        if (cVar.i && !cVar.k) {
                            jMax2 = Math.max(0L, j6);
                        }
                    }
                    long j8 = jMax2;
                    toaVar2 = toaVar;
                    Pair<Object, Long> pairJ = toaVar2.j(this.b, bVar3, bVar3.c, -9223372036854775807L, j8);
                    if (pairJ != null) {
                        jLongValue = ((Long) pairJ.second).longValue();
                        j2 = j8;
                    }
                } else {
                    toaVar2 = toaVar;
                    j2 = -9223372036854775807L;
                }
                int i5 = bVar2.b;
                toaVar2.g(obj2, bVar3);
                bVar3.d(i5);
                bVar3.g.a(i5).getClass();
                return f(toaVar2, bVar2.a, Math.max(0L, jLongValue), j2, wp6Var2.d, bVar2.d, z2);
            }
            return null;
        }
        wp6 wp6Var3 = vp6Var.g;
        bq6.b bVar4 = wp6Var3.a;
        long j9 = wp6Var3.d;
        int iD = toaVar.d(toaVar.b(bVar4.a), this.a, this.b, this.g, this.h);
        if (iD != -1) {
            toa.b bVar5 = this.a;
            int i6 = toaVar.f(iD, bVar5, true).c;
            Object obj3 = bVar5.b;
            obj3.getClass();
            long j10 = bVar4.d;
            wp6Var = null;
            if (toaVar.m(i6, cVar, 0L).n == iD) {
                int i7 = bVar5.c;
                if (bVar5.d != -9223372036854775807L) {
                    jMax = -9223372036854775807L;
                } else {
                    toaVar.n(i7, cVar);
                    if (!cVar.i || cVar.k) {
                        jMax = -9223372036854775807L;
                    } else {
                        jMax = Math.max(0L, j6);
                    }
                }
                long j11 = jMax;
                bVar = bVar5;
                Pair<Object, Long> pairJ2 = toaVar.j(this.b, this.a, i6, -9223372036854775807L, j11);
                if (pairJ2 != null) {
                    Object obj4 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    vp6 vp6Var2 = vp6Var.m;
                    if (vp6Var2 == null || !vp6Var2.b.equals(obj4)) {
                        jR = r(obj4);
                        if (jR == -1) {
                            jR = this.f;
                            this.f = 1 + jR;
                        }
                    } else {
                        jR = vp6Var2.g.a.d;
                    }
                    obj = obj4;
                    j3 = jR;
                    j5 = j11;
                    j4 = jLongValue2;
                    j7 = -9223372036854775807L;
                }
            } else {
                bVar = bVar5;
                obj = obj3;
                j3 = j10;
                j4 = 0;
                j5 = -9223372036854775807L;
            }
            bq6.b bVarP = p(toaVar, obj, j4, j3, this.b, this.a);
            if (j7 != -9223372036854775807L && j9 != -9223372036854775807L) {
                int i8 = toaVar.g(bVar4.a, bVar).g.a;
                bVar.g.getClass();
                if (i8 > 0) {
                    bVar.g(0);
                }
            }
            return d(toaVar, bVarP, j7, j4, j5);
        }
        wp6Var = null;
        return wp6Var;
    }

    public final wp6 d(toa toaVar, bq6.b bVar, long j, long j2, long j3) {
        toaVar.g(bVar.a, this.a);
        boolean zB = bVar.b();
        Object obj = bVar.a;
        return zB ? e(toaVar, obj, bVar.b, bVar.c, j, bVar.d, false) : f(toaVar, obj, j2, j3, j, bVar.d, false);
    }

    public final wp6 e(toa toaVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        bq6.b bVar = new bq6.b(obj, i, i2, j2, -1);
        toa.b bVar2 = this.a;
        long jA = toaVar.g(obj, bVar2).a(i, i2);
        if (i2 == bVar2.e(i)) {
            bVar2.g.getClass();
        }
        bVar2.g(i);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new wp6(bVar, jMax, -9223372036854775807L, j, -9223372036854775807L, jA, z, false, false, false, false);
    }

    public final wp6 f(toa toaVar, Object obj, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        toa.b bVar = this.a;
        toaVar.g(obj, bVar);
        int iB = bVar.b(j);
        boolean z2 = false;
        if (iB != -1) {
            bVar.g(iB);
        } else if (bVar.g.a > 0) {
            bVar.g(0);
        }
        bq6.b bVar2 = new bq6.b(obj, j4, iB);
        if (!bVar2.b() && iB == -1) {
            z2 = true;
        }
        boolean zJ = j(toaVar, bVar2);
        boolean zI = i(toaVar, bVar2, z2);
        if (iB != -1) {
            bVar.g(iB);
        }
        if (iB != -1) {
            bVar.f(iB);
        }
        if (iB != -1) {
            bVar.d(iB);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        long j6 = (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? bVar.d : j5;
        return new wp6(bVar2, (j6 == -9223372036854775807L || j < j6) ? j : Math.max(0L, j6 - 1), j2, j3, j5, j6, z, false, z2, zJ, zI);
    }

    public final vp6 g() {
        return this.l;
    }

    public final wp6 h(toa toaVar, wp6 wp6Var) {
        long j;
        long jA;
        bq6.b bVar = wp6Var.a;
        boolean zB = bVar.b();
        int i = bVar.e;
        boolean z = !zB && i == -1;
        int i2 = bVar.b;
        boolean zJ = j(toaVar, bVar);
        boolean zI = i(toaVar, bVar, z);
        Object obj = bVar.a;
        toa.b bVar2 = this.a;
        toaVar.g(obj, bVar2);
        if (bVar.b() || i == -1) {
            j = -9223372036854775807L;
        } else {
            bVar2.d(i);
            j = 0;
        }
        if (bVar.b()) {
            jA = bVar2.a(i2, bVar.c);
        } else {
            jA = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? bVar2.d : j;
        }
        if (bVar.b()) {
            bVar2.g(i2);
        } else if (i != -1) {
            bVar2.g(i);
        }
        return new wp6(bVar, wp6Var.b, wp6Var.c, wp6Var.d, j, jA, wp6Var.g, false, z, zJ, zI);
    }

    public final boolean i(toa toaVar, bq6.b bVar, boolean z) {
        int iB = toaVar.b(bVar.a);
        if (!toaVar.m(toaVar.f(iB, this.a, false).c, this.b, 0L).i) {
            if (toaVar.d(iB, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(toa toaVar, bq6.b bVar) {
        boolean z = !bVar.b() && bVar.e == -1;
        Object obj = bVar.a;
        if (z) {
            if (toaVar.m(toaVar.g(obj, this.a).c, this.b, 0L).o == toaVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        vp6 vp6Var = this.n;
        if (vp6Var == null || vp6Var.h()) {
            this.n = null;
            for (int i = 0; i < this.r.size(); i++) {
                vp6 vp6Var2 = (vp6) this.r.get(i);
                if (!vp6Var2.h()) {
                    this.n = vp6Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        k95.b bVar = k95.u;
        final k95.a aVar = new k95.a();
        for (vp6 vp6Var = this.j; vp6Var != null; vp6Var = vp6Var.m) {
            aVar.c(vp6Var.g.a);
        }
        vp6 vp6Var2 = this.k;
        final bq6.b bVar2 = vp6Var2 == null ? null : vp6Var2.g.a;
        this.d.e(new Runnable() { // from class: xp6
            @Override // java.lang.Runnable
            public final void run() {
                this.t.c.G(aVar.g(), bVar2);
            }
        });
    }

    public final void m(long j) {
        vp6 vp6Var = this.m;
        if (vp6Var != null) {
            xl7.r(vp6Var.m == null);
            if (vp6Var.e) {
                vp6Var.a.v(j - vp6Var.p);
            }
        }
    }

    public final void n(ArrayList arrayList) {
        for (int i = 0; i < this.r.size(); i++) {
            ((vp6) this.r.get(i)).i();
        }
        this.r = arrayList;
        this.n = null;
        k();
    }

    public final int o(vp6 vp6Var) {
        vp6Var.getClass();
        int i = 0;
        if (vp6Var != this.m) {
            this.m = vp6Var;
            while (true) {
                vp6Var = vp6Var.m;
                if (vp6Var == null) {
                    break;
                }
                if (vp6Var == this.k) {
                    vp6 vp6Var2 = this.j;
                    this.k = vp6Var2;
                    this.l = vp6Var2;
                    i = 3;
                }
                if (vp6Var == this.l) {
                    this.l = this.k;
                    i |= 2;
                }
                vp6Var.i();
                this.o--;
            }
            vp6 vp6Var3 = this.m;
            vp6Var3.getClass();
            if (vp6Var3.m != null) {
                vp6Var3.b();
                vp6Var3.m = null;
                vp6Var3.c();
            }
            l();
        }
        return i;
    }

    public final bq6.b q(toa toaVar, Object obj, long j) {
        long jR;
        int iB;
        Object obj2 = obj;
        toa.b bVar = this.a;
        int i = toaVar.g(obj2, bVar).c;
        Object obj3 = this.p;
        if (obj3 == null || (iB = toaVar.b(obj3)) == -1 || toaVar.f(iB, bVar, false).c != i) {
            vp6 vp6Var = this.j;
            while (true) {
                if (vp6Var == null) {
                    vp6 vp6Var2 = this.j;
                    while (true) {
                        if (vp6Var2 == null) {
                            jR = r(obj2);
                            if (jR != -1) {
                                break;
                            }
                            jR = this.f;
                            this.f = 1 + jR;
                            if (this.j != null) {
                                break;
                            }
                            this.p = obj2;
                            this.q = jR;
                            break;
                        }
                        int iB2 = toaVar.b(vp6Var2.b);
                        if (iB2 != -1 && toaVar.f(iB2, bVar, false).c == i) {
                            jR = vp6Var2.g.a.d;
                            break;
                        }
                        vp6Var2 = vp6Var2.m;
                    }
                } else {
                    if (vp6Var.b.equals(obj2)) {
                        jR = vp6Var.g.a.d;
                        break;
                    }
                    vp6Var = vp6Var.m;
                }
            }
        } else {
            jR = this.q;
        }
        toaVar.g(obj2, bVar);
        int i2 = bVar.c;
        toa.c cVar = this.b;
        toaVar.n(i2, cVar);
        boolean z = false;
        for (int iB3 = toaVar.b(obj); iB3 >= cVar.n; iB3--) {
            toaVar.f(iB3, bVar, true);
            boolean z2 = bVar.g.a > 0;
            z |= z2;
            if (bVar.c(bVar.d) != -1) {
                obj2 = bVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || bVar.d != 0)) {
                break;
            }
        }
        return p(toaVar, obj2, j, jR, this.b, this.a);
    }

    public final long r(Object obj) {
        for (int i = 0; i < this.r.size(); i++) {
            vp6 vp6Var = (vp6) this.r.get(i);
            if (vp6Var.b.equals(obj)) {
                return vp6Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int s(toa toaVar) {
        toa toaVar2;
        vp6 vp6Var;
        vp6 vp6Var2 = this.j;
        if (vp6Var2 == null) {
            return 0;
        }
        int iB = toaVar.b(vp6Var2.b);
        while (true) {
            toaVar2 = toaVar;
            iB = toaVar2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                vp6Var = vp6Var2.m;
                if (vp6Var == null || vp6Var2.g.i) {
                    break;
                }
                vp6Var2 = vp6Var;
            }
            if (iB == -1 || vp6Var == null || toaVar2.b(vp6Var.b) != iB) {
                break;
            }
            vp6Var2 = vp6Var;
            toaVar = toaVar2;
        }
        int iO = o(vp6Var2);
        vp6Var2.g = h(toaVar2, vp6Var2.g);
        return iO;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    public final int t(toa toaVar, long j, long j2, long j3) {
        long j4;
        int i;
        wp6 wp6VarB;
        int i2;
        vp6 vp6Var = this.j;
        vp6 vp6Var2 = null;
        while (vp6Var != null) {
            wp6 wp6Var = vp6Var.g;
            if (vp6Var2 != null) {
                wp6 wp6VarC = c(toaVar, vp6Var2, j);
                if (wp6VarC != null) {
                    long j5 = wp6VarC.b;
                    bq6.b bVar = wp6Var.a;
                    long j6 = wp6Var.c;
                    j4 = -9223372036854775807L;
                    long j7 = wp6Var.b;
                    i = 0;
                    if (bVar.equals(wp6VarC.a)) {
                        if (j7 != j5) {
                            if (j6 != -9223372036854775807L) {
                                long j8 = wp6VarC.c;
                                if (j8 != -9223372036854775807L) {
                                    if (Math.abs((j5 - j8) - (j7 - j6)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        wp6VarB = j7 != j5 ? wp6VarC.b(j7, j6) : wp6VarC;
                    }
                }
                return o(vp6Var2);
            }
            wp6VarB = h(toaVar, wp6Var);
            j4 = -9223372036854775807L;
            i = 0;
            long j9 = wp6VarB.f;
            long j10 = wp6Var.d;
            long j11 = wp6Var.f;
            vp6Var.g = wp6VarB.a(j10);
            if (j11 != j9) {
                vp6Var.k();
                long j12 = j9 == j4 ? Long.MAX_VALUE : j9 + vp6Var.p;
                int i3 = 1;
                int i4 = (vp6Var != this.k || vp6Var.g.h || (j2 != Long.MIN_VALUE && j2 < j12)) ? i : 1;
                int i5 = (vp6Var != this.l || (j3 != Long.MIN_VALUE && j3 < j12)) ? i : 1;
                int iO = o(vp6Var);
                if (iO != 0) {
                    return iO;
                }
                if (j11 == j4 && wp6Var.e == Long.MIN_VALUE) {
                    long j13 = wp6VarB.e;
                    if (j13 == j4 || j13 == Long.MIN_VALUE) {
                        i2 = i;
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = i;
                }
                if (i4 == 0 || (j11 == j4 && i2 == 0)) {
                    i3 = i;
                }
                return i5 != 0 ? i3 | 2 : i3;
            }
            vp6Var2 = vp6Var;
            vp6Var = vp6Var.m;
        }
        return 0;
    }
}
