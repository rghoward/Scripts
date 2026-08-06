package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k9 implements Runnable {
    public final /* synthetic */ int t = 0;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public k9(tvc tvcVar, q1d q1dVar) {
        this.u = q1dVar;
        this.v = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                try {
                    Method method = l9.d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        l9.e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            default:
                tvc tvcVar = (tvc) obj2;
                jgc jgcVar = tvcVar.d;
                tkc tkcVar = tvcVar.a;
                if (jgcVar == null) {
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.f.a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    jgcVar.N((q1d) obj);
                    break;
                } catch (RemoteException e2) {
                    thc thcVar2 = tkcVar.f;
                    tkc.m(thcVar2);
                    thcVar2.f.b(e2, "Failed to reset data on the service: remote exception");
                }
                tvcVar.t();
                return;
        }
    }

    public k9(Object obj, Object obj2) {
        this.u = obj;
        this.v = obj2;
    }
}
