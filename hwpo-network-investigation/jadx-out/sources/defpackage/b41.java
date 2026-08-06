package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class b41 extends CancellationException {
    public final String t = "Loading of this week is canceled, as new week is requested";

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.t;
    }
}
