package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class x {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    public x(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology = dateTimeFormatter.e;
        if (chronology != null) {
            Chronology chronology2 = (Chronology) temporalAccessor.d(j$.time.temporal.q.b);
            ZoneId zoneId = (ZoneId) temporalAccessor.d(j$.time.temporal.q.a);
            ChronoLocalDate chronoLocalDateM = null;
            chronology = Objects.equals(chronology, chronology2) ? null : chronology;
            if (chronology != null) {
                Chronology chronology3 = chronology != null ? chronology : chronology2;
                if (chronology != null) {
                    if (temporalAccessor.i(j$.time.temporal.a.EPOCH_DAY)) {
                        chronoLocalDateM = chronology3.M(temporalAccessor);
                    } else if (chronology != j$.time.chrono.p.d || chronology2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && temporalAccessor.i(aVar)) {
                                throw new j$.time.b("Unable to apply override chronology '" + chronology + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new w(chronoLocalDateM, temporalAccessor, chronology3, zoneId);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Long a(TemporalField temporalField) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.i(temporalField)) {
            return Long.valueOf(temporalAccessor.k(temporalField));
        }
        return null;
    }

    public final Object b(j$.time.e eVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object objD = temporalAccessor.d(eVar);
        if (objD != null || this.c != 0) {
            return objD;
        }
        throw new j$.time.b("Unable to extract " + eVar + " from temporal " + temporalAccessor);
    }

    public final String toString() {
        return this.a.toString();
    }
}
