package io.intercom.android.sdk;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.intercom.twig.Twig;
import defpackage.ac4;
import defpackage.gy2;
import defpackage.hf3;
import defpackage.if3;
import defpackage.nl3;
import defpackage.ol3;
import defpackage.qi6;
import defpackage.qq2;
import defpackage.th1;
import defpackage.u;
import defpackage.wg5;
import defpackage.xj5;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback;
import io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper;
import io.intercom.android.sdk.helpcenter.api.SearchRequestCallback;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.UnreadCountTracker;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.m5.push.IntercomPushClientHandler;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.AttributeSanitiser;
import io.intercom.android.sdk.utilities.ValidatorUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Intercom {
    public static final String PUSH_RECEIVER = "intercom_sdk";
    private static Intercom instance;
    private final ActivityFinisher activityFinisher;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final Application context;
    private final IntercomDataLayer dataLayer;
    private final MetricTracker metricTracker;
    private final Provider<NexusClient> nexusClientProvider;
    private final OverlayPresenter overlayPresenter;
    private final ResetManager resetManager;
    private final DeDuper superDeDuper;
    private final Twig twig;
    private final UnreadCountTracker unreadCountTracker;
    private final UserIdentity userIdentity;
    private final Provider<UserUpdater> userUpdater;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Visibility VISIBLE = Visibility.VISIBLE;
    public static final Visibility GONE = Visibility.GONE;
    private static final Twig TWIG = LumberMill.getLogger();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LogLevel {
        public static final int ASSERT = 7;
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int DEBUG = 3;
        public static final int DISABLED = 8;
        public static final int ERROR = 6;
        public static final int INFO = 4;
        public static final int VERBOSE = 2;
        public static final int WARN = 5;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ASSERT = 7;
            public static final int DEBUG = 3;
            public static final int DISABLED = 8;
            public static final int ERROR = 6;
            public static final int INFO = 4;
            public static final int VERBOSE = 2;
            public static final int WARN = 5;

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum Visibility {
        GONE,
        VISIBLE;

        private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

        public static nl3<Visibility> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IntercomPushManager.IntercomPushIntegrationType.values().length];
            try {
                iArr[IntercomPushManager.IntercomPushIntegrationType.FCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IntercomSpace.values().length];
            try {
                iArr2[IntercomSpace.HelpCenter.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[IntercomSpace.Home.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IntercomSpace.Messages.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IntercomSpace.Tickets.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public Intercom(DeDuper deDuper, Provider<Api> provider, Provider<NexusClient> provider2, UnreadCountTracker unreadCountTracker, MetricTracker metricTracker, ErrorReporter errorReporter, Application application, OverlayPresenter overlayPresenter, Provider<AppConfig> provider3, UserIdentity userIdentity, Provider<UserUpdater> provider4, ResetManager resetManager, Twig twig, ActivityFinisher activityFinisher, IntercomDataLayer intercomDataLayer) {
        deDuper.getClass();
        provider.getClass();
        provider2.getClass();
        unreadCountTracker.getClass();
        metricTracker.getClass();
        errorReporter.getClass();
        application.getClass();
        overlayPresenter.getClass();
        provider3.getClass();
        userIdentity.getClass();
        provider4.getClass();
        resetManager.getClass();
        twig.getClass();
        activityFinisher.getClass();
        intercomDataLayer.getClass();
        this.superDeDuper = deDuper;
        this.apiProvider = provider;
        this.nexusClientProvider = provider2;
        this.unreadCountTracker = unreadCountTracker;
        this.metricTracker = metricTracker;
        this.context = application;
        this.overlayPresenter = overlayPresenter;
        this.appConfigProvider = provider3;
        this.userIdentity = userIdentity;
        this.userUpdater = provider4;
        this.resetManager = resetManager;
        this.twig = twig;
        this.activityFinisher = activityFinisher;
        this.dataLayer = intercomDataLayer;
        IntercomPushManager.IntercomPushIntegrationType installedModuleType = IntercomPushManager.getInstalledModuleType();
        if ((installedModuleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[installedModuleType.ordinal()]) == 1) {
            twig.i("Enabling FCM for cloud messaging", new Object[0]);
            IntercomPushClientHandler.Companion.setUpNotificationChannels(application);
            IntercomPushManager.initializeFcmService(application);
        } else {
            twig.internal("No FCM integration detected");
        }
        if (shouldDisableErrorReporting()) {
            errorReporter.disableExceptionHandler();
        } else {
            errorReporter.enableExceptionHandler();
        }
    }

    public static final synchronized Intercom client() {
        return Companion.client();
    }

    public static final synchronized void initialize(Application application, String str, String str2) {
        Companion.initialize(application, str, str2);
    }

    private final void logErrorAndOpenInbox(String str) {
        this.twig.e(str, new Object[0]);
        present(IntercomSpace.Messages);
    }

    private final void logEventWithValidation(String str, Map<String, ?> map) {
        if (str == null || str.length() == 0) {
            this.twig.e("The event name is null or empty. We can't log an event with this string.", new Object[0]);
        } else {
            this.apiProvider.get().logEvent(str, map);
        }
    }

    public static /* synthetic */ void loginIdentifiedUser$default(Intercom intercom, Registration registration, IntercomStatusCallback intercomStatusCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginIdentifiedUser(registration, intercomStatusCallback);
    }

    public static /* synthetic */ void loginUnidentifiedUser$default(Intercom intercom, IntercomStatusCallback intercomStatusCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginUnidentifiedUser(intercomStatusCallback);
    }

    private final boolean noUserRegistered() {
        return !this.userIdentity.identityExists() || this.userIdentity.isSoftReset();
    }

    private final void performUpdate(Map<String, ? extends Object> map, IntercomStatusCallback intercomStatusCallback) {
        if (this.userIdentity.isUnidentified()) {
            AttributeSanitiser.anonymousSanitisation(map);
        }
        if (!this.superDeDuper.shouldUpdateUser(map)) {
            intercomStatusCallback.onSuccess();
            this.twig.internal("dupe", "dropped dupe");
        } else {
            this.superDeDuper.update(map);
            this.userUpdater.get().updateUser(UserUpdateRequest.create(false, this.dataLayer.getHostAppState().getValue().isBackgrounded(), map, false), intercomStatusCallback);
            this.twig.internal("dupe", "updated user");
        }
    }

    public static /* synthetic */ void present$default(Intercom intercom, IntercomSpace intercomSpace, int i, Object obj) {
        if ((i & 1) != 0) {
            intercomSpace = IntercomSpace.Home;
        }
        intercom.present(intercomSpace);
    }

    @gy2
    public static final synchronized void registerForLaterInitialisation(Application application) {
        Companion.registerForLaterInitialisation(application);
    }

    private final void registerNewIdentifiedUser(Registration registration, IntercomStatusCallback intercomStatusCallback) {
        UserUpdateRequest userUpdateRequestCreate;
        this.resetManager.hardReset();
        this.userIdentity.registerIdentifiedUser(registration);
        this.nexusClientProvider.get().disconnect();
        boolean z = !this.dataLayer.getHostAppState().getValue().getSessionStartedSinceLastBackgrounded();
        boolean zIsBackgrounded = this.dataLayer.getHostAppState().getValue().isBackgrounded();
        if (registration.getAttributes() != null) {
            UserAttributes attributes = registration.getAttributes();
            attributes.getClass();
            userUpdateRequestCreate = UserUpdateRequest.create(z, zIsBackgrounded, attributes.toMap(), true);
            userUpdateRequestCreate.getClass();
        } else {
            userUpdateRequestCreate = UserUpdateRequest.create(z, zIsBackgrounded, true);
            userUpdateRequestCreate.getClass();
        }
        this.userUpdater.get().updateUser(userUpdateRequestCreate, intercomStatusCallback);
    }

    public static /* synthetic */ void setAuthTokens$default(Intercom intercom, List list, IntercomStatusCallback intercomStatusCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.setAuthTokens(list, intercomStatusCallback);
    }

    public static final void setLogLevel(@LogLevel int i) {
        Companion.setLogLevel(i);
    }

    private final boolean shouldDisableErrorReporting() {
        return !this.appConfigProvider.get().isCrashReportingEnabled();
    }

    private final void softRegister() {
        this.nexusClientProvider.get().connect(this.appConfigProvider.get().getRealTimeConfig(), true);
        this.userIdentity.softRestart();
        this.resetManager.clear();
        wg5 wg5Var = new wg5(0, this);
        if (xj5.a(Looper.myLooper(), Looper.getMainLooper())) {
            wg5Var.run();
        } else {
            new Handler(Looper.getMainLooper()).post(wg5Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void softRegister$lambda$2(Intercom intercom) {
        intercom.overlayPresenter.refreshStateBecauseUserIdentityIsNotInStoreYet();
    }

    @gy2
    public static final void unregisterForLateInitialisation(Application application) {
        Companion.unregisterForLateInitialisation(application);
    }

    public static /* synthetic */ void updateUser$default(Intercom intercom, UserAttributes userAttributes, IntercomStatusCallback intercomStatusCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.updateUser(userAttributes, intercomStatusCallback);
    }

    public final void addUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        unreadConversationCountListener.getClass();
        UnreadCountTracker.addListener$default(this.unreadCountTracker, unreadConversationCountListener, null, 2, null);
    }

    public final void changeWorkspace(String str, String str2) {
        if (str == null || str2 == null || !ValidatorUtil.isValidAppIdParams(str, str2)) {
            TWIG.e("Workspace has not been changed. Please make sure that you're passing in the correct app ID and API key", new Object[0]);
        } else {
            logout();
            Injector.get().changeWorkspace(str, str2);
        }
    }

    @gy2
    public final void displayArticle(String str) {
        str.getClass();
        this.context.startActivity(IntercomArticleActivity.Companion.buildIntent(this.context, new IntercomArticleActivity.ArticleActivityArguments(str, MetricTracker.Place.API, false, false, 12, null)));
    }

    @gy2
    public final void displayCarousel(String str) {
        Application application = this.context;
        application.startActivity(IntercomCarouselActivity.buildIntent(application, str));
    }

    @gy2
    public final void displayConversationsList() {
        this.metricTracker.openedMessengerConversationList(LauncherOpenBehaviour.LauncherType.CUSTOM);
        IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
    }

    @gy2
    public final void displayHelpCenter() {
        displayHelpCenterCollections(hf3.t);
    }

    @gy2
    public final void displayHelpCenterCollections(List<String> list) {
        Application application = this.context;
        List listW = list != null ? th1.w(list) : null;
        if (listW == null) {
            listW = hf3.t;
        }
        HelpCenterUrlUtilsKt.openCollections(application, listW, MetricTracker.Place.API);
    }

    public final void displayMessageComposer(String str) {
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device. Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
            return;
        }
        if (!this.appConfigProvider.get().isReceivedFromServer()) {
            logErrorAndOpenInbox("It appears your app has not received a successful response from Intercom. Please check if you are using the correct Android app ID and API Key from the Intercom settings.");
            return;
        }
        if (!this.appConfigProvider.get().isInboundMessages()) {
            logErrorAndOpenInbox("It appears your app is not on a plan that allows message composing. As a fallback we are calling present(IntercomSpace.Messages)");
            return;
        }
        this.metricTracker.openedMessengerNewConversation(LauncherOpenBehaviour.LauncherType.CUSTOM);
        Application application = this.context;
        if (str == null) {
            str = com.intercom.twig.BuildConfig.FLAVOR;
        }
        ConversationScreenOpenerKt.openComposer$default(application, str, true, null, null, 24, null);
    }

    @gy2
    public final void displayMessenger() {
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
        } else {
            new LauncherOpenBehaviour().openMessenger(this.context);
        }
    }

    @gy2
    public final void displaySurvey(String str) {
        str.getClass();
        Application application = this.context;
        application.startActivity(IntercomSurveyActivity.Companion.buildIntent(application, str));
    }

    public final void fetchHelpCenterCollection(String str, CollectionContentRequestCallback collectionContentRequestCallback) {
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        str.getClass();
        collectionContentRequestCallback.getClass();
        helpCenterApiWrapper.fetchHelpCenterCollection(metricTracker, str, collectionContentRequestCallback);
    }

    public final void fetchHelpCenterCollections(CollectionRequestCallback collectionRequestCallback) {
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        collectionRequestCallback.getClass();
        helpCenterApiWrapper.fetchHelpCenterCollections(metricTracker, collectionRequestCallback);
    }

    public final Registration fetchLoggedInUserAttributes() {
        UserIdentity userIdentity = this.userIdentity;
        if (!userIdentity.identityExists()) {
            userIdentity = null;
        }
        if (userIdentity == null) {
            return null;
        }
        Registration registration = new Registration();
        String userId = userIdentity.getUserId();
        if (userId != null && userId.length() != 0) {
            registration.withUserId(userIdentity.getUserId());
        }
        String email = userIdentity.getEmail();
        if (email != null && email.length() != 0) {
            registration.withEmail(userIdentity.getEmail());
        }
        String anonymousId = userIdentity.getAnonymousId();
        if (anonymousId != null && anonymousId.length() != 0) {
            registration.withUserId(userIdentity.getAnonymousId());
        }
        return registration;
    }

    public final int getUnreadConversationCount() {
        return this.dataLayer.getUnreadConversationIds().getValue().size();
    }

    public final void hideIntercom() {
        this.activityFinisher.finishActivities();
    }

    public final boolean isUserLoggedIn() {
        return this.userIdentity.identityExists();
    }

    public final void logEvent(String str, Map<String, ?> map) {
        if (map == null) {
            this.twig.i("The metadata provided is null, logging event with no metadata", new Object[0]);
        } else if (map.isEmpty()) {
            this.twig.i("The metadata provided is empty, logging event with no metadata", new Object[0]);
        }
        Map<String, ?> mapL = map != null ? qi6.l(map) : null;
        if (mapL == null) {
            mapL = if3.t;
        }
        logEventWithValidation(str, mapL);
    }

    public final void loginIdentifiedUser(Registration registration, IntercomStatusCallback intercomStatusCallback) {
        Map<String, Object> map;
        registration.getClass();
        intercomStatusCallback.getClass();
        String userId = registration.getUserId();
        userId.getClass();
        if (userId.length() == 0) {
            String email = registration.getEmail();
            email.getClass();
            if (email.length() == 0) {
                this.twig.e("Failed to register user. You need to provide a user identifier, an email address, or both. ", new Object[0]);
                intercomStatusCallback.onFailure(new IntercomError(1007, "Failed to register user. You need to provide unique user identifier, an email address, or both."));
                return;
            }
        }
        if (!this.userIdentity.identityExists()) {
            if (!this.userIdentity.isSoftReset() || !this.userIdentity.softIdentityIsSameUser(registration)) {
                registerNewIdentifiedUser(registration, intercomStatusCallback);
                return;
            } else {
                softRegister();
                intercomStatusCallback.onSuccess();
                return;
            }
        }
        if (!xj5.a(registration.getEmail(), this.userIdentity.getEmail()) || !xj5.a(registration.getUserId(), this.userIdentity.getUserId())) {
            this.twig.i("The user is already registered with a different email or user id", new Object[0]);
            registerNewIdentifiedUser(registration, intercomStatusCallback);
            return;
        }
        boolean zRegistrationHasAttributes = this.userIdentity.registrationHasAttributes(registration);
        Twig twig = this.twig;
        if (!zRegistrationHasAttributes) {
            twig.i("The user is already registered with the same email and user id, skipping API call", new Object[0]);
            intercomStatusCallback.onSuccess();
            return;
        }
        twig.i("We already have a registered user. Updating this user with the attributes provided.", new Object[0]);
        UserAttributes attributes = registration.getAttributes();
        if (attributes == null || (map = attributes.toMap()) == null) {
            map = if3.t;
        }
        performUpdate(map, intercomStatusCallback);
    }

    public final void loginUnidentifiedUser(IntercomStatusCallback intercomStatusCallback) {
        intercomStatusCallback.getClass();
        if (this.userIdentity.isUnidentified()) {
            this.twig.i("The unidentified user is already registered", new Object[0]);
            intercomStatusCallback.onSuccess();
        } else {
            if (this.userIdentity.isIdentified()) {
                this.twig.e("The identified user is already registered", new Object[0]);
                intercomStatusCallback.onFailure(new IntercomError(3002, "Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this. If you are attempting to register an identified user call: registerIdentifiedUser(Registration)"));
                return;
            }
            this.resetManager.hardReset();
            this.userIdentity.registerUnidentifiedUser();
            this.nexusClientProvider.get().disconnect();
            this.userUpdater.get().updateUser(UserUpdateRequest.create(!this.dataLayer.getHostAppState().getValue().getSessionStartedSinceLastBackgrounded(), this.dataLayer.getHostAppState().getValue().isBackgrounded(), true), intercomStatusCallback);
        }
    }

    public final void logout() {
        if (this.userIdentity.isSoftReset()) {
            return;
        }
        this.resetManager.softReset();
    }

    public final void present(IntercomSpace intercomSpace) {
        intercomSpace.getClass();
        if (noUserRegistered()) {
            TWIG.e("Intercom was presented but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).", new Object[0]);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[intercomSpace.ordinal()];
        if (i == 1) {
            HelpCenterUrlUtilsKt.openCollections(this.context, hf3.t, MetricTracker.Place.API);
            return;
        }
        if (i == 2) {
            IntercomRootActivityLauncher.INSTANCE.startHome(this.context);
            return;
        }
        if (i == 3) {
            IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
        } else if (i == 4) {
            IntercomRootActivityLauncher.INSTANCE.startTickets(this.context);
        } else {
            u.b();
        }
    }

    public final void presentContent(IntercomContent intercomContent) {
        intercomContent.getClass();
        if (intercomContent instanceof IntercomContent.Article) {
            Application application = this.context;
            application.startActivity(IntercomArticleActivity.Companion.buildIntent(application, new IntercomArticleActivity.ArticleActivityArguments(((IntercomContent.Article) intercomContent).getId(), MetricTracker.Place.API, false, false, 12, null)));
            return;
        }
        if (intercomContent instanceof IntercomContent.Carousel) {
            Application application2 = this.context;
            application2.startActivity(IntercomCarouselActivity.buildIntent(application2, ((IntercomContent.Carousel) intercomContent).getId()));
            return;
        }
        if (intercomContent instanceof IntercomContent.Survey) {
            Application application3 = this.context;
            application3.startActivity(IntercomSurveyActivity.Companion.buildIntent(application3, ((IntercomContent.Survey) intercomContent).getId()));
        } else {
            if (intercomContent instanceof IntercomContent.HelpCenterCollections) {
                HelpCenterUrlUtilsKt.openCollections(this.context, ((IntercomContent.HelpCenterCollections) intercomContent).getIds(), MetricTracker.Place.API);
                return;
            }
            if (intercomContent instanceof IntercomContent.Conversation) {
                ConversationScreenOpenerKt.openComposer$default(this.context, com.intercom.twig.BuildConfig.FLAVOR, true, null, ((IntercomContent.Conversation) intercomContent).getId(), 8, null);
            } else if (intercomContent instanceof IntercomContent.Ticket) {
                IntercomRootActivityLauncher.INSTANCE.startTicketDetails(this.context, ((IntercomContent.Ticket) intercomContent).getId(), MetricTracker.Context.FROM_PROGRAMMATIC);
            } else {
                u.b();
            }
        }
    }

    @gy2
    public final void registerIdentifiedUser(Registration registration) {
        if (registration == null) {
            this.twig.e("The registration object passed is null. An example successful call is registerIdentifiedUser(Registration.create().withEmail(email));", new Object[0]);
        } else {
            loginIdentifiedUser(registration, IntercomStatusCallbackKt.getNoStatusCallback());
        }
    }

    @gy2
    public final void registerUnidentifiedUser() {
        loginUnidentifiedUser(IntercomStatusCallbackKt.getNoStatusCallback());
    }

    public final void removeUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        if (unreadConversationCountListener != null) {
            this.unreadCountTracker.removeListener(unreadConversationCountListener);
        }
    }

    @gy2
    public final void reset() {
        logout();
    }

    public final void searchHelpCenter(String str, SearchRequestCallback searchRequestCallback) {
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        str.getClass();
        searchRequestCallback.getClass();
        helpCenterApiWrapper.fetchHelpCenterResultsForSearchTerm(metricTracker, str, searchRequestCallback);
    }

    public final void setAuthTokens(List<AuthToken> list, IntercomStatusCallback intercomStatusCallback) {
        list.getClass();
        intercomStatusCallback.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AuthToken authToken = (AuthToken) obj;
            if (authToken.getName().length() > 0 && authToken.getToken().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            this.apiProvider.get().setAuthTokens(arrayList, intercomStatusCallback);
        } else {
            this.twig.e("All auth tokens in the map have empty keys or values.", new Object[0]);
            intercomStatusCallback.onFailure(new IntercomError(3003, "ERROR - Failed to set Auth Tokens. All keys or values passed were empty."));
        }
    }

    public final void setBottomPadding(int i) {
        this.dataLayer.updateBottomPadding(i);
    }

    public final void setInAppMessageVisibility(Visibility visibility) {
        if (visibility != null) {
            this.dataLayer.updateInAppNotificationsVisibility(visibility);
        } else {
            this.twig.i("The visibility provided is null, visibility won't be updated", new Object[0]);
        }
    }

    public final void setLauncherVisibility(Visibility visibility) {
        if (visibility != null) {
            this.dataLayer.updateLauncherVisibility(visibility);
        } else {
            this.twig.i("The visibility provided is null, visibility won't be updated", new Object[0]);
        }
    }

    public final void setThemeMode(ThemeMode themeMode) {
        if (themeMode == null) {
            ThemeManager.INSTANCE.clearSessionOverride();
            this.twig.i("Theme mode cleared, using server-provided theme", new Object[0]);
            return;
        }
        ThemeManager.INSTANCE.setSessionOverride(themeMode);
        this.twig.i("Theme mode set to: " + themeMode + " (session only)", new Object[0]);
    }

    public final void setUserHash(String str) {
        str.getClass();
        if (str.length() == 0) {
            this.twig.w("The user hash you sent us to verify was empty, we will not be able to authenticate your requests without a valid user hash.", new Object[0]);
        } else {
            if (xj5.a(this.userIdentity.getHmac(), str)) {
                this.twig.i("The user hash set matches the existing user identity hash value", new Object[0]);
                return;
            }
            if (this.userIdentity.softUserIdentityHmacDiffers(str)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setUserHash(str);
        }
    }

    public final void setUserJwt(String str) {
        str.getClass();
        if (str.length() == 0) {
            this.twig.w("The JWT you sent us to verify was empty, we will not be able to authenticate your requests without a valid JWT.", new Object[0]);
        } else {
            if (xj5.a(this.userIdentity.getJwt(), str)) {
                this.twig.i("The JWT set matches the existing user identity JWT value", new Object[0]);
                return;
            }
            if (this.userIdentity.softUserIdentityJwtDiffers(str)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setJwt(str);
        }
    }

    @gy2
    public final void updateUser(UserAttributes userAttributes) {
        if (userAttributes == null) {
            LumberMill.getLogger().e("updateUser method failed: the UserAttributes object provided is null", new Object[0]);
        } else {
            updateUser(userAttributes, IntercomStatusCallbackKt.getNoStatusCallback());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private final Intercom create(Application application, String str, String str2) {
            Injector.initWithAppCredentials(application, str, str2);
            Injector injector = Injector.get();
            IntercomDataLayer dataLayer = injector.getDataLayer();
            ThemeManager.INSTANCE.initialize();
            DeDuper deDuper = injector.getDeDuper();
            deDuper.getClass();
            Provider<Api> apiProvider = injector.getApiProvider();
            apiProvider.getClass();
            Provider<NexusClient> nexusClientProvider = injector.getNexusClientProvider();
            nexusClientProvider.getClass();
            dataLayer.getClass();
            UnreadCountTracker unreadCountTracker = new UnreadCountTracker(dataLayer);
            MetricTracker metricTracker = injector.getMetricTracker();
            metricTracker.getClass();
            ErrorReporter errorReporter = injector.getErrorReporter();
            errorReporter.getClass();
            OverlayPresenter overlayPresenter = injector.getOverlayPresenter();
            overlayPresenter.getClass();
            Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
            appConfigProvider.getClass();
            UserIdentity userIdentity = injector.getUserIdentity();
            userIdentity.getClass();
            Provider<UserUpdater> userUpdaterProvider = injector.getUserUpdaterProvider();
            userUpdaterProvider.getClass();
            ResetManager resetManager = injector.getResetManager();
            resetManager.getClass();
            Twig logger = LumberMill.getLogger();
            logger.getClass();
            ActivityFinisher activityFinisher = injector.getActivityFinisher();
            activityFinisher.getClass();
            return new Intercom(deDuper, apiProvider, nexusClientProvider, unreadCountTracker, metricTracker, errorReporter, application, overlayPresenter, appConfigProvider, userIdentity, userUpdaterProvider, resetManager, logger, activityFinisher, dataLayer);
        }

        public final synchronized Intercom client() {
            Intercom intercom;
            intercom = Intercom.instance;
            if (intercom == null) {
                throw new IllegalStateException("Intercom has been initialized incorrectly. Please make sure the first Intercom method you call is initialize() and that you're passing in the correct app ID and API key");
            }
            return intercom;
        }

        public final synchronized void initialize(Application application, String str, String str2) {
            if (Intercom.instance != null) {
                Intercom.TWIG.i("Intercom has already been initialized", new Object[0]);
                return;
            }
            if (application == null || str == null || str2 == null || !ValidatorUtil.isValidConstructorParams(application, str, str2)) {
                Intercom.TWIG.e("Intercom has been initialized incorrectly. Please make sure that you're passing in the correct app ID and API key", new Object[0]);
            } else {
                Intercom.instance = create(application, str, str2);
                LateInitializationPreparer.getInstance().handlePastLifecycleEvents(application, Injector.get());
                Injector.get().initializeIntercomEventsListeners();
            }
        }

        @gy2
        public final synchronized void registerForLaterInitialisation(Application application) {
            if (Intercom.instance != null) {
                Intercom.TWIG.i("Intercom has already been initialized", new Object[0]);
            } else {
                if (application == null) {
                    throw new NullPointerException("Cannot call registerForLaterInitialisation() with a null Application");
                }
                LateInitializationPreparer.getInstance().register(application);
            }
        }

        public final void setLogLevel(@LogLevel int i) {
            LumberMill.setLogLevel(i);
        }

        @gy2
        public final void unregisterForLateInitialisation(Application application) {
            if (application != null) {
                LateInitializationPreparer.getInstance().unregister(application);
            } else {
                ac4.c("Cannot call unregisterForLateInitialisation() with a null Application");
            }
        }

        private Companion() {
        }
    }

    public final void updateUser(UserAttributes userAttributes, IntercomStatusCallback intercomStatusCallback) {
        userAttributes.getClass();
        intercomStatusCallback.getClass();
        Map<String, Object> map = userAttributes.toMap();
        map.getClass();
        performUpdate(map, intercomStatusCallback);
    }

    public final void logEvent(String str) {
        str.getClass();
        logEventWithValidation(str, if3.t);
    }

    public final void displayMessageComposer() {
        displayMessageComposer(com.intercom.twig.BuildConfig.FLAVOR);
    }

    public final void present() {
        present$default(this, null, 1, null);
    }
}
