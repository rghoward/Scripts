package defpackage;

import android.util.Log;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b92 implements e5a, lh7 {
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public b92(j04 j04Var, e41 e41Var) {
        this.t = j04Var;
        this.u = e41Var;
    }

    @Override // defpackage.e5a
    public r9a b(Object obj) {
        Boolean bool = (Boolean) obj;
        d92 d92Var = (d92) this.u;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            se2 se2Var = d92Var.b;
            if (zBooleanValue) {
                se2Var.f.d(null);
                return ((r9a) this.t).o(d92Var.e.a, new a92(this));
            }
            se2Var.getClass();
            aa0.c("An invalid data collection token was used.");
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        ey3 ey3Var = d92Var.g;
        Iterator it = ey3.e(ey3Var.c.listFiles(d92.r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        ey3 ey3Var2 = d92Var.m.b.b;
        fa2.a(ey3.e(ey3Var2.e.listFiles()));
        fa2.a(ey3.e(ey3Var2.f.listFiles()));
        fa2.a(ey3.e(ey3Var2.g.listFiles()));
        d92Var.q.d(null);
        return caa.e(null);
    }

    @Override // defpackage.lh7
    public void d(Exception exc) {
        j04 j04Var = (j04) this.t;
        l92 l92Var = j04Var.a;
        l92Var.o.a.b(new h92(l92Var, System.currentTimeMillis() - l92Var.d, "getToken task failed"));
        j04Var.b(exc);
        e41 e41Var = (e41) this.u;
        if (e41Var.s() instanceof kc7) {
            e41Var.resumeWith(new av8.a(exc));
        }
    }

    public b92(d92 d92Var, r9a r9aVar) {
        this.u = d92Var;
        this.t = r9aVar;
    }
}
