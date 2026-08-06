package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aq4 implements dq4 {
    public final int a;
    public final String b;
    public final String c;

    public aq4(int i, String str, String str2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq4)) {
            return false;
        }
        aq4 aq4Var = (aq4) obj;
        return this.a == aq4Var.a && xj5.a(this.b, aq4Var.b) && xj5.a(this.c, aq4Var.c);
    }

    @Override // defpackage.dq4
    public final int getId() {
        return this.a;
    }

    @Override // defpackage.dq4
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int iC = ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return av.a(il.a("GymFilterCity(id=", ", name=", this.b, ", state=", this.a), this.c, ")");
    }
}
