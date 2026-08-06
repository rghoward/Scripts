package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cu8 {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((kt8) message.obj).a();
            return true;
        }
    }

    public final synchronized void a(kt8<?> kt8Var, boolean z) {
        try {
            if (this.a || z) {
                this.b.obtainMessage(1, kt8Var).sendToTarget();
            } else {
                this.a = true;
                kt8Var.a();
                this.a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
