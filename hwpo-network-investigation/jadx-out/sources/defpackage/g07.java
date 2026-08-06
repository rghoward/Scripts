package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g07 implements fl6 {
    public final f07 a;

    public g07(a84 a84Var) {
        this.a = a84Var;
    }

    @Override // defpackage.fl6
    public final int a(qj5 qj5Var, List<? extends pj5> list, int i) {
        return this.a.a(qj5Var, jl6.a(qj5Var), i);
    }

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        return this.a.d(hl6Var, jl6.a(hl6Var), j);
    }

    @Override // defpackage.fl6
    public final int e(qj5 qj5Var, List<? extends pj5> list, int i) {
        return this.a.e(qj5Var, jl6.a(qj5Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g07) && xj5.a(this.a, ((g07) obj).a);
    }

    @Override // defpackage.fl6
    public final int g(qj5 qj5Var, List<? extends pj5> list, int i) {
        return this.a.g(qj5Var, jl6.a(qj5Var), i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.fl6
    public final int i(qj5 qj5Var, List<? extends pj5> list, int i) {
        return this.a.i(qj5Var, jl6.a(qj5Var), i);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
