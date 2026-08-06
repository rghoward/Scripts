package defpackage;

import android.app.Application;
import android.app.Service;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zd9 implements ak4<Object> {
    public final Service t;
    public ee2 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        de2 a();
    }

    public zd9(Service service) {
        this.t = service;
    }

    @Override // defpackage.ak4
    public final Object a() {
        if (this.u == null) {
            Application application = this.t.getApplication();
            dx0.b(application instanceof ak4, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            this.u = new ee2(((a) kl3.b(a.class, application)).a().a);
        }
        return this.u;
    }
}
