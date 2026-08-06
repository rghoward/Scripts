package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nq implements fl6 {
    public final /* synthetic */ d68 a;
    public final /* synthetic */ tq5 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<jz7.a, g2b> {
        public static final a u = new a(1);

        @Override // defpackage.oh4
        public final /* bridge */ /* synthetic */ g2b invoke(jz7.a aVar) {
            return g2b.a;
        }
    }

    public nq(d68 d68Var, tq5 tq5Var) {
        this.a = d68Var;
        this.b = tq5Var;
    }

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        this.a.setParentLayoutDirection(this.b);
        return hl6Var.y0(0, 0, if3.t, a.u);
    }
}
