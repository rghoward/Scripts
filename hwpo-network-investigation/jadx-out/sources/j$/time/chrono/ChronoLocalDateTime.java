package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalField;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends j$.time.temporal.m, j$.time.temporal.n, Comparable<ChronoLocalDateTime<?>> {
    ChronoZonedDateTime K(ZoneId zoneId);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: U */
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = m().compareTo(chronoLocalDateTime.m());
        return (iCompareTo == 0 && (iCompareTo = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime())) == 0) ? g().compareTo(chronoLocalDateTime.g()) : iCompareTo;
    }

    @Override // j$.time.temporal.m
    ChronoLocalDateTime a(TemporalField temporalField, long j);

    @Override // j$.time.temporal.m
    ChronoLocalDateTime b(long j, j$.time.temporal.r rVar);

    @Override // j$.time.temporal.m
    default ChronoLocalDateTime c(long j, j$.time.temporal.r rVar) {
        return e.z(g(), super.c(j, rVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.e eVar) {
        if (eVar == j$.time.temporal.q.a || eVar == j$.time.temporal.q.e || eVar == j$.time.temporal.q.d) {
            return null;
        }
        if (eVar == j$.time.temporal.q.g) {
            return toLocalTime();
        }
        if (eVar == j$.time.temporal.q.b) {
            return g();
        }
        return eVar == j$.time.temporal.q.c ? j$.time.temporal.b.NANOS : eVar.l(this);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m f(j$.time.temporal.m mVar) {
        return mVar.a(j$.time.temporal.a.EPOCH_DAY, m().P()).a(j$.time.temporal.a.NANO_OF_DAY, toLocalTime().j0());
    }

    default Chronology g() {
        return m().g();
    }

    @Override // j$.time.temporal.m
    default ChronoLocalDateTime j(j$.time.temporal.n nVar) {
        return e.z(g(), nVar.f(this));
    }

    ChronoLocalDate m();

    default long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((m().P() * 86400) + ((long) toLocalTime().k0())) - ((long) zoneOffset.getTotalSeconds());
    }

    LocalTime toLocalTime();
}
