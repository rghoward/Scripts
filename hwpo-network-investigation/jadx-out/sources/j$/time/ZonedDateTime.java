package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalField;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.m, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime E(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, (ZoneOffset) zoneId, zoneId);
        }
        j$.time.zone.f fVarE = zoneId.E();
        List listF = fVarE.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = fVarE.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.b0(Duration.E(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds(), 0).getSeconds());
            zoneOffset = bVar.d;
        } else if (zoneOffset == null || !listF.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listF.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    public static ZonedDateTime ofInstant(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        return zoneId.E().f(localDateTime).contains(zoneOffset) ? new ZonedDateTime(localDateTime, zoneOffset, zoneId) : z(localDateTime.toEpochSecond(zoneOffset), localDateTime.b.getNano(), zoneId);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.a(charSequence, new e(1));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 6, this);
    }

    public static ZonedDateTime z(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.E().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.O(j, i, zoneOffsetD), zoneOffsetD, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime J(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : E(this.a, this.b, zoneId);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j, r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (ZonedDateTime) rVar.z(this, j);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) rVar;
        if (bVar.compareTo(j$.time.temporal.b.DAYS) < 0 || bVar == j$.time.temporal.b.FOREVER) {
            return ofInstant(this.a.b(j, rVar), this.b, this.c);
        }
        return E(this.a.b(j, rVar), this.b, this.c);
    }

    public final ZonedDateTime O(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.b) || !this.c.E().f(this.a).contains(zoneOffset)) ? this : new ZonedDateTime(this.a, zoneOffset, this.c);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime j(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDate) {
            return E(LocalDateTime.of((LocalDate) nVar, this.a.toLocalTime()), this.b, this.c);
        }
        if (nVar instanceof LocalTime) {
            return E(LocalDateTime.of(this.a.m(), (LocalTime) nVar), this.b, this.c);
        }
        if (nVar instanceof LocalDateTime) {
            return E((LocalDateTime) nVar, this.b, this.c);
        }
        if (nVar instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) nVar;
            return E(offsetDateTime.toLocalDateTime(), offsetDateTime.getOffset(), this.c);
        }
        if (!(nVar instanceof Instant)) {
            return nVar instanceof ZoneOffset ? O((ZoneOffset) nVar) : (ZonedDateTime) nVar.f(this);
        }
        Instant instant = (Instant) nVar;
        return z(instant.getEpochSecond(), instant.getNano(), this.c);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) temporalField.b0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        int i = p.a[aVar.ordinal()];
        if (i == 1) {
            return z(j, this.a.b.getNano(), this.c);
        }
        if (i == 2) {
            return O(ZoneOffset.ofTotalSeconds(aVar.b.a(aVar, j)));
        }
        return E(this.a.a(temporalField, j), this.b, this.c);
    }

    @Override // j$.time.temporal.m
    public final ChronoZonedDateTime c(long j, r rVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, rVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(e eVar) {
        return eVar == q.f ? m() : super.d(eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    public int getHour() {
        return this.a.b.getHour();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return super.h(temporalField);
        }
        int i = p.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.h(temporalField) : getOffset().getTotalSeconds();
        }
        throw new s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return true;
        }
        return temporalField != null && temporalField.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        int i = p.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.k(temporalField) : getOffset().getTotalSeconds();
        }
        return d0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final t l(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return (temporalField == j$.time.temporal.a.INSTANT_SECONDS || temporalField == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) temporalField).b : this.a.l(temporalField);
        }
        return temporalField.E(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate m() {
        return this.a.m();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime A() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime toLocalTime() {
        return this.a.toLocalTime();
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    public ZonedDateTime withDayOfMonth(int i) {
        LocalDateTime localDateTime = this.a;
        LocalDate localDateOf = localDateTime.a;
        if (localDateOf.c != i) {
            localDateOf = LocalDate.of(localDateOf.a, localDateOf.b, i);
        }
        return E(localDateTime.f0(localDateOf, localDateTime.b), this.b, this.c);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, r rVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, rVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, rVar);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return z(instant.getEpochSecond(), instant.getNano(), zoneId);
    }
}
