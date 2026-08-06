package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public enum i implements r {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration.E(31556952L, 0);
        Duration.E(7889238L, 0);
    }

    i(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.r
    public final m z(m mVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            h hVar = j.c;
            return mVar.a(hVar, Math.addExact(mVar.h(hVar), j));
        }
        if (i == 2) {
            return mVar.b(j / 4, b.YEARS).b((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }
}
