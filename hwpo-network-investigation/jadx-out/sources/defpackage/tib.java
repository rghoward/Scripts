package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tib implements View.OnAttachStateChangeListener {
    public final View t;
    public qib u;
    public dz9 v;
    public rib w;
    public boolean x;

    public tib(View view) {
        this.t = view;
    }

    public final synchronized qib a(vv2 vv2Var) {
        qib qibVar = this.u;
        if (qibVar != null) {
            Bitmap.Config[] configArr = v.a;
            if (xj5.a(Looper.myLooper(), Looper.getMainLooper()) && this.x) {
                this.x = false;
                return qibVar;
            }
        }
        dz9 dz9Var = this.v;
        if (dz9Var != null) {
            dz9Var.k(null);
        }
        this.v = null;
        qib qibVar2 = new qib(this.t, vv2Var);
        this.u = qibVar2;
        return qibVar2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        rib ribVar = this.w;
        if (ribVar == null) {
            return;
        }
        this.x = true;
        ribVar.t.a(ribVar.u);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        rib ribVar = this.w;
        if (ribVar != null) {
            s66 s66Var = ribVar.w;
            ribVar.x.k(null);
            pib<?> pibVar = ribVar.v;
            if (pibVar instanceof l76) {
                s66Var.c((l76) pibVar);
            }
            s66Var.c(ribVar);
        }
    }
}
