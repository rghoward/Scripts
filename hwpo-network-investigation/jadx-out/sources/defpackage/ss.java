package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ss extends n72 {
    public static final o7a F = new o7a(a.u);
    public static final b G = new b();
    public boolean B;
    public boolean C;
    public final ts E;
    public final Choreographer v;
    public final Handler w;
    public final Object x = new Object();
    public final h30<Runnable> y = new h30<>();
    public ArrayList z = new ArrayList();
    public ArrayList A = new ArrayList();
    public final c D = new c();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<h72> {
        public static final a u = new a(0);

        @Override // defpackage.mh4
        public final h72 invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                et2 et2Var = i23.a;
                choreographer = (Choreographer) oy0.f(ag6.a, new rs(2, null));
            }
            ss ssVar = new ss(choreographer, ct4.a(Looper.getMainLooper()));
            return h72.a.C0100a.c(ssVar, ssVar.E);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends ThreadLocal<h72> {
        @Override // java.lang.ThreadLocal
        public final h72 initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                ss ssVar = new ss(choreographer, ct4.a(looperMyLooper));
                return h72.a.C0100a.c(ssVar, ssVar.E);
            }
            aa0.c("no Looper on this thread");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements Choreographer.FrameCallback, Runnable {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            ss.this.w.removeCallbacks(this);
            ss.x0(ss.this);
            ss ssVar = ss.this;
            synchronized (ssVar.x) {
                if (ssVar.C) {
                    ssVar.C = false;
                    ArrayList arrayList = ssVar.z;
                    ssVar.z = ssVar.A;
                    ssVar.A = arrayList;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                    }
                    arrayList.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ss.x0(ss.this);
            ss ssVar = ss.this;
            synchronized (ssVar.x) {
                try {
                    if (ssVar.z.isEmpty()) {
                        ssVar.v.removeFrameCallback(this);
                        ssVar.C = false;
                    }
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ss(Choreographer choreographer, Handler handler) {
        this.v = choreographer;
        this.w = handler;
        this.E = new ts(choreographer, this);
    }

    public static final void x0(ss ssVar) {
        Runnable runnableRemoveFirst;
        boolean z;
        do {
            synchronized (ssVar.x) {
                h30<Runnable> h30Var = ssVar.y;
                runnableRemoveFirst = h30Var.isEmpty() ? null : h30Var.removeFirst();
            }
            while (runnableRemoveFirst != null) {
                runnableRemoveFirst.run();
                synchronized (ssVar.x) {
                    h30<Runnable> h30Var2 = ssVar.y;
                    runnableRemoveFirst = h30Var2.isEmpty() ? null : h30Var2.removeFirst();
                }
            }
            synchronized (ssVar.x) {
                if (ssVar.y.isEmpty()) {
                    z = false;
                    ssVar.B = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.n72
    public final void t0(h72 h72Var, Runnable runnable) {
        synchronized (this.x) {
            try {
                this.y.addLast(runnable);
                if (!this.B) {
                    this.B = true;
                    this.w.post(this.D);
                    if (!this.C) {
                        this.C = true;
                        this.v.postFrameCallback(this.D);
                    }
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
