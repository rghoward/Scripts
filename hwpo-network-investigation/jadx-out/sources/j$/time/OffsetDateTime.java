package j$.time;

import j$.time.temporal.TemporalField;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.n, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        of(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        of(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime of(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 10, this);
    }

    public static OffsetDateTime z(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.E().d(instant);
        return new OffsetDateTime(LocalDateTime.O(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j, r rVar) {
        return rVar instanceof j$.time.temporal.b ? L(this.a.b(j, rVar), this.b) : (OffsetDateTime) rVar.z(this, j);
    }

    public final OffsetDateTime L(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) temporalField.b0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        int i = k.a[aVar.ordinal()];
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? L(localDateTime.a(temporalField, j), this.b) : L(localDateTime, ZoneOffset.ofTotalSeconds(aVar.b.a(aVar, j)));
        }
        return z(Instant.ofEpochSecond(j, localDateTime.b.getNano()), this.b);
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

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (getOffset().equals(offsetDateTime2.getOffset())) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.a.toEpochSecond(this.b), offsetDateTime2.a.toEpochSecond(offsetDateTime2.b));
            if (iCompare == 0) {
                iCompare = this.a.toLocalTime().getNano() - offsetDateTime2.a.toLocalTime().getNano();
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(e eVar) {
        if (eVar == q.d || eVar == q.e) {
            return getOffset();
        }
        if (eVar == q.a) {
            return null;
        }
        if (eVar == q.f) {
            return toLocalDate();
        }
        if (eVar == q.g) {
            return this.a.toLocalTime();
        }
        if (eVar == q.b) {
            return j$.time.chrono.p.d;
        }
        return eVar == q.c ? j$.time.temporal.b.NANOS : eVar.l(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.m j(LocalDate localDate) {
        return localDate == null ? (OffsetDateTime) localDate.f(this) : L(this.a.j(localDate), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m f(j$.time.temporal.m mVar) {
        return mVar.a(j$.time.temporal.a.EPOCH_DAY, toLocalDate().P()).a(j$.time.temporal.a.NANO_OF_DAY, this.a.toLocalTime().j0()).a(j$.time.temporal.a.OFFSET_SECONDS, getOffset().getTotalSeconds());
    }

    public ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return super.h(temporalField);
        }
        int i = k.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.h(temporalField) : getOffset().getTotalSeconds();
        }
        throw new s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final int hashCode() {
        return this.b.b ^ this.a.hashCode();
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
        int i = k.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.k(temporalField) : getOffset().getTotalSeconds();
        }
        return this.a.toEpochSecond(this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final t l(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return (temporalField == j$.time.temporal.a.INSTANT_SECONDS || temporalField == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) temporalField).b : this.a.l(temporalField);
        }
        return temporalField.E(this);
    }

    public LocalDate toLocalDate() {
        return this.a.m();
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }
}
