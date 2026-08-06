package io.intercom.android.sdk;

import android.app.Application;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import defpackage.a10;
import defpackage.aa0;
import defpackage.b10;
import defpackage.c10;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.e10;
import defpackage.et2;
import defpackage.f10;
import defpackage.g2b;
import defpackage.i23;
import defpackage.j10;
import defpackage.k10;
import defpackage.lg7;
import defpackage.m10;
import defpackage.mh4;
import defpackage.mv8;
import defpackage.o7a;
import defpackage.od3;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.qq2;
import defpackage.r02;
import defpackage.ss5;
import defpackage.t72;
import defpackage.u72;
import defpackage.v72;
import defpackage.w00;
import defpackage.wr2;
import defpackage.xm2;
import defpackage.y00;
import defpackage.z00;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AppIdentityInjector;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.ShutdownStore;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.api.TaggingSocketFactory;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.AppIdentityStore;
import io.intercom.android.sdk.identity.DeviceIdentityStore;
import io.intercom.android.sdk.identity.PushTokenStore;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.utilities.AblyClientUtilsKt;
import io.intercom.android.sdk.utilities.NexusClientUtilsKt;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppIdentityInjector {
    private static final int NEXUS_TRAFFIC_TAG = 63987;
    private final ss5 ablyManager$delegate;
    private final ss5 api$delegate;
    private final ss5 appIdentity$delegate;
    private final t72 appIdentityScope;
    private final ss5 configurableHttpClient$delegate;
    private final ss5 externalUploadApi$delegate;
    private final ss5 gsonWithAdapters$delegate;
    private final ss5 helpCenterApi$delegate;
    private final ss5 hostname$delegate;
    private final ss5 httpClientWithoutHeaders$delegate;
    private final ss5 kotlinXRetrofit$delegate;
    private final ss5 legacyRetrofit$delegate;
    private final ss5 messengerApi$delegate;
    private final ss5 nexusClient$delegate;
    private final long nexusDebouncePeriod;
    private final oh4<Throwable, g2b> onClientError;
    private final ss5 retrofitWithoutHeaders$delegate;
    private final ss5 surveyApi$delegate;
    private final ss5 ticketApi$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.AppIdentityInjector$initializeEvents$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.AppIdentityInjector$initializeEvents$1", f = "AppIdentityInjector.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AppIdentityInjector.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            AppIdentityInjector.this.getLegacyRetrofit();
            AppIdentityInjector.this.getKotlinXRetrofit();
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.AppIdentityInjector$initializeEvents$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.AppIdentityInjector$initializeEvents$2", f = "AppIdentityInjector.kt", l = {52}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AppIdentityInjector.this.new AnonymousClass2(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                IntercomDataLayer dataLayer = AppIdentityInjector.this.getInjector().getDataLayer();
                dataLayer.getClass();
                NexusClient nexusClient = AppIdentityInjector.this.getNexusClient();
                nexusClient.getClass();
                this.label = 1;
                Object objHandleNexusClientLifecycle = NexusClientUtilsKt.handleNexusClientLifecycle(dataLayer, (NexusWrapper) nexusClient, this);
                v72 v72Var = v72.t;
                if (objHandleNexusClientLifecycle == v72Var) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.AppIdentityInjector$initializeEvents$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.AppIdentityInjector$initializeEvents$3", f = "AppIdentityInjector.kt", l = {55}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass3(r02<? super AnonymousClass3> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AppIdentityInjector.this.new AnonymousClass3(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                IntercomDataLayer dataLayer = AppIdentityInjector.this.getInjector().getDataLayer();
                dataLayer.getClass();
                AblyManager ablyManager = AppIdentityInjector.this.getAblyManager();
                this.label = 1;
                Object objHandleAblyLifecycle = AblyClientUtilsKt.handleAblyLifecycle(dataLayer, ablyManager, this);
                v72 v72Var = v72.t;
                if (objHandleAblyLifecycle == v72Var) {
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

    public AppIdentityInjector(final Application application, String str, String str2, final String str3, AppIdentityStore appIdentityStore) {
        application.getClass();
        str.getClass();
        str2.getClass();
        appIdentityStore.getClass();
        appIdentityStore.saveAppCredentials(str, str2);
        this.appIdentityScope = u72.a(od3.b());
        int i = 0;
        this.appIdentity$delegate = new o7a(new w00(i, str, str2));
        this.configurableHttpClient$delegate = new o7a(new mh4() { // from class: l10
            @Override // defpackage.mh4
            public final Object invoke() {
                return AppIdentityInjector.configurableHttpClient_delegate$lambda$1(application, this);
            }
        });
        this.httpClientWithoutHeaders$delegate = new o7a(new m10(i, application));
        this.hostname$delegate = new o7a(new mh4() { // from class: x00
            @Override // defpackage.mh4
            public final Object invoke() {
                return AppIdentityInjector.hostname_delegate$lambda$3(str3, this, application);
            }
        });
        this.gsonWithAdapters$delegate = new o7a(new y00(i));
        this.onClientError = new z00(i, this);
        this.kotlinXRetrofit$delegate = new o7a(new a10(i, this));
        this.legacyRetrofit$delegate = new o7a(new b10(i, this));
        this.retrofitWithoutHeaders$delegate = new o7a(new c10(i, this));
        this.api$delegate = new o7a(new mh4() { // from class: d10
            @Override // defpackage.mh4
            public final Object invoke() {
                return AppIdentityInjector.api_delegate$lambda$9(application, this);
            }
        });
        this.helpCenterApi$delegate = new o7a(new e10(i, this));
        this.surveyApi$delegate = new o7a(new f10(i, this));
        this.ticketApi$delegate = new o7a(new mh4() { // from class: g10
            @Override // defpackage.mh4
            public final Object invoke() {
                return AppIdentityInjector.ticketApi_delegate$lambda$12(this.t);
            }
        });
        this.externalUploadApi$delegate = new o7a(new mh4() { // from class: h10
            @Override // defpackage.mh4
            public final Object invoke() {
                return AppIdentityInjector.externalUploadApi_delegate$lambda$13(this.t);
            }
        });
        this.messengerApi$delegate = new o7a(new mh4() { // from class: i10
            @Override // defpackage.mh4
            public final Object invoke() {
                return AppIdentityInjector.messengerApi_delegate$lambda$14(this.t);
            }
        });
        this.nexusClient$delegate = new o7a(new j10(i, this));
        this.ablyManager$delegate = new o7a(new k10(i, this));
        this.nexusDebouncePeriod = 1000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AblyManager ablyManager_delegate$lambda$16(AppIdentityInjector appIdentityInjector) {
        Twig ablyTwig = LumberMill.getAblyTwig();
        ablyTwig.getClass();
        return new AblyManager(ablyTwig, appIdentityInjector.getMessengerApi());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Api api_delegate$lambda$9(Application application, AppIdentityInjector appIdentityInjector) {
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        AppIdentity appIdentity = appIdentityInjector.getAppIdentity();
        UserIdentity userIdentity = appIdentityInjector.getInjector().getUserIdentity();
        userIdentity.getClass();
        Provider<AppConfig> appConfigProvider = appIdentityInjector.getInjector().getAppConfigProvider();
        appConfigProvider.getClass();
        OpsMetricTracker opsMetricTracker = appIdentityInjector.getInjector().getOpsMetricTracker();
        opsMetricTracker.getClass();
        IntercomDataLayer dataLayer = appIdentityInjector.getInjector().getDataLayer();
        dataLayer.getClass();
        UnreadConversationsTracker unreadConversationsTracker = appIdentityInjector.getInjector().getUnreadConversationsTracker();
        unreadConversationsTracker.getClass();
        lg7 configurableHttpClient = appIdentityInjector.getConfigurableHttpClient();
        MessengerApi messengerApi = appIdentityInjector.getMessengerApi();
        DeviceIdentityStore deviceIdentityStore = appIdentityInjector.getInjector().getDeviceIdentityStore();
        deviceIdentityStore.getClass();
        PushTokenStore pushTokenStore = appIdentityInjector.getInjector().getPushTokenStore();
        pushTokenStore.getClass();
        Api apiCreateApi = apiFactory.createApi(application, appIdentity, userIdentity, appConfigProvider, opsMetricTracker, dataLayer, unreadConversationsTracker, configurableHttpClient, messengerApi, deviceIdentityStore, pushTokenStore);
        apiCreateApi.updateMaxRequests();
        return apiCreateApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lg7 configurableHttpClient_delegate$lambda$1(Application application, AppIdentityInjector appIdentityInjector) {
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        AppIdentity appIdentity = appIdentityInjector.getAppIdentity();
        UserIdentity userIdentity = appIdentityInjector.getInjector().getUserIdentity();
        userIdentity.getClass();
        ShutdownStore shutdownStore = appIdentityInjector.getInjector().getShutdownStore();
        shutdownStore.getClass();
        return apiFactory.createConfigurableHttpClient(application, appIdentity, userIdentity, shutdownStore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExternalUploadApi externalUploadApi_delegate$lambda$13(AppIdentityInjector appIdentityInjector) {
        return ApiFactory.INSTANCE.getUploadApi(appIdentityInjector.getRetrofitWithoutHeaders());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Injector getInjector() {
        Injector injector = Injector.get();
        injector.getClass();
        return injector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gsonWithAdapters_delegate$lambda$4() {
        return ApiFactory.INSTANCE.createGsonWithAdapters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HelpCenterApi helpCenterApi_delegate$lambda$10(AppIdentityInjector appIdentityInjector) {
        return ApiFactory.INSTANCE.createHelpCenterApi(appIdentityInjector.getKotlinXRetrofit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hostname_delegate$lambda$3(String str, AppIdentityInjector appIdentityInjector, Application application) {
        return str == null ? ApiFactory.INSTANCE.getServerUrl(appIdentityInjector.getAppIdentity(), application) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lg7 httpClientWithoutHeaders_delegate$lambda$2(Application application) {
        return ApiFactory.INSTANCE.createHttpClientWithoutHeaders(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mv8 kotlinXRetrofit_delegate$lambda$6(AppIdentityInjector appIdentityInjector) {
        return ApiFactory.INSTANCE.createKotlinXRetrofit(appIdentityInjector.getHostname(), appIdentityInjector.getConfigurableHttpClient(), appIdentityInjector.onClientError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mv8 legacyRetrofit_delegate$lambda$7(AppIdentityInjector appIdentityInjector) {
        return ApiFactory.INSTANCE.createLegacyRetrofit(appIdentityInjector.getHostname(), appIdentityInjector.getConfigurableHttpClient(), appIdentityInjector.getGsonWithAdapters(), appIdentityInjector.onClientError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessengerApi messengerApi_delegate$lambda$14(AppIdentityInjector appIdentityInjector) {
        return ApiFactory.INSTANCE.createMessengerApi(appIdentityInjector.getLegacyRetrofit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NexusWrapper nexusClient_delegate$lambda$15(AppIdentityInjector appIdentityInjector) {
        lg7.a aVarDefaultOkHttpClientBuilder = NexusClient.defaultOkHttpClientBuilder();
        aVarDefaultOkHttpClientBuilder.c(new TaggingSocketFactory(SocketFactory.getDefault(), NEXUS_TRAFFIC_TAG));
        lg7 lg7Var = new lg7(aVarDefaultOkHttpClientBuilder);
        Twig nexusTwig = LumberMill.getNexusTwig();
        nexusTwig.getClass();
        Api api = appIdentityInjector.getApi();
        long j = appIdentityInjector.nexusDebouncePeriod;
        IntercomDataLayer dataLayer = appIdentityInjector.getInjector().getDataLayer();
        dataLayer.getClass();
        return new NexusWrapper(nexusTwig, lg7Var, api, j, dataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b onClientError$lambda$5(AppIdentityInjector appIdentityInjector, Throwable th) {
        th.getClass();
        if (appIdentityInjector.getInjector().getAppConfigProvider().get().isCrashReportingEnabled()) {
            appIdentityInjector.getInjector().getErrorReporter().reportHandledException(th);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mv8 retrofitWithoutHeaders_delegate$lambda$8(AppIdentityInjector appIdentityInjector) {
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        String hostname = appIdentityInjector.getHostname();
        lg7 httpClientWithoutHeaders = appIdentityInjector.getHttpClientWithoutHeaders();
        Gson gson = appIdentityInjector.getInjector().getGson();
        gson.getClass();
        return apiFactory.createLegacyRetrofit(hostname, httpClientWithoutHeaders, gson, appIdentityInjector.onClientError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyApi surveyApi_delegate$lambda$11(AppIdentityInjector appIdentityInjector) {
        return ApiFactory.INSTANCE.createSurveyApi(appIdentityInjector.getLegacyRetrofit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TicketApi ticketApi_delegate$lambda$12(AppIdentityInjector appIdentityInjector) {
        return ApiFactory.INSTANCE.createTicketApi(appIdentityInjector.getLegacyRetrofit());
    }

    public final void destroy() {
        u72.c(this.appIdentityScope, null);
    }

    public final AblyManager getAblyManager() {
        return (AblyManager) this.ablyManager$delegate.getValue();
    }

    public final Api getApi() {
        return (Api) this.api$delegate.getValue();
    }

    public final AppIdentity getAppIdentity() {
        Object value = this.appIdentity$delegate.getValue();
        value.getClass();
        return (AppIdentity) value;
    }

    public final lg7 getConfigurableHttpClient() {
        return (lg7) this.configurableHttpClient$delegate.getValue();
    }

    public final ExternalUploadApi getExternalUploadApi() {
        return (ExternalUploadApi) this.externalUploadApi$delegate.getValue();
    }

    public final Gson getGsonWithAdapters() {
        return (Gson) this.gsonWithAdapters$delegate.getValue();
    }

    public final HelpCenterApi getHelpCenterApi() {
        return (HelpCenterApi) this.helpCenterApi$delegate.getValue();
    }

    public final String getHostname() {
        return (String) this.hostname$delegate.getValue();
    }

    public final lg7 getHttpClientWithoutHeaders() {
        return (lg7) this.httpClientWithoutHeaders$delegate.getValue();
    }

    public final mv8 getKotlinXRetrofit() {
        return (mv8) this.kotlinXRetrofit$delegate.getValue();
    }

    public final mv8 getLegacyRetrofit() {
        return (mv8) this.legacyRetrofit$delegate.getValue();
    }

    public final MessengerApi getMessengerApi() {
        return (MessengerApi) this.messengerApi$delegate.getValue();
    }

    public final NexusClient getNexusClient() {
        return (NexusClient) this.nexusClient$delegate.getValue();
    }

    public final mv8 getRetrofitWithoutHeaders() {
        return (mv8) this.retrofitWithoutHeaders$delegate.getValue();
    }

    public final SurveyApi getSurveyApi() {
        return (SurveyApi) this.surveyApi$delegate.getValue();
    }

    public final TicketApi getTicketApi() {
        return (TicketApi) this.ticketApi$delegate.getValue();
    }

    public final void initializeEvents() {
        t72 t72Var = this.appIdentityScope;
        et2 et2Var = i23.a;
        oy0.d(t72Var, wr2.v, null, new AnonymousClass1(null), 2);
        oy0.d(this.appIdentityScope, null, null, new AnonymousClass2(null), 3);
        oy0.d(this.appIdentityScope, null, null, new AnonymousClass3(null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppIdentityInjector(Application application, String str, String str2, String str3, AppIdentityStore appIdentityStore, int i, qq2 qq2Var) {
        this(application, str, str2, (i & 8) != 0 ? null : str3, appIdentityStore);
    }
}
