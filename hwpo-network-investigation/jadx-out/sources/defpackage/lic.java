package defpackage;

import android.os.Process;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lic implements Runnable {
    public final /* synthetic */ int t = 0;
    public final /* synthetic */ Object u;

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ((nic) obj).a.N();
                break;
            default:
                if (((Boolean) ((x0d) obj).c.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                }
                break;
        }
    }

    public lic(nic nicVar, boolean z) {
        this.u = nicVar;
    }
}
