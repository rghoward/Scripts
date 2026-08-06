package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dm3 extends l85 {
    public final Drawable a;
    public final k85 b;
    public final Throwable c;

    public dm3(Drawable drawable, k85 k85Var, Throwable th) {
        this.a = drawable;
        this.b = k85Var;
        this.c = th;
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
        if (!(obj instanceof dm3)) {
            return false;
        }
        dm3 dm3Var = (dm3) obj;
        return xj5.a(this.a, dm3Var.a) && xj5.a(this.b, dm3Var.b) && xj5.a(this.c, dm3Var.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = drawable != null ? drawable.hashCode() : 0;
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }
}
