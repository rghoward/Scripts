package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ov {
    public static final ThreadLocal<ov> i = new ThreadLocal<>();
    public final d e;
    public c h;
    public final ep9<b, Long> a = new ep9<>();
    public final ArrayList<b> b = new ArrayList<>();
    public final a c = new a();
    public final nv d = new Runnable() { // from class: nv
        @Override // java.lang.Runnable
        public final void run() {
            ov ovVar = ov.this;
            long jUptimeMillis = SystemClock.uptimeMillis();
            ArrayList<ov.b> arrayList = ovVar.b;
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ov.b bVar = arrayList.get(i2);
                if (bVar != null) {
                    ep9<ov.b, Long> ep9Var = ovVar.a;
                    Long l = ep9Var.get(bVar);
                    if (l == null) {
                        bVar.a(jUptimeMillis);
                    } else if (l.longValue() < jUptimeMillis2) {
                        ep9Var.remove(bVar);
                        bVar.a(jUptimeMillis);
                    }
                }
            }
            if (ovVar.f) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                    ovVar.h.a();
                }
                ovVar.f = false;
            }
            if (arrayList.size() > 0) {
                ovVar.e.a.postFrameCallback(new qv(ovVar.d));
            }
        }
    };
    public boolean f = false;
    public float g = 1.0f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a {
        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        boolean a(long j);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c {
        public pv a;

        public c() {
        }

        public final boolean a() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.a);
            this.a = null;
            return zUnregisterDurationScaleChangeListener;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final Choreographer a = Choreographer.getInstance();
        public final Looper b = Looper.myLooper();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [nv] */
    public ov(d dVar) {
        this.e = dVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.animation.ValueAnimator$DurationScaleChangeListener, pv] */
    public final void a(qy9 qy9Var) {
        ArrayList<b> arrayList = this.b;
        if (arrayList.size() == 0) {
            this.e.a.postFrameCallback(new qv(this.d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.g = ValueAnimator.getDurationScale();
                if (this.h == null) {
                    this.h = new c();
                }
                final c cVar = this.h;
                if (cVar.a == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: pv
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f) {
                            ov.this.g = f;
                        }
                    };
                    cVar.a = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(qy9Var)) {
            return;
        }
        arrayList.add(qy9Var);
    }
}
