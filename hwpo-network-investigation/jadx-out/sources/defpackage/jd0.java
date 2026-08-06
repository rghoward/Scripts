package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jd0 extends u92.e.d {
    public final long a;
    public final String b;
    public final u92.e.d.a c;
    public final u92.e.d.c d;
    public final u92.e.d.AbstractC0264d e;
    public final u92.e.d.f f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends u92.e.d.b {
        public long a;
        public String b;
        public u92.e.d.a c;
        public u92.e.d.c d;
        public u92.e.d.AbstractC0264d e;
        public u92.e.d.f f;
        public byte g;

        public final jd0 a() {
            String str;
            u92.e.d.a aVar;
            u92.e.d.c cVar;
            if (this.g == 1 && (str = this.b) != null && (aVar = this.c) != null && (cVar = this.d) != null) {
                return new jd0(this.a, str, aVar, cVar, this.e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.g) == 0) {
                sb.append(" timestamp");
            }
            if (this.b == null) {
                sb.append(" type");
            }
            if (this.c == null) {
                sb.append(" app");
            }
            if (this.d == null) {
                sb.append(" device");
            }
            aa0.c(v92.a("Missing required properties:", sb));
            return null;
        }
    }

    public jd0(long j, String str, u92.e.d.a aVar, u92.e.d.c cVar, u92.e.d.AbstractC0264d abstractC0264d, u92.e.d.f fVar) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0264d;
        this.f = fVar;
    }

    @Override // u92.e.d
    public final u92.e.d.a a() {
        return this.c;
    }

    @Override // u92.e.d
    public final u92.e.d.c b() {
        return this.d;
    }

    @Override // u92.e.d
    public final u92.e.d.AbstractC0264d c() {
        return this.e;
    }

    @Override // u92.e.d
    public final u92.e.d.f d() {
        return this.f;
    }

    @Override // u92.e.d
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.d)) {
            return false;
        }
        u92.e.d dVar = (u92.e.d) obj;
        if (this.a != dVar.e() || !this.b.equals(dVar.f()) || !this.c.equals(dVar.a()) || !this.d.equals(dVar.b())) {
            return false;
        }
        u92.e.d.AbstractC0264d abstractC0264d = this.e;
        if (abstractC0264d == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!abstractC0264d.equals(dVar.c())) {
            return false;
        }
        u92.e.d.f fVar = this.f;
        if (fVar == null) {
            return dVar.d() == null;
        }
        return fVar.equals(dVar.d());
    }

    @Override // u92.e.d
    public final String f() {
        return this.b;
    }

    public final a g() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = (byte) 1;
        return aVar;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        u92.e.d.AbstractC0264d abstractC0264d = this.e;
        int iHashCode2 = (iHashCode ^ (abstractC0264d == null ? 0 : abstractC0264d.hashCode())) * 1000003;
        u92.e.d.f fVar = this.f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
