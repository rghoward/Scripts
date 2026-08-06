package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hx0 implements mha {
    public final cl9 a;
    public final float b;

    public hx0(cl9 cl9Var, float f) {
        this.a = cl9Var;
        this.b = f;
    }

    @Override // defpackage.mha
    public final float a() {
        return this.b;
    }

    @Override // defpackage.mha
    public final long c() {
        int i = uh1.l;
        return uh1.k;
    }

    @Override // defpackage.mha
    public final fx0 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx0)) {
            return false;
        }
        hx0 hx0Var = (hx0) obj;
        return xj5.a(this.a, hx0Var.a) && Float.compare(this.b, hx0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return ho.a(sb, this.b, ')');
    }
}
