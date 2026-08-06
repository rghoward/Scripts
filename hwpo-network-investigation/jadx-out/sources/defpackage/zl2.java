package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zl2 {
    public final LocalDate a;
    public final m21.a b;
    public final boolean c;
    public final boolean d;

    public zl2(LocalDate localDate, m21.a aVar, boolean z, boolean z2) {
        localDate.getClass();
        this.a = localDate;
        this.b = aVar;
        this.c = z;
        this.d = z2;
    }

    public static zl2 a(zl2 zl2Var, m21.a aVar, boolean z, int i) {
        LocalDate localDate = zl2Var.a;
        if ((i & 2) != 0) {
            aVar = zl2Var.b;
        }
        if ((i & 4) != 0) {
            z = zl2Var.c;
        }
        boolean z2 = zl2Var.d;
        zl2Var.getClass();
        localDate.getClass();
        return new zl2(localDate, aVar, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2)) {
            return false;
        }
        zl2 zl2Var = (zl2) obj;
        return xj5.a(this.a, zl2Var.a) && this.b == zl2Var.b && this.c == zl2Var.c && this.d == zl2Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m21.a aVar = this.b;
        return Boolean.hashCode(this.d) + uo2.a((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        return "DayUiEntity(date=" + this.a + ", state=" + this.b + ", isSelected=" + this.c + ", isToday=" + this.d + ")";
    }
}
