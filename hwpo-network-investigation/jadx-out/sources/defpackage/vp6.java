package defpackage;

import android.util.Pair;
import androidx.media3.exoplayer.a;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.l;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vp6 {
    public final up6 a;
    public final Object b;
    public final xz8[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public wp6 g;
    public boolean h;
    public final boolean[] i;
    public final l[] j;
    public final msa k;
    public final i l;
    public vp6 m;
    public gsa n;
    public nsa o;
    public long p;

    public vp6(l[] lVarArr, long j, msa msaVar, ki kiVar, i iVar, wp6 wp6Var, nsa nsaVar) {
        this.j = lVarArr;
        this.p = j;
        this.k = msaVar;
        this.l = iVar;
        bq6.b bVar = wp6Var.a;
        this.b = bVar.a;
        this.g = wp6Var;
        this.n = gsa.d;
        this.o = nsaVar;
        this.c = new xz8[lVarArr.length];
        this.i = new boolean[lVarArr.length];
        long j2 = wp6Var.b;
        long j3 = wp6Var.e;
        boolean z = wp6Var.g;
        iVar.getClass();
        Object obj = bVar.a;
        int i = w0.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        bq6.b bVarA = bVar.a(pair.second);
        i.c cVar = (i.c) iVar.d.get(obj2);
        cVar.getClass();
        iVar.g.add(cVar);
        i.b bVar2 = iVar.f.get(cVar);
        if (bVar2 != null) {
            bVar2.a.o(bVar2.b);
        }
        cVar.c.add(bVarA);
        up6 up6VarD = cVar.a.c(bVarA, kiVar, j2);
        iVar.c.put(up6VarD, cVar);
        iVar.c();
        if (j3 != -9223372036854775807L) {
            up6VarD = new sf1(up6VarD, !z, 0L, j3, 0);
        }
        this.a = up6VarD;
    }

    public final long a(nsa nsaVar, long j, boolean z, boolean[] zArr) {
        l[] lVarArr;
        xz8[] xz8VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= nsaVar.a) {
                break;
            }
            if (z || !nsaVar.a(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            lVarArr = this.j;
            int length = lVarArr.length;
            xz8VarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (((a) lVarArr[i2]).u == -2) {
                xz8VarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = nsaVar;
        c();
        long jD = this.a.d(nsaVar.c, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < lVarArr.length; i3++) {
            if (((a) lVarArr[i3]).u == -2 && this.o.b(i3)) {
                xz8VarArr[i3] = new b1b();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < xz8VarArr.length; i4++) {
            if (xz8VarArr[i4] != null) {
                xl7.r(nsaVar.b(i4));
                if (((a) lVarArr[i4]).u != -2) {
                    this.f = true;
                }
            } else {
                xl7.r(nsaVar.c[i4] == null);
            }
        }
        return jD;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            nsa nsaVar = this.o;
            if (i >= nsaVar.a) {
                return;
            }
            boolean zB = nsaVar.b(i);
            fq3 fq3Var = this.o.c[i];
            if (zB && fq3Var != null) {
                fq3Var.i();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            nsa nsaVar = this.o;
            if (i >= nsaVar.a) {
                return;
            }
            boolean zB = nsaVar.b(i);
            fq3 fq3Var = this.o.c[i];
            if (zB && fq3Var != null) {
                fq3Var.o();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jQ = this.f ? this.a.q() : Long.MIN_VALUE;
        return jQ == Long.MIN_VALUE ? this.g.f : jQ;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, toa toaVar, boolean z) {
        this.e = true;
        this.n = this.a.n();
        nsa nsaVarJ = j(f, toaVar, z);
        wp6 wp6Var = this.g;
        long jMax = wp6Var.b;
        long j = wp6Var.f;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(nsaVarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        wp6 wp6Var2 = this.g;
        this.p = (wp6Var2.b - jA) + j2;
        this.g = wp6Var2.b(jA, wp6Var2.c);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.q() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        up6 up6Var = this.a;
        try {
            boolean z = up6Var instanceof sf1;
            i iVar = this.l;
            if (z) {
                iVar.f(((sf1) up6Var).t);
            } else {
                iVar.f(up6Var);
            }
        } catch (RuntimeException e) {
            md6.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final nsa j(float f, toa toaVar, boolean z) {
        fq3[] fq3VarArr;
        gsa gsaVar = this.n;
        bq6.b bVar = this.g.a;
        msa msaVar = this.k;
        l[] lVarArr = this.j;
        nsa nsaVarE = msaVar.e(lVarArr, gsaVar, bVar, toaVar);
        int i = 0;
        while (true) {
            int i2 = nsaVarE.a;
            fq3VarArr = nsaVarE.c;
            if (i >= i2) {
                break;
            }
            boolean z2 = true;
            if (nsaVarE.b(i)) {
                if (fq3VarArr[i] == null && ((a) lVarArr[i]).u != -2) {
                    z2 = false;
                }
                xl7.r(z2);
            } else {
                xl7.r(fq3VarArr[i] == null);
            }
            i++;
        }
        for (fq3 fq3Var : fq3VarArr) {
            if (fq3Var != null) {
                fq3Var.u(f);
                fq3Var.n(z);
            }
        }
        return nsaVarE;
    }

    public final void k() {
        up6 up6Var = this.a;
        if (up6Var instanceof sf1) {
            long j = this.g.e;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            sf1 sf1Var = (sf1) up6Var;
            sf1Var.y = 0L;
            sf1Var.z = j;
        }
    }
}
