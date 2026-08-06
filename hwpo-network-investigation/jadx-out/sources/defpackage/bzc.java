package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bzc implements ServiceConnection {
    public int t = 0;
    public final Messenger u;
    public p0d v;
    public final ArrayDeque w;
    public final SparseArray x;
    public final /* synthetic */ q5d y;

    public bzc(q5d q5dVar) {
        this.y = q5dVar;
        rec recVar = new rec(Looper.getMainLooper(), new Handler.Callback() { // from class: usc
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                bzc bzcVar = this.t;
                synchronized (bzcVar) {
                    try {
                        u2d u2dVar = (u2d) bzcVar.x.get(i);
                        if (u2dVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        bzcVar.x.remove(i);
                        bzcVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            u2dVar.c(new t3d("Not supported by GmsCore", null));
                            return true;
                        }
                        u2dVar.a(data);
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.u = new Messenger(recVar);
        this.w = new ArrayDeque();
        this.x = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.t;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.t = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.t = 4;
            fx1.b().c(this.y.a, this);
            t3d t3dVar = new t3d(str, securityException);
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                ((u2d) it.next()).c(t3dVar);
            }
            this.w.clear();
            int i2 = 0;
            while (true) {
                int size = this.x.size();
                SparseArray sparseArray = this.x;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((u2d) sparseArray.valueAt(i2)).c(t3dVar);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.t == 2 && this.w.isEmpty() && this.x.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.t = 3;
                fx1.b().c(this.y.a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(u2d u2dVar) {
        int i = this.t;
        if (i != 0) {
            if (i == 1) {
                this.w.add(u2dVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.w.add(u2dVar);
            this.y.b.execute(new smc(this));
            return true;
        }
        this.w.add(u2dVar);
        if (this.t != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.t = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (fx1.b().a(this.y.a, intent, this, 1)) {
                this.y.b.schedule(new Runnable() { // from class: soc
                    @Override // java.lang.Runnable
                    public final void run() {
                        bzc bzcVar = this.t;
                        synchronized (bzcVar) {
                            if (bzcVar.t == 1) {
                                bzcVar.a("Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.y.b.execute(new Runnable() { // from class: okc
            @Override // java.lang.Runnable
            public final void run() {
                bzc bzcVar = this.t;
                IBinder iBinder2 = iBinder;
                synchronized (bzcVar) {
                    if (iBinder2 == null) {
                        bzcVar.a("Null service connection");
                        return;
                    }
                    try {
                        bzcVar.v = new p0d(iBinder2);
                        bzcVar.t = 2;
                        bzcVar.y.b.execute(new smc(bzcVar));
                    } catch (RemoteException e) {
                        bzcVar.a(e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.y.b.execute(new Runnable() { // from class: pqc
            @Override // java.lang.Runnable
            public final void run() {
                this.t.a("Service disconnected");
            }
        });
    }
}
