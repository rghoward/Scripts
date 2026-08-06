package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.Year;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends a implements Serializable {
    public static final p d = new p();
    private static final long serialVersionUID = -1440403870442975015L;

    private p() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.t C(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    @Override // j$.time.chrono.Chronology
    public final List D() {
        return j$.desugar.sun.nio.fs.g.o(q.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j F(int i) {
        if (i == 0) {
            return q.BCE;
        }
        if (i == 1) {
            return q.CE;
        }
        j$.nio.file.k.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final int I(j jVar, int i) {
        if (jVar instanceof q) {
            return jVar == q.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M(TemporalAccessor temporalAccessor) {
        return LocalDate.L(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDateTime N(LocalDateTime localDateTime) {
        return LocalDateTime.E(localDateTime);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate R() {
        return LocalDate.L(LocalDate.f0(j$.desugar.sun.nio.fs.g.y()));
    }

    @Override // j$.time.chrono.a
    public final void V(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                aVar.e0(l.longValue());
            }
            a.z(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), 12L)) + 1);
            a.z(map, j$.time.temporal.a.YEAR, Math.floorDiv(l.longValue(), 12L));
        }
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate W(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate Y(Map map, j$.time.format.c0 c0Var) {
        return (LocalDate) super.Y(map, c0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime Z(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate b0(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = aVar.b.a(aVar, ((Long) map.remove(aVar)).longValue());
        boolean z = true;
        if (c0Var == j$.time.format.c0.LENIENT) {
            return LocalDate.of(iA, 1, 1).plusMonths(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = aVar2.b.a(aVar2, ((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = aVar3.b.a(aVar3, ((Long) map.remove(aVar3)).longValue());
        if (c0Var == j$.time.format.c0.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j = iA;
                int i = Year.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, month.E(z));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.Chronology
    public final boolean c0(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate e0(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                aVar.e0(l.longValue());
            }
            Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l2 == null) {
                j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
                Long l3 = (Long) map.get(aVar2);
                if (c0Var != j$.time.format.c0.STRICT) {
                    a.z(map, aVar2, (l3 == null || l3.longValue() > 0) ? l.longValue() : Math.subtractExact(1L, l.longValue()));
                } else if (l3 != null) {
                    long jLongValue = l3.longValue();
                    long jLongValue2 = l.longValue();
                    if (jLongValue <= 0) {
                        jLongValue2 = Math.subtractExact(1L, jLongValue2);
                    }
                    a.z(map, aVar2, jLongValue2);
                } else {
                    map.put(aVar, l);
                }
            } else if (l2.longValue() == 1) {
                a.z(map, j$.time.temporal.a.YEAR, l.longValue());
            } else {
                if (l2.longValue() != 0) {
                    j$.nio.file.k.j("Invalid value for era: ", l2);
                    return null;
                }
                a.z(map, j$.time.temporal.a.YEAR, Math.subtractExact(1L, l.longValue()));
            }
        } else {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
            if (map.containsKey(aVar3)) {
                aVar3.e0(((Long) map.get(aVar3)).longValue());
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate n(long j) {
        return LocalDate.g0(j);
    }

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate w(int i, int i2) {
        return LocalDate.h0(i, i2);
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
