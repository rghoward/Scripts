package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ddb extends adb {
    public final float A;
    public final int B;
    public final int C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final String t;
    public final List<ju7> u;
    public final int v;
    public final fx0 w;
    public final float x;
    public final fx0 y;
    public final float z;

    public ddb() {
        throw null;
    }

    public ddb(String str, List list, int i, fx0 fx0Var, float f, fx0 fx0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.t = str;
        this.u = list;
        this.v = i;
        this.w = fx0Var;
        this.x = f;
        this.y = fx0Var2;
        this.z = f2;
        this.A = f3;
        this.B = i2;
        this.C = i3;
        this.D = f4;
        this.E = f5;
        this.F = f6;
        this.G = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ddb.class == obj.getClass()) {
            ddb ddbVar = (ddb) obj;
            return xj5.a(this.t, ddbVar.t) && xj5.a(this.w, ddbVar.w) && this.x == ddbVar.x && xj5.a(this.y, ddbVar.y) && this.z == ddbVar.z && this.A == ddbVar.A && this.B == ddbVar.B && this.C == ddbVar.C && this.D == ddbVar.D && this.E == ddbVar.E && this.F == ddbVar.F && this.G == ddbVar.G && this.v == ddbVar.v && xj5.a(this.u, ddbVar.u);
        }
        return false;
    }

    public final int hashCode() {
        int iA = ho2.a(this.t.hashCode() * 31, 31, this.u);
        fx0 fx0Var = this.w;
        int iA2 = h44.a((iA + (fx0Var != null ? fx0Var.hashCode() : 0)) * 31, this.x, 31);
        fx0 fx0Var2 = this.y;
        return Integer.hashCode(this.v) + h44.a(h44.a(h44.a(h44.a(os2.a(this.C, os2.a(this.B, h44.a(h44.a((iA2 + (fx0Var2 != null ? fx0Var2.hashCode() : 0)) * 31, this.z, 31), this.A, 31), 31), 31), this.D, 31), this.E, 31), this.F, 31), this.G, 31);
    }
}
