package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends a implements Serializable {
    public static final x d = new x();
    private static final long serialVersionUID = 1039765215346859963L;

    private x() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.t C(j$.time.temporal.a aVar) {
        int i = w.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.t tVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.t.f(tVar.a - 22932, tVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.t tVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.t.g(1L, tVar2.d - 1911, (-tVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.t tVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.t.f(tVar3.a - 1911, tVar3.d - 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final List D() {
        return j$.desugar.sun.nio.fs.g.o(a0.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j F(int i) {
        if (i == 0) {
            return a0.BEFORE_ROC;
        }
        if (i == 1) {
            return a0.ROC;
        }
        j$.nio.file.k.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final int I(j jVar, int i) {
        if (jVar instanceof a0) {
            return jVar == a0.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof z ? (z) temporalAccessor : new z(LocalDate.L(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate R() {
        return new z(LocalDate.L(LocalDate.f0(j$.desugar.sun.nio.fs.g.y())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate W(int i, int i2, int i3) {
        return new z(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate Y(Map map, j$.time.format.c0 c0Var) {
        return (z) super.Y(map, c0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime Z(Instant instant, ZoneId zoneId) {
        return i.L(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final boolean c0(long j) {
        return p.d.c0(j + 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate n(long j) {
        return new z(LocalDate.g0(j));
    }

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "roc";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate w(int i, int i2) {
        return new z(LocalDate.h0(i + 1911, i2));
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
