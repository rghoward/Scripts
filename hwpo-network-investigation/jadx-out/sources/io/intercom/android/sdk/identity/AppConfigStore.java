package io.intercom.android.sdk.identity;

import android.content.Context;
import com.google.gson.Gson;
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
import defpackage.oe8;
import defpackage.of3;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.pf2;
import defpackage.q00;
import defpackage.qi6;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import defpackage.s7;
import defpackage.t72;
import defpackage.t78;
import defpackage.v72;
import defpackage.v78;
import defpackage.ws0;
import defpackage.wx7;
import defpackage.x27;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.ze2;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppConfigStore {
    private static final Set<String> ALL_MIGRATION_KEY_NAMES;
    private static final Map<String, t78.a<Boolean>> BOOLEAN_MIGRATION_KEYS;
    private static final Map<String, t78.a<Integer>> INT_MIGRATION_KEYS;
    private static final t78.a<Boolean> KEY_ACCESS_TEAMMATE_ENABLED;
    private static final t78.a<String> KEY_APP_LOCALE;
    private static final t78.a<String> KEY_APP_NAME;
    private static final t78.a<Boolean> KEY_ARTICLE_AUTO_REACTION_ENABLED;
    private static final t78.a<Boolean> KEY_ASK_USERS_TO_ALLOW_NOTIFICATIONS;
    private static final t78.a<String> KEY_ATTACHMENT_SETTINGS;
    private static final t78.a<Boolean> KEY_AUDIO_ENABLED;
    private static final t78.a<Boolean> KEY_BACKGROUND_REQUESTS_ENABLED;
    private static final t78.a<Boolean> KEY_CRASH_REPORTING_ENABLED;
    private static final t78.a<Set<String>> KEY_FEATURES;
    private static final t78.a<Boolean> KEY_HAS_OPEN_CONVERSATIONS;
    private static final t78.a<String> KEY_HELP_CENTER_LOCALE;
    private static final t78.a<Boolean> KEY_HELP_CENTER_REQUIRE_SEARCH;
    private static final t78.a<String> KEY_HELP_CENTER_URL;
    private static final t78.a<Set<String>> KEY_HELP_CENTER_URLS;
    private static final t78.a<String> KEY_HUB_CONFIG;
    private static final t78.a<Boolean> KEY_IDENTITY_VERIFICATION_ENABLED;
    private static final t78.a<Boolean> KEY_INBOUND_MESSAGES;
    private static final t78.a<String> KEY_LAUNCHER_LOGO_URL;
    private static final t78.a<Boolean> KEY_METRICS_ENABLED;
    private static final t78.a<Long> KEY_NEW_SESSION_THRESHOLD_MS;
    private static final t78.a<Boolean> KEY_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS;
    private static final t78.a<Integer> KEY_PRIMARY_COLOR;
    private static final t78.a<Boolean> KEY_PRIMARY_COLOR_RENDER_DARK_TEXT;
    private static final t78.a<Boolean> KEY_PUSH_NOTIFICATIONS_BANNER_DISMISSED;
    private static final t78.a<Integer> KEY_RATE_LIMIT_COUNT;
    private static final t78.a<Long> KEY_RATE_LIMIT_PERIOD_MS;
    private static final t78.a<Boolean> KEY_RECEIVED_FROM_SERVER;
    private static final t78.a<Integer> KEY_SECONDARY_COLOR;
    private static final t78.a<Boolean> KEY_SECONDARY_COLOR_RENDER_DARK_TEXT;
    private static final t78.a<String> KEY_SESSION_ID;
    private static final t78.a<Long> KEY_SOFT_RESET_TIMEOUT_MS;
    private static final t78.a<String> KEY_TEAM_GREETING;
    private static final t78.a<Long> KEY_USER_UPDATE_CACHE_MAX_AGE_MS;
    private static final Map<String, t78.a<Long>> LONG_MIGRATION_KEYS;
    private static final String OLD_PREFS_NAME = "INTERCOM_SDK_PREFS";
    private static final Map<String, t78.a<String>> STRING_MIGRATION_KEYS;
    private static final Map<String, t78.a<Set<String>>> STRING_SET_MIGRATION_KEYS;
    private static final fi8<Context, pf2<t78>> appConfigDataStore$delegate;
    private static final Twig twig;
    private final pf2<t78> dataStore;
    private final t72 scope;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Gson GSON = new Gson();

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$clear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$clear$1", f = "AppConfigStore.kt", l = {200}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$clear$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$clear$1$1", f = "AppConfigStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01291 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C01291(r02<? super C01291> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01291 c01291 = new C01291(r02Var);
                c01291.L$0 = obj;
                return c01291;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01291) create(x27Var, r02Var)).invokeSuspend(g2b.a);
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
            return AppConfigStore.this.new AnonymousClass1(r02Var);
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
                pf2 pf2Var = AppConfigStore.this.dataStore;
                C01291 c01291 = new C01291(null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01291, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$generateSessionId$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$generateSessionId$1", f = "AppConfigStore.kt", l = {173}, m = "invokeSuspend")
    public static final class C03241 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$generateSessionId$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$generateSessionId$1$1", f = "AppConfigStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01301 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ String $sessionId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01301(String str, r02<? super C01301> r02Var) {
                super(2, r02Var);
                this.$sessionId = str;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01301 c01301 = new C01301(this.$sessionId, r02Var);
                c01301.L$0 = obj;
                return c01301;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01301) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ((x27) this.L$0).g(AppConfigStore.KEY_SESSION_ID, this.$sessionId);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03241(String str, r02<? super C03241> r02Var) {
            super(2, r02Var);
            this.$sessionId = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AppConfigStore.this.new C03241(this.$sessionId, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03241) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = AppConfigStore.this.dataStore;
                C01301 c01301 = new C01301(this.$sessionId, null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01301, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$getAppConfig$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$getAppConfig$1", f = "AppConfigStore.kt", l = {58}, m = "invokeSuspend")
    public static final class C03251 extends p6a implements ci4<t72, r02<? super AppConfig>, Object> {
        final /* synthetic */ int $defaultColor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03251(int i, r02<? super C03251> r02Var) {
            super(2, r02Var);
            this.$defaultColor = i;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AppConfigStore.this.new C03251(this.$defaultColor, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super AppConfig> r02Var) {
            return ((C03251) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objK;
            AttachmentSettings attachmentSettings;
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = AppConfigStore.this.dataStore.getData();
                this.label = 1;
                objK = yk2.k(data, this);
                v72 v72Var = v72.t;
                if (objK == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                objK = obj;
            }
            t78 t78Var = (t78) objK;
            Integer num = (Integer) t78Var.b(AppConfigStore.KEY_PRIMARY_COLOR);
            int iIntValue = num != null ? num.intValue() : this.$defaultColor;
            Integer num2 = (Integer) t78Var.b(AppConfigStore.KEY_SECONDARY_COLOR);
            int iIntValue2 = num2 != null ? num2.intValue() : iIntValue;
            String str = (String) t78Var.b(AppConfigStore.KEY_APP_NAME);
            String str2 = str == null ? BuildConfig.FLAVOR : str;
            int iDarkenColor = ColorUtils.darkenColor(iIntValue2);
            Boolean bool = (Boolean) t78Var.b(AppConfigStore.KEY_PRIMARY_COLOR_RENDER_DARK_TEXT);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = (Boolean) t78Var.b(AppConfigStore.KEY_SECONDARY_COLOR_RENDER_DARK_TEXT);
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Boolean bool3 = (Boolean) t78Var.b(AppConfigStore.KEY_INBOUND_MESSAGES);
            boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            Integer num3 = (Integer) t78Var.b(AppConfigStore.KEY_RATE_LIMIT_COUNT);
            int iIntValue3 = num3 != null ? num3.intValue() : 100;
            Long l = (Long) t78Var.b(AppConfigStore.KEY_RATE_LIMIT_PERIOD_MS);
            long jLongValue = l != null ? l.longValue() : 60000L;
            Long l2 = (Long) t78Var.b(AppConfigStore.KEY_USER_UPDATE_CACHE_MAX_AGE_MS);
            long jLongValue2 = l2 != null ? l2.longValue() : AudioConstants.MAX_RECORDING_DURATION_MS;
            Long l3 = (Long) t78Var.b(AppConfigStore.KEY_NEW_SESSION_THRESHOLD_MS);
            long jLongValue3 = l3 != null ? l3.longValue() : 20000L;
            Long l4 = (Long) t78Var.b(AppConfigStore.KEY_SOFT_RESET_TIMEOUT_MS);
            long jLongValue4 = l4 != null ? l4.longValue() : 1000L;
            Boolean bool4 = (Boolean) t78Var.b(AppConfigStore.KEY_METRICS_ENABLED);
            boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : true;
            Boolean bool5 = (Boolean) t78Var.b(AppConfigStore.KEY_AUDIO_ENABLED);
            boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : true;
            String str3 = (String) t78Var.b(AppConfigStore.KEY_APP_LOCALE);
            String str4 = str3 == null ? BuildConfig.FLAVOR : str3;
            String str5 = (String) t78Var.b(AppConfigStore.KEY_HELP_CENTER_LOCALE);
            String str6 = str5 == null ? BuildConfig.FLAVOR : str5;
            Boolean bool6 = (Boolean) t78Var.b(AppConfigStore.KEY_RECEIVED_FROM_SERVER);
            boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
            Boolean bool7 = (Boolean) t78Var.b(AppConfigStore.KEY_BACKGROUND_REQUESTS_ENABLED);
            boolean zBooleanValue7 = bool7 != null ? bool7.booleanValue() : true;
            String str7 = (String) t78Var.b(AppConfigStore.KEY_HELP_CENTER_URL);
            String str8 = str7 == null ? BuildConfig.FLAVOR : str7;
            Set set = (Set) t78Var.b(AppConfigStore.KEY_HELP_CENTER_URLS);
            of3 of3Var = of3.t;
            if (set == null) {
                set = of3Var;
            }
            boolean z = zBooleanValue;
            Set set2 = (Set) t78Var.b(AppConfigStore.KEY_FEATURES);
            Set set3 = set2 == null ? of3Var : set2;
            String str9 = (String) t78Var.b(AppConfigStore.KEY_LAUNCHER_LOGO_URL);
            String str10 = str9 == null ? BuildConfig.FLAVOR : str9;
            String str11 = (String) t78Var.b(AppConfigStore.KEY_TEAM_GREETING);
            String str12 = str11 == null ? BuildConfig.FLAVOR : str11;
            Boolean bool8 = (Boolean) t78Var.b(AppConfigStore.KEY_IDENTITY_VERIFICATION_ENABLED);
            boolean zBooleanValue8 = bool8 != null ? bool8.booleanValue() : false;
            Boolean bool9 = (Boolean) t78Var.b(AppConfigStore.KEY_ACCESS_TEAMMATE_ENABLED);
            boolean zBooleanValue9 = bool9 != null ? bool9.booleanValue() : true;
            Boolean bool10 = (Boolean) t78Var.b(AppConfigStore.KEY_HELP_CENTER_REQUIRE_SEARCH);
            boolean zBooleanValue10 = bool10 != null ? bool10.booleanValue() : false;
            Boolean bool11 = (Boolean) t78Var.b(AppConfigStore.KEY_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS);
            boolean zBooleanValue11 = bool11 != null ? bool11.booleanValue() : false;
            Boolean bool12 = (Boolean) t78Var.b(AppConfigStore.KEY_HAS_OPEN_CONVERSATIONS);
            boolean zBooleanValue12 = bool12 != null ? bool12.booleanValue() : false;
            boolean z2 = zBooleanValue4;
            ConfigModules configModules = (ConfigModules) AppConfigStore.GSON.fromJson((String) t78Var.b(AppConfigStore.KEY_HUB_CONFIG), ConfigModules.class);
            NexusConfig nexusConfig = new NexusConfig();
            String str13 = (String) t78Var.b(AppConfigStore.KEY_ATTACHMENT_SETTINGS);
            if (str13 == null || (attachmentSettings = (AttachmentSettings) AppConfigStore.GSON.fromJson(str13, AttachmentSettings.class)) == null) {
                attachmentSettings = AttachmentSettings.Companion.getDEFAULT();
            }
            AttachmentSettings attachmentSettings2 = attachmentSettings;
            Boolean bool13 = (Boolean) t78Var.b(AppConfigStore.KEY_ARTICLE_AUTO_REACTION_ENABLED);
            boolean zBooleanValue13 = bool13 != null ? bool13.booleanValue() : true;
            ConversationStateSyncSettings conversationStateSyncSettings = ConversationStateSyncSettings.Companion.getDEFAULT();
            Boolean bool14 = (Boolean) t78Var.b(AppConfigStore.KEY_ASK_USERS_TO_ALLOW_NOTIFICATIONS);
            boolean zBooleanValue14 = bool14 != null ? bool14.booleanValue() : false;
            Boolean bool15 = (Boolean) t78Var.b(AppConfigStore.KEY_CRASH_REPORTING_ENABLED);
            return new AppConfig(str2, iIntValue, iIntValue2, iDarkenColor, z, zBooleanValue2, zBooleanValue3, iIntValue3, jLongValue, jLongValue2, jLongValue3, jLongValue4, z2, zBooleanValue5, str4, str6, zBooleanValue6, zBooleanValue7, str8, set, set3, str10, str12, zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, configModules, nexusConfig, attachmentSettings2, zBooleanValue13, conversationStateSyncSettings, zBooleanValue14, bool15 != null ? bool15.booleanValue() : true);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$getPushNotificationsBannerDismissed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$getPushNotificationsBannerDismissed$1", f = "AppConfigStore.kt", l = {182}, m = "invokeSuspend")
    public static final class C03261 extends p6a implements ci4<t72, r02<? super Boolean>, Object> {
        int label;

        public C03261(r02<? super C03261> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AppConfigStore.this.new C03261(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super Boolean> r02Var) {
            return ((C03261) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = AppConfigStore.this.dataStore.getData();
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
            Boolean bool = (Boolean) ((t78) obj).b(AppConfigStore.KEY_PUSH_NOTIFICATIONS_BANNER_DISMISSED);
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$getSessionId$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$getSessionId$1", f = "AppConfigStore.kt", l = {162}, m = "invokeSuspend")
    public static final class C03271 extends p6a implements ci4<t72, r02<? super String>, Object> {
        int label;

        public C03271(r02<? super C03271> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AppConfigStore.this.new C03271(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super String> r02Var) {
            return ((C03271) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = AppConfigStore.this.dataStore.getData();
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
            return ((t78) obj).b(AppConfigStore.KEY_SESSION_ID);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$setAppConfig$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$setAppConfig$1", f = "AppConfigStore.kt", l = {120}, m = "invokeSuspend")
    public static final class C03281 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ AppConfig $config;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$setAppConfig$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$setAppConfig$1$1", f = "AppConfigStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01311 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ AppConfig $config;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01311(AppConfig appConfig, r02<? super C01311> r02Var) {
                super(2, r02Var);
                this.$config = appConfig;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01311 c01311 = new C01311(this.$config, r02Var);
                c01311.L$0 = obj;
                return c01311;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01311) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                x27 x27Var = (x27) this.L$0;
                AppConfig appConfig = this.$config;
                x27Var.g(AppConfigStore.KEY_APP_NAME, appConfig.getName());
                x27Var.g(AppConfigStore.KEY_APP_LOCALE, appConfig.getLocale());
                x27Var.g(AppConfigStore.KEY_HELP_CENTER_LOCALE, appConfig.getHelpCenterLocale());
                x27Var.g(AppConfigStore.KEY_LAUNCHER_LOGO_URL, appConfig.getLauncherLogoUrl());
                x27Var.g(AppConfigStore.KEY_TEAM_GREETING, appConfig.getTeamGreeting());
                x27Var.g(AppConfigStore.KEY_PRIMARY_COLOR, new Integer(appConfig.getPrimaryColor()));
                x27Var.g(AppConfigStore.KEY_SECONDARY_COLOR, new Integer(appConfig.getSecondaryColor()));
                x27Var.g(AppConfigStore.KEY_RATE_LIMIT_COUNT, new Integer(appConfig.getRateLimitCount()));
                x27Var.g(AppConfigStore.KEY_USER_UPDATE_CACHE_MAX_AGE_MS, new Long(appConfig.getUserUpdateCacheMaxAgeMs()));
                x27Var.g(AppConfigStore.KEY_RATE_LIMIT_PERIOD_MS, new Long(appConfig.getRateLimitPeriodMs()));
                x27Var.g(AppConfigStore.KEY_NEW_SESSION_THRESHOLD_MS, new Long(appConfig.getNewSessionThresholdMs()));
                x27Var.g(AppConfigStore.KEY_SOFT_RESET_TIMEOUT_MS, new Long(appConfig.getSoftResetTimeoutMs()));
                x27Var.g(AppConfigStore.KEY_INBOUND_MESSAGES, Boolean.valueOf(appConfig.isInboundMessages()));
                x27Var.g(AppConfigStore.KEY_AUDIO_ENABLED, Boolean.valueOf(appConfig.isAudioEnabled()));
                x27Var.g(AppConfigStore.KEY_METRICS_ENABLED, Boolean.valueOf(appConfig.isMetricsEnabled()));
                x27Var.g(AppConfigStore.KEY_RECEIVED_FROM_SERVER, Boolean.valueOf(appConfig.isReceivedFromServer()));
                x27Var.g(AppConfigStore.KEY_BACKGROUND_REQUESTS_ENABLED, Boolean.valueOf(appConfig.isBackgroundRequestsEnabled()));
                x27Var.g(AppConfigStore.KEY_PRIMARY_COLOR_RENDER_DARK_TEXT, Boolean.valueOf(appConfig.isPrimaryColorRenderDarkText()));
                x27Var.g(AppConfigStore.KEY_SECONDARY_COLOR_RENDER_DARK_TEXT, Boolean.valueOf(appConfig.isSecondaryColorRenderDarkText()));
                x27Var.g(AppConfigStore.KEY_HELP_CENTER_URL, appConfig.getHelpCenterUrl());
                x27Var.g(AppConfigStore.KEY_HELP_CENTER_URLS, appConfig.getHelpCenterUrls());
                x27Var.g(AppConfigStore.KEY_FEATURES, appConfig.getFeatures());
                x27Var.g(AppConfigStore.KEY_ACCESS_TEAMMATE_ENABLED, Boolean.valueOf(appConfig.isAccessToTeammateEnabled()));
                x27Var.g(AppConfigStore.KEY_HELP_CENTER_REQUIRE_SEARCH, Boolean.valueOf(appConfig.isHelpCenterRequireSearchEnabled()));
                x27Var.g(AppConfigStore.KEY_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS, Boolean.valueOf(appConfig.isPreventMultipleInboundConversationsEnabled()));
                x27Var.g(AppConfigStore.KEY_HAS_OPEN_CONVERSATIONS, Boolean.valueOf(appConfig.getHasOpenConversations()));
                x27Var.g(AppConfigStore.KEY_HUB_CONFIG, AppConfigStore.GSON.toJson(appConfig.getConfigModules()));
                x27Var.g(AppConfigStore.KEY_ATTACHMENT_SETTINGS, AppConfigStore.GSON.toJson(appConfig.getAttachmentSettings()));
                x27Var.g(AppConfigStore.KEY_ARTICLE_AUTO_REACTION_ENABLED, Boolean.valueOf(appConfig.getArticleAutoReactionEnabled()));
                x27Var.g(AppConfigStore.KEY_ASK_USERS_TO_ALLOW_NOTIFICATIONS, Boolean.valueOf(appConfig.getAskUsersToAllowNotifications()));
                x27Var.g(AppConfigStore.KEY_IDENTITY_VERIFICATION_ENABLED, Boolean.valueOf(appConfig.isIdentityVerificationEnabled()));
                x27Var.g(AppConfigStore.KEY_CRASH_REPORTING_ENABLED, Boolean.valueOf(appConfig.isCrashReportingEnabled()));
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03281(AppConfig appConfig, r02<? super C03281> r02Var) {
            super(2, r02Var);
            this.$config = appConfig;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AppConfigStore.this.new C03281(this.$config, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03281) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = AppConfigStore.this.dataStore;
                C01311 c01311 = new C01311(this.$config, null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01311, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$setPushNotificationsBannerDismissed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$setPushNotificationsBannerDismissed$1", f = "AppConfigStore.kt", l = {192}, m = "invokeSuspend")
    public static final class C03291 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ boolean $dismissed;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.AppConfigStore$setPushNotificationsBannerDismissed$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.AppConfigStore$setPushNotificationsBannerDismissed$1$1", f = "AppConfigStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01321 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ boolean $dismissed;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01321(boolean z, r02<? super C01321> r02Var) {
                super(2, r02Var);
                this.$dismissed = z;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01321 c01321 = new C01321(this.$dismissed, r02Var);
                c01321.L$0 = obj;
                return c01321;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01321) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ((x27) this.L$0).g(AppConfigStore.KEY_PUSH_NOTIFICATIONS_BANNER_DISMISSED, Boolean.valueOf(this.$dismissed));
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03291(boolean z, r02<? super C03291> r02Var) {
            super(2, r02Var);
            this.$dismissed = z;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AppConfigStore.this.new C03291(this.$dismissed, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03291) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = AppConfigStore.this.dataStore;
                C01321 c01321 = new C01321(this.$dismissed, null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01321, this);
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
        t78.a<String> aVar = new t78.a<>("app_name");
        KEY_APP_NAME = aVar;
        t78.a<String> aVar2 = new t78.a<>("app_locale");
        KEY_APP_LOCALE = aVar2;
        t78.a<String> aVar3 = new t78.a<>("help_center_locale");
        KEY_HELP_CENTER_LOCALE = aVar3;
        t78.a<String> aVar4 = new t78.a<>("app_launcher_logo_url");
        KEY_LAUNCHER_LOGO_URL = aVar4;
        t78.a<String> aVar5 = new t78.a<>("app_team_greeting");
        KEY_TEAM_GREETING = aVar5;
        t78.a<String> aVar6 = new t78.a<>("help_center_url");
        KEY_HELP_CENTER_URL = aVar6;
        t78.a<String> aVar7 = new t78.a<>("hub_config");
        KEY_HUB_CONFIG = aVar7;
        t78.a<String> aVar8 = new t78.a<>("app_attachment_settings");
        KEY_ATTACHMENT_SETTINGS = aVar8;
        t78.a<String> aVar9 = new t78.a<>("session_id");
        KEY_SESSION_ID = aVar9;
        t78.a<Integer> aVar10 = new t78.a<>("app_primary_color");
        KEY_PRIMARY_COLOR = aVar10;
        t78.a<Integer> aVar11 = new t78.a<>("app_secondary_color");
        KEY_SECONDARY_COLOR = aVar11;
        t78.a<Integer> aVar12 = new t78.a<>("app_rate_limit_count");
        KEY_RATE_LIMIT_COUNT = aVar12;
        t78.a<Long> aVar13 = new t78.a<>("app_user_update_cache_max_age_ms");
        KEY_USER_UPDATE_CACHE_MAX_AGE_MS = aVar13;
        t78.a<Long> aVar14 = new t78.a<>("app_rate_limit_period_ms");
        KEY_RATE_LIMIT_PERIOD_MS = aVar14;
        t78.a<Long> aVar15 = new t78.a<>("app_soft_reset_timeout_ms");
        KEY_SOFT_RESET_TIMEOUT_MS = aVar15;
        t78.a<Long> aVar16 = new t78.a<>("new_session_threshold_ms");
        KEY_NEW_SESSION_THRESHOLD_MS = aVar16;
        t78.a<Boolean> aVar17 = new t78.a<>("app_inbound_messages");
        KEY_INBOUND_MESSAGES = aVar17;
        t78.a<Boolean> aVar18 = new t78.a<>("app_primary_color_render_dark_text");
        KEY_PRIMARY_COLOR_RENDER_DARK_TEXT = aVar18;
        t78.a<Boolean> aVar19 = new t78.a<>("app_secondary_color_render_dark_text");
        KEY_SECONDARY_COLOR_RENDER_DARK_TEXT = aVar19;
        t78.a<Boolean> aVar20 = new t78.a<>("app_audio_enabled");
        KEY_AUDIO_ENABLED = aVar20;
        t78.a<Boolean> aVar21 = new t78.a<>("app_metrics_enabled");
        KEY_METRICS_ENABLED = aVar21;
        t78.a<Boolean> aVar22 = new t78.a<>("app_received_from_server");
        KEY_RECEIVED_FROM_SERVER = aVar22;
        t78.a<Boolean> aVar23 = new t78.a<>("app_background_requests_enabled");
        KEY_BACKGROUND_REQUESTS_ENABLED = aVar23;
        t78.a<Boolean> aVar24 = new t78.a<>("access_to_teammate_enabled");
        KEY_ACCESS_TEAMMATE_ENABLED = aVar24;
        t78.a<Boolean> aVar25 = new t78.a<>("help_center_require_search");
        KEY_HELP_CENTER_REQUIRE_SEARCH = aVar25;
        t78.a<Boolean> aVar26 = new t78.a<>("prevent_multiple_inbound_conversations_enabled");
        KEY_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS = aVar26;
        t78.a<Boolean> aVar27 = new t78.a<>("has_open_conversations");
        KEY_HAS_OPEN_CONVERSATIONS = aVar27;
        t78.a<Boolean> aVar28 = new t78.a<>("article_auto_reaction_enabled");
        KEY_ARTICLE_AUTO_REACTION_ENABLED = aVar28;
        t78.a<Boolean> aVar29 = new t78.a<>("app_identity_verification_enabled");
        KEY_IDENTITY_VERIFICATION_ENABLED = aVar29;
        t78.a<Boolean> aVar30 = new t78.a<>("ask_users_to_allow_notifications");
        KEY_ASK_USERS_TO_ALLOW_NOTIFICATIONS = aVar30;
        t78.a<Boolean> aVar31 = new t78.a<>("push_notifications_banner_dismissed");
        KEY_PUSH_NOTIFICATIONS_BANNER_DISMISSED = aVar31;
        KEY_CRASH_REPORTING_ENABLED = new t78.a<>("crash_reporting_enabled");
        t78.a<Set<String>> aVar32 = new t78.a<>("help_center_urls");
        KEY_HELP_CENTER_URLS = aVar32;
        t78.a<Set<String>> aVar33 = new t78.a<>("features");
        KEY_FEATURES = aVar33;
        Map<String, t78.a<String>> mapI = qi6.i(new js7("app_name", aVar), new js7("app_locale", aVar2), new js7("help_center_locale", aVar3), new js7("app_launcher_logo_url", aVar4), new js7("app_team_greeting", aVar5), new js7("help_center_url", aVar6), new js7("hub_config", aVar7), new js7("app_attachment_settings", aVar8), new js7("session_id", aVar9));
        STRING_MIGRATION_KEYS = mapI;
        Map<String, t78.a<Integer>> mapI2 = qi6.i(new js7("app_primary_color", aVar10), new js7("app_secondary_color", aVar11), new js7("app_rate_limit_count", aVar12));
        INT_MIGRATION_KEYS = mapI2;
        Map<String, t78.a<Long>> mapI3 = qi6.i(new js7("app_user_update_cache_max_age_ms", aVar13), new js7("app_rate_limit_period_ms", aVar14), new js7("app_soft_reset_timeout_ms", aVar15), new js7("new_session_threshold_ms", aVar16));
        LONG_MIGRATION_KEYS = mapI3;
        Map<String, t78.a<Boolean>> mapI4 = qi6.i(new js7("app_inbound_messages", aVar17), new js7("app_primary_color_render_dark_text", aVar18), new js7("app_secondary_color_render_dark_text", aVar19), new js7("app_audio_enabled", aVar20), new js7("app_metrics_enabled", aVar21), new js7("app_received_from_server", aVar22), new js7("app_background_requests_enabled", aVar23), new js7("access_to_teammate_enabled", aVar24), new js7("help_center_require_search", aVar25), new js7("prevent_multiple_inbound_conversations_enabled", aVar26), new js7("has_open_conversations", aVar27), new js7("article_auto_reaction_enabled", aVar28), new js7("app_identity_verification_enabled", aVar29), new js7("ask_users_to_allow_notifications", aVar30), new js7("push_notifications_banner_dismissed", aVar31));
        BOOLEAN_MIGRATION_KEYS = mapI4;
        Map<String, t78.a<Set<String>>> mapI5 = qi6.i(new js7("help_center_urls", aVar32), new js7("features", aVar33));
        STRING_SET_MIGRATION_KEYS = mapI5;
        ALL_MIGRATION_KEY_NAMES = wx7.b(wx7.b(wx7.b(wx7.b(mapI.keySet(), mapI2.keySet()), mapI3.keySet()), mapI4.keySet()), mapI5.keySet());
        appConfigDataStore$delegate = s7.c("intercom_app_config_datastore", null, new q00(0), 10);
    }

    private AppConfigStore(pf2<t78> pf2Var, t72 t72Var) {
        this.dataStore = pf2Var;
        this.scope = t72Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List appConfigDataStore_delegate$lambda$0(Context context) {
        context.getClass();
        return ws0.h(Companion.createSharedPrefsMigration$intercom_sdk_base_release(context));
    }

    public static final AppConfigStore create(Context context, t72 t72Var) {
        return Companion.create(context, t72Var);
    }

    public final void clear() {
        oy0.d(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    public final String generateSessionId() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        oy0.d(this.scope, null, null, new C03241(string, null), 3);
        return string;
    }

    public final AppConfig getAppConfig(int i) {
        try {
            return (AppConfig) oy0.f(ff3.t, new C03251(i, null));
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to load AppConfig from DataStore, returning defaults: ")), new Object[0]);
            return Companion.defaultAppConfig(i);
        }
    }

    public final boolean getPushNotificationsBannerDismissed() {
        try {
            return ((Boolean) oy0.f(ff3.t, new C03261(null))).booleanValue();
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to load push banner dismissed state from DataStore: ")), new Object[0]);
            return false;
        }
    }

    public final String getSessionId() {
        try {
            return (String) oy0.f(ff3.t, new C03271(null));
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to load session ID from DataStore: ")), new Object[0]);
            return null;
        }
    }

    public final void setAppConfig(AppConfig appConfig) {
        appConfig.getClass();
        oy0.d(this.scope, null, null, new C03281(appConfig, null), 3);
    }

    public final void setPushNotificationsBannerDismissed(boolean z) {
        oy0.d(this.scope, null, null, new C03291(z, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        static final /* synthetic */ ho5<Object>[] $$delegatedProperties;

        static {
            oe8 oe8Var = new oe8(Companion.class, "appConfigDataStore", "getAppConfigDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
            ll8.a.getClass();
            $$delegatedProperties = new ho5[]{oe8Var};
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AppConfig defaultAppConfig(int i) {
            int iDarkenColor = ColorUtils.darkenColor(i);
            NexusConfig nexusConfig = new NexusConfig();
            AttachmentSettings attachmentSettings = AttachmentSettings.Companion.getDEFAULT();
            ConversationStateSyncSettings conversationStateSyncSettings = ConversationStateSyncSettings.Companion.getDEFAULT();
            of3 of3Var = of3.t;
            return new AppConfig(BuildConfig.FLAVOR, i, i, iDarkenColor, false, false, false, 100, 60000L, AudioConstants.MAX_RECORDING_DURATION_MS, 20000L, 1000L, true, true, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, true, BuildConfig.FLAVOR, of3Var, of3Var, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, true, false, false, false, null, nexusConfig, attachmentSettings, true, conversationStateSyncSettings, false, true);
        }

        private final pf2<t78> getAppConfigDataStore(Context context) {
            return (pf2) AppConfigStore.appConfigDataStore$delegate.a(context, $$delegatedProperties[0]);
        }

        public final AppConfigStore create(Context context, t72 t72Var) {
            context.getClass();
            t72Var.getClass();
            return new AppConfigStore(getAppConfigDataStore(context), t72Var, null);
        }

        public final AppConfigStore createForTesting$intercom_sdk_base_release(pf2<t78> pf2Var, t72 t72Var) {
            pf2Var.getClass();
            t72Var.getClass();
            return new AppConfigStore(pf2Var, t72Var, null);
        }

        public final ze2<t78> createSharedPrefsMigration$intercom_sdk_base_release(Context context) {
            context.getClass();
            return new AppConfigStore$Companion$createSharedPrefsMigration$1(context);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppConfigStore(pf2 pf2Var, t72 t72Var, qq2 qq2Var) {
        this(pf2Var, t72Var);
    }
}
