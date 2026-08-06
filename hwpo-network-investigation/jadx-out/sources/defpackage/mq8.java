package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.g;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mq8 implements Handler.Callback {
    public static final a x = new a();
    public volatile lq8 t;
    public final b u;
    public final hh4 v;
    public final q76 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements b {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
    }

    public mq8() {
        new n30();
        a aVar = x;
        this.u = aVar;
        this.w = new q76(aVar);
        this.v = (vt4.f && vt4.e) ? new e34() : new c43();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final lq8 b(Context context) {
        if (context == null) {
            z90.a("You cannot start a load on a null Context");
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof g) {
                g gVar = (g) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(gVar.getApplicationContext());
                }
                if (gVar.isDestroyed()) {
                    z90.a("You cannot start a load for a destroyed activity");
                    return null;
                }
                this.v.a(gVar);
                Activity activityA = a(gVar);
                boolean z = activityA == null || !activityA.isFinishing();
                com.bumptech.glide.a aVarA = com.bumptech.glide.a.a(gVar.getApplicationContext());
                q76 q76Var = this.w;
                s66 lifecycle = gVar.getLifecycle();
                gVar.getSupportFragmentManager();
                q76Var.getClass();
                l6b.a();
                l6b.a();
                lq8 lq8Var = (lq8) q76Var.a.get(lifecycle);
                if (lq8Var != null) {
                    return lq8Var;
                }
                j76 j76Var = new j76(lifecycle);
                b bVar = q76Var.b;
                q76.a aVar = new q76.a();
                ((a) bVar).getClass();
                lq8 lq8Var2 = new lq8(aVarA, j76Var, aVar, gVar);
                q76Var.a.put(lifecycle, lq8Var2);
                j76Var.b(new p76(q76Var, lifecycle));
                if (z) {
                    lq8Var2.k();
                }
                return lq8Var2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.t == null) {
            synchronized (this) {
                try {
                    if (this.t == null) {
                        com.bumptech.glide.a aVarA2 = com.bumptech.glide.a.a(context.getApplicationContext());
                        b bVar2 = this.u;
                        m20 m20Var = new m20();
                        e00 e00Var = new e00();
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar2).getClass();
                        this.t = new lq8(aVarA2, m20Var, e00Var, applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.t;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
