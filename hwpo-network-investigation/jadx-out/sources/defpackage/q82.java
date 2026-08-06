package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q82 extends fk4<q82, a> implements bu6 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final q82 DEFAULT_INSTANCE;
    private static volatile st7<q82> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends fk4.a<q82, a> implements bu6 {
        public a() {
            super(q82.DEFAULT_INSTANCE);
        }
    }

    static {
        q82 q82Var = new q82();
        DEFAULT_INSTANCE = q82Var;
        fk4.w(q82.class, q82Var);
    }

    public static void A(q82 q82Var, long j) {
        q82Var.bitField0_ |= 4;
        q82Var.systemTimeUs_ = j;
    }

    public static a B() {
        return DEFAULT_INSTANCE.o();
    }

    public static void y(q82 q82Var, long j) {
        q82Var.bitField0_ |= 1;
        q82Var.clientTimeUs_ = j;
    }

    public static void z(q82 q82Var, long j) {
        q82Var.bitField0_ |= 2;
        q82Var.userTimeUs_ = j;
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
                return new xh8(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 3:
                return new q82();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                st7<q82> st7Var = PARSER;
                if (st7Var != null) {
                    return st7Var;
                }
                synchronized (q82.class) {
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
