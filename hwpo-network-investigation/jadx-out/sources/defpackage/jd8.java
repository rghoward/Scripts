package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jd8 {
    public static final a Companion = new a();
    public static final jd8 c;
    public final List<sc8> a;
    public final List<cq5> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    static {
        hf3 hf3Var = hf3.t;
        c = new jd8(hf3Var, hf3Var);
    }

    public jd8(List<sc8> list, List<cq5> list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd8)) {
            return false;
        }
        jd8 jd8Var = (jd8) obj;
        return this.a.equals(jd8Var.a) && this.b.equals(jd8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProgramsAndLaunchDates(programs=" + this.a + ", launchDates=" + this.b + ")";
    }
}
