package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zpa implements s23, r89 {
    public final int t;
    public final String u;
    public final int v;
    public final w60 w;
    public final String x;
    public final int y;

    public zpa(int i, String str, int i2, w60 w60Var, String str2, int i3) {
        this.t = i;
        this.u = str;
        this.v = i2;
        this.w = w60Var;
        this.x = str2;
        this.y = i3;
    }

    @Override // defpackage.r89
    public final int a() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpa)) {
            return false;
        }
        zpa zpaVar = (zpa) obj;
        return this.t == zpaVar.t && this.u.equals(zpaVar.u) && this.v == zpaVar.v && xj5.a(this.w, zpaVar.w) && this.x.equals(zpaVar.x) && this.y == zpaVar.y;
    }

    @Override // defpackage.s23, defpackage.ep1
    public final int getId() {
        return this.t;
    }

    public final int hashCode() {
        int iA = os2.a(this.v, ru3.c(Integer.hashCode(this.t) * 31, 31, this.u), 31);
        w60 w60Var = this.w;
        return Integer.hashCode(this.y) + ru3.c((iA + (w60Var == null ? 0 : w60Var.hashCode())) * 31, 31, this.x);
    }

    public final String toString() {
        StringBuilder sbA = il.a("TodayTips(id=", ", title=", this.u, ", position=", this.t);
        sbA.append(this.v);
        sbA.append(", attachment=");
        sbA.append(this.w);
        sbA.append(", description=");
        sbA.append(this.x);
        sbA.append(", optionId=");
        sbA.append(this.y);
        sbA.append(")");
        return sbA.toString();
    }
}
