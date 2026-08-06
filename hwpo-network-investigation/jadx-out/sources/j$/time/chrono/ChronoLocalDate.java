package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.TemporalField;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public interface ChronoLocalDate extends j$.time.temporal.m, j$.time.temporal.n, Comparable<ChronoLocalDate> {
    default boolean B() {
        return g().c0(k(j$.time.temporal.a.YEAR));
    }

    default long P() {
        return k(j$.time.temporal.a.EPOCH_DAY);
    }

    default ChronoLocalDateTime Q(LocalTime localTime) {
        return new e(this, localTime);
    }

    default j S() {
        return g().F(h(j$.time.temporal.a.ERA));
    }

    default ChronoLocalDate X(j$.time.temporal.p pVar) {
        return c.z(g(), pVar.z(this));
    }

    @Override // j$.time.temporal.m
    default ChronoLocalDate a(TemporalField temporalField, long j) {
        if (temporalField instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", temporalField));
        }
        return c.z(g(), temporalField.b0(this, j));
    }

    default int a0() {
        return B() ? 366 : 365;
    }

    @Override // j$.time.temporal.m
    default ChronoLocalDate b(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return c.z(g(), rVar.z(this, j));
        }
        j$.nio.file.k.d("Unsupported unit: ", rVar);
        return null;
    }

    @Override // j$.time.temporal.m
    default ChronoLocalDate c(long j, j$.time.temporal.r rVar) {
        return c.z(g(), super.c(j, rVar));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(P(), chronoLocalDate.P());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) g()).compareTo(chronoLocalDate.g());
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.e eVar) {
        if (eVar == j$.time.temporal.q.a || eVar == j$.time.temporal.q.e || eVar == j$.time.temporal.q.d || eVar == j$.time.temporal.q.g) {
            return null;
        }
        if (eVar == j$.time.temporal.q.b) {
            return g();
        }
        return eVar == j$.time.temporal.q.c ? j$.time.temporal.b.DAYS : eVar.l(this);
    }

    boolean equals(Object obj);

    @Override // j$.time.temporal.n
    default j$.time.temporal.m f(j$.time.temporal.m mVar) {
        return mVar.a(j$.time.temporal.a.EPOCH_DAY, P());
    }

    Chronology g();

    int hashCode();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean i(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.z(this);
    }

    @Override // j$.time.temporal.m
    default ChronoLocalDate j(j$.time.temporal.n nVar) {
        return c.z(g(), nVar.f(this));
    }

    String toString();
}
