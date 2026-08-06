package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class dh4 {
    public final a a = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends b {
        public static HandlerThread e;
        public static Handler f;
        public SparseIntArray[] b = new SparseIntArray[9];
        public final ArrayList<WeakReference<Activity>> c = new ArrayList<>();
        public final WindowOnFrameMetricsAvailableListenerC0069a d = new WindowOnFrameMetricsAvailableListenerC0069a();
        public final int a = 1;

        /* JADX INFO: renamed from: dh4$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class WindowOnFrameMetricsAvailableListenerC0069a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0069a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                a aVar = a.this;
                if ((aVar.a & 1) != 0) {
                    SparseIntArray sparseIntArray = aVar.b[0];
                    long metric = frameMetrics.getMetric(8);
                    if (sparseIntArray != null) {
                        int i2 = (int) ((500000 + metric) / 1000000);
                        if (metric >= 0) {
                            sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
    }

    public final void a(Activity activity) {
        a aVar = this.a;
        ArrayList<WeakReference<Activity>> arrayList = aVar.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            WeakReference<Activity> weakReference = arrayList.get(i);
            i++;
            WeakReference<Activity> weakReference2 = weakReference;
            if (weakReference2.get() == activity) {
                arrayList.remove(weakReference2);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(aVar.d);
    }
}
