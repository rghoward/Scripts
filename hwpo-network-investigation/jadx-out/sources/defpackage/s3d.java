package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s3d {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final nkc b;
    public boolean g;
    public final Intent h;
    public s1d l;
    public wec m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final roc j = new IBinder.DeathRecipient() { // from class: roc
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            s3d s3dVar = this.a;
            int i = 0;
            s3dVar.b.a("reportBinderDeath", new Object[0]);
            xwc xwcVar = (xwc) s3dVar.i.get();
            nkc nkcVar = s3dVar.b;
            if (xwcVar != null) {
                nkcVar.a("calling onBinderDied", new Object[0]);
                xwcVar.a();
            } else {
                nkcVar.a("%s : Binder has died.", s3dVar.c);
                ArrayList arrayList = s3dVar.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    RemoteException remoteException = new RemoteException(String.valueOf(s3dVar.c).concat(" : Binder has died."));
                    t9a t9aVar = ((rmc) obj).t;
                    if (t9aVar != null) {
                        t9aVar.c(remoteException);
                    }
                }
                s3dVar.d.clear();
            }
            synchronized (s3dVar.f) {
                s3dVar.c();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [roc] */
    public s3d(Context context, nkc nkcVar, Intent intent) {
        this.a = context;
        this.b = nkcVar;
        this.h = intent;
    }

    public static void b(s3d s3dVar, vec vecVar) {
        wec wecVar = s3dVar.m;
        nkc nkcVar = s3dVar.b;
        ArrayList arrayList = s3dVar.d;
        int i = 0;
        if (wecVar != null || s3dVar.g) {
            if (!s3dVar.g) {
                vecVar.run();
                return;
            } else {
                nkcVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(vecVar);
                return;
            }
        }
        nkcVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(vecVar);
        s1d s1dVar = new s1d(s3dVar);
        s3dVar.l = s1dVar;
        s3dVar.g = true;
        if (s3dVar.a.bindService(s3dVar.h, s1dVar, 1)) {
            return;
        }
        nkcVar.a("Failed to bind to the service.", new Object[0]);
        s3dVar.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            q4d q4dVar = new q4d("Failed to bind to the service.");
            t9a t9aVar = ((rmc) obj).t;
            if (t9aVar != null) {
                t9aVar.c(q4dVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((t9a) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
