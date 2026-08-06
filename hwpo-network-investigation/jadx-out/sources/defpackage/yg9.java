package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yg9 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final we2 e;
    public final String f;
    public final String g;

    public yg9(String str, String str2, int i, long j, we2 we2Var, String str3, String str4) {
        fk.b(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = we2Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg9)) {
            return false;
        }
        yg9 yg9Var = (yg9) obj;
        return xj5.a(this.a, yg9Var.a) && xj5.a(this.b, yg9Var.b) && this.c == yg9Var.c && this.d == yg9Var.d && this.e.equals(yg9Var.e) && this.f.equals(yg9Var.f) && xj5.a(this.g, yg9Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ru3.c((this.e.hashCode() + al.c(this.d, os2.a(this.c, ru3.c(this.a.hashCode() * 31, 31, this.b), 31), 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return wu0.a(sb, this.g, ')');
    }
}
