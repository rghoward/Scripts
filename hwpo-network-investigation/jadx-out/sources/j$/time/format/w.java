package j$.time.format;

import com.intercom.twig.BuildConfig;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements TemporalAccessor {
    public final /* synthetic */ ChronoLocalDate a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ Chronology c;
    public final /* synthetic */ ZoneId d;

    public w(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.a = chronoLocalDate;
        this.b = temporalAccessor;
        this.c = chronology;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(j$.time.e eVar) {
        if (eVar == j$.time.temporal.q.b) {
            return this.c;
        }
        if (eVar == j$.time.temporal.q.a) {
            return this.d;
        }
        return eVar == j$.time.temporal.q.c ? this.b.d(eVar) : eVar.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.i(temporalField) : chronoLocalDate.i(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.k(temporalField) : chronoLocalDate.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t l(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.l(temporalField) : chronoLocalDate.l(temporalField);
    }

    public final String toString() {
        String str;
        String str2 = BuildConfig.FLAVOR;
        Chronology chronology = this.c;
        if (chronology != null) {
            str = " with chronology " + chronology;
        } else {
            str = BuildConfig.FLAVOR;
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
