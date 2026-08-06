package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ul1 implements SwipeRefreshLayout.f, gb6.a {
    public final /* synthetic */ Object t;

    public /* synthetic */ ul1(Object obj) {
        this.t = obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void a() {
        am1 am1Var = (am1) this.t;
        am1.a aVar = am1.Companion;
        qn1 qn1VarS = am1Var.s();
        oy0.d(rhb.b(qn1VarS), null, null, new go1(qn1VarS, null), 3);
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        i28 i28Var = (i28) this.t;
        s28.c cVar = (s28.c) obj;
        boolean z = i28Var.g;
        cVar.getClass();
        cVar.t(i28Var.g);
    }
}
