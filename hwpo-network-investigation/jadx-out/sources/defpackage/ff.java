package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ff extends n50<u23> {
    public final qf.d f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m.e<u23> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(u23 u23Var, u23 u23Var2) {
            u23 u23Var3 = u23Var;
            u23 u23Var4 = u23Var2;
            if ((u23Var3 instanceof nr7) && (u23Var4 instanceof nr7)) {
                return true;
            }
            if ((u23Var3 instanceof fh) && (u23Var4 instanceof fh)) {
                return ((fh) u23Var3).equals((fh) u23Var4);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(u23 u23Var, u23 u23Var2) {
            u23 u23Var3 = u23Var;
            u23 u23Var4 = u23Var2;
            if ((u23Var3 instanceof nr7) && (u23Var4 instanceof nr7)) {
                return true;
            }
            return (u23Var3 instanceof fh) && (u23Var4 instanceof fh) && ((fh) u23Var3).a == ((fh) u23Var4).a;
        }
    }

    public ff(qf.c cVar, qf.d dVar) {
        super(new a());
        this.f = dVar;
        za<List<T>> zaVar = this.d;
        zaVar.b(new e93(new ye(), new bf(3), new ze(cVar, 0), cf.u));
        zaVar.b(new e93(new dg(0), new fg(3), new eg(0), gg.u));
    }

    @Override // defpackage.n50, androidx.recyclerview.widget.RecyclerView.f
    public final void k(RecyclerView.e0 e0Var, int i, List<Object> list) {
        list.getClass();
        super.k(e0Var, i, list);
        if (this.e.f.get(i) instanceof nr7) {
            return;
        }
        this.f.invoke(Integer.valueOf(i));
    }
}
