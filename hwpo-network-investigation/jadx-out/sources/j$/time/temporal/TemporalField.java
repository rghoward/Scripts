package j$.time.temporal;

import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public interface TemporalField {
    t E(TemporalAccessor temporalAccessor);

    default TemporalAccessor L(Map map, b0 b0Var, c0 c0Var) {
        return null;
    }

    t O();

    long V(TemporalAccessor temporalAccessor);

    m b0(m mVar, long j);

    boolean isDateBased();

    boolean z(TemporalAccessor temporalAccessor);
}
