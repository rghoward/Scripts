package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e77 implements fi4<nu, r47, jt1, Integer, g2b> {
    public final /* synthetic */ w89<r47> t;
    public final /* synthetic */ r47 u;
    public final /* synthetic */ f09 v;
    public final /* synthetic */ h37<Boolean> w;
    public final /* synthetic */ yz9<List<r47>> x;

    public e77(w89 w89Var, r47 r47Var, l09 l09Var, h37 h37Var, yz9 yz9Var) {
        this.t = w89Var;
        this.u = r47Var;
        this.v = l09Var;
        this.w = h37Var;
        this.x = yz9Var;
    }

    @Override // defpackage.fi4
    public final g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
        r47 r47VarPrevious;
        nu nuVar2 = nuVar;
        r47 r47Var2 = r47Var;
        jt1 jt1Var2 = jt1Var;
        num.intValue();
        boolean zA = xj5.a(this.t.c.getValue(), this.u);
        if (!this.w.getValue().booleanValue() && !zA) {
            List<r47> value = this.x.getValue();
            ListIterator<r47> listIterator = value.listIterator(value.size());
            do {
                if (!listIterator.hasPrevious()) {
                    r47VarPrevious = null;
                    break;
                }
                r47VarPrevious = listIterator.previous();
            } while (!xj5.a(r47Var2, r47VarPrevious));
            r47Var2 = r47VarPrevious;
        }
        if (r47Var2 == null) {
            jt1Var2.K(105930796);
        } else {
            jt1Var2.K(-1520603531);
            uy0.a(r47Var2, this.v, gr1.b(-1263531443, new d77(r47Var2, nuVar2), jt1Var2), jt1Var2, 384);
        }
        jt1Var2.B();
        return g2b.a;
    }
}
