package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k49 {
    public final List<sc8> a;
    public final List<cq5> b;

    public k49(List<sc8> list, List<cq5> list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k49)) {
            return false;
        }
        k49 k49Var = (k49) obj;
        return this.a.equals(k49Var.a) && this.b.equals(k49Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScheduleModel(programsList=" + this.a + ", launchDates=" + this.b + ")";
    }
}
