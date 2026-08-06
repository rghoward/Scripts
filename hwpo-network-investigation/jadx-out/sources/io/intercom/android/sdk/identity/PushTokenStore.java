package io.intercom.android.sdk.identity;

import android.content.Context;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.a0;
import defpackage.aa0;
import defpackage.cg8;
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
import defpackage.yk2;
import defpackage.ze2;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.CryptoHelper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PushTokenStore {
    private static final String OLD_PREFS_NAME = "INTERCOM_SDK_DATA";
    private static final Twig twig;
    private volatile Boolean cachedSubmitted;
    private volatile String cachedToken;
    private final pf2<t78> dataStore;
    private final t72 scope;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String OLD_PUSH_TOKEN_KEY = "push_token";
    private static final t78.a<String> KEY_PUSH_TOKEN = new t78.a<>(OLD_PUSH_TOKEN_KEY);
    private static final t78.a<Boolean> KEY_DEVICE_TOKEN_SUBMITTED = new t78.a<>("device_token_submitted");
    private static final fi8<Context, pf2<t78>> pushTokenDataStore$delegate = s7.c("intercom_push_token_datastore", null, new cg8(0), 10);

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.PushTokenStore$clear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.PushTokenStore$clear$1", f = "PushTokenStore.kt", l = {116}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.PushTokenStore$clear$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.PushTokenStore$clear$1$1", f = "PushTokenStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01361 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C01361(r02<? super C01361> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01361 c01361 = new C01361(r02Var);
                c01361.L$0 = obj;
                return c01361;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01361) create(x27Var, r02Var)).invokeSuspend(g2b.a);
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
            return PushTokenStore.this.new AnonymousClass1(r02Var);
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
                pf2 pf2Var = PushTokenStore.this.dataStore;
                C01361 c01361 = new C01361(null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01361, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.PushTokenStore$getPushToken$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.PushTokenStore$getPushToken$2", f = "PushTokenStore.kt", l = {49}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super String>, Object> {
        int label;

        public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return PushTokenStore.this.new AnonymousClass2(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super String> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = PushTokenStore.this.dataStore.getData();
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
            String str = (String) ((t78) obj).b(PushTokenStore.KEY_PUSH_TOKEN);
            return str == null ? BuildConfig.FLAVOR : CryptoHelper.INSTANCE.decrypt$intercom_sdk_base_release(str);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.PushTokenStore$isDeviceTokenSubmitted$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.PushTokenStore$isDeviceTokenSubmitted$2", f = "PushTokenStore.kt", l = {67}, m = "invokeSuspend")
    public static final class C03312 extends p6a implements ci4<t72, r02<? super Boolean>, Object> {
        int label;

        public C03312(r02<? super C03312> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return PushTokenStore.this.new C03312(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super Boolean> r02Var) {
            return ((C03312) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = PushTokenStore.this.dataStore.getData();
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
            Boolean bool = (Boolean) ((t78) obj).b(PushTokenStore.KEY_DEVICE_TOKEN_SUBMITTED);
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.PushTokenStore$savePushToken$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.PushTokenStore$savePushToken$1", f = "PushTokenStore.kt", l = {97}, m = "invokeSuspend")
    public static final class C03321 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.PushTokenStore$savePushToken$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.PushTokenStore$savePushToken$1$1", f = "PushTokenStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01371 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ String $token;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01371(String str, r02<? super C01371> r02Var) {
                super(2, r02Var);
                this.$token = str;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01371 c01371 = new C01371(this.$token, r02Var);
                c01371.L$0 = obj;
                return c01371;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01371) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                x27 x27Var = (x27) this.L$0;
                x27Var.g(PushTokenStore.KEY_PUSH_TOKEN, CryptoHelper.INSTANCE.encrypt$intercom_sdk_base_release(this.$token));
                x27Var.g(PushTokenStore.KEY_DEVICE_TOKEN_SUBMITTED, Boolean.FALSE);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03321(String str, r02<? super C03321> r02Var) {
            super(2, r02Var);
            this.$token = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return PushTokenStore.this.new C03321(this.$token, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03321) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = PushTokenStore.this.dataStore;
                C01371 c01371 = new C01371(this.$token, null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01371, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.PushTokenStore$setDeviceTokenSubmitted$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.PushTokenStore$setDeviceTokenSubmitted$1", f = "PushTokenStore.kt", l = {83}, m = "invokeSuspend")
    public static final class C03331 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ boolean $submitted;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.PushTokenStore$setDeviceTokenSubmitted$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.PushTokenStore$setDeviceTokenSubmitted$1$1", f = "PushTokenStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01381 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ boolean $submitted;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01381(boolean z, r02<? super C01381> r02Var) {
                super(2, r02Var);
                this.$submitted = z;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01381 c01381 = new C01381(this.$submitted, r02Var);
                c01381.L$0 = obj;
                return c01381;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01381) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ((x27) this.L$0).g(PushTokenStore.KEY_DEVICE_TOKEN_SUBMITTED, Boolean.valueOf(this.$submitted));
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03331(boolean z, r02<? super C03331> r02Var) {
            super(2, r02Var);
            this.$submitted = z;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return PushTokenStore.this.new C03331(this.$submitted, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03331) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = PushTokenStore.this.dataStore;
                C01381 c01381 = new C01381(this.$submitted, null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01381, this);
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

    private PushTokenStore(pf2<t78> pf2Var, t72 t72Var) {
        this.dataStore = pf2Var;
        this.scope = t72Var;
    }

    public static final PushTokenStore create(Context context, t72 t72Var) {
        return Companion.create(context, t72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List pushTokenDataStore_delegate$lambda$4(Context context) {
        context.getClass();
        return ws0.h(Companion.createSharedPrefsMigration$intercom_sdk_base_release(context));
    }

    public final void clear() {
        this.cachedToken = BuildConfig.FLAVOR;
        this.cachedSubmitted = Boolean.FALSE;
        oy0.d(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    public final String getPushToken() throws Throwable {
        String str = this.cachedToken;
        if (str != null) {
            return str;
        }
        try {
            Object objF = oy0.f(ff3.t, new AnonymousClass2(null));
            this.cachedToken = (String) objF;
            return (String) objF;
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to read push token from DataStore: ")), new Object[0]);
            return BuildConfig.FLAVOR;
        }
    }

    public final boolean hasCachedToken(String str) {
        str.getClass();
        return str.equals(getPushToken());
    }

    public final boolean isDeviceTokenSubmitted() throws Throwable {
        Boolean bool = this.cachedSubmitted;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Object objF = oy0.f(ff3.t, new C03312(null));
            Boolean bool2 = (Boolean) objF;
            bool2.getClass();
            this.cachedSubmitted = bool2;
            return ((Boolean) objF).booleanValue();
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to read device token submitted flag from DataStore: ")), new Object[0]);
            return false;
        }
    }

    public final void savePushToken(String str) {
        str.getClass();
        this.cachedToken = str;
        this.cachedSubmitted = Boolean.FALSE;
        oy0.d(this.scope, null, null, new C03321(str, null), 3);
    }

    public final void setDeviceTokenSubmitted(boolean z) {
        this.cachedSubmitted = Boolean.valueOf(z);
        oy0.d(this.scope, null, null, new C03331(z, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        static final /* synthetic */ ho5<Object>[] $$delegatedProperties;

        static {
            oe8 oe8Var = new oe8(Companion.class, "pushTokenDataStore", "getPushTokenDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
            ll8.a.getClass();
            $$delegatedProperties = new ho5[]{oe8Var};
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private final pf2<t78> getPushTokenDataStore(Context context) {
            return (pf2) PushTokenStore.pushTokenDataStore$delegate.a(context, $$delegatedProperties[0]);
        }

        public final PushTokenStore create(Context context, t72 t72Var) {
            context.getClass();
            t72Var.getClass();
            return new PushTokenStore(getPushTokenDataStore(context), t72Var, null);
        }

        public final PushTokenStore createForTesting$intercom_sdk_base_release(pf2<t78> pf2Var, t72 t72Var) {
            pf2Var.getClass();
            t72Var.getClass();
            return new PushTokenStore(pf2Var, t72Var, null);
        }

        public final ze2<t78> createSharedPrefsMigration$intercom_sdk_base_release(Context context) {
            context.getClass();
            return new PushTokenStore$Companion$createSharedPrefsMigration$1(context);
        }

        private Companion() {
        }
    }

    public /* synthetic */ PushTokenStore(pf2 pf2Var, t72 t72Var, qq2 qq2Var) {
        this(pf2Var, t72Var);
    }
}
