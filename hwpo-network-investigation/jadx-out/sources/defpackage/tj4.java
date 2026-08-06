package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tj4 extends fk4<tj4, a> implements bu6 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final tj4 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile st7<tj4> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private zi5.c<fp> androidMemoryReadings_;
    private int bitField0_;
    private zi5.c<q82> cpuMetricReadings_;
    private rj4 gaugeMetadata_;
    private String sessionId_ = BuildConfig.FLAVOR;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends fk4.a<tj4, a> implements bu6 {
        public a() {
            super(tj4.DEFAULT_INSTANCE);
        }
    }

    static {
        tj4 tj4Var = new tj4();
        DEFAULT_INSTANCE = tj4Var;
        fk4.w(tj4.class, tj4Var);
    }

    public tj4() {
        ze8<Object> ze8Var = ze8.w;
        this.cpuMetricReadings_ = ze8Var;
        this.androidMemoryReadings_ = ze8Var;
    }

    public static void A(tj4 tj4Var, rj4 rj4Var) {
        tj4Var.getClass();
        rj4Var.getClass();
        tj4Var.gaugeMetadata_ = rj4Var;
        tj4Var.bitField0_ |= 2;
    }

    public static void B(tj4 tj4Var, q82 q82Var) {
        tj4Var.getClass();
        q82Var.getClass();
        zi5.c<q82> cVar = tj4Var.cpuMetricReadings_;
        if (!cVar.s()) {
            tj4Var.cpuMetricReadings_ = fk4.u(cVar);
        }
        tj4Var.cpuMetricReadings_.add(q82Var);
    }

    public static tj4 E() {
        return DEFAULT_INSTANCE;
    }

    public static a I() {
        return DEFAULT_INSTANCE.o();
    }

    public static void y(tj4 tj4Var, String str) {
        tj4Var.getClass();
        str.getClass();
        tj4Var.bitField0_ |= 1;
        tj4Var.sessionId_ = str;
    }

    public static void z(tj4 tj4Var, fp fpVar) {
        tj4Var.getClass();
        fpVar.getClass();
        zi5.c<fp> cVar = tj4Var.androidMemoryReadings_;
        if (!cVar.s()) {
            tj4Var.androidMemoryReadings_ = fk4.u(cVar);
        }
        tj4Var.androidMemoryReadings_.add(fpVar);
    }

    public final int C() {
        return this.androidMemoryReadings_.size();
    }

    public final int D() {
        return this.cpuMetricReadings_.size();
    }

    public final rj4 F() {
        rj4 rj4Var = this.gaugeMetadata_;
        return rj4Var == null ? rj4.B() : rj4Var;
    }

    public final boolean G() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // defpackage.fk4
    public final Object p(fk4.e eVar) {
        st7 bVar;
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new xh8(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", q82.class, "gaugeMetadata_", "androidMemoryReadings_", fp.class});
            case 3:
                return new tj4();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                st7<tj4> st7Var = PARSER;
                if (st7Var != null) {
                    return st7Var;
                }
                synchronized (tj4.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new fk4.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                e44.b();
                return null;
        }
    }
}
