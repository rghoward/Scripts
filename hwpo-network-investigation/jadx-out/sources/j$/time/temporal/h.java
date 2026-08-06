package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements TemporalField {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ h[] b;

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final t E(TemporalAccessor temporalAccessor) {
                if (!z(temporalAccessor)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                long jK = temporalAccessor.k(h.QUARTER_OF_YEAR);
                if (jK == 1) {
                    return j$.time.chrono.p.d.c0(temporalAccessor.k(a.YEAR)) ? t.f(1L, 91L) : t.f(1L, 90L);
                }
                if (jK == 2) {
                    return t.f(1L, 91L);
                }
                return (jK == 3 || jK == 4) ? t.f(1L, 92L) : O();
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor L(Map map, b0 b0Var, c0 c0Var) {
                LocalDate localDateOf;
                long jSubtractExact;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                TemporalField temporalField = h.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(temporalField);
                if (l != null && l2 != null) {
                    int iA = aVar.b.a(aVar, l.longValue());
                    long jLongValue = ((Long) map.get(h.DAY_OF_QUARTER)).longValue();
                    h hVar2 = j.a;
                    if (Chronology.p(b0Var).equals(j$.time.chrono.p.d)) {
                        if (c0Var == c0.LENIENT) {
                            localDateOf = LocalDate.of(iA, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3L));
                            jSubtractExact = Math.subtractExact(jLongValue, 1L);
                        } else {
                            localDateOf = LocalDate.of(iA, ((temporalField.O().a(temporalField, l2.longValue()) - 1) * 3) + 1, 1);
                            if (jLongValue < 1 || jLongValue > 90) {
                                if (c0Var == c0.STRICT) {
                                    E(localDateOf).b(this, jLongValue);
                                } else {
                                    O().b(this, jLongValue);
                                }
                            }
                            jSubtractExact = jLongValue - 1;
                        }
                        map.remove(this);
                        map.remove(aVar);
                        map.remove(temporalField);
                        return localDateOf.plusDays(jSubtractExact);
                    }
                    j$.nio.file.k.h("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.TemporalField
            public final t O() {
                return t.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.TemporalField
            public final long V(TemporalAccessor temporalAccessor) {
                if (!z(temporalAccessor)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.h(a.DAY_OF_YEAR) - h.a[((temporalAccessor.h(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.p.d.c0(temporalAccessor.k(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            public final m b0(m mVar, long j) {
                long jV = V(mVar);
                O().b(this, j);
                a aVar = a.DAY_OF_YEAR;
                return mVar.a(aVar, (j - jV) + mVar.k(aVar));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean z(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(a.DAY_OF_YEAR) || !temporalAccessor.i(a.MONTH_OF_YEAR) || !temporalAccessor.i(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.a;
                return Chronology.p(temporalAccessor).equals(j$.time.chrono.p.d);
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final t E(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return O();
                }
                throw new s("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final t O() {
                return t.f(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            public final long V(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return (temporalAccessor.k(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new s("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final m b0(m mVar, long j) {
                long jV = V(mVar);
                O().b(this, j);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.a(aVar, ((j - jV) * 3) + mVar.k(aVar));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean z(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.a;
                return Chronology.p(temporalAccessor).equals(j$.time.chrono.p.d);
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.TemporalField
            public final t E(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return h.h0(LocalDate.L(temporalAccessor));
                }
                throw new s("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor L(Map map, b0 b0Var, c0 c0Var) {
                LocalDate localDateA;
                long j;
                TemporalField temporalField = h.WEEK_BASED_YEAR;
                Long l = (Long) map.get(temporalField);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l != null && l2 != null) {
                    int iA = temporalField.O().a(temporalField, l.longValue());
                    long jLongValue = ((Long) map.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    h hVar4 = j.a;
                    if (Chronology.p(b0Var).equals(j$.time.chrono.p.d)) {
                        LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                        if (c0Var == c0.LENIENT) {
                            long jLongValue2 = l2.longValue();
                            if (jLongValue2 > 7) {
                                long j2 = jLongValue2 - 1;
                                localDateOf = localDateOf.plusWeeks(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (jLongValue2 < 1) {
                                    localDateOf = localDateOf.plusWeeks(Math.subtractExact(jLongValue2, 7L) / 7);
                                    j = (jLongValue2 + 6) % 7;
                                }
                                localDateA = localDateOf.plusWeeks(Math.subtractExact(jLongValue, 1L)).a(aVar, jLongValue2);
                            }
                            jLongValue2 = j + 1;
                            localDateA = localDateOf.plusWeeks(Math.subtractExact(jLongValue, 1L)).a(aVar, jLongValue2);
                        } else {
                            int iA2 = aVar.b.a(aVar, l2.longValue());
                            if (jLongValue < 1 || jLongValue > 52) {
                                if (c0Var == c0.STRICT) {
                                    h.h0(localDateOf).b(this, jLongValue);
                                } else {
                                    O().b(this, jLongValue);
                                }
                            }
                            localDateA = localDateOf.plusWeeks(jLongValue - 1).a(aVar, iA2);
                        }
                        map.remove(this);
                        map.remove(temporalField);
                        map.remove(aVar);
                        return localDateA;
                    }
                    j$.nio.file.k.h("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.TemporalField
            public final t O() {
                return t.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.TemporalField
            public final long V(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return h.e0(LocalDate.L(temporalAccessor));
                }
                throw new s("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final m b0(m mVar, long j) {
                O().b(this, j);
                return mVar.b(Math.subtractExact(j, V(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean z(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.a;
                return Chronology.p(temporalAccessor).equals(j$.time.chrono.p.d);
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.TemporalField
            public final t E(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return a.YEAR.b;
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final t O() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.TemporalField
            public final long V(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return h.f0(LocalDate.L(temporalAccessor));
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final m b0(m mVar, long j) {
                if (!z(mVar)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.b.a(h.WEEK_BASED_YEAR, j);
                LocalDate localDateL = LocalDate.L(mVar);
                a aVar = a.DAY_OF_WEEK;
                int iH = localDateL.h(aVar);
                int iE0 = h.e0(localDateL);
                if (iE0 == 53 && h.g0(iA) == 52) {
                    iE0 = 52;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                return mVar.j(localDateOf.plusDays(((iE0 - 1) * 7) + (iH - localDateOf.h(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean z(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.a;
                return Chronology.p(temporalAccessor).equals(j$.time.chrono.p.d);
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int e0(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iV = localDate.V() - 1;
        int i = (3 - iOrdinal) + iV;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iV < i3) {
            if (localDate.V() != 180) {
                localDate = LocalDate.h0(localDate.a, 180);
            }
            return (int) h0(localDate.minusYears(1L)).d;
        }
        int i4 = ((iV - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.B())) {
            return i4;
        }
        return 1;
    }

    public static int f0(LocalDate localDate) {
        int year = localDate.getYear();
        int iV = localDate.V();
        if (iV <= 3) {
            return iV - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iV >= 363) {
            return ((iV - 363) - (localDate.B() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int g0(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.B()) ? 53 : 52;
        }
        return 53;
    }

    public static t h0(LocalDate localDate) {
        return t.f(1L, g0(f0(localDate)));
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }
}
