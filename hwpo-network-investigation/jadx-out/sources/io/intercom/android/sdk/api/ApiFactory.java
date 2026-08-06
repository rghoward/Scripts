package io.intercom.android.sdk.api;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.intercom.twig.BuildConfig;
import defpackage.g2b;
import defpackage.g52;
import defpackage.l01;
import defpackage.lg7;
import defpackage.mv8;
import defpackage.oh4;
import defpackage.pk;
import defpackage.sp4;
import defpackage.sx;
import defpackage.tx;
import defpackage.ytb;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseAdapterFactory;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.DeviceIdentityStore;
import io.intercom.android.sdk.identity.PushTokenStore;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.utilities.UtilsKt;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import io.intercom.android.sdk.utilities.gson.RuntimeTypeAdapterFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApiFactory {
    public static final int $stable = 0;
    private static final String CACHE_NAME = "Intercom_SDK/HttpCache";
    private static final int CACHE_SIZE = 10485760;
    private static final String ENDPOINT = "/messenger/mobile/";
    public static final ApiFactory INSTANCE = new ApiFactory();
    private static final int INTERCOM_TRAFFIC_TAG = 46837266;
    private static final int MAX_DNS_SEGMENT_SIZE = 63;
    private static final String PARTIAL_HOSTNAME_AUS = ".mobile-messenger.au.intercom.io";
    private static final String PARTIAL_HOSTNAME_EU = ".mobile-messenger.eu.intercom.io";
    private static final String PARTIAL_HOSTNAME_US = ".mobile-messenger.intercom.com";
    private static final String PROTOCOL = "https://";

    private ApiFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ mv8 createKotlinXRetrofit$default(ApiFactory apiFactory, String str, lg7 lg7Var, oh4 oh4Var, int i, Object obj) {
        if ((i & 4) != 0) {
            oh4Var = new tx(0);
        }
        return apiFactory.createKotlinXRetrofit(str, lg7Var, oh4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b createKotlinXRetrofit$lambda$1(Throwable th) {
        th.getClass();
        return g2b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ mv8 createLegacyRetrofit$default(ApiFactory apiFactory, String str, lg7 lg7Var, Gson gson, oh4 oh4Var, int i, Object obj) {
        if ((i & 8) != 0) {
            oh4Var = new sx(0);
        }
        return apiFactory.createLegacyRetrofit(str, lg7Var, gson, oh4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b createLegacyRetrofit$lambda$0(Throwable th) {
        th.getClass();
        return g2b.a;
    }

    private final String getCorrectServerHostname(int i, Context context) {
        if (i == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_aus)) {
            return PARTIAL_HOSTNAME_AUS;
        }
        if (i == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_eu)) {
            return PARTIAL_HOSTNAME_EU;
        }
        if (i == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_us) || i == 0) {
            LumberMill.getLogger().i("Defaulting to US region, since no explicit region was mentioned. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
            return PARTIAL_HOSTNAME_US;
        }
        LumberMill.getLogger().e("Incorrect value for region is provided in AndroidManifest.xml file. Please use one of the available regions values from provided list. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
        return BuildConfig.FLAVOR;
    }

    private final RuntimeTypeAdapterFactory<HomeCards> getHomeCardsAdapterFactory() {
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryOf = RuntimeTypeAdapterFactory.of(HomeCards.class, "type");
        Locale locale = Locale.ROOT;
        String lowerCase = "SPACES".toLowerCase(locale);
        lowerCase.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = runtimeTypeAdapterFactoryOf.registerSubtype(HomeCards.HomeSpacesData.class, lowerCase);
        String lowerCase2 = "NEW_CONVERSATION".toLowerCase(locale);
        lowerCase2.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype2 = runtimeTypeAdapterFactoryRegisterSubtype.registerSubtype(HomeCards.HomeNewConversationData.class, lowerCase2);
        String lowerCase3 = "RECENT_CONVERSATION".toLowerCase(locale);
        lowerCase3.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype3 = runtimeTypeAdapterFactoryRegisterSubtype2.registerSubtype(HomeCards.HomeRecentConversationData.class, lowerCase3);
        String lowerCase4 = "HELP_CENTER".toLowerCase(locale);
        lowerCase4.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype4 = runtimeTypeAdapterFactoryRegisterSubtype3.registerSubtype(HomeCards.HomeHelpCenterData.class, lowerCase4);
        String lowerCase5 = "EXTERNAL_LINKS".toLowerCase(locale);
        lowerCase5.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype5 = runtimeTypeAdapterFactoryRegisterSubtype4.registerSubtype(HomeCards.HomeExternalLinkData.class, lowerCase5);
        String lowerCase6 = "MESSENGER_APP".toLowerCase(locale);
        lowerCase6.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype6 = runtimeTypeAdapterFactoryRegisterSubtype5.registerSubtype(HomeCards.HomeMessengerAppData.class, lowerCase6);
        String lowerCase7 = "RECENT_TICKETS".toLowerCase(locale);
        lowerCase7.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype7 = runtimeTypeAdapterFactoryRegisterSubtype6.registerSubtype(HomeCards.HomeRecentTicketsData.class, lowerCase7);
        String lowerCase8 = "TICKET_LINKS".toLowerCase(locale);
        lowerCase8.getClass();
        RuntimeTypeAdapterFactory<HomeCards> runtimeTypeAdapterFactoryRegisterIgnoredSubtype = runtimeTypeAdapterFactoryRegisterSubtype7.registerSubtype(HomeCards.HomeTicketLinksData.class, lowerCase8).registerIgnoredSubtype(HomeCards.UnSupported.class, "UnSupported");
        runtimeTypeAdapterFactoryRegisterIgnoredSubtype.getClass();
        return runtimeTypeAdapterFactoryRegisterIgnoredSubtype;
    }

    private final RuntimeTypeAdapterFactory<Ticket.TicketAttribute> getTicketTypeAdapterFactory() {
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryOf = RuntimeTypeAdapterFactory.of(Ticket.TicketAttribute.class, "type");
        Locale locale = Locale.ROOT;
        String lowerCase = "STRING".toLowerCase(locale);
        lowerCase.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = runtimeTypeAdapterFactoryOf.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase);
        String lowerCase2 = "INTEGER".toLowerCase(locale);
        lowerCase2.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype2 = runtimeTypeAdapterFactoryRegisterSubtype.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase2);
        String lowerCase3 = "FLOAT".toLowerCase(locale);
        lowerCase3.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype3 = runtimeTypeAdapterFactoryRegisterSubtype2.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase3);
        String lowerCase4 = "BOOLEAN".toLowerCase(locale);
        lowerCase4.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype4 = runtimeTypeAdapterFactoryRegisterSubtype3.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase4);
        String lowerCase5 = "LIST".toLowerCase(locale);
        lowerCase5.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype5 = runtimeTypeAdapterFactoryRegisterSubtype4.registerSubtype(Ticket.TicketAttribute.ListAttribute.class, lowerCase5);
        String lowerCase6 = "DATETIME".toLowerCase(locale);
        lowerCase6.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype6 = runtimeTypeAdapterFactoryRegisterSubtype5.registerSubtype(Ticket.TicketAttribute.DateTimeAttribute.class, lowerCase6);
        String lowerCase7 = "FILES".toLowerCase(locale);
        lowerCase7.getClass();
        RuntimeTypeAdapterFactory<Ticket.TicketAttribute> runtimeTypeAdapterFactoryRegisterIgnoredSubtype = runtimeTypeAdapterFactoryRegisterSubtype6.registerSubtype(Ticket.TicketAttribute.FilesAttribute.class, lowerCase7).registerIgnoredSubtype(Ticket.TicketAttribute.UnSupported.class, "UnSupported");
        runtimeTypeAdapterFactoryRegisterIgnoredSubtype.getClass();
        return runtimeTypeAdapterFactoryRegisterIgnoredSubtype;
    }

    public final String convertHostnameToUrl(String str) {
        str.getClass();
        return PROTOCOL + str + ENDPOINT;
    }

    public final Api createApi(Context context, AppIdentity appIdentity, UserIdentity userIdentity, Provider<AppConfig> provider, OpsMetricTracker opsMetricTracker, IntercomDataLayer intercomDataLayer, UnreadConversationsTracker unreadConversationsTracker, lg7 lg7Var, MessengerApi messengerApi, DeviceIdentityStore deviceIdentityStore, PushTokenStore pushTokenStore) {
        context.getClass();
        appIdentity.getClass();
        userIdentity.getClass();
        provider.getClass();
        opsMetricTracker.getClass();
        intercomDataLayer.getClass();
        unreadConversationsTracker.getClass();
        lg7Var.getClass();
        messengerApi.getClass();
        deviceIdentityStore.getClass();
        pushTokenStore.getClass();
        return new Api(context, appIdentity, userIdentity, lg7Var, messengerApi, new CallbackHolder(intercomDataLayer, userIdentity, unreadConversationsTracker), new RateLimiter(provider.get()), provider, opsMetricTracker, intercomDataLayer, deviceIdentityStore, pushTokenStore);
    }

    public final lg7 createConfigurableHttpClient(Context context, AppIdentity appIdentity, UserIdentity userIdentity, ShutdownStore shutdownStore) {
        context.getClass();
        appIdentity.getClass();
        userIdentity.getClass();
        shutdownStore.getClass();
        lg7.a aVar = new lg7.a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        aVar.b(2L, timeUnit);
        aVar.y = ytb.b(2L, timeUnit);
        aVar.A = ytb.b(2L, timeUnit);
        aVar.c(new TaggingSocketFactory(SocketFactory.getDefault(), INTERCOM_TRAFFIC_TAG));
        UserIdentityInterceptor userIdentityInterceptor = new UserIdentityInterceptor(userIdentity);
        ArrayList arrayList = aVar.c;
        arrayList.add(userIdentityInterceptor);
        arrayList.add(new RetryInterceptor(new RetryInterceptor.Sleeper()));
        arrayList.add(new ShutdownInterceptor(new ShutdownState(shutdownStore, context, appIdentity, TimeProvider.SYSTEM)));
        HeaderInterceptor headerInterceptorCreate = HeaderInterceptor.create(context, appIdentity);
        headerInterceptorCreate.getClass();
        aVar.d.add(headerInterceptorCreate);
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            aVar.l = new l01(new File(cacheDir.getAbsolutePath(), CACHE_NAME));
        }
        return new lg7(aVar);
    }

    public final Gson createGsonWithAdapters() {
        Gson gsonCreate = new GsonBuilder().registerTypeAdapterFactory(getHomeCardsAdapterFactory()).registerTypeAdapterFactory(getTicketTypeAdapterFactory()).create();
        gsonCreate.getClass();
        return gsonCreate;
    }

    public final HelpCenterApi createHelpCenterApi(mv8 mv8Var) {
        return (HelpCenterApi) pk.c(mv8Var, HelpCenterApi.class);
    }

    public final lg7 createHttpClientWithoutHeaders(Context context) {
        context.getClass();
        lg7.a aVar = new lg7.a();
        aVar.c.add(new S3HostRedirectInterceptor());
        return new lg7(aVar);
    }

    public final mv8 createKotlinXRetrofit(String str, lg7 lg7Var, oh4<? super Throwable, g2b> oh4Var) {
        str.getClass();
        lg7Var.getClass();
        oh4Var.getClass();
        mv8.b bVar = new mv8.b();
        bVar.a(str);
        bVar.d.add(new NetworkResponseAdapterFactory(oh4Var));
        g52.a convertorFactory = KotlinXConvertorFactory.INSTANCE.getConvertorFactory();
        Objects.requireNonNull(convertorFactory, "factory == null");
        bVar.c.add(convertorFactory);
        bVar.a = lg7Var;
        return bVar.b();
    }

    public final mv8 createLegacyRetrofit(String str, lg7 lg7Var, Gson gson, oh4<? super Throwable, g2b> oh4Var) {
        str.getClass();
        lg7Var.getClass();
        gson.getClass();
        oh4Var.getClass();
        mv8.b bVar = new mv8.b();
        bVar.a(str);
        bVar.d.add(new NetworkResponseAdapterFactory(oh4Var));
        bVar.c.add(new sp4(gson));
        bVar.a = lg7Var;
        return bVar.b();
    }

    public final MessengerApi createMessengerApi(mv8 mv8Var) {
        return (MessengerApi) pk.c(mv8Var, MessengerApi.class);
    }

    public final SurveyApi createSurveyApi(mv8 mv8Var) {
        return (SurveyApi) pk.c(mv8Var, SurveyApi.class);
    }

    public final TicketApi createTicketApi(mv8 mv8Var) {
        return (TicketApi) pk.c(mv8Var, TicketApi.class);
    }

    public final String createUniqueIdentifier(String str) {
        str.getClass();
        String str2 = removeInvalidCharacters(str) + "-android";
        int length = str2.length();
        int i = MAX_DNS_SEGMENT_SIZE;
        if (length <= MAX_DNS_SEGMENT_SIZE) {
            return str2;
        }
        if (str2.charAt(62) == '-') {
            i = 62;
        }
        return str2.substring(0, i);
    }

    public final String getFullHostname(String str, Context context) {
        str.getClass();
        context.getClass();
        return createUniqueIdentifier(str) + getCorrectServerHostname(UtilsKt.getServerRegionFromManifest(context), context);
    }

    public final String getServerUrl(AppIdentity appIdentity, Context context) {
        String string;
        appIdentity.getClass();
        context.getClass();
        String hostFromManifest = UtilsKt.readHostFromManifest(context);
        if (TextUtils.isEmpty(hostFromManifest)) {
            String strAppId = appIdentity.appId();
            strAppId.getClass();
            string = getFullHostname(strAppId, context);
        } else {
            StringBuilder sb = new StringBuilder();
            String strAppId2 = appIdentity.appId();
            strAppId2.getClass();
            sb.append(createUniqueIdentifier(strAppId2));
            sb.append(hostFromManifest);
            string = sb.toString();
        }
        return convertHostnameToUrl(string);
    }

    public final ExternalUploadApi getUploadApi(mv8 mv8Var) {
        return (ExternalUploadApi) pk.c(mv8Var, ExternalUploadApi.class);
    }

    public final String removeInvalidCharacters(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile("[^A-Za-z0-9\\-$]");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll(BuildConfig.FLAVOR);
        strReplaceAll.getClass();
        return strReplaceAll;
    }
}
