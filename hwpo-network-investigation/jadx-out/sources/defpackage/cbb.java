package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cbb {
    public final int a;
    public final String b;
    public final xn0 c;
    public final m2b d;

    public cbb(int i, xn0 xn0Var, m2b m2bVar, String str) {
        str.getClass();
        xn0Var.getClass();
        m2bVar.getClass();
        this.a = i;
        this.b = str;
        this.c = xn0Var;
        this.d = m2bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbb)) {
            return false;
        }
        cbb cbbVar = (cbb) obj;
        return this.a == cbbVar.a && xj5.a(this.b, cbbVar.b) && this.c == cbbVar.c && this.d == cbbVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ValueToAdd(id=", ", name=", this.b, ", measure=", this.a);
        sbA.append(this.c);
        sbA.append(", units=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
