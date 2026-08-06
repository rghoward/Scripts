package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x7a implements ComponentCallbacks2 {
    public final WeakReference<ti8> t;
    public Context u;
    public y97 v;
    public boolean w;
    public boolean x = true;

    public x7a(ti8 ti8Var) {
        this.t = new WeakReference<>(ti8Var);
    }

    public final synchronized void a() {
        y97 mx1Var;
        try {
            ti8 ti8Var = this.t.get();
            if (ti8Var == null) {
                b();
            } else if (this.v == null) {
                if (ti8Var.d.b) {
                    Context context = ti8Var.a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || vz1.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        mx1Var = new mx1();
                    } else {
                        try {
                            mx1Var = new ej8(connectivityManager, this);
                        } catch (Exception unused) {
                            mx1Var = new mx1();
                        }
                    }
                } else {
                    mx1Var = new mx1();
                }
                this.v = mx1Var;
                this.x = mx1Var.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.w) {
                return;
            }
            this.w = true;
            Context context = this.u;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            y97 y97Var = this.v;
            if (y97Var != null) {
                y97Var.shutdown();
            }
            this.t.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (this.t.get() == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        ti8 ti8Var = this.t.get();
        if (ti8Var != null) {
            ar6 ar6Var = (ar6) ti8Var.c.getValue();
            if (ar6Var != null) {
                ar6Var.a(i);
            }
        } else {
            b();
        }
    }
}
