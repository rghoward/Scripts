package defpackage;

import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wh8 {
    public final rv1 a;
    public final double b;
    public final double c;
    public final a d;
    public final a e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static final long i;
        public vh8 b;
        public final vh8 e;
        public final vh8 f;
        public final long g;
        public final long h;
        public long c = 500;
        public double d = 500.0d;
        public zoa a = new zoa();

        static {
            dp.d();
            i = 1000000L;
        }

        public a(vh8 vh8Var, oh7 oh7Var, rv1 rv1Var, String str) {
            bw1 bw1Var;
            long jLongValue;
            aw1 aw1Var;
            long jLongValue2;
            mw1 mw1Var;
            nw1 nw1Var;
            this.b = vh8Var;
            long j = str == "Trace" ? rv1Var.j() : rv1Var.j();
            if (str == "Trace") {
                synchronized (nw1.class) {
                    try {
                        if (nw1.x == null) {
                            nw1.x = new nw1();
                        }
                        nw1Var = nw1.x;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                RemoteConfigManager remoteConfigManager = rv1Var.a;
                nw1Var.getClass();
                rk7<Long> rk7Var = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
                if (rk7Var.b() && rv1.k(rk7Var.a().longValue())) {
                    rv1Var.c.d(rk7Var.a().longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                    jLongValue = rk7Var.a().longValue();
                } else {
                    rk7<Long> rk7VarC = rv1Var.c(nw1Var);
                    jLongValue = (rk7VarC.b() && rv1.k(rk7VarC.a().longValue())) ? rk7VarC.a().longValue() : 300L;
                }
            } else {
                synchronized (bw1.class) {
                    try {
                        if (bw1.x == null) {
                            bw1.x = new bw1();
                        }
                        bw1Var = bw1.x;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                RemoteConfigManager remoteConfigManager2 = rv1Var.a;
                bw1Var.getClass();
                rk7<Long> rk7Var2 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
                if (rk7Var2.b() && rv1.k(rk7Var2.a().longValue())) {
                    rv1Var.c.d(rk7Var2.a().longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    jLongValue = rk7Var2.a().longValue();
                } else {
                    rk7<Long> rk7VarC2 = rv1Var.c(bw1Var);
                    jLongValue = (rk7VarC2.b() && rv1.k(rk7VarC2.a().longValue())) ? rk7VarC2.a().longValue() : 700L;
                }
            }
            long j2 = jLongValue;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.e = new vh8(j2, j, timeUnit);
            this.g = j2;
            long j3 = str == "Trace" ? rv1Var.j() : rv1Var.j();
            if (str == "Trace") {
                synchronized (mw1.class) {
                    try {
                        if (mw1.x == null) {
                            mw1.x = new mw1();
                        }
                        mw1Var = mw1.x;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                RemoteConfigManager remoteConfigManager3 = rv1Var.a;
                mw1Var.getClass();
                rk7<Long> rk7Var3 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
                if (rk7Var3.b() && rv1.k(rk7Var3.a().longValue())) {
                    rv1Var.c.d(rk7Var3.a().longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                    jLongValue2 = rk7Var3.a().longValue();
                } else {
                    rk7<Long> rk7VarC3 = rv1Var.c(mw1Var);
                    jLongValue2 = (rk7VarC3.b() && rv1.k(rk7VarC3.a().longValue())) ? rk7VarC3.a().longValue() : 30L;
                }
            } else {
                synchronized (aw1.class) {
                    try {
                        if (aw1.x == null) {
                            aw1.x = new aw1();
                        }
                        aw1Var = aw1.x;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                RemoteConfigManager remoteConfigManager4 = rv1Var.a;
                aw1Var.getClass();
                rk7<Long> rk7Var4 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
                if (rk7Var4.b() && rv1.k(rk7Var4.a().longValue())) {
                    rv1Var.c.d(rk7Var4.a().longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                    jLongValue2 = rk7Var4.a().longValue();
                } else {
                    rk7<Long> rk7VarC4 = rv1Var.c(aw1Var);
                    jLongValue2 = (rk7VarC4.b() && rv1.k(rk7VarC4.a().longValue())) ? rk7VarC4.a().longValue() : 70L;
                }
            }
            long j4 = jLongValue2;
            this.f = new vh8(j4, j3, timeUnit);
            this.h = j4;
        }

        public final synchronized void a(boolean z) {
            try {
                this.b = z ? this.e : this.f;
                this.c = z ? this.g : this.h;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005a A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x0001, B:9:0x002a, B:14:0x004f, B:16:0x005a, B:19:0x006b, B:21:0x0073, B:10:0x0032, B:11:0x003a, B:12:0x003d, B:13:0x0046), top: B:29:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0073 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x0001, B:9:0x002a, B:14:0x004f, B:16:0x005a, B:19:0x006b, B:21:0x0073, B:10:0x0032, B:11:0x003a, B:12:0x003d, B:13:0x0046), top: B:29:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_GENERATE] */
        /* JADX WARN: Instruction removed from duplicated block: B:24:0x0078, please report this as an issue */
        public final synchronized boolean b() {
            double d;
            double d2;
            double seconds;
            double d3;
            double d4;
            try {
                zoa zoaVar = new zoa();
                zoa zoaVar2 = this.a;
                zoaVar2.getClass();
                double d5 = zoaVar.u - zoaVar2.u;
                vh8 vh8Var = this.b;
                long j = vh8Var.a;
                long j2 = vh8Var.b;
                int[] iArr = vh8.a.a;
                TimeUnit timeUnit = vh8Var.c;
                int i2 = iArr[timeUnit.ordinal()];
                if (i2 == 1) {
                    d = j / j2;
                    d2 = 1.0E9d;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            seconds = j / timeUnit.toSeconds(j2);
                        } else {
                            d = j / j2;
                            d2 = 1000.0d;
                        }
                        d3 = (d5 * seconds) / i;
                        if (d3 > 0.0d) {
                            this.d = Math.min(this.d + d3, this.c);
                            this.a = zoaVar;
                        }
                        d4 = this.d;
                        if (d4 >= 1.0d) {
                            return false;
                        }
                        this.d = d4 - 1.0d;
                        return true;
                    }
                    d = j / j2;
                    d2 = 1000000.0d;
                }
                seconds = d * d2;
                d3 = (d5 * seconds) / i;
                if (d3 > 0.0d) {
                    this.d = Math.min(this.d + d3, this.c);
                    this.a = zoaVar;
                }
                d4 = this.d;
                if (d4 >= 1.0d) {
                    return false;
                }
                this.d = d4 - 1.0d;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public wh8(Context context, vh8 vh8Var) {
        oh7 oh7Var = new oh7();
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        rv1 rv1VarE = rv1.e();
        this.d = null;
        this.e = null;
        boolean z = false;
        if (!(0.0d <= dNextDouble && dNextDouble < 1.0d)) {
            z90.a("Sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z = true;
        }
        if (!z) {
            z90.a("Fragment sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        this.b = dNextDouble;
        this.c = dNextDouble2;
        this.a = rv1VarE;
        this.d = new a(vh8Var, oh7Var, rv1VarE, "Trace");
        this.e = new a(vh8Var, oh7Var, rv1VarE, "Network");
        r6b.a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(zi5.c cVar) {
        return cVar.size() > 0 && ((iv7) cVar.get(0)).B() > 0 && ((iv7) cVar.get(0)).A() == lh9.GAUGES_AND_SYSTEM_EVENTS;
    }
}
