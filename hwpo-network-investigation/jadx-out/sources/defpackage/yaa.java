package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yaa extends vx6<aba> {
    public final int A;
    public final List<iw.c<mz7>> B;
    public final oh4<List<sk8>, g2b> C;
    public final oh4<aba.a, g2b> D;
    public final iw t;
    public final wja u;
    public final qa4.a v;
    public final oh4<ria, g2b> w;
    public final int x;
    public final boolean y;
    public final int z;

    public yaa(iw iwVar, wja wjaVar, qa4.a aVar, oh4 oh4Var, int i, boolean z, int i2, int i3, List list, oh4 oh4Var2, oh4 oh4Var3) {
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
        this.D = oh4Var3;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new aba(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, null, this.D);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        boolean z;
        aba abaVar = (aba) cVar;
        wja wjaVar = abaVar.I;
        wja wjaVar2 = this.u;
        if (wjaVar2 != wjaVar) {
            if (!wjaVar2.a.b(wjaVar.a)) {
                z = true;
            }
            abaVar.c2(z, abaVar.h2(this.t), abaVar.g2(this.u, this.B, this.A, this.z, this.y, this.v, this.x), abaVar.f2(this.w, this.C, null, this.D));
        }
        wjaVar2.getClass();
        z = false;
        abaVar.c2(z, abaVar.h2(this.t), abaVar.g2(this.u, this.B, this.A, this.z, this.y, this.v, this.x), abaVar.f2(this.w, this.C, null, this.D));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yaa)) {
            return false;
        }
        yaa yaaVar = (yaa) obj;
        return xj5.a(this.t, yaaVar.t) && xj5.a(this.u, yaaVar.u) && xj5.a(this.B, yaaVar.B) && xj5.a(this.v, yaaVar.v) && this.w == yaaVar.w && this.D == yaaVar.D && this.x == yaaVar.x && this.y == yaaVar.y && this.z == yaaVar.z && this.A == yaaVar.A && this.C == yaaVar.C;
    }

    public final int hashCode() {
        int iHashCode = (this.v.hashCode() + r43.a(this.u, this.t.hashCode() * 31, 31)) * 31;
        oh4<ria, g2b> oh4Var = this.w;
        int iA = (((uo2.a(os2.a(this.x, (iHashCode + (oh4Var != null ? oh4Var.hashCode() : 0)) * 31, 31), this.y, 31) + this.z) * 31) + this.A) * 31;
        List<iw.c<mz7>> list = this.B;
        int iHashCode2 = (iA + (list != null ? list.hashCode() : 0)) * 31;
        oh4<List<sk8>, g2b> oh4Var2 = this.C;
        int iHashCode3 = (iHashCode2 + (oh4Var2 != null ? oh4Var2.hashCode() : 0)) * 29791;
        oh4<aba.a, g2b> oh4Var3 = this.D;
        return iHashCode3 + (oh4Var3 != null ? oh4Var3.hashCode() : 0);
    }
}
