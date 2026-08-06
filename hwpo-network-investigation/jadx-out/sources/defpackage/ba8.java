package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ba8 implements xs3<aa8> {
    public final ve5 a;
    public final lf8<z6b> b;

    public ba8(ve5 ve5Var, lf8 lf8Var) {
        this.a = ve5Var;
        this.b = lf8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nf8
    public final Object get() {
        return new aa8((Context) this.a.a, this.b.get());
    }
}
