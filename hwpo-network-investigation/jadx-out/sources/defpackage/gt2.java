package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gt2 implements zs3<ft2> {
    public final nf8<Executor> a;
    public final nf8<ai0> b;
    public final u49 c;
    public final nf8<an3> d;
    public final nf8<n7a> e;

    public gt2(nf8 nf8Var, nf8 nf8Var2, u49 u49Var, nf8 nf8Var3, nf8 nf8Var4) {
        this.a = nf8Var;
        this.b = nf8Var2;
        this.c = u49Var;
        this.d = nf8Var3;
        this.e = nf8Var4;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new ft2(this.a.get(), this.b.get(), (vob) this.c.get(), this.d.get(), this.e.get());
    }
}
