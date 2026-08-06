package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lq8 implements ComponentCallbacks2, k76 {
    public static final oq8 D;
    public final gx1 A;
    public final CopyOnWriteArrayList<kq8<Object>> B;
    public final oq8 C;
    public final com.bumptech.glide.a t;
    public final Context u;
    public final t66 v;
    public final qq8 w;
    public final nq8 x;
    public final m9a y;
    public final a z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            lq8 lq8Var = lq8.this;
            lq8Var.v.b(lq8Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements gx1.a {
        public final qq8 a;

        public b(qq8 qq8Var) {
            this.a = qq8Var;
        }

        @Override // gx1.a
        public final void a(boolean z) {
            if (z) {
                synchronized (lq8.this) {
                    qq8 qq8Var = this.a;
                    ArrayList arrayListE = l6b.e(qq8Var.a);
                    int size = arrayListE.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListE.get(i);
                        i++;
                        kp8 kp8Var = (kp8) obj;
                        if (!kp8Var.c() && !kp8Var.j()) {
                            kp8Var.clear();
                            if (qq8Var.c) {
                                qq8Var.b.add(kp8Var);
                            } else {
                                kp8Var.k();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        oq8 oq8VarC = new oq8().c(Bitmap.class);
        oq8VarC.G = true;
        D = oq8VarC;
        new oq8().c(xl4.class).G = true;
    }

    public lq8(com.bumptech.glide.a aVar, t66 t66Var, nq8 nq8Var, Context context) {
        oq8 oq8Var;
        qq8 qq8Var = new qq8();
        hx1 hx1Var = aVar.y;
        this.y = new m9a();
        a aVar2 = new a();
        this.z = aVar2;
        this.t = aVar;
        this.v = t66Var;
        this.x = nq8Var;
        this.w = qq8Var;
        this.u = context;
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(qq8Var);
        ((pq2) hx1Var).getClass();
        boolean z = vz1.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        gx1 oq2Var = z ? new oq2(applicationContext, bVar) : new nd7();
        this.A = oq2Var;
        synchronized (aVar.z) {
            if (aVar.z.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.z.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            t66Var.b(this);
        } else {
            l6b.f().post(aVar2);
        }
        t66Var.b(oq2Var);
        this.B = new CopyOnWriteArrayList<>(aVar.v.e);
        c cVar = aVar.v;
        synchronized (cVar) {
            try {
                if (cVar.j == null) {
                    ((com.bumptech.glide.b.a) cVar.d).getClass();
                    oq8 oq8Var2 = new oq8();
                    oq8Var2.G = true;
                    cVar.j = oq8Var2;
                }
                oq8Var = cVar.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            oq8 oq8VarClone = oq8Var.clone();
            if (oq8VarClone.G && !oq8VarClone.H) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            oq8VarClone.H = true;
            oq8VarClone.G = true;
            this.C = oq8VarClone;
        }
    }

    @Override // defpackage.k76
    public final synchronized void a() {
        this.y.a();
        m();
    }

    @Override // defpackage.k76
    public final synchronized void f() {
        int i;
        this.y.f();
        synchronized (this) {
            try {
                ArrayList arrayListE = l6b.e(this.y.t);
                int size = arrayListE.size();
                i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListE.get(i2);
                    i2++;
                    l((j9a) obj);
                }
                this.y.t.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        qq8 qq8Var = this.w;
        ArrayList arrayListE2 = l6b.e(qq8Var.a);
        int size2 = arrayListE2.size();
        while (i < size2) {
            Object obj2 = arrayListE2.get(i);
            i++;
            qq8Var.a((kp8) obj2);
        }
        qq8Var.b.clear();
        this.v.a(this);
        this.v.a(this.A);
        l6b.f().removeCallbacks(this.z);
        com.bumptech.glide.a aVar = this.t;
        synchronized (aVar.z) {
            if (!aVar.z.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            aVar.z.remove(this);
        }
    }

    @Override // defpackage.k76
    public final synchronized void k() {
        n();
        this.y.k();
    }

    public final void l(j9a<?> j9aVar) {
        if (j9aVar == null) {
            return;
        }
        boolean zO = o(j9aVar);
        kp8 kp8VarB = j9aVar.b();
        if (zO) {
            return;
        }
        com.bumptech.glide.a aVar = this.t;
        synchronized (aVar.z) {
            try {
                ArrayList arrayList = aVar.z;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((lq8) obj).o(j9aVar)) {
                        return;
                    }
                }
                if (kp8VarB != null) {
                    j9aVar.e(null);
                    kp8VarB.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void m() {
        qq8 qq8Var = this.w;
        qq8Var.c = true;
        ArrayList arrayListE = l6b.e(qq8Var.a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            kp8 kp8Var = (kp8) obj;
            if (kp8Var.isRunning()) {
                kp8Var.b();
                qq8Var.b.add(kp8Var);
            }
        }
    }

    public final synchronized void n() {
        qq8 qq8Var = this.w;
        int i = 0;
        qq8Var.c = false;
        ArrayList arrayListE = l6b.e(qq8Var.a);
        int size = arrayListE.size();
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            kp8 kp8Var = (kp8) obj;
            if (!kp8Var.c() && !kp8Var.isRunning()) {
                kp8Var.k();
            }
        }
        qq8Var.b.clear();
    }

    public final synchronized boolean o(j9a<?> j9aVar) {
        kp8 kp8VarB = j9aVar.b();
        if (kp8VarB == null) {
            return true;
        }
        if (!this.w.a(kp8VarB)) {
            return false;
        }
        this.y.t.remove(j9aVar);
        j9aVar.e(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.w + ", treeNode=" + this.x + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
