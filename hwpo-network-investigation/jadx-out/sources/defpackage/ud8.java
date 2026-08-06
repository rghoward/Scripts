package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ud8 {
    public static final ud8 c = new ud8(0.0f, new gg1(0.0f));
    public final float a;
    public final gg1 b;

    public ud8() {
        throw null;
    }

    public ud8(float f, gg1 gg1Var) {
        this.a = f;
        this.b = gg1Var;
        if (Float.isNaN(f)) {
            z90.a("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud8)) {
            return false;
        }
        ud8 ud8Var = (ud8) obj;
        return this.a == ud8Var.a && xj5.a(this.b, ud8Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
