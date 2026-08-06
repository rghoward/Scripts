package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ge0 extends yu4 {
    public final String a;
    public final ArrayList b;

    public ge0(String str, ArrayList arrayList) {
        if (str == null) {
            ac4.c("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    @Override // defpackage.yu4
    public final List<String> a() {
        return this.b;
    }

    @Override // defpackage.yu4
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yu4)) {
            return false;
        }
        yu4 yu4Var = (yu4) obj;
        return this.a.equals(yu4Var.b()) && this.b.equals(yu4Var.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
