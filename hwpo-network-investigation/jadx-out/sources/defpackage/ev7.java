package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ev7 extends fk4<ev7, a> implements fv7 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final ev7 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile st7<ev7> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private k20 applicationInfo_;
    private int bitField0_;
    private tj4 gaugeMetric_;
    private z97 networkRequestMetric_;
    private zra traceMetric_;
    private ixa transportInfo_;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends fk4.a<ev7, a> implements fv7 {
        public a() {
            super(ev7.DEFAULT_INSTANCE);
        }

        @Override // defpackage.fv7
        public final boolean d() {
            return ((ev7) this.u).d();
        }

        @Override // defpackage.fv7
        public final boolean f() {
            return ((ev7) this.u).f();
        }

        @Override // defpackage.fv7
        public final zra g() {
            return ((ev7) this.u).g();
        }

        @Override // defpackage.fv7
        public final boolean h() {
            return ((ev7) this.u).h();
        }

        @Override // defpackage.fv7
        public final z97 i() {
            return ((ev7) this.u).i();
        }

        @Override // defpackage.fv7
        public final tj4 j() {
            return ((ev7) this.u).j();
        }
    }

    static {
        ev7 ev7Var = new ev7();
        DEFAULT_INSTANCE = ev7Var;
        fk4.w(ev7.class, ev7Var);
    }

    public static void A(ev7 ev7Var, zra zraVar) {
        ev7Var.getClass();
        ev7Var.traceMetric_ = zraVar;
        ev7Var.bitField0_ |= 2;
    }

    public static void B(ev7 ev7Var, z97 z97Var) {
        ev7Var.getClass();
        ev7Var.networkRequestMetric_ = z97Var;
        ev7Var.bitField0_ |= 4;
    }

    public static a E() {
        return DEFAULT_INSTANCE.o();
    }

    public static void y(ev7 ev7Var, k20 k20Var) {
        ev7Var.getClass();
        ev7Var.applicationInfo_ = k20Var;
        ev7Var.bitField0_ |= 1;
    }

    public static void z(ev7 ev7Var, tj4 tj4Var) {
        ev7Var.getClass();
        ev7Var.gaugeMetric_ = tj4Var;
        ev7Var.bitField0_ |= 8;
    }

    public final k20 C() {
        k20 k20Var = this.applicationInfo_;
        return k20Var == null ? k20.E() : k20Var;
    }

    public final boolean D() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // defpackage.fv7
    public final boolean d() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // defpackage.fv7
    public final boolean f() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // defpackage.fv7
    public final zra g() {
        zra zraVar = this.traceMetric_;
        return zraVar == null ? zra.L() : zraVar;
    }

    @Override // defpackage.fv7
    public final boolean h() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // defpackage.fv7
    public final z97 i() {
        z97 z97Var = this.networkRequestMetric_;
        return z97Var == null ? z97.M() : z97Var;
    }

    @Override // defpackage.fv7
    public final tj4 j() {
        tj4 tj4Var = this.gaugeMetric_;
        return tj4Var == null ? tj4.E() : tj4Var;
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
                return new xh8(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new ev7();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                st7<ev7> st7Var = PARSER;
                if (st7Var != null) {
                    return st7Var;
                }
                synchronized (ev7.class) {
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
