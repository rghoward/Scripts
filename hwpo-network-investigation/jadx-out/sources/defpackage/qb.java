package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qb extends n50<t23> {
    public final xb.c f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m.e<t23> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(t23 t23Var, t23 t23Var2) {
            t23 t23Var3 = t23Var;
            t23 t23Var4 = t23Var2;
            if ((t23Var3 instanceof or7) && (t23Var4 instanceof or7)) {
                return true;
            }
            if ((t23Var3 instanceof rc) && (t23Var4 instanceof rc)) {
                return ((rc) t23Var3).equals((rc) t23Var4);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(t23 t23Var, t23 t23Var2) {
            t23 t23Var3 = t23Var;
            t23 t23Var4 = t23Var2;
            if ((t23Var3 instanceof or7) && (t23Var4 instanceof or7)) {
                return true;
            }
            return (t23Var3 instanceof rc) && (t23Var4 instanceof rc) && ((rc) t23Var3).a == ((rc) t23Var4).a;
        }
    }

    public qb(xb.b bVar, xb.c cVar) {
        super(new a());
        this.f = cVar;
        za<List<T>> zaVar = this.d;
        int i = 0;
        zaVar.b(new e93(new lc(), new pc(3), new mc(i, bVar), qc.u));
        zaVar.b(new e93(new sc(0), new uc(3), new tc(i), vc.u));
    }

    @Override // defpackage.n50, androidx.recyclerview.widget.RecyclerView.f
    public final void k(RecyclerView.e0 e0Var, int i, List<Object> list) {
        list.getClass();
        super.k(e0Var, i, list);
        if (this.e.f.get(i) instanceof or7) {
            return;
        }
        this.f.invoke(Integer.valueOf(i));
    }
}
