package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ty9<T> implements a04<T> {
    public final float a;
    public final float b;
    public final T c;

    public /* synthetic */ ty9(int i, Object obj) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // defpackage.wv
    public final edb a(cza czaVar) {
        T t = this.c;
        return new pdb(this.a, this.b, t == null ? null : (fw) czaVar.a().invoke(t));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ty9) {
            ty9 ty9Var = (ty9) obj;
            if (ty9Var.a == this.a && ty9Var.b == this.b && xj5.a(ty9Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t = this.c;
        return Float.hashCode(this.b) + h44.a((t != null ? t.hashCode() : 0) * 31, this.a, 31);
    }

    public ty9(float f, float f2, T t) {
        this.a = f;
        this.b = f2;
        this.c = t;
    }

    public ty9() {
        this(7, null);
    }
}
