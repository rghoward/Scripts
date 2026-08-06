package defpackage;

import android.app.Application;
import com.hwpo_training_app.client.ClientApplication;
import com.hwpo_training_app.leaderboards.filter.di.FlitersFlowNavigationModule;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dx4 extends Application implements bk4 {
    public boolean t = false;
    public final i20 u = new i20(new a());

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a {
        public a() {
        }

        public final fe2 a() {
            return new fe2(new zx(), new u00(), new j20(dx4.this), new ly0(), new vw3(), new FlitersFlowNavigationModule(), new an4(), new x97(), new mq5(), new mg7(), new vv9());
        }
    }

    @Override // defpackage.ak4
    public final Object a() {
        return this.u.a();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.t) {
            this.t = true;
            ((ef1) this.u.a()).c((ClientApplication) this);
        }
        super.onCreate();
    }
}
