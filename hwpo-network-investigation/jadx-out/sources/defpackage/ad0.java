package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ad0 extends u92.a {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List<u92.a.AbstractC0255a> i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends u92.a.b {
        public int a;
        public String b;
        public int c;
        public int d;
        public long e;
        public long f;
        public long g;
        public String h;
        public List<u92.a.AbstractC0255a> i;
        public byte j;

        public final ad0 a() {
            String str;
            if (this.j == 63 && (str = this.b) != null) {
                return new ad0(this.a, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.b == null) {
                sb.append(" processName");
            }
            if ((this.j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.j & 32) == 0) {
                sb.append(" timestamp");
            }
            aa0.c(v92.a("Missing required properties:", sb));
            return null;
        }
    }

    public ad0() {
        throw null;
    }

    public ad0(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = list;
    }

    @Override // u92.a
    public final List<u92.a.AbstractC0255a> a() {
        return this.i;
    }

    @Override // u92.a
    public final int b() {
        return this.d;
    }

    @Override // u92.a
    public final int c() {
        return this.a;
    }

    @Override // u92.a
    public final String d() {
        return this.b;
    }

    @Override // u92.a
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.a)) {
            return false;
        }
        u92.a aVar = (u92.a) obj;
        if (this.a != aVar.c() || !this.b.equals(aVar.d()) || this.c != aVar.f() || this.d != aVar.b() || this.e != aVar.e() || this.f != aVar.g() || this.g != aVar.h()) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (aVar.i() != null) {
                return false;
            }
        } else if (!str.equals(aVar.i())) {
            return false;
        }
        List<u92.a.AbstractC0255a> list = this.i;
        if (list == null) {
            return aVar.a() == null;
        }
        return list.equals(aVar.a());
    }

    @Override // u92.a
    public final int f() {
        return this.c;
    }

    @Override // u92.a
    public final long g() {
        return this.f;
    }

    @Override // u92.a
    public final long h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<u92.a.AbstractC0255a> list = this.i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // u92.a
    public final String i() {
        return this.h;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }
}
