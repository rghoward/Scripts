package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b8a implements kt4 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements kt4.a {
        public Message a;

        public final void a() {
            this.a = null;
            ArrayList arrayList = b8a.b;
            synchronized (arrayList) {
                try {
                    if (arrayList.size() < 50) {
                        arrayList.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            Message message = this.a;
            message.getClass();
            message.sendToTarget();
            a();
        }
    }

    public b8a(Handler handler) {
        this.a = handler;
    }

    public static a o() {
        a aVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                aVar = arrayList.isEmpty() ? new a() : (a) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // defpackage.kt4
    public final a a(int i, int i2, int i3) {
        a aVarO = o();
        aVarO.a = this.a.obtainMessage(i, i2, i3);
        return aVarO;
    }

    @Override // defpackage.kt4
    public final boolean b(kt4.a aVar) {
        a aVar2 = (a) aVar;
        Message message = aVar2.a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.a.sendMessageAtFrontOfQueue(message);
        aVar2.a();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // defpackage.kt4
    public final a c(int i, int i2, Object obj) {
        a aVarO = o();
        aVarO.a = this.a.obtainMessage(i, i2, 0, obj);
        return aVarO;
    }

    @Override // defpackage.kt4
    public final boolean d(int i, int i2) {
        return this.a.sendEmptyMessageDelayed(i, i2);
    }

    @Override // defpackage.kt4
    public final boolean e(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // defpackage.kt4
    public final a f(int i) {
        a aVarO = o();
        aVarO.a = this.a.obtainMessage(i);
        return aVarO;
    }

    @Override // defpackage.kt4
    public final void g() {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.kt4
    public final boolean h(long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // defpackage.kt4
    public final boolean i(int i) {
        return this.a.hasMessages(i);
    }

    @Override // defpackage.kt4
    public final boolean j(Runnable runnable) {
        return this.a.postDelayed(runnable, 1000L);
    }

    @Override // defpackage.kt4
    public final boolean k(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // defpackage.kt4
    public final void l(int i) {
        xl7.g(i != 0);
        this.a.removeMessages(i);
    }

    @Override // defpackage.kt4
    public final a m(int i, Object obj) {
        a aVarO = o();
        aVarO.a = this.a.obtainMessage(i, obj);
        return aVarO;
    }

    @Override // defpackage.kt4
    public final Looper n() {
        return this.a.getLooper();
    }
}
