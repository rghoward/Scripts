package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u49 implements zs3<vob> {
    public final nf8<Context> a;
    public final nf8<an3> b;
    public final t49 c;

    public u49(nf8 nf8Var, nf8 nf8Var2, t49 t49Var) {
        this.a = nf8Var;
        this.b = nf8Var2;
        this.c = t49Var;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new hl5(this.a.get(), this.b.get(), (r49) this.c.get());
    }
}
