package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qq4 extends n50<w23> {
    public final wq4.c f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m.e<w23> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(w23 w23Var, w23 w23Var2) {
            w23 w23Var3 = w23Var;
            w23 w23Var4 = w23Var2;
            if ((w23Var3 instanceof pr7) && (w23Var4 instanceof pr7)) {
                return true;
            }
            if ((w23Var3 instanceof mr4) && (w23Var4 instanceof mr4)) {
                return w23Var3.equals(w23Var4);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(w23 w23Var, w23 w23Var2) {
            w23 w23Var3 = w23Var;
            w23 w23Var4 = w23Var2;
            if ((w23Var3 instanceof pr7) && (w23Var4 instanceof pr7)) {
                return true;
            }
            return (w23Var3 instanceof mr4) && (w23Var4 instanceof mr4) && ((mr4) w23Var3).a == ((mr4) w23Var4).a;
        }
    }

    public qq4(wq4.b bVar, wq4.c cVar) {
        super(new a());
        this.f = cVar;
        za<List<T>> zaVar = this.d;
        zaVar.b(new e93(new gr4(), new jr4(3), new hr4(0, bVar), kr4.u));
        zaVar.b(new e93(new hz3(), new jz3(3), new iz3(), kz3.u));
    }

    @Override // defpackage.n50, androidx.recyclerview.widget.RecyclerView.f
    public final void k(RecyclerView.e0 e0Var, int i, List<Object> list) {
        list.getClass();
        super.k(e0Var, i, list);
        if (this.e.f.get(i) instanceof pr7) {
            return;
        }
        this.f.invoke(Integer.valueOf(i));
    }
}
