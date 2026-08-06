package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public enum b implements r {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");

    public final String a;

    static {
        Duration.L(1L);
        Duration.L(1000L);
        Duration.L(1000000L);
        Duration.E(1L, 0);
        Duration.E(60L, 0);
        Duration.E(3600L, 0);
        Duration.E(43200L, 0);
        Duration.E(86400L, 0);
        Duration.E(604800L, 0);
        Duration.E(2629746L, 0);
        Duration.E(31556952L, 0);
        Duration.E(315569520L, 0);
        Duration.E(3155695200L, 0);
        Duration.E(31556952000L, 0);
        Duration.E(31556952000000000L, 0);
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.r
    public final m z(m mVar, long j) {
        return mVar.b(j, this);
    }
}
