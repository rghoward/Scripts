package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vyc implements Handler.Callback {
    public final /* synthetic */ j0d t;

    public /* synthetic */ vyc(j0d j0dVar) {
        this.t = j0dVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            j0d j0dVar = this.t;
            synchronized (j0dVar.x) {
                try {
                    suc sucVar = (suc) message.obj;
                    vwc vwcVar = (vwc) j0dVar.x.get(sucVar);
                    if (vwcVar != null && vwcVar.t.isEmpty()) {
                        if (vwcVar.v) {
                            suc sucVar2 = vwcVar.x;
                            j0d j0dVar2 = vwcVar.z;
                            j0dVar2.z.removeMessages(1, sucVar2);
                            j0dVar2.A.c(j0dVar2.y, vwcVar);
                            vwcVar.v = false;
                            vwcVar.u = 2;
                        }
                        j0dVar.x.remove(sucVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        j0d j0dVar3 = this.t;
        synchronized (j0dVar3.x) {
            try {
                suc sucVar3 = (suc) message.obj;
                vwc vwcVar2 = (vwc) j0dVar3.x.get(sucVar3);
                if (vwcVar2 != null && vwcVar2.u == 3) {
                    String strValueOf = String.valueOf(sucVar3);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = vwcVar2.y;
                    if (componentName == null) {
                        sucVar3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = sucVar3.b;
                        a78.g(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    vwcVar2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
