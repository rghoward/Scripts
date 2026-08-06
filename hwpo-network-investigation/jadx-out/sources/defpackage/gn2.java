package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gn2<R> implements ye2.a, Runnable, Comparable<gn2<?>>, at3.d {
    public static final mk7<Supplier<Integer>> a0 = new mk7<>("glide_thread_priority_override", null, mk7.e);
    public com.bumptech.glide.c A;
    public ko5 B;
    public p98 C;
    public sg3 D;
    public int E;
    public int F;
    public k13 G;
    public xk7 H;
    public qg3 I;
    public int J;
    public f K;
    public e L;
    public long M;
    public Object N;
    public com.bumptech.glide.d O;
    public Supplier<Integer> P;
    public Thread Q;
    public ko5 R;
    public ko5 S;
    public Object T;
    public kf2 U;
    public xe2<?> V;
    public volatile ye2 W;
    public volatile boolean X;
    public volatile boolean Y;
    public boolean Z;
    public final c w;
    public final w58<gn2<?>> x;
    public final en2<R> t = new en2<>();
    public final ArrayList u = new ArrayList();
    public final p0a.a v = new p0a.a();
    public final b<?> y = new b<>();
    public final d z = new d();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a<Z> {
        public final kf2 a;

        public a(kf2 kf2Var) {
            this.a = kf2Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<Z> {
        public ko5 a;
        public st8<Z> b;
        public kd6<Z> c;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d {
        public boolean a;
        public boolean b;
        public boolean c;

        public final boolean a() {
            return (this.c || this.b) && this.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public static final e t;
        public static final e u;
        public static final e v;
        public static final /* synthetic */ e[] w;

        static {
            e eVar = new e("INITIALIZE", 0);
            t = eVar;
            e eVar2 = new e("SWITCH_TO_SOURCE_SERVICE", 1);
            u = eVar2;
            e eVar3 = new e("DECODE_DATA", 2);
            v = eVar3;
            w = new e[]{eVar, eVar2, eVar3};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) w.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f {
        public static final f t;
        public static final f u;
        public static final f v;
        public static final f w;
        public static final f x;
        public static final f y;
        public static final /* synthetic */ f[] z;

        static {
            f fVar = new f("INITIALIZE", 0);
            t = fVar;
            f fVar2 = new f("RESOURCE_CACHE", 1);
            u = fVar2;
            f fVar3 = new f("DATA_CACHE", 2);
            v = fVar3;
            f fVar4 = new f("SOURCE", 3);
            w = fVar4;
            f fVar5 = new f("ENCODE", 4);
            x = fVar5;
            f fVar6 = new f("FINISHED", 5);
            y = fVar6;
            z = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) z.clone();
        }
    }

    public gn2(hg3.c cVar, at3.c cVar2) {
        this.w = cVar;
        this.x = cVar2;
    }

    public final <Data> kt8<R> a(xe2<?> xe2Var, Data data, kf2 kf2Var) {
        if (data == null) {
            xe2Var.b();
            return null;
        }
        try {
            int i = vd6.b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            kt8<R> kt8VarH = h(data, kf2Var);
            if (Log.isLoggable("DecodeJob", 2)) {
                l("Decoded result " + kt8VarH, jElapsedRealtimeNanos, null);
            }
            return kt8VarH;
        } finally {
            xe2Var.b();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(gn2<?> gn2Var) {
        gn2<?> gn2Var2 = gn2Var;
        int iOrdinal = this.C.ordinal() - gn2Var2.C.ordinal();
        return iOrdinal == 0 ? this.J - gn2Var2.J : iOrdinal;
    }

    @Override // ye2.a
    public final void e(ko5 ko5Var, Exception exc, xe2<?> xe2Var, kf2 kf2Var) {
        xe2Var.b();
        rm4 rm4Var = new rm4("Fetching data failed", Collections.singletonList(exc));
        Class<?> clsA = xe2Var.a();
        rm4Var.u = ko5Var;
        rm4Var.v = kf2Var;
        rm4Var.w = clsA;
        this.u.add(rm4Var);
        if (Thread.currentThread() != this.Q) {
            o(e.u);
        } else {
            r();
        }
    }

    @Override // ye2.a
    public final void f(ko5 ko5Var, Object obj, xe2<?> xe2Var, kf2 kf2Var, ko5 ko5Var2) {
        this.R = ko5Var;
        this.T = obj;
        this.V = xe2Var;
        this.U = kf2Var;
        this.S = ko5Var2;
        this.Z = ko5Var != this.t.a().get(0);
        if (Thread.currentThread() != this.Q) {
            o(e.v);
        } else {
            i();
        }
    }

    @Override // at3.d
    public final p0a.a g() {
        return this.v;
    }

    public final <Data> kt8<R> h(Data data, kf2 kf2Var) {
        Class<?> cls = data.getClass();
        en2<R> en2Var = this.t;
        sb6<Data, ?, R> sb6VarC = en2Var.c(cls);
        xk7 xk7Var = this.H;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = kf2Var == kf2.w || en2Var.r;
            mk7<Boolean> mk7Var = w43.i;
            Boolean bool = (Boolean) xk7Var.c(mk7Var);
            if (bool == null || (bool.booleanValue() && !z)) {
                xk7Var = new xk7();
                g11 g11Var = this.H.b;
                g11 g11Var2 = xk7Var.b;
                g11Var2.g(g11Var);
                g11Var2.put(mk7Var, Boolean.valueOf(z));
            }
        }
        xk7 xk7Var2 = xk7Var;
        com.bumptech.glide.load.data.a aVarG = this.A.a().g(data);
        try {
            return sb6VarC.a(this.E, this.F, new a(kf2Var), xk7Var2, aVarG);
        } finally {
            aVarG.b();
        }
    }

    public final void i() {
        kd6 kd6VarA;
        boolean zA;
        Supplier<Integer> supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            l("Retrieved data", this.M, "data: " + this.T + ", cache key: " + this.R + ", fetcher: " + this.V);
        }
        kd6 kd6Var = null;
        if (this.O.a.containsKey(com.bumptech.glide.b.e.class) && (supplier = this.P) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), this.P.get().intValue());
            } catch (IllegalArgumentException | SecurityException e2) {
                this.P = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e2);
                }
            }
        }
        try {
            kd6VarA = a(this.V, this.T, this.U);
        } catch (rm4 e3) {
            ko5 ko5Var = this.S;
            kf2 kf2Var = this.U;
            e3.u = ko5Var;
            e3.v = kf2Var;
            e3.w = null;
            this.u.add(e3);
            kd6VarA = null;
        }
        if (kd6VarA == null) {
            r();
            return;
        }
        kf2 kf2Var2 = this.U;
        boolean z = this.Z;
        if (kd6VarA instanceof fc5) {
            ((fc5) kd6VarA).b();
        }
        if (this.y.c != null) {
            kd6Var = (kd6) kd6.x.b();
            kd6Var.w = false;
            kd6Var.v = true;
            kd6Var.u = kd6VarA;
            kd6VarA = kd6Var;
        }
        if (this.O.a.containsKey(com.bumptech.glide.b.e.class)) {
            p();
        }
        t();
        qg3<?> qg3Var = this.I;
        synchronized (qg3Var) {
            qg3Var.G = kd6VarA;
            qg3Var.H = kf2Var2;
            qg3Var.O = z;
        }
        synchronized (qg3Var) {
            try {
                qg3Var.u.a();
                if (qg3Var.N) {
                    qg3Var.G.a();
                    qg3Var.f();
                } else {
                    if (qg3Var.t.t.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (qg3Var.I) {
                        throw new IllegalStateException("Already have resource");
                    }
                    qg3.c cVar = qg3Var.x;
                    kt8<?> kt8Var = qg3Var.G;
                    boolean z2 = qg3Var.E;
                    sg3 sg3Var = qg3Var.D;
                    tg3.a aVar = qg3Var.v;
                    cVar.getClass();
                    qg3Var.L = new tg3<>(kt8Var, z2, true, sg3Var, aVar);
                    qg3Var.I = true;
                    qg3.e eVar = qg3Var.t;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.t);
                    qg3Var.d(arrayList.size() + 1);
                    ((hg3) qg3Var.y).e(qg3Var, qg3Var.D, qg3Var.L);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        qg3.d dVar = (qg3.d) obj;
                        dVar.b.execute(new qg3.b(dVar.a));
                    }
                    qg3Var.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.K = f.x;
        try {
            b<?> bVar = this.y;
            if (bVar.c != null) {
                c cVar2 = this.w;
                xk7 xk7Var = this.H;
                bVar.getClass();
                try {
                    ((hg3.c) cVar2).a().c(bVar.a, new qe2(bVar.b, bVar.c, xk7Var));
                    bVar.c.b();
                } catch (Throwable th2) {
                    bVar.c.b();
                    throw th2;
                }
            }
            if (kd6Var != null) {
                kd6Var.b();
            }
            d dVar2 = this.z;
            synchronized (dVar2) {
                dVar2.b = true;
                zA = dVar2.a();
            }
            if (zA) {
                n();
            }
        } catch (Throwable th3) {
            if (kd6Var == null) {
                throw th3;
            }
            kd6Var.b();
            throw th3;
        }
    }

    public final ye2 j() {
        int iOrdinal = this.K.ordinal();
        en2<R> en2Var = this.t;
        if (iOrdinal == 1) {
            return new mt8(en2Var, this);
        }
        if (iOrdinal == 2) {
            return new oe2(en2Var.a(), en2Var, this);
        }
        if (iOrdinal == 3) {
            return new mw9(en2Var, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        v92.b(this.K, "Unrecognized stage: ");
        return null;
    }

    public final f k(f fVar) {
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            boolean zB = this.G.b();
            f fVar2 = f.u;
            return zB ? fVar2 : k(fVar2);
        }
        if (iOrdinal == 1) {
            boolean zA = this.G.a();
            f fVar3 = f.v;
            return zA ? fVar3 : k(fVar3);
        }
        if (iOrdinal == 2) {
            return f.w;
        }
        if (iOrdinal == 3 || iOrdinal == 5) {
            return f.y;
        }
        u.c(fVar, "Unrecognized stage: ");
        return null;
    }

    public final void l(String str, long j, String str2) {
        StringBuilder sbB = tn2.b(str, " in ");
        sbB.append(vd6.a(j));
        sbB.append(", load key: ");
        sbB.append(this.D);
        sbB.append(str2 != null ? ", ".concat(str2) : BuildConfig.FLAVOR);
        sbB.append(", thread: ");
        sbB.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbB.toString());
    }

    public final void m() {
        boolean zA;
        if (this.O.a.containsKey(com.bumptech.glide.b.e.class)) {
            p();
        }
        t();
        rm4 rm4Var = new rm4("Failed to load resource", new ArrayList(this.u));
        qg3<?> qg3Var = this.I;
        synchronized (qg3Var) {
            qg3Var.J = rm4Var;
        }
        synchronized (qg3Var) {
            try {
                qg3Var.u.a();
                if (qg3Var.N) {
                    qg3Var.f();
                } else {
                    if (qg3Var.t.t.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (qg3Var.K) {
                        throw new IllegalStateException("Already failed once");
                    }
                    qg3Var.K = true;
                    sg3 sg3Var = qg3Var.D;
                    qg3.e eVar = qg3Var.t;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.t);
                    qg3Var.d(arrayList.size() + 1);
                    ((hg3) qg3Var.y).e(qg3Var, sg3Var, null);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        qg3.d dVar = (qg3.d) obj;
                        dVar.b.execute(new qg3.a(dVar.a));
                    }
                    qg3Var.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d dVar2 = this.z;
        synchronized (dVar2) {
            dVar2.c = true;
            zA = dVar2.a();
        }
        if (zA) {
            n();
        }
    }

    public final void n() {
        d dVar = this.z;
        synchronized (dVar) {
            dVar.b = false;
            dVar.a = false;
            dVar.c = false;
        }
        b<?> bVar = this.y;
        bVar.a = null;
        bVar.b = null;
        bVar.c = null;
        en2<R> en2Var = this.t;
        en2Var.c = null;
        en2Var.d = null;
        en2Var.n = null;
        en2Var.g = null;
        en2Var.k = null;
        en2Var.i = null;
        en2Var.o = null;
        en2Var.j = null;
        en2Var.p = null;
        en2Var.a.clear();
        en2Var.l = false;
        en2Var.b.clear();
        en2Var.m = false;
        this.X = false;
        this.A = null;
        this.B = null;
        this.H = null;
        this.C = null;
        this.D = null;
        this.I = null;
        this.K = null;
        this.W = null;
        this.Q = null;
        this.R = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.M = 0L;
        this.Y = false;
        this.N = null;
        this.u.clear();
        this.x.a(this);
    }

    public final void o(e eVar) {
        this.L = eVar;
        qg3 qg3Var = this.I;
        (qg3Var.F ? qg3Var.B : qg3Var.A).execute(this);
    }

    public final void p() {
        if (!this.O.a.containsKey(com.bumptech.glide.b.e.class)) {
            aa0.c("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier<Integer> supplier = this.P;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e2) {
            this.P = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e2);
            }
        }
    }

    public final void r() {
        this.Q = Thread.currentThread();
        int i = vd6.b;
        this.M = SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.Y && this.W != null && !(zA = this.W.a())) {
            this.K = k(this.K);
            this.W = j();
            if (this.K == f.w) {
                o(e.u);
                return;
            }
        }
        if ((this.K == f.y || this.Y) && !zA) {
            m();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        xe2<?> xe2Var = this.V;
        try {
            try {
                try {
                    if (this.Y) {
                        m();
                        if (xe2Var != null) {
                            xe2Var.b();
                            return;
                        }
                        return;
                    }
                    s();
                    if (xe2Var != null) {
                        xe2Var.b();
                    }
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.Y + ", stage: " + this.K, th);
                    }
                    if (this.K != f.x) {
                        this.u.add(th);
                        m();
                    }
                    if (!this.Y) {
                        throw th;
                    }
                    throw th;
                }
            } catch (w21 e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            if (xe2Var != null) {
                xe2Var.b();
            }
            throw th2;
        }
    }

    public final void s() {
        int iOrdinal = this.L.ordinal();
        if (iOrdinal == 0) {
            this.K = k(f.t);
            this.W = j();
            r();
        } else if (iOrdinal == 1) {
            r();
        } else if (iOrdinal == 2) {
            i();
        } else {
            v92.b(this.L, "Unrecognized run reason: ");
        }
    }

    public final void t() {
        this.v.a();
        if (this.X) {
            throw new IllegalStateException("Already notified", this.u.isEmpty() ? null : (Throwable) p51.b(1, this.u));
        }
        this.X = true;
    }
}
