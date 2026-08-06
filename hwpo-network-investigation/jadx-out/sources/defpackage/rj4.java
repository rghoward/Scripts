package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rj4 extends fk4<rj4, a> implements bu6 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final rj4 DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile st7<rj4> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = BuildConfig.FLAVOR;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends fk4.a<rj4, a> implements bu6 {
        public a() {
            super(rj4.DEFAULT_INSTANCE);
        }
    }

    static {
        rj4 rj4Var = new rj4();
        DEFAULT_INSTANCE = rj4Var;
        fk4.w(rj4.class, rj4Var);
    }

    public static void A(rj4 rj4Var, int i) {
        rj4Var.bitField0_ |= 8;
        rj4Var.deviceRamSizeKb_ = i;
    }

    public static rj4 B() {
        return DEFAULT_INSTANCE;
    }

    public static a D() {
        return DEFAULT_INSTANCE.o();
    }

    public static void y(rj4 rj4Var, int i) {
        rj4Var.bitField0_ |= 16;
        rj4Var.maxAppJavaHeapMemoryKb_ = i;
    }

    public static void z(rj4 rj4Var, int i) {
        rj4Var.bitField0_ |= 32;
        rj4Var.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    public final boolean C() {
        return (this.bitField0_ & 16) != 0;
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
                return new xh8(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 3:
                return new rj4();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                st7<rj4> st7Var = PARSER;
                if (st7Var != null) {
                    return st7Var;
                }
                synchronized (rj4.class) {
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
