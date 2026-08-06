package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends c {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient v b;
    public final transient int c;

    public u(LocalDate localDate) {
        if (localDate.b0(d)) {
            j$.nio.file.k.h("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        v vVarN = v.n(localDate);
        this.b = vVarN;
        this.c = (localDate.getYear() - vVarN.b.getYear()) + 1;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 4, this);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate E(long j) {
        return e0(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate L(long j) {
        return e0(this.a.plusMonths(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate O(long j) {
        return e0(this.a.j0(j));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long P() {
        return this.a.P();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime Q(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j S() {
        return this.b;
    }

    public final u V(long j, j$.time.temporal.b bVar) {
        return (u) super.b(j, (j$.time.temporal.r) bVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate X(j$.time.temporal.p pVar) {
        return (u) super.X(pVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int a0() {
        v vVarO = this.b.o();
        int iA0 = (vVarO == null || vVarO.b.getYear() != this.a.getYear()) ? this.a.a0() : vVarO.b.V() - 1;
        return this.c == 1 ? iA0 - (this.b.b.V() - 1) : iA0;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate b(long j, j$.time.temporal.r rVar) {
        return (u) super.b(j, rVar);
    }

    public final u b0(j$.time.e eVar) {
        return (u) super.j(eVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate c(long j, j$.time.temporal.r rVar) {
        return (u) super.c(j, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.m j(LocalDate localDate) {
        return (u) super.j(localDate);
    }

    public final u e0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new u(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.a.equals(((u) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final u a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (u) super.a(temporalField, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        if (k(aVar) == j) {
            return this;
        }
        int[] iArr = t.a;
        int i = iArr[aVar.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            s sVar = s.d;
            int iA = sVar.C(aVar).a(aVar, j);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return e0(this.a.m0(sVar.I(this.b, iA)));
            }
            if (i2 == 8) {
                return e0(this.a.m0(sVar.I(v.p(iA), this.c)));
            }
            if (i2 == 9) {
                return e0(this.a.m0(iA));
            }
        }
        return e0(this.a.a(temporalField, j));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return s.d;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        s.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || temporalField == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (temporalField instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.z(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.temporal.n nVar) {
        return (u) super.j(nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        switch (t.a[((j$.time.temporal.a) temporalField).ordinal()]) {
            case 2:
                int i = this.c;
                LocalDate localDate = this.a;
                return i == 1 ? (localDate.V() - this.b.b.V()) + 1 : localDate.V();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", temporalField));
            case 8:
                return this.b.a;
            default:
                return this.a.k(temporalField);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t l(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.E(this);
        }
        if (!i(temporalField)) {
            throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", temporalField));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        int i = t.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.t.f(1L, this.a.lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.t.f(1L, a0());
        }
        if (i != 3) {
            return s.d.C(aVar);
        }
        int year = this.b.b.getYear();
        v vVarO = this.b.o();
        return vVarO != null ? j$.time.temporal.t.f(1L, (vVarO.b.getYear() - year) + 1) : j$.time.temporal.t.f(1L, 999999999 - year);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m b(long j, j$.time.temporal.r rVar) {
        return (u) super.b(j, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.r rVar) {
        return (u) super.c(j, rVar);
    }

    public u(v vVar, int i, LocalDate localDate) {
        if (!localDate.b0(d)) {
            this.b = vVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        j$.nio.file.k.h("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }
}
