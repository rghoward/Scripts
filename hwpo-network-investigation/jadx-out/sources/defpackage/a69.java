package defpackage;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a69 {
    public static final dp a = dp.d();

    public static void a(Trace trace, eh4 eh4Var) {
        int i = eh4Var.a;
        int i2 = eh4Var.c;
        int i3 = eh4Var.b;
        if (i > 0) {
            trace.putMetric("_fr_tot", i);
        }
        if (i3 > 0) {
            trace.putMetric("_fr_slo", i3);
        }
        if (i2 > 0) {
            trace.putMetric("_fr_fzn", i2);
        }
        StringBuilder sb = new StringBuilder("Screen trace: ");
        sb.append(trace.w);
        sb.append(" _fr_tot:");
        p23.a(sb, eh4Var.a, " _fr_slo:", i3, " _fr_fzn:");
        sb.append(i2);
        a.a(sb.toString());
    }
}
