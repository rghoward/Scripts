package j$.time.chrono;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public interface j extends TemporalAccessor, j$.time.temporal.n {
    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.e eVar) {
        return eVar == j$.time.temporal.q.c ? j$.time.temporal.b.ERAS : super.d(eVar);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m f(j$.time.temporal.m mVar) {
        return mVar.a(j$.time.temporal.a.ERA, getValue());
    }

    int getValue();

    @Override // j$.time.temporal.TemporalAccessor
    default int h(TemporalField temporalField) {
        return temporalField == j$.time.temporal.a.ERA ? getValue() : super.h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean i(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return temporalField == j$.time.temporal.a.ERA;
        }
        return temporalField != null && temporalField.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long k(TemporalField temporalField) {
        if (temporalField == j$.time.temporal.a.ERA) {
            return getValue();
        }
        if (temporalField instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", temporalField));
        }
        return temporalField.V(this);
    }
}
