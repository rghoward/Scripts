package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lxb extends zv8 {
    public final PendingIntent t;
    public final boolean u;

    public lxb(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            ac4.c("Null pendingIntent");
            throw null;
        }
        this.t = pendingIntent;
        this.u = z;
    }

    @Override // defpackage.zv8
    public final PendingIntent a() {
        return this.t;
    }

    @Override // defpackage.zv8
    public final boolean b() {
        return this.u;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zv8)) {
            return false;
        }
        zv8 zv8Var = (zv8) obj;
        return this.t.equals(zv8Var.a()) && this.u == zv8Var.b();
    }

    public final int hashCode() {
        return (true != this.u ? 1237 : 1231) ^ ((this.t.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return fz.c(aa.a("ReviewInfo{pendingIntent=", this.t.toString(), ", isNoOp="), this.u, "}");
    }
}
