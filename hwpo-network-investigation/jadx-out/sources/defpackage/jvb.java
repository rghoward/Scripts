package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jvb implements Runnable {
    public final /* synthetic */ lvb t;

    public jvb(lvb lvbVar) {
        Objects.requireNonNull(lvbVar);
        this.t = lvbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.h.b(new ax1(4, null, null));
    }
}
