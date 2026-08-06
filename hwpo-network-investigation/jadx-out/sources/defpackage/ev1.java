package defpackage;

import com.google.firebase.remoteconfig.internal.b;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev1 implements Callable {
    public final /* synthetic */ gv1 a;
    public final /* synthetic */ b b;

    public /* synthetic */ ev1(gv1 gv1Var, b bVar) {
        this.a = gv1Var;
        this.b = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        gv1 gv1Var = this.a;
        b bVar = this.b;
        sv1 sv1Var = gv1Var.b;
        synchronized (sv1Var) {
            FileOutputStream fileOutputStreamOpenFileOutput = sv1Var.a.openFileOutput(sv1Var.b, 0);
            try {
                fileOutputStreamOpenFileOutput.write(bVar.a.toString().getBytes("UTF-8"));
                fileOutputStreamOpenFileOutput.close();
            } catch (Throwable th) {
                fileOutputStreamOpenFileOutput.close();
                throw th;
            }
        }
        return null;
    }
}
