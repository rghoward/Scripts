package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements ChronoLocalDateTime, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient ChronoLocalDate a;
    public final transient LocalTime b;

    public e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.a = chronoLocalDate;
        this.b = localTime;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 2, this);
    }

    public static e z(Chronology chronology, j$.time.temporal.m mVar) {
        e eVar = (e) mVar;
        if (chronology.equals(eVar.g())) {
            return eVar;
        }
        j$.nio.file.k.k("Chronology mismatch, required: ", chronology.getId(), eVar.g().getId());
        return null;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final e b(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return z(this.a.g(), rVar.z(this, j));
        }
        switch (d.a[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return L(this.a, 0L, 0L, 0L, j);
            case 2:
                e eVarO = O(this.a.b(j / 86400000000L, (j$.time.temporal.r) j$.time.temporal.b.DAYS), this.b);
                return eVarO.L(eVarO.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                e eVarO2 = O(this.a.b(j / 86400000, (j$.time.temporal.r) j$.time.temporal.b.DAYS), this.b);
                return eVarO2.L(eVarO2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return L(this.a, 0L, 0L, j, 0L);
            case 5:
                return L(this.a, 0L, j, 0L, 0L);
            case 6:
                return L(this.a, j, 0L, 0L, 0L);
            case 7:
                e eVarO3 = O(this.a.b(j / 256, (j$.time.temporal.r) j$.time.temporal.b.DAYS), this.b);
                return eVarO3.L(eVarO3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return O(this.a.b(j, rVar), this.b);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime K(ZoneId zoneId) {
        return i.E(zoneId, null, this);
    }

    public final e L(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return O(chronoLocalDate, localTime);
        }
        long j6 = j / 24;
        long jJ0 = localTime.j0();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + jJ0;
        long jFloorDiv = Math.floorDiv(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jFloorMod = Math.floorMod(j7, 86400000000000L);
        return O(chronoLocalDate.b(jFloorDiv, (j$.time.temporal.r) j$.time.temporal.b.DAYS), jFloorMod == jJ0 ? this.b : LocalTime.V(jFloorMod));
    }

    public final e O(j$.time.temporal.m mVar, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == mVar && this.b == localTime) ? this : new e(c.z(chronoLocalDate.g(), mVar), localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final e j(j$.time.temporal.n nVar) {
        if (nVar instanceof ChronoLocalDate) {
            return O((ChronoLocalDate) nVar, this.b);
        }
        boolean z = nVar instanceof LocalTime;
        ChronoLocalDate chronoLocalDate = this.a;
        if (z) {
            return O(chronoLocalDate, (LocalTime) nVar);
        }
        return nVar instanceof e ? z(chronoLocalDate.g(), (e) nVar) : z(chronoLocalDate.g(), (e) nVar.f(this));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final e a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return z(this.a.g(), temporalField.b0(this, j));
        }
        boolean zF0 = ((j$.time.temporal.a) temporalField).f0();
        ChronoLocalDate chronoLocalDate = this.a;
        return zF0 ? O(chronoLocalDate, this.b.a(temporalField, j)) : O(chronoLocalDate.a(temporalField, j), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) temporalField).f0() ? this.b.h(temporalField) : this.a.h(temporalField);
        }
        return l(temporalField).a(temporalField, k(temporalField));
    }

    public final int hashCode() {
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
    public final j$.time.temporal.t l(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return (((j$.time.temporal.a) temporalField).f0() ? this.b : this.a).l(temporalField);
        }
        return temporalField.E(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate m() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
