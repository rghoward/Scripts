package defpackage;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a6 extends pi4 implements oh4<Long, g2b> {
    @Override // defpackage.oh4
    public final g2b invoke(Long l) {
        long jLongValue = l.longValue();
        e8 e8Var = (e8) this.receiver;
        e8Var.e(b5.b.a);
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        LocalDate localDate = Instant.ofEpochMilli(jLongValue).atOffset(zoneOffset).toLocalDate();
        localDate.getClass();
        oy0.d(rhb.b(e8Var), null, null, new g8(e8Var, localDate, null), 3);
        return g2b.a;
    }
}
