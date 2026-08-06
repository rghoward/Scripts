package io.intercom.android.sdk.api;

import android.content.Context;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.a0;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.ff3;
import defpackage.fi8;
import defpackage.g2b;
import defpackage.ho5;
import defpackage.ll8;
import defpackage.oe8;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.pf2;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import defpackage.s7;
import defpackage.t72;
import defpackage.t78;
import defpackage.v72;
import defpackage.v78;
import defpackage.ws0;
import defpackage.x27;
import defpackage.xm2;
import defpackage.y02;
import defpackage.yk2;
import defpackage.ze2;
import io.intercom.android.sdk.logger.LumberMill;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ShutdownStore {
    private static final String OLD_EXPIRY_KEY = "ShutdownExpiry";
    private static final String OLD_FINGERPRINT_KEY = "ShutdownFingerprint";
    private static final String OLD_PREFS_NAME = "INTERCOM_SHUTDOWN_PREFS";
    private static final String OLD_REASON_KEY = "ShutdownReason";
    private static final Twig twig;
    private final pf2<t78> dataStore;
    private final t72 scope;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final t78.a<String> KEY_SHUTDOWN_FINGERPRINT = new t78.a<>("shutdown_fingerprint");
    private static final t78.a<Long> KEY_SHUTDOWN_EXPIRY = new t78.a<>("shutdown_expiry");
    private static final t78.a<String> KEY_SHUTDOWN_REASON = new t78.a<>("shutdown_reason");
    private static final fi8<Context, pf2<t78>> shutdownDataStore$delegate = s7.c("intercom_shutdown_datastore", null, new y02(2), 10);

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.ShutdownStore$clear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.ShutdownStore$clear$1", f = "ShutdownStore.kt", l = {94}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.api.ShutdownStore$clear$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.api.ShutdownStore$clear$1$1", f = "ShutdownStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01151 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C01151(r02<? super C01151> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01151 c01151 = new C01151(r02Var);
                c01151.L$0 = obj;
                return c01151;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01151) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ((x27) this.L$0).f();
                return g2b.a;
            }
        }

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ShutdownStore.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = ShutdownStore.this.dataStore;
                C01151 c01151 = new C01151(null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01151, this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.ShutdownStore$getShutdownExpiry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.ShutdownStore$getShutdownExpiry$1", f = "ShutdownStore.kt", l = {54}, m = "invokeSuspend")
    public static final class C03051 extends p6a implements ci4<t72, r02<? super Long>, Object> {
        final /* synthetic */ long $default;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03051(long j, r02<? super C03051> r02Var) {
            super(2, r02Var);
            this.$default = j;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ShutdownStore.this.new C03051(this.$default, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super Long> r02Var) {
            return ((C03051) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = ShutdownStore.this.dataStore.getData();
                this.label = 1;
                obj = yk2.k(data, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            Long l = (Long) ((t78) obj).b(ShutdownStore.KEY_SHUTDOWN_EXPIRY);
            return new Long(l != null ? l.longValue() : this.$default);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.ShutdownStore$getShutdownFingerprint$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.ShutdownStore$getShutdownFingerprint$1", f = "ShutdownStore.kt", l = {41}, m = "invokeSuspend")
    public static final class C03061 extends p6a implements ci4<t72, r02<? super String>, Object> {
        final /* synthetic */ String $default;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03061(String str, r02<? super C03061> r02Var) {
            super(2, r02Var);
            this.$default = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ShutdownStore.this.new C03061(this.$default, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super String> r02Var) {
            return ((C03061) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = ShutdownStore.this.dataStore.getData();
                this.label = 1;
                obj = yk2.k(data, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            String str = (String) ((t78) obj).b(ShutdownStore.KEY_SHUTDOWN_FINGERPRINT);
            return str == null ? this.$default : str;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.ShutdownStore$getShutdownReason$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.ShutdownStore$getShutdownReason$1", f = "ShutdownStore.kt", l = {67}, m = "invokeSuspend")
    public static final class C03071 extends p6a implements ci4<t72, r02<? super String>, Object> {
        int label;

        public C03071(r02<? super C03071> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ShutdownStore.this.new C03071(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super String> r02Var) {
            return ((C03071) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = ShutdownStore.this.dataStore.getData();
                this.label = 1;
                obj = yk2.k(data, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            String str = (String) ((t78) obj).b(ShutdownStore.KEY_SHUTDOWN_REASON);
            return str == null ? BuildConfig.FLAVOR : str;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.ShutdownStore$save$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.ShutdownStore$save$1", f = "ShutdownStore.kt", l = {81}, m = "invokeSuspend")
    public static final class C03081 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ long $expiry;
        final /* synthetic */ String $fingerprint;
        final /* synthetic */ String $reason;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.api.ShutdownStore$save$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.api.ShutdownStore$save$1$1", f = "ShutdownStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01161 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ long $expiry;
            final /* synthetic */ String $fingerprint;
            final /* synthetic */ String $reason;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01161(String str, long j, String str2, r02<? super C01161> r02Var) {
                super(2, r02Var);
                this.$fingerprint = str;
                this.$expiry = j;
                this.$reason = str2;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01161 c01161 = new C01161(this.$fingerprint, this.$expiry, this.$reason, r02Var);
                c01161.L$0 = obj;
                return c01161;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01161) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                x27 x27Var = (x27) this.L$0;
                x27Var.g(ShutdownStore.KEY_SHUTDOWN_FINGERPRINT, this.$fingerprint);
                x27Var.g(ShutdownStore.KEY_SHUTDOWN_EXPIRY, new Long(this.$expiry));
                x27Var.g(ShutdownStore.KEY_SHUTDOWN_REASON, this.$reason);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03081(String str, long j, String str2, r02<? super C03081> r02Var) {
            super(2, r02Var);
            this.$fingerprint = str;
            this.$expiry = j;
            this.$reason = str2;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ShutdownStore.this.new C03081(this.$fingerprint, this.$expiry, this.$reason, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03081) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = ShutdownStore.this.dataStore;
                C01161 c01161 = new C01161(this.$fingerprint, this.$expiry, this.$reason, null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01161, this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
    }

    private ShutdownStore(pf2<t78> pf2Var, t72 t72Var) {
        this.dataStore = pf2Var;
        this.scope = t72Var;
    }

    public static final ShutdownStore create(Context context, t72 t72Var) {
        return Companion.create(context, t72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List shutdownDataStore_delegate$lambda$0(Context context) {
        context.getClass();
        return ws0.h(Companion.createSharedPrefsMigration$intercom_sdk_base_release(context));
    }

    public final void clear() {
        oy0.d(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    public final long getShutdownExpiry(long j) {
        try {
            return ((Number) oy0.f(ff3.t, new C03051(j, null))).longValue();
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to read shutdown expiry from DataStore: ")), new Object[0]);
            return j;
        }
    }

    public final String getShutdownFingerprint(String str) {
        str.getClass();
        try {
            return (String) oy0.f(ff3.t, new C03061(str, null));
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to read shutdown fingerprint from DataStore: ")), new Object[0]);
            return str;
        }
    }

    public final String getShutdownReason() {
        try {
            return (String) oy0.f(ff3.t, new C03071(null));
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to read shutdown reason from DataStore: ")), new Object[0]);
            return BuildConfig.FLAVOR;
        }
    }

    public final void save(String str, long j, String str2) {
        str.getClass();
        str2.getClass();
        oy0.d(this.scope, null, null, new C03081(str, j, str2, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        static final /* synthetic */ ho5<Object>[] $$delegatedProperties;

        static {
            oe8 oe8Var = new oe8(Companion.class, "shutdownDataStore", "getShutdownDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
            ll8.a.getClass();
            $$delegatedProperties = new ho5[]{oe8Var};
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private final pf2<t78> getShutdownDataStore(Context context) {
            return (pf2) ShutdownStore.shutdownDataStore$delegate.a(context, $$delegatedProperties[0]);
        }

        public final ShutdownStore create(Context context, t72 t72Var) {
            context.getClass();
            t72Var.getClass();
            return new ShutdownStore(getShutdownDataStore(context), t72Var, null);
        }

        public final ShutdownStore createForTesting$intercom_sdk_base_release(pf2<t78> pf2Var, t72 t72Var) {
            pf2Var.getClass();
            t72Var.getClass();
            return new ShutdownStore(pf2Var, t72Var, null);
        }

        public final ze2<t78> createSharedPrefsMigration$intercom_sdk_base_release(Context context) {
            context.getClass();
            return new ShutdownStore$Companion$createSharedPrefsMigration$1(context);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShutdownStore(pf2 pf2Var, t72 t72Var, qq2 qq2Var) {
        this(pf2Var, t72Var);
    }
}
