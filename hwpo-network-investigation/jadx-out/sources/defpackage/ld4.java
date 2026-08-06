package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ld4 extends fy3 {
    public final fy3 u;

    public ld4(fy3 fy3Var) {
        fy3Var.getClass();
        this.u = fy3Var;
    }

    @Override // defpackage.fy3
    public final hx3 E(du7 du7Var) {
        du7Var.getClass();
        hx3 hx3VarE = this.u.E(du7Var);
        if (hx3VarE == null) {
            return null;
        }
        du7 du7Var2 = hx3VarE.c;
        if (du7Var2 == null) {
            return hx3VarE;
        }
        boolean z = hx3VarE.a;
        boolean z2 = hx3VarE.b;
        Long l = hx3VarE.d;
        Long l2 = hx3VarE.e;
        Long l3 = hx3VarE.f;
        Long l4 = hx3VarE.g;
        Map<wn5<?>, Object> map = hx3VarE.h;
        map.getClass();
        return new hx3(z, z2, du7Var2, l, l2, l3, l4, map);
    }

    @Override // defpackage.fy3
    public final zw3 H(du7 du7Var) {
        du7Var.getClass();
        return this.u.H(du7Var);
    }

    @Override // defpackage.fy3
    public final kw9 K(du7 du7Var) {
        du7Var.getClass();
        return this.u.K(du7Var);
    }

    @Override // defpackage.fy3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.u.close();
    }

    @Override // defpackage.fy3
    public final yq9 h(du7 du7Var) {
        du7Var.getClass();
        return this.u.h(du7Var);
    }

    @Override // defpackage.fy3
    public final void k(du7 du7Var, du7 du7Var2) {
        du7Var.getClass();
        du7Var2.getClass();
        this.u.k(du7Var, du7Var2);
    }

    @Override // defpackage.fy3
    public final void p(du7 du7Var) {
        du7Var.getClass();
        this.u.p(du7Var);
    }

    @Override // defpackage.fy3
    public final void t(du7 du7Var) {
        du7Var.getClass();
        this.u.t(du7Var);
    }

    public final String toString() {
        return ll8.a(getClass()).c() + '(' + this.u + ')';
    }

    @Override // defpackage.fy3
    public final List<du7> y(du7 du7Var) {
        du7Var.getClass();
        List<du7> listY = this.u.y(du7Var);
        ArrayList arrayList = new ArrayList();
        for (du7 du7Var2 : listY) {
            du7Var2.getClass();
            arrayList.add(du7Var2);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }
}
