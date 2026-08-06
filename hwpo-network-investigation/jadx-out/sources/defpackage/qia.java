package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qia {
    public final iw a;
    public final wja b;
    public final List<iw.c<mz7>> c;
    public final int d;
    public final boolean e;
    public final int f;
    public final tx2 g;
    public final tq5 h;
    public final qa4.a i;
    public final long j;

    public qia(iw iwVar, wja wjaVar, List list, int i, boolean z, int i2, tx2 tx2Var, tq5 tq5Var, qa4.a aVar, long j) {
        this.a = iwVar;
        this.b = wjaVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = tx2Var;
        this.h = tq5Var;
        this.i = aVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qia)) {
            return false;
        }
        qia qiaVar = (qia) obj;
        return xj5.a(this.a, qiaVar.a) && xj5.a(this.b, qiaVar.b) && xj5.a(this.c, qiaVar.c) && this.d == qiaVar.d && this.e == qiaVar.e && this.f == qiaVar.f && xj5.a(this.g, qiaVar.g) && this.h == qiaVar.h && xj5.a(this.i, qiaVar.i) && xx1.b(this.j, qiaVar.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + os2.a(this.f, uo2.a((ho2.a(r43.a(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, this.e, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) xx1.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
