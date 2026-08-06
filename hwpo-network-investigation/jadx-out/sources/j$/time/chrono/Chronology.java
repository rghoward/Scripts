package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public interface Chronology extends Comparable<Chronology> {
    static Chronology of(String str) {
        ConcurrentHashMap concurrentHashMap = a.a;
        Objects.requireNonNull(str, "id");
        do {
            Chronology chronology = (Chronology) a.a.get(str);
            if (chronology == null) {
                chronology = (Chronology) a.b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
        } while (a.E());
        for (Chronology chronology2 : ServiceLoader.load(Chronology.class)) {
            if (str.equals(chronology2.getId()) || str.equals(chronology2.u())) {
                return chronology2;
            }
        }
        j$.nio.file.k.h("Unknown chronology: ".concat(str));
        return null;
    }

    static Chronology ofLocale(Locale locale) {
        return a.ofLocale(locale);
    }

    static Chronology p(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.d(j$.time.temporal.q.b);
        p pVar = p.d;
        if (chronology != null) {
            return chronology;
        }
        Objects.requireNonNull(pVar, "defaultObj");
        return pVar;
    }

    j$.time.temporal.t C(j$.time.temporal.a aVar);

    List D();

    j F(int i);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    int compareTo(Chronology chronology);

    int I(j jVar, int i);

    ChronoLocalDate M(TemporalAccessor temporalAccessor);

    default ChronoLocalDateTime N(LocalDateTime localDateTime) {
        try {
            return M(localDateTime).Q(LocalTime.L(localDateTime));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    ChronoLocalDate R();

    ChronoLocalDate W(int i, int i2, int i3);

    ChronoLocalDate Y(Map map, j$.time.format.c0 c0Var);

    default ChronoZonedDateTime Z(Instant instant, ZoneId zoneId) {
        return i.L(this, instant, zoneId);
    }

    boolean c0(long j);

    boolean equals(Object obj);

    String getId();

    int hashCode();

    ChronoLocalDate n(long j);

    String toString();

    String u();

    ChronoLocalDate w(int i, int i2);
}
