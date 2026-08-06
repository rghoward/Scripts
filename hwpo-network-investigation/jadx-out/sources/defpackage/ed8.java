package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ed8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hf3] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static dd8 a(u59 u59Var, w59 w59Var, Integer num) {
        ?? arrayList;
        String strValueOf;
        if (num != null) {
            List<w59> list = w59Var.g;
            arrayList = new ArrayList(ph1.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(u59Var, (w59) it.next(), null));
            }
        } else {
            arrayList = hf3.t;
        }
        ?? r9 = arrayList;
        int i = w59Var.a;
        double d = w59Var.d;
        u59Var.getClass();
        if (d < 0.0d) {
            strValueOf = BuildConfig.FLAVOR;
        } else if (u59Var == u59.u) {
            long j = (long) d;
            if (j <= 0) {
                strValueOf = "00:00";
            } else {
                long j2 = j / 3600;
                TimeUnit timeUnit = TimeUnit.HOURS;
                long seconds = j - timeUnit.toSeconds(j2);
                long j3 = seconds / 60;
                strValueOf = cj2.a(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toMinutes(j2) + j3)}, 1)), ":", String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds - TimeUnit.MINUTES.toSeconds(j3))}, 1)));
            }
        } else {
            strValueOf = u59Var.a() ? String.valueOf(d) : String.valueOf((int) d);
        }
        return new dd8(i, d, strValueOf, r9, w59Var.b, w59Var.c, w59Var.f, w59Var.e, w59Var.h, w59Var.i);
    }
}
