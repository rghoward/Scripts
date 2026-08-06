package defpackage;

import android.util.Log;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fh9 implements s02 {
    @Override // defpackage.s02
    public final Object a(r9a r9aVar) {
        boolean z;
        if (r9aVar.n()) {
            ga2 ga2Var = (ga2) r9aVar.j();
            zd6 zd6Var = zd6.t;
            zd6Var.c("Crashlytics report successfully enqueued to DataTransport: " + ga2Var.c());
            File fileB = ga2Var.b();
            z = true;
            if (fileB.delete()) {
                zd6Var.c("Deleted report file: " + fileB.getPath());
            } else {
                zd6Var.f("Crashlytics could not delete report file: " + fileB.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", r9aVar.i());
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
