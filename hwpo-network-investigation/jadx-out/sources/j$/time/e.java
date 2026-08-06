package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.q;
import j$.time.temporal.r;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements j$.time.temporal.n {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.n
    public j$.time.temporal.m f(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVar.a(aVar, mVar.l(aVar).d);
    }

    public Object l(TemporalAccessor temporalAccessor) {
        int i = this.a;
        e eVar = q.a;
        ZonedDateTime zonedDateTimeZ = null;
        switch (i) {
            case 0:
                return LocalDate.L(temporalAccessor);
            case 1:
                if (temporalAccessor instanceof ZonedDateTime) {
                    return (ZonedDateTime) temporalAccessor;
                }
                try {
                    ZoneId zoneIdZ = ZoneId.z(temporalAccessor);
                    j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
                    zonedDateTimeZ = temporalAccessor.i(aVar) ? ZonedDateTime.z(temporalAccessor.k(aVar), temporalAccessor.h(j$.time.temporal.a.NANO_OF_SECOND), zoneIdZ) : ZonedDateTime.E(LocalDateTime.of(LocalDate.L(temporalAccessor), LocalTime.L(temporalAccessor)), null, zoneIdZ);
                    return zonedDateTimeZ;
                } catch (b e) {
                    j$.nio.file.k.g("Unable to obtain ZonedDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
                    return zonedDateTimeZ;
                }
            case 2:
                e eVar2 = DateTimeFormatterBuilder.h;
                ZoneId zoneId = (ZoneId) temporalAccessor.d(eVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 3:
            default:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.i(aVar2)) {
                    return LocalTime.V(temporalAccessor.k(aVar2));
                }
                return null;
            case 4:
                return (ZoneId) temporalAccessor.d(eVar);
            case 5:
                return (Chronology) temporalAccessor.d(q.b);
            case 6:
                return (r) temporalAccessor.d(q.c);
            case 7:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.i(aVar3)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.h(aVar3));
                }
                return null;
            case 8:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.d(eVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.d(q.d);
            case 9:
                j$.time.temporal.a aVar4 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.i(aVar4)) {
                    return LocalDate.g0(temporalAccessor.k(aVar4));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
