package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fh4 {
    public static final dp e = dp.d();
    public final Activity a;
    public final dh4 b;
    public final HashMap c;
    public boolean d;

    public fh4() {
        throw null;
    }

    public fh4(Activity activity) {
        dh4 dh4Var = new dh4();
        HashMap map = new HashMap();
        this.d = false;
        this.a = activity;
        this.b = dh4Var;
        this.c = map;
    }

    public final rk7<eh4> a() {
        boolean z = this.d;
        dp dpVar = e;
        if (!z) {
            dpVar.a("No recording has been started.");
            return new rk7<>();
        }
        SparseIntArray sparseIntArray = this.b.a.b[0];
        if (sparseIntArray == null) {
            dpVar.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new rk7<>();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            int iValueAt = sparseIntArray.valueAt(i4);
            i += iValueAt;
            if (iKeyAt > 700) {
                i3 += iValueAt;
            }
            if (iKeyAt > 16) {
                i2 += iValueAt;
            }
        }
        return new rk7<>(new eh4(i, i2, i3));
    }

    public final void b() {
        boolean z = this.d;
        Activity activity = this.a;
        if (z) {
            e.b("FrameMetricsAggregator is already recording %s", activity.getClass().getSimpleName());
            return;
        }
        dh4.a aVar = this.b.a;
        aVar.getClass();
        if (dh4.a.e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            dh4.a.e = handlerThread;
            handlerThread.start();
            dh4.a.f = new Handler(dh4.a.e.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = aVar.b;
            if (sparseIntArrayArr[i] == null) {
                if (((1 << i) & aVar.a) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(aVar.d, dh4.a.f);
        aVar.c.add(new WeakReference<>(activity));
        this.d = true;
    }
}
