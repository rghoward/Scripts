package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n4d extends g6c {
    public final qjc v;

    public n4d(qjc qjcVar) {
        super("internal.appMetadata");
        this.v = qjcVar;
    }

    @Override // defpackage.g6c
    public final a8c a(cgc cgcVar, List list) {
        try {
            return ikc.a(this.v.call());
        } catch (Exception unused) {
            return a8c.l;
        }
    }
}
