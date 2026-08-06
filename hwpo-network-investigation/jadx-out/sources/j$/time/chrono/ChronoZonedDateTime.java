package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalField;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends j$.time.temporal.m, Comparable<ChronoZonedDateTime<?>> {
    ChronoLocalDateTime A();

    ChronoZonedDateTime J(ZoneId zoneId);

    @Override // j$.time.temporal.m
    ChronoZonedDateTime a(TemporalField temporalField, long j);

    @Override // j$.time.temporal.m
    ChronoZonedDateTime b(long j, j$.time.temporal.r rVar);

    @Override // j$.time.temporal.m
    default ChronoZonedDateTime c(long j, j$.time.temporal.r rVar) {
        return i.z(g(), super.c(j, rVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.e eVar) {
        if (eVar == j$.time.temporal.q.e || eVar == j$.time.temporal.q.a) {
            return getZone();
        }
        if (eVar == j$.time.temporal.q.d) {
            return getOffset();
        }
        if (eVar == j$.time.temporal.q.g) {
            return toLocalTime();
        }
        if (eVar == j$.time.temporal.q.b) {
            return g();
        }
        return eVar == j$.time.temporal.q.c ? j$.time.temporal.b.NANOS : eVar.l(this);
    }

    default long d0() {
        return ((m().P() * 86400) + ((long) toLocalTime().k0())) - ((long) getOffset().getTotalSeconds());
    }

    default Chronology g() {
        return m().g();
    }

    ZoneOffset getOffset();

    ZoneId getZone();

    @Override // j$.time.temporal.TemporalAccessor
    default int h(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return super.h(temporalField);
        }
        int i = g.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? A().h(temporalField) : getOffset().getTotalSeconds();
        }
        throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.m
    default ChronoZonedDateTime j(j$.time.temporal.n nVar) {
        return i.z(g(), nVar.f(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long k(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        int i = g.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? A().k(temporalField) : getOffset().getTotalSeconds();
        }
        return d0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.t l(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return (temporalField == j$.time.temporal.a.INSTANT_SECONDS || temporalField == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) temporalField).b : A().l(temporalField);
        }
        return temporalField.E(this);
    }

    default ChronoLocalDate m() {
        return A().m();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(d0(), chronoZonedDateTime.d0());
        return (iCompare == 0 && (iCompare = toLocalTime().getNano() - chronoZonedDateTime.toLocalTime().getNano()) == 0 && (iCompare = A().compareTo(chronoZonedDateTime.A())) == 0 && (iCompare = getZone().getId().compareTo(chronoZonedDateTime.getZone().getId())) == 0) ? g().compareTo(chronoZonedDateTime.g()) : iCompare;
    }

    default Instant toInstant() {
        return Instant.ofEpochSecond(d0(), toLocalTime().getNano());
    }

    default LocalTime toLocalTime() {
        return A().toLocalTime();
    }
}
