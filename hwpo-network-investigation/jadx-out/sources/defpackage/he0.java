package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class he0 {
    public final String a;
    public final String b;
    public final String c;

    public he0(String str, String str2, String str3) {
        if (str == null) {
            ac4.c("Null crashlyticsInstallId");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof he0)) {
            return false;
        }
        he0 he0Var = (he0) obj;
        if (!this.a.equals(he0Var.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (he0Var.b() != null) {
                return false;
            }
        } else if (!str.equals(he0Var.b())) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null) {
            return he0Var.a() == null;
        }
        return str2.equals(he0Var.a());
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", firebaseAuthenticationToken=");
        return av.a(sb, this.c, "}");
    }
}
