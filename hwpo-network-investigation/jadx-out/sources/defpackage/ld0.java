package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ld0 extends u92.e.d.a.b {
    public final List<u92.e.d.a.b.AbstractC0260d> a;
    public final u92.e.d.a.b.AbstractC0259b b;
    public final u92.a c;
    public final od0 d;
    public final List<u92.e.d.a.b.AbstractC0258a> e;

    public ld0() {
        throw null;
    }

    public ld0(List list, nd0 nd0Var, u92.a aVar, od0 od0Var, List list2) {
        this.a = list;
        this.b = nd0Var;
        this.c = aVar;
        this.d = od0Var;
        this.e = list2;
    }

    @Override // u92.e.d.a.b
    public final u92.a a() {
        return this.c;
    }

    @Override // u92.e.d.a.b
    public final List<u92.e.d.a.b.AbstractC0258a> b() {
        return this.e;
    }

    @Override // u92.e.d.a.b
    public final u92.e.d.a.b.AbstractC0259b c() {
        return this.b;
    }

    @Override // u92.e.d.a.b
    public final u92.e.d.a.b.c d() {
        return this.d;
    }

    @Override // u92.e.d.a.b
    public final List<u92.e.d.a.b.AbstractC0260d> e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.d.a.b)) {
            return false;
        }
        u92.e.d.a.b bVar = (u92.e.d.a.b) obj;
        List<u92.e.d.a.b.AbstractC0260d> list = this.a;
        if (list == null) {
            if (bVar.e() != null) {
                return false;
            }
        } else if (!list.equals(bVar.e())) {
            return false;
        }
        u92.e.d.a.b.AbstractC0259b abstractC0259b = this.b;
        if (abstractC0259b == null) {
            if (bVar.c() != null) {
                return false;
            }
        } else if (!abstractC0259b.equals(bVar.c())) {
            return false;
        }
        u92.a aVar = this.c;
        if (aVar == null) {
            if (bVar.a() != null) {
                return false;
            }
        } else if (!aVar.equals(bVar.a())) {
            return false;
        }
        return this.d.equals(bVar.d()) && this.e.equals(bVar.b());
    }

    public final int hashCode() {
        List<u92.e.d.a.b.AbstractC0260d> list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        u92.e.d.a.b.AbstractC0259b abstractC0259b = this.b;
        int iHashCode2 = (iHashCode ^ (abstractC0259b == null ? 0 : abstractC0259b.hashCode())) * 1000003;
        u92.a aVar = this.c;
        return this.e.hashCode() ^ (((((aVar != null ? aVar.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
