package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.c0;
import j$.time.format.d0;
import j$.time.temporal.TemporalField;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class Year implements j$.time.temporal.m, j$.time.temporal.n, Comparable<Year>, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.n(j$.time.temporal.a.YEAR, 4, 10, d0.EXCEEDS_PAD);
        dateTimeFormatterBuilder.r(Locale.getDefault(), c0.SMART, null);
    }

    public Year(int i) {
        this.a = i;
    }

    public static Year of(int i) {
        j$.time.temporal.a.YEAR.e0(i);
        return new Year(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 11, this);
    }

    public final Year E(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return of(aVar.b.a(aVar, ((long) this.a) + j));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final Year a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (Year) temporalField.b0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        aVar.e0(j);
        int i = m.a[aVar.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return of((int) j);
        }
        if (i == 2) {
            return of((int) j);
        }
        if (i == 3) {
            return k(j$.time.temporal.a.ERA) == j ? this : of(1 - this.a);
        }
        throw new s(c.a("Unsupported field: ", temporalField));
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
    public final int compareTo(Year year) {
        return this.a - year.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(e eVar) {
        if (eVar == q.b) {
            return j$.time.chrono.p.d;
        }
        return eVar == q.c ? j$.time.temporal.b.YEARS : super.d(eVar);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.m j(LocalDate localDate) {
        return (Year) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Year) && this.a == ((Year) obj).a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m f(j$.time.temporal.m mVar) {
        if (Chronology.p(mVar).equals(j$.time.chrono.p.d)) {
            return mVar.a(j$.time.temporal.a.YEAR, this.a);
        }
        j$.nio.file.k.h("Adjustment only supported on ISO date-time");
        return null;
    }

    public int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        return l(temporalField).a(temporalField, k(temporalField));
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return temporalField == j$.time.temporal.a.YEAR || temporalField == j$.time.temporal.a.YEAR_OF_ERA || temporalField == j$.time.temporal.a.ERA;
        }
        return temporalField != null && temporalField.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        int i = m.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new s(c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final t l(TemporalField temporalField) {
        if (temporalField == j$.time.temporal.a.YEAR_OF_ERA) {
            return t.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return super.l(temporalField);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final Year b(long j, r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (Year) rVar.z(this, j);
        }
        int i = m.b[((j$.time.temporal.b) rVar).ordinal()];
        if (i == 1) {
            return E(j);
        }
        if (i == 2) {
            return E(Math.multiplyExact(j, 10L));
        }
        if (i == 3) {
            return E(Math.multiplyExact(j, 100L));
        }
        if (i == 4) {
            return E(Math.multiplyExact(j, 1000L));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return a(aVar, Math.addExact(k(aVar), j));
        }
        j$.nio.file.k.d("Unsupported unit: ", rVar);
        return null;
    }
}
