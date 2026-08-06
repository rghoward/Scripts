package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b70 extends n50<x60> {
    public final vo6.d f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m.e<x60> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(x60 x60Var, x60 x60Var2) {
            return x60Var.equals(x60Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(x60 x60Var, x60 x60Var2) {
            return x60Var.b() == x60Var2.b();
        }
    }

    public b70(vo6.c cVar, vo6.d dVar) {
        super(new a());
        this.f = dVar;
        za<List<T>> zaVar = this.d;
        zaVar.b(new e93(new ev3(0), new sv3(3), new b81(1, cVar), uv3.u));
        zaVar.b(new e93(new f75(), new i75(3), new g75(0, cVar), j75.u));
        zaVar.b(new e93(new sc(1), new neb(3), new v62(2, cVar), oeb.u));
        zaVar.b(new e93(new vsb(), new xsb(3), new r58(3, cVar), ysb.u));
    }

    @Override // defpackage.n50, androidx.recyclerview.widget.RecyclerView.f
    public final void j(RecyclerView.e0 e0Var, int i) {
        e0Var.getClass();
        super.j(e0Var, i);
        this.f.invoke(Integer.valueOf(i));
    }

    @Override // defpackage.n50, androidx.recyclerview.widget.RecyclerView.f
    public final void k(RecyclerView.e0 e0Var, int i, List<Object> list) {
        list.getClass();
        super.k(e0Var, i, list);
        this.f.invoke(Integer.valueOf(i));
    }
}
