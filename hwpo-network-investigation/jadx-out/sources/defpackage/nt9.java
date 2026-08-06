package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nt9 {
    public static nt9 b;
    public final Object a = new Object();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            nt9 nt9Var = nt9.this;
            b bVar = (b) message.obj;
            synchronized (nt9Var.a) {
                try {
                    if (bVar == null || bVar == null) {
                        bVar.getClass();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
    }

    public nt9() {
        new Handler(Looper.getMainLooper(), new a());
    }

    public static nt9 a() {
        if (b == null) {
            b = new nt9();
        }
        return b;
    }
}
