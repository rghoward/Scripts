package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lr0 implements ServiceConnection {
    public boolean t = false;
    public final LinkedBlockingQueue u = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        a78.f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.t) {
            aa0.c("Cannot call get on this connection more than once");
            return null;
        }
        this.t = true;
        IBinder iBinder = (IBinder) this.u.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.u.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
