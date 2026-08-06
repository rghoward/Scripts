package defpackage;

import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rlb {
    public final LocalDate a;
    public final List<zl2> b;

    public rlb(LocalDate localDate, List<zl2> list) {
        localDate.getClass();
        this.a = localDate;
        this.b = list;
    }

    public static rlb a(rlb rlbVar, ArrayList arrayList) {
        LocalDate localDate = rlbVar.a;
        rlbVar.getClass();
        localDate.getClass();
        return new rlb(localDate, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlb)) {
            return false;
        }
        rlb rlbVar = (rlb) obj;
        return xj5.a(this.a, rlbVar.a) && this.b.equals(rlbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WeekUiEntity(weekStart=" + this.a + ", days=" + this.b + ")";
    }
}
