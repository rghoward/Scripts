package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.intercom.twig.BuildConfig;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yb6 {
    public static final b d = new b(0, -9223372036854775807L);
    public static final b e = new b(2, -9223372036854775807L);
    public static final b f = new b(3, -9223372036854775807L);
    public final em8 a;
    public c<? extends d> b;
    public IOException c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c<T extends d> extends Handler implements Runnable {
        public boolean A;
        public volatile boolean B;
        public final int t;
        public final T u;
        public final long v;
        public a<T> w;
        public IOException x;
        public int y;
        public Thread z;

        public c(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.u = t;
            this.w = aVar;
            this.t = i;
            this.v = j;
        }

        public final void a(boolean z) {
            this.B = z;
            this.x = null;
            if (hasMessages(1)) {
                this.A = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.A = true;
                        this.u.b();
                        Thread thread = this.z;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                yb6.this.b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.w;
                aVar.getClass();
                aVar.b(this.u, jElapsedRealtime, jElapsedRealtime - this.v, true);
                this.w = null;
            }
        }

        public final void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.v;
            a<T> aVar = this.w;
            aVar.getClass();
            aVar.o(this.u, jElapsedRealtime, j, this.y);
            this.x = null;
            yb6 yb6Var = yb6.this;
            em8 em8Var = yb6Var.a;
            c<? extends d> cVar = yb6Var.b;
            cVar.getClass();
            em8Var.execute(cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.B) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                b();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            yb6.this.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.v;
            a<T> aVar = this.w;
            aVar.getClass();
            if (this.A) {
                aVar.b(this.u, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    aVar.h(this.u, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    md6.e("LoadTask", "Unexpected exception handling load completed", e);
                    yb6.this.c = new g(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.x = iOException;
            int i3 = this.y + 1;
            this.y = i3;
            b bVarU = aVar.u(this.u, jElapsedRealtime, j, iOException, i3);
            int i4 = bVarU.a;
            if (i4 == 3) {
                yb6.this.c = this.x;
                return;
            }
            if (i4 != 2) {
                if (i4 == 1) {
                    this.y = 1;
                }
                long jMin = bVarU.b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.y - 1) * 1000, 5000);
                }
                yb6 yb6Var = yb6.this;
                xl7.r(yb6Var.b == null);
                yb6Var.b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(1, jMin);
                } else {
                    b();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.A;
                    this.z = Thread.currentThread();
                }
                if (!z) {
                    Trace.beginSection("load:".concat(this.u.getClass().getSimpleName()));
                    try {
                        this.u.a();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.z = null;
                    Thread.interrupted();
                }
                if (this.B) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.B) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Exception e2) {
                if (this.B) {
                    return;
                }
                md6.e("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new g(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.B) {
                    return;
                }
                md6.e("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new g(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.B) {
                    md6.e("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface e {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements Runnable {
        public final e t;

        public f(e eVar) {
            this.t = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.t.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends IOException {
        public g(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = BuildConfig.FLAVOR;
            }
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yb6(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = n6b.a;
        this(new em8(Executors.newSingleThreadExecutor(new i6b(strConcat)), new vl()));
    }

    public final void a() {
        c<? extends d> cVar = this.b;
        cVar.getClass();
        cVar.a(false);
    }

    public final boolean b() {
        return this.b != null;
    }

    public final void c(e eVar) {
        c<? extends d> cVar = this.b;
        if (cVar != null) {
            cVar.a(true);
        }
        em8 em8Var = this.a;
        if (eVar != null) {
            em8Var.execute(new f(eVar));
        }
        em8Var.u.accept(em8Var.t);
    }

    public final void d(d dVar, a aVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.c = null;
        c<? extends d> cVar = new c<>(looperMyLooper, dVar, aVar, i, SystemClock.elapsedRealtime());
        xl7.r(this.b == null);
        this.b = cVar;
        cVar.b();
    }

    public yb6(em8 em8Var) {
        this.a = em8Var;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<T extends d> {
        void b(T t, long j, long j2, boolean z);

        void h(T t, long j, long j2);

        b u(T t, long j, long j2, IOException iOException, int i);

        default void o(T t, long j, long j2, int i) {
        }
    }
}
