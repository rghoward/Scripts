package io.intercom.android.sdk;

import android.app.Application;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import defpackage.k5a;
import defpackage.o02;
import defpackage.t72;
import defpackage.u72;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.DeDuperStore;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.ShutdownStore;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.exceptions.IntercomIntegrationException;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppConfigStore;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.AppIdentityStore;
import io.intercom.android.sdk.identity.DeviceIdentityStore;
import io.intercom.android.sdk.identity.PushTokenStore;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.identity.UserIdentityStore;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.user.UserUpdaterHelper;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.FirstMessageUtilsKt;
import io.intercom.android.sdk.utilities.SystemSettings;
import io.intercom.android.sdk.utilities.UuidStringProvider;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Injector {
    private static final Twig TWIG = LumberMill.getLogger();
    private static Injector instance;
    private final AppConfigStore appConfigStore;
    private AppIdentityInjector appIdentityInjector;
    private final AppIdentityStore appIdentityStore;
    private final Application application;
    private final t72 applicationScope;
    private IntercomDataLayer dataLayer;
    private final DeDuperStore deDuperStore;
    private final DeviceIdentityStore deviceIdentityStore;
    private ErrorReporter errorReporter;
    private Gson gson;
    private LifecycleTracker lifecycleTracker;
    private MetricTracker metricTracker;
    private MetricsStore metricsStore;
    private OpsMetricTracker opsMetricTracker;
    private OverlayPresenter overlayPresenter;
    private final PushTokenStore pushTokenStore;
    private ResetManager resetManager;
    private final ShutdownStore shutdownStore;
    private DeDuper superDeDuper;
    private UnreadConversationsTracker unreadConversationsTracker;
    private final UserIdentity userIdentity;
    private UserUpdater userUpdater;
    private UserUpdaterHelper userUpdaterHelper;
    private final ActivityFinisher activityFinisher = new ActivityFinisher();
    private final Provider<AppConfig> appConfigProvider = new Provider<AppConfig>() { // from class: io.intercom.android.sdk.Injector.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.intercom.android.sdk.Provider
        public AppConfig get() {
            return Injector.this.dataLayer.getConfig().getValue();
        }
    };
    private final Provider<NexusClient> nexusClientProvider = new Provider() { // from class: kc5
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return this.a.getNexusClient();
        }
    };
    private final Provider<UserUpdater> userUpdaterProvider = new Provider() { // from class: lc5
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return this.a.getUserUpdater();
        }
    };
    private final Provider<Api> apiProvider = new Provider() { // from class: mc5
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return this.a.getApi();
        }
    };
    private final Provider<UserIdentity> userIdentityProvider = new Provider() { // from class: nc5
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return this.a.getUserIdentity();
        }
    };
    private final Provider<MetricTracker> metricTrackerProvider = new Provider() { // from class: oc5
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return this.a.getMetricTracker();
        }
    };

    public Injector(Application application, String str, String str2, String str3) {
        this.application = application;
        o02 o02VarA = u72.a(new k5a(null));
        this.applicationScope = o02VarA;
        this.userIdentity = new UserIdentity(UserIdentityStore.create(application, o02VarA));
        AppIdentityStore appIdentityStoreCreate = AppIdentityStore.create(application, o02VarA);
        this.appIdentityStore = appIdentityStoreCreate;
        this.appConfigStore = AppConfigStore.create(application, o02VarA);
        this.deviceIdentityStore = DeviceIdentityStore.create(application);
        this.pushTokenStore = PushTokenStore.create(application, o02VarA);
        this.shutdownStore = ShutdownStore.create(application, o02VarA);
        this.deDuperStore = DeDuperStore.create(application, o02VarA);
        this.appIdentityInjector = new AppIdentityInjector(application, str, str2, str3, appIdentityStoreCreate);
    }

    public static synchronized Injector get() {
        Injector injector;
        injector = instance;
        if (injector == null) {
            throw new IntercomIntegrationException("Intercom was not initialized correctly, Intercom.initialize() needs to be called in onCreate() in your Application class.");
        }
        return injector;
    }

    public static synchronized void initIfCachedCredentials(Application application) {
        if (instance != null) {
            return;
        }
        AppIdentityStore.AppCredentials appCredentialsLoadCachedCredentials = AppIdentityStore.loadCachedCredentials(application);
        String apiKey = appCredentialsLoadCachedCredentials.getApiKey();
        String appId = appCredentialsLoadCachedCredentials.getAppId();
        if (!appId.isEmpty() && !apiKey.isEmpty()) {
            initWithAppCredentials(application, apiKey, appId);
        }
    }

    public static synchronized void initWithAppCredentials(Application application, String str, String str2) {
        if (instance != null) {
            return;
        }
        TWIG.internal("Injector", "Initializing");
        Injector injector = new Injector(application, str, str2, null);
        instance = injector;
        application.registerActivityLifecycleCallbacks(injector.getLifecycleTracker());
    }

    public static synchronized boolean isNotInitialised() {
        return instance == null;
    }

    public static void setSharedInstance(Injector injector) {
        instance = injector;
    }

    public synchronized void changeWorkspace(String str, String str2) {
        TWIG.internal("Injector", "Switching workspace");
        getResetManager().hardReset();
        this.appIdentityInjector.destroy();
        AppIdentityInjector appIdentityInjector = new AppIdentityInjector(getApplication(), str, str2, null, this.appIdentityStore);
        this.appIdentityInjector = appIdentityInjector;
        appIdentityInjector.initializeEvents();
    }

    public AblyManager getAblyManager() {
        return this.appIdentityInjector.getAblyManager();
    }

    public ActivityFinisher getActivityFinisher() {
        return this.activityFinisher;
    }

    public Api getApi() {
        return this.appIdentityInjector.getApi();
    }

    public Provider<Api> getApiProvider() {
        return this.apiProvider;
    }

    public Provider<AppConfig> getAppConfigProvider() {
        return this.appConfigProvider;
    }

    public AppIdentity getAppIdentity() {
        return this.appIdentityInjector.getAppIdentity();
    }

    public Application getApplication() {
        return this.application;
    }

    public synchronized IntercomDataLayer getDataLayer() {
        try {
            if (this.dataLayer == null) {
                this.dataLayer = new IntercomDataLayer(this.appConfigStore, this.applicationScope);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.dataLayer;
    }

    public synchronized DeDuper getDeDuper() {
        try {
            if (this.superDeDuper == null) {
                DeDuper deDuper = new DeDuper(this.appConfigProvider, this.deDuperStore);
                this.superDeDuper = deDuper;
                deDuper.readPersistedCachedAttributes();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.superDeDuper;
    }

    public DeviceIdentityStore getDeviceIdentityStore() {
        return this.deviceIdentityStore;
    }

    public synchronized ErrorReporter getErrorReporter() {
        try {
            if (this.errorReporter == null) {
                this.errorReporter = ErrorReporter.create(this.application, getGson(), this.apiProvider, getDataLayer());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.errorReporter;
    }

    public ExternalUploadApi getExternalUploadApi() {
        return this.appIdentityInjector.getExternalUploadApi();
    }

    public synchronized Gson getGson() {
        try {
            if (this.gson == null) {
                this.gson = new Gson();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.gson;
    }

    public HelpCenterApi getHelpCenterApi() {
        return this.appIdentityInjector.getHelpCenterApi();
    }

    public synchronized LifecycleTracker getLifecycleTracker() {
        try {
            if (this.lifecycleTracker == null) {
                this.lifecycleTracker = LifecycleTracker.create(getMetricsStore(), getErrorReporter(), getDeDuper(), getTimeProvider(), getResetManager(), SystemSettings.getTransitionScale(this.application), getApiProvider(), getDataLayer(), getUserUpdaterHelper());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.lifecycleTracker;
    }

    public MessengerApi getMessengerApi() {
        return this.appIdentityInjector.getMessengerApi();
    }

    public synchronized MetricTracker getMetricTracker() {
        try {
            if (this.metricTracker == null) {
                this.metricTracker = new MetricTracker(this.userIdentity, getMetricsStore(), getApplication());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.metricTracker;
    }

    public synchronized MetricsStore getMetricsStore() {
        try {
            if (this.metricsStore == null) {
                this.metricsStore = new MetricsStore(getApplication(), getApiProvider(), this.appConfigProvider);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.metricsStore;
    }

    public NexusClient getNexusClient() {
        return this.appIdentityInjector.getNexusClient();
    }

    public Provider<NexusClient> getNexusClientProvider() {
        return this.nexusClientProvider;
    }

    public synchronized OpsMetricTracker getOpsMetricTracker() {
        try {
            if (this.opsMetricTracker == null) {
                this.opsMetricTracker = new OpsMetricTracker(getMetricsStore(), getTimeProvider(), UuidStringProvider.SYSTEM);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.opsMetricTracker;
    }

    public synchronized OverlayPresenter getOverlayPresenter() {
        try {
            if (this.overlayPresenter == null) {
                this.overlayPresenter = new OverlayPresenter(getApplication(), this.appConfigProvider, getMetricTracker(), this.userIdentity, getDataLayer(), getApiProvider());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.overlayPresenter;
    }

    public PushTokenStore getPushTokenStore() {
        return this.pushTokenStore;
    }

    public synchronized ResetManager getResetManager() {
        try {
            if (this.resetManager == null) {
                this.resetManager = new ResetManager(getApiProvider(), getUserIdentity(), getOverlayPresenter(), this.appConfigProvider, this.application, this.activityFinisher, getDataLayer(), getUnreadConversationsTracker(), this.pushTokenStore);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.resetManager;
    }

    public ShutdownStore getShutdownStore() {
        return this.shutdownStore;
    }

    public SurveyApi getSurveyApi() {
        return this.appIdentityInjector.getSurveyApi();
    }

    public TicketApi getTicketApi() {
        return this.appIdentityInjector.getTicketApi();
    }

    public TimeProvider getTimeProvider() {
        return TimeProvider.SYSTEM;
    }

    public synchronized UnreadConversationsTracker getUnreadConversationsTracker() {
        try {
            if (this.unreadConversationsTracker == null) {
                this.unreadConversationsTracker = new UnreadConversationsTracker(this.metricTrackerProvider);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.unreadConversationsTracker;
    }

    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    public synchronized UserUpdater getUserUpdater() {
        try {
            if (this.userUpdater == null) {
                this.userUpdater = new UserUpdater(getApiProvider(), getOpsMetricTracker(), getDataLayer());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.userUpdater;
    }

    public synchronized UserUpdaterHelper getUserUpdaterHelper() {
        try {
            if (this.userUpdaterHelper == null) {
                this.userUpdaterHelper = new UserUpdaterHelper(this.userUpdaterProvider, getDataLayer(), this.userIdentityProvider);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.userUpdaterHelper;
    }

    public Provider<UserUpdater> getUserUpdaterProvider() {
        return this.userUpdaterProvider;
    }

    public void initializeIntercomEventsListeners() {
        FirstMessageUtilsKt.handleFirstMessageToast(this.applicationScope, LumberMill.getLogger(), this.application, getDataLayer());
        this.appIdentityInjector.initializeEvents();
    }
}
