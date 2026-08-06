package j$.time;

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
public final class OffsetTime implements j$.time.temporal.m, j$.time.temporal.n, Comparable<OffsetTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        of(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        of(localTime2, zoneOffset2);
    }

    public OffsetTime(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetTime of(LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetTime(localTime, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 9, this);
    }

    public final OffsetTime E(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new OffsetTime(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (OffsetTime) temporalField.b0(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        LocalTime localTime = this.a;
        if (temporalField != aVar) {
            return E(localTime.a(temporalField, j), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) temporalField;
        return E(localTime, ZoneOffset.ofTotalSeconds(aVar2.b.a(aVar2, j)));
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
    public final int compareTo(OffsetTime offsetTime) {
        OffsetTime offsetTime2 = offsetTime;
        boolean zEquals = this.b.equals(offsetTime2.b);
        LocalTime localTime = this.a;
        if (zEquals) {
            return localTime.compareTo(offsetTime2.a);
        }
        int iCompare = Long.compare(localTime.j0() - (((long) this.b.getTotalSeconds()) * 1000000000), offsetTime2.a.j0() - (((long) offsetTime2.b.getTotalSeconds()) * 1000000000));
        return iCompare == 0 ? this.a.compareTo(offsetTime2.a) : iCompare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(e eVar) {
        if (eVar == q.d || eVar == q.e) {
            return this.b;
        }
        if (((eVar == q.a) || (eVar == q.b)) || eVar == q.f) {
            return null;
        }
        if (eVar == q.g) {
            return this.a;
        }
        return eVar == q.c ? j$.time.temporal.b.NANOS : eVar.l(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.m j(LocalDate localDate) {
        return (OffsetTime) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetTime) {
            OffsetTime offsetTime = (OffsetTime) obj;
            if (this.a.equals(offsetTime.a) && this.b.equals(offsetTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m f(j$.time.temporal.m mVar) {
        return mVar.a(j$.time.temporal.a.NANO_OF_DAY, this.a.j0()).a(j$.time.temporal.a.OFFSET_SECONDS, this.b.getTotalSeconds());
    }

    public ZoneOffset getOffset() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.b ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) temporalField).f0() || temporalField == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return temporalField == j$.time.temporal.a.OFFSET_SECONDS ? this.b.getTotalSeconds() : this.a.k(temporalField);
        }
        return temporalField.V(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final t l(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return temporalField == j$.time.temporal.a.OFFSET_SECONDS ? ((j$.time.temporal.a) temporalField).b : this.a.l(temporalField);
        }
        return temporalField.E(this);
    }

    public LocalTime toLocalTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final OffsetTime b(long j, r rVar) {
        return rVar instanceof j$.time.temporal.b ? E(this.a.b(j, rVar), this.b) : (OffsetTime) rVar.z(this, j);
    }
}
