package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p3d extends g6c {
    public final jjc v;

    public p3d(jjc jjcVar) {
        super("internal.logger");
        this.v = jjcVar;
        this.u.put("log", new r2d(this, false, true));
        this.u.put("silent", new xyc("silent"));
        ((g6c) this.u.get("silent")).k("log", new r2d(this, true, true));
        this.u.put("unmonitored", new l0d("unmonitored"));
        ((g6c) this.u.get("unmonitored")).k("log", new r2d(this, false, false));
    }

    @Override // defpackage.g6c
    public final a8c a(cgc cgcVar, List list) {
        return a8c.l;
    }
}
