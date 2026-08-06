package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements j$.time.temporal.p, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final Chronology a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.desugar.sun.nio.fs.g.o(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public f(Chronology chronology, int i, int i2, int i3) {
        this.a = chronology;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.a.equals(fVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new b0((byte) 9, this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m z(ChronoLocalDate chronoLocalDate) {
        j$.time.temporal.m mVarB;
        Chronology chronology = (Chronology) chronoLocalDate.d(j$.time.temporal.q.b);
        if (chronology != null && !this.a.equals(chronology)) {
            j$.nio.file.k.f("Chronology mismatch, expected: ", this.a.getId(), ", actual: ", chronology.getId());
            return null;
        }
        if (this.c == 0) {
            int i = this.b;
            if (i != 0) {
                mVarB = chronoLocalDate;
                mVarB = chronoLocalDate.b(i, (j$.time.temporal.r) j$.time.temporal.b.YEARS);
            }
        } else {
            j$.time.temporal.t tVarC = this.a.C(j$.time.temporal.a.MONTH_OF_YEAR);
            long j = (tVarC.a == tVarC.b && tVarC.c == tVarC.d && tVarC.d()) ? (tVarC.d - tVarC.a) + 1 : -1L;
            int i2 = this.b;
            ChronoLocalDate chronoLocalDateB = chronoLocalDate;
            if (j > 0) {
                mVarB = chronoLocalDate.b((((long) i2) * j) + ((long) this.c), (j$.time.temporal.r) j$.time.temporal.b.MONTHS);
            } else {
                if (i2 != 0) {
                    chronoLocalDateB = chronoLocalDate.b(i2, (j$.time.temporal.r) j$.time.temporal.b.YEARS);
                }
                mVarB = chronoLocalDateB.b(this.c, (j$.time.temporal.r) j$.time.temporal.b.MONTHS);
            }
        }
        mVarB = chronoLocalDate;
        int i3 = this.d;
        return i3 != 0 ? mVarB.b(i3, j$.time.temporal.b.DAYS) : mVarB;
    }
}
