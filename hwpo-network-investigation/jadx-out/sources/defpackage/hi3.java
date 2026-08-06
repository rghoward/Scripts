package defpackage;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hi3 extends pi4 implements oh4<Long, g2b> {
    @Override // defpackage.oh4
    public final g2b invoke(Long l) {
        long jLongValue = l.longValue();
        fj3 fj3Var = (fj3) this.receiver;
        fj3Var.getClass();
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        LocalDate localDate = Instant.ofEpochMilli(jLongValue).atOffset(zoneOffset).toLocalDate();
        localDate.getClass();
        fj3Var.e(new vh3.b(localDate));
        return g2b.a;
    }
}
