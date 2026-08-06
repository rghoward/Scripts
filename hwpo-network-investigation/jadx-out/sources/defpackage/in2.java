package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class in2 {
    public final Drawable a;
    public final boolean b;

    public in2(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in2)) {
            return false;
        }
        in2 in2Var = (in2) obj;
        return xj5.a(this.a, in2Var.a) && this.b == in2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
