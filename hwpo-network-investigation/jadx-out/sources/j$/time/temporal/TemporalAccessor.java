package j$.time.temporal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public interface TemporalAccessor {
    default Object d(j$.time.e eVar) {
        if (eVar == q.a || eVar == q.b || eVar == q.c) {
            return null;
        }
        return eVar.l(this);
    }

    default int h(TemporalField temporalField) {
        t tVarL = l(temporalField);
        if (!tVarL.d()) {
            throw new s("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long jK = k(temporalField);
        if (tVarL.e(jK)) {
            return (int) jK;
        }
        throw new j$.time.b("Invalid value for " + temporalField + " (valid values " + tVarL + "): " + jK);
    }

    boolean i(TemporalField temporalField);

    long k(TemporalField temporalField);

    default t l(TemporalField temporalField) {
        if (!(temporalField instanceof a)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.E(this);
        }
        if (i(temporalField)) {
            return ((a) temporalField).b;
        }
        throw new s(j$.time.c.a("Unsupported field: ", temporalField));
    }
}
