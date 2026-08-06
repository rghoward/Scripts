package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fd0 extends u92.e {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final u92.e.a g;
    public final u92.e.f h;
    public final u92.e.AbstractC0266e i;
    public final u92.e.c j;
    public final List<u92.e.d> k;
    public final int l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends u92.e.b {
        public String a;
        public String b;
        public String c;
        public long d;
        public Long e;
        public boolean f;
        public u92.e.a g;
        public u92.e.f h;
        public u92.e.AbstractC0266e i;
        public u92.e.c j;
        public List<u92.e.d> k;
        public int l;
        public byte m;

        public final fd0 a() {
            String str;
            String str2;
            u92.e.a aVar;
            if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (aVar = this.g) != null) {
                return new fd0(str, str2, this.c, this.d, this.e, this.f, aVar, this.h, this.i, this.j, this.k, this.l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" generator");
            }
            if (this.b == null) {
                sb.append(" identifier");
            }
            if ((this.m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.g == null) {
                sb.append(" app");
            }
            if ((this.m & 4) == 0) {
                sb.append(" generatorType");
            }
            aa0.c(v92.a("Missing required properties:", sb));
            return null;
        }
    }

    public fd0() {
        throw null;
    }

    public fd0(String str, String str2, String str3, long j, Long l, boolean z, u92.e.a aVar, u92.e.f fVar, u92.e.AbstractC0266e abstractC0266e, u92.e.c cVar, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = aVar;
        this.h = fVar;
        this.i = abstractC0266e;
        this.j = cVar;
        this.k = list;
        this.l = i;
    }

    @Override // u92.e
    public final u92.e.a a() {
        return this.g;
    }

    @Override // u92.e
    public final String b() {
        return this.c;
    }

    @Override // u92.e
    public final u92.e.c c() {
        return this.j;
    }

    @Override // u92.e
    public final Long d() {
        return this.e;
    }

    @Override // u92.e
    public final List<u92.e.d> e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e)) {
            return false;
        }
        u92.e eVar = (u92.e) obj;
        if (!this.a.equals(eVar.f()) || !this.b.equals(eVar.h())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (eVar.b() != null) {
                return false;
            }
        } else if (!str.equals(eVar.b())) {
            return false;
        }
        if (this.d != eVar.j()) {
            return false;
        }
        Long l = this.e;
        if (l == null) {
            if (eVar.d() != null) {
                return false;
            }
        } else if (!l.equals(eVar.d())) {
            return false;
        }
        if (this.f != eVar.l() || !this.g.equals(eVar.a())) {
            return false;
        }
        u92.e.f fVar = this.h;
        if (fVar == null) {
            if (eVar.k() != null) {
                return false;
            }
        } else if (!fVar.equals(eVar.k())) {
            return false;
        }
        u92.e.AbstractC0266e abstractC0266e = this.i;
        if (abstractC0266e == null) {
            if (eVar.i() != null) {
                return false;
            }
        } else if (!abstractC0266e.equals(eVar.i())) {
            return false;
        }
        u92.e.c cVar = this.j;
        if (cVar == null) {
            if (eVar.c() != null) {
                return false;
            }
        } else if (!cVar.equals(eVar.c())) {
            return false;
        }
        List<u92.e.d> list = this.k;
        if (list == null) {
            if (eVar.e() != null) {
                return false;
            }
        } else if (!list.equals(eVar.e())) {
            return false;
        }
        return this.l == eVar.g();
    }

    @Override // u92.e
    public final String f() {
        return this.a;
    }

    @Override // u92.e
    public final int g() {
        return this.l;
    }

    @Override // u92.e
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        u92.e.f fVar = this.h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        u92.e.AbstractC0266e abstractC0266e = this.i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0266e == null ? 0 : abstractC0266e.hashCode())) * 1000003;
        u92.e.c cVar = this.j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<u92.e.d> list = this.k;
        return this.l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    @Override // u92.e
    public final u92.e.AbstractC0266e i() {
        return this.i;
    }

    @Override // u92.e
    public final long j() {
        return this.d;
    }

    @Override // u92.e
    public final u92.e.f k() {
        return this.h;
    }

    @Override // u92.e
    public final boolean l() {
        return this.f;
    }

    @Override // u92.e
    public final a m() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        aVar.m = (byte) 7;
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return i34.b(this.l, "}", sb);
    }
}
