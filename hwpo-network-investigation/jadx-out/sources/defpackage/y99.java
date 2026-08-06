package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y99 extends vx6<z99> {
    public final int A;
    public final List<iw.c<mz7>> B;
    public final oh4<List<sk8>, g2b> C;
    public final ia9 D;
    public final iw t;
    public final wja u;
    public final qa4.a v;
    public final oh4<ria, g2b> w;
    public final int x;
    public final boolean y;
    public final int z;

    public y99(iw iwVar, wja wjaVar, qa4.a aVar, oh4 oh4Var, int i, boolean z, int i2, int i3, List list, oh4 oh4Var2, ia9 ia9Var) {
        this.t = iwVar;
        this.u = wjaVar;
        this.v = aVar;
        this.w = oh4Var;
        this.x = i;
        this.y = z;
        this.z = i2;
        this.A = i3;
        this.B = list;
        this.C = oh4Var2;
        this.D = ia9Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new z99(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        boolean z;
        z99 z99Var = (z99) cVar;
        aba abaVar = z99Var.K;
        wja wjaVar = abaVar.I;
        wja wjaVar2 = this.u;
        if (wjaVar2 != wjaVar) {
            if (!wjaVar2.a.b(wjaVar.a)) {
                z = true;
            }
            boolean zH2 = abaVar.h2(this.t);
            boolean zG2 = z99Var.K.g2(wjaVar2, this.B, this.A, this.z, this.y, this.v, this.x);
            oh4<ria, g2b> oh4Var = this.w;
            oh4<List<sk8>, g2b> oh4Var2 = this.C;
            ia9 ia9Var = this.D;
            abaVar.c2(z, zH2, zG2, abaVar.f2(oh4Var, oh4Var2, ia9Var, null));
            z99Var.J = ia9Var;
            ew2.f(z99Var).Q();
        }
        wjaVar2.getClass();
        z = false;
        boolean zH3 = abaVar.h2(this.t);
        boolean zG3 = z99Var.K.g2(wjaVar2, this.B, this.A, this.z, this.y, this.v, this.x);
        oh4<ria, g2b> oh4Var3 = this.w;
        oh4<List<sk8>, g2b> oh4Var4 = this.C;
        ia9 ia9Var2 = this.D;
        abaVar.c2(z, zH3, zG3, abaVar.f2(oh4Var3, oh4Var4, ia9Var2, null));
        z99Var.J = ia9Var2;
        ew2.f(z99Var).Q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y99)) {
            return false;
        }
        y99 y99Var = (y99) obj;
        return xj5.a(this.t, y99Var.t) && xj5.a(this.u, y99Var.u) && xj5.a(this.B, y99Var.B) && xj5.a(this.v, y99Var.v) && this.w == y99Var.w && this.x == y99Var.x && this.y == y99Var.y && this.z == y99Var.z && this.A == y99Var.A && this.C == y99Var.C && xj5.a(this.D, y99Var.D);
    }

    public final int hashCode() {
        int iHashCode = (this.v.hashCode() + r43.a(this.u, this.t.hashCode() * 31, 31)) * 31;
        oh4<ria, g2b> oh4Var = this.w;
        int iA = (((uo2.a(os2.a(this.x, (iHashCode + (oh4Var != null ? oh4Var.hashCode() : 0)) * 31, 31), this.y, 31) + this.z) * 31) + this.A) * 31;
        List<iw.c<mz7>> list = this.B;
        int iHashCode2 = (iA + (list != null ? list.hashCode() : 0)) * 31;
        oh4<List<sk8>, g2b> oh4Var2 = this.C;
        int iHashCode3 = (iHashCode2 + (oh4Var2 != null ? oh4Var2.hashCode() : 0)) * 31;
        ia9 ia9Var = this.D;
        return (iHashCode3 + (ia9Var != null ? ia9Var.hashCode() : 0)) * 961;
    }
}
