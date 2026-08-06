package j$.time;

import io.intercom.android.sdk.models.AttributeType;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.n, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = of(LocalDate.d, LocalTime.e);
    public static final LocalDateTime d = of(LocalDate.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public static LocalDateTime E(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).A();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.L(temporalAccessor), LocalTime.L(temporalAccessor));
        } catch (b e) {
            j$.nio.file.k.g("Unable to obtain LocalDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static LocalDateTime O(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.e0(j2);
        long totalSeconds = j + ((long) zoneOffset.getTotalSeconds());
        return new LocalDateTime(LocalDate.g0(Math.floorDiv(totalSeconds, 86400L)), LocalTime.V((((long) ((int) Math.floorMod(totalSeconds, 86400L))) * 1000000000) + j2));
    }

    public static LocalDateTime now() {
        a aVarY = j$.desugar.sun.nio.fs.g.y();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        return O(instantOfEpochMilli.getEpochSecond(), instantOfEpochMilli.getNano(), aVarY.a.E().d(instantOfEpochMilli));
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, AttributeType.DATE);
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 5, this);
    }

    public final boolean L(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return z((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long jP = ((LocalDate) m()).P();
        long jP2 = chronoLocalDateTime.m().P();
        return jP < jP2 || (jP == jP2 && toLocalTime().j0() < chronoLocalDateTime.toLocalTime().j0());
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? z((LocalDateTime) chronoLocalDateTime) : super.compareTo(chronoLocalDateTime);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) rVar.z(this, j);
        }
        switch (g.a[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return e0(this.a, 0L, 0L, 0L, j, 1);
            case 2:
                LocalDateTime localDateTimePlusDays = plusDays(j / 86400000000L);
                return localDateTimePlusDays.e0(localDateTimePlusDays.a, 0L, 0L, 0L, (j % 86400000000L) * 1000, 1);
            case 3:
                LocalDateTime localDateTimePlusDays2 = plusDays(j / 86400000);
                return localDateTimePlusDays2.e0(localDateTimePlusDays2.a, 0L, 0L, 0L, (j % 86400000) * 1000000, 1);
            case 4:
                return b0(j);
            case 5:
                return e0(this.a, 0L, j, 0L, 0L, 1);
            case 6:
                return e0(this.a, j, 0L, 0L, 0L, 1);
            case 7:
                LocalDateTime localDateTimePlusDays3 = plusDays(j / 256);
                return localDateTimePlusDays3.e0(localDateTimePlusDays3.a, (j % 256) * 12, 0L, 0L, 0L, 1);
            default:
                return f0(this.a.b(j, rVar), this.b);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime K(ZoneId zoneId) {
        return ZonedDateTime.E(this, null, zoneId);
    }

    public final LocalDateTime b0(long j) {
        return e0(this.a, 0L, 0L, j, 0L, 1);
    }

    @Override // j$.time.temporal.m
    public final ChronoLocalDateTime c(long j, r rVar) {
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
        return eVar == q.f ? this.a : super.d(eVar);
    }

    public final LocalDateTime e0(LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return f0(localDate, localTime);
        }
        long j6 = i;
        long jJ0 = localTime.j0();
        long j7 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j6) + jJ0;
        long jFloorDiv = Math.floorDiv(j7, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j6);
        long jFloorMod = Math.floorMod(j7, 86400000000000L);
        return f0(localDate.plusDays(jFloorDiv), jFloorMod == jJ0 ? this.b : LocalTime.V(jFloorMod));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final LocalDateTime f0(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime j(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDate) {
            return f0((LocalDate) nVar, this.b);
        }
        if (nVar instanceof LocalTime) {
            return f0(this.a, (LocalTime) nVar);
        }
        return nVar instanceof LocalDateTime ? (LocalDateTime) nVar : (LocalDateTime) nVar.f(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) temporalField).f0() ? this.b.h(temporalField) : this.a.h(temporalField);
        }
        return super.h(temporalField);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (LocalDateTime) temporalField.b0(this, j);
        }
        boolean zF0 = ((j$.time.temporal.a) temporalField).f0();
        LocalDate localDate = this.a;
        return zF0 ? f0(localDate, this.b.a(temporalField, j)) : f0(localDate.a(temporalField, j), this.b);
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField != null && temporalField.z(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        return aVar.isDateBased() || aVar.f0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) temporalField).f0() ? this.b.k(temporalField) : this.a.k(temporalField);
        }
        return temporalField.V(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final t l(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) temporalField).f0() ? this.b.l(temporalField) : this.a.l(temporalField);
        }
        return temporalField.E(this);
    }

    public LocalDateTime minusSeconds(long j) {
        return e0(this.a, 0L, 0L, j, 0L, -1);
    }

    public LocalDateTime plusDays(long j) {
        return f0(this.a.plusDays(j), this.b);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate m() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    public final int z(LocalDateTime localDateTime) {
        int iZ = this.a.z(localDateTime.m());
        return iZ == 0 ? this.b.compareTo(localDateTime.toLocalTime()) : iZ;
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
}
