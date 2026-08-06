package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b11 {
    public final qia a;

    public b11(qia qiaVar) {
        this.a = qiaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b11)) {
            return false;
        }
        qia qiaVar = this.a;
        iw iwVar = qiaVar.a;
        qia qiaVar2 = ((b11) obj).a;
        return xj5.a(iwVar, qiaVar2.a) && qiaVar.b.c(qiaVar2.b) && xj5.a(qiaVar.c, qiaVar2.c) && qiaVar.d == qiaVar2.d && qiaVar.e == qiaVar2.e && qiaVar.f == qiaVar2.f && xj5.a(qiaVar.g, qiaVar2.g) && qiaVar.h == qiaVar2.h && qiaVar.i == qiaVar2.i && xx1.b(qiaVar.j, qiaVar2.j);
    }

    public final int hashCode() {
        qia qiaVar = this.a;
        int iHashCode = qiaVar.a.hashCode() * 31;
        wja wjaVar = qiaVar.b;
        ww9 ww9Var = wjaVar.a;
        long j = ww9Var.b;
        dka[] dkaVarArr = bka.b;
        int iHashCode2 = Long.hashCode(j) * 31;
        ob4 ob4Var = ww9Var.c;
        int i = (iHashCode2 + (ob4Var != null ? ob4Var.t : 0)) * 31;
        mb4 mb4Var = ww9Var.d;
        int iHashCode3 = (i + (mb4Var != null ? Integer.hashCode(mb4Var.a) : 0)) * 31;
        nb4 nb4Var = ww9Var.e;
        int iHashCode4 = (iHashCode3 + (nb4Var != null ? Integer.hashCode(nb4Var.a) : 0)) * 31;
        qa4 qa4Var = ww9Var.f;
        int iHashCode5 = (iHashCode4 + (qa4Var != null ? qa4Var.hashCode() : 0)) * 31;
        String str = ww9Var.g;
        int iC = al.c(ww9Var.h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        gl0 gl0Var = ww9Var.i;
        int iHashCode6 = (iC + (gl0Var != null ? Float.hashCode(gl0Var.a) : 0)) * 31;
        oha ohaVar = ww9Var.j;
        int iHashCode7 = (iHashCode6 + (ohaVar != null ? ohaVar.hashCode() : 0)) * 31;
        ad6 ad6Var = ww9Var.k;
        int iHashCode8 = (iHashCode7 + (ad6Var != null ? ad6Var.t.hashCode() : 0)) * 31;
        long j2 = ww9Var.l;
        int i2 = uh1.l;
        int iC2 = al.c(j2, iHashCode8, 31);
        r18 r18Var = ww9Var.o;
        int iHashCode9 = (wjaVar.b.hashCode() + ((iC2 + (r18Var != null ? r18Var.hashCode() : 0)) * 31)) * 31;
        b28 b28Var = wjaVar.c;
        return Long.hashCode(qiaVar.j) + ((qiaVar.i.hashCode() + ((qiaVar.h.hashCode() + ((qiaVar.g.hashCode() + os2.a(qiaVar.f, uo2.a((ho2.a((iHashCode9 + (b28Var != null ? b28Var.hashCode() : 0) + iHashCode) * 31, 31, qiaVar.c) + qiaVar.d) * 31, qiaVar.e, 31), 31)) * 31)) * 31)) * 31);
    }
}
