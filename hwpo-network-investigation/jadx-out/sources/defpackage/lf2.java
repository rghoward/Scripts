package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class lf2 extends IOException {
    public final int t;

    public lf2(int i) {
        this.t = i;
    }

    public lf2(Exception exc, int i) {
        super(exc);
        this.t = i;
    }

    public lf2(String str, Exception exc, int i) {
        super(str, exc);
        this.t = i;
    }
}
