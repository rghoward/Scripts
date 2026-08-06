package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ge8 implements up6, ls3, yb6.a<b>, yb6.e, vz8.c {
    public static final Map<String, String> k0;
    public static final id4 l0;
    public final ki A;
    public final long B;
    public final id4 C;
    public final long D;
    public final yb6 E;
    public final wy0 F;
    public final bv1 G;
    public final za7 H;
    public final de8 I;
    public final Handler J;
    public up6.a K;
    public r65 L;
    public a[] M;
    public vz8[] N;
    public d[] O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public e T;
    public t89 U;
    public long V;
    public boolean W;
    public int X;
    public final long Y = Long.MIN_VALUE;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public boolean d0;
    public long e0;
    public long f0;
    public boolean g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public final Uri t;
    public final if2 u;
    public final k83 v;
    public final qb6 w;
    public final jq6.a x;
    public final j83.a y;
    public final he8 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends wd4 {
        public final vz8 b;
        public final g13 c;
        public final AtomicReference<EnumC0095a> d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: ge8$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class EnumC0095a {
            public static final EnumC0095a t;
            public static final EnumC0095a u;
            public static final EnumC0095a v;
            public static final /* synthetic */ EnumC0095a[] w;

            static {
                EnumC0095a enumC0095a = new EnumC0095a("PASS_THROUGH", 0);
                t = enumC0095a;
                EnumC0095a enumC0095a2 = new EnumC0095a("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
                u = enumC0095a2;
                EnumC0095a enumC0095a3 = new EnumC0095a("DISCARDING", 2);
                v = enumC0095a3;
                w = new EnumC0095a[]{enumC0095a, enumC0095a2, enumC0095a3};
            }

            public EnumC0095a() {
                throw null;
            }

            public static EnumC0095a valueOf(String str) {
                return (EnumC0095a) Enum.valueOf(EnumC0095a.class, str);
            }

            public static EnumC0095a[] values() {
                return (EnumC0095a[]) w.clone();
            }
        }

        public a(vz8 vz8Var) {
            super(vz8Var);
            this.b = vz8Var;
            this.c = new g13();
            this.d = new AtomicReference<>(EnumC0095a.t);
        }

        @Override // defpackage.hsa
        public final void a(long j, int i, int i2, int i3, hsa.a aVar) {
            h().a(j, i, i2, i3, aVar);
            AtomicReference<EnumC0095a> atomicReference = this.d;
            if (atomicReference.get() == EnumC0095a.u) {
                this.b.y(false);
                atomicReference.set(EnumC0095a.v);
            }
        }

        @Override // defpackage.hsa
        public final void b(pt7 pt7Var, int i, int i2) {
            h().b(pt7Var, i, i2);
        }

        @Override // defpackage.hsa
        public final int c(ef2 ef2Var, int i, boolean z) {
            return h().c(ef2Var, i, z);
        }

        @Override // defpackage.hsa
        public final void e(int i, pt7 pt7Var) {
            h().e(i, pt7Var);
        }

        @Override // defpackage.hsa
        public final int f(ef2 ef2Var, int i, boolean z) {
            return h().f(ef2Var, i, z);
        }

        public final hsa h() {
            return this.d.get() == EnumC0095a.v ? this.c : this.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements yb6.d {
        public final Uri a;
        public final c1a b;
        public final ce8 c;
        public final ge8 d;
        public final bv1 e;
        public volatile boolean g;
        public long i;
        public of2 j;
        public hsa k;
        public boolean l;
        public final o68 f = new o68();
        public boolean h = true;

        public b(Uri uri, if2 if2Var, wy0 wy0Var, ge8 ge8Var, bv1 bv1Var) {
            this.a = uri;
            this.b = new c1a(if2Var);
            this.c = wy0Var;
            this.d = ge8Var;
            this.e = bv1Var;
            rb6.c.getAndIncrement();
            this.j = c(0L, null);
        }

        @Override // yb6.d
        public final void a() {
            if2 p65Var;
            js3 js3Var;
            int i;
            int iC = 0;
            String str = null;
            while (iC == 0 && !this.g) {
                try {
                    long j = this.f.a;
                    of2 of2VarC = c(j, str);
                    this.j = of2VarC;
                    long jC = this.b.c(of2VarC);
                    if (this.g) {
                        if (iC != 1 && ((wy0) this.c).a() != -1) {
                            this.f.a = ((wy0) this.c).a();
                        }
                        nf2.a(this.b);
                        return;
                    }
                    List<String> list = this.b.a.k().get("ETag");
                    str = (list == null || list.isEmpty()) ? null : list.get(0);
                    if (jC != -1) {
                        jC += j;
                        ge8 ge8Var = ge8.this;
                        ge8Var.J.post(new ya7(1, ge8Var));
                    }
                    long j2 = jC;
                    ge8.this.L = r65.d(this.b.a.k());
                    c1a c1aVar = this.b;
                    r65 r65Var = ge8.this.L;
                    if (r65Var == null || (i = r65Var.f) == -1) {
                        p65Var = c1aVar;
                    } else {
                        p65Var = new p65(c1aVar, i, this);
                        hsa hsaVarD = ge8.this.D(new d(0, true));
                        this.k = hsaVarD;
                        hsaVarD.g(ge8.l0);
                    }
                    ((wy0) this.c).b(p65Var, this.a, this.b.a.k(), j, j2, this.d);
                    if (ge8.this.L != null && (js3Var = ((wy0) this.c).b) != null) {
                        js3 js3VarB = js3Var.b();
                        if (js3VarB instanceof pz6) {
                            ((pz6) js3VarB).s = true;
                        }
                    }
                    if (this.h) {
                        ce8 ce8Var = this.c;
                        long j3 = this.i;
                        js3 js3Var2 = ((wy0) ce8Var).b;
                        js3Var2.getClass();
                        js3Var2.e(j, j3);
                        this.h = false;
                    }
                    while (iC == 0 && !this.g) {
                        try {
                            bv1 bv1Var = this.e;
                            synchronized (bv1Var) {
                                while (!bv1Var.b) {
                                    try {
                                        bv1Var.a.getClass();
                                        bv1Var.wait();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            ce8 ce8Var2 = this.c;
                            o68 o68Var = this.f;
                            wy0 wy0Var = (wy0) ce8Var2;
                            js3 js3Var3 = wy0Var.b;
                            js3Var3.getClass();
                            zq2 zq2Var = wy0Var.c;
                            zq2Var.getClass();
                            iC = js3Var3.c(zq2Var, o68Var);
                            long jA = ((wy0) this.c).a();
                            if (jA > ge8.this.B + j) {
                                bv1 bv1Var2 = this.e;
                                synchronized (bv1Var2) {
                                    bv1Var2.b = false;
                                }
                                ge8 ge8Var2 = ge8.this;
                                ge8Var2.J.post(ge8Var2.I);
                                j = jA;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iC == 1) {
                        iC = 0;
                    } else if (((wy0) this.c).a() != -1) {
                        this.f.a = ((wy0) this.c).a();
                    }
                    nf2.a(this.b);
                } catch (Throwable th2) {
                    if (iC != 1 && ((wy0) this.c).a() != -1) {
                        this.f.a = ((wy0) this.c).a();
                    }
                    nf2.a(this.b);
                    throw th2;
                }
            }
        }

        @Override // yb6.d
        public final void b() {
            this.g = true;
        }

        public final of2 c(long j, String str) {
            Map mapA = ge8.k0;
            if (str != null && !str.startsWith("W/")) {
                m95.a aVarA = m95.a();
                aVarA.c(mapA.entrySet());
                aVarA.b("If-Range", str);
                mapA = aVarA.a(false);
            }
            Map map = Collections.EMPTY_MAP;
            Uri uri = this.a;
            xl7.n(uri, "The uri must be set.");
            return new of2(uri, 1, null, mapA, j, -1L, 6);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c implements xz8 {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        @Override // defpackage.xz8
        public final void a() throws IOException {
            int i = this.a;
            ge8 ge8Var = ge8.this;
            vz8 vz8Var = ge8Var.N[i];
            i83 i83Var = vz8Var.h;
            if (i83Var != null && i83Var.getState() == 1) {
                i83.a aVarF = vz8Var.h.f();
                aVarF.getClass();
                throw aVarF;
            }
            yb6 yb6Var = ge8Var.E;
            int iC = ge8Var.w.c(ge8Var.X);
            IOException iOException = yb6Var.c;
            if (iOException != null) {
                throw iOException;
            }
            yb6.c<? extends yb6.d> cVar = yb6Var.b;
            if (cVar != null) {
                if (iC == Integer.MIN_VALUE) {
                    iC = cVar.t;
                }
                IOException iOException2 = cVar.x;
                if (iOException2 != null && cVar.y > iC) {
                    throw iOException2;
                }
            }
        }

        @Override // defpackage.xz8
        public final boolean b() {
            ge8 ge8Var = ge8.this;
            return !ge8Var.G() && ge8Var.N[this.a].t(ge8Var.i0);
        }

        @Override // defpackage.xz8
        public final int c(long j) throws Throwable {
            ge8 ge8Var = ge8.this;
            if (ge8Var.G()) {
                return 0;
            }
            int i = this.a;
            ge8Var.B(i);
            vz8 vz8Var = ge8Var.N[i];
            int iR = vz8Var.r(j, ge8Var.i0);
            vz8Var.C(iR);
            if (iR == 0) {
                ge8Var.C(i);
            }
            return iR;
        }

        @Override // defpackage.xz8
        public final int d(jd4 jd4Var, nn2 nn2Var, int i) {
            ge8 ge8Var = ge8.this;
            if (ge8Var.G()) {
                return -3;
            }
            int i2 = this.a;
            ge8Var.B(i2);
            int iX = ge8Var.N[i2].x(jd4Var, nn2Var, i, ge8Var.i0);
            if (iX == -3) {
                ge8Var.C(i2);
            }
            return iX;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final int a;
        public final boolean b;

        public d(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public final gsa a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public e(gsa gsaVar, boolean[] zArr) {
            this.a = gsaVar;
            this.b = zArr;
            int i = gsaVar.a;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        k0 = Collections.unmodifiableMap(map);
        id4.a aVar = new id4.a();
        aVar.a = "icy";
        aVar.n = fv6.n("application/x-icy");
        l0 = new id4(aVar);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [de8] */
    public ge8(Uri uri, if2 if2Var, wy0 wy0Var, k83 k83Var, j83.a aVar, qb6 qb6Var, jq6.a aVar2, he8 he8Var, ki kiVar, int i, id4 id4Var, long j, em8 em8Var) {
        this.t = uri;
        this.u = if2Var;
        this.v = k83Var;
        this.y = aVar;
        this.w = qb6Var;
        this.x = aVar2;
        this.z = he8Var;
        this.A = kiVar;
        this.B = i;
        this.C = id4Var;
        this.E = em8Var != null ? new yb6(em8Var) : new yb6("ProgressiveMediaPeriod");
        this.F = wy0Var;
        this.D = j;
        this.G = new bv1();
        this.H = new za7(1, this);
        this.I = new Runnable() { // from class: de8
            @Override // java.lang.Runnable
            public final void run() {
                ge8 ge8Var = this.t;
                if (ge8Var.j0) {
                    return;
                }
                up6.a aVar3 = ge8Var.K;
                aVar3.getClass();
                aVar3.b(ge8Var);
            }
        };
        this.J = n6b.p(null);
        this.O = new d[0];
        this.N = new vz8[0];
        this.M = new a[0];
        this.f0 = -9223372036854775807L;
        this.X = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        su6 su6VarA;
        char c2;
        long j = this.D;
        if (this.j0 || this.Q || !this.P || this.U == null) {
            return;
        }
        char c3 = 0;
        for (vz8 vz8Var : this.N) {
            if (vz8Var.s() == null) {
                return;
            }
        }
        bv1 bv1Var = this.G;
        synchronized (bv1Var) {
            bv1Var.b = false;
        }
        int length = this.N.length;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c4 = 1;
            if (i2 >= length) {
                break;
            }
            id4 id4VarS = this.N[i2].s();
            id4VarS.getClass();
            int iH = fv6.h(id4VarS.o);
            if (iH == 1) {
                c2 = 3;
            } else if (iH == 2) {
                c2 = 4;
            } else if (iH != 3) {
                c2 = iH != 4 ? (char) 0 : (char) 2;
            } else {
                c2 = 1;
            }
            if (i == 1) {
                c4 = 3;
            } else if (i == 2) {
                c4 = 4;
            } else if (i != 3) {
                c4 = i != 4 ? (char) 0 : (char) 2;
            }
            if (c2 > c4) {
                i3 = i2;
                i = iH;
            }
            i2++;
        }
        esa[] esaVarArr = new esa[length];
        boolean[] zArr = new boolean[length];
        int i4 = 0;
        while (i4 < length) {
            id4 id4VarS2 = this.N[i4].s();
            id4VarS2.getClass();
            String str = id4VarS2.o;
            boolean zI = fv6.i(str);
            boolean z = (zI || fv6.m(str)) ? true : c3;
            zArr[i4] = z;
            char c5 = c3;
            this.R = (this.R ? 1 : 0) | (z ? 1 : 0);
            this.S = (j != -9223372036854775807L && length == 1 && fv6.k(str)) ? 1 : c5;
            r65 r65Var = this.L;
            if (r65Var != null) {
                int i5 = r65Var.a;
                if (zI || this.O[i4].b) {
                    su6 su6Var = id4VarS2.l;
                    if (su6Var == null) {
                        su6.a[] aVarArr = new su6.a[1];
                        aVarArr[c5] = r65Var;
                        su6VarA = new su6(aVarArr);
                    } else {
                        su6.a[] aVarArr2 = new su6.a[1];
                        aVarArr2[c5] = r65Var;
                        su6VarA = su6Var.a(aVarArr2);
                    }
                    id4.a aVarA = id4VarS2.a();
                    aVarA.k = su6VarA;
                    id4VarS2 = new id4(aVarA);
                }
                if (zI && id4VarS2.h == -1 && id4VarS2.i == -1 && i5 != -1) {
                    id4.a aVarA2 = id4VarS2.a();
                    aVarA2.h = i5;
                    id4VarS2 = new id4(aVarA2);
                }
            }
            int iG = this.v.g(id4VarS2);
            id4.a aVarA3 = id4VarS2.a();
            aVarA3.O = iG;
            id4 id4Var = new id4(aVarA3);
            if (i4 != i3) {
                id4.a aVarA4 = id4Var.a();
                aVarA4.l = Integer.toString(i3);
                id4Var = new id4(aVarA4);
            }
            esaVarArr[i4] = new esa(Integer.toString(i4), id4Var);
            this.b0 = id4Var.u | this.b0;
            this.N[i4].B(this.Y);
            i4++;
            c3 = c5;
        }
        this.T = new e(new gsa(esaVarArr), zArr);
        if (this.S && this.V == -9223372036854775807L) {
            this.V = j;
            this.U = new fe8(this, this.U);
        }
        this.z.v(this.V, this.U, this.W);
        this.Q = true;
        up6.a aVar = this.K;
        aVar.getClass();
        aVar.a(this);
    }

    public final void B(int i) {
        w();
        e eVar = this.T;
        boolean[] zArr = eVar.d;
        if (zArr[i]) {
            return;
        }
        id4 id4Var = eVar.a.a(i).d[0];
        mp6 mp6Var = new mp6(1, fv6.h(id4Var.o), id4Var, 0, null, n6b.Z(this.e0), -9223372036854775807L);
        jq6.a aVar = this.x;
        aVar.a(new cq6(aVar, mp6Var));
        zArr[i] = true;
    }

    public final void C(int i) {
        w();
        if (this.g0) {
            if ((!this.R || this.T.b[i]) && !this.N[i].t(false)) {
                this.f0 = 0L;
                this.g0 = false;
                this.a0 = true;
                this.e0 = 0L;
                this.h0 = 0;
                for (vz8 vz8Var : this.N) {
                    vz8Var.y(false);
                }
                up6.a aVar = this.K;
                aVar.getClass();
                aVar.b(this);
            }
        }
    }

    public final hsa D(d dVar) {
        int length = this.N.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.O[i])) {
                return this.N[i];
            }
        }
        if (this.P) {
            md6.g("ProgressiveMediaPeriod", "Extractor added new track (id=" + dVar.a + ") after finishing tracks.");
            return new g13();
        }
        k83 k83Var = this.v;
        k83Var.getClass();
        vz8 vz8Var = new vz8(this.A, k83Var, this.y);
        a aVar = new a(vz8Var);
        vz8Var.f = this;
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.O, i2);
        dVarArr[length] = dVar;
        this.O = dVarArr;
        vz8[] vz8VarArr = (vz8[]) Arrays.copyOf(this.N, i2);
        vz8VarArr[length] = vz8Var;
        this.N = vz8VarArr;
        a[] aVarArr = (a[]) Arrays.copyOf(this.M, i2);
        aVarArr[length] = aVar;
        this.M = aVarArr;
        return aVar;
    }

    public final void E(t89 t89Var) {
        this.U = this.L == null ? t89Var : new t89.b(-9223372036854775807L);
        this.V = t89Var.g();
        boolean z = !this.d0 && t89Var.g() == -9223372036854775807L;
        this.W = z;
        this.X = z ? 7 : 1;
        if (this.Q) {
            this.z.v(this.V, t89Var, z);
        } else {
            A();
        }
    }

    public final void F() {
        b bVar = new b(this.t, this.u, this.F, this, this.G);
        if (this.Q) {
            xl7.r(z());
            long j = this.Y;
            if (j == Long.MIN_VALUE) {
                j = this.V;
            }
            if (j != -9223372036854775807L && this.f0 > j) {
                this.i0 = true;
                this.f0 = -9223372036854775807L;
                return;
            }
            t89 t89Var = this.U;
            t89Var.getClass();
            long j2 = t89Var.e(this.f0).a.b;
            long j3 = this.f0;
            bVar.f.a = j2;
            bVar.i = j3;
            bVar.h = true;
            bVar.l = false;
            for (vz8 vz8Var : this.N) {
                vz8Var.t = this.f0;
            }
            this.f0 = -9223372036854775807L;
        }
        this.h0 = x();
        this.E.d(bVar, this, this.w.c(this.X));
    }

    public final boolean G() {
        return this.a0 || z();
    }

    @Override // yb6.e
    public final void a() {
        for (vz8 vz8Var : this.N) {
            vz8Var.y(true);
            i83 i83Var = vz8Var.h;
            if (i83Var != null) {
                i83Var.c(vz8Var.e);
                vz8Var.h = null;
                vz8Var.g = null;
            }
        }
        wy0 wy0Var = this.F;
        js3 js3Var = wy0Var.b;
        if (js3Var != null) {
            js3Var.a();
            wy0Var.b = null;
        }
        wy0Var.c = null;
    }

    @Override // yb6.a
    public final void b(yb6.d dVar, long j, long j2, boolean z) {
        b bVar = (b) dVar;
        c1a c1aVar = bVar.b;
        rb6 rb6Var = new rb6(bVar.j, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
        this.w.getClass();
        this.x.b(rb6Var, 1, -1, null, 0, null, bVar.i, this.V);
        if (z) {
            return;
        }
        for (vz8 vz8Var : this.N) {
            vz8Var.y(false);
        }
        if (this.c0 > 0) {
            up6.a aVar = this.K;
            aVar.getClass();
            aVar.b(this);
        }
    }

    @Override // defpackage.bd9
    public final boolean c(g gVar) {
        if (this.i0) {
            return false;
        }
        yb6 yb6Var = this.E;
        if (yb6Var.c != null || this.g0) {
            return false;
        }
        if ((this.Q || this.C != null) && this.c0 == 0) {
            return false;
        }
        boolean zC = this.G.c();
        if (yb6Var.b()) {
            return zC;
        }
        F();
        return true;
    }

    @Override // defpackage.up6
    public final long d(fq3[] fq3VarArr, boolean[] zArr, xz8[] xz8VarArr, boolean[] zArr2, long j) {
        fq3 fq3Var;
        w();
        e eVar = this.T;
        gsa gsaVar = eVar.a;
        boolean[] zArr3 = eVar.c;
        int i = this.c0;
        int i2 = 0;
        for (int i3 = 0; i3 < fq3VarArr.length; i3++) {
            xz8 xz8Var = xz8VarArr[i3];
            if (xz8Var != null && (fq3VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((c) xz8Var).a;
                xl7.r(zArr3[i4]);
                this.c0--;
                zArr3[i4] = false;
                xz8VarArr[i3] = null;
            }
        }
        boolean z = !this.Z ? j == 0 || this.S : i != 0;
        for (int i5 = 0; i5 < fq3VarArr.length; i5++) {
            if (xz8VarArr[i5] == null && (fq3Var = fq3VarArr[i5]) != null) {
                xl7.r(fq3Var.length() == 1);
                xl7.r(fq3Var.c(0) == 0);
                int iB = gsaVar.b(fq3Var.a());
                xl7.r(!zArr3[iB]);
                this.c0++;
                zArr3[iB] = true;
                this.b0 = fq3Var.r().u | this.b0;
                xz8VarArr[i5] = new c(iB);
                zArr2[i5] = true;
                if (!z) {
                    vz8 vz8Var = this.N[iB];
                    z = (vz8Var.p() == 0 || vz8Var.A(j, true)) ? false : true;
                }
            }
        }
        if (this.c0 == 0) {
            this.g0 = false;
            this.a0 = false;
            this.b0 = false;
            yb6 yb6Var = this.E;
            if (yb6Var.b()) {
                vz8[] vz8VarArr = this.N;
                int length = vz8VarArr.length;
                while (i2 < length) {
                    vz8VarArr[i2].j();
                    i2++;
                }
                yb6Var.a();
            } else {
                this.i0 = false;
                for (vz8 vz8Var2 : this.N) {
                    vz8Var2.y(false);
                }
            }
        } else if (z) {
            j = i(j);
            while (i2 < xz8VarArr.length) {
                if (xz8VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.Z = true;
        return j;
    }

    @Override // defpackage.bd9
    public final long e() {
        return q();
    }

    @Override // defpackage.up6
    public final long f(long j, u89 u89Var) {
        w();
        if (!this.U.b()) {
            return 0L;
        }
        t89.a aVarE = this.U.e(j);
        return u89Var.a(j, aVarE.a.a, aVarE.b.a);
    }

    @Override // defpackage.up6
    public final void g() throws IOException {
        int iC = this.w.c(this.X);
        yb6 yb6Var = this.E;
        IOException iOException = yb6Var.c;
        if (iOException != null) {
            throw iOException;
        }
        yb6.c<? extends yb6.d> cVar = yb6Var.b;
        if (cVar != null) {
            if (iC == Integer.MIN_VALUE) {
                iC = cVar.t;
            }
            IOException iOException2 = cVar.x;
            if (iOException2 != null && cVar.y > iC) {
                throw iOException2;
            }
        }
        if (this.i0 && !this.Q) {
            throw ut7.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // yb6.a
    public final void h(yb6.d dVar, long j, long j2) {
        b bVar = (b) dVar;
        if (this.V == -9223372036854775807L && this.U != null) {
            long jY = y(true);
            long j3 = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.V = j3;
            this.z.v(j3, this.U, this.W);
        }
        c1a c1aVar = bVar.b;
        rb6 rb6Var = new rb6(bVar.j, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
        this.w.getClass();
        this.x.c(rb6Var, 1, -1, null, 0, null, bVar.i, this.V);
        this.i0 = true;
        up6.a aVar = this.K;
        aVar.getClass();
        aVar.b(this);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[LOOP:1: B:42:0x008b->B:43:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2 A[LOOP:2: B:47:0x00a0->B:48:0x00a2, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0088, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0099, please report this as an issue */
    @Override // defpackage.up6
    public final long i(long j) {
        int i;
        w();
        boolean[] zArr = this.T.b;
        if (!this.U.b()) {
            j = 0;
        }
        this.a0 = false;
        boolean z = this.e0 == j;
        this.e0 = j;
        if (z()) {
            this.f0 = j;
            return j;
        }
        int i2 = this.X;
        yb6 yb6Var = this.E;
        if (i2 == 7 || !(this.i0 || yb6Var.b())) {
            this.g0 = false;
            this.f0 = j;
            this.i0 = false;
            this.b0 = false;
            if (yb6Var.b()) {
                yb6Var.c = null;
                for (vz8 vz8Var : this.N) {
                    vz8Var.y(false);
                }
                break;
            }
            for (vz8 vz8Var2 : this.N) {
                vz8Var2.j();
            }
            yb6Var.a();
            return j;
        }
        int length = this.N.length;
        for (int i3 = 0; i3 < length; i3++) {
            vz8 vz8Var3 = this.N[i3];
            if (this.M[i3].d.get() == a.EnumC0095a.t && (vz8Var3.p() != 0 || !z)) {
                if (!(this.S ? vz8Var3.z(vz8Var3.q) : vz8Var3.A(j, this.i0)) && (zArr[i3] || !this.R)) {
                    this.g0 = false;
                    this.f0 = j;
                    this.i0 = false;
                    this.b0 = false;
                    if (yb6Var.b()) {
                        yb6Var.c = null;
                        while (i < r0) {
                            vz8Var.y(false);
                        }
                        break;
                        break;
                    }
                    while (i < r0) {
                        vz8Var2.j();
                    }
                    yb6Var.a();
                    return j;
                }
            }
        }
        return j;
    }

    @Override // defpackage.bd9
    public final boolean j() {
        boolean z;
        if (this.i0 || !this.E.b()) {
            return false;
        }
        bv1 bv1Var = this.G;
        synchronized (bv1Var) {
            z = bv1Var.b;
        }
        return z;
    }

    @Override // defpackage.ls3
    public final void k() {
        this.P = true;
        this.J.post(this.H);
    }

    @Override // defpackage.up6
    public final long l() {
        if (this.b0) {
            this.b0 = false;
            return this.e0;
        }
        if (!this.a0) {
            return -9223372036854775807L;
        }
        if (!this.i0 && x() <= this.h0) {
            return -9223372036854775807L;
        }
        this.a0 = false;
        return this.e0;
    }

    @Override // defpackage.up6
    public final void m(up6.a aVar, long j) {
        this.K = aVar;
        id4 id4Var = this.C;
        if (id4Var == null) {
            this.G.c();
            F();
        } else {
            p(0, 3).g(id4Var);
            E(new qa5(-9223372036854775807L, new long[]{0}, new long[]{0}));
            k();
            this.f0 = j;
        }
    }

    @Override // defpackage.up6
    public final gsa n() {
        w();
        return this.T.a;
    }

    @Override // yb6.a
    public final void o(yb6.d dVar, long j, long j2, int i) {
        b bVar = (b) dVar;
        c1a c1aVar = bVar.b;
        this.x.e(i == 0 ? new rb6(bVar.j, j) : new rb6(bVar.j, c1aVar.c, c1aVar.d, j, j2, c1aVar.b), 1, -1, null, 0, null, bVar.i, this.V, i);
    }

    @Override // defpackage.ls3
    public final hsa p(int i, int i2) {
        return D(new d(i, false));
    }

    @Override // defpackage.bd9
    public final long q() {
        long jY;
        boolean z;
        long j;
        w();
        if (this.i0 || this.c0 == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.f0;
        }
        if (this.R) {
            int length = this.N.length;
            jY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                e eVar = this.T;
                if (eVar.b[i] && eVar.c[i]) {
                    vz8 vz8Var = this.N[i];
                    synchronized (vz8Var) {
                        z = vz8Var.y;
                    }
                    if (z) {
                        continue;
                    } else {
                        vz8 vz8Var2 = this.N[i];
                        synchronized (vz8Var2) {
                            j = vz8Var2.w;
                        }
                        jY = Math.min(jY, j);
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.e0 : jY;
    }

    @Override // vz8.c
    public final void r() {
        this.J.post(this.H);
    }

    @Override // defpackage.up6
    public final void s(long j, boolean z) throws Throwable {
        if (this.S) {
            return;
        }
        w();
        if (z()) {
            return;
        }
        boolean[] zArr = this.T.c;
        int length = this.N.length;
        for (int i = 0; i < length; i++) {
            this.N[i].i(j, z, zArr[i]);
        }
    }

    @Override // defpackage.ls3
    public final void t(final t89 t89Var) {
        this.J.post(new Runnable() { // from class: ee8
            @Override // java.lang.Runnable
            public final void run() {
                this.t.E(t89Var);
            }
        });
    }

    @Override // yb6.a
    public final yb6.b u(yb6.d dVar, long j, long j2, IOException iOException, int i) {
        yb6.b bVar;
        t89 t89Var;
        b bVar2 = (b) dVar;
        c1a c1aVar = bVar2.b;
        rb6 rb6Var = new rb6(bVar2.j, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
        n6b.Z(bVar2.i);
        n6b.Z(this.V);
        long jA = this.w.a(new qb6.c(iOException, i));
        if (jA == -9223372036854775807L) {
            bVar = yb6.f;
        } else {
            int iX = x();
            int i2 = iX > this.h0 ? 1 : 0;
            if (this.d0 || !((t89Var = this.U) == null || t89Var.g() == -9223372036854775807L)) {
                this.h0 = iX;
            } else if (!this.Q || G()) {
                this.a0 = this.Q;
                this.e0 = 0L;
                this.h0 = 0;
                for (vz8 vz8Var : this.N) {
                    vz8Var.y(false);
                }
                bVar2.f.a = 0L;
                bVar2.i = 0L;
                bVar2.h = true;
                bVar2.l = false;
            } else {
                this.g0 = true;
                bVar = yb6.e;
            }
            bVar = new yb6.b(i2, jA);
        }
        int i3 = bVar.a;
        this.x.d(rb6Var, 1, -1, null, 0, null, bVar2.i, this.V, iOException, !(i3 == 0 || i3 == 1));
        return bVar;
    }

    @Override // defpackage.bd9
    public final void v(long j) {
        boolean z;
        if (this.c0 <= 0 || z()) {
            return;
        }
        boolean z2 = false;
        if (this.Y != Long.MIN_VALUE) {
            w();
            int i = 0;
            boolean z3 = true;
            while (true) {
                vz8[] vz8VarArr = this.N;
                if (i >= vz8VarArr.length) {
                    break;
                }
                e eVar = this.T;
                if (eVar.c[i] && (eVar.b[i] || !this.R)) {
                    vz8 vz8Var = vz8VarArr[i];
                    synchronized (vz8Var) {
                        z = vz8Var.x != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.i0 = true;
        }
    }

    public final void w() {
        xl7.r(this.Q);
        this.T.getClass();
        this.U.getClass();
    }

    public final int x() {
        int i = 0;
        for (vz8 vz8Var : this.N) {
            i += vz8Var.q + vz8Var.p;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final long y(boolean z) {
        vz8 vz8Var;
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.N.length; i++) {
            if (z) {
                vz8Var = this.N[i];
                synchronized (vz8Var) {
                    jMax = Math.max(jMax, vz8Var.w);
                }
            } else {
                e eVar = this.T;
                eVar.getClass();
                if (eVar.c[i]) {
                    vz8Var = this.N[i];
                    synchronized (vz8Var) {
                    }
                    jMax = Math.max(jMax, vz8Var.w);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    public final boolean z() {
        return this.f0 != -9223372036854775807L;
    }
}
