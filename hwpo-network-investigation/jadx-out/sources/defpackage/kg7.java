package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class kg7<T> implements p21<T> {
    public Throwable A;
    public boolean B;
    public final gq8 t;
    public final Object u;
    public final Object[] v;
    public final o21.a w;
    public final g52<su8, T> x;
    public volatile boolean y;
    public o21 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements v21 {
        public final /* synthetic */ u21 t;

        public a(u21 u21Var) {
            this.t = u21Var;
        }

        @Override // defpackage.v21
        public final void onFailure(o21 o21Var, IOException iOException) {
            try {
                this.t.onFailure(kg7.this, iOException);
            } catch (Throwable th) {
                s6b.m(th);
                th.printStackTrace();
            }
        }

        @Override // defpackage.v21
        public final void onResponse(o21 o21Var, qu8 qu8Var) {
            u21 u21Var = this.t;
            kg7 kg7Var = kg7.this;
            try {
                try {
                    u21Var.onResponse(kg7Var, kg7Var.c(qu8Var));
                } catch (Throwable th) {
                    s6b.m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                s6b.m(th2);
                try {
                    u21Var.onFailure(kg7Var, th2);
                } catch (Throwable th3) {
                    s6b.m(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends su8 {
        public final su8 v;
        public final ni8 w;
        public IOException x;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a extends td4 {
            public a(hy0 hy0Var) {
                super(hy0Var);
            }

            @Override // defpackage.td4, defpackage.kw9
            public final long O(tx0 tx0Var, long j) throws IOException {
                try {
                    return super.O(tx0Var, j);
                } catch (IOException e) {
                    b.this.x = e;
                    throw e;
                }
            }
        }

        public b(su8 su8Var) {
            this.v = su8Var;
            this.w = new ni8(new a(su8Var.p()));
        }

        @Override // defpackage.su8, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.v.close();
        }

        @Override // defpackage.su8
        public final long k() {
            return this.v.k();
        }

        @Override // defpackage.su8
        public final wq6 m() {
            return this.v.m();
        }

        @Override // defpackage.su8
        public final hy0 p() {
            return this.w;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends su8 {
        public final wq6 v;
        public final long w;

        public c(wq6 wq6Var, long j) {
            this.v = wq6Var;
            this.w = j;
        }

        @Override // defpackage.su8
        public final long k() {
            return this.w;
        }

        @Override // defpackage.su8
        public final wq6 m() {
            return this.v;
        }

        @Override // defpackage.su8
        public final hy0 p() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public kg7(gq8 gq8Var, Object obj, Object[] objArr, o21.a aVar, g52<su8, T> g52Var) {
        this.t = gq8Var;
        this.u = obj;
        this.v = objArr;
        this.w = aVar;
        this.x = g52Var;
    }

    public final o21 a() {
        f55.a aVar;
        f55 f55VarA;
        gq8 gq8Var = this.t;
        ws7<?>[] ws7VarArr = gq8Var.k;
        Object[] objArr = this.v;
        int length = objArr.length;
        if (length != ws7VarArr.length) {
            z90.a(i34.b(ws7VarArr.length, ")", t43.b(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        sp8 sp8Var = new sp8(gq8Var.d, gq8Var.c, gq8Var.e, gq8Var.f, gq8Var.g, gq8Var.h, gq8Var.i, gq8Var.j);
        if (gq8Var.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            ws7VarArr[i].a(sp8Var, objArr[i]);
        }
        f55.a aVar2 = sp8Var.d;
        if (aVar2 != null) {
            f55VarA = aVar2.a();
        } else {
            String str = sp8Var.c;
            f55 f55Var = sp8Var.b;
            f55Var.getClass();
            str.getClass();
            try {
                aVar = new f55.a();
                aVar.d(f55Var, str);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            f55VarA = aVar != null ? aVar.a() : null;
            if (f55VarA == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(f55Var);
                vr0.d(sb, ", Relative: ", sp8Var.c);
                return null;
            }
        }
        qp8 aVar3 = sp8Var.k;
        if (aVar3 == null) {
            fd4.a aVar4 = sp8Var.j;
            if (aVar4 != null) {
                aVar3 = new fd4(aVar4.a, aVar4.b);
            } else {
                n17.a aVar5 = sp8Var.i;
                if (aVar5 != null) {
                    aVar3 = aVar5.b();
                } else if (sp8Var.h) {
                    aVar3 = qp8.create((wq6) null, new byte[0]);
                }
            }
        }
        wq6 wq6Var = sp8Var.g;
        nu4.a aVar6 = sp8Var.f;
        if (wq6Var != null) {
            if (aVar3 != null) {
                aVar3 = new sp8.a(aVar3, wq6Var);
            } else {
                aVar6.a("Content-Type", wq6Var.a);
            }
        }
        jp8.a aVar7 = sp8Var.e;
        aVar7.getClass();
        aVar7.a = f55VarA;
        aVar7.c = aVar6.d().f();
        aVar7.c(sp8Var.a, aVar3);
        aVar7.e = aVar7.e.U0(ll8.a(mk5.class), new mk5(gq8Var.a, this.u, gq8Var.b, arrayList));
        return this.w.a(new jp8(aVar7));
    }

    public final o21 b() throws IOException {
        o21 o21Var = this.z;
        if (o21Var != null) {
            return o21Var;
        }
        Throwable th = this.A;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            o21 o21VarA = a();
            this.z = o21VarA;
            return o21VarA;
        } catch (IOException | Error | RuntimeException e) {
            s6b.m(e);
            this.A = e;
            throw e;
        }
    }

    public final ru8<T> c(qu8 qu8Var) throws IOException {
        su8 su8Var = qu8Var.z;
        qu8.a aVarK = qu8Var.k();
        aVarK.g = new c(su8Var.m(), su8Var.k());
        qu8 qu8VarA = aVarK.a();
        int i = qu8VarA.w;
        if (i < 200 || i >= 300) {
            try {
                tx0 tx0Var = new tx0();
                su8Var.p().M(tx0Var);
                tu8 tu8Var = new tu8(su8Var.m(), su8Var.k(), tx0Var);
                if (qu8VarA.J) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                ru8<T> ru8Var = new ru8<>(qu8VarA, null, tu8Var);
                su8Var.close();
                return ru8Var;
            } catch (Throwable th) {
                su8Var.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            su8Var.close();
            return ru8.b(null, qu8VarA);
        }
        b bVar = new b(su8Var);
        try {
            return ru8.b(this.x.a(bVar), qu8VarA);
        } catch (RuntimeException e) {
            IOException iOException = bVar.x;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // defpackage.p21
    public final void cancel() {
        o21 o21Var;
        this.y = true;
        synchronized (this) {
            o21Var = this.z;
        }
        if (o21Var != null) {
            o21Var.cancel();
        }
    }

    @Override // defpackage.p21
    /* JADX INFO: renamed from: clone */
    public final p21 m18clone() {
        return new kg7(this.t, this.u, this.v, this.w, this.x);
    }

    @Override // defpackage.p21
    public final void enqueue(u21<T> u21Var) {
        o21 o21Var;
        Throwable th;
        Objects.requireNonNull(u21Var, "callback == null");
        synchronized (this) {
            try {
                if (this.B) {
                    throw new IllegalStateException("Already executed.");
                }
                this.B = true;
                o21Var = this.z;
                th = this.A;
                if (o21Var == null && th == null) {
                    try {
                        o21 o21VarA = a();
                        this.z = o21VarA;
                        o21Var = o21VarA;
                    } catch (Throwable th2) {
                        th = th2;
                        s6b.m(th);
                        this.A = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            u21Var.onFailure(this, th);
            return;
        }
        if (this.y) {
            o21Var.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(o21Var, new a(u21Var));
    }

    @Override // defpackage.p21
    public final boolean isCanceled() {
        boolean z = true;
        if (this.y) {
            return true;
        }
        synchronized (this) {
            try {
                o21 o21Var = this.z;
                if (o21Var == null || !o21Var.isCanceled()) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.p21
    public final synchronized boolean isExecuted() {
        return this.B;
    }

    @Override // defpackage.p21
    public final synchronized jp8 request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().request();
    }

    @Override // defpackage.p21
    public final synchronized voa timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return b().timeout();
    }

    public final Object clone() {
        return new kg7(this.t, this.u, this.v, this.w, this.x);
    }
}
