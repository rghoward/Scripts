package j$.time.temporal;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements TemporalField {
    public static final t f = t.f(1, 7);
    public static final t g = t.g(0, 4, 6);
    public static final t h = t.g(0, 52, 54);
    public static final t i = t.g(1, 52, 53);
    public final String a;
    public final WeekFields b;
    public final r c;
    public final r d;
    public final t e;

    public u(String str, WeekFields weekFields, r rVar, r rVar2, t tVar) {
        this.a = str;
        this.b = weekFields;
        this.c = rVar;
        this.d = rVar2;
        this.e = tVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    public final t E(TemporalAccessor temporalAccessor) {
        b bVar = b.WEEKS;
        r rVar = this.d;
        if (rVar == bVar) {
            return this.e;
        }
        if (rVar == b.MONTHS) {
            return f(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (rVar == b.YEARS) {
            return f(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (rVar == WeekFields.h) {
            return g(temporalAccessor);
        }
        if (rVar == b.FOREVER) {
            return a.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + rVar + ", this: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor L(Map map, b0 b0Var, c0 c0Var) {
        ChronoLocalDate chronoLocalDateB;
        ChronoLocalDate chronoLocalDateB2;
        ChronoLocalDate chronoLocalDateB3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        b bVar = b.WEEKS;
        t tVar = this.e;
        WeekFields weekFields = this.b;
        r rVar = this.d;
        if (rVar == bVar) {
            long jFloorMod = Math.floorMod((tVar.a(this, jLongValue) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1), 7) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int iFloorMod = Math.floorMod(aVar.b.a(aVar, ((Long) map.get(aVar)).longValue()) - weekFields.getFirstDayOfWeek().getValue(), 7) + 1;
        Chronology chronologyP = Chronology.p(b0Var);
        a aVar2 = a.YEAR;
        if (!map.containsKey(aVar2)) {
            if ((rVar != WeekFields.h && rVar != b.FOREVER) || !map.containsKey(weekFields.f) || !map.containsKey(weekFields.e)) {
                return null;
            }
            u uVar = weekFields.f;
            int iA = uVar.e.a(weekFields.f, ((Long) map.get(uVar)).longValue());
            if (c0Var == c0.LENIENT) {
                chronoLocalDateB = e(chronologyP, iA, 1, iFloorMod).b(Math.subtractExact(((Long) map.get(weekFields.e)).longValue(), 1L), (r) bVar);
            } else {
                u uVar2 = weekFields.e;
                ChronoLocalDate chronoLocalDateE = e(chronologyP, iA, uVar2.e.a(weekFields.e, ((Long) map.get(uVar2)).longValue()), iFloorMod);
                if (c0Var == c0.STRICT && c(chronoLocalDateE) != iA) {
                    j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different week-based-year");
                    return null;
                }
                chronoLocalDateB = chronoLocalDateE;
            }
            map.remove(this);
            map.remove(weekFields.f);
            map.remove(weekFields.e);
            map.remove(aVar);
            return chronoLocalDateB;
        }
        int iA2 = aVar2.b.a(aVar2, ((Long) map.get(aVar2)).longValue());
        b bVar2 = b.MONTHS;
        if (rVar == bVar2) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long jLongValue2 = ((Long) map.get(aVar3)).longValue();
                long j = intExact;
                if (c0Var == c0.LENIENT) {
                    ChronoLocalDate chronoLocalDateB4 = chronologyP.W(iA2, 1, 1).b(Math.subtractExact(jLongValue2, 1L), (r) bVar2);
                    int iB = b(chronoLocalDateB4);
                    int iH = chronoLocalDateB4.h(a.DAY_OF_MONTH);
                    chronoLocalDateB3 = chronoLocalDateB4.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j, a(h(iH, iB), iH)), 7L), iFloorMod - b(chronoLocalDateB4)), (r) b.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateW = chronologyP.W(iA2, aVar3.b.a(aVar3, jLongValue2), 1);
                    long jA = tVar.a(this, j);
                    int iB2 = b(chronoLocalDateW);
                    int iH2 = chronoLocalDateW.h(a.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateB5 = chronoLocalDateW.b((((int) (jA - ((long) a(h(iH2, iB2), iH2)))) * 7) + (iFloorMod - b(chronoLocalDateW)), (r) b.DAYS);
                    if (c0Var == c0.STRICT && chronoLocalDateB5.k(aVar3) != jLongValue2) {
                        j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    chronoLocalDateB3 = chronoLocalDateB5;
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar3);
                map.remove(aVar);
                return chronoLocalDateB3;
            }
        }
        if (rVar != b.YEARS) {
            return null;
        }
        long j2 = intExact;
        ChronoLocalDate chronoLocalDateW2 = chronologyP.W(iA2, 1, 1);
        if (c0Var == c0.LENIENT) {
            int iB3 = b(chronoLocalDateW2);
            int iH3 = chronoLocalDateW2.h(a.DAY_OF_YEAR);
            chronoLocalDateB2 = chronoLocalDateW2.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, a(h(iH3, iB3), iH3)), 7L), iFloorMod - b(chronoLocalDateW2)), (r) b.DAYS);
        } else {
            long jA2 = tVar.a(this, j2);
            int iB4 = b(chronoLocalDateW2);
            int iH4 = chronoLocalDateW2.h(a.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateB6 = chronoLocalDateW2.b((((int) (jA2 - ((long) a(h(iH4, iB4), iH4)))) * 7) + (iFloorMod - b(chronoLocalDateW2)), (r) b.DAYS);
            if (c0Var == c0.STRICT && chronoLocalDateB6.k(aVar2) != iA2) {
                j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different year");
                return null;
            }
            chronoLocalDateB2 = chronoLocalDateB6;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return chronoLocalDateB2;
    }

    @Override // j$.time.temporal.TemporalField
    public final t O() {
        return this.e;
    }

    @Override // j$.time.temporal.TemporalField
    public final long V(TemporalAccessor temporalAccessor) {
        int iC;
        b bVar = b.WEEKS;
        r rVar = this.d;
        if (rVar == bVar) {
            iC = b(temporalAccessor);
        } else if (rVar == b.MONTHS) {
            int iB = b(temporalAccessor);
            int iH = temporalAccessor.h(a.DAY_OF_MONTH);
            iC = a(h(iH, iB), iH);
        } else if (rVar == b.YEARS) {
            int iB2 = b(temporalAccessor);
            int iH2 = temporalAccessor.h(a.DAY_OF_YEAR);
            iC = a(h(iH2, iB2), iH2);
        } else if (rVar == WeekFields.h) {
            iC = d(temporalAccessor);
        } else {
            if (rVar != b.FOREVER) {
                throw new IllegalStateException("unreachable, rangeUnit: " + rVar + ", this: " + this);
            }
            iC = c(temporalAccessor);
        }
        return iC;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.h(a.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue(), 7) + 1;
    }

    @Override // j$.time.temporal.TemporalField
    public final m b0(m mVar, long j) {
        int iA = this.e.a(this, j);
        int iH = mVar.h(this);
        if (iA == iH) {
            return mVar;
        }
        if (this.d != b.FOREVER) {
            return mVar.b(iA - iH, this.c);
        }
        WeekFields weekFields = this.b;
        return e(Chronology.p(mVar), (int) j, mVar.h(weekFields.e), mVar.h(weekFields.c));
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iH = temporalAccessor.h(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int iH2 = temporalAccessor.h(aVar);
        int iH3 = h(iH2, iB);
        int iA = a(iH3, iH2);
        if (iA == 0) {
            return iH - 1;
        }
        return iA >= a(iH3, ((int) temporalAccessor.l(aVar).d) + this.b.b) ? iH + 1 : iH;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iH = temporalAccessor.h(aVar);
        int iH2 = h(iH, iB);
        int iA2 = a(iH2, iH);
        if (iA2 == 0) {
            return d(Chronology.p(temporalAccessor).M(temporalAccessor).c(iH, (r) b.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH2, ((int) temporalAccessor.l(aVar).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final ChronoLocalDate e(Chronology chronology, int i2, int i3, int i4) {
        ChronoLocalDate chronoLocalDateW = chronology.W(i2, 1, 1);
        int iH = h(1, b(chronoLocalDateW));
        return chronoLocalDateW.b(((Math.min(i3, a(iH, chronoLocalDateW.a0() + this.b.b) - 1) - 1) * 7) + (i4 - 1) + (-iH), (r) b.DAYS);
    }

    public final t f(TemporalAccessor temporalAccessor, a aVar) {
        int iH = h(temporalAccessor.h(aVar), b(temporalAccessor));
        t tVarL = temporalAccessor.l(aVar);
        return t.f(a(iH, (int) tVarL.a), a(iH, (int) tVarL.d));
    }

    public final t g(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.i(aVar)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int iH = temporalAccessor.h(aVar);
        int iH2 = h(iH, iB);
        int iA = a(iH2, iH);
        if (iA == 0) {
            return g(Chronology.p(temporalAccessor).M(temporalAccessor).c(iH + 7, (r) b.DAYS));
        }
        int i2 = (int) temporalAccessor.l(aVar).d;
        int iA2 = a(iH2, this.b.b + i2);
        return iA >= iA2 ? g(Chronology.p(temporalAccessor).M(temporalAccessor).b((i2 - iH) + 8, (r) b.DAYS)) : t.f(1L, iA2 - 1);
    }

    public final int h(int i2, int i3) {
        int iFloorMod = Math.floorMod(i2 - i3, 7);
        return iFloorMod + 1 > this.b.b ? 7 - iFloorMod : -iFloorMod;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean z(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.i(a.DAY_OF_WEEK)) {
            return false;
        }
        b bVar = b.WEEKS;
        r rVar = this.d;
        if (rVar == bVar) {
            return true;
        }
        if (rVar == b.MONTHS) {
            return temporalAccessor.i(a.DAY_OF_MONTH);
        }
        if (rVar == b.YEARS) {
            return temporalAccessor.i(a.DAY_OF_YEAR);
        }
        if (rVar == WeekFields.h) {
            return temporalAccessor.i(a.DAY_OF_YEAR);
        }
        if (rVar == b.FOREVER) {
            return temporalAccessor.i(a.YEAR);
        }
        return false;
    }
}
