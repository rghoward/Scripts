package defpackage;

import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kx4 extends FirebaseMessagingService implements bk4 {
    public volatile zd9 t;
    public final Object u = new Object();
    public boolean v = false;

    @Override // defpackage.ak4
    public final Object a() {
        if (this.t == null) {
            synchronized (this.u) {
                try {
                    if (this.t == null) {
                        this.t = new zd9(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.t.a();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.v) {
            this.v = true;
            ((f14) a()).a((com.hwpo_training_app.host.fcm.FirebaseMessagingService) this);
        }
        super.onCreate();
    }
}
