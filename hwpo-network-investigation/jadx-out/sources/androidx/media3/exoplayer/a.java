package androidx.media3.exoplayer;

import defpackage.bq6;
import defpackage.id4;
import defpackage.jd4;
import defpackage.lo3;
import defpackage.mn8;
import defpackage.nn2;
import defpackage.toa;
import defpackage.vf1;
import defpackage.x38;
import defpackage.xl7;
import defpackage.xz8;
import defpackage.zm6;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements k, l {
    public int A;
    public xz8 B;
    public id4[] C;
    public long D;
    public long E;
    public boolean G;
    public boolean H;
    public bq6.b J;
    public l.a K;
    public final int u;
    public mn8 w;
    public int x;
    public x38 y;
    public vf1 z;
    public final Object t = new Object();
    public final jd4 v = new jd4();
    public long F = Long.MIN_VALUE;
    public toa I = toa.a;

    public a(int i) {
        this.u = i;
    }

    @Override // androidx.media3.exoplayer.k
    public final void A() {
        xz8 xz8Var = this.B;
        xz8Var.getClass();
        xz8Var.a();
    }

    @Override // androidx.media3.exoplayer.k
    public final long B() {
        return this.F;
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean C() {
        return this.G;
    }

    @Override // androidx.media3.exoplayer.k
    public zm6 E() {
        return null;
    }

    @Override // androidx.media3.exoplayer.k
    public final int F() {
        return this.u;
    }

    public final lo3 G(Exception exc, id4 id4Var, boolean z, int i) {
        int iF;
        if (id4Var == null || this.H) {
            iF = 4;
        } else {
            this.H = true;
            try {
                iF = f(id4Var) & 7;
                this.H = false;
            } catch (lo3 unused) {
                this.H = false;
                iF = 4;
            } catch (Throwable th) {
                this.H = false;
                throw th;
            }
        }
        return new lo3(1, exc, i, getName(), this.x, id4Var, id4Var == null ? 4 : iF, this.J, z);
    }

    public abstract void H();

    public abstract void J(long j, boolean z, boolean z2);

    public final int Q(jd4 jd4Var, nn2 nn2Var, int i) {
        xz8 xz8Var = this.B;
        xz8Var.getClass();
        int iD = xz8Var.d(jd4Var, nn2Var, i);
        if (iD == -4) {
            if (nn2Var.i(4)) {
                this.F = Long.MIN_VALUE;
                return this.G ? -4 : -3;
            }
            long j = nn2Var.y + this.D;
            nn2Var.y = j;
            this.F = Math.max(this.F, j);
            return iD;
        }
        if (iD == -5) {
            id4 id4Var = jd4Var.b;
            id4Var.getClass();
            long j2 = id4Var.t;
            if (j2 != Long.MAX_VALUE) {
                id4.a aVarA = id4Var.a();
                aVarA.s = j2 + this.D;
                jd4Var.b = new id4(aVarA);
            }
        }
        return iD;
    }

    @Override // androidx.media3.exoplayer.k
    public final void a() {
        xl7.r(this.A == 0);
        K();
    }

    @Override // androidx.media3.exoplayer.k
    public boolean d() {
        return k();
    }

    @Override // androidx.media3.exoplayer.k
    public final int getState() {
        return this.A;
    }

    @Override // androidx.media3.exoplayer.k
    public final void i() {
        xl7.r(this.A == 1);
        this.v.a();
        this.A = 0;
        this.B = null;
        this.C = null;
        this.G = false;
        H();
        this.J = null;
    }

    @Override // androidx.media3.exoplayer.k
    public final void j(toa toaVar) {
        if (Objects.equals(this.I, toaVar)) {
            return;
        }
        this.I = toaVar;
        P();
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean k() {
        return this.F == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.k
    public final void n(id4[] id4VarArr, xz8 xz8Var, long j, long j2, bq6.b bVar) {
        xl7.r(!this.G);
        this.B = xz8Var;
        this.J = bVar;
        if (this.F == Long.MIN_VALUE) {
            this.F = j;
        }
        this.C = id4VarArr;
        this.D = j2;
        O(id4VarArr, j, j2, bVar);
    }

    @Override // androidx.media3.exoplayer.k
    public final void p() {
        this.G = true;
    }

    @Override // androidx.media3.exoplayer.k
    public final void q(long j, boolean z) {
        this.G = false;
        this.E = j;
        this.F = j;
        if (!z) {
            xz8 xz8Var = this.B;
            xz8Var.getClass();
            z = xz8Var.c(j - this.D) != 0;
        }
        J(j, false, z);
    }

    @Override // androidx.media3.exoplayer.k
    public final void reset() {
        xl7.r(this.A == 0);
        this.v.a();
        L();
    }

    @Override // androidx.media3.exoplayer.k
    public final void s(mn8 mn8Var, id4[] id4VarArr, xz8 xz8Var, boolean z, boolean z2, long j, long j2, bq6.b bVar) {
        xl7.r(this.A == 0);
        this.w = mn8Var;
        this.J = bVar;
        this.A = 1;
        I(z, z2);
        n(id4VarArr, xz8Var, j, j2, bVar);
        this.G = false;
        this.E = j;
        this.F = j;
        J(j, z, true);
    }

    @Override // androidx.media3.exoplayer.k
    public final void start() {
        xl7.r(this.A == 1);
        this.A = 2;
        M();
    }

    @Override // androidx.media3.exoplayer.k
    public final void stop() {
        xl7.r(this.A == 2);
        this.A = 1;
        N();
    }

    @Override // androidx.media3.exoplayer.k
    public final void t(int i, x38 x38Var, vf1 vf1Var) {
        this.x = i;
        this.y = x38Var;
        this.z = vf1Var;
    }

    @Override // androidx.media3.exoplayer.l
    public int x() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.k
    public final xz8 z() {
        return this.B;
    }

    public void K() {
    }

    public void L() {
    }

    public void M() {
    }

    public void N() {
    }

    public void P() {
    }

    @Override // androidx.media3.exoplayer.k
    public final a u() {
        return this;
    }

    public void I(boolean z, boolean z2) {
    }

    @Override // androidx.media3.exoplayer.j.b
    public void y(int i, Object obj) {
    }

    public void O(id4[] id4VarArr, long j, long j2, bq6.b bVar) {
    }
}
