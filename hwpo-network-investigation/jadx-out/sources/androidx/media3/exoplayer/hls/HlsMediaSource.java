package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.bq6;
import defpackage.co6;
import defpackage.cp6;
import defpackage.cz4;
import defpackage.dq9;
import defpackage.dz4;
import defpackage.es2;
import defpackage.i83;
import defpackage.if2;
import defpackage.iz4;
import defpackage.j83;
import defpackage.jq6;
import defpackage.k83;
import defpackage.k95;
import defpackage.ki;
import defpackage.mr2;
import defpackage.mz3;
import defpackage.n6b;
import defpackage.nq2;
import defpackage.nr2;
import defpackage.o03;
import defpackage.of2;
import defpackage.or2;
import defpackage.p84;
import defpackage.pr2;
import defpackage.pz4;
import defpackage.qb6;
import defpackage.qk0;
import defpackage.r1a;
import defpackage.up6;
import defpackage.uq2;
import defpackage.ut7;
import defpackage.vt7;
import defpackage.wy4;
import defpackage.x38;
import defpackage.xl7;
import defpackage.yb6;
import defpackage.yua;
import defpackage.yy4;
import defpackage.zt2;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends qk0 {
    public final yy4 h;
    public final mr2 i;
    public final nq2 j;
    public final k83 k;
    public final qb6 l;
    public final boolean m;
    public final int n;
    public final pr2 o;
    public final long p;
    public co6.e q;
    public yua r;
    public co6 s;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Factory implements bq6.a {
        public final mr2 a;
        public nr2 b;
        public zt2 c;
        public final uq2 i = new uq2();
        public final or2 f = new or2();
        public final o03 g = pr2.M;
        public final es2 j = new es2();
        public final nq2 h = new nq2();
        public final int l = 1;
        public final long m = -9223372036854775807L;
        public boolean k = true;
        public int e = 3;
        public boolean d = true;

        public Factory(if2.a aVar) {
            this.a = new mr2(aVar);
        }

        @Override // bq6.a
        public final void a(zt2 zt2Var) {
            this.c = zt2Var;
        }

        @Override // bq6.a
        @Deprecated
        public final void b(boolean z) {
            this.d = z;
        }

        @Override // bq6.a
        public final void d(int i) {
            this.e = i;
        }

        @Override // bq6.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final HlsMediaSource c(co6 co6Var) {
            co6Var.b.getClass();
            if (this.b == null) {
                this.b = new nr2();
            }
            zt2 zt2Var = this.c;
            if (zt2Var != null) {
                this.b.a = zt2Var;
            }
            nr2 nr2Var = this.b;
            nr2Var.b = this.d;
            nr2Var.c = this.e;
            List<r1a> list = co6Var.b.c;
            boolean zIsEmpty = list.isEmpty();
            or2 or2Var = this.f;
            iz4 mz3Var = or2Var;
            if (!zIsEmpty) {
                mz3Var = new mz3(or2Var, list);
            }
            k83 k83VarB = this.i.b(co6Var);
            this.g.getClass();
            mr2 mr2Var = this.a;
            es2 es2Var = this.j;
            return new HlsMediaSource(co6Var, mr2Var, nr2Var, this.h, k83VarB, es2Var, new pr2(mr2Var, es2Var, mz3Var), this.m, this.k, this.l);
        }
    }

    static {
        cp6.a("media3.exoplayer.hls");
    }

    public HlsMediaSource(co6 co6Var, mr2 mr2Var, nr2 nr2Var, nq2 nq2Var, k83 k83Var, es2 es2Var, pr2 pr2Var, long j, boolean z, int i) {
        this.s = co6Var;
        this.q = co6Var.c;
        this.i = mr2Var;
        this.h = nr2Var;
        this.j = nq2Var;
        this.k = k83Var;
        this.l = es2Var;
        this.o = pr2Var;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static dz4.c u(long j, List list) {
        dz4.c cVar = null;
        for (int i = 0; i < list.size(); i++) {
            dz4.c cVar2 = (dz4.c) list.get(i);
            long j2 = cVar2.x;
            if (j2 > j || !cVar2.E) {
                if (j2 > j) {
                    break;
                }
            } else {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    @Override // defpackage.bq6
    public final up6 c(bq6.b bVar, ki kiVar, long j) {
        jq6.a aVar = new jq6.a(this.c.c, 0, bVar);
        j83.a aVar2 = new j83.a(this.d.c, 0, bVar);
        yua yuaVar = this.r;
        x38 x38Var = this.g;
        x38Var.getClass();
        return new cz4(this.h, this.o, this.i, yuaVar, this.k, aVar2, this.l, aVar, kiVar, this.j, this.m, this.n, x38Var);
    }

    @Override // defpackage.bq6
    public final synchronized co6 h() {
        return this.s;
    }

    @Override // defpackage.bq6
    public final void j() throws IOException {
        pr2 pr2Var = this.o;
        yb6 yb6Var = pr2Var.z;
        if (yb6Var != null) {
            IOException iOException = yb6Var.c;
            if (iOException != null) {
                throw iOException;
            }
            yb6.c<? extends yb6.d> cVar = yb6Var.b;
            if (cVar != null) {
                int i = cVar.t;
                IOException iOException2 = cVar.x;
                if (iOException2 != null && cVar.y > i) {
                    throw iOException2;
                }
            }
        }
        ut7 ut7Var = pr2Var.D;
        if (ut7Var != null) {
            throw ut7Var;
        }
        Uri uri = pr2Var.I;
        if (uri != null) {
            pr2Var.f(uri);
        }
    }

    @Override // defpackage.bq6
    public final synchronized void m(co6 co6Var) {
        this.s = co6Var;
    }

    @Override // defpackage.bq6
    public final void n(up6 up6Var) {
        cz4 cz4Var = (cz4) up6Var;
        cz4Var.u.i(cz4Var);
        for (pz4 pz4Var : cz4Var.M) {
            if (pz4Var.W) {
                for (pz4.b bVar : pz4Var.O) {
                    bVar.j();
                    i83 i83Var = bVar.h;
                    if (i83Var != null) {
                        i83Var.c(bVar.e);
                        bVar.h = null;
                        bVar.g = null;
                    }
                }
            }
            wy4 wy4Var = pz4Var.w;
            wy4Var.g.e(wy4Var.e[wy4Var.r.q()].c());
            wy4Var.n = null;
            pz4Var.C.c(pz4Var);
            pz4Var.K.removeCallbacksAndMessages(null);
            pz4Var.a0 = true;
            pz4Var.L.clear();
        }
        cz4Var.J = null;
    }

    @Override // defpackage.qk0
    public final void r(yua yuaVar) {
        this.r = yuaVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        x38 x38Var = this.g;
        x38Var.getClass();
        k83 k83Var = this.k;
        k83Var.f(looperMyLooper, x38Var);
        k83Var.d();
        jq6.a aVar = new jq6.a(this.c.c, 0, null);
        co6.f fVar = h().b;
        fVar.getClass();
        Uri uri = fVar.a;
        pr2 pr2Var = this.o;
        pr2Var.getClass();
        pr2Var.A = n6b.p(null);
        pr2Var.y = aVar;
        pr2Var.B = this;
        Map map = Collections.EMPTY_MAP;
        xl7.n(uri, "The uri must be set.");
        vt7 vt7Var = new vt7(pr2Var.t.a.a(), new of2(uri, 1, null, map, 0L, -1L, 1), pr2Var.u.b());
        xl7.r(pr2Var.z == null);
        yb6 yb6Var = new yb6("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        pr2Var.z = yb6Var;
        yb6Var.d(vt7Var, pr2Var, pr2Var.v.c(vt7Var.c));
    }

    @Override // defpackage.qk0
    public final void t() {
        pr2 pr2Var = this.o;
        pr2Var.I = null;
        pr2Var.J = null;
        pr2Var.C = null;
        pr2Var.E = null;
        pr2Var.F = null;
        pr2Var.G = null;
        pr2Var.H = null;
        pr2Var.D = null;
        pr2Var.L = -9223372036854775807L;
        pr2Var.z.c(null);
        pr2Var.z = null;
        HashMap<Uri, pr2.c> map = pr2Var.w;
        Iterator<pr2.c> it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = it.next().b.values().iterator();
            while (it2.hasNext()) {
                ((pr2.b) it2.next()).v.c(null);
            }
        }
        pr2Var.A.removeCallbacksAndMessages(null);
        pr2Var.A = null;
        map.clear();
        this.k.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(dz4 dz4Var) {
        long j;
        dq9 dq9Var;
        long jN;
        long j2;
        long jN2;
        long j3;
        boolean z = dz4Var.p;
        boolean z2 = dz4Var.g;
        k95 k95Var = dz4Var.r;
        long j4 = dz4Var.u;
        long jN3 = dz4Var.e;
        int i = dz4Var.d;
        long j5 = dz4Var.h;
        long jZ = z ? n6b.Z(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jZ : -9223372036854775807L;
        pr2 pr2Var = this.o;
        pr2Var.C.getClass();
        p84 p84Var = new p84();
        long j7 = 0;
        if (pr2Var.K) {
            dz4.g gVar = dz4Var.v;
            long j8 = j5 - pr2Var.L;
            boolean z3 = dz4Var.o;
            long j9 = z3 ? j8 + j4 : -9223372036854775807L;
            if (dz4Var.p) {
                String str = n6b.a;
                long j10 = this.p;
                jN = n6b.N(j10 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10) - (j5 + j4);
            } else {
                jN = 0;
            }
            long j11 = this.q.a;
            if (j11 != -9223372036854775807L) {
                jN2 = n6b.N(j11);
            } else {
                if (jN3 != -9223372036854775807L) {
                    j2 = j4 - jN3;
                } else {
                    j2 = gVar.d;
                    if (j2 == -9223372036854775807L || dz4Var.n == -9223372036854775807L) {
                        j2 = gVar.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * dz4Var.m;
                        }
                    }
                }
                jN2 = j2 + jN;
            }
            long j12 = j4 + jN;
            long j13 = n6b.j(jN2, jN, j12);
            co6.e eVar = h().c;
            boolean z4 = eVar.d == -3.4028235E38f && eVar.e == -3.4028235E38f && gVar.c == -9223372036854775807L && gVar.d == -9223372036854775807L;
            co6.e.a aVarA = this.q.a();
            aVarA.a = n6b.Z(j13);
            aVarA.d = z4 ? 1.0f : this.q.d;
            aVarA.e = z4 ? 1.0f : this.q.e;
            co6.e eVar2 = new co6.e(aVarA);
            this.q = eVar2;
            if (jN3 == -9223372036854775807L) {
                jN3 = j12 - n6b.N(eVar2.a);
            }
            if (z2) {
                j7 = jN3;
            } else {
                dz4.c cVarU = u(jN3, dz4Var.s);
                if (cVarU != null) {
                    j3 = cVarU.x;
                } else if (!k95Var.isEmpty()) {
                    dz4.e eVar3 = (dz4.e) k95Var.get(n6b.d(k95Var, true, Long.valueOf(jN3)));
                    dz4.c cVarU2 = u(jN3, eVar3.F);
                    j3 = cVarU2 != null ? cVarU2.x : eVar3.x;
                }
                j7 = j3;
            }
            dq9Var = new dq9(j6, jZ, j9, dz4Var.u, j8, j7, true, !z3, i == 2 && dz4Var.f, p84Var, h(), this.q);
        } else {
            if (jN3 == -9223372036854775807L || k95Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jN3 != j4) {
                    jN3 = ((dz4.e) k95Var.get(n6b.d(k95Var, true, Long.valueOf(jN3)))).x;
                }
                j = jN3;
            }
            long j14 = dz4Var.u;
            dq9Var = new dq9(j6, jZ, j14, j14, 0L, j, true, false, true, p84Var, h(), null);
        }
        s(dq9Var);
    }
}
