package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vwc implements ServiceConnection, o1d {
    public final HashMap t;
    public int u;
    public boolean v;
    public IBinder w;
    public final suc x;
    public ComponentName y;
    public final /* synthetic */ j0d z;

    public vwc(j0d j0dVar, suc sucVar) {
        Objects.requireNonNull(j0dVar);
        this.z = j0dVar;
        this.x = sucVar;
        this.t = new HashMap();
        this.u = 2;
    }

    public final ax1 a(String str, Executor executor) {
        try {
            Intent intentA = f5c.a(this.z.y, this.x);
            this.u = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(vac.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                j0d j0dVar = this.z;
                fx1 fx1Var = j0dVar.A;
                Context context = j0dVar.y;
                suc sucVar = this.x;
                boolean zD = fx1Var.d(context, str, intentA, this, 4225, executor);
                this.v = zD;
                if (zD) {
                    j0dVar.z.sendMessageDelayed(j0dVar.z.obtainMessage(1, sucVar), j0dVar.C);
                    return ax1.y;
                }
                this.u = 2;
                try {
                    j0dVar.A.c(j0dVar.y, this);
                } catch (IllegalArgumentException unused) {
                }
                return new ax1(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (d3c e) {
            return e.t;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j0d j0dVar = this.z;
        synchronized (j0dVar.x) {
            try {
                j0dVar.z.removeMessages(1, this.x);
                this.w = iBinder;
                this.y = componentName;
                Iterator it = this.t.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.u = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j0d j0dVar = this.z;
        synchronized (j0dVar.x) {
            try {
                j0dVar.z.removeMessages(1, this.x);
                this.w = null;
                this.y = componentName;
                Iterator it = this.t.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.u = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
