package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gk extends fk4<gk, a> implements bu6 {
    private static final gk DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile st7<gk> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = BuildConfig.FLAVOR;
    private String sdkVersion_ = BuildConfig.FLAVOR;
    private String versionName_ = BuildConfig.FLAVOR;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends fk4.a<gk, a> implements bu6 {
        public a() {
            super(gk.DEFAULT_INSTANCE);
        }
    }

    static {
        gk gkVar = new gk();
        DEFAULT_INSTANCE = gkVar;
        fk4.w(gk.class, gkVar);
    }

    public static void A(gk gkVar, String str) {
        gkVar.getClass();
        gkVar.bitField0_ |= 4;
        gkVar.versionName_ = str;
    }

    public static gk B() {
        return DEFAULT_INSTANCE;
    }

    public static a E() {
        return DEFAULT_INSTANCE.o();
    }

    public static void y(gk gkVar, String str) {
        gkVar.getClass();
        str.getClass();
        gkVar.bitField0_ |= 1;
        gkVar.packageName_ = str;
    }

    public static void z(gk gkVar) {
        gkVar.getClass();
        gkVar.bitField0_ |= 2;
        gkVar.sdkVersion_ = "22.0.5";
    }

    public final boolean C() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 2) != 0;
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
                return new xh8(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new gk();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                st7<gk> st7Var = PARSER;
                if (st7Var != null) {
                    return st7Var;
                }
                synchronized (gk.class) {
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
