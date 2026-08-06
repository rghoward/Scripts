package j$.time.chrono;

import defpackage.z97;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends c {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient l a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public n(l lVar, long j) {
        int i = (int) j;
        lVar.f0();
        if (i < lVar.f || i >= lVar.g) {
            j$.nio.file.k.h("Hijrah date out of range");
            throw null;
        }
        int iBinarySearch = Arrays.binarySearch(lVar.e, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {lVar.h0(iBinarySearch), ((lVar.h + iBinarySearch) % 12) + 1, (i - lVar.e[iBinarySearch]) + 1};
        this.a = lVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 6, this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean B() {
        return this.a.c0(this.b);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate O(long j) {
        return j == 0 ? this : f0(Math.addExact(this.b, (int) j), this.c, this.d);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long P() {
        return this.a.i0(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime Q(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j S() {
        return o.AH;
    }

    public final int V() {
        return this.a.l0(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate X(j$.time.temporal.p pVar) {
        return (n) super.X(pVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int a0() {
        return this.a.l0(this.b, 12);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate b(long j, j$.time.temporal.r rVar) {
        return (n) super.b(j, rVar);
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final n E(long j) {
        return new n(this.a, P() + j);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate c(long j, j$.time.temporal.r rVar) {
        return (n) super.c(j, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.m j(LocalDate localDate) {
        return (n) super.j(localDate);
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final n L(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        l lVar = this.a;
        long jFloorDiv = Math.floorDiv(j2, 12L);
        if (jFloorDiv >= lVar.h0(0) && jFloorDiv <= lVar.h0(lVar.e.length - 1) - 1) {
            return f0((int) jFloorDiv, ((int) Math.floorMod(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.b == nVar.b && this.c == nVar.c && this.d == nVar.d && this.a.equals(nVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final n f0(int i, int i2, int i3) {
        int iJ0 = this.a.j0(i, i2);
        if (i3 > iJ0) {
            i3 = iJ0;
        }
        return new n(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return this.a;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final n a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (n) super.a(temporalField, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        this.a.C(aVar).b(aVar, j);
        int i = (int) j;
        switch (m.a[aVar.ordinal()]) {
            case 1:
                return f0(this.b, this.c, i);
            case 2:
                return E(Math.min(i, a0()) - V());
            case 3:
                return E((j - k(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return E(j - ((long) (((int) Math.floorMod(P() + 3, 7L)) + 1)));
            case 5:
                return E(j - k(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return E(j - k(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new n(this.a, j);
            case 8:
                return E((j - k(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return f0(this.b, i, this.d);
            case 10:
                return L(j - (((((long) this.b) * 12) + ((long) this.c)) - 1));
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return f0(i, this.c, this.d);
            case 12:
                return f0(i, this.c, this.d);
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return f0(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return ((i & (-2048)) ^ 2100100019) ^ (((i << 11) + (i2 << 6)) + i3);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.temporal.n nVar) {
        return (n) super.j(nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        int iV;
        int iFloorMod;
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        switch (m.a[((j$.time.temporal.a) temporalField).ordinal()]) {
            case 1:
                iV = this.d;
                return iV;
            case 2:
                iV = V();
                return iV;
            case 3:
                iFloorMod = (this.d - 1) / 7;
                iV = iFloorMod + 1;
                return iV;
            case 4:
                iFloorMod = (int) Math.floorMod(P() + 3, 7L);
                iV = iFloorMod + 1;
                return iV;
            case 5:
                iFloorMod = (this.d - 1) % 7;
                iV = iFloorMod + 1;
                return iV;
            case 6:
                iFloorMod = (V() - 1) % 7;
                iV = iFloorMod + 1;
                return iV;
            case 7:
                return P();
            case 8:
                iFloorMod = (V() - 1) / 7;
                iV = iFloorMod + 1;
                return iV;
            case 9:
                iV = this.c;
                return iV;
            case 10:
                return ((((long) this.b) * 12) + ((long) this.c)) - 1;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                iV = this.b;
                return iV;
            case 12:
                iV = this.b;
                return iV;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", temporalField));
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
        int i = m.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.t.f(1L, this.a.j0(this.b, this.c));
        }
        if (i != 2) {
            return i != 3 ? this.a.C(aVar) : j$.time.temporal.t.f(1L, 5L);
        }
        return j$.time.temporal.t.f(1L, a0());
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m b(long j, j$.time.temporal.r rVar) {
        return (n) super.b(j, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.r rVar) {
        return (n) super.c(j, rVar);
    }

    public n(l lVar, int i, int i2, int i3) {
        lVar.i0(i, i2, i3);
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
