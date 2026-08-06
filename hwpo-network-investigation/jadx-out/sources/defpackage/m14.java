package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m14 extends gv7 {
    public static final dp c = dp.d();
    public final zra b;

    public m14(zra zraVar) {
        this.b = zraVar;
    }

    public static boolean d(zra zraVar, int i) {
        if (zraVar != null) {
            dp dpVar = c;
            if (i > 1) {
                dpVar.f("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry<String, Long> entry : zraVar.J().entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    String strTrim = key.trim();
                    if (strTrim.isEmpty()) {
                        dpVar.f("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        dpVar.f("counterId exceeded max length 100");
                    } else if (entry.getValue() == null) {
                        dpVar.f("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                dpVar.f("invalid CounterId:" + entry.getKey());
                return false;
            }
            Iterator<E> it = zraVar.P().iterator();
            while (it.hasNext()) {
                if (!d((zra) it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e(zra zraVar, int i) {
        Long l;
        dp dpVar = c;
        if (zraVar == null) {
            dpVar.f("TraceMetric is null");
            return false;
        }
        if (i > 1) {
            dpVar.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String strN = zraVar.N();
        if (strN != null) {
            String strTrim = strN.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (zraVar.M() <= 0) {
                    dpVar.f("invalid TraceDuration:" + zraVar.M());
                    return false;
                }
                if (!zraVar.Q()) {
                    dpVar.f("clientStartTimeUs is null.");
                    return false;
                }
                if (zraVar.N().startsWith("_st_") && ((l = zraVar.J().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                    dpVar.f("non-positive totalFrames in screen trace " + zraVar.N());
                    return false;
                }
                Iterator<E> it = zraVar.P().iterator();
                while (it.hasNext()) {
                    if (!e((zra) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry<String, String> entry : zraVar.K().entrySet()) {
                    try {
                        gv7.b(entry.getKey(), entry.getValue());
                    } catch (IllegalArgumentException e) {
                        dpVar.f(e.getLocalizedMessage());
                        return false;
                    }
                }
                return true;
            }
        }
        dpVar.f("invalid TraceId:" + zraVar.N());
        return false;
    }

    @Override // defpackage.gv7
    public final boolean a() {
        zra zraVar = this.b;
        boolean zE = e(zraVar, 0);
        dp dpVar = c;
        if (!zE) {
            dpVar.f("Invalid Trace:" + zraVar.N());
            return false;
        }
        if (zraVar.I() <= 0) {
            Iterator<E> it = zraVar.P().iterator();
            while (it.hasNext()) {
                if (((zra) it.next()).I() > 0) {
                }
            }
            return true;
        }
        if (d(zraVar, 0)) {
            return true;
        }
        dpVar.f("Invalid Counters for Trace:" + zraVar.N());
        return false;
    }
}
