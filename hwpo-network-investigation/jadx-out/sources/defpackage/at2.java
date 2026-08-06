package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class at2 {
    public final n72 a;
    public final n72 b;
    public final n72 c;
    public final n72 d;
    public final xva.a e;
    public final x68 f;
    public final Bitmap.Config g;
    public final boolean h;
    public final boolean i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final v01 m;
    public final v01 n;
    public final v01 o;

    public at2(n72 n72Var, n72 n72Var2, n72 n72Var3, n72 n72Var4, xva.a aVar, x68 x68Var, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, v01 v01Var, v01 v01Var2, v01 v01Var3) {
        this.a = n72Var;
        this.b = n72Var2;
        this.c = n72Var3;
        this.d = n72Var4;
        this.e = aVar;
        this.f = x68Var;
        this.g = config;
        this.h = z;
        this.i = z2;
        this.j = drawable;
        this.k = drawable2;
        this.l = drawable3;
        this.m = v01Var;
        this.n = v01Var2;
        this.o = v01Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at2)) {
            return false;
        }
        at2 at2Var = (at2) obj;
        return xj5.a(this.a, at2Var.a) && xj5.a(this.b, at2Var.b) && xj5.a(this.c, at2Var.c) && xj5.a(this.d, at2Var.d) && xj5.a(this.e, at2Var.e) && this.f == at2Var.f && this.g == at2Var.g && this.h == at2Var.h && this.i == at2Var.i && xj5.a(this.j, at2Var.j) && xj5.a(this.k, at2Var.k) && xj5.a(this.l, at2Var.l) && this.m == at2Var.m && this.n == at2Var.n && this.o == at2Var.o;
    }

    public final int hashCode() {
        int iA = uo2.a(uo2.a((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.h, 31), this.i, 31);
        Drawable drawable = this.j;
        int iHashCode = (iA + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.k;
        int iHashCode2 = (iHashCode + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.l;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((iHashCode2 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
