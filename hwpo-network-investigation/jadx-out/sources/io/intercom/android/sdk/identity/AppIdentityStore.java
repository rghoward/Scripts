package io.intercom.android.sdk.identity;

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
import defpackage.js7;
import defpackage.ll8;
import defpackage.n10;
import defpackage.oe8;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.pf2;
import defpackage.qi6;
import defpackage.qq2;
import defpackage.r02;
import defpackage.s7;
import defpackage.t72;
import defpackage.t78;
import defpackage.v72;
import defpackage.v78;
import defpackage.ws0;
import defpackage.wu0;
import defpackage.x27;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.ze2;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.CryptoHelper;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppIdentityStore {
    private static final t78.a<String> KEY_API_KEY;
    private static final t78.a<String> KEY_APP_ID;
    private static final Map<String, t78.a<String>> MIGRATION_KEY_MAP;
    private static final String OLD_PREFS_NAME = "INTERCOM_SDK_PREFS";
    private static final fi8<Context, pf2<t78>> appDataStore$delegate;
    private static final Twig twig;
    private final pf2<t78> dataStore;
    private final t72 scope;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppIdentityStore$clear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.AppIdentityStore$clear$1", f = "AppIdentityStore.kt", l = {58}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppIdentityStore$clear$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.AppIdentityStore$clear$1$1", f = "AppIdentityStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01331 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C01331(r02<? super C01331> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01331 c01331 = new C01331(r02Var);
                c01331.L$0 = obj;
                return c01331;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01331) create(x27Var, r02Var)).invokeSuspend(g2b.a);
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
            return AppIdentityStore.this.new AnonymousClass1(r02Var);
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
                pf2 pf2Var = AppIdentityStore.this.dataStore;
                C01331 c01331 = new C01331(null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01331, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppIdentityStore$saveAppCredentials$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.AppIdentityStore$saveAppCredentials$1", f = "AppIdentityStore.kt", l = {46}, m = "invokeSuspend")
    public static final class C03301 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ String $apiKey;
        final /* synthetic */ String $appId;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppIdentityStore$saveAppCredentials$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.AppIdentityStore$saveAppCredentials$1$1", f = "AppIdentityStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01341 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ String $apiKey;
            final /* synthetic */ String $appId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01341(String str, String str2, r02<? super C01341> r02Var) {
                super(2, r02Var);
                this.$apiKey = str;
                this.$appId = str2;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01341 c01341 = new C01341(this.$apiKey, this.$appId, r02Var);
                c01341.L$0 = obj;
                return c01341;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01341) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                x27 x27Var = (x27) this.L$0;
                t78.a aVar = AppIdentityStore.KEY_API_KEY;
                CryptoHelper cryptoHelper = CryptoHelper.INSTANCE;
                x27Var.g(aVar, cryptoHelper.encrypt$intercom_sdk_base_release(this.$apiKey));
                x27Var.g(AppIdentityStore.KEY_APP_ID, cryptoHelper.encrypt$intercom_sdk_base_release(this.$appId));
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03301(String str, String str2, r02<? super C03301> r02Var) {
            super(2, r02Var);
            this.$apiKey = str;
            this.$appId = str2;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AppIdentityStore.this.new C03301(this.$apiKey, this.$appId, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03301) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = AppIdentityStore.this.dataStore;
                C01341 c01341 = new C01341(this.$apiKey, this.$appId, null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01341, this);
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
        t78.a<String> aVar = new t78.a<>("api_key");
        KEY_API_KEY = aVar;
        t78.a<String> aVar2 = new t78.a<>("app_id");
        KEY_APP_ID = aVar2;
        MIGRATION_KEY_MAP = qi6.i(new js7("ApiKey", aVar), new js7("AppId", aVar2));
        appDataStore$delegate = s7.c("intercom_app_prefs_datastore", null, new n10(0), 10);
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
    }

    private AppIdentityStore(pf2<t78> pf2Var, t72 t72Var) {
        this.dataStore = pf2Var;
        this.scope = t72Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List appDataStore_delegate$lambda$0(Context context) {
        context.getClass();
        return ws0.h(Companion.createSharedPrefsMigration$intercom_sdk_base_release(context));
    }

    public static final AppIdentityStore create(Context context, t72 t72Var) {
        return Companion.create(context, t72Var);
    }

    public static final AppCredentials loadCachedCredentials(Context context) {
        return Companion.loadCachedCredentials(context);
    }

    public final void clear() {
        oy0.d(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    public final void saveAppCredentials(String str, String str2) {
        str.getClass();
        str2.getClass();
        oy0.d(this.scope, null, null, new C03301(str, str2, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        static final /* synthetic */ ho5<Object>[] $$delegatedProperties;

        static {
            oe8 oe8Var = new oe8(Companion.class, "appDataStore", "getAppDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
            ll8.a.getClass();
            $$delegatedProperties = new ho5[]{oe8Var};
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String decryptField(t78 t78Var, t78.a<String> aVar) {
            String str = (String) t78Var.b(aVar);
            return str == null ? BuildConfig.FLAVOR : CryptoHelper.INSTANCE.decrypt$intercom_sdk_base_release(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final pf2<t78> getAppDataStore(Context context) {
            return (pf2) AppIdentityStore.appDataStore$delegate.a(context, $$delegatedProperties[0]);
        }

        public final AppIdentityStore create(Context context, t72 t72Var) {
            context.getClass();
            t72Var.getClass();
            return new AppIdentityStore(getAppDataStore(context), t72Var, null);
        }

        public final AppIdentityStore createForTesting$intercom_sdk_base_release(pf2<t78> pf2Var, t72 t72Var) {
            pf2Var.getClass();
            t72Var.getClass();
            return new AppIdentityStore(pf2Var, t72Var, null);
        }

        public final ze2<t78> createSharedPrefsMigration$intercom_sdk_base_release(Context context) {
            context.getClass();
            return new AppIdentityStore$Companion$createSharedPrefsMigration$1(context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final AppCredentials loadCachedCredentials(Context context) {
            context.getClass();
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            try {
                return (AppCredentials) oy0.f(ff3.t, new AppIdentityStore$Companion$loadCachedCredentials$1(context, null));
            } catch (Exception e) {
                AppIdentityStore.twig.w(a0.a(e, new StringBuilder("Failed to load cached credentials from DataStore, returning defaults: ")), new Object[0]);
                return new AppCredentials(str, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppIdentityStore(pf2 pf2Var, t72 t72Var, qq2 qq2Var) {
        this(pf2Var, t72Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AppCredentials {
        public static final int $stable = 0;
        private final String apiKey;
        private final String appId;

        public /* synthetic */ AppCredentials(String str, String str2, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2);
        }

        public static /* synthetic */ AppCredentials copy$default(AppCredentials appCredentials, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = appCredentials.apiKey;
            }
            if ((i & 2) != 0) {
                str2 = appCredentials.appId;
            }
            return appCredentials.copy(str, str2);
        }

        public final String component1() {
            return this.apiKey;
        }

        public final String component2() {
            return this.appId;
        }

        public final AppCredentials copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new AppCredentials(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppCredentials)) {
                return false;
            }
            AppCredentials appCredentials = (AppCredentials) obj;
            return xj5.a(this.apiKey, appCredentials.apiKey) && xj5.a(this.appId, appCredentials.appId);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getAppId() {
            return this.appId;
        }

        public int hashCode() {
            return this.appId.hashCode() + (this.apiKey.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AppCredentials(apiKey=");
            sb.append(this.apiKey);
            sb.append(", appId=");
            return wu0.a(sb, this.appId, ')');
        }

        public AppCredentials(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.apiKey = str;
            this.appId = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AppCredentials() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
