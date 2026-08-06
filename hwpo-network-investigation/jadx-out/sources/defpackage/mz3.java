package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mz3 implements iz4 {
    public final iz4 a;
    public final List<r1a> b;

    public mz3(or2 or2Var, List list) {
        this.a = or2Var;
        this.b = list;
    }

    @Override // defpackage.iz4
    public final vt7.a<gz4> a(fz4 fz4Var, dz4 dz4Var) {
        return new nz3(this.a.a(fz4Var, dz4Var), this.b);
    }

    @Override // defpackage.iz4
    public final vt7.a<gz4> b() {
        return new nz3(this.a.b(), this.b);
    }
}
