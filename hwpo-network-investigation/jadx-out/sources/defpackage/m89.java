package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m89 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final u60 j;
    public final String k;
    public final Long l;
    public final xc9 m;
    public final s60 n;
    public Long o;

    public m89(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, u60 u60Var, String str8, Long l, xc9 xc9Var, s60 s60Var, Long l2) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        u60Var.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = num;
        this.j = u60Var;
        this.k = str8;
        this.l = l;
        this.m = xc9Var;
        this.n = s60Var;
        this.o = l2;
    }

    public static m89 a(m89 m89Var, xc9 xc9Var, s60 s60Var, int i) {
        long j = m89Var.a;
        String str = m89Var.b;
        String str2 = m89Var.c;
        String str3 = m89Var.d;
        String str4 = m89Var.e;
        String str5 = m89Var.f;
        String str6 = m89Var.g;
        String str7 = m89Var.h;
        Integer num = m89Var.i;
        u60 u60Var = m89Var.j;
        String str8 = m89Var.k;
        Long l = m89Var.l;
        xc9 xc9Var2 = (i & 4096) != 0 ? m89Var.m : xc9Var;
        s60 s60Var2 = (i & 8192) != 0 ? m89Var.n : s60Var;
        Long l2 = m89Var.o;
        str.getClass();
        str2.getClass();
        str5.getClass();
        u60Var.getClass();
        return new m89(j, str, str2, str3, str4, str5, str6, str7, num, u60Var, str8, l, xc9Var2, s60Var2, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m89)) {
            return false;
        }
        m89 m89Var = (m89) obj;
        return this.a == m89Var.a && xj5.a(this.b, m89Var.b) && xj5.a(this.c, m89Var.c) && xj5.a(this.d, m89Var.d) && xj5.a(this.e, m89Var.e) && xj5.a(this.f, m89Var.f) && xj5.a(this.g, m89Var.g) && xj5.a(this.h, m89Var.h) && xj5.a(this.i, m89Var.i) && this.j == m89Var.j && xj5.a(this.k, m89Var.k) && xj5.a(this.l, m89Var.l) && this.m == m89Var.m && this.n == m89Var.n && xj5.a(this.o, m89Var.o);
    }

    public final int hashCode() {
        int iC = ru3.c(ru3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iC2 = ru3.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode4 = (this.j.hashCode() + ((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str5 = this.k;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.l;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        xc9 xc9Var = this.m;
        int iHashCode7 = (iHashCode6 + (xc9Var == null ? 0 : xc9Var.hashCode())) * 31;
        s60 s60Var = this.n;
        int iHashCode8 = (iHashCode7 + (s60Var == null ? 0 : s60Var.hashCode())) * 31;
        Long l2 = this.o;
        return iHashCode8 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        Long l = this.o;
        StringBuilder sb = new StringBuilder("SectionAttachmentModel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        ux1.b(sb, ", sourceUrl=", this.c, ", thumbnailUrl=", this.d);
        ux1.b(sb, ", mediumThumbnailUrl=", this.e, ", contentType=", this.f);
        ux1.b(sb, ", streamSource=", this.g, ", youtubeVideoId=", this.h);
        sb.append(", position=");
        sb.append(this.i);
        sb.append(", type=");
        sb.append(this.j);
        sb.append(", fileSize=");
        sb.append(this.k);
        sb.append(", fileSizeInBytes=");
        sb.append(this.l);
        sb.append(", sendingStatus=");
        sb.append(this.m);
        sb.append(", downloadingStatus=");
        sb.append(this.n);
        sb.append(", remoteId=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }
}
