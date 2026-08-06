package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k20 extends fk4<k20, a> implements bu6 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final k20 DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile st7<k20> PARSER;
    private gk androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private uh6<String, String> customAttributes_ = uh6.u;
    private String googleAppId_ = BuildConfig.FLAVOR;
    private String appInstanceId_ = BuildConfig.FLAVOR;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends fk4.a<k20, a> implements bu6 {
        public a() {
            super(k20.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final sh6<String, String> a;

        static {
            gob.a aVar = gob.w;
            a = new sh6<>(aVar, aVar, BuildConfig.FLAVOR);
        }
    }

    static {
        k20 k20Var = new k20();
        DEFAULT_INSTANCE = k20Var;
        fk4.w(k20.class, k20Var);
    }

    public static uh6 A(k20 k20Var) {
        uh6<String, String> uh6Var = k20Var.customAttributes_;
        if (!uh6Var.t) {
            k20Var.customAttributes_ = uh6Var.c();
        }
        return k20Var.customAttributes_;
    }

    public static void B(k20 k20Var, String str) {
        k20Var.getClass();
        str.getClass();
        k20Var.bitField0_ |= 2;
        k20Var.appInstanceId_ = str;
    }

    public static void C(k20 k20Var, gk gkVar) {
        k20Var.getClass();
        k20Var.androidAppInfo_ = gkVar;
        k20Var.bitField0_ |= 4;
    }

    public static k20 E() {
        return DEFAULT_INSTANCE;
    }

    public static a J() {
        return DEFAULT_INSTANCE.o();
    }

    public static void y(k20 k20Var, String str) {
        k20Var.getClass();
        str.getClass();
        k20Var.bitField0_ |= 1;
        k20Var.googleAppId_ = str;
    }

    public static void z(k20 k20Var, o20 o20Var) {
        k20Var.getClass();
        k20Var.applicationProcessState_ = o20Var.t;
        k20Var.bitField0_ |= 8;
    }

    public final gk D() {
        gk gkVar = this.androidAppInfo_;
        return gkVar == null ? gk.B() : gkVar;
    }

    public final boolean F() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean I() {
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
                return new xh8(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", o20.a.a, "customAttributes_", b.a});
            case 3:
                return new k20();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                st7<k20> st7Var = PARSER;
                if (st7Var != null) {
                    return st7Var;
                }
                synchronized (k20.class) {
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
