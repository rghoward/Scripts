package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jk7 implements hk7 {
    public final /* synthetic */ hk7 t;
    public final /* synthetic */ cs9 u;

    public jk7(hk7 hk7Var, cs9 cs9Var) {
        this.t = hk7Var;
        this.u = cs9Var;
    }

    @Override // defpackage.hk7
    public final List<at1> a(Integer num) {
        List<at1> listA = this.t.a(null);
        cs9 cs9Var = this.u;
        int i = cs9Var.v;
        return i < 0 ? listA : th1.K(zs1.a(cs9Var, num, i, Integer.valueOf(cs9Var.G(cs9Var.b, i))), listA);
    }

    @Override // defpackage.hk7
    public final boolean c() {
        return this.t.c();
    }
}
