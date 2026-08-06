package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rd0 extends u92.e.d.a.c {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends u92.e.d.a.c.AbstractC0263a {
        public String a;
        public int b;
        public int c;
        public boolean d;
        public byte e;

        public final rd0 a() {
            String str;
            if (this.e == 7 && (str = this.a) != null) {
                return new rd0(this.b, this.c, str, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" processName");
            }
            if ((this.e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            aa0.c(v92.a("Missing required properties:", sb));
            return null;
        }
    }

    public rd0(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // u92.e.d.a.c
    public final int a() {
        return this.c;
    }

    @Override // u92.e.d.a.c
    public final int b() {
        return this.b;
    }

    @Override // u92.e.d.a.c
    public final String c() {
        return this.a;
    }

    @Override // u92.e.d.a.c
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.d.a.c)) {
            return false;
        }
        u92.e.d.a.c cVar = (u92.e.d.a.c) obj;
        return this.a.equals(cVar.c()) && this.b == cVar.b() && this.c == cVar.a() && this.d == cVar.d();
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        return fz.c(sb, this.d, "}");
    }
}
