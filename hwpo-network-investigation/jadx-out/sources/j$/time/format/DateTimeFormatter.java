package j$.time.format;

import io.intercom.android.sdk.models.AttributeType;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;
    public final d a;
    public final Locale b;
    public final DecimalStyle c;
    public final c0 d;
    public final Chronology e;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        d0 d0Var = d0.EXCEEDS_PAD;
        dateTimeFormatterBuilder.n(aVar, 4, 10, d0Var);
        dateTimeFormatterBuilder.d('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.m(aVar2, 2);
        dateTimeFormatterBuilder.d('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.m(aVar3, 2);
        c0 c0Var = c0.STRICT;
        j$.time.chrono.p pVar = j$.time.chrono.p.d;
        DateTimeFormatter dateTimeFormatterQ = dateTimeFormatterBuilder.q(c0Var, pVar);
        ISO_LOCAL_DATE = dateTimeFormatterQ;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        q qVar = q.INSENSITIVE;
        dateTimeFormatterBuilder2.c(qVar);
        dateTimeFormatterBuilder2.a(dateTimeFormatterQ);
        k kVar = k.e;
        dateTimeFormatterBuilder2.c(kVar);
        dateTimeFormatterBuilder2.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.c(qVar);
        dateTimeFormatterBuilder3.a(dateTimeFormatterQ);
        dateTimeFormatterBuilder3.p();
        dateTimeFormatterBuilder3.c(kVar);
        dateTimeFormatterBuilder3.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.m(aVar4, 2);
        dateTimeFormatterBuilder4.d(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.m(aVar5, 2);
        dateTimeFormatterBuilder4.p();
        dateTimeFormatterBuilder4.d(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder4.m(aVar6, 2);
        dateTimeFormatterBuilder4.p();
        dateTimeFormatterBuilder4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterQ2 = dateTimeFormatterBuilder4.q(c0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.c(qVar);
        dateTimeFormatterBuilder5.a(dateTimeFormatterQ2);
        dateTimeFormatterBuilder5.c(kVar);
        dateTimeFormatterBuilder5.q(c0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.c(qVar);
        dateTimeFormatterBuilder6.a(dateTimeFormatterQ2);
        dateTimeFormatterBuilder6.p();
        dateTimeFormatterBuilder6.c(kVar);
        dateTimeFormatterBuilder6.q(c0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.c(qVar);
        dateTimeFormatterBuilder7.a(dateTimeFormatterQ);
        dateTimeFormatterBuilder7.d('T');
        dateTimeFormatterBuilder7.a(dateTimeFormatterQ2);
        DateTimeFormatter dateTimeFormatterQ3 = dateTimeFormatterBuilder7.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.c(qVar);
        dateTimeFormatterBuilder8.a(dateTimeFormatterQ3);
        q qVar2 = q.LENIENT;
        dateTimeFormatterBuilder8.c(qVar2);
        dateTimeFormatterBuilder8.c(kVar);
        q qVar3 = q.STRICT;
        dateTimeFormatterBuilder8.c(qVar3);
        DateTimeFormatter dateTimeFormatterQ4 = dateTimeFormatterBuilder8.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.a(dateTimeFormatterQ4);
        dateTimeFormatterBuilder9.p();
        dateTimeFormatterBuilder9.d('[');
        q qVar4 = q.SENSITIVE;
        dateTimeFormatterBuilder9.c(qVar4);
        j$.time.e eVar = DateTimeFormatterBuilder.h;
        dateTimeFormatterBuilder9.c(new t(eVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder9.d(']');
        dateTimeFormatterBuilder9.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.a(dateTimeFormatterQ3);
        dateTimeFormatterBuilder10.p();
        dateTimeFormatterBuilder10.c(kVar);
        dateTimeFormatterBuilder10.p();
        dateTimeFormatterBuilder10.d('[');
        dateTimeFormatterBuilder10.c(qVar4);
        dateTimeFormatterBuilder10.c(new t(eVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder10.d(']');
        dateTimeFormatterBuilder10.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.c(qVar);
        dateTimeFormatterBuilder11.n(aVar, 4, 10, d0Var);
        dateTimeFormatterBuilder11.d('-');
        dateTimeFormatterBuilder11.m(j$.time.temporal.a.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilder11.p();
        dateTimeFormatterBuilder11.c(kVar);
        dateTimeFormatterBuilder11.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.c(qVar);
        dateTimeFormatterBuilder12.n(j$.time.temporal.j.c, 4, 10, d0Var);
        dateTimeFormatterBuilder12.e("-W");
        dateTimeFormatterBuilder12.m(j$.time.temporal.j.b, 2);
        dateTimeFormatterBuilder12.d('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        dateTimeFormatterBuilder12.m(aVar7, 1);
        dateTimeFormatterBuilder12.p();
        dateTimeFormatterBuilder12.c(kVar);
        dateTimeFormatterBuilder12.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.c(qVar);
        dateTimeFormatterBuilder13.c(new g());
        ISO_INSTANT = dateTimeFormatterBuilder13.q(c0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.c(qVar);
        dateTimeFormatterBuilder14.m(aVar, 4);
        dateTimeFormatterBuilder14.m(aVar2, 2);
        dateTimeFormatterBuilder14.m(aVar3, 2);
        dateTimeFormatterBuilder14.p();
        dateTimeFormatterBuilder14.c(qVar2);
        dateTimeFormatterBuilder14.g("+HHMMss", "Z");
        dateTimeFormatterBuilder14.c(qVar3);
        dateTimeFormatterBuilder14.q(c0Var, pVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.c(qVar);
        dateTimeFormatterBuilder15.c(qVar2);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.i(aVar7, map);
        dateTimeFormatterBuilder15.e(", ");
        dateTimeFormatterBuilder15.o();
        dateTimeFormatterBuilder15.n(aVar3, 1, 2, d0.NOT_NEGATIVE);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.i(aVar2, map2);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.m(aVar, 4);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.m(aVar4, 2);
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.m(aVar5, 2);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.m(aVar6, 2);
        dateTimeFormatterBuilder15.o();
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.g("+HHMM", "GMT");
        RFC_1123_DATE_TIME = dateTimeFormatterBuilder15.q(c0.SMART, pVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, DecimalStyle decimalStyle, c0 c0Var, Chronology chronology) {
        Objects.requireNonNull(dVar, "printerParser");
        this.a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.b = locale;
        Objects.requireNonNull(decimalStyle, "decimalStyle");
        this.c = decimalStyle;
        Objects.requireNonNull(c0Var, "resolverStyle");
        this.d = c0Var;
        this.e = chronology;
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateTimeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.c(new i(formatStyle, formatStyle));
        return dateTimeFormatterBuilder.q(c0.SMART, j$.time.chrono.p.d);
    }

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.r(Locale.getDefault(), c0.SMART, null);
    }

    public final Object a(CharSequence charSequence, j$.time.e eVar) {
        String string;
        Objects.requireNonNull(charSequence, AttributeType.TEXT);
        try {
            return b(charSequence).d(eVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0311  */
    /* JADX WARN: Code duplicated, block: B:129:0x031f  */
    /* JADX WARN: Code duplicated, block: B:130:0x034a  */
    /* JADX WARN: Code duplicated, block: B:163:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0256  */
    /* JADX WARN: Code duplicated, block: B:96:0x027a  */
    public final b0 b(CharSequence charSequence) {
        TemporalField temporalField;
        j$.time.temporal.a aVar;
        j$.time.temporal.a aVar2;
        boolean zContainsKey;
        Map map;
        TemporalField temporalField2;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, AttributeType.TEXT);
        v vVar = new v(this);
        int iE = this.a.E(vVar, charSequence, parsePosition.getIndex());
        if (iE < 0) {
            parsePosition.setErrorIndex(~iE);
            vVar = null;
        } else {
            parsePosition.setIndex(iE);
        }
        if (vVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            String string = charSequence.length() > 64 ? charSequence.subSequence(0, 64).toString() + "..." : charSequence.toString();
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        b0 b0VarC = vVar.c();
        b0VarC.c = vVar.d();
        ZoneId zoneId = b0VarC.b;
        if (zoneId == null) {
            vVar.a.getClass();
            zoneId = null;
        }
        b0VarC.b = zoneId;
        b0VarC.e = this.d;
        b0VarC.o();
        b0VarC.u(b0VarC.c.Y(b0VarC.a, b0VarC.e));
        b0VarC.r();
        if (((HashMap) b0VarC.a).size() > 0) {
            loop0: while (i < 50) {
                Iterator it = ((HashMap) b0VarC.a).entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    temporalField2 = (TemporalField) ((Map.Entry) it.next()).getKey();
                    TemporalAccessor temporalAccessorL = temporalField2.L(b0VarC.a, b0VarC, b0VarC.e);
                    if (temporalAccessorL != null) {
                        if (temporalAccessorL instanceof ChronoZonedDateTime) {
                            ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorL;
                            ZoneId zoneId2 = b0VarC.b;
                            if (zoneId2 == null) {
                                b0VarC.b = chronoZonedDateTime.getZone();
                            } else if (!zoneId2.equals(chronoZonedDateTime.getZone())) {
                                throw new j$.time.b("ChronoZonedDateTime must use the effective parsed zone: " + b0VarC.b);
                            }
                            temporalAccessorL = chronoZonedDateTime.A();
                        }
                        if (temporalAccessorL instanceof ChronoLocalDateTime) {
                            ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorL;
                            b0VarC.t(chronoLocalDateTime.toLocalTime(), Period.d);
                            b0VarC.u(chronoLocalDateTime.m());
                            break;
                        }
                        if (temporalAccessorL instanceof ChronoLocalDate) {
                            b0VarC.u((ChronoLocalDate) temporalAccessorL);
                            break;
                        }
                        if (temporalAccessorL instanceof LocalTime) {
                            b0VarC.t((LocalTime) temporalAccessorL, Period.d);
                            break;
                        }
                        j$.nio.file.k.h("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        return null;
                    }
                } while (((HashMap) b0VarC.a).containsKey(temporalField2));
                i++;
            }
            if (i == 50) {
                j$.nio.file.k.h("One of the parsed fields has an incorrectly implemented resolve method");
                return null;
            }
            if (i > 0) {
                b0VarC.o();
                b0VarC.u(b0VarC.c.Y(b0VarC.a, b0VarC.e));
                b0VarC.r();
            }
        }
        long j = 1000000;
        if (b0VarC.g == null) {
            Map map2 = b0VarC.a;
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MILLI_OF_SECOND;
            boolean zContainsKey2 = ((HashMap) map2).containsKey(aVar3);
            Map map3 = b0VarC.a;
            if (zContainsKey2) {
                long jLongValue = ((Long) ((HashMap) map3).remove(aVar3)).longValue();
                Map map4 = b0VarC.a;
                j$.time.temporal.a aVar4 = j$.time.temporal.a.MICRO_OF_SECOND;
                boolean zContainsKey3 = ((HashMap) map4).containsKey(aVar4);
                Map map5 = b0VarC.a;
                if (zContainsKey3) {
                    long jLongValue2 = (((Long) ((HashMap) map5).get(aVar4)).longValue() % 1000) + (jLongValue * 1000);
                    b0VarC.v(aVar3, aVar4, Long.valueOf(jLongValue2));
                    ((HashMap) b0VarC.a).remove(aVar4);
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                } else {
                    ((HashMap) map5).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                }
            } else {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (((HashMap) map3).containsKey(aVar5)) {
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) b0VarC.a).remove(aVar5)).longValue() * 1000));
                }
            }
            Map map6 = b0VarC.a;
            j$.time.temporal.a aVar6 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l = (Long) ((HashMap) map6).get(aVar6);
            if (l != null) {
                Map map7 = b0VarC.a;
                j$.time.temporal.a aVar7 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l2 = (Long) ((HashMap) map7).get(aVar7);
                Map map8 = b0VarC.a;
                j$.time.temporal.a aVar8 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l3 = (Long) ((HashMap) map8).get(aVar8);
                Map map9 = b0VarC.a;
                j$.time.temporal.a aVar9 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l4 = (Long) ((HashMap) map9).get(aVar9);
                if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                    b0VarC.q(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                    ((HashMap) b0VarC.a).remove(aVar6);
                    ((HashMap) b0VarC.a).remove(aVar7);
                    ((HashMap) b0VarC.a).remove(aVar8);
                    ((HashMap) b0VarC.a).remove(aVar9);
                } else {
                    j = 1000000;
                }
            }
            if (b0VarC.e != c0.LENIENT && ((HashMap) b0VarC.a).size() > 0) {
                for (Map.Entry entry : ((HashMap) b0VarC.a).entrySet()) {
                    temporalField = (TemporalField) entry.getKey();
                    if (temporalField instanceof j$.time.temporal.a) {
                        aVar = (j$.time.temporal.a) temporalField;
                        if (aVar.f0()) {
                            aVar.e0(((Long) entry.getValue()).longValue());
                        }
                    }
                }
            }
        } else if (b0VarC.e != c0.LENIENT) {
            while (r0.hasNext()) {
                temporalField = (TemporalField) entry.getKey();
                if (temporalField instanceof j$.time.temporal.a) {
                    aVar = (j$.time.temporal.a) temporalField;
                    if (aVar.f0()) {
                        aVar.e0(((Long) entry.getValue()).longValue());
                    }
                }
            }
        }
        ChronoLocalDate chronoLocalDate = b0VarC.f;
        if (chronoLocalDate != null) {
            b0VarC.n(chronoLocalDate);
        }
        LocalTime localTime = b0VarC.g;
        if (localTime != null) {
            b0VarC.n(localTime);
            if (b0VarC.f != null && ((HashMap) b0VarC.a).size() > 0) {
                b0VarC.n(b0VarC.f.Q(b0VarC.g));
            }
        }
        if (b0VarC.f != null && b0VarC.g != null) {
            Period period = b0VarC.h;
            period.getClass();
            Period period2 = Period.d;
            if (period != period2) {
                b0VarC.f = b0VarC.f.X(b0VarC.h);
                b0VarC.h = period2;
            }
        }
        if (b0VarC.g == null) {
            if (((HashMap) b0VarC.a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
                Map map10 = b0VarC.a;
                aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map10).containsKey(aVar2);
                map = b0VarC.a;
                if (zContainsKey) {
                    long jLongValue3 = ((Long) ((HashMap) map).get(aVar2)).longValue();
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j));
                } else {
                    ((HashMap) map).put(aVar2, 0L);
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                }
            } else if (((HashMap) b0VarC.a).containsKey(j$.time.temporal.a.SECOND_OF_DAY)) {
                Map map11 = b0VarC.a;
                aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map11).containsKey(aVar2);
                map = b0VarC.a;
                if (zContainsKey) {
                    long jLongValue4 = ((Long) ((HashMap) map).get(aVar2)).longValue();
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / 1000));
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / j));
                } else {
                    ((HashMap) map).put(aVar2, 0L);
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                }
            } else if (((HashMap) b0VarC.a).containsKey(j$.time.temporal.a.SECOND_OF_MINUTE)) {
                Map map12 = b0VarC.a;
                aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map12).containsKey(aVar2);
                map = b0VarC.a;
                if (zContainsKey) {
                    long jLongValue5 = ((Long) ((HashMap) map).get(aVar2)).longValue();
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / 1000));
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / j));
                } else {
                    ((HashMap) map).put(aVar2, 0L);
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                    ((HashMap) b0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                }
            }
        }
        if (b0VarC.f != null && b0VarC.g != null) {
            Long l5 = (Long) ((HashMap) b0VarC.a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l5 != null) {
                ((HashMap) b0VarC.a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(b0VarC.f.Q(b0VarC.g).K(ZoneOffset.ofTotalSeconds(l5.intValue())).d0()));
                return b0VarC;
            }
            if (b0VarC.b != null) {
                ((HashMap) b0VarC.a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(b0VarC.f.Q(b0VarC.g).K(b0VarC.b).d0()));
            }
        }
        return b0VarC;
    }

    public final d c() {
        d dVar = this.a;
        return !dVar.b ? dVar : new d(dVar.a, false);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.z(new x(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.b(e.getMessage(), e);
        }
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, decimalStyle, this.d, this.e);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        if (this.b.equals(locale)) {
            return this;
        }
        return new DateTimeFormatter(this.a, locale, this.c, this.d, this.e);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.r(locale, c0.SMART, null);
    }
}
