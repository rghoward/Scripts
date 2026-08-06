package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wx3 implements mh4 {
    public final /* synthetic */ File t;

    @Override // defpackage.mh4
    public final Object invoke() {
        File file = this.t;
        synchronized (xx3.e) {
            xx3.d.remove(file.getAbsolutePath());
        }
        return g2b.a;
    }
}
