package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kdc implements ServiceConnection {
    public final int t;
    public final /* synthetic */ ik0 u;

    public kdc(ik0 ik0Var, int i) {
        this.u = ik0Var;
        this.t = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        ik0 ik0Var = this.u;
        if (iBinder == null) {
            synchronized (ik0Var.z) {
                i = ik0Var.G;
            }
            if (i == 3) {
                ik0Var.O = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            e9c e9cVar = ik0Var.y;
            e9cVar.sendMessage(e9cVar.obtainMessage(i2, ik0Var.Q.get(), 16));
            return;
        }
        synchronized (ik0Var.A) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                ik0Var.B = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yxb)) ? new yxb(iBinder) : (yxb) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        ik0 ik0Var2 = this.u;
        int i3 = this.t;
        ik0Var2.getClass();
        agc agcVar = new agc(ik0Var2, 0, null);
        e9c e9cVar2 = ik0Var2.y;
        e9cVar2.sendMessage(e9cVar2.obtainMessage(7, i3, -1, agcVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ik0 ik0Var = this.u;
        synchronized (ik0Var.A) {
            ik0Var.B = null;
        }
        ik0 ik0Var2 = this.u;
        int i = this.t;
        e9c e9cVar = ik0Var2.y;
        e9cVar.sendMessage(e9cVar.obtainMessage(6, i, 1));
    }
}
