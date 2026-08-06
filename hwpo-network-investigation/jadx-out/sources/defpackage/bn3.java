package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bn3 implements zs3<String> {
    public final nf8<Context> a;

    public bn3(nf8<Context> nf8Var) {
        this.a = nf8Var;
    }

    @Override // defpackage.nf8
    public final Object get() {
        String packageName = this.a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        ac4.c("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }
}
