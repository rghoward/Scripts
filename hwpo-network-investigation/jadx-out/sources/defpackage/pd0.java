package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pd0 extends u92.e.d.a.b.AbstractC0260d {
    public final String a;
    public final int b;
    public final List<u92.e.d.a.b.AbstractC0260d.AbstractC0261a> c;

    public pd0() {
        throw null;
    }

    public pd0(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    @Override // u92.e.d.a.b.AbstractC0260d
    public final List<u92.e.d.a.b.AbstractC0260d.AbstractC0261a> a() {
        return this.c;
    }

    @Override // u92.e.d.a.b.AbstractC0260d
    public final int b() {
        return this.b;
    }

    @Override // u92.e.d.a.b.AbstractC0260d
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.d.a.b.AbstractC0260d)) {
            return false;
        }
        u92.e.d.a.b.AbstractC0260d abstractC0260d = (u92.e.d.a.b.AbstractC0260d) obj;
        return this.a.equals(abstractC0260d.c()) && this.b == abstractC0260d.b() && this.c.equals(abstractC0260d.a());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
