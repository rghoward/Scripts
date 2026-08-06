package io.intercom.android.sdk.m5.data;

import android.app.Activity;
import com.intercom.twig.BuildConfig;
import defpackage.a0a;
import defpackage.aa0;
import defpackage.am9;
import defpackage.b0a;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.eo7;
import defpackage.f37;
import defpackage.fl;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.i37;
import defpackage.of3;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.th1;
import defpackage.ty1;
import defpackage.v72;
import defpackage.wx7;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.zl9;
import defpackage.zz9;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppConfigKt;
import io.intercom.android.sdk.identity.AppConfigStore;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.models.AppLifecycleState;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.CustomizationModel;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ActivityUtils;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomDataLayer {
    private static final int DEFAULT_COLOR = -15758352;
    private final i37<AppConfig> _config;
    private final i37<List<Conversation>> _conversations;
    private final f37<IntercomEvent> _event;
    private final i37<HostAppState> _hostAppState;
    private final i37<OverlayState> _overlayState;
    private final i37<Boolean> _pushNotificationsBannerDismissed;
    private final i37<SurveyData> _surveyData;
    private final i37<TeamPresence> _teamPresence;
    private final i37<Ticket> _ticket;
    private final i37<Set<String>> _unreadConversationIds;
    private final AppConfigStore appConfigStore;
    private final t72 applicationScope;
    private final zz9<AppConfig> config;
    private final zz9<List<Conversation>> conversations;
    private final zl9<IntercomEvent> event;
    private List<? extends HomeCards> homeCards;
    private final zz9<HostAppState> hostAppState;
    private OpenMessengerResponse openResponse;
    private final zz9<OverlayState> overlayState;
    private final zz9<Boolean> pushNotificationsBannerDismissed;
    private final zz9<SurveyData> surveyData;
    private final zz9<TeamPresence> teamPresence;
    private final zz9<Ticket> ticket;
    private final zz9<Set<String>> unreadConversationIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1", f = "IntercomDataLayer.kt", l = {392}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ oh4<AppConfig, g2b> $onNewAppConfig;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1$1", f = "IntercomDataLayer.kt", l = {}, m = "invokeSuspend")
        public static final class C01521 extends p6a implements ci4<AppConfig, r02<? super g2b>, Object> {
            final /* synthetic */ oh4<AppConfig, g2b> $onNewAppConfig;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01521(oh4<? super AppConfig, g2b> oh4Var, r02<? super C01521> r02Var) {
                super(2, r02Var);
                this.$onNewAppConfig = oh4Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01521 c01521 = new C01521(this.$onNewAppConfig, r02Var);
                c01521.L$0 = obj;
                return c01521;
            }

            @Override // defpackage.ci4
            public final Object invoke(AppConfig appConfig, r02<? super g2b> r02Var) {
                return ((C01521) create(appConfig, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                this.$onNewAppConfig.invoke((AppConfig) this.L$0);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(oh4<? super AppConfig, g2b> oh4Var, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$onNewAppConfig = oh4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return IntercomDataLayer.this.new AnonymousClass1(this.$onNewAppConfig, r02Var);
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
                zz9<AppConfig> config = IntercomDataLayer.this.getConfig();
                C01521 c01521 = new C01521(this.$onNewAppConfig, null);
                this.label = 1;
                Object objF = yk2.f(config, c01521, this);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$emitEvent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$emitEvent$2", f = "IntercomDataLayer.kt", l = {429}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ IntercomEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IntercomEvent intercomEvent, r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
            this.$event = intercomEvent;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return IntercomDataLayer.this.new AnonymousClass2(this.$event, r02Var);
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
                IntercomDataLayer intercomDataLayer = IntercomDataLayer.this;
                IntercomEvent intercomEvent = this.$event;
                this.label = 1;
                Object objEmitEvent = intercomDataLayer.emitEvent(intercomEvent, this);
                v72 v72Var = v72.t;
                if (objEmitEvent == v72Var) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$listenToEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$listenToEvents$1", f = "IntercomDataLayer.kt", l = {441}, m = "invokeSuspend")
    public static final class C03621 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ oh4<IntercomEvent, g2b> $onNewEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03621(oh4<? super IntercomEvent, g2b> oh4Var, r02<? super C03621> r02Var) {
            super(2, r02Var);
            this.$onNewEvent = oh4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return IntercomDataLayer.this.new C03621(this.$onNewEvent, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03621) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                zl9<IntercomEvent> event = IntercomDataLayer.this.getEvent();
                final oh4<IntercomEvent, g2b> oh4Var = this.$onNewEvent;
                s54<? super IntercomEvent> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.data.IntercomDataLayer.listenToEvents.1.1
                    public final Object emit(IntercomEvent intercomEvent, r02<? super g2b> r02Var) {
                        oh4Var.invoke(intercomEvent);
                        return g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((IntercomEvent) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = event.collect(s54Var, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            fl.a();
            return null;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1", f = "IntercomDataLayer.kt", l = {404}, m = "invokeSuspend")
    public static final class C03631 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ oh4<OverlayState, g2b> $onNewOverlyState;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1$1", f = "IntercomDataLayer.kt", l = {}, m = "invokeSuspend")
        public static final class C01541 extends p6a implements ci4<OverlayState, r02<? super g2b>, Object> {
            final /* synthetic */ oh4<OverlayState, g2b> $onNewOverlyState;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01541(oh4<? super OverlayState, g2b> oh4Var, r02<? super C01541> r02Var) {
                super(2, r02Var);
                this.$onNewOverlyState = oh4Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01541 c01541 = new C01541(this.$onNewOverlyState, r02Var);
                c01541.L$0 = obj;
                return c01541;
            }

            @Override // defpackage.ci4
            public final Object invoke(OverlayState overlayState, r02<? super g2b> r02Var) {
                return ((C01541) create(overlayState, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                this.$onNewOverlyState.invoke((OverlayState) this.L$0);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03631(oh4<? super OverlayState, g2b> oh4Var, r02<? super C03631> r02Var) {
            super(2, r02Var);
            this.$onNewOverlyState = oh4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return IntercomDataLayer.this.new C03631(this.$onNewOverlyState, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03631) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                zz9<OverlayState> overlayState = IntercomDataLayer.this.getOverlayState();
                C01541 c01541 = new C01541(this.$onNewOverlyState, null);
                this.label = 1;
                Object objF = yk2.f(overlayState, c01541, this);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
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

    public IntercomDataLayer(AppConfigStore appConfigStore, t72 t72Var) {
        appConfigStore.getClass();
        t72Var.getClass();
        this.appConfigStore = appConfigStore;
        this.applicationScope = t72Var;
        hf3 hf3Var = hf3.t;
        a0a a0aVarB = b0a.b(hf3Var);
        this._conversations = a0aVarB;
        this.conversations = yk2.b(a0aVarB);
        a0a a0aVarB2 = b0a.b(TeamPresence.NULL);
        this._teamPresence = a0aVarB2;
        this.teamPresence = yk2.b(a0aVarB2);
        a0a a0aVarB3 = b0a.b(Ticket.Companion.getNULL());
        this._ticket = a0aVarB3;
        this.ticket = yk2.b(a0aVarB3);
        a0a a0aVarB4 = b0a.b(SurveyData.Companion.getNULL());
        this._surveyData = a0aVarB4;
        this.surveyData = yk2.b(a0aVarB4);
        a0a a0aVarB5 = b0a.b(OverlayState.NULL);
        this._overlayState = a0aVarB5;
        this.overlayState = yk2.b(a0aVarB5);
        a0a a0aVarB6 = b0a.b(HostAppState.NULL);
        this._hostAppState = a0aVarB6;
        this.hostAppState = yk2.b(a0aVarB6);
        a0a a0aVarB7 = b0a.b(of3.t);
        this._unreadConversationIds = a0aVarB7;
        this.unreadConversationIds = yk2.b(a0aVarB7);
        am9 am9VarB = ty1.b(7, null);
        this._event = am9VarB;
        this.event = am9VarB;
        this.homeCards = hf3Var;
        a0a a0aVarB8 = b0a.b(appConfigStore.getAppConfig(DEFAULT_COLOR));
        this._config = a0aVarB8;
        a0a a0aVarB9 = b0a.b(Boolean.valueOf(appConfigStore.getPushNotificationsBannerDismissed()));
        this._pushNotificationsBannerDismissed = a0aVarB9;
        this.config = yk2.b(a0aVarB8);
        this.pushNotificationsBannerDismissed = yk2.b(a0aVarB9);
    }

    public static /* synthetic */ void emitEvent$default(IntercomDataLayer intercomDataLayer, t72 t72Var, IntercomEvent intercomEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            t72Var = intercomDataLayer.applicationScope;
        }
        intercomDataLayer.emitEvent(t72Var, intercomEvent);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[ADDED_TO_REGION, REMOVE] */
    private final void updateAppConfig(AppConfig appConfig) {
        CustomizationModel customization;
        String themeMode;
        ThemeMode themeMode2;
        if (xj5.a(appConfig, this._config.getValue())) {
            return;
        }
        this.appConfigStore.setAppConfig(appConfig);
        this._config.setValue(appConfig);
        ConfigModules configModules = appConfig.getConfigModules();
        if (configModules == null || (customization = configModules.getCustomization()) == null || (themeMode = customization.getThemeMode()) == null) {
            return;
        }
        String lowerCase = themeMode.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -887328209) {
            if (iHashCode != 3075958) {
                if (iHashCode == 102970646 && !lowerCase.equals("light")) {
                    themeMode2 = ThemeMode.LIGHT;
                } else {
                    themeMode2 = ThemeMode.LIGHT;
                }
            } else if (lowerCase.equals("dark")) {
                themeMode2 = ThemeMode.DARK;
            } else {
                themeMode2 = ThemeMode.LIGHT;
            }
        } else if (lowerCase.equals("system")) {
            themeMode2 = ThemeMode.SYSTEM;
        } else {
            themeMode2 = ThemeMode.LIGHT;
        }
        ThemeManager.INSTANCE.updateServerTheme(themeMode2);
    }

    public final void activityPaused(Activity activity) {
        activity.getClass();
        i37<OverlayState> i37Var = this._overlayState;
        while (true) {
            OverlayState value = i37Var.getValue();
            Activity activity2 = activity;
            if (i37Var.c(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, null, activity2, 127, null))) {
                return;
            } else {
                activity = activity2;
            }
        }
    }

    public final void activityReadyForViewAttachment(Activity activity) {
        OverlayState value;
        activity.getClass();
        if (!ActivityUtils.isHostActivity(activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        i37<OverlayState> i37Var = this._overlayState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, activity2, null, 127, null)));
    }

    public final void activityStopped(Activity activity) {
        OverlayState value;
        activity.getClass();
        Activity pausedHostActivity = activity.equals(this.overlayState.getValue().getPausedHostActivity()) ? null : this.overlayState.getValue().getPausedHostActivity();
        i37<OverlayState> i37Var = this._overlayState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, null, pausedHostActivity, 255, null)));
    }

    public final void addConversations(List<Conversation> list) {
        List<Conversation> value;
        ArrayList arrayList;
        list.getClass();
        i37<List<Conversation>> i37Var = this._conversations;
        do {
            value = i37Var.getValue();
            List listN = th1.N(th1.K(list, value), new Comparator() { // from class: io.intercom.android.sdk.m5.data.IntercomDataLayer$addConversations$lambda$2$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return eo7.f(Long.valueOf(ConversationExtensionsKt.lastActionCreatedAt((Conversation) t2)), Long.valueOf(ConversationExtensionsKt.lastActionCreatedAt((Conversation) t)));
                }
            });
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object obj : listN) {
                if (hashSet.add(((Conversation) obj).getId())) {
                    arrayList.add(obj);
                }
            }
        } while (!i37Var.c(value, arrayList));
    }

    public final void appEnteredBackground(long j) {
        OverlayState value;
        HostAppState value2;
        i37<OverlayState> i37Var = this._overlayState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, null, null, 127, null)));
        i37<HostAppState> i37Var2 = this._hostAppState;
        do {
            value2 = i37Var2.getValue();
        } while (!i37Var2.c(value2, HostAppState.copy$default(value2, AppLifecycleState.BACKGROUND, false, j, 2, null)));
    }

    public final void appEnteredForeground() {
        HostAppState value;
        i37<HostAppState> i37Var = this._hostAppState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, HostAppState.copy$default(value, AppLifecycleState.FOREGROUND, false, 0L, 4, null)));
    }

    public final void clearCarousel() {
        OverlayState value;
        Carousel carousel;
        i37<OverlayState> i37Var = this._overlayState;
        do {
            value = i37Var.getValue();
            carousel = Carousel.NULL;
            carousel.getClass();
        } while (!i37Var.c(value, OverlayState.copy$default(value, null, carousel, 0, null, null, null, null, null, null, 509, null)));
    }

    public final void clearOpenResponse() {
        this.openResponse = null;
    }

    public final void clearSurveyData() {
        OverlayState value;
        i37<SurveyData> i37Var = this._surveyData;
        while (!i37Var.c(i37Var.getValue(), SurveyData.Companion.getNULL())) {
        }
        i37<OverlayState> i37Var2 = this._overlayState;
        do {
            value = i37Var2.getValue();
        } while (!i37Var2.c(value, OverlayState.copy$default(value, SurveyData.Companion.getNULL(), null, 0, null, null, null, null, null, null, 510, null)));
    }

    public final void clearUserData() {
        List<Conversation> value;
        hf3 hf3Var;
        OverlayState value2;
        SurveyData surveyData;
        Carousel carousel;
        of3 of3Var;
        i37<List<Conversation>> i37Var = this._conversations;
        do {
            value = i37Var.getValue();
            hf3Var = hf3.t;
        } while (!i37Var.c(value, hf3Var));
        i37<TeamPresence> i37Var2 = this._teamPresence;
        while (!i37Var2.c(i37Var2.getValue(), TeamPresence.NULL)) {
        }
        i37<Ticket> i37Var3 = this._ticket;
        while (!i37Var3.c(i37Var3.getValue(), Ticket.Companion.getNULL())) {
        }
        i37<SurveyData> i37Var4 = this._surveyData;
        while (!i37Var4.c(i37Var4.getValue(), SurveyData.Companion.getNULL())) {
        }
        i37<OverlayState> i37Var5 = this._overlayState;
        do {
            value2 = i37Var5.getValue();
            surveyData = SurveyData.Companion.getNULL();
            carousel = Carousel.NULL;
            carousel.getClass();
            of3Var = of3.t;
        } while (!i37Var5.c(value2, OverlayState.copy$default(value2, surveyData, carousel, 0, null, null, hf3Var, of3Var, null, null, 412, null)));
        i37<Set<String>> i37Var6 = this._unreadConversationIds;
        while (!i37Var6.c(i37Var6.getValue(), of3Var)) {
        }
        this.openResponse = null;
        this.homeCards = hf3Var;
    }

    public final void configUpdates(t72 t72Var, oh4<? super AppConfig, g2b> oh4Var) {
        t72Var.getClass();
        oh4Var.getClass();
        oy0.d(t72Var, null, null, new AnonymousClass1(oh4Var, null), 3);
    }

    public final void emitEvent(t72 t72Var, IntercomEvent intercomEvent) {
        t72Var.getClass();
        intercomEvent.getClass();
        oy0.d(t72Var, null, null, new AnonymousClass2(intercomEvent, null), 3);
    }

    public final void fetchConversationSuccess(Conversation conversation) {
        Set<String> value;
        ArrayList arrayList;
        conversation.getClass();
        Set<String> value2 = this.unreadConversationIds.getValue();
        boolean zIsRead = conversation.isRead();
        i37<Set<String>> i37Var = this._unreadConversationIds;
        if (!zIsRead) {
            while (!i37Var.c(i37Var.getValue(), wx7.c(value2, conversation.getId()))) {
            }
            return;
        }
        do {
            value = i37Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : value2) {
                if (!xj5.a((String) obj, conversation.getId())) {
                    arrayList.add(obj);
                }
            }
        } while (!i37Var.c(value, th1.X(arrayList)));
    }

    public final String generateSessionId() {
        return this.appConfigStore.generateSessionId();
    }

    public final zz9<AppConfig> getConfig() {
        return this.config;
    }

    public final zz9<List<Conversation>> getConversations() {
        return this.conversations;
    }

    public final zl9<IntercomEvent> getEvent() {
        return this.event;
    }

    public final zz9<HostAppState> getHostAppState() {
        return this.hostAppState;
    }

    public final OpenMessengerResponse getOpenResponse() {
        return this.openResponse;
    }

    public final zz9<OverlayState> getOverlayState() {
        return this.overlayState;
    }

    public final zz9<Boolean> getPushNotificationsBannerDismissed() {
        return this.pushNotificationsBannerDismissed;
    }

    public final String getSessionId() {
        return this.appConfigStore.getSessionId();
    }

    public final zz9<SurveyData> getSurveyData() {
        return this.surveyData;
    }

    public final zz9<TeamPresence> getTeamPresence() {
        return this.teamPresence;
    }

    public final zz9<Ticket> getTicket() {
        return this.ticket;
    }

    public final zz9<Set<String>> getUnreadConversationIds() {
        return this.unreadConversationIds;
    }

    public final void hardReset() {
        HostAppState value;
        resetConfig();
        i37<HostAppState> i37Var = this._hostAppState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, HostAppState.copy$default(value, null, false, 0L, 5, null)));
    }

    public final void listenToEvents(t72 t72Var, oh4<? super IntercomEvent, g2b> oh4Var) {
        t72Var.getClass();
        oh4Var.getClass();
        oy0.d(t72Var, null, null, new C03621(oh4Var, null), 3);
    }

    public final void markConversationAsRead(String str) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        Set<String> value2;
        ArrayList arrayList2;
        str.getClass();
        List<Conversation> conversations = this.overlayState.getValue().getConversations();
        i37<OverlayState> i37Var = this._overlayState;
        do {
            value = i37Var.getValue();
            overlayState = value;
            arrayList = new ArrayList();
            for (Object obj : conversations) {
                if (!xj5.a(((Conversation) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
        } while (!i37Var.c(value, OverlayState.copy$default(overlayState, null, null, 0, null, null, arrayList, null, null, null, 479, null)));
        Set<String> value3 = this.unreadConversationIds.getValue();
        i37<Set<String>> i37Var2 = this._unreadConversationIds;
        do {
            value2 = i37Var2.getValue();
            arrayList2 = new ArrayList();
            for (Object obj2 : value3) {
                if (!xj5.a((String) obj2, str)) {
                    arrayList2.add(obj2);
                }
            }
        } while (!i37Var2.c(value2, th1.X(arrayList2)));
    }

    public final void markConversationPartAsDismissed(String str) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        str.getClass();
        List<Conversation> conversations = this.overlayState.getValue().getConversations();
        LinkedHashSet linkedHashSetC = wx7.c(this.overlayState.getValue().getDismissedPartIds(), str);
        i37<OverlayState> i37Var = this._overlayState;
        do {
            value = i37Var.getValue();
            overlayState = value;
            arrayList = new ArrayList();
            for (Object obj : conversations) {
                Conversation conversation = (Conversation) obj;
                if (!linkedHashSetC.isEmpty()) {
                    Iterator it = linkedHashSetC.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!xj5.a((String) it.next(), conversation.lastPart().getId()));
                }
                arrayList.add(obj);
            }
        } while (!i37Var.c(value, OverlayState.copy$default(overlayState, null, null, 0, null, null, arrayList, linkedHashSetC, null, null, 415, null)));
    }

    public final void overlayStateUpdates(t72 t72Var, oh4<? super OverlayState, g2b> oh4Var) {
        t72Var.getClass();
        oh4Var.getClass();
        oy0.d(t72Var, null, null, new C03631(oh4Var, null), 3);
    }

    public final void resetConfig() {
        updateAppConfig(AppConfig.copy$default(this.config.getValue(), null, 0, 0, 0, false, false, false, 0, 0L, 0L, 0L, 0L, false, false, null, null, false, false, null, null, null, null, BuildConfig.FLAVOR, false, false, false, false, false, null, new NexusConfig(), null, false, null, false, false, -541065217, 7, null));
    }

    public final void unreadConversationIdsUpdates(t72 t72Var, oh4<? super Set<String>, g2b> oh4Var) {
        t72Var.getClass();
        oh4Var.getClass();
        oy0.d(t72Var, null, null, new C03641(oh4Var, null), 3);
    }

    public final void updateBottomPadding(int i) {
        i37<OverlayState> i37Var = this._overlayState;
        while (true) {
            OverlayState value = i37Var.getValue();
            int i2 = i;
            if (i37Var.c(value, OverlayState.copy$default(value, null, null, i2, null, null, null, null, null, null, 507, null))) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void updateCarousel(Carousel carousel) {
        OverlayState value;
        OverlayState overlayState;
        carousel.getClass();
        i37<OverlayState> i37Var = this._overlayState;
        do {
            value = i37Var.getValue();
            overlayState = value;
        } while (!i37Var.c(value, OverlayState.copy$default(overlayState, null, xj5.a(overlayState.getCarousel(), Carousel.NULL) ? carousel : overlayState.getCarousel(), 0, null, null, null, null, null, null, 509, null)));
    }

    public final void updateConfig(Config config) {
        config.getClass();
        if (config.equals(Config.Companion.getNULL())) {
            return;
        }
        updateAppConfig(AppConfigKt.getAppConfig(config, this._config.getValue().getPrimaryColor()));
    }

    public final void updateConversationTitle(String str, String str2) {
        List<Conversation> value;
        ArrayList arrayList;
        OverlayState value2;
        OverlayState overlayState;
        ArrayList arrayList2;
        str.getClass();
        str2.getClass();
        i37<List<Conversation>> i37Var = this._conversations;
        do {
            value = i37Var.getValue();
            List<Conversation> list = value;
            arrayList = new ArrayList(ph1.n(list, 10));
            for (Conversation conversationCopy$default : list) {
                if (xj5.a(conversationCopy$default.getId(), str)) {
                    conversationCopy$default = Conversation.copy$default(conversationCopy$default, null, str2, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097149, null);
                }
                arrayList.add(conversationCopy$default);
            }
        } while (!i37Var.c(value, arrayList));
        List<Conversation> conversations = this.overlayState.getValue().getConversations();
        if (conversations == null || !conversations.isEmpty()) {
            Iterator<T> it = conversations.iterator();
            while (it.hasNext()) {
                if (xj5.a(((Conversation) it.next()).getId(), str)) {
                    i37<OverlayState> i37Var2 = this._overlayState;
                    do {
                        value2 = i37Var2.getValue();
                        overlayState = value2;
                        arrayList2 = new ArrayList(ph1.n(conversations, 10));
                        for (Conversation conversationCopy$default2 : conversations) {
                            if (xj5.a(conversationCopy$default2.getId(), str)) {
                                conversationCopy$default2 = Conversation.copy$default(conversationCopy$default2, null, str2, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097149, null);
                            }
                            arrayList2.add(conversationCopy$default2);
                        }
                    } while (!i37Var2.c(value2, OverlayState.copy$default(overlayState, null, null, 0, null, null, arrayList2, null, null, null, 479, null)));
                    return;
                }
            }
        }
    }

    public final void updateInAppNotificationsVisibility(Intercom.Visibility visibility) {
        visibility.getClass();
        i37<OverlayState> i37Var = this._overlayState;
        while (true) {
            OverlayState value = i37Var.getValue();
            Intercom.Visibility visibility2 = visibility;
            if (i37Var.c(value, OverlayState.copy$default(value, null, null, 0, null, visibility2, null, null, null, null, 495, null))) {
                return;
            } else {
                visibility = visibility2;
            }
        }
    }

    public final void updateLauncherVisibility(Intercom.Visibility visibility) {
        visibility.getClass();
        i37<OverlayState> i37Var = this._overlayState;
        while (true) {
            OverlayState value = i37Var.getValue();
            Intercom.Visibility visibility2 = visibility;
            if (i37Var.c(value, OverlayState.copy$default(value, null, null, 0, visibility2, null, null, null, null, null, 503, null))) {
                return;
            } else {
                visibility = visibility2;
            }
        }
    }

    public final void updateOpenResponse(OpenMessengerResponse openMessengerResponse) {
        openMessengerResponse.getClass();
        this.openResponse = openMessengerResponse;
    }

    public final void updateOverlayConversations(List<Conversation> list) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        list.getClass();
        Set<String> dismissedPartIds = this.overlayState.getValue().getDismissedPartIds();
        i37<OverlayState> i37Var = this._overlayState;
        do {
            value = i37Var.getValue();
            overlayState = value;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                Conversation conversation = (Conversation) obj;
                Set<String> set = dismissedPartIds;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!xj5.a((String) it.next(), conversation.lastPart().getId()));
                }
                arrayList2.add(obj);
            }
            arrayList = new ArrayList();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                if (((Conversation) obj2).lastPart().getDeliveryOption() != DeliveryOption.BADGE) {
                    arrayList.add(obj2);
                }
            }
        } while (!i37Var.c(value, OverlayState.copy$default(overlayState, null, null, 0, null, null, arrayList, null, null, null, 479, null)));
    }

    public final void updatePushNotificationsBannerDismissed(boolean z) {
        Boolean value;
        this.appConfigStore.setPushNotificationsBannerDismissed(z);
        i37<Boolean> i37Var = this._pushNotificationsBannerDismissed;
        do {
            value = i37Var.getValue();
            value.getClass();
        } while (!i37Var.c(value, Boolean.valueOf(z)));
    }

    public final void updateSessionStarted() {
        HostAppState value;
        i37<HostAppState> i37Var = this._hostAppState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, HostAppState.copy$default(value, null, true, 0L, 5, null)));
    }

    public final void updateSurveyData(SurveyData surveyData) {
        OverlayState value;
        OverlayState overlayState;
        surveyData.getClass();
        i37<SurveyData> i37Var = this._surveyData;
        while (!i37Var.c(i37Var.getValue(), surveyData)) {
        }
        i37<OverlayState> i37Var2 = this._overlayState;
        do {
            value = i37Var2.getValue();
            overlayState = value;
        } while (!i37Var2.c(value, OverlayState.copy$default(overlayState, xj5.a(overlayState.getSurveyData(), SurveyData.Companion.getNULL()) ? surveyData : overlayState.getSurveyData(), null, 0, null, null, null, null, null, null, 510, null)));
    }

    public final void updateTeamPresence(TeamPresence teamPresence) {
        teamPresence.getClass();
        i37<TeamPresence> i37Var = this._teamPresence;
        while (!i37Var.c(i37Var.getValue(), teamPresence)) {
        }
    }

    public final void updateTicket(Ticket ticket) {
        ticket.getClass();
        i37<Ticket> i37Var = this._ticket;
        while (!i37Var.c(i37Var.getValue(), ticket)) {
        }
    }

    public final void updateUnreadConversationIds(Set<String> set) {
        set.getClass();
        i37<Set<String>> i37Var = this._unreadConversationIds;
        while (!i37Var.c(i37Var.getValue(), set)) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1", f = "IntercomDataLayer.kt", l = {416}, m = "invokeSuspend")
    public static final class C03641 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ oh4<Set<String>, g2b> $onNewUnreadConversationsIdsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03641(oh4<? super Set<String>, g2b> oh4Var, r02<? super C03641> r02Var) {
            super(2, r02Var);
            this.$onNewUnreadConversationsIdsState = oh4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return IntercomDataLayer.this.new C03641(this.$onNewUnreadConversationsIdsState, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03641) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                zz9<Set<String>> unreadConversationIds = IntercomDataLayer.this.getUnreadConversationIds();
                C01551 c01551 = new C01551(this.$onNewUnreadConversationsIdsState, null);
                this.label = 1;
                Object objF = yk2.f(unreadConversationIds, c01551, this);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
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

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1$1", f = "IntercomDataLayer.kt", l = {}, m = "invokeSuspend")
        public static final class C01551 extends p6a implements ci4<Set<? extends String>, r02<? super g2b>, Object> {
            final /* synthetic */ oh4<Set<String>, g2b> $onNewUnreadConversationsIdsState;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01551(oh4<? super Set<String>, g2b> oh4Var, r02<? super C01551> r02Var) {
                super(2, r02Var);
                this.$onNewUnreadConversationsIdsState = oh4Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01551 c01551 = new C01551(this.$onNewUnreadConversationsIdsState, r02Var);
                c01551.L$0 = obj;
                return c01551;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Set<String> set, r02<? super g2b> r02Var) {
                return ((C01551) create(set, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                this.$onNewUnreadConversationsIdsState.invoke((Set) this.L$0);
                return g2b.a;
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, r02<? super g2b> r02Var) {
                return invoke2((Set<String>) set, r02Var);
            }
        }
    }

    public final Object emitEvent(IntercomEvent intercomEvent, r02<? super g2b> r02Var) {
        Object objEmit = this._event.emit(intercomEvent, r02Var);
        return objEmit == v72.t ? objEmit : g2b.a;
    }

    public final void emitEvent(IntercomEvent intercomEvent) {
        intercomEvent.getClass();
        emitEvent$default(this, null, intercomEvent, 1, null);
    }
}
