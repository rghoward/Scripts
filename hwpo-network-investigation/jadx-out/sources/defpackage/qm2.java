package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qm2 {
    public static final a Companion = new a();
    public final LocalDate a;
    public final LocalDate b;
    public final LocalDate c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static qm2 a(LocalDate localDate) {
            localDate.getClass();
            LocalDate localDateMinusDays = localDate.minusDays(1L);
            localDateMinusDays.getClass();
            LocalDate localDatePlusDays = localDate.plusDays(1L);
            localDatePlusDays.getClass();
            return new qm2(localDateMinusDays, localDate, localDatePlusDays);
        }
    }

    public qm2(LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        localDate2.getClass();
        this.a = localDate;
        this.b = localDate2;
        this.c = localDate3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm2)) {
            return false;
        }
        qm2 qm2Var = (qm2) obj;
        return this.a.equals(qm2Var.a) && xj5.a(this.b, qm2Var.b) && this.c.equals(qm2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DaysInPager(previousDay=" + this.a + ", currentDay=" + this.b + ", nextDay=" + this.c + ")";
    }
}
