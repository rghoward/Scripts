package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class unb implements vnb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3, types: [h72] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, ly6] */
    /* JADX WARN: Type inference failed for: r6v5, types: [h72] */
    @Override // defpackage.vnb
    public final gk8 a(View view) {
        h72 h72Var;
        ou7 ou7Var;
        ?? ly6Var;
        c37<Context, zz9<Float>> c37Var = dob.a;
        h72 h72Var2 = ff3.t;
        o7a o7aVar = ss.F;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h72Var = (h72) ss.F.getValue();
        } else {
            h72Var = ss.G.get();
            if (h72Var == null) {
                aa0.c("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        h72 h72VarC0 = h72Var.c0(h72Var2);
        xx6 xx6Var = (xx6) h72VarC0.d0(xx6.a.t);
        if (xx6Var != null) {
            ou7Var = new ou7(xx6Var);
            aq5 aq5Var = ou7Var.u;
            synchronized (aq5Var.a) {
                aq5Var.d = false;
                g2b g2bVar = g2b.a;
            }
        } else {
            ou7Var = null;
        }
        gl8 gl8Var = new gl8();
        jy6 jy6Var = (jy6) h72VarC0.d0(jy6.a.t);
        ?? r4 = jy6Var;
        if (jy6Var == null) {
            ly6Var = new ly6(view.getContext().getApplicationContext());
            gl8Var.t = ly6Var;
        }
        if (ou7Var != null) {
            r4 = ly6Var;
            h72Var2 = ou7Var;
        }
        r4 = ly6Var;
        h72 h72VarC1 = h72VarC0.c0(h72Var2).c0(r4);
        gk8 gk8Var = new gk8(h72VarC1);
        synchronized (gk8Var.c) {
            gk8Var.t = true;
            g2b g2bVar2 = g2b.a;
        }
        o02 o02VarA = u72.a(h72VarC1);
        m76 m76VarA = vib.a(view);
        s66 lifecycle = m76VarA != null ? m76VarA.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new znb(view, gk8Var));
            lifecycle.a(new aob(o02VarA, ou7Var, gk8Var, gl8Var));
            return gk8Var;
        }
        uc5.c("ViewTreeLifecycleOwner not found from " + view);
        fl.a();
        return null;
    }
}
