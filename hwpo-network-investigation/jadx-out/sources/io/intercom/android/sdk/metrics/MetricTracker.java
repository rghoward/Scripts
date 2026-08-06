package io.intercom.android.sdk.metrics;

import io.intercom.android.sdk.BuildConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.user.DeviceData;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MetricTracker {
    static final String METADATA_BADGE_VALUE = "badge_value";
    static final String METADATA_CLOSED_CONVERSATION_ID = "closed_conversation_id";
    static final String METADATA_COMMENT_ID = "comment_id";
    static final String METADATA_CONTENT_TYPE = "content_type";
    static final String METADATA_CONVERSATION_ID = "conversation_id";
    static final String METADATA_ERROR = "error";
    static final String METADATA_FILTERED = "filtered";
    static final String METADATA_HAS_ARTICLE_CARD = "has_article_card";
    static final String METADATA_HOME_SCREEN_INDEX = "home_screen_index";
    static final String METADATA_INSTANCE_ID = "instance_id";
    static final String METADATA_IS_ATTACHMENT = "is_attachment";
    static final String METADATA_IS_GIF = "is_gif";
    static final String METADATA_MAX_STEPS = "max_steps";
    static final String METADATA_MESSAGE_ID = "message_id";
    static final String METADATA_MESSAGE_TYPE = "message_type";
    static final String METADATA_PART_ID = "part_id";
    static final String METADATA_PERMISSION_GRANTED = "permission_granted";
    static final String METADATA_PLATFORM = "platform";
    static final String METADATA_PUSH_TYPE = "push_type";
    static final String METADATA_QUICK_REPLY_ID = "quick_reply_id";
    static final String METADATA_REACTION_INDEX = "reaction_index";
    static final String METADATA_REQUEST_CONTENT_ID = "requested_content_id";
    static final String METADATA_REQUEST_ERROR_CODE = "error_code";
    static final String METADATA_SCREENS_IN_MESSAGE = "screens_in_message";
    static final String METADATA_SCREENS_SEEN = "screens_seen";
    static final String METADATA_SCREENS_SHOWN = "screens_shown";
    static final String METADATA_SEARCH_QUERY = "search_query";
    static final String METADATA_SOURCE = "source";
    static final String METADATA_SPACE = "space";
    static final String METADATA_STEPS_COMPLETE = "steps_complete";
    static final String METADATA_SUGGESTION_ID = "suggestion_id";
    static final String METADATA_SURVEY_FORMAT = "format";
    static final String METADATA_SURVEY_ID = "survey_id";
    static final String METADATA_TEAMMATE_STATUS = "teammate_status";
    static final String METADATA_TICKET_ID = "ticket_id";
    static final String METADATA_TIME_SINCE_LAST_ACTIVE = "time_since_last_active";
    static final String METADATA_URL = "url";
    static final String METADATA_VIDEO_HEIGHT = "video_height";
    static final String METADATA_VIDEO_URL = "video_url";
    static final String METADATA_VIDEO_WIDTH = "video_width";
    static final String METADATA_WITHIN_OFFICE_HOURS = "within_office_hours";
    static final String QUESTIONS_SEEN = "questions_seen";
    static final String TICKET_STATUS = "ticket_status";
    static final String TICKET_TYPE_ID = "ticket_type_id";
    static final String VALUE_ACTIVE = "active";
    static final String VALUE_ANDROID_SDK = "android-sdk";
    static final String VALUE_AWAY = "away";
    static final String VALUE_MESSAGE = "message";
    static final String VALUE_NOTIFICATION = "notification";
    private final String appMinSdkVersion;
    private final String appName;
    private final String appVersion;
    private final String sdkVersion;
    private final MetricsStore store;
    private final TimeProvider timeProvider;
    private final UserIdentity userIdentity;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Action {
        public static final String CLICKED = "clicked";
        public static final String CLOSED = "closed";
        public static final String COMPLETED = "completed";
        public static final String DISMISSED = "dismissed";
        public static final String FAILED = "failed";
        public static final String LOADED = "loaded";
        public static final String OPENED = "opened";
        public static final String RECEIVED = "received";
        public static final String REQUESTED = "requested";
        public static final String SEARCHED = "searched";
        public static final String SENT = "sent";
        public static final String STARTED = "started";
        public static final String SUBMITTED = "submitted";
        public static final String TYPED = "typed";
        public static final String VIEWED = "viewed";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarouselSource {
        public static final String AUTOMATIC = "automatic";
        public static final String PROGRAMMATIC = "programmatic";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CloseActionContext {
        public static final int BACK_BUTTON = 1;
        public static final int CLOSE_BUTTON = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Context {
        public static final String ARTICLE = "article";
        public static final String CONVERSATION = "conversation";
        public static final String EXISTING_CONVERSATION = "existing_conversation";
        public static final String FROM_ANDROID_BACK_BUTTON = "from_android_back_button";
        public static final String FROM_ARTICLE_ON_BUTTON = "from_article_on_button";
        public static final String FROM_AUTO = "from_auto";
        public static final String FROM_AUTOMATIC = "from_automatic";
        public static final String FROM_CAROUSEL = "from_carousel";
        public static final String FROM_CLICKING = "from_clicking";
        public static final String FROM_CLOSED_CONVERSATION = "from_closed_conversation";
        public static final String FROM_CLOSE_BUTTON = "from_close_button";
        public static final String FROM_CONVERSATION = "from_conversation";
        public static final String FROM_CONVERSATION_LIST = "from_conversation_list";
        public static final String FROM_CTA = "from_cta";
        public static final String FROM_CUSTOM_LAUNCHER = "from_custom_launcher";
        public static final String FROM_FULL = "from_full";
        public static final String FROM_HELP_CENTER_WEBVIEW = "from_help_center_webview";
        public static final String FROM_LAUNCHER = "from_launcher";
        public static final String FROM_NEW_CONVERSATION = "from_new_conversation";
        public static final String FROM_ONWARD_DEEP_LINK = "from_onward_deep_link";
        public static final String FROM_ONWARD_EXTERNAL_LINK = "from_onward_external_link";
        public static final String FROM_PERMISSION = "from_permission";
        public static final String FROM_PERMISSION_SKIPPED = "from_permission_skipped";
        public static final String FROM_PROGRAMMATIC = "from_programmatic";
        public static final String FROM_PUSH = "from_push";
        public static final String FROM_RETRY = "from_retry";
        public static final String FROM_SCROLLING = "from_scrolling";
        public static final String FROM_SNIPPET = "from_snippet";
        public static final String FROM_TICKETS_SPACE = "from_tickets_space";
        public static final String HOME_SCREEN = "home_screen";
        public static final String IN_CONVERSATION = "in_conversation";
        public static final String IN_FOLLOWUP_CONVERSATION = "in_followup_conversation";
        public static final String IN_NEW_CONVERSATION = "in_new_conversation";
        public static final String MESSENGER = "messenger";
        public static final String MORE_MENU = "more_menu";
        public static final String NEW_CONVERSATION = "new_conversation";
        public static final String NO_CONTEXT = "no_context";
        public static final String ON_ARTICLE = "on_article";
        public static final String REACTION_HAPPY = "reaction_happy";
        public static final String REACTION_NEUTRAL = "reaction_neutral";
        public static final String REACTION_SAD = "reaction_sad";
        public static final String RECENT_ACTIVITY = "recent_activity";
        public static final String SPACE_HELP = "help";
        public static final String SPACE_HOME = "home";
        public static final String SPACE_MESSAGES = "messages";
        public static final String STYLE_BOT = "style_bot";
        public static final String STYLE_HUMAN = "style_human";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public @interface InAppMessageViewContext {
        public static final int FULL = 1;
        public static final int SNIPPET = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Name {
        public static final String CAROUSEL = "carousel_metric";
        public static final String EDUCATE = "educate_event";
        public static final String MESSENGER = "m5_metric";
        public static final String SEARCH_BROWSE = "search_browse_event";
        public static final String SURVEY = "survey_metric";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Object {
        public static final String ARTICLE = "article";
        public static final String ARTICLE_REACTION = "article_reaction";
        public static final String ARTICLE_SUGGESTION = "article_suggestion";
        public static final String ARTICLE_SUGGESTIONS = "article_suggestions";
        public static final String BADGE = "badge";
        public static final String CAMERA_INPUT = "camera_input";
        public static final String CAROUSEL_MESSAGE = "carousel_message";
        public static final String CAROUSEL_MESSAGE_PRELOAD = "carousel_message_preload";
        public static final String CAROUSEL_PERMISSION_DIALOG = "carousel_permission_dialog";
        public static final String CAROUSEL_PERMISSION_SETTINGS = "carousel_permission_settings";
        public static final String CAROUSEL_PERMISSION_SKIPPED = "carousel_permission_skipped";
        public static final String COMPOSER_SUGGESTIONS = "composer_suggestions";
        public static final String CONVERSATION = "conversation";
        public static final String CONVERSATION_LIST = "conversation_list";
        public static final String CREATE_TICKET_FORM = "create_ticket_form";
        public static final String EXPANDED_GIF_INPUT = "expanded_gif_input";
        public static final String EXPANDED_IMAGE_INPUT = "expanded_image_input";
        public static final String EXTERNAL_LINK = "external_link";
        public static final String FILE_INPUT = "file_input";
        public static final String GALLERY_INPUT = "gallery_input";
        public static final String GIF_INPUT = "gif_input";
        public static final String HELP = "help";
        public static final String HELP_CENTER = "help_center";
        public static final String HELP_CENTER_DATA_API = "help_center_data";
        public static final String IMAGE_INPUT = "image_input";
        public static final String INPUT = "input";
        public static final String IN_APP_ON_LEGACY_ACTIVITY = "in_app_on_legacy_activity";
        public static final String LAUNCHER = "launcher";
        public static final String MESSAGE = "message";
        public static final String MESSAGES = "messages";
        public static final String MESSENGER = "messenger";
        public static final String MESSENGER_SHEET = "messenger_sheet";
        public static final String MORE_MENU = "more_menu";
        public static final String NEW_CONVERSATION = "new_conversation";
        public static final String OPERATOR_REPLY = "operator_reply";
        public static final String PUSH_BACKSTACK_ITEM = "push_backstack_item";
        public static final String QUICK_REPLIES = "quick_replies";
        public static final String QUICK_REPLY = "quick_reply";
        public static final String REACTION = "reaction";
        public static final String RECENT_CONVERSATION = "recent_conversation";
        public static final String RECENT_TICKET = "recent_tickets";
        public static final String REPLY = "reply";
        public static final String SEARCH_BROWSE_CARD = "search_browse_card";
        public static final String SEARCH_BROWSE_CARD_INPUT = "search_browse_card_input";
        public static final String SPACE_HELP = "help";
        public static final String SPACE_HOME = "home";
        public static final String SPACE_MESSAGES = "messages";
        public static final String SPACE_TICKETS = "tickets";
        public static final String SUGGESTION = "suggestion";
        public static final String SURVEY = "survey";
        public static final String SURVEY_STEP_ERROR = "step_error";
        public static final String SURVEY_STEP_LOADING = "step_load";
        public static final String TEAMMATE_PROFILE = "teammate_profile";
        public static final String TEAM_PROFILE = "team_profile";
        public static final String TEXT_INPUT = "text_input";
        public static final String TICKETS = "tickets";
        public static final String TICKET_DETAILS = "ticket_details";
        public static final String VIDEO_MESSAGE = "video_auto_message";
        public static final String WE_RUN_ON_INTERCOM = "we_run_on_intercom";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Owner {
        public static final String EDUCATE = "educate";
        public static final String MESSENGER = "messenger";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Place {
        public static final String API = "api";
        public static final String ARTICLE = "article";
        public static final String ARTICLE_LIST = "article_list";
        public static final String CAROUSEL_MESSAGE = "carousel_message";
        public static final String COLLECTION_LIST = "collection_list";
        public static final String CONVERSATION = "conversation";
        public static final String HOME_SCREEN = "home";
        public static final String IN_APP = "in_app";
        public static final String LEGACY_ARTICLE_SEARCH_APP = "legacy_article_search_app";
        public static final String MESSENGER = "messenger";
        public static final String MESSENGER_CARD = "messenger_card";
        public static final String MESSENGER_HOME_APP = "messenger_home_app";
        public static final String PUSH = "push";
        public static final String SEARCH_BROWSE = "search_browse";
        public static final String SEARCH_BROWSE_CARD = "search_browse_card";
        public static final String SEARCH_RESULTS = "search_results";
        public static final String SURVEY = "survey";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum ReactionLocation {
        CONVERSATION,
        IN_APP,
        LINK
    }

    public MetricTracker(UserIdentity userIdentity, MetricsStore metricsStore, TimeProvider timeProvider, android.content.Context context) {
        this.userIdentity = userIdentity;
        this.timeProvider = timeProvider;
        this.store = metricsStore;
        this.sdkVersion = BuildConfig.VERSION_NAME;
        this.appVersion = DeviceUtils.getAppVersion(context);
        this.appMinSdkVersion = DeviceUtils.getAppMinSdkVersionVersion(context);
        this.appName = DeviceData.getApplicationName(context);
    }

    private void addMetadataToMetricObject(MetricObject metricObject, Map<String, java.lang.Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            metricObject.addMetaData(str, map.get(str));
        }
    }

    private static String contextForInApp(int i) {
        return i == 0 ? Context.FROM_SNIPPET : Context.FROM_FULL;
    }

    private static String contextFrom(LauncherOpenBehaviour.LauncherType launcherType) {
        return LauncherOpenBehaviour.LauncherType.DEFAULT == launcherType ? Context.FROM_LAUNCHER : Context.FROM_CUSTOM_LAUNCHER;
    }

    private MetricObject createMetric(String str, String str2, String str3, String str4, String str5, String str6) {
        return new MetricObject(str, str2, UUID.randomUUID().toString(), this.userIdentity.getIntercomId(), str3, str4, str5, str6, this.timeProvider, this.appVersion, this.sdkVersion, this.appMinSdkVersion, this.appName);
    }

    private MetricObject newCarouselMetric(String str, String str2, String str3, String str4) {
        return createMetric(Name.CAROUSEL, "messenger", str, str2, "carousel_message", str3).addMetaData(METADATA_SOURCE, str4);
    }

    private MetricObject newEducateMetric(String str, String str2, String str3, String str4) {
        return createMetric(Name.EDUCATE, Owner.EDUCATE, str, str2, str3, str4);
    }

    private MetricObject newHelpCenterMetric(String str, String str2, String str3, String str4, boolean z) {
        return createMetric(z ? Name.SEARCH_BROWSE : Name.EDUCATE, Owner.EDUCATE, str, str2, str3, str4);
    }

    private MetricObject newMetric(String str, String str2, String str3, String str4) {
        return createMetric(Name.MESSENGER, "messenger", str, str2, str3, str4);
    }

    private MetricObject newSurveyMetric(String str, String str2, String str3) {
        return createMetric(Name.SURVEY, "messenger", str, str2, "survey", str3);
    }

    private void track(MetricObject metricObject) {
        this.store.track(metricObject);
    }

    public void clickedArticleSuggestion(String str) {
        track(createMetric(Name.MESSENGER, "messenger", Action.CLICKED, Object.ARTICLE_SUGGESTION, "search_browse_card", "messenger").addMetaData("article_id", str));
    }

    public void clickedComposerSuggestion(String str, String str2, String str3) {
        track(newMetric(Action.CLICKED, Object.SUGGESTION, "messenger", Context.IN_CONVERSATION).addMetaData("conversation_id", str2).addMetaData(METADATA_PART_ID, str3).addMetaData(METADATA_SUGGESTION_ID, str));
    }

    public void clickedExternalLinkCard() {
        track(newMetric(Action.CLICKED, Object.EXTERNAL_LINK, "messenger", "home"));
    }

    public void clickedInput(String str, String str2) {
        track(newMetric(Action.CLICKED, str2, "messenger", Context.IN_CONVERSATION).addMetaData("conversation_id", str));
    }

    public void clickedLauncher() {
        track(newMetric(Action.CLICKED, Object.LAUNCHER, "messenger", Context.NO_CONTEXT));
    }

    public void clickedNewConversation(String str, String str2, boolean z) {
        track(newHelpCenterMetric(Action.CLICKED, "new_conversation", str, str2, z));
    }

    public void clickedPoweredBy(String str) {
        track(newMetric(Action.CLICKED, Object.WE_RUN_ON_INTERCOM, "messenger", str));
    }

    public void clickedQuickReply(String str, String str2, String str3) {
        track(newMetric(Action.CLICKED, Object.QUICK_REPLY, "messenger", Context.IN_CONVERSATION).addMetaData("conversation_id", str2).addMetaData(METADATA_PART_ID, str3).addMetaData(METADATA_QUICK_REPLY_ID, str));
    }

    public void clickedSearchBrowseCard() {
        track(createMetric(Name.EDUCATE, "messenger", Action.CLICKED, Object.SEARCH_BROWSE_CARD_INPUT, "home", "messenger"));
    }

    public void clickedSpace(String str) {
        track(newMetric(Action.CLICKED, str, "messenger", "home"));
    }

    public void closedInAppFromFull(String str, String str2) {
        track(newMetric(Action.CLOSED, "message", Place.IN_APP, Context.FROM_FULL).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData("conversation_id", str));
    }

    public void closedMessengerBackButton() {
        track(newMetric(Action.CLOSED, "messenger", "messenger", Context.FROM_ANDROID_BACK_BUTTON));
    }

    public void closedMessengerCloseButton() {
        track(newMetric(Action.CLOSED, "messenger", "messenger", Context.FROM_CLOSE_BUTTON));
    }

    public void closedMessengerSheet(String str, String str2, boolean z) {
        track(newMetric(Action.CLOSED, Object.MESSENGER_SHEET, "messenger", z ? Context.HOME_SCREEN : "conversation").addMetaData(METADATA_URL, str2).addMetaData("conversation_id", str));
    }

    public void completedCarousel(String str, String str2, String str3, int i, int i2) {
        track(newCarouselMetric(Action.COMPLETED, "carousel_message", str, str2, str3).addMetaData(METADATA_SCREENS_IN_MESSAGE, Integer.valueOf(i)).addMetaData(METADATA_SCREENS_SHOWN, Integer.valueOf(i2)));
    }

    public void completedVideo() {
        track(newMetric(Action.COMPLETED, Object.VIDEO_MESSAGE, Place.IN_APP, "conversation"));
    }

    public void conversationsInMoreMenuClicked(String str) {
        track(newMetric(Action.CLICKED, "messages", "conversation", str));
    }

    public void dismissInAppCommentSnippet(String str, String str2) {
        track(newMetric(Action.DISMISSED, Object.REPLY, Place.IN_APP, Context.FROM_SNIPPET).addMetaData("conversation_id", str).addMetaData(METADATA_COMMENT_ID, str2));
    }

    public void dismissInAppMessageSnippet(String str, String str2) {
        track(newMetric(Action.DISMISSED, "message", Place.IN_APP, Context.FROM_SNIPPET).addMetaData("conversation_id", str).addMetaData(METADATA_MESSAGE_ID, str2));
    }

    public void dismissedCarousel(String str, String str2, String str3, int i, int i2, int i3) {
        track(newCarouselMetric(Action.DISMISSED, "carousel_message", str, str2, str3).addMetaData(METADATA_SCREENS_IN_MESSAGE, Integer.valueOf(i)).addMetaData(METADATA_SCREENS_SHOWN, Integer.valueOf(i2)).addMetaData(METADATA_SCREENS_SEEN, Integer.valueOf(i3)));
    }

    public void dismissedCarouselFetching(String str, String str2, String str3) {
        track(newCarouselMetric(Action.DISMISSED, Object.CAROUSEL_MESSAGE_PRELOAD, str, str3).addMetaData(METADATA_REQUEST_CONTENT_ID, str2));
    }

    public void dismissedPushNotification(String str) {
        track(newMetric(Action.DISMISSED, "message", Place.IN_APP, Context.FROM_PUSH).addMetaData("conversation_id", str).addMetaData(METADATA_PUSH_TYPE, VALUE_NOTIFICATION));
    }

    public void dismissedPushOnlyNotification(String str, String str2) {
        track(newMetric(Action.DISMISSED, "message", Place.IN_APP, Context.FROM_PUSH).addMetaData("conversation_id", str).addMetaData(METADATA_INSTANCE_ID, str2).addMetaData(METADATA_PUSH_TYPE, "message"));
    }

    public void educateWebviewMetric(String str, String str2, String str3, Map<String, java.lang.Object> map, String str4) {
        MetricObject metricObjectNewEducateMetric = newEducateMetric(str, str2, str3, str4);
        if (str4.equals(Context.FROM_ARTICLE_ON_BUTTON)) {
            metricObjectNewEducateMetric.addMetaData(METADATA_SOURCE, CarouselSource.PROGRAMMATIC);
        } else {
            metricObjectNewEducateMetric.addMetaData(METADATA_SOURCE, CarouselSource.AUTOMATIC);
        }
        addMetadataToMetricObject(metricObjectNewEducateMetric, map);
        track(metricObjectNewEducateMetric);
    }

    public void expandedInput(String str) {
        track(newMetric("opened", Object.EXPANDED_GIF_INPUT, "messenger", Context.IN_CONVERSATION).addMetaData("conversation_id", str));
    }

    public void failedCarousel(String str, String str2, int i) {
        track(newCarouselMetric(Action.FAILED, Object.CAROUSEL_MESSAGE_PRELOAD, Context.FROM_CAROUSEL, str2).addMetaData(METADATA_REQUEST_ERROR_CODE, Integer.valueOf(i)).addMetaData(METADATA_REQUEST_CONTENT_ID, str));
    }

    public void failedHelpCenter(String str, String str2, String str3, boolean z) {
        MetricObject metricObjectNewHelpCenterMetric = newHelpCenterMetric(Action.FAILED, str, str2, Context.NO_CONTEXT, z);
        if (str3 != null) {
            metricObjectNewHelpCenterMetric.addMetaData(METADATA_ERROR, str3);
        }
        track(metricObjectNewHelpCenterMetric);
    }

    public void failedToPlayVideo(String str) {
        track(newMetric(Action.FAILED, Object.VIDEO_MESSAGE, Place.IN_APP, "conversation").addMetaData(METADATA_VIDEO_URL, str));
    }

    public void helpInMoreMenuClicked(String str) {
        track(newMetric(Action.CLICKED, "help", "conversation", str));
    }

    public void loadedVideo(String str, int i, int i2) {
        track(newMetric(Action.LOADED, Object.VIDEO_MESSAGE, Place.IN_APP, "conversation").addMetaData(METADATA_VIDEO_URL, str).addMetaData(METADATA_VIDEO_WIDTH, Integer.valueOf(i)).addMetaData(METADATA_VIDEO_HEIGHT, Integer.valueOf(i2)));
    }

    public void messengerCardWebViewEvent(String str, String str2, String str3, Map<String, java.lang.Object> map, boolean z) {
        MetricObject metricObjectNewEducateMetric = newEducateMetric(str, str2, str3, z ? Context.HOME_SCREEN : "conversation");
        addMetadataToMetricObject(metricObjectNewEducateMetric, map);
        track(metricObjectNewEducateMetric);
    }

    public void moreMenuClicked(String str) {
        track(newMetric(Action.CLICKED, "more_menu", "conversation", str));
    }

    public void newConversationInMoreMenuClicked(String str) {
        track(newMetric(Action.CLICKED, "new_conversation", "conversation", str));
    }

    public void openConversationFromConversationList(String str, boolean z, boolean z2, String str2) {
        track(newMetric("opened", "conversation", "messenger", Context.FROM_CONVERSATION_LIST).addMetaData("conversation_id", str).addMetaData(METADATA_WITHIN_OFFICE_HOURS, Boolean.valueOf(z)).addMetaData(METADATA_TEAMMATE_STATUS, z2 ? VALUE_ACTIVE : VALUE_AWAY).addMetaData(METADATA_TIME_SINCE_LAST_ACTIVE, str2));
    }

    public void openConversationsListFromConversation(String str) {
        track(newMetric("opened", Object.CONVERSATION_LIST, "messenger", Context.FROM_CONVERSATION).addMetaData("conversation_id", str));
    }

    public void openConversationsListFromNewConversation() {
        track(newMetric("opened", Object.CONVERSATION_LIST, "messenger", Context.FROM_NEW_CONVERSATION));
    }

    public void openedCarousel(String str, String str2, int i, int i2) {
        track(newCarouselMetric("opened", "carousel_message", Context.FROM_CAROUSEL, str, str2).addMetaData(METADATA_SCREENS_IN_MESSAGE, Integer.valueOf(i)).addMetaData(METADATA_SCREENS_SHOWN, Integer.valueOf(i2)));
    }

    public void openedConversationFromFull(String str, String str2) {
        track(newMetric("opened", "conversation", "messenger", Context.FROM_FULL).addMetaData(METADATA_COMMENT_ID, str2).addMetaData("conversation_id", str));
    }

    public void openedConversationFromSnippet(String str, String str2) {
        track(newMetric("opened", "conversation", "messenger", Context.FROM_SNIPPET).addMetaData(METADATA_COMMENT_ID, str2).addMetaData("conversation_id", str));
    }

    public void openedMessengerConversation(String str, LauncherOpenBehaviour.LauncherType launcherType) {
        track(newMetric("opened", "conversation", "messenger", contextFrom(launcherType)).addMetaData("conversation_id", str));
    }

    public void openedMessengerConversationList(LauncherOpenBehaviour.LauncherType launcherType) {
        track(newMetric("opened", Object.CONVERSATION_LIST, "messenger", contextFrom(launcherType)));
    }

    public void openedMessengerNewConversation(LauncherOpenBehaviour.LauncherType launcherType) {
        track(newMetric("opened", "new_conversation", "messenger", contextFrom(launcherType)));
    }

    public void openedNativeHelpCenter(String str, String str2) {
        if (str2 == null) {
            str2 = Context.NO_CONTEXT;
        }
        track(newHelpCenterMetric("opened", Object.HELP_CENTER, str, str2, "search_browse".equals(str)));
    }

    public void openedNativeHelpCenterSearchResult(boolean z, String str) {
        track(newHelpCenterMetric(Action.CLICKED, Object.HELP_CENTER, Place.SEARCH_RESULTS, Context.NO_CONTEXT, z).addMetaData(METADATA_SEARCH_QUERY, str));
    }

    public void openedPushOnlyNotification(String str) {
        track(newMetric("opened", "message", Place.IN_APP, Context.FROM_PUSH).addMetaData("conversation_id", str).addMetaData(METADATA_PUSH_TYPE, "message"));
    }

    public void receivedComposerSuggestions(String str, String str2, String str3) {
        track(newMetric(Action.RECEIVED, Object.COMPOSER_SUGGESTIONS, "messenger", Context.IN_CONVERSATION).addMetaData("conversation_id", str2).addMetaData(METADATA_PART_ID, str3).addMetaData(METADATA_SUGGESTION_ID, str));
    }

    public void receivedInAppOnLegacyActivity() {
        track(newMetric(Action.RECEIVED, Object.IN_APP_ON_LEGACY_ACTIVITY, Place.IN_APP, Context.NO_CONTEXT));
    }

    public void receivedMessageFromFullWhenClosed(boolean z, boolean z2, String str, String str2, MessageStyle messageStyle) {
        track(newMetric(Action.RECEIVED, "message", Place.IN_APP, Context.FROM_FULL).addMetaData("conversation_id", str).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_MESSAGE_TYPE, messageStyle.name().toLowerCase()).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_HAS_ARTICLE_CARD, Boolean.valueOf(z2)));
    }

    public void receivedMessageFromSnippetWhenClosed(boolean z, boolean z2, String str, String str2, MessageStyle messageStyle) {
        track(newMetric(Action.RECEIVED, "message", Place.IN_APP, Context.FROM_SNIPPET).addMetaData("conversation_id", str).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_MESSAGE_TYPE, messageStyle.name().toLowerCase()).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_HAS_ARTICLE_CARD, Boolean.valueOf(z2)));
    }

    public void receivedNotificationFromBadgeWhenMessengerClosed(String str) {
        track(newMetric(Action.RECEIVED, Object.BADGE, Place.IN_APP, Context.FROM_LAUNCHER).addMetaData(METADATA_BADGE_VALUE, str));
    }

    public void receivedOperatorReply(String str) {
        track(newEducateMetric(Action.RECEIVED, Object.OPERATOR_REPLY, "messenger", Context.FROM_CONVERSATION).addMetaData("conversation_id", str));
    }

    public void receivedPushNotification(String str) {
        track(newMetric(Action.RECEIVED, "message", Place.PUSH, Context.FROM_PUSH).addMetaData("conversation_id", str).addMetaData(METADATA_PUSH_TYPE, VALUE_NOTIFICATION));
    }

    public void receivedPushOnlyNotification(String str, String str2) {
        track(newMetric(Action.RECEIVED, "message", Place.PUSH, Context.FROM_PUSH).addMetaData("conversation_id", str).addMetaData(METADATA_INSTANCE_ID, str2).addMetaData(METADATA_PUSH_TYPE, "message"));
    }

    public void receivedQuickReply(String str, String str2, String str3) {
        track(newMetric(Action.RECEIVED, Object.QUICK_REPLIES, "messenger", Context.IN_CONVERSATION).addMetaData("conversation_id", str2).addMetaData(METADATA_PART_ID, str3).addMetaData(METADATA_QUICK_REPLY_ID, str));
    }

    public void receivedReply(boolean z, boolean z2, String str, String str2) {
        track(newMetric(Action.RECEIVED, Object.REPLY, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_HAS_ARTICLE_CARD, Boolean.valueOf(z2)).addMetaData(METADATA_PART_ID, str).addMetaData("conversation_id", str2));
    }

    public void receivedReplyFromSnippetWhenClosed(boolean z, boolean z2, String str, String str2) {
        track(newMetric(Action.RECEIVED, Object.REPLY, Place.IN_APP, Context.FROM_SNIPPET).addMetaData("conversation_id", str).addMetaData(METADATA_COMMENT_ID, str2).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_HAS_ARTICLE_CARD, Boolean.valueOf(z2)));
    }

    public void requestedHelpCenterData(String str) {
        track(newEducateMetric(Action.REQUESTED, Object.HELP_CENTER_DATA_API, str, Context.NO_CONTEXT));
    }

    public void requestedPermission(String str, String str2, String str3, boolean z) {
        track(newCarouselMetric(Action.CLICKED, Object.CAROUSEL_PERMISSION_DIALOG, str, str2, str3).addMetaData(METADATA_PERMISSION_GRANTED, Boolean.valueOf(z)));
    }

    public void retriedCarouselFetching(String str, String str2) {
        track(newCarouselMetric(Action.CLICKED, Object.CAROUSEL_MESSAGE_PRELOAD, Context.FROM_RETRY, str2).addMetaData(METADATA_REQUEST_CONTENT_ID, str));
    }

    public void searchedGifInput(String str) {
        track(newMetric(Action.SEARCHED, Object.EXPANDED_GIF_INPUT, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_SEARCH_QUERY, str));
    }

    public void searchedNativeHelpCenter(boolean z) {
        track(newHelpCenterMetric(Action.SEARCHED, Object.HELP_CENTER, Place.SEARCH_RESULTS, Context.NO_CONTEXT, z));
    }

    public void sentArticleReaction(String str, Boolean bool, boolean z) {
        MetricObject metricObjectNewHelpCenterMetric = newHelpCenterMetric(Action.SENT, Object.ARTICLE_REACTION, "article", str, z);
        if (bool != null) {
            metricObjectNewHelpCenterMetric.addMetaData("conversation_shown", bool);
        }
        track(metricObjectNewHelpCenterMetric);
    }

    public void sentInConversation(boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, String str3) {
        track(newMetric(Action.SENT, Object.REPLY, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_IS_GIF, Boolean.valueOf(z2)).addMetaData(METADATA_MESSAGE_ID, str).addMetaData("conversation_id", str2).addMetaData(METADATA_WITHIN_OFFICE_HOURS, Boolean.valueOf(z3)).addMetaData(METADATA_TEAMMATE_STATUS, z4 ? VALUE_ACTIVE : VALUE_AWAY).addMetaData(METADATA_TIME_SINCE_LAST_ACTIVE, str3));
    }

    public void sentInNewConversation(boolean z, boolean z2, String str, String str2, boolean z3) {
        track(newMetric(Action.SENT, "message", "messenger", Context.IN_NEW_CONVERSATION).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_IS_GIF, Boolean.valueOf(z2)).addMetaData(METADATA_MESSAGE_ID, str).addMetaData("conversation_id", str2).addMetaData(METADATA_WITHIN_OFFICE_HOURS, Boolean.valueOf(z3)));
    }

    public void sentInNewFollowupConversation(boolean z, boolean z2, String str, String str2, boolean z3, String str3) {
        track(newMetric(Action.SENT, "message", "messenger", Context.IN_FOLLOWUP_CONVERSATION).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_IS_GIF, Boolean.valueOf(z2)).addMetaData(METADATA_MESSAGE_ID, str).addMetaData("conversation_id", str2).addMetaData(METADATA_WITHIN_OFFICE_HOURS, Boolean.valueOf(z3)).addMetaData(METADATA_CLOSED_CONVERSATION_ID, str3));
    }

    public void sentReaction(String str, String str2, int i, ReactionLocation reactionLocation) {
        if (ReactionLocation.CONVERSATION == reactionLocation) {
            track(newMetric(Action.SENT, Object.REACTION, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_REACTION_INDEX, Integer.valueOf(i)).addMetaData("conversation_id", str));
        } else if (ReactionLocation.LINK == reactionLocation) {
            track(newEducateMetric(Action.SENT, Object.REACTION, "messenger", Context.ON_ARTICLE).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData("conversation_id", str));
        } else {
            track(newMetric(Action.SENT, Object.REACTION, Place.IN_APP, Context.FROM_FULL).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData("conversation_id", str));
        }
    }

    public void sentToPermissionSettings(String str, String str2, String str3, boolean z) {
        track(newCarouselMetric(Action.CLICKED, Object.CAROUSEL_PERMISSION_SETTINGS, str, str2, str3).addMetaData(METADATA_PERMISSION_GRANTED, Boolean.valueOf(z)));
    }

    public void skippedPermission(String str, String str2, String str3) {
        track(newCarouselMetric(Action.CLICKED, Object.CAROUSEL_PERMISSION_SKIPPED, str, str2, str3));
    }

    public void startConversation(String str) {
        track(newMetric("opened", "conversation", "messenger", Context.FROM_NEW_CONVERSATION).addMetaData("conversation_id", str));
    }

    public void startFollowupConversation(String str, String str2) {
        track(newMetric("opened", "conversation", "messenger", Context.IN_FOLLOWUP_CONVERSATION).addMetaData("conversation_id", str).addMetaData(METADATA_CLOSED_CONVERSATION_ID, str2));
    }

    public void startedCarouselFetching(String str, String str2) {
        track(newCarouselMetric(Action.STARTED, Object.CAROUSEL_MESSAGE_PRELOAD, Context.FROM_CAROUSEL, str2).addMetaData(METADATA_REQUEST_CONTENT_ID, str));
    }

    public void startedToPlayVideo() {
        track(newMetric(Action.STARTED, Object.VIDEO_MESSAGE, Place.IN_APP, "conversation"));
    }

    public void submittedCreateTicketForm(Long l, String str, String str2) {
        MetricObject metricObjectNewMetric = newMetric(Action.SUBMITTED, Object.CREATE_TICKET_FORM, "messenger", str2);
        if (l != null) {
            metricObjectNewMetric.addMetaData("ticket_type_id", l);
        }
        metricObjectNewMetric.addMetaData("conversation_id", str);
        track(metricObjectNewMetric);
    }

    public void surveyCompleted(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        track(newSurveyMetric(str, str2, str3).addMetaData(METADATA_PLATFORM, VALUE_ANDROID_SDK).addMetaData(METADATA_SURVEY_ID, str4).addMetaData(METADATA_SURVEY_FORMAT, str5).addMetaData(METADATA_STEPS_COMPLETE, Integer.valueOf(i)).addMetaData(QUESTIONS_SEEN, Integer.valueOf(i3)).addMetaData(METADATA_MAX_STEPS, Integer.valueOf(i2)));
    }

    public void surveyDismissed(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        track(newSurveyMetric(str, str2, str3).addMetaData(METADATA_PLATFORM, VALUE_ANDROID_SDK).addMetaData(METADATA_SURVEY_ID, str4).addMetaData(METADATA_SURVEY_FORMAT, str5).addMetaData(METADATA_STEPS_COMPLETE, Integer.valueOf(i)).addMetaData(QUESTIONS_SEEN, Integer.valueOf(i3)).addMetaData(METADATA_MAX_STEPS, Integer.valueOf(i2)));
    }

    public void surveyOpened(String str, String str2, String str3, String str4, String str5) {
        track(newSurveyMetric(str, str2, str3).addMetaData(METADATA_PLATFORM, VALUE_ANDROID_SDK).addMetaData(METADATA_SURVEY_ID, str4).addMetaData(METADATA_SURVEY_FORMAT, str5));
    }

    public void ticketsInMoreMenuClicked(String str) {
        track(newMetric(Action.CLICKED, "tickets", "conversation", str));
    }

    public void typeInConversation(String str) {
        track(newMetric(Action.TYPED, Object.REPLY, "messenger", Context.IN_CONVERSATION).addMetaData("conversation_id", str));
    }

    public void typeInNewConversation() {
        track(newMetric(Action.TYPED, "message", "messenger", Context.IN_NEW_CONVERSATION));
    }

    public void typeInNewFollowUpConversation(String str) {
        track(newMetric(Action.TYPED, "message", "messenger", Context.FROM_CLOSED_CONVERSATION).addMetaData(METADATA_CLOSED_CONVERSATION_ID, str));
    }

    public void viewedArticleSuggestions(List<String> list) {
        track(createMetric(Name.MESSENGER, "messenger", Action.VIEWED, Object.ARTICLE_SUGGESTIONS, "search_browse_card", "messenger").addMetaData("articles_count", Integer.valueOf(list.size())).addMetaData("articles_shown", list));
    }

    public void viewedConversation(String str, String str2) {
        track(newMetric(Action.VIEWED, "conversation", "messenger", str).addMetaData("conversation_id", str2));
    }

    public void viewedCreateTicketForm(Long l, String str, String str2) {
        MetricObject metricObjectNewMetric = newMetric(Action.VIEWED, Object.CREATE_TICKET_FORM, "messenger", str2);
        if (l != null) {
            metricObjectNewMetric.addMetaData("ticket_type_id", l);
        }
        metricObjectNewMetric.addMetaData("conversation_id", str);
        track(metricObjectNewMetric);
    }

    public void viewedInApp(String str, String str2, int i) {
        track(newMetric(Action.VIEWED, "message", Place.IN_APP, contextForInApp(i)).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData("conversation_id", str));
    }

    public void viewedInAppFromMessenger(String str, String str2, MessageStyle messageStyle) {
        track(newMetric(Action.VIEWED, "message", "messenger", Context.FROM_FULL).addMetaData(METADATA_MESSAGE_TYPE, messageStyle.name().toLowerCase()).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData("conversation_id", str));
    }

    public void viewedMessengerSheet(String str, String str2, boolean z) {
        track(newMetric(Action.VIEWED, Object.MESSENGER_SHEET, "messenger", z ? Context.HOME_SCREEN : "conversation").addMetaData(METADATA_URL, str2).addMetaData("conversation_id", str));
    }

    public void viewedNativeHelpCenter(String str, Boolean bool, boolean z) {
        MetricObject metricObjectNewHelpCenterMetric = newHelpCenterMetric(Action.VIEWED, Object.HELP_CENTER, str, Context.NO_CONTEXT, z);
        if (bool != null) {
            metricObjectNewHelpCenterMetric.addMetaData(METADATA_FILTERED, bool);
        }
        track(metricObjectNewHelpCenterMetric);
    }

    public void viewedNewConversation(String str) {
        track(newMetric(Action.VIEWED, "new_conversation", "messenger", str));
    }

    public void viewedPushNotification(String str) {
        track(newMetric(Action.VIEWED, "message", Place.IN_APP, Context.FROM_PUSH).addMetaData("conversation_id", str).addMetaData(METADATA_PUSH_TYPE, VALUE_NOTIFICATION));
    }

    public void viewedReply(boolean z, boolean z2, String str, String str2) {
        track(newMetric(Action.VIEWED, Object.REPLY, "messenger", Context.FROM_SNIPPET).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_HAS_ARTICLE_CARD, Boolean.valueOf(z2)).addMetaData(METADATA_COMMENT_ID, str).addMetaData("conversation_id", str2));
    }

    public void viewedSearchBrowseCard(int i) {
        MetricObject metricObjectCreateMetric = createMetric(Name.SEARCH_BROWSE, "messenger", Action.VIEWED, "search_browse_card", "home", "messenger");
        metricObjectCreateMetric.addMetaData(METADATA_HOME_SCREEN_INDEX, Integer.valueOf(i));
        track(metricObjectCreateMetric);
    }

    public void viewedSpace(String str) {
        track(newMetric(Action.VIEWED, str, "messenger", Context.NO_CONTEXT));
    }

    public void viewedTicketDetails(Long l, String str, String str2, String str3) {
        MetricObject metricObjectNewMetric = newMetric(Action.VIEWED, Object.TICKET_DETAILS, "messenger", str3);
        if (l != null) {
            metricObjectNewMetric.addMetaData("ticket_type_id", l);
        }
        metricObjectNewMetric.addMetaData(TICKET_STATUS, str2);
        metricObjectNewMetric.addMetaData("conversation_id", str);
        track(metricObjectNewMetric);
    }

    private MetricObject newCarouselMetric(String str, String str2, String str3, String str4, String str5) {
        return newCarouselMetric(str, str2, str3, str5).addMetaData(METADATA_INSTANCE_ID, str4);
    }

    public MetricTracker(UserIdentity userIdentity, MetricsStore metricsStore, android.content.Context context) {
        this(userIdentity, metricsStore, TimeProvider.SYSTEM, context);
    }
}
