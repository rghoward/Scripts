package j$.time;

import defpackage.z97;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
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
public final class LocalDate implements j$.time.temporal.m, j$.time.temporal.n, ChronoLocalDate, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate E(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.p.d.c0(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    j$.nio.file.k.c("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new b("Invalid date '" + Month.O(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate L(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.d(q.f);
        if (localDate != null) {
            return localDate;
        }
        j$.nio.file.k.f("Unable to obtain LocalDate from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalDate f0(a aVar) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.a;
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return g0(Math.floorDiv(instantOfEpochMilli.getEpochSecond() + ((long) zoneId.E().d(instantOfEpochMilli).getTotalSeconds()), 86400L));
    }

    public static LocalDate g0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.e0(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(aVar, j7), i3, i4);
    }

    public static LocalDate h0(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.e0(j);
        j$.time.temporal.a.DAY_OF_YEAR.e0(i2);
        boolean zC0 = j$.time.chrono.p.d.c0(j);
        if (i2 == 366 && !zC0) {
            j$.nio.file.k.c("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        Month monthO = Month.O(((i2 - 1) / 31) + 1);
        if (i2 > (monthO.E(zC0) + monthO.z(zC0)) - 1) {
            monthO = Month.a[(monthO.ordinal() + 13) % 12];
        }
        return new LocalDate(i, monthO.getValue(), (i2 - monthO.z(zC0)) + 1);
    }

    public static LocalDate k0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.p.d.c0((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate now() {
        return f0(j$.desugar.sun.nio.fs.g.y());
    }

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.e0(i);
        j$.time.temporal.a.MONTH_OF_YEAR.e0(i2);
        j$.time.temporal.a.DAY_OF_MONTH.e0(i3);
        return E(i, i2, i3);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.a(charSequence, new e(0));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 3, this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean B() {
        return j$.time.chrono.p.d.c0(this.a);
    }

    public final int O(TemporalField temporalField) {
        switch (f.a[((j$.time.temporal.a) temporalField).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return V();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((V() - 1) % 7) + 1;
            case 8:
                throw new s("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((V() - 1) / 7) + 1;
            case 10:
                return this.b;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                throw new s("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new s(c.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long P() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !B() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.j S() {
        return getYear() >= 1 ? j$.time.chrono.q.CE : j$.time.chrono.q.BCE;
    }

    public final int V() {
        return (getMonth().z(B()) + this.c) - 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate X(j$.time.temporal.p pVar) {
        if (pVar != null) {
            Period period = (Period) pVar;
            return plusMonths((((long) period.a) * 12) + ((long) period.b)).plusDays(period.getDays());
        }
        Objects.requireNonNull(pVar, "amountToAdd");
        return (LocalDate) ((Period) pVar).z(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int a0() {
        return B() ? 366 : 365;
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime localDateTimeQ = Q(LocalTime.MIDNIGHT);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objE = zoneId.E().e(localDateTimeQ);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            if (bVar != null && bVar.z()) {
                localDateTimeQ = bVar.b.b0(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds());
            }
        }
        return ZonedDateTime.E(localDateTimeQ, null, zoneId);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime Q(LocalTime localTime) {
        return LocalDateTime.of(this, localTime);
    }

    public final boolean b0(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return z((LocalDate) chronoLocalDate) < 0;
        }
        return P() < chronoLocalDate.P();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? z((LocalDate) chronoLocalDate) : super.compareTo(chronoLocalDate);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(e eVar) {
        return eVar == q.f ? this : super.d(eVar);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, r rVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, rVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, rVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && z((LocalDate) obj) == 0;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return j$.time.chrono.p.d;
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.z(((int) Math.floorMod(P() + 3, 7L)) + 1);
    }

    public Month getMonth() {
        return Month.O(this.b);
    }

    public int getMonthValue() {
        return this.b;
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        return temporalField instanceof j$.time.temporal.a ? O(temporalField) : super.h(temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j, r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (LocalDate) rVar.z(this, j);
        }
        switch (f.b[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusWeeks(j);
            case 3:
                return plusMonths(j);
            case 4:
                return j0(j);
            case 5:
                return j0(Math.multiplyExact(j, 10L));
            case 6:
                return j0(Math.multiplyExact(j, 100L));
            case 7:
                return j0(Math.multiplyExact(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(aVar, Math.addExact(k(aVar), j));
            default:
                j$.nio.file.k.d("Unsupported unit: ", rVar);
                return null;
        }
    }

    public final LocalDate j0(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return k0(aVar.b.a(aVar, ((long) this.a) + j), this.b, this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        if (temporalField == j$.time.temporal.a.EPOCH_DAY) {
            return P();
        }
        return temporalField == j$.time.temporal.a.PROLEPTIC_MONTH ? ((((long) this.a) * 12) + ((long) this.b)) - 1 : O(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final t l(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.E(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        if (!aVar.isDateBased()) {
            throw new s(c.a("Unsupported field: ", temporalField));
        }
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return t.f(1L, lengthOfMonth());
        }
        if (i == 2) {
            return t.f(1L, a0());
        }
        if (i == 3) {
            return t.f(1L, (getMonth() != Month.FEBRUARY || B()) ? 5L : 4L);
        }
        if (i != 4) {
            return aVar.b;
        }
        return getYear() <= 0 ? t.f(1L, 1000000000L) : t.f(1L, 999999999L);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate j(j$.time.temporal.n nVar) {
        return nVar instanceof LocalDate ? (LocalDate) nVar : (LocalDate) nVar.f(this);
    }

    public int lengthOfMonth() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return B() ? 29 : 28;
    }

    public final LocalDate m0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.e0(i);
        return k0(i, this.b, this.c);
    }

    public LocalDate minusDays(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plusDays(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plusDays(j2);
    }

    public LocalDate minusWeeks(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plusWeeks(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plusWeeks(j2);
    }

    public LocalDate minusYears(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = j0(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.j0(j2);
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j2 <= jLengthOfMonth) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - jLengthOfMonth));
                }
                j$.time.temporal.a.YEAR.e0(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - jLengthOfMonth));
            }
        }
        return g0(Math.addExact(P(), j));
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return k0(aVar.b.a(aVar, Math.floorDiv(j2, 12L)), ((int) Math.floorMod(j2, 12L)) + 1, this.c);
    }

    public LocalDate plusWeeks(long j) {
        return plusDays(Math.multiplyExact(j, 7L));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: with, reason: merged with bridge method [inline-methods] */
    public LocalDate a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (LocalDate) temporalField.b0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        aVar.e0(j);
        switch (f.a[aVar.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return of(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (V() != i2) {
                    return h0(this.a, i2);
                }
                return this;
            case 3:
                return plusWeeks(j - k(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return m0((int) j);
            case 5:
                return plusDays(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return plusDays(j - k(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - k(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return g0(j);
            case 9:
                return plusWeeks(j - k(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    j$.time.temporal.a.MONTH_OF_YEAR.e0(i3);
                    return k0(this.a, i3, this.c);
                }
                return this;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return plusMonths(j - (((((long) this.a) * 12) + ((long) this.b)) - 1));
            case 12:
                return m0((int) j);
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (k(j$.time.temporal.a.ERA) != j) {
                    return m0(1 - this.a);
                }
                return this;
            default:
                throw new s(c.a("Unsupported field: ", temporalField));
        }
    }

    public final int z(LocalDate localDate) {
        int i = this.a - localDate.a;
        return (i == 0 && (i = this.b - localDate.b) == 0) ? this.c - localDate.c : i;
    }

    public static LocalDate parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.of(this, LocalTime.MIDNIGHT);
    }
}
