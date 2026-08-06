package defpackage;

import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hi1 {
    public static final y0a a = new y0a(new kt0(1));
    public static final y0a b = new y0a(new lt0(1));

    public static final long a(fi1 fi1Var, long j) {
        long j2 = fi1Var.a;
        long j3 = fi1Var.U;
        long j4 = fi1Var.Q;
        long j5 = fi1Var.M;
        long j6 = fi1Var.q;
        if (uh1.c(j, j2)) {
            return fi1Var.b;
        }
        if (uh1.c(j, fi1Var.f)) {
            return fi1Var.g;
        }
        if (uh1.c(j, fi1Var.j)) {
            return fi1Var.k;
        }
        if (uh1.c(j, fi1Var.n)) {
            return fi1Var.o;
        }
        if (uh1.c(j, fi1Var.w)) {
            return fi1Var.x;
        }
        if (uh1.c(j, fi1Var.c)) {
            return fi1Var.d;
        }
        if (uh1.c(j, fi1Var.h)) {
            return fi1Var.i;
        }
        if (uh1.c(j, fi1Var.l)) {
            return fi1Var.m;
        }
        if (uh1.c(j, fi1Var.y)) {
            return fi1Var.z;
        }
        if (uh1.c(j, fi1Var.u)) {
            return fi1Var.v;
        }
        if (uh1.c(j, fi1Var.p)) {
            return j6;
        }
        if (uh1.c(j, fi1Var.r)) {
            return fi1Var.s;
        }
        if (uh1.c(j, fi1Var.D) || uh1.c(j, fi1Var.F) || uh1.c(j, fi1Var.G) || uh1.c(j, fi1Var.H) || uh1.c(j, fi1Var.I) || uh1.c(j, fi1Var.J) || uh1.c(j, fi1Var.E)) {
            return j6;
        }
        if (uh1.c(j, fi1Var.K) || uh1.c(j, fi1Var.L)) {
            return j5;
        }
        if (uh1.c(j, fi1Var.O) || uh1.c(j, fi1Var.P)) {
            return j4;
        }
        if (uh1.c(j, fi1Var.S) || uh1.c(j, fi1Var.T)) {
            return j3;
        }
        int i = uh1.l;
        return uh1.k;
    }

    public static final long b(long j, jt1 jt1Var) {
        jt1Var.K(89374938);
        long jA = a((fi1) jt1Var.F(a), j);
        if (jA == 16) {
            jA = ((uh1) jt1Var.F(zy1.a)).a;
        }
        jt1Var.B();
        return jA;
    }

    public static final long c(fi1 fi1Var, gi1 gi1Var) {
        switch (gi1Var.ordinal()) {
            case 0:
                return fi1Var.n;
            case 1:
                return fi1Var.w;
            case 2:
                return fi1Var.y;
            case 3:
                return fi1Var.v;
            case 4:
                return fi1Var.e;
            case 5:
                return fi1Var.u;
            case 6:
                return fi1Var.o;
            case 7:
                return fi1Var.x;
            case 8:
                return fi1Var.z;
            case 9:
                return fi1Var.b;
            case 10:
                return fi1Var.d;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return fi1Var.M;
            case 12:
                return fi1Var.N;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return fi1Var.g;
            case 14:
                return fi1Var.i;
            case h4c.e /* 15 */:
                return fi1Var.Q;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                return fi1Var.R;
            case 17:
                return fi1Var.q;
            case 18:
                return fi1Var.s;
            case 19:
                return fi1Var.k;
            case InboxPagingSource.PAGE_SIZE /* 20 */:
                return fi1Var.m;
            case 21:
                return fi1Var.U;
            case 22:
                return fi1Var.V;
            case 23:
                return fi1Var.A;
            case 24:
                return fi1Var.B;
            case 25:
                return fi1Var.a;
            case 26:
                return fi1Var.c;
            case 27:
                return fi1Var.K;
            case 28:
                return fi1Var.L;
            case 29:
                return fi1Var.C;
            case 30:
                return fi1Var.f;
            case 31:
                return fi1Var.h;
            case 32:
                return fi1Var.O;
            case 33:
                return fi1Var.P;
            case 34:
                return fi1Var.p;
            case 35:
                return fi1Var.D;
            case 36:
                return fi1Var.F;
            case 37:
                return fi1Var.G;
            case 38:
                return fi1Var.H;
            case 39:
                return fi1Var.I;
            case 40:
                return fi1Var.J;
            case 41:
                return fi1Var.E;
            case 42:
                return fi1Var.t;
            case 43:
                return fi1Var.r;
            case Carousel.ENTITY_TYPE /* 44 */:
                return fi1Var.j;
            case 45:
                return fi1Var.l;
            case 46:
                return fi1Var.S;
            case 47:
                return fi1Var.T;
            default:
                u.b();
                return 0L;
        }
    }

    public static final long d(gi1 gi1Var, jt1 jt1Var) {
        return c((fi1) jt1Var.F(a), gi1Var);
    }

    public static fi1 e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i) {
        long j11 = (i & 1) != 0 ? yh1.z : j;
        return new fi1(j11, (i & 2) != 0 ? yh1.j : j2, yh1.A, yh1.k, yh1.e, yh1.E, yh1.n, yh1.F, yh1.o, yh1.R, yh1.t, yh1.S, yh1.u, (i & 8192) != 0 ? yh1.a : j3, (i & 16384) != 0 ? yh1.g : j4, (32768 & i) != 0 ? yh1.I : j5, (65536 & i) != 0 ? yh1.r : j6, (131072 & i) != 0 ? yh1.Q : j7, (262144 & i) != 0 ? yh1.s : j8, (524288 & i) != 0 ? j11 : j9, yh1.f, yh1.d, (i & 4194304) != 0 ? yh1.b : j10, yh1.h, yh1.c, yh1.i, yh1.x, yh1.y, yh1.D, yh1.J, yh1.P, yh1.K, yh1.L, yh1.M, yh1.N, yh1.O, yh1.B, yh1.C, yh1.l, yh1.m, yh1.G, yh1.H, yh1.p, yh1.q, yh1.T, yh1.U, yh1.v, yh1.w);
    }
}
