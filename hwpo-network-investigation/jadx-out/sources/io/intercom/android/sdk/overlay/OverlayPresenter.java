package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.intercom.twig.Twig;
import defpackage.as;
import defpackage.ds;
import defpackage.egb;
import defpackage.fib;
import defpackage.fs;
import defpackage.g2b;
import defpackage.o02;
import defpackage.oh4;
import defpackage.u72;
import defpackage.umb;
import defpackage.xd5;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.activities.IntercomNoteActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.post.IntercomPostActivity;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.ViewUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class OverlayPresenter implements InAppNotificationPresenter.Listener {
    private final Provider<Api> api;
    private final Provider<AppConfig> appConfigProvider;
    private final Handler handler;
    final InAppNotificationPresenter inAppNotificationPresenter;
    private final IntercomDataLayer intercomDataLayer;
    final DefaultLauncherPresenter launcherPresenter;
    private final MetricTracker metricTracker;
    private final UserIdentity userIdentity;
    private final Twig twig = LumberMill.getLogger();
    private final Set<String> viewedPartIds = new HashSet();
    Activity previousPausedActivity = null;
    Activity previousResumedActivity = null;

    public OverlayPresenter(Application application, Provider<AppConfig> provider, MetricTracker metricTracker, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, Provider<Api> provider2) {
        this.appConfigProvider = provider;
        this.metricTracker = metricTracker;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
        this.api = provider2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(application);
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        this.inAppNotificationPresenter = new InAppNotificationPresenter(layoutInflaterFrom, handler, this, metricTracker, provider, new ContextLocaliser(provider), hostActivity());
        this.launcherPresenter = new DefaultLauncherPresenter(layoutInflaterFrom, new LauncherOpenBehaviour(), metricTracker);
        o02 o02VarB = u72.b();
        intercomDataLayer.unreadConversationIdsUpdates(o02VarB, new ds(2, this));
        intercomDataLayer.configUpdates(o02VarB, new oh4() { // from class: cn7
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return this.t.lambda$new$1((AppConfig) obj);
            }
        });
        intercomDataLayer.overlayStateUpdates(o02VarB, new fs(1, this));
        intercomDataLayer.listenToEvents(o02VarB, new oh4() { // from class: dn7
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return this.t.lambda$new$3((IntercomEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyLegacyBottomPadding(ViewGroup viewGroup, Activity activity) {
        try {
            int i = (int) (activity.getResources().getDisplayMetrics().density * 8.0f);
            int legacyNavigationBarHeight = getLegacyNavigationBarHeight(activity);
            if (legacyNavigationBarHeight > 0) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), legacyNavigationBarHeight + i);
            } else {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), ((int) (activity.getResources().getDisplayMetrics().density * 24.0f)) + i);
            }
        } catch (Throwable unused) {
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), ((int) (activity.getResources().getDisplayMetrics().density * 24.0f)) + ((int) (activity.getResources().getDisplayMetrics().density * 8.0f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyOverlayInsetsPadding(View view, xd5 xd5Var) {
        view.setPadding(xd5Var.a, xd5Var.b, xd5Var.c, xd5Var.d + ((int) (view.getResources().getDisplayMetrics().density * 8.0f)));
    }

    private int getLegacyNavigationBarHeight(Activity activity) {
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private ViewGroup getRootView(Activity activity) {
        ViewGroup frameLayout = (ViewGroup) activity.findViewById(R.id.intercom_overlay_root);
        if (frameLayout == null) {
            frameLayout = new FrameLayout(activity);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setId(R.id.intercom_overlay_root);
            if (Build.VERSION.SDK_INT >= 30) {
                setupUniversalOverlayPositioning(frameLayout);
            } else {
                setupLegacyOverlayPositioning(frameLayout, activity);
            }
            activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        return frameLayout;
    }

    private Activity hostActivity() {
        return this.intercomDataLayer.getOverlayState().getValue().getResumedHostActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g2b lambda$new$0(Set set) {
        onStateChange(Integer.valueOf(set.size()), this.intercomDataLayer.getOverlayState().getValue());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g2b lambda$new$1(AppConfig appConfig) {
        onNewConfig();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g2b lambda$new$2(OverlayState overlayState) {
        onStateChange(Integer.valueOf(this.intercomDataLayer.getUnreadConversationIds().getValue().size()), overlayState);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g2b lambda$new$3(IntercomEvent intercomEvent) {
        handleLifecycleEvents(intercomEvent);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewConfig$5(Activity activity, ViewGroup viewGroup) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        this.launcherPresenter.displayLauncherOnAttachedRoot(viewGroup, this.appConfigProvider.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChange$4(Activity activity, ViewGroup viewGroup) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        this.inAppNotificationPresenter.reset(viewGroup);
        this.launcherPresenter.displayLauncherOnAttachedRoot(viewGroup, this.appConfigProvider.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preloadAvatarThenDisplayNotifications$7(String str, List list, Intercom.Visibility visibility, Activity activity) {
        if (str.equals(this.userIdentity.getFingerprint()) && shouldDisplayNotifications(list, visibility, activity)) {
            displayNotifications(list, activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeOverlaysIfPresent$6(View view, Activity activity) {
        if (view != null) {
            this.launcherPresenter.removeLauncher();
            this.inAppNotificationPresenter.reset((ViewGroup) view);
            if (activity.isFinishing() || activity.isDestroyed() || view.getParent() == null) {
                return;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    private void openCarousel(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) IntercomCarouselActivity.class));
    }

    private void openMessenger(Conversation conversation) {
        Activity activityHostActivity = hostActivity();
        if (activityHostActivity != null) {
            ArrayList arrayList = new ArrayList();
            Intent conversationIntent = ConversationScreenOpenerKt.getConversationIntent(activityHostActivity, conversation.getId());
            arrayList.add(IntercomRootActivityArgsKt.getIntentForArgs(activityHostActivity, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, IntercomRootActivity.class, 268435456));
            arrayList.add(conversationIntent);
            try {
                activityHostActivity.startActivities((Intent[]) arrayList.toArray(new Intent[0]));
            } catch (RuntimeException e) {
                this.twig.internal("Overlay", "Error opening messenger from notification: " + e.getMessage());
            }
        }
    }

    private void openNote(Conversation conversation) {
        try {
            Activity activityHostActivity = hostActivity();
            if (activityHostActivity != null) {
                activityHostActivity.startActivity(IntercomNoteActivity.buildNoteIntent(activityHostActivity, conversation.lastPart(), conversation.getId(), conversation.lastParticipatingAdmin(), conversation.getComposerState().isVisible()));
            }
        } catch (IllegalArgumentException e) {
            this.twig.internal("Overlay", "Error loading the note " + e.getMessage());
        }
    }

    private void openPost(Conversation conversation) {
        Activity activityHostActivity = hostActivity();
        if (activityHostActivity != null) {
            activityHostActivity.startActivity(IntercomPostActivity.buildPostIntent(activityHostActivity, conversation.lastPart(), conversation.getId(), conversation.lastParticipatingAdmin(), conversation.getComposerState().isVisible(), true));
        }
    }

    private void openSurvey(Activity activity) {
        activity.startActivity(IntercomSurveyActivity.buildIntent(activity));
    }

    private void removeOverlays(Activity activity) {
        if (activity != null) {
            removeOverlaysIfPresent(activity);
        }
    }

    private void setupLegacyOverlayPositioning(final ViewGroup viewGroup, final Activity activity) {
        viewGroup.setFitsSystemWindows(false);
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                OverlayPresenter.this.applyLegacyBottomPadding(viewGroup, activity);
            }
        });
    }

    private void setupUniversalOverlayPositioning(ViewGroup viewGroup) {
        viewGroup.addOnAttachStateChangeListener(new AnonymousClass3());
    }

    private void trackInAppView(String str, String str2, int i) {
        if (this.viewedPartIds.contains(str2)) {
            return;
        }
        this.viewedPartIds.add(str2);
        this.metricTracker.viewedInApp(str, str2, i);
    }

    public void cancelAnimations() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public void displayNotifications(final List<Conversation> list, Activity activity) {
        DeliveryOption deliveryOption;
        final ViewGroup rootView = getRootView(activity);
        Conversation conversation = list.get(0);
        MessageStyle messageStyle = conversation.lastPart().getMessageStyle();
        DeliveryOption deliveryOption2 = conversation.lastPart().getDeliveryOption();
        if (list.size() > 1 || this.inAppNotificationPresenter.isDisplaying() || deliveryOption2 == DeliveryOption.SUMMARY || (deliveryOption2 == (deliveryOption = DeliveryOption.FULL) && MessageStyle.CHAT.equals(messageStyle))) {
            if (!this.launcherPresenter.isDisplaying()) {
                this.inAppNotificationPresenter.displayNotifications(rootView, list);
                return;
            }
            final DefaultLauncher andUnsetLauncher = this.launcherPresenter.getAndUnsetLauncher();
            if (list.size() == 1) {
                andUnsetLauncher.pulseForTransformation(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.1.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator2) {
                                andUnsetLauncher.removeView();
                            }
                        });
                        OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                    }
                });
                return;
            } else {
                andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        andUnsetLauncher.removeView();
                        OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                    }
                });
                return;
            }
        }
        if (deliveryOption2 == deliveryOption) {
            if (MessageStyle.POST.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 1);
                openPost(conversation);
            } else if (MessageStyle.NOTE.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 1);
                openNote(conversation);
            }
        }
    }

    public void handleLifecycleEvents(IntercomEvent intercomEvent) {
        Activity activity = this.previousPausedActivity;
        Activity activity2 = this.previousResumedActivity;
        if (intercomEvent instanceof IntercomEvent.ActivityReadyForViewAttachment) {
            Activity activity3 = ((IntercomEvent.ActivityReadyForViewAttachment) intercomEvent).getActivity();
            if (activity3 != activity) {
                removeOverlays(activity);
            }
            this.previousResumedActivity = activity3;
            this.previousPausedActivity = null;
            return;
        }
        if (intercomEvent instanceof IntercomEvent.ActivityPaused) {
            this.previousPausedActivity = ((IntercomEvent.ActivityPaused) intercomEvent).getActivity();
            this.previousResumedActivity = null;
            return;
        }
        if (intercomEvent instanceof IntercomEvent.ActivityStopped) {
            if (((IntercomEvent.ActivityStopped) intercomEvent).getActivity() == activity) {
                removeOverlays(activity);
                this.previousPausedActivity = null;
                return;
            }
            return;
        }
        if (intercomEvent instanceof IntercomEvent.AppEnteredBackground) {
            cancelAnimations();
            removeOverlays(activity);
            removeOverlays(activity2);
            this.previousPausedActivity = null;
            this.previousResumedActivity = null;
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public void markAsDismissed(Conversation conversation) {
        this.api.get().markConversationAsDismissed(conversation.getId());
        this.intercomDataLayer.markConversationPartAsDismissed(conversation.lastPart().getId());
    }

    public void onNewConfig() {
        Intercom.Visibility launcherVisibility = this.intercomDataLayer.getOverlayState().getValue().getLauncherVisibility();
        Intercom.Visibility inAppNotificationsVisibility = this.intercomDataLayer.getOverlayState().getValue().getInAppNotificationsVisibility();
        List<Conversation> conversations = this.intercomDataLayer.getOverlayState().getValue().getConversations();
        final Activity resumedHostActivity = this.intercomDataLayer.getOverlayState().getValue().getResumedHostActivity();
        if (resumedHostActivity == null || resumedHostActivity.isFinishing() || resumedHostActivity.isDestroyed() || !shouldDisplayLauncher(conversations, inAppNotificationsVisibility, launcherVisibility, resumedHostActivity)) {
            this.launcherPresenter.setLauncherBackgroundColor(this.appConfigProvider.get());
        } else {
            final ViewGroup rootView = getRootView(resumedHostActivity);
            ViewUtils.waitForViewAttachment(rootView, new Runnable() { // from class: bn7
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.lambda$onNewConfig$5(resumedHostActivity, rootView);
                }
            });
        }
    }

    public void onStateChange(Integer num, OverlayState overlayState) {
        final Activity resumedHostActivity = overlayState.getResumedHostActivity();
        List<Conversation> conversations = overlayState.getConversations();
        SurveyData surveyData = overlayState.getSurveyData();
        Carousel carousel = overlayState.getCarousel();
        int bottomPadding = overlayState.getBottomPadding();
        Intercom.Visibility launcherVisibility = overlayState.getLauncherVisibility();
        Intercom.Visibility inAppNotificationsVisibility = overlayState.getInAppNotificationsVisibility();
        this.launcherPresenter.setBottomPadding(bottomPadding);
        this.launcherPresenter.setUnreadCount(num.intValue());
        this.inAppNotificationPresenter.setBottomPadding(bottomPadding);
        if (resumedHostActivity == null || resumedHostActivity.isFinishing() || resumedHostActivity.isDestroyed()) {
            return;
        }
        if (shouldDisplaySurvey(surveyData, resumedHostActivity)) {
            openSurvey(resumedHostActivity);
            return;
        }
        if (shouldDisplayCarousel(carousel, resumedHostActivity)) {
            openCarousel(resumedHostActivity);
            return;
        }
        if (shouldDisplayNotifications(conversations, inAppNotificationsVisibility, resumedHostActivity)) {
            preloadAvatarThenDisplayNotifications(conversations, inAppNotificationsVisibility, resumedHostActivity, this.userIdentity.getFingerprint());
        } else if (!shouldDisplayLauncher(conversations, inAppNotificationsVisibility, launcherVisibility, resumedHostActivity)) {
            removeOverlaysIfPresent(resumedHostActivity);
        } else {
            final ViewGroup rootView = getRootView(resumedHostActivity);
            ViewUtils.waitForViewAttachment(rootView, new Runnable() { // from class: an7
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.lambda$onStateChange$4(resumedHostActivity, rootView);
                }
            });
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public void openNotification(Conversation conversation) {
        Part lastAdminPart = conversation.getLastAdminPart();
        MessageStyle messageStyle = lastAdminPart.getMessageStyle();
        if (MessageStyle.POST.equals(messageStyle)) {
            trackInAppView(conversation.getId(), conversation.lastPart().getId(), 0);
            openPost(conversation);
        } else {
            if (MessageStyle.NOTE.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 0);
                openNote(conversation);
                return;
            }
            openMessenger(conversation);
            if (MessageStyle.CHAT.equals(messageStyle) && DeliveryOption.FULL == lastAdminPart.getDeliveryOption()) {
                this.metricTracker.openedConversationFromFull(conversation.getId(), lastAdminPart.getId());
            } else {
                this.metricTracker.openedConversationFromSnippet(conversation.getId(), lastAdminPart.getId());
            }
        }
    }

    public void preloadAvatarThenDisplayNotifications(final List<Conversation> list, final Intercom.Visibility visibility, final Activity activity, final String str) {
        AvatarUtils.preloadAvatar(list.get(0).lastPart().getParticipant().getAvatar(), new Runnable() { // from class: en7
            @Override // java.lang.Runnable
            public final void run() {
                this.t.lambda$preloadAvatarThenDisplayNotifications$7(str, list, visibility, activity);
            }
        }, activity);
    }

    public void refreshStateBecauseUserIdentityIsNotInStoreYet() {
        onStateChange(Integer.valueOf(this.intercomDataLayer.getUnreadConversationIds().getValue().size()), this.intercomDataLayer.getOverlayState().getValue());
    }

    public void removeOverlaysIfPresent(Activity activity) {
        activity.runOnUiThread(new as(this, activity.findViewById(R.id.intercom_overlay_root), activity, 1));
    }

    public boolean shouldDisplayCarousel(Carousel carousel, Activity activity) {
        return (Carousel.NULL.equals(carousel) || this.userIdentity.isSoftReset() || activity == null) ? false : true;
    }

    public boolean shouldDisplayLauncher(List<Conversation> list, Intercom.Visibility visibility, Intercom.Visibility visibility2, Activity activity) {
        if (visibility == Intercom.Visibility.VISIBLE) {
            Iterator<Conversation> it = list.iterator();
            while (it.hasNext()) {
                if (DeliveryOption.BADGE != it.next().lastPart().getDeliveryOption()) {
                    return false;
                }
            }
        }
        return visibility2 == Intercom.Visibility.VISIBLE && !this.userIdentity.isSoftReset() && this.userIdentity.identityExists() && this.appConfigProvider.get().isReceivedFromServer() && activity != null;
    }

    public boolean shouldDisplayNotifications(List<Conversation> list, Intercom.Visibility visibility, Activity activity) {
        return (visibility != Intercom.Visibility.VISIBLE || this.userIdentity.isSoftReset() || list.isEmpty() || activity == null) ? false : true;
    }

    public boolean shouldDisplaySurvey(SurveyData surveyData, Activity activity) {
        return (SurveyData.Companion.getNULL().equals(surveyData) || this.userIdentity.isSoftReset() || activity == null) ? false : true;
    }

    public void softReset() {
        cancelAnimations();
        Activity activityHostActivity = hostActivity();
        if (activityHostActivity != null) {
            removeOverlaysIfPresent(activityHostActivity);
        }
        this.previousPausedActivity = null;
        this.previousResumedActivity = null;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.overlay.OverlayPresenter$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class AnonymousClass3 implements View.OnAttachStateChangeListener {
        public AnonymousClass3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onViewAttachedToWindow$0(View view) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            umb umbVarA = egb.e.a(view);
            if (umbVarA != null) {
                OverlayPresenter.this.applyOverlayInsetsPadding(view, umbVarA.a.i(519));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(final View view) {
            view.post(new Runnable() { // from class: io.intercom.android.sdk.overlay.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.lambda$onViewAttachedToWindow$0(view);
                }
            });
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public ViewGroup getRootView() {
        Activity activityHostActivity = hostActivity();
        activityHostActivity.getClass();
        return getRootView(activityHostActivity);
    }
}
