package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ibb extends n50<y23> {
    public final rbb.c f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m.e<y23> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(y23 y23Var, y23 y23Var2) {
            y23 y23Var3 = y23Var;
            y23 y23Var4 = y23Var2;
            if ((y23Var3 instanceof or7) && (y23Var4 instanceof or7)) {
                return true;
            }
            if ((y23Var3 instanceof zn0) && (y23Var4 instanceof zn0)) {
                return ((zn0) y23Var3).equals((zn0) y23Var4);
            }
            if ((y23Var3 instanceof z71) && (y23Var4 instanceof z71)) {
                return ((z71) y23Var3).equals((z71) y23Var4);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(y23 y23Var, y23 y23Var2) {
            y23 y23Var3 = y23Var;
            y23 y23Var4 = y23Var2;
            if ((y23Var3 instanceof or7) && (y23Var4 instanceof or7)) {
                return true;
            }
            return (y23Var3 instanceof wab) && (y23Var4 instanceof wab) && ((wab) y23Var3).c() == ((wab) y23Var4).c();
        }
    }

    public ibb(rbb.b bVar, rbb.c cVar) {
        super(new a());
        this.f = cVar;
        za<List<T>> zaVar = this.d;
        zaVar.b(new e93(new h42(1), new xab(3), new ma9(1, bVar), yab.u));
        zaVar.b(new e93(new a81(0), new d81(3), new b81(0, bVar), e81.u));
        zaVar.b(new e93(new sm7(1), new abb(3), new u7(4), bbb.u));
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
