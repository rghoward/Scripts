package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ju8 implements Runnable {
    public final /* synthetic */ iu8.c t;
    public final /* synthetic */ Typeface u;

    public /* synthetic */ ju8(iu8.c cVar, Typeface typeface) {
        this.t = cVar;
        this.u = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.c(this.u);
    }
}
