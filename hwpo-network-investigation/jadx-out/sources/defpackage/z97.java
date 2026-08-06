package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z97 extends fk4<z97, a> implements bu6 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final z97 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile st7<z97> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private uh6<String, String> customAttributes_ = uh6.u;
    private String url_ = BuildConfig.FLAVOR;
    private String responseContentType_ = BuildConfig.FLAVOR;
    private zi5.c<iv7> perfSessions_ = ze8.w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends fk4.a<z97, a> implements bu6 {
        public a() {
            super(z97.DEFAULT_INSTANCE);
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum c implements zi5.a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public final int t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a {
            public static final a a = new a();
        }

        c(int i) {
            this.t = i;
        }

        @Override // zi5.a
        public final int a() {
            return this.t;
        }
    }

    static {
        z97 z97Var = new z97();
        DEFAULT_INSTANCE = z97Var;
        fk4.w(z97.class, z97Var);
    }

    public static void A(z97 z97Var, int i) {
        z97Var.bitField0_ |= 32;
        z97Var.httpResponseCode_ = i;
    }

    public static void B(z97 z97Var, String str) {
        z97Var.getClass();
        str.getClass();
        z97Var.bitField0_ |= 64;
        z97Var.responseContentType_ = str;
    }

    public static void C(z97 z97Var) {
        z97Var.bitField0_ &= -65;
        z97Var.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void D(z97 z97Var, long j) {
        z97Var.bitField0_ |= 128;
        z97Var.clientStartTimeUs_ = j;
    }

    public static void E(z97 z97Var, long j) {
        z97Var.bitField0_ |= 256;
        z97Var.timeToRequestCompletedUs_ = j;
    }

    public static void F(z97 z97Var, long j) {
        z97Var.bitField0_ |= 512;
        z97Var.timeToResponseInitiatedUs_ = j;
    }

    public static void G(z97 z97Var, long j) {
        z97Var.bitField0_ |= 1024;
        z97Var.timeToResponseCompletedUs_ = j;
    }

    public static void H(z97 z97Var, List list) {
        zi5.c<iv7> cVar = z97Var.perfSessions_;
        if (!cVar.s()) {
            z97Var.perfSessions_ = fk4.u(cVar);
        }
        a2.k(list, z97Var.perfSessions_);
    }

    public static void I(z97 z97Var, c cVar) {
        z97Var.getClass();
        z97Var.httpMethod_ = cVar.t;
        z97Var.bitField0_ |= 2;
    }

    public static void J(z97 z97Var, long j) {
        z97Var.bitField0_ |= 4;
        z97Var.requestPayloadBytes_ = j;
    }

    public static void K(z97 z97Var, long j) {
        z97Var.bitField0_ |= 8;
        z97Var.responsePayloadBytes_ = j;
    }

    public static z97 M() {
        return DEFAULT_INSTANCE;
    }

    public static a e0() {
        return DEFAULT_INSTANCE.o();
    }

    public static void y(z97 z97Var, String str) {
        z97Var.getClass();
        z97Var.bitField0_ |= 1;
        z97Var.url_ = str;
    }

    public static void z(z97 z97Var) {
        z97Var.getClass();
        z97Var.networkClientErrorReason_ = 1;
        z97Var.bitField0_ |= 16;
    }

    public final long L() {
        return this.clientStartTimeUs_;
    }

    public final c N() {
        c cVar;
        int i = this.httpMethod_;
        c cVar2 = c.HTTP_METHOD_UNKNOWN;
        switch (i) {
            case 0:
                cVar = cVar2;
                break;
            case 1:
                cVar = c.GET;
                break;
            case 2:
                cVar = c.PUT;
                break;
            case 3:
                cVar = c.POST;
                break;
            case 4:
                cVar = c.DELETE;
                break;
            case 5:
                cVar = c.HEAD;
                break;
            case 6:
                cVar = c.PATCH;
                break;
            case 7:
                cVar = c.OPTIONS;
                break;
            case 8:
                cVar = c.TRACE;
                break;
            case 9:
                cVar = c.CONNECT;
                break;
            default:
                cVar = null;
                break;
        }
        return cVar == null ? cVar2 : cVar;
    }

    public final int O() {
        return this.httpResponseCode_;
    }

    public final zi5.c P() {
        return this.perfSessions_;
    }

    public final long Q() {
        return this.requestPayloadBytes_;
    }

    public final long R() {
        return this.responsePayloadBytes_;
    }

    public final long S() {
        return this.timeToRequestCompletedUs_;
    }

    public final long T() {
        return this.timeToResponseCompletedUs_;
    }

    public final long U() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String V() {
        return this.url_;
    }

    public final boolean W() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean X() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean Y() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean Z() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean a0() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean b0() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean c0() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean d0() {
        return (this.bitField0_ & 512) != 0;
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
                return new xh8(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", c.a.a, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", aa7.a, "customAttributes_", b.a, "perfSessions_", iv7.class});
            case 3:
                return new z97();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                st7<z97> st7Var = PARSER;
                if (st7Var != null) {
                    return st7Var;
                }
                synchronized (z97.class) {
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
