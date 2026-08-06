package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nnb {
    public final qu0 a;
    public final float b;

    public nnb(Rect rect, float f) {
        this.a = new qu0(rect);
        this.b = f;
    }

    public final Rect a() {
        qu0 qu0Var = this.a;
        qu0Var.getClass();
        return new Rect(qu0Var.a, qu0Var.b, qu0Var.c, qu0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nnb.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        nnb nnbVar = (nnb) obj;
        return xj5.a(this.a, nnbVar.a) && this.b == nnbVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return ho.a(sb, this.b, ')');
    }

    public nnb(qu0 qu0Var, float f) {
        this.a = qu0Var;
        this.b = f;
    }
}
