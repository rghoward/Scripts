package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j76 implements t66, l76 {
    public final HashSet t = new HashSet();
    public final s66 u;

    public j76(s66 s66Var) {
        this.u = s66Var;
        s66Var.a(this);
    }

    @Override // defpackage.t66
    public final void a(k76 k76Var) {
        this.t.remove(k76Var);
    }

    @Override // defpackage.t66
    public final void b(k76 k76Var) {
        this.t.add(k76Var);
        s66 s66Var = this.u;
        if (s66Var.b() == s66.b.t) {
            k76Var.f();
        } else if (s66Var.b().compareTo(s66.b.w) >= 0) {
            k76Var.k();
        } else {
            k76Var.a();
        }
    }

    @qh7(s66.a.ON_DESTROY)
    public void onDestroy(m76 m76Var) {
        ArrayList arrayListE = l6b.e(this.t);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((k76) obj).f();
        }
        m76Var.getLifecycle().c(this);
    }

    @qh7(s66.a.ON_START)
    public void onStart(m76 m76Var) {
        ArrayList arrayListE = l6b.e(this.t);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((k76) obj).k();
        }
    }

    @qh7(s66.a.ON_STOP)
    public void onStop(m76 m76Var) {
        ArrayList arrayListE = l6b.e(this.t);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((k76) obj).a();
        }
    }
}
