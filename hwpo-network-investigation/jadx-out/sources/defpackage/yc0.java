package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yc0 extends u92 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final u92.e k;
    public final u92.d l;
    public final u92.a m;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends u92.b {
        public String a;
        public String b;
        public int c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public u92.e j;
        public u92.d k;
        public u92.a l;
        public byte m;

        public final yc0 a() {
            if (this.m == 1 && this.a != null && this.b != null && this.d != null && this.h != null && this.i != null) {
                return new yc0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" sdkVersion");
            }
            if (this.b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.m) == 0) {
                sb.append(" platform");
            }
            if (this.d == null) {
                sb.append(" installationUuid");
            }
            if (this.h == null) {
                sb.append(" buildVersion");
            }
            if (this.i == null) {
                sb.append(" displayVersion");
            }
            aa0.c(v92.a("Missing required properties:", sb));
            return null;
        }
    }

    public yc0(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, u92.e eVar, u92.d dVar, u92.a aVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = eVar;
        this.l = dVar;
        this.m = aVar;
    }

    @Override // defpackage.u92
    public final u92.a a() {
        return this.m;
    }

    @Override // defpackage.u92
    public final String b() {
        return this.h;
    }

    @Override // defpackage.u92
    public final String c() {
        return this.i;
    }

    @Override // defpackage.u92
    public final String d() {
        return this.j;
    }

    @Override // defpackage.u92
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92)) {
            return false;
        }
        u92 u92Var = (u92) obj;
        if (!this.b.equals(u92Var.k()) || !this.c.equals(u92Var.g()) || this.d != u92Var.j() || !this.e.equals(u92Var.h())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (u92Var.f() != null) {
                return false;
            }
        } else if (!str.equals(u92Var.f())) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null) {
            if (u92Var.e() != null) {
                return false;
            }
        } else if (!str2.equals(u92Var.e())) {
            return false;
        }
        String str3 = this.h;
        if (str3 == null) {
            if (u92Var.b() != null) {
                return false;
            }
        } else if (!str3.equals(u92Var.b())) {
            return false;
        }
        if (!this.i.equals(u92Var.c()) || !this.j.equals(u92Var.d())) {
            return false;
        }
        u92.e eVar = this.k;
        if (eVar == null) {
            if (u92Var.l() != null) {
                return false;
            }
        } else if (!eVar.equals(u92Var.l())) {
            return false;
        }
        u92.d dVar = this.l;
        if (dVar == null) {
            if (u92Var.i() != null) {
                return false;
            }
        } else if (!dVar.equals(u92Var.i())) {
            return false;
        }
        u92.a aVar = this.m;
        if (aVar == null) {
            return u92Var.a() == null;
        }
        return aVar.equals(u92Var.a());
    }

    @Override // defpackage.u92
    public final String f() {
        return this.f;
    }

    @Override // defpackage.u92
    public final String g() {
        return this.c;
    }

    @Override // defpackage.u92
    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        u92.e eVar = this.k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        u92.d dVar = this.l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        u92.a aVar = this.m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // defpackage.u92
    public final u92.d i() {
        return this.l;
    }

    @Override // defpackage.u92
    public final int j() {
        return this.d;
    }

    @Override // defpackage.u92
    public final String k() {
        return this.b;
    }

    @Override // defpackage.u92
    public final u92.e l() {
        return this.k;
    }

    @Override // defpackage.u92
    public final a m() {
        a aVar = new a();
        aVar.a = this.b;
        aVar.b = this.c;
        aVar.c = this.d;
        aVar.d = this.e;
        aVar.e = this.f;
        aVar.f = this.g;
        aVar.g = this.h;
        aVar.h = this.i;
        aVar.i = this.j;
        aVar.j = this.k;
        aVar.k = this.l;
        aVar.l = this.m;
        aVar.m = (byte) 1;
        return aVar;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
