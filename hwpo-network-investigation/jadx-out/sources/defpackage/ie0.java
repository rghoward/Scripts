package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 extends se5 {
    public final String a;
    public final String b;
    public final String c;
    public final gqa d;
    public final se5.a e;

    public ie0(String str, String str2, String str3, df0 df0Var, se5.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = df0Var;
        this.e = aVar;
    }

    @Override // defpackage.se5
    public final gqa a() {
        return this.d;
    }

    @Override // defpackage.se5
    public final String b() {
        return this.b;
    }

    @Override // defpackage.se5
    public final String c() {
        return this.c;
    }

    @Override // defpackage.se5
    public final se5.a d() {
        return this.e;
    }

    @Override // defpackage.se5
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof se5)) {
            return false;
        }
        se5 se5Var = (se5) obj;
        String str = this.a;
        if (str == null) {
            if (se5Var.e() != null) {
                return false;
            }
        } else if (!str.equals(se5Var.e())) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (se5Var.b() != null) {
                return false;
            }
        } else if (!str2.equals(se5Var.b())) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null) {
            if (se5Var.c() != null) {
                return false;
            }
        } else if (!str3.equals(se5Var.c())) {
            return false;
        }
        gqa gqaVar = this.d;
        if (gqaVar == null) {
            if (se5Var.a() != null) {
                return false;
            }
        } else if (!gqaVar.equals(se5Var.a())) {
            return false;
        }
        se5.a aVar = this.e;
        if (aVar == null) {
            return se5Var.d() == null;
        }
        return aVar.equals(se5Var.d());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        gqa gqaVar = this.d;
        int iHashCode4 = (iHashCode3 ^ (gqaVar == null ? 0 : gqaVar.hashCode())) * 1000003;
        se5.a aVar = this.e;
        return iHashCode4 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
