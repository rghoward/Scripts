package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ej0 {
    public final ArrayList a;
    public final xn0 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final float a;
        public final jl3 b;

        public a(float f, jl3 jl3Var) {
            this.a = f;
            this.b = jl3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && xj5.a(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.a) * 31;
            jl3 jl3Var = this.b;
            return iHashCode + (jl3Var == null ? 0 : jl3Var.hashCode());
        }

        public final String toString() {
            return "Item(value=" + this.a + ", metadata=" + this.b + ")";
        }
    }

    public ej0(ArrayList arrayList, xn0 xn0Var) {
        xn0Var.getClass();
        this.a = arrayList;
        this.b = xn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej0)) {
            return false;
        }
        ej0 ej0Var = (ej0) obj;
        return this.a.equals(ej0Var.a) && this.b == ej0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BarChartDataModel(values=" + this.a + ", measureType=" + this.b + ")";
    }
}
