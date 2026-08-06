package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tob implements zs3<sob> {
    public final nf8<Executor> a;
    public final nf8<an3> b;
    public final u49 c;
    public final nf8<n7a> d;

    public tob(nf8 nf8Var, nf8 nf8Var2, u49 u49Var, nf8 nf8Var3) {
        this.a = nf8Var;
        this.b = nf8Var2;
        this.c = u49Var;
        this.d = nf8Var3;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new sob(this.a.get(), this.b.get(), (vob) this.c.get(), this.d.get());
    }
}
