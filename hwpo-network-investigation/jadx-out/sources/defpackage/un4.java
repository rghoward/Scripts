package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class un4 implements s23, x23, ep1, r89 {
    public final int t;
    public final boolean u;
    public final String v;
    public final int w;
    public final int x;

    public un4(int i, boolean z, String str, int i2, int i3) {
        this.t = i;
        this.u = z;
        this.v = str;
        this.w = i2;
        this.x = i3;
    }

    @Override // defpackage.r89
    public final int a() {
        return this.x;
    }

    @Override // defpackage.ep1
    public final ep1 b(boolean z, boolean z2) {
        return new un4(this.t, z, this.v, this.w, this.x);
    }

    @Override // defpackage.ep1
    public final boolean c() {
        return this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un4)) {
            return false;
        }
        un4 un4Var = (un4) obj;
        return this.t == un4Var.t && this.u == un4Var.u && this.v.equals(un4Var.v) && this.w == un4Var.w && this.x == un4Var.x;
    }

    @Override // defpackage.s23, defpackage.ep1
    public final int getId() {
        return this.t;
    }

    public final int hashCode() {
        return Integer.hashCode(this.x) + os2.a(this.w, ru3.c(uo2.a(Integer.hashCode(this.t) * 31, this.u, 31), 31, this.v), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoWodSectionUiEntity(id=");
        sb.append(this.t);
        sb.append(", isCompleted=");
        sb.append(this.u);
        sb.append(", deepLink=");
        sb.append(this.v);
        sb.append(", image=");
        sb.append(this.w);
        sb.append(", optionId=");
        return i34.b(this.x, ")", sb);
    }
}
