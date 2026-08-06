package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.n, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    public static final Instant d = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant e = ofEpochSecond(31556889864403199L, 999999999);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant E(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.k(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.h(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (b e2) {
            j$.nio.file.k.g("Unable to obtain Instant from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e2);
            return null;
        }
    }

    public static Instant ofEpochMilli(long j) {
        return z(Math.floorDiv(j, 1000L), ((int) Math.floorMod(j, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return z(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 2, this);
    }

    public static Instant z(long j, int i) {
        if ((((long) i) | j) == 0) {
            return c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        j$.nio.file.k.h("Instant exceeds minimum or maximum instant");
        return null;
    }

    public final Instant L(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j, r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (Instant) rVar.z(this, j);
        }
        switch (d.b[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return L(0L, j);
            case 2:
                return L(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return L(j / 1000, (j % 1000) * 1000000);
            case 4:
                return L(j, 0L);
            case 5:
                return L(Math.multiplyExact(j, 60L), 0L);
            case 6:
                return L(Math.multiplyExact(j, 3600L), 0L);
            case 7:
                return L(Math.multiplyExact(j, 43200L), 0L);
            case 8:
                return L(Math.multiplyExact(j, 86400L), 0L);
            default:
                j$.nio.file.k.d("Unsupported unit: ", rVar);
                return null;
        }
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (Instant) temporalField.b0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        aVar.e0(j);
        int i = d.a[aVar.ordinal()];
        if (i == 1) {
            return j != ((long) this.b) ? z(this.a, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.b ? z(this.a, i2) : this;
        }
        if (i == 3) {
            int i3 = ((int) j) * 1000000;
            return i3 != this.b ? z(this.a, i3) : this;
        }
        if (i == 4) {
            return j != this.a ? z(j, this.b) : this;
        }
        throw new s(c.a("Unsupported field: ", temporalField));
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.z(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
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
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.a, instant2.a);
        return iCompare != 0 ? iCompare : this.b - instant2.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(e eVar) {
        if (eVar == q.c) {
            return j$.time.temporal.b.NANOS;
        }
        if (eVar == q.b || eVar == q.a || eVar == q.e || eVar == q.d || eVar == q.f || eVar == q.g) {
            return null;
        }
        return eVar.l(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.m j(LocalDate localDate) {
        return (Instant) localDate.f(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m f(j$.time.temporal.m mVar) {
        return mVar.a(j$.time.temporal.a.INSTANT_SECONDS, this.a).a(j$.time.temporal.a.NANO_OF_SECOND, this.b);
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return super.l(temporalField).a(temporalField, temporalField.V(this));
        }
        int i = d.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(aVar, this.a);
        }
        throw new s(c.a("Unsupported field: ", temporalField));
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return temporalField == j$.time.temporal.a.INSTANT_SECONDS || temporalField == j$.time.temporal.a.NANO_OF_SECOND || temporalField == j$.time.temporal.a.MICRO_OF_SECOND || temporalField == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return temporalField != null && temporalField.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        int i2 = d.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new s(c.a("Unsupported field: ", temporalField));
            }
            i = this.b / 1000000;
        }
        return i;
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? Math.addExact(Math.multiplyExact(j, 1000L), this.b / 1000000) : Math.addExact(Math.multiplyExact(j + 1, 1000L), (this.b / 1000000) - 1000);
    }

    public String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    public static Instant ofEpochSecond(long j) {
        return z(j, 0);
    }
}
