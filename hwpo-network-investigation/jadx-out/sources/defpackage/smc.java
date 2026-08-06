package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class smc implements Runnable {
    public final /* synthetic */ bzc t;

    public /* synthetic */ smc(bzc bzcVar) {
        this.t = bzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            final bzc bzcVar = this.t;
            synchronized (bzcVar) {
                try {
                    if (bzcVar.t != 2) {
                        return;
                    }
                    if (bzcVar.w.isEmpty()) {
                        bzcVar.c();
                        return;
                    }
                    final u2d u2dVar = (u2d) bzcVar.w.poll();
                    bzcVar.x.put(u2dVar.a, u2dVar);
                    bzcVar.y.b.schedule(new Runnable() { // from class: yuc
                        @Override // java.lang.Runnable
                        public final void run() {
                            bzc bzcVar2 = bzcVar;
                            int i = u2dVar.a;
                            synchronized (bzcVar2) {
                                u2d u2dVar2 = (u2d) bzcVar2.x.get(i);
                                if (u2dVar2 != null) {
                                    Log.w("MessengerIpcClient", "Timing out request: " + i);
                                    bzcVar2.x.remove(i);
                                    u2dVar2.c(new t3d("Timed out waiting for response", null));
                                    bzcVar2.c();
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(u2dVar)));
                    }
                    q5d q5dVar = bzcVar.y;
                    Messenger messenger = bzcVar.u;
                    int i = u2dVar.c;
                    Context context = q5dVar.a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = u2dVar.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", u2dVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", u2dVar.d);
                    messageObtain.setData(bundle);
                    try {
                        p0d p0dVar = bzcVar.v;
                        Messenger messenger2 = p0dVar.a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            hcc hccVar = p0dVar.b;
                            if (hccVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = hccVar.t;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        bzcVar.a(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
