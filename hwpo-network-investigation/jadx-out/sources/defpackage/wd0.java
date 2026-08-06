package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wd0 extends u92.e.d.f {
    public final List<u92.e.d.AbstractC0265e> a;

    public wd0() {
        throw null;
    }

    public wd0(List list) {
        this.a = list;
    }

    @Override // u92.e.d.f
    public final List<u92.e.d.AbstractC0265e> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u92.e.d.f) {
            return this.a.equals(((u92.e.d.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
