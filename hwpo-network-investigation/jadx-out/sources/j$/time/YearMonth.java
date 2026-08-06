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
public final class YearMonth implements j$.time.temporal.m, j$.time.temporal.n, Comparable<YearMonth>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.n(j$.time.temporal.a.YEAR, 4, 10, d0.EXCEEDS_PAD);
        dateTimeFormatterBuilder.d('-');
        dateTimeFormatterBuilder.m(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.r(Locale.getDefault(), c0.SMART, null);
    }

    public YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static YearMonth of(int i, int i2) {
        j$.time.temporal.a.YEAR.e0(i);
        j$.time.temporal.a.MONTH_OF_YEAR.e0(i2);
        return new YearMonth(i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 12, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final YearMonth b(long j, r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (YearMonth) rVar.z(this, j);
        }
        switch (n.b[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return L(j);
            case 2:
                return O(j);
            case 3:
                return O(Math.multiplyExact(j, 10L));
            case 4:
                return O(Math.multiplyExact(j, 100L));
            case 5:
                return O(Math.multiplyExact(j, 1000L));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(aVar, Math.addExact(k(aVar), j));
            default:
                j$.nio.file.k.d("Unsupported unit: ", rVar);
                return null;
        }
    }

    public final YearMonth L(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return V(aVar.b.a(aVar, Math.floorDiv(j2, 12L)), ((int) Math.floorMod(j2, 12L)) + 1);
    }

    public final YearMonth O(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return V(aVar.b.a(aVar, ((long) this.a) + j), this.b);
    }

    public final YearMonth V(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final YearMonth a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (YearMonth) temporalField.b0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        aVar.e0(j);
        int i = n.a[aVar.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.e0(i2);
            return V(this.a, i2);
        }
        if (i == 2) {
            return L(j - z());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            j$.time.temporal.a.YEAR.e0(i3);
            return V(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            j$.time.temporal.a.YEAR.e0(i4);
            return V(i4, this.b);
        }
        if (i != 5) {
            throw new s(c.a("Unsupported field: ", temporalField));
        }
        if (k(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        j$.time.temporal.a.YEAR.e0(i5);
        return V(i5, this.b);
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
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i = this.a - yearMonth2.a;
        return i == 0 ? this.b - yearMonth2.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(e eVar) {
        if (eVar == q.b) {
            return j$.time.chrono.p.d;
        }
        return eVar == q.c ? j$.time.temporal.b.MONTHS : super.d(eVar);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.m j(LocalDate localDate) {
        return (YearMonth) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            if (this.a == yearMonth.a && this.b == yearMonth.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m f(j$.time.temporal.m mVar) {
        if (Chronology.p(mVar).equals(j$.time.chrono.p.d)) {
            return mVar.a(j$.time.temporal.a.PROLEPTIC_MONTH, z());
        }
        j$.nio.file.k.h("Adjustment only supported on ISO date-time");
        return null;
    }

    public int getMonthValue() {
        return this.b;
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        return l(temporalField).a(temporalField, k(temporalField));
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return temporalField == j$.time.temporal.a.YEAR || temporalField == j$.time.temporal.a.MONTH_OF_YEAR || temporalField == j$.time.temporal.a.PROLEPTIC_MONTH || temporalField == j$.time.temporal.a.YEAR_OF_ERA || temporalField == j$.time.temporal.a.ERA;
        }
        return temporalField != null && temporalField.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        int i2 = n.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return z();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new s(c.a("Unsupported field: ", temporalField));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final t l(TemporalField temporalField) {
        if (temporalField == j$.time.temporal.a.YEAR_OF_ERA) {
            return t.f(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return super.l(temporalField);
    }

    public final String toString() {
        int iAbs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        int i = this.a;
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    public final long z() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }
}
