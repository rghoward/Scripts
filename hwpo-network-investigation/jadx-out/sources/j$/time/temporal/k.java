package j$.time.temporal;

import j$.time.chrono.Chronology;
import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public enum k implements TemporalField {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient t b;
    public final transient long c;

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.a = str;
        this.b = t.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.TemporalField
    public final t E(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.i(a.EPOCH_DAY)) {
            return this.b;
        }
        j$.nio.file.k.j("Unsupported field: ", this);
        return null;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor L(Map map, b0 b0Var, c0 c0Var) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        Chronology chronologyP = Chronology.p(b0Var);
        c0 c0Var2 = c0.LENIENT;
        long j = this.c;
        if (c0Var == c0Var2) {
            return chronologyP.n(Math.subtractExact(jLongValue, j));
        }
        this.b.b(this, jLongValue);
        return chronologyP.n(jLongValue - j);
    }

    @Override // j$.time.temporal.TemporalField
    public final t O() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalField
    public final long V(TemporalAccessor temporalAccessor) {
        return temporalAccessor.k(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.TemporalField
    public final m b0(m mVar, long j) {
        if (this.b.e(j)) {
            return mVar.a(a.EPOCH_DAY, Math.subtractExact(j, this.c));
        }
        throw new j$.time.b("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean z(TemporalAccessor temporalAccessor) {
        return temporalAccessor.i(a.EPOCH_DAY);
    }
}
