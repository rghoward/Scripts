package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r50 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ r50(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.t) {
            case 0:
                u50 u50Var = (u50) this.u;
                hn6 hn6Var = (hn6) this.v;
                u50Var.c.a();
                w50 w50Var = u50Var.b;
                synchronized (w50Var.a) {
                    w50Var.b();
                    hn6Var.run();
                    break;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.u;
                t9a t9aVar = (t9a) this.v;
                try {
                    t9aVar.b(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    t9aVar.a(e);
                    return;
                }
        }
    }
}
