package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends a implements Serializable {
    public static final d0 d = new d0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private d0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.t C(j$.time.temporal.a aVar) {
        int i = c0.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.t tVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.t.f(tVar.a + 6516, tVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.t tVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.t.g(1L, (-(tVar2.a + 543)) + 1, tVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.t tVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.t.f(tVar3.a + 543, tVar3.d + 543);
    }

    @Override // j$.time.chrono.Chronology
    public final List D() {
        return j$.desugar.sun.nio.fs.g.o(g0.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j F(int i) {
        if (i == 0) {
            return g0.BEFORE_BE;
        }
        if (i == 1) {
            return g0.BE;
        }
        j$.nio.file.k.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final int I(j jVar, int i) {
        if (jVar instanceof g0) {
            return jVar == g0.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof f0 ? (f0) temporalAccessor : new f0(LocalDate.L(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate R() {
        return new f0(LocalDate.L(LocalDate.f0(j$.desugar.sun.nio.fs.g.y())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate W(int i, int i2, int i3) {
        return new f0(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate Y(Map map, j$.time.format.c0 c0Var) {
        return (f0) super.Y(map, c0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime Z(Instant instant, ZoneId zoneId) {
        return i.L(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final boolean c0(long j) {
        return p.d.c0(j - 543);
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate n(long j) {
        return new f0(LocalDate.g0(j));
    }

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "buddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate w(int i, int i2) {
        return new f0(LocalDate.h0(i - 543, i2));
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
