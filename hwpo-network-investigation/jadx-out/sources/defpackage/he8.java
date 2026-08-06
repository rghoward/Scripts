package defpackage;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class he8 extends qk0 {
    public final if2.a h;
    public final ce8.a i;
    public final k83 j;
    public final qb6 k;
    public final int l;
    public final id4 m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public yua s;
    public co6 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ud4 {
        @Override // defpackage.ud4, defpackage.toa
        public final toa.b f(int i, toa.b bVar, boolean z) {
            super.f(i, bVar, z);
            bVar.f = true;
            return bVar;
        }

        @Override // defpackage.ud4, defpackage.toa
        public final toa.c m(int i, toa.c cVar, long j) {
            super.m(i, cVar, j);
            cVar.k = true;
            return cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements bq6.a {
        public final if2.a a;
        public final ie8 b;
        public final uq2 c;
        public final es2 d;
        public final int e;

        public b(if2.a aVar, cr2 cr2Var) {
            ie8 ie8Var = new ie8(cr2Var);
            uq2 uq2Var = new uq2();
            es2 es2Var = new es2();
            this.a = aVar;
            this.b = ie8Var;
            this.c = uq2Var;
            this.d = es2Var;
            this.e = 1048576;
        }

        @Override // bq6.a
        public final bq6 c(co6 co6Var) {
            co6Var.b.getClass();
            return new he8(co6Var, this.a, this.b, this.c.b(co6Var), this.d, this.e, null);
        }
    }

    public he8(co6 co6Var, if2.a aVar, ie8 ie8Var, k83 k83Var, qb6 qb6Var, int i, id4 id4Var) {
        this.t = co6Var;
        this.h = aVar;
        this.i = ie8Var;
        this.j = k83Var;
        this.k = qb6Var;
        this.l = i;
        this.m = id4Var;
    }

    @Override // defpackage.bq6
    public final up6 c(bq6.b bVar, ki kiVar, long j) {
        if2 if2VarA = this.h.a();
        yua yuaVar = this.s;
        if (yuaVar != null) {
            if2VarA.d(yuaVar);
        }
        co6.f fVar = h().b;
        fVar.getClass();
        Uri uri = fVar.a;
        this.g.getClass();
        return new ge8(uri, if2VarA, new wy0(((ie8) this.i).a), this.j, new j83.a(this.d.c, 0, bVar), this.k, new jq6.a(this.c.c, 0, bVar), this, kiVar, this.l, this.m, n6b.N(fVar.f), null);
    }

    @Override // defpackage.bq6
    public final synchronized co6 h() {
        return this.t;
    }

    @Override // defpackage.bq6
    public final synchronized void m(co6 co6Var) {
        this.t = co6Var;
    }

    @Override // defpackage.bq6
    public final void n(up6 up6Var) {
        ge8 ge8Var = (ge8) up6Var;
        if (ge8Var.Q) {
            for (vz8 vz8Var : ge8Var.N) {
                vz8Var.j();
                i83 i83Var = vz8Var.h;
                if (i83Var != null) {
                    i83Var.c(vz8Var.e);
                    vz8Var.h = null;
                    vz8Var.g = null;
                }
            }
        }
        ge8Var.E.c(ge8Var);
        ge8Var.J.removeCallbacksAndMessages(null);
        ge8Var.K = null;
        ge8Var.j0 = true;
    }

    @Override // defpackage.qk0
    public final void r(yua yuaVar) {
        this.s = yuaVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        x38 x38Var = this.g;
        x38Var.getClass();
        k83 k83Var = this.j;
        k83Var.f(looperMyLooper, x38Var);
        k83Var.d();
        u();
    }

    @Override // defpackage.qk0
    public final void t() {
        this.j.a();
    }

    public final void u() {
        long j = this.o;
        boolean z = this.p;
        boolean z2 = this.q;
        co6 co6VarH = h();
        toa dq9Var = new dq9(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, co6VarH, z2 ? co6VarH.c : null);
        if (this.n) {
            dq9Var = new a(dq9Var);
        }
        s(dq9Var);
    }

    public final void v(long j, t89 t89Var, boolean z) {
        if (this.r && t89Var.d()) {
            return;
        }
        this.r = !t89Var.d();
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean zB = t89Var.b();
        if (!this.n && this.o == j && this.p == zB && this.q == z) {
            return;
        }
        this.o = j;
        this.p = zB;
        this.q = z;
        this.n = false;
        u();
    }

    @Override // defpackage.bq6
    public final void j() {
    }
}
