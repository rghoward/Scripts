package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wq implements g88, s98, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long A;
    public final View t;
    public boolean v;
    public boolean y;
    public long z;
    public final PriorityQueue<u98> u = new PriorityQueue<>(11, new vq());
    public final Choreographer w = Choreographer.getInstance();
    public final a x = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements f88 {
        public boolean a;
        public long b;

        @Override // defpackage.f88
        public final long a() {
            if (this.a) {
                return Long.MAX_VALUE;
            }
            return Math.max(0L, this.b - System.nanoTime());
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003f  */
    public wq(View view) {
        float refreshRate;
        this.t = view;
        if (A == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            A = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.y = true;
        }
    }

    @Override // defpackage.s98
    public final void b(c88.a aVar) {
        this.u.add(new u98(0, aVar));
        if (this.v) {
            return;
        }
        this.v = true;
        this.t.post(this);
    }

    @Override // defpackage.s98
    public final void c(c88.a aVar) {
        this.u.add(new u98(1, aVar));
        if (this.v) {
            return;
        }
        this.v = true;
        this.t.post(this);
    }

    public final boolean d() {
        a aVar = this.x;
        long jA = aVar.a();
        qs.a(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jA > 0) {
            PriorityQueue<u98> priorityQueue = this.u;
            u98 u98VarPeek = priorityQueue.peek();
            u98VarPeek.getClass();
            if (!u98VarPeek.b.d(aVar)) {
                priorityQueue.poll();
                z = false;
            }
            aVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.y) {
            this.z = j;
            this.t.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.y = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.y = false;
        this.t.removeCallbacks(this);
        this.w.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue<u98> priorityQueue = this.u;
        if (!priorityQueue.isEmpty() && this.v && this.y) {
            View view = this.t;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * A) + nanos;
                a aVar = this.x;
                aVar.a = z;
                aVar.b = Math.max(this.z, nanos) + A;
                boolean zD = false;
                while (!priorityQueue.isEmpty() && !zD) {
                    if (aVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zD = d();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zD = d();
                    }
                }
                if (zD) {
                    this.w.postFrameCallback(this);
                } else {
                    this.v = false;
                }
                qs.a(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.v = false;
    }
}
