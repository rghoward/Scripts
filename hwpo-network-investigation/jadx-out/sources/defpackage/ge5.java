package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ge5 extends pmb.b implements Runnable, pg7, View.OnAttachStateChangeListener {
    public final fnb v;
    public boolean w;
    public boolean x;
    public umb y;

    public ge5(fnb fnbVar) {
        super(!fnbVar.t ? 1 : 0);
        this.v = fnbVar;
    }

    @Override // pmb.b
    public final void a(pmb pmbVar) {
        this.w = false;
        this.x = false;
        umb umbVar = this.y;
        if (pmbVar.a.b() > 0 && umbVar != null) {
            umb.q qVar = umbVar.a;
            fnb fnbVar = this.v;
            fnbVar.s.f(mnb.a(qVar.i(8)));
            fnbVar.r.f(mnb.a(qVar.i(8)));
            fnb.b(fnbVar, umbVar);
        }
        this.y = null;
    }

    @Override // defpackage.pg7
    public final umb b(View view, umb umbVar) {
        this.y = umbVar;
        fnb fnbVar = this.v;
        vab vabVar = fnbVar.r;
        umb.q qVar = umbVar.a;
        vabVar.f(mnb.a(qVar.i(8)));
        if (this.w) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.x) {
            fnbVar.s.f(mnb.a(qVar.i(8)));
            fnb.b(fnbVar, umbVar);
        }
        return fnbVar.t ? umb.b : umbVar;
    }

    @Override // pmb.b
    public final void c(pmb pmbVar) {
        this.w = true;
        this.x = true;
    }

    @Override // pmb.b
    public final umb d(umb umbVar, List<pmb> list) {
        fnb fnbVar = this.v;
        fnb.b(fnbVar, umbVar);
        return fnbVar.t ? umb.b : umbVar;
    }

    @Override // pmb.b
    public final pmb.a e(pmb pmbVar, pmb.a aVar) {
        this.w = false;
        return aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.w) {
            this.w = false;
            this.x = false;
            umb umbVar = this.y;
            if (umbVar != null) {
                fnb fnbVar = this.v;
                fnbVar.s.f(mnb.a(umbVar.a.i(8)));
                fnb.b(fnbVar, umbVar);
                this.y = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
