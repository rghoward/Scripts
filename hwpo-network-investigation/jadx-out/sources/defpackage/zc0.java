package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zc0 extends ga2 {
    public final yc0 a;
    public final String b;
    public final File c;

    public zc0(yc0 yc0Var, String str, File file) {
        this.a = yc0Var;
        if (str == null) {
            ac4.c("Null sessionId");
            throw null;
        }
        this.b = str;
        if (file != null) {
            this.c = file;
        } else {
            ac4.c("Null reportFile");
            throw null;
        }
    }

    @Override // defpackage.ga2
    public final u92 a() {
        return this.a;
    }

    @Override // defpackage.ga2
    public final File b() {
        return this.c;
    }

    @Override // defpackage.ga2
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ga2)) {
            return false;
        }
        ga2 ga2Var = (ga2) obj;
        return this.a.equals(ga2Var.a()) && this.b.equals(ga2Var.c()) && this.c.equals(ga2Var.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
