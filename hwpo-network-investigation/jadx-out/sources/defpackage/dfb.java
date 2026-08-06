package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dfb {
    public final h34 a;
    public final Context b;
    public b c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static void a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                md6.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends b implements Choreographer.FrameCallback {
        @Override // dfb.b
        public final void a() {
            long refreshRate;
            this.u.registerDisplayListener(this, n6b.p(null));
            this.t.postFrameCallback(this);
            Display display = this.u.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                md6.g("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.w = refreshRate;
        }

        @Override // dfb.b
        public final void b() {
            this.u.unregisterDisplayListener(this);
            this.t.removeFrameCallback(this);
            this.v = -9223372036854775807L;
            this.w = -9223372036854775807L;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.v = j;
            this.t.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            long refreshRate;
            if (i == 0) {
                this.t.postFrameCallback(this);
                Display display = this.u.getDisplay(0);
                if (display != null) {
                    refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
                } else {
                    md6.g("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                    refreshRate = -9223372036854775807L;
                }
                this.w = refreshRate;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends b implements Choreographer$VsyncCallback {
        public final Handler x;

        public d(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
            this.x = n6b.p(null);
        }

        @Override // dfb.b
        public final void a() {
            this.u.registerDisplayListener(this, n6b.p(null));
            this.t.postVsyncCallback(this);
        }

        @Override // dfb.b
        public final void b() {
            this.u.unregisterDisplayListener(this);
            this.x.removeCallbacksAndMessages(null);
            this.t.removeVsyncCallback(this);
            this.v = -9223372036854775807L;
            this.w = -9223372036854775807L;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                this.t.postVsyncCallback(this);
            }
        }

        public final void onVsync(Choreographer.FrameData frameData) {
            this.v = frameData.getFrameTimeNanos();
            Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
            int i = 1;
            if (frameTimelines.length >= 2) {
                long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
                this.w = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
            } else {
                this.w = -9223372036854775807L;
            }
            this.x.postDelayed(new nb8(i, this), 500L);
        }
    }

    public dfb(Context context) {
        this.b = context;
        h34 h34Var = new h34();
        h34Var.a = new h34.a();
        h34Var.b = new h34.a();
        h34Var.d = -9223372036854775807L;
        this.a = h34Var;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f || !surface.isValid()) {
            return;
        }
        this.h = 0.0f;
        a.a(this.e, 0.0f);
    }

    public final void b() {
        this.m = 0L;
        this.q = -1L;
        this.n = -1L;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void c() {
        float f;
        float f2;
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
            return;
        }
        h34 h34Var = this.a;
        if (!h34Var.a.a()) {
            f = this.f;
        } else if (h34Var.a.a()) {
            h34.a aVar = h34Var.a;
            long j = aVar.e;
            f = (float) (1.0E9d / (j != 0 ? aVar.f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (h34Var.a.a()) {
                if ((h34Var.a.a() ? h34Var.a.f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.1f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.g) < f2) {
                return;
            }
        } else if (f == -1.0f && h34Var.e < 30) {
            return;
        }
        this.g = f;
        d(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    public final void d(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.h != f) {
            this.h = f;
            a.a(this.e, f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b implements DisplayManager.DisplayListener {
        public final Choreographer t;
        public final DisplayManager u;
        public volatile long v = -9223372036854775807L;
        public volatile long w = -9223372036854775807L;

        public b(Choreographer choreographer, DisplayManager displayManager) {
            this.t = choreographer;
            this.u = displayManager;
        }

        public abstract void a();

        public abstract void b();

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }
}
