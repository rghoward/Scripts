package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends c {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    public f0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 8, this);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate E(long j) {
        return b0(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate L(long j) {
        return b0(this.a.plusMonths(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate O(long j) {
        return b0(this.a.j0(j));
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
        return V() >= 1 ? g0.BE : g0.BEFORE_BE;
    }

    public final int V() {
        return this.a.getYear() + 543;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate X(j$.time.temporal.p pVar) {
        return (f0) super.X(pVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate b(long j, j$.time.temporal.r rVar) {
        return (f0) super.b(j, rVar);
    }

    public final f0 b0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new f0(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate c(long j, j$.time.temporal.r rVar) {
        return (f0) super.c(j, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.m j(LocalDate localDate) {
        return (f0) super.j(localDate);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final f0 a(TemporalField temporalField, long j) {
        int iA;
        int i;
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (f0) super.a(temporalField, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        if (k(aVar) == j) {
            return this;
        }
        int[] iArr = e0.a;
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 4) {
            iA = d0.d.C(aVar).a(aVar, j);
            i = iArr[aVar.ordinal()];
            if (i != 4) {
                LocalDate localDate = this.a;
                if (V() < 1) {
                    iA = 1 - iA;
                }
                return b0(localDate.m0(iA - 543));
            }
            if (i != 6) {
                return b0(this.a.m0(iA - 543));
            }
            if (i == 7) {
                return b0(this.a.m0((-542) - V()));
            }
        } else {
            if (i2 == 5) {
                d0.d.C(aVar).b(aVar, j);
                return b0(this.a.plusMonths(j - (((((long) V()) * 12) + ((long) this.a.getMonthValue())) - 1)));
            }
            if (i2 == 6 || i2 == 7) {
                iA = d0.d.C(aVar).a(aVar, j);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    LocalDate localDate2 = this.a;
                    if (V() < 1) {
                        iA = 1 - iA;
                    }
                    return b0(localDate2.m0(iA - 543));
                }
                if (i != 6) {
                    return b0(this.a.m0(iA - 543));
                }
                if (i == 7) {
                    return b0(this.a.m0((-542) - V()));
                }
            }
        }
        return b0(this.a.a(temporalField, j));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return this.a.equals(((f0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return d0.d;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        d0.d.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.temporal.n nVar) {
        return (f0) super.j(nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        int i = e0.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i == 4) {
            int iV = V();
            if (iV < 1) {
                iV = 1 - iV;
            }
            return iV;
        }
        if (i == 5) {
            return ((((long) V()) * 12) + ((long) this.a.getMonthValue())) - 1;
        }
        if (i == 6) {
            return V();
        }
        if (i != 7) {
            return this.a.k(temporalField);
        }
        return V() < 1 ? 0 : 1;
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
        int i = e0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(temporalField);
        }
        if (i != 4) {
            return d0.d.C(aVar);
        }
        j$.time.temporal.t tVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.t.f(1L, V() <= 0 ? (-(tVar.a + 543)) + 1 : tVar.d + 543);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m b(long j, j$.time.temporal.r rVar) {
        return (f0) super.b(j, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.r rVar) {
        return (f0) super.c(j, rVar);
    }
}
