package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f59 implements zs3<e59> {
    public final nf8<Context> a;

    public f59(nf8 nf8Var) {
        this.a = nf8Var;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new e59(this.a.get(), "com.google.android.datatransport.events", Integer.valueOf(e59.w).intValue());
    }
}
