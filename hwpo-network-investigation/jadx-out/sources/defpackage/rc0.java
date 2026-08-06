package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rc0 extends rl {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public rc0(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    @Override // defpackage.rl
    public final String a() {
        return this.l;
    }

    @Override // defpackage.rl
    public final String b() {
        return this.j;
    }

    @Override // defpackage.rl
    public final String c() {
        return this.d;
    }

    @Override // defpackage.rl
    public final String d() {
        return this.h;
    }

    @Override // defpackage.rl
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rl)) {
            return false;
        }
        rl rlVar = (rl) obj;
        Integer num = this.a;
        if (num == null) {
            if (rlVar.l() != null) {
                return false;
            }
        } else if (!num.equals(rlVar.l())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (rlVar.i() != null) {
                return false;
            }
        } else if (!str.equals(rlVar.i())) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null) {
            if (rlVar.e() != null) {
                return false;
            }
        } else if (!str2.equals(rlVar.e())) {
            return false;
        }
        String str3 = this.d;
        if (str3 == null) {
            if (rlVar.c() != null) {
                return false;
            }
        } else if (!str3.equals(rlVar.c())) {
            return false;
        }
        String str4 = this.e;
        if (str4 == null) {
            if (rlVar.k() != null) {
                return false;
            }
        } else if (!str4.equals(rlVar.k())) {
            return false;
        }
        String str5 = this.f;
        if (str5 == null) {
            if (rlVar.j() != null) {
                return false;
            }
        } else if (!str5.equals(rlVar.j())) {
            return false;
        }
        String str6 = this.g;
        if (str6 == null) {
            if (rlVar.g() != null) {
                return false;
            }
        } else if (!str6.equals(rlVar.g())) {
            return false;
        }
        String str7 = this.h;
        if (str7 == null) {
            if (rlVar.d() != null) {
                return false;
            }
        } else if (!str7.equals(rlVar.d())) {
            return false;
        }
        String str8 = this.i;
        if (str8 == null) {
            if (rlVar.f() != null) {
                return false;
            }
        } else if (!str8.equals(rlVar.f())) {
            return false;
        }
        String str9 = this.j;
        if (str9 == null) {
            if (rlVar.b() != null) {
                return false;
            }
        } else if (!str9.equals(rlVar.b())) {
            return false;
        }
        String str10 = this.k;
        if (str10 == null) {
            if (rlVar.h() != null) {
                return false;
            }
        } else if (!str10.equals(rlVar.h())) {
            return false;
        }
        String str11 = this.l;
        if (str11 == null) {
            return rlVar.a() == null;
        }
        return str11.equals(rlVar.a());
    }

    @Override // defpackage.rl
    public final String f() {
        return this.i;
    }

    @Override // defpackage.rl
    public final String g() {
        return this.g;
    }

    @Override // defpackage.rl
    public final String h() {
        return this.k;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // defpackage.rl
    public final String i() {
        return this.b;
    }

    @Override // defpackage.rl
    public final String j() {
        return this.f;
    }

    @Override // defpackage.rl
    public final String k() {
        return this.e;
    }

    @Override // defpackage.rl
    public final Integer l() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return av.a(sb, this.l, "}");
    }
}
