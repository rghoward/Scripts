package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yr3 extends wr3<fk4.d> {
    @Override // defpackage.wr3
    public final void a(Map.Entry entry) {
        ((fk4.d) entry.getKey()).getClass();
    }

    @Override // defpackage.wr3
    public final tu3<fk4.d> b(Object obj) {
        return ((fk4.c) obj).extensions;
    }

    @Override // defpackage.wr3
    public final tu3<fk4.d> c(Object obj) {
        fk4.c cVar = (fk4.c) obj;
        tu3<fk4.d> tu3Var = cVar.extensions;
        if (tu3Var.b) {
            cVar.extensions = tu3Var.clone();
        }
        return cVar.extensions;
    }

    @Override // defpackage.wr3
    public final boolean d(zt6 zt6Var) {
        return zt6Var instanceof fk4.c;
    }

    @Override // defpackage.wr3
    public final void e(Object obj) {
        ((fk4.c) obj).extensions.h();
    }

    @Override // defpackage.wr3
    public final void f(Map.Entry entry) {
        ((fk4.d) entry.getKey()).getClass();
        throw null;
    }
}
