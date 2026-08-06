package defpackage;

import androidx.fragment.app.f;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sm2 extends xf4 {
    public qm2 m;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        return 3;
    }

    @Override // defpackage.xf4, androidx.recyclerview.widget.RecyclerView.f
    public final long g(int i) {
        return yk2.y(kz0.b(this.m, i));
    }

    @Override // defpackage.xf4
    public final boolean v(long j) {
        qm2 qm2Var = this.m;
        LocalDate localDateP = yk2.p(j);
        localDateP.getClass();
        qm2Var.getClass();
        return qm2Var.a.equals(localDateP) || xj5.a(qm2Var.b, localDateP) || qm2Var.c.equals(localDateP);
    }

    @Override // defpackage.xf4
    public final f w(int i) {
        ql2.a aVar = ql2.Companion;
        long jY = yk2.y(kz0.b(this.m, i));
        aVar.getClass();
        ql2 ql2Var = new ql2();
        ql2Var.setArguments(uy0.c(new js7("DAY_KEY", Long.valueOf(jY))));
        return ql2Var;
    }
}
