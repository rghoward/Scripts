package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vu6 implements zs3<uu6> {
    public final we5 a;
    public final kb2 b;

    public vu6(we5 we5Var, kb2 kb2Var) {
        this.a = we5Var;
        this.b = kb2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nf8
    public final Object get() {
        return new uu6((Context) this.a.a, (jb2) this.b.get());
    }
}
