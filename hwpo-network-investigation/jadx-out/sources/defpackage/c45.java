package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import okhttp3.internal.platform.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c45 implements Closeable {
    public static final ok9 S;
    public final y9a A;
    public final y9a B;
    public final y9a C;
    public final gg3 D;
    public long E;
    public long F;
    public long G;
    public long H;
    public final t54 I;
    public final ok9 J;
    public ok9 K;
    public final kmb L;
    public long M;
    public long N;
    public final gy0 O;
    public final j45 P;
    public final c Q;
    public final LinkedHashSet R;
    public final b t;
    public final LinkedHashMap u = new LinkedHashMap();
    public final String v;
    public int w;
    public int x;
    public boolean y;
    public final z9a z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final z9a a;
        public gy0 b;
        public String c;
        public b d;
        public final gg3 e;
        public t54 f;

        public a(z9a z9aVar) {
            z9aVar.getClass();
            this.a = z9aVar;
            this.d = b.a;
            this.e = gg3.b;
            this.f = t54.a.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b {
        public static final a a = new a();

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends b {
            @Override // c45.b
            public final void c(i45 i45Var) {
                i45Var.e(ul3.REFUSED_STREAM, null);
            }
        }

        public void b(c45 c45Var, ok9 ok9Var) {
            ok9Var.getClass();
        }

        public abstract void c(i45 i45Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c implements mh4<g2b> {
        public final h45 t;

        public c(h45 h45Var) {
            this.t = h45Var;
        }

        public final void c(final boolean z, final int i, hy0 hy0Var, final int i2) throws EOFException {
            boolean z2;
            boolean z3;
            hy0Var.getClass();
            final c45 c45Var = c45.this;
            if (i != 0 && (i & 1) == 0) {
                final tx0 tx0Var = new tx0();
                long j = i2;
                hy0Var.n0(j);
                hy0Var.O(tx0Var, j);
                y9a.c(c45Var.B, c45Var.v + '[' + i + "] onData", 0L, new mh4(i, tx0Var, i2, z) { // from class: y35
                    public final /* synthetic */ int u;
                    public final /* synthetic */ tx0 v;
                    public final /* synthetic */ int w;

                    @Override // defpackage.mh4
                    public final Object invoke() {
                        c45 c45Var2 = this.t;
                        int i3 = this.u;
                        tx0 tx0Var2 = this.v;
                        int i4 = this.w;
                        try {
                            c45Var2.D.getClass();
                            tx0Var2.skip(i4);
                            c45Var2.P.v(i3, ul3.CANCEL);
                            synchronized (c45Var2) {
                                c45Var2.R.remove(Integer.valueOf(i3));
                                g2b g2bVar = g2b.a;
                            }
                        } catch (IOException unused) {
                        }
                        return g2b.a;
                    }
                }, 6);
                return;
            }
            i45 i45VarK = c45Var.k(i);
            if (i45VarK == null) {
                c45.this.v(i, ul3.PROTOCOL_ERROR);
                long j2 = i2;
                c45.this.t(j2);
                hy0Var.skip(j2);
                return;
            }
            TimeZone timeZone = ytb.a;
            i45.b bVar = i45VarK.h;
            long j3 = i2;
            bVar.getClass();
            long j4 = j3;
            while (true) {
                i45 i45Var = i45.this;
                if (j4 <= 0) {
                    TimeZone timeZone2 = ytb.a;
                    i45Var.b.t(j3);
                    i45 i45Var2 = i45.this;
                    t54 t54Var = i45Var2.b.I;
                    kmb kmbVar = i45Var2.c;
                    long j5 = bVar.w.u;
                    t54Var.b(kmbVar);
                    break;
                }
                synchronized (i45Var) {
                    z2 = bVar.u;
                    z3 = bVar.w.u + j4 > bVar.t;
                    g2b g2bVar = g2b.a;
                }
                if (z3) {
                    hy0Var.skip(j4);
                    i45.this.g(ul3.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    hy0Var.skip(j4);
                    break;
                }
                long jO = hy0Var.O(bVar.v, j4);
                if (jO == -1) {
                    throw new EOFException();
                }
                j4 -= jO;
                i45 i45Var3 = i45.this;
                synchronized (i45Var3) {
                    try {
                        if (bVar.x) {
                            bVar.v.h();
                        } else {
                            tx0 tx0Var2 = bVar.w;
                            boolean z4 = tx0Var2.u == 0;
                            tx0Var2.F(bVar.v);
                            if (z4) {
                                i45Var3.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                i45VarK.k(nu4.u, true);
            }
        }

        public final void d(final int i, final List list, final boolean z) {
            final c45 c45Var = c45.this;
            if (i != 0 && (i & 1) == 0) {
                y9a.c(c45Var.B, c45Var.v + '[' + i + "] onHeaders", 0L, new mh4(i, list, z) { // from class: b45
                    public final /* synthetic */ int u;
                    public final /* synthetic */ List v;

                    @Override // defpackage.mh4
                    public final Object invoke() {
                        c45 c45Var2 = this.t;
                        int i2 = this.u;
                        c45Var2.D.getClass();
                        try {
                            c45Var2.P.v(i2, ul3.CANCEL);
                            synchronized (c45Var2) {
                                c45Var2.R.remove(Integer.valueOf(i2));
                                g2b g2bVar = g2b.a;
                            }
                        } catch (IOException unused) {
                        }
                        return g2b.a;
                    }
                }, 6);
                return;
            }
            synchronized (c45Var) {
                i45 i45VarK = c45Var.k(i);
                if (i45VarK != null) {
                    g2b g2bVar = g2b.a;
                    i45VarK.k(ytb.i(list), z);
                    return;
                }
                if (c45Var.y) {
                    return;
                }
                if (i <= c45Var.w) {
                    return;
                }
                if (i % 2 == c45Var.x % 2) {
                    return;
                }
                final i45 i45Var = new i45(i, c45Var, false, z, ytb.i(list));
                c45Var.w = i;
                c45Var.u.put(Integer.valueOf(i), i45Var);
                y9a.c(c45Var.z.d(), c45Var.v + '[' + i + "] onStream", 0L, new mh4() { // from class: e45
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        c45 c45Var2 = c45Var;
                        i45 i45Var2 = i45Var;
                        try {
                            c45Var2.t.c(i45Var2);
                        } catch (IOException e) {
                            c cVar = c.a;
                            c.a.j("Http2Connection.Listener failure for " + c45Var2.v, 4, e);
                            try {
                                i45Var2.e(ul3.PROTOCOL_ERROR, e);
                            } catch (IOException unused) {
                            }
                        }
                        return g2b.a;
                    }
                }, 6);
            }
        }

        public final void e(final int i, boolean z, final int i2) {
            c45 c45Var = c45.this;
            if (!z) {
                y9a y9aVar = c45Var.A;
                String strA = av.a(new StringBuilder(), c45.this.v, " ping");
                final c45 c45Var2 = c45.this;
                y9a.c(y9aVar, strA, 0L, new mh4() { // from class: d45
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        c45 c45Var3 = c45Var2;
                        try {
                            c45Var3.P.u(i, true, i2);
                        } catch (IOException e) {
                            ul3 ul3Var = ul3.PROTOCOL_ERROR;
                            c45Var3.h(ul3Var, ul3Var, e);
                        }
                        return g2b.a;
                    }
                }, 6);
                return;
            }
            synchronized (c45Var) {
                try {
                    if (i == 1) {
                        c45Var.E++;
                    } else if (i != 2) {
                        if (i == 3) {
                            c45Var.notifyAll();
                        }
                        g2b g2bVar = g2b.a;
                    } else {
                        c45Var.G++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void f(final int i, final List list) {
            final c45 c45Var = c45.this;
            synchronized (c45Var) {
                if (c45Var.R.contains(Integer.valueOf(i))) {
                    c45Var.v(i, ul3.PROTOCOL_ERROR);
                    return;
                }
                c45Var.R.add(Integer.valueOf(i));
                y9a.c(c45Var.B, c45Var.v + '[' + i + "] onRequest", 0L, new mh4() { // from class: z35
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        c45 c45Var2 = c45Var;
                        int i2 = i;
                        c45Var2.D.getClass();
                        try {
                            c45Var2.P.v(i2, ul3.CANCEL);
                            synchronized (c45Var2) {
                                c45Var2.R.remove(Integer.valueOf(i2));
                                g2b g2bVar = g2b.a;
                            }
                        } catch (IOException unused) {
                        }
                        return g2b.a;
                    }
                }, 6);
            }
        }

        public final void g(final int i, final ul3 ul3Var) {
            final c45 c45Var = c45.this;
            if (i != 0 && (i & 1) == 0) {
                y9a.c(c45Var.B, c45Var.v + '[' + i + "] onReset", 0L, new mh4(i, ul3Var) { // from class: a45
                    public final /* synthetic */ int u;

                    @Override // defpackage.mh4
                    public final Object invoke() {
                        c45 c45Var2 = this.t;
                        int i2 = this.u;
                        c45Var2.D.getClass();
                        synchronized (c45Var2) {
                            c45Var2.R.remove(Integer.valueOf(i2));
                        }
                        return g2b.a;
                    }
                }, 6);
                return;
            }
            i45 i45VarM = c45Var.m(i);
            if (i45VarM != null) {
                synchronized (i45VarM) {
                    try {
                        if (i45VarM.h() == null) {
                            i45VarM.l = ul3Var;
                            i45VarM.notifyAll();
                        }
                        g2b g2bVar = g2b.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.mh4
        public final g2b invoke() throws Throwable {
            Throwable th;
            c45 c45Var = c45.this;
            h45 h45Var = this.t;
            ul3 ul3Var = ul3.INTERNAL_ERROR;
            IOException iOException = null;
            try {
                try {
                    try {
                        if (!h45Var.h(true, this)) {
                            throw new IOException("Required SETTINGS preface not received");
                        }
                        do {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } while (h45Var.h(false, this));
                        ul3 ul3Var2 = ul3.NO_ERROR;
                        try {
                            ul3Var = ul3.CANCEL;
                            c45Var.h(ul3Var2, ul3Var, null);
                            this = ul3Var2;
                        } catch (IOException e) {
                            iOException = e;
                            ul3 ul3Var3 = ul3.PROTOCOL_ERROR;
                            c45Var.h(ul3Var3, ul3Var3, iOException);
                            this = ul3Var3;
                        }
                        vtb.b(h45Var);
                        return g2b.a;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e2) {
                    iOException = e2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            this = ul3Var;
            c45Var.h(this, ul3Var, iOException);
            vtb.b(h45Var);
            throw th;
        }
    }

    static {
        ok9 ok9Var = new ok9();
        ok9Var.b(4, 65535);
        ok9Var.b(5, 16384);
        S = ok9Var;
    }

    public c45(a aVar) {
        this.t = aVar.d;
        String str = aVar.c;
        if (str == null) {
            xj5.e("connectionName");
            throw null;
        }
        this.v = str;
        this.x = 3;
        z9a z9aVar = aVar.a;
        this.z = z9aVar;
        this.A = z9aVar.d();
        this.B = z9aVar.d();
        this.C = z9aVar.d();
        this.D = aVar.e;
        this.I = aVar.f;
        ok9 ok9Var = new ok9();
        ok9Var.b(4, 16777216);
        this.J = ok9Var;
        ok9 ok9Var2 = S;
        this.K = ok9Var2;
        this.L = new kmb(0);
        this.N = ok9Var2.a();
        gy0 gy0Var = aVar.b;
        if (gy0Var == null) {
            xj5.e("socket");
            throw null;
        }
        this.O = gy0Var;
        this.P = new j45(gy0Var.c());
        this.Q = new c(new h45(gy0Var.d()));
        this.R = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        h(ul3.NO_ERROR, ul3.CANCEL, null);
    }

    public final void flush() {
        this.P.flush();
    }

    public final void h(ul3 ul3Var, ul3 ul3Var2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = ytb.a;
        try {
            p(ul3Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.u.isEmpty()) {
                    array = null;
                } else {
                    array = this.u.values().toArray(new i45[0]);
                    this.u.clear();
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        i45[] i45VarArr = (i45[]) array;
        if (i45VarArr != null) {
            for (i45 i45Var : i45VarArr) {
                try {
                    i45Var.e(ul3Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.P.close();
        } catch (IOException unused3) {
        }
        try {
            this.O.cancel();
        } catch (IOException unused4) {
        }
        this.A.g();
        this.B.g();
        this.C.g();
    }

    public final i45 k(int i) {
        i45 i45Var;
        synchronized (this) {
            i45Var = (i45) this.u.get(Integer.valueOf(i));
        }
        return i45Var;
    }

    public final i45 m(int i) {
        i45 i45Var;
        synchronized (this) {
            i45Var = (i45) this.u.remove(Integer.valueOf(i));
            notifyAll();
        }
        return i45Var;
    }

    public final void p(ul3 ul3Var) {
        synchronized (this.P) {
            synchronized (this) {
                if (this.y) {
                    return;
                }
                this.y = true;
                int i = this.w;
                g2b g2bVar = g2b.a;
                this.P.p(i, ul3Var, vtb.a);
            }
        }
    }

    public final void t(long j) {
        synchronized (this) {
            try {
                kmb.b(this.L, j, 0L, 2);
                long jA = this.L.a();
                if (jA >= this.J.a() / 2) {
                    y(0, jA);
                    kmb.b(this.L, 0L, jA, 1);
                }
                this.I.a(this.L);
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(int i, boolean z, tx0 tx0Var, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.P.k(z, i, tx0Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.M;
                            j3 = this.N;
                            if (j2 >= j3) {
                                if (!this.u.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.P.v);
                j4 = iMin;
                this.M += j4;
                g2b g2bVar = g2b.a;
            }
            j -= j4;
            this.P.k(z && j == 0, i, tx0Var, iMin);
        }
    }

    public final void v(final int i, final ul3 ul3Var) {
        y9a.c(this.A, this.v + '[' + i + "] writeSynReset", 0L, new mh4() { // from class: x35
            @Override // defpackage.mh4
            public final Object invoke() {
                c45 c45Var = this.t;
                try {
                    c45Var.P.v(i, ul3Var);
                } catch (IOException e) {
                    ul3 ul3Var2 = ul3.PROTOCOL_ERROR;
                    c45Var.h(ul3Var2, ul3Var2, e);
                }
                return g2b.a;
            }
        }, 6);
    }

    public final void y(final int i, final long j) {
        y9a.c(this.A, this.v + '[' + i + "] windowUpdate", 0L, new mh4() { // from class: v35
            @Override // defpackage.mh4
            public final Object invoke() {
                c45 c45Var = this.t;
                try {
                    c45Var.P.y(i, j);
                } catch (IOException e) {
                    ul3 ul3Var = ul3.PROTOCOL_ERROR;
                    c45Var.h(ul3Var, ul3Var, e);
                }
                return g2b.a;
            }
        }, 6);
    }
}
