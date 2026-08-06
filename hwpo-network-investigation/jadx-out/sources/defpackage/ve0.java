package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ve0 extends r49 {
    public final uf1 a;
    public final HashMap b;

    public ve0(uf1 uf1Var, HashMap map) {
        this.a = uf1Var;
        this.b = map;
    }

    @Override // defpackage.r49
    public final uf1 a() {
        return this.a;
    }

    @Override // defpackage.r49
    public final Map<o98, r49.a> c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r49)) {
            return false;
        }
        r49 r49Var = (r49) obj;
        return this.a.equals(r49Var.a()) && this.b.equals(r49Var.c());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
