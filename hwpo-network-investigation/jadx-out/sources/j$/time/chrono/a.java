package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.temporal.TemporalField;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Chronology {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final Locale c = new Locale("ja", "JP", "JP");

    public static boolean E() {
        if (a.get("ISO") != null) {
            return false;
        }
        l lVar = l.m;
        lVar.getClass();
        L(lVar, "Hijrah-umalqura");
        s sVar = s.d;
        sVar.getClass();
        L(sVar, "Japanese");
        x xVar = x.d;
        xVar.getClass();
        L(xVar, "Minguo");
        d0 d0Var = d0.d;
        d0Var.getClass();
        L(d0Var, "ThaiBuddhist");
        try {
            for (a aVar : Arrays.asList(new a[0])) {
                if (!aVar.getId().equals("ISO")) {
                    L(aVar, aVar.getId());
                }
            }
            p pVar = p.d;
            pVar.getClass();
            L(pVar, "ISO");
            return true;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Chronology L(Chronology chronology, String str) {
        String strU;
        Chronology chronology2 = (Chronology) a.putIfAbsent(str, chronology);
        if (chronology2 == null && (strU = chronology.u()) != null) {
            b.putIfAbsent(strU, chronology);
        }
        return chronology2;
    }

    public static ChronoLocalDate O(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate chronoLocalDateB = chronoLocalDate.b(j, (j$.time.temporal.r) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        ChronoLocalDate chronoLocalDateB2 = chronoLocalDateB.b(j2, (j$.time.temporal.r) bVar);
        if (j3 <= 7) {
            if (j3 < 1) {
                chronoLocalDateB2 = chronoLocalDateB2.b(Math.subtractExact(j3, 7L) / 7, (j$.time.temporal.r) bVar);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDateB2.j(new j$.time.temporal.o(DayOfWeek.z((int) j3).getValue(), 0));
        }
        long j5 = j3 - 1;
        chronoLocalDateB2 = chronoLocalDateB2.b(j5 / 7, (j$.time.temporal.r) bVar);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return chronoLocalDateB2.j(new j$.time.temporal.o(DayOfWeek.z((int) j3).getValue(), 0));
    }

    public static Chronology ofLocale(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = locale.equals(c) ? "japanese" : null;
        }
        if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
            return p.d;
        }
        do {
            Chronology chronology = (Chronology) b.get(unicodeLocaleType);
            if (chronology != null) {
                return chronology;
            }
        } while (E());
        for (Chronology chronology2 : ServiceLoader.load(Chronology.class)) {
            if (unicodeLocaleType.equals(chronology2.u())) {
                return chronology2;
            }
        }
        j$.nio.file.k.h("Unknown calendar system: ".concat(unicodeLocaleType));
        return null;
    }

    public static void z(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new j$.time.b("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
    }

    @Override // j$.time.chrono.Chronology, java.lang.Comparable
    /* JADX INFO: renamed from: H */
    public final int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    public void V(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                aVar.e0(l.longValue());
            }
            ChronoLocalDate chronoLocalDateA = R().a((TemporalField) j$.time.temporal.a.DAY_OF_MONTH, 1L).a((TemporalField) aVar, l.longValue());
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            z(map, aVar2, chronoLocalDateA.h(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            z(map, aVar3, chronoLocalDateA.h(aVar3));
        }
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDate Y(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return n(((Long) map.remove(aVar)).longValue());
        }
        V(map, c0Var);
        ChronoLocalDate chronoLocalDateE0 = e0(map, c0Var);
        if (chronoLocalDateE0 != null) {
            return chronoLocalDateE0;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar2)) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            int i = 0;
            if (map.containsKey(aVar3)) {
                if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                    return b0(map, c0Var);
                }
                j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(aVar5)) {
                        int iA = C(aVar2).a(aVar2, ((Long) map.remove(aVar2)).longValue());
                        if (c0Var == j$.time.format.c0.LENIENT) {
                            long jSubtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                            return W(iA, 1, 1).b(jSubtractExact, (j$.time.temporal.r) j$.time.temporal.b.MONTHS).b(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.r) j$.time.temporal.b.WEEKS).b(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.r) j$.time.temporal.b.DAYS);
                        }
                        int iA2 = C(aVar3).a(aVar3, ((Long) map.remove(aVar3)).longValue());
                        ChronoLocalDate chronoLocalDateB = W(iA, iA2, 1).b((C(aVar5).a(aVar5, ((Long) map.remove(aVar5)).longValue()) - 1) + ((C(aVar4).a(aVar4, ((Long) map.remove(aVar4)).longValue()) - 1) * 7), (j$.time.temporal.r) j$.time.temporal.b.DAYS);
                        if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateB.h(aVar3) == iA2) {
                            return chronoLocalDateB;
                        }
                        j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int iA3 = C(aVar2).a(aVar2, ((Long) map.remove(aVar2)).longValue());
                        if (c0Var == j$.time.format.c0.LENIENT) {
                            return O(W(iA3, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int iA4 = C(aVar3).a(aVar3, ((Long) map.remove(aVar3)).longValue());
                        ChronoLocalDate chronoLocalDateJ = W(iA3, iA4, 1).b((C(aVar4).a(aVar4, ((Long) map.remove(aVar4)).longValue()) - 1) * 7, (j$.time.temporal.r) j$.time.temporal.b.DAYS).j(new j$.time.temporal.o(DayOfWeek.z(C(aVar6).a(aVar6, ((Long) map.remove(aVar6)).longValue())).getValue(), i));
                        if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateJ.h(aVar3) == iA4) {
                            return chronoLocalDateJ;
                        }
                        j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                }
            }
            j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar7)) {
                int iA5 = C(aVar2).a(aVar2, ((Long) map.remove(aVar2)).longValue());
                if (c0Var != j$.time.format.c0.LENIENT) {
                    return w(iA5, C(aVar7).a(aVar7, ((Long) map.remove(aVar7)).longValue()));
                }
                return w(iA5, 1).b(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.r) j$.time.temporal.b.DAYS);
            }
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(aVar8)) {
                j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(aVar9)) {
                    int iA6 = C(aVar2).a(aVar2, ((Long) map.remove(aVar2)).longValue());
                    if (c0Var == j$.time.format.c0.LENIENT) {
                        return w(iA6, 1).b(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.r) j$.time.temporal.b.WEEKS).b(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.r) j$.time.temporal.b.DAYS);
                    }
                    ChronoLocalDate chronoLocalDateB2 = w(iA6, 1).b((C(aVar9).a(aVar9, ((Long) map.remove(aVar9)).longValue()) - 1) + ((C(aVar8).a(aVar8, ((Long) map.remove(aVar8)).longValue()) - 1) * 7), (j$.time.temporal.r) j$.time.temporal.b.DAYS);
                    if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateB2.h(aVar2) == iA6) {
                        return chronoLocalDateB2;
                    }
                    j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar10)) {
                    int iA7 = C(aVar2).a(aVar2, ((Long) map.remove(aVar2)).longValue());
                    if (c0Var == j$.time.format.c0.LENIENT) {
                        return O(w(iA7, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
                    }
                    ChronoLocalDate chronoLocalDateJ2 = w(iA7, 1).b((C(aVar8).a(aVar8, ((Long) map.remove(aVar8)).longValue()) - 1) * 7, (j$.time.temporal.r) j$.time.temporal.b.DAYS).j(new j$.time.temporal.o(DayOfWeek.z(C(aVar10).a(aVar10, ((Long) map.remove(aVar10)).longValue())).getValue(), i));
                    if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateJ2.h(aVar2) == iA7) {
                        return chronoLocalDateJ2;
                    }
                    j$.nio.file.k.h("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
            }
        }
        return null;
    }

    public ChronoLocalDate b0(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = C(aVar).a(aVar, ((Long) map.remove(aVar)).longValue());
        if (c0Var == j$.time.format.c0.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return W(iA, 1, 1).b(jSubtractExact, (j$.time.temporal.r) j$.time.temporal.b.MONTHS).b(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.r) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = C(aVar2).a(aVar2, ((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = C(aVar3).a(aVar3, ((Long) map.remove(aVar3)).longValue());
        if (c0Var != j$.time.format.c0.SMART) {
            return W(iA, iA2, iA3);
        }
        try {
            return W(iA, iA2, iA3);
        } catch (j$.time.b unused) {
            return W(iA, iA2, 1).j(new j$.time.e(3));
        }
    }

    public ChronoLocalDate e0(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            C(aVar2).b(aVar2, ((Long) map.get(aVar2)).longValue());
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        Long l2 = (Long) map.remove(aVar3);
        int iA = c0Var != j$.time.format.c0.LENIENT ? C(aVar).a(aVar, l.longValue()) : Math.toIntExact(l.longValue());
        if (l2 != null) {
            z(map, j$.time.temporal.a.YEAR, I(F(C(aVar3).a(aVar3, l2.longValue())), iA));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar4)) {
            z(map, aVar4, I(w(C(aVar4).a(aVar4, ((Long) map.get(aVar4)).longValue()), 1).S(), iA));
            return null;
        }
        if (c0Var == j$.time.format.c0.STRICT) {
            map.put(aVar, l);
            return null;
        }
        List listD = D();
        if (listD.isEmpty()) {
            z(map, aVar4, iA);
            return null;
        }
        z(map, aVar4, I((j) listD.get(listD.size() - 1), iA));
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && compareTo((a) obj) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getId().hashCode() ^ getClass().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return getId();
    }
}
