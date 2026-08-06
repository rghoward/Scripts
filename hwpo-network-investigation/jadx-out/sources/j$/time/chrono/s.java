package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends a implements Serializable {
    public static final s d = new s();
    private static final long serialVersionUID = 459996390165777884L;

    private s() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.t C(j$.time.temporal.a aVar) {
        switch (r.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.nio.file.k.d("Unsupported field: ", aVar);
                return null;
            case 5:
                v[] vVarArr = v.e;
                int year = vVarArr[vVarArr.length - 1].b.getYear();
                int year2 = 1000000000 - vVarArr[vVarArr.length - 1].b.getYear();
                int year3 = vVarArr[0].b.getYear();
                int i = 1;
                while (true) {
                    v[] vVarArr2 = v.e;
                    if (i >= vVarArr2.length) {
                        return j$.time.temporal.t.g(1L, year2, 999999999 - year);
                    }
                    v vVar = vVarArr2[i];
                    year2 = Math.min(year2, (vVar.b.getYear() - year3) + 1);
                    year3 = vVar.b.getYear();
                    i++;
                }
                break;
            case 6:
                v vVar2 = v.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.b.c;
                long jMin = j;
                for (v vVar3 : v.e) {
                    long jMin2 = Math.min(jMin, (vVar3.b.a0() - vVar3.b.V()) + 1);
                    jMin = vVar3.o() != null ? Math.min(jMin2, vVar3.o().b.V() - 1) : jMin2;
                }
                return j$.time.temporal.t.g(1L, jMin, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.t.f(u.d.getYear(), 999999999L);
            case 8:
                long j2 = v.d.a;
                v[] vVarArr3 = v.e;
                return j$.time.temporal.t.f(j2, vVarArr3[vVarArr3.length - 1].a);
            default:
                return aVar.b;
        }
    }

    @Override // j$.time.chrono.Chronology
    public final List D() {
        v[] vVarArr = v.e;
        return j$.desugar.sun.nio.fs.g.o((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
    }

    @Override // j$.time.chrono.Chronology
    public final j F(int i) {
        return v.p(i);
    }

    @Override // j$.time.chrono.Chronology
    public final int I(j jVar, int i) {
        if (!(jVar instanceof v)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        v vVar = (v) jVar;
        int year = (vVar.b.getYear() + i) - 1;
        if (i == 1 || (year >= -999999999 && year <= 999999999 && year >= vVar.b.getYear() && jVar == v.n(LocalDate.of(year, 1, 1)))) {
            return year;
        }
        j$.nio.file.k.h("Invalid yearOfEra value");
        return 0;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof u ? (u) temporalAccessor : new u(LocalDate.L(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate R() {
        return new u(LocalDate.L(LocalDate.f0(j$.desugar.sun.nio.fs.g.y())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate W(int i, int i2, int i3) {
        return new u(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate Y(Map map, j$.time.format.c0 c0Var) {
        return (u) super.Y(map, c0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime Z(Instant instant, ZoneId zoneId) {
        return i.L(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final boolean c0(long j) {
        return p.d.c0(j);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate e0(Map map, j$.time.format.c0 c0Var) {
        u uVarB0;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l = (Long) map.get(aVar);
        v vVarP = l != null ? v.p(C(aVar).a(aVar, l.longValue())) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(aVar2);
        int iA = l2 != null ? C(aVar2).a(aVar2, l2.longValue()) : 0;
        if (vVarP == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && c0Var != j$.time.format.c0.STRICT) {
            v[] vVarArr = v.e;
            vVarP = ((v[]) Arrays.copyOf(vVarArr, vVarArr.length))[((v[]) Arrays.copyOf(vVarArr, vVarArr.length)).length - 1];
        }
        if (l2 != null && vVarP != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (c0Var == j$.time.format.c0.LENIENT) {
                        return new u(LocalDate.of((vVarP.b.getYear() + iA) - 1, 1, 1)).V(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).V(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int iA2 = C(aVar3).a(aVar3, ((Long) map.remove(aVar3)).longValue());
                    int iA3 = C(aVar4).a(aVar4, ((Long) map.remove(aVar4)).longValue());
                    if (c0Var != j$.time.format.c0.SMART) {
                        LocalDate localDate = u.d;
                        LocalDate localDateOf = LocalDate.of((vVarP.b.getYear() + iA) - 1, iA2, iA3);
                        if (!localDateOf.b0(vVarP.b) && vVarP == v.n(localDateOf)) {
                            return new u(vVarP, iA, localDateOf);
                        }
                        j$.nio.file.k.h("year, month, and day not valid for Era");
                        return null;
                    }
                    if (iA < 1) {
                        j$.nio.file.k.b("Invalid YearOfEra: ", iA);
                        return null;
                    }
                    int year = (vVarP.b.getYear() + iA) - 1;
                    try {
                        uVarB0 = new u(LocalDate.of(year, iA2, iA3));
                    } catch (j$.time.b unused) {
                        uVarB0 = new u(LocalDate.of(year, iA2, 1)).b0(new j$.time.e(3));
                    }
                    if (uVarB0.b == vVarP || uVarB0.h(j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return uVarB0;
                    }
                    throw new j$.time.b("Invalid YearOfEra for Era: " + vVarP + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (c0Var == j$.time.format.c0.LENIENT) {
                    return new u(LocalDate.h0((vVarP.b.getYear() + iA) - 1, 1)).V(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int iA4 = C(aVar5).a(aVar5, ((Long) map.remove(aVar5)).longValue());
                LocalDate localDate2 = u.d;
                LocalDate localDate3 = vVarP.b;
                LocalDate localDateH0 = iA == 1 ? LocalDate.h0(localDate3.getYear(), (vVarP.b.V() + iA4) - 1) : LocalDate.h0((localDate3.getYear() + iA) - 1, iA4);
                if (!localDateH0.b0(vVarP.b) && vVarP == v.n(localDateH0)) {
                    return new u(vVarP, iA, localDateH0);
                }
                j$.nio.file.k.h("Invalid parameters");
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate n(long j) {
        return new u(LocalDate.g0(j));
    }

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate w(int i, int i2) {
        return new u(LocalDate.h0(i, i2));
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
