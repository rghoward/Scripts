package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nd0 extends u92.e.d.a.b.AbstractC0259b {
    public final String a;
    public final String b;
    public final List<u92.e.d.a.b.AbstractC0260d.AbstractC0261a> c;
    public final u92.e.d.a.b.AbstractC0259b d;
    public final int e;

    public nd0() {
        throw null;
    }

    public nd0(String str, String str2, List list, u92.e.d.a.b.AbstractC0259b abstractC0259b, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = abstractC0259b;
        this.e = i;
    }

    @Override // u92.e.d.a.b.AbstractC0259b
    public final u92.e.d.a.b.AbstractC0259b a() {
        return this.d;
    }

    @Override // u92.e.d.a.b.AbstractC0259b
    public final List<u92.e.d.a.b.AbstractC0260d.AbstractC0261a> b() {
        return this.c;
    }

    @Override // u92.e.d.a.b.AbstractC0259b
    public final int c() {
        return this.e;
    }

    @Override // u92.e.d.a.b.AbstractC0259b
    public final String d() {
        return this.b;
    }

    @Override // u92.e.d.a.b.AbstractC0259b
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.d.a.b.AbstractC0259b)) {
            return false;
        }
        u92.e.d.a.b.AbstractC0259b abstractC0259b = (u92.e.d.a.b.AbstractC0259b) obj;
        if (!this.a.equals(abstractC0259b.e())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (abstractC0259b.d() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0259b.d())) {
            return false;
        }
        if (!this.c.equals(abstractC0259b.b())) {
            return false;
        }
        u92.e.d.a.b.AbstractC0259b abstractC0259b2 = this.d;
        if (abstractC0259b2 == null) {
            if (abstractC0259b.a() != null) {
                return false;
            }
        } else if (!abstractC0259b2.equals(abstractC0259b.a())) {
            return false;
        }
        return this.e == abstractC0259b.c();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        u92.e.d.a.b.AbstractC0259b abstractC0259b = this.d;
        return this.e ^ ((iHashCode2 ^ (abstractC0259b != null ? abstractC0259b.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return i34.b(this.e, "}", sb);
    }
}
