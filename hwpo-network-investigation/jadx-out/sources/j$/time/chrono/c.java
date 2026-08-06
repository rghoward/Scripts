package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.TemporalField;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements ChronoLocalDate, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static ChronoLocalDate z(Chronology chronology, j$.time.temporal.m mVar) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) mVar;
        if (chronology.equals(chronoLocalDate.g())) {
            return chronoLocalDate;
        }
        j$.nio.file.k.k("Chronology mismatch, expected: ", chronology.getId(), chronoLocalDate.g().getId());
        return null;
    }

    public abstract ChronoLocalDate E(long j);

    public abstract ChronoLocalDate L(long j);

    public abstract ChronoLocalDate O(long j);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m a(TemporalField temporalField, long j) {
        return a(temporalField, j);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public ChronoLocalDate b(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return super.b(j, rVar);
        }
        switch (b.a[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return E(j);
            case 2:
                return E(Math.multiplyExact(j, 7L));
            case 3:
                return L(j);
            case 4:
                return O(j);
            case 5:
                return O(Math.multiplyExact(j, 10L));
            case 6:
                return O(Math.multiplyExact(j, 100L));
            case 7:
                return O(Math.multiplyExact(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a((TemporalField) aVar, Math.addExact(k(aVar), j));
            default:
                j$.nio.file.k.d("Unsupported unit: ", rVar);
                return null;
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m c(long j, j$.time.temporal.r rVar) {
        return c(j, rVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ j$.time.temporal.m j(LocalDate localDate) {
        return j(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long jP = P();
        return g().hashCode() ^ ((int) (jP ^ (jP >>> 32)));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long jK = k(j$.time.temporal.a.YEAR_OF_ERA);
        long jK2 = k(j$.time.temporal.a.MONTH_OF_YEAR);
        long jK3 = k(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(g().toString());
        sb.append(" ");
        sb.append(S());
        sb.append(" ");
        sb.append(jK);
        sb.append(jK2 < 10 ? "-0" : "-");
        sb.append(jK2);
        sb.append(jK3 < 10 ? "-0" : "-");
        sb.append(jK3);
        return sb.toString();
    }
}
