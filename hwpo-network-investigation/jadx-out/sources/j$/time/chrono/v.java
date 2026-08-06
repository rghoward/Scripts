package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements j, Serializable {
    public static final v d;
    public static final v[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        v vVar = new v(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = vVar;
        e = new v[]{vVar, new v(0, LocalDate.of(1912, 7, 30), "Taisho"), new v(1, LocalDate.of(1926, 12, 25), "Showa"), new v(2, LocalDate.of(1989, 1, 8), "Heisei"), new v(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public v(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static v n(LocalDate localDate) {
        if (localDate.b0(u.d)) {
            j$.nio.file.k.h("JapaneseDate before Meiji 6 are not supported");
            return null;
        }
        for (int length = e.length - 1; length >= 0; length--) {
            v vVar = e[length];
            if (localDate.compareTo((ChronoLocalDate) vVar.b) >= 0) {
                return vVar;
            }
        }
        return null;
    }

    public static v p(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            v[] vVarArr = e;
            if (i2 < vVarArr.length) {
                return vVarArr[i2];
            }
        }
        j$.nio.file.k.b("Invalid era: ", i);
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 5, this);
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t l(TemporalField temporalField) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return temporalField == aVar ? s.d.C(aVar) : super.l(temporalField);
    }

    public final v o() {
        v[] vVarArr = e;
        if (this == vVarArr[vVarArr.length - 1]) {
            return null;
        }
        return p(this.a + 1);
    }

    public final String toString() {
        return this.c;
    }
}
