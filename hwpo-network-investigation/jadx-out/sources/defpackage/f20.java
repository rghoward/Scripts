package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.fragment.app.g;
import androidx.fragment.app.k;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f20 implements Application.ActivityLifecycleCallbacks {
    public static final dp K = dp.d();
    public static volatile f20 L;
    public final AtomicInteger A;
    public final oxa B;
    public final rv1 C;
    public final oh7 D;
    public final boolean E;
    public zoa F;
    public zoa G;
    public o20 H;
    public boolean I;
    public boolean J;
    public final WeakHashMap<Activity, Boolean> t;
    public final WeakHashMap<Activity, fh4> u;
    public final WeakHashMap<Activity, eg4> v;
    public final WeakHashMap<Activity, Trace> w;
    public final HashMap x;
    public final HashSet y;
    public final HashSet z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void onUpdateAppState(o20 o20Var);
    }

    public f20(oxa oxaVar, oh7 oh7Var) {
        rv1 rv1VarE = rv1.e();
        dp dpVar = fh4.e;
        this.t = new WeakHashMap<>();
        this.u = new WeakHashMap<>();
        this.v = new WeakHashMap<>();
        this.w = new WeakHashMap<>();
        this.x = new HashMap();
        this.y = new HashSet();
        this.z = new HashSet();
        this.A = new AtomicInteger(0);
        this.H = o20.BACKGROUND;
        this.I = false;
        this.J = true;
        this.B = oxaVar;
        this.D = oh7Var;
        this.C = rv1VarE;
        this.E = true;
    }

    public static f20 a() {
        if (L == null) {
            synchronized (f20.class) {
                try {
                    if (L == null) {
                        L = new f20(oxa.L, new oh7());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return L;
    }

    public final void b(String str) {
        synchronized (this.x) {
            try {
                Long l = (Long) this.x.get(str);
                HashMap map = this.x;
                if (l == null) {
                    map.put(str, 1L);
                } else {
                    map.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Activity activity) {
        rk7<eh4> rk7Var;
        WeakHashMap<Activity, Trace> weakHashMap = this.w;
        Trace trace = weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        fh4 fh4Var = this.u.get(activity);
        dh4 dh4Var = fh4Var.b;
        HashMap map = fh4Var.c;
        dp dpVar = fh4.e;
        if (fh4Var.d) {
            if (!map.isEmpty()) {
                dpVar.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            rk7<eh4> rk7VarA = fh4Var.a();
            try {
                dh4Var.a(fh4Var.a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                dpVar.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                rk7VarA = new rk7<>();
            }
            dh4.a aVar = dh4Var.a;
            SparseIntArray[] sparseIntArrayArr = aVar.b;
            aVar.b = new SparseIntArray[9];
            fh4Var.d = false;
            rk7Var = rk7VarA;
        } else {
            dpVar.a("Cannot stop because no recording was started");
            rk7Var = new rk7<>();
        }
        if (rk7Var.b()) {
            a69.a(trace, rk7Var.a());
            trace.stop();
        } else {
            K.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void d(String str, zoa zoaVar, zoa zoaVar2) {
        if (this.C.n()) {
            zra.a aVarR = zra.R();
            aVarR.s(str);
            aVarR.q(zoaVar.t);
            aVarR.r(zoaVar.b(zoaVar2));
            iv7 iv7VarA = SessionManager.getInstance().perfSession().a();
            aVarR.n();
            zra.D((zra) aVarR.u, iv7VarA);
            int andSet = this.A.getAndSet(0);
            synchronized (this.x) {
                try {
                    HashMap map = this.x;
                    aVarR.n();
                    zra.z((zra) aVarR.u).putAll(map);
                    if (andSet != 0) {
                        aVarR.p(andSet, "_tsns");
                    }
                    this.x.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.B.c(aVarR.l(), o20.FOREGROUND_BACKGROUND);
        }
    }

    public final void e(Activity activity) {
        if (this.E && this.C.n()) {
            fh4 fh4Var = new fh4(activity);
            this.u.put(activity, fh4Var);
            if (activity instanceof g) {
                eg4 eg4Var = new eg4(this.D, this.B, this, fh4Var);
                this.v.put(activity, eg4Var);
                k kVar = ((g) activity).getSupportFragmentManager().p;
                kVar.getClass();
                kVar.b.add(new k.a(eg4Var, true));
            }
        }
    }

    public final void f(o20 o20Var) {
        this.H = o20Var;
        synchronized (this.y) {
            try {
                Iterator it = this.y.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.H);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.u.remove(activity);
        WeakHashMap<Activity, eg4> weakHashMap = this.v;
        if (weakHashMap.containsKey(activity)) {
            ((g) activity).getSupportFragmentManager().l0(weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.t.isEmpty()) {
            this.D.getClass();
            this.F = new zoa();
            this.t.put(activity, Boolean.TRUE);
            if (this.J) {
                f(o20.FOREGROUND);
                synchronized (this.z) {
                    try {
                        for (a aVar : this.z) {
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.J = false;
            } else {
                d("_bs", this.G, this.F);
                f(o20.FOREGROUND);
            }
        } else {
            this.t.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.E && this.C.n()) {
                if (!this.u.containsKey(activity)) {
                    e(activity);
                }
                this.u.get(activity).b();
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.B, this.D, this);
                trace.start();
                this.w.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.E) {
                c(activity);
            }
            if (this.t.containsKey(activity)) {
                this.t.remove(activity);
                if (this.t.isEmpty()) {
                    this.D.getClass();
                    zoa zoaVar = new zoa();
                    this.G = zoaVar;
                    d("_fs", this.F, zoaVar);
                    f(o20.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
