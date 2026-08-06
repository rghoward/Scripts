package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f5a extends l85 {
    public final Drawable a;
    public final k85 b;
    public final jf2 c;
    public final ar6.a d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public f5a(Drawable drawable, k85 k85Var, jf2 jf2Var, ar6.a aVar, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = k85Var;
        this.c = jf2Var;
        this.d = aVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.l85
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.l85
    public final k85 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5a)) {
            return false;
        }
        f5a f5aVar = (f5a) obj;
        return xj5.a(this.a, f5aVar.a) && xj5.a(this.b, f5aVar.b) && this.c == f5aVar.c && xj5.a(this.d, f5aVar.d) && xj5.a(this.e, f5aVar.e) && this.f == f5aVar.f && this.g == f5aVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        ar6.a aVar = this.d;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + uo2.a((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, this.f, 31);
    }
}
