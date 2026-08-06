package defpackage;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface cj0 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {

        /* JADX INFO: renamed from: cj0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0040a {
            public final CopyOnWriteArrayList<C0041a> a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: cj0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class C0041a {
                public final Handler a;
                public final a b;
                public boolean c;

                public C0041a(Handler handler, a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }
            }
        }

        void a0(long j, int i, long j2);
    }

    void a(Handler handler, a aVar);

    hq2 b();

    void d(a aVar);

    long e();
}
