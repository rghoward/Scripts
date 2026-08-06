package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j0d extends ln4 {
    public final fx1 A;
    public final long B;
    public final long C;
    public final HashMap x;
    public final Context y;
    public volatile bgc z;

    public j0d(Context context, Looper looper) {
        super(0);
        this.x = new HashMap();
        vyc vycVar = new vyc(this);
        this.y = context.getApplicationContext();
        bgc bgcVar = new bgc(looper, vycVar);
        Looper.getMainLooper();
        this.z = bgcVar;
        this.A = fx1.b();
        this.B = 5000L;
        this.C = AudioConstants.MAX_RECORDING_DURATION_MS;
    }

    @Override // defpackage.ln4
    public final ax1 c1(suc sucVar, kdc kdcVar, String str, Executor executor) {
        ax1 ax1VarA;
        HashMap map = this.x;
        synchronized (map) {
            try {
                vwc vwcVar = (vwc) map.get(sucVar);
                if (executor == null) {
                    executor = null;
                }
                if (vwcVar == null) {
                    vwcVar = new vwc(this, sucVar);
                    vwcVar.t.put(kdcVar, kdcVar);
                    ax1VarA = vwcVar.a(str, executor);
                    map.put(sucVar, vwcVar);
                } else {
                    this.z.removeMessages(0, sucVar);
                    if (vwcVar.t.containsKey(kdcVar)) {
                        String string = sucVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    vwcVar.t.put(kdcVar, kdcVar);
                    int i = vwcVar.u;
                    if (i == 1) {
                        kdcVar.onServiceConnected(vwcVar.y, vwcVar.w);
                    } else if (i == 2) {
                        ax1VarA = vwcVar.a(str, executor);
                    }
                    ax1VarA = null;
                }
                if (vwcVar.v) {
                    return ax1.y;
                }
                if (ax1VarA == null) {
                    ax1VarA = new ax1(-1, null, null);
                }
                return ax1VarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ln4
    public final void f1(suc sucVar, ServiceConnection serviceConnection) {
        a78.h(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.x;
        synchronized (map) {
            try {
                vwc vwcVar = (vwc) map.get(sucVar);
                if (vwcVar == null) {
                    String string = sucVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!vwcVar.t.containsKey(serviceConnection)) {
                    String string2 = sucVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                vwcVar.t.remove(serviceConnection);
                if (vwcVar.t.isEmpty()) {
                    this.z.sendMessageDelayed(this.z.obtainMessage(0, sucVar), this.B);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
