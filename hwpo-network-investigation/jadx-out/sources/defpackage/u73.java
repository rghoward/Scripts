package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u73 extends ku3 {
    public final Drawable a;
    public final boolean b;
    public final jf2 c;

    public u73(Drawable drawable, boolean z, jf2 jf2Var) {
        this.a = drawable;
        this.b = z;
        this.c = jf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u73)) {
            return false;
        }
        u73 u73Var = (u73) obj;
        return xj5.a(this.a, u73Var.a) && this.b == u73Var.b && this.c == u73Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + uo2.a(this.a.hashCode() * 31, this.b, 31);
    }
}
