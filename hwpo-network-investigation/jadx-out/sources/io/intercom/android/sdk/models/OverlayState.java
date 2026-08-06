package io.intercom.android.sdk.models;

import android.app.Activity;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.of3;
import defpackage.os2;
import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class OverlayState {
    private final int bottomPadding;
    private final Carousel carousel;
    private final List<Conversation> conversations;
    private final Set<String> dismissedPartIds;
    private final Intercom.Visibility inAppNotificationsVisibility;
    private final Intercom.Visibility launcherVisibility;
    private final Activity pausedHostActivity;
    private final Activity resumedHostActivity;
    private final SurveyData surveyData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final OverlayState NULL = new OverlayState(null, null, 0, null, null, null, null, null, null, 511, null);

    public /* synthetic */ OverlayState(SurveyData surveyData, Carousel carousel, int i, Intercom.Visibility visibility, Intercom.Visibility visibility2, List list, Set set, Activity activity, Activity activity2, int i2, qq2 qq2Var) {
        this((i2 & 1) != 0 ? SurveyData.Companion.getNULL() : surveyData, (i2 & 2) != 0 ? Carousel.NULL : carousel, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? Intercom.Visibility.GONE : visibility, (i2 & 16) != 0 ? Intercom.Visibility.VISIBLE : visibility2, (i2 & 32) != 0 ? hf3.t : list, (i2 & 64) != 0 ? of3.t : set, (i2 & 128) != 0 ? null : activity, (i2 & 256) != 0 ? null : activity2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OverlayState copy$default(OverlayState overlayState, SurveyData surveyData, Carousel carousel, int i, Intercom.Visibility visibility, Intercom.Visibility visibility2, List list, Set set, Activity activity, Activity activity2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            surveyData = overlayState.surveyData;
        }
        if ((i2 & 2) != 0) {
            carousel = overlayState.carousel;
        }
        if ((i2 & 4) != 0) {
            i = overlayState.bottomPadding;
        }
        if ((i2 & 8) != 0) {
            visibility = overlayState.launcherVisibility;
        }
        if ((i2 & 16) != 0) {
            visibility2 = overlayState.inAppNotificationsVisibility;
        }
        if ((i2 & 32) != 0) {
            list = overlayState.conversations;
        }
        if ((i2 & 64) != 0) {
            set = overlayState.dismissedPartIds;
        }
        if ((i2 & 128) != 0) {
            activity = overlayState.resumedHostActivity;
        }
        if ((i2 & 256) != 0) {
            activity2 = overlayState.pausedHostActivity;
        }
        Activity activity3 = activity;
        Activity activity4 = activity2;
        List list2 = list;
        Set set2 = set;
        Intercom.Visibility visibility3 = visibility2;
        int i3 = i;
        return overlayState.copy(surveyData, carousel, i3, visibility, visibility3, list2, set2, activity3, activity4);
    }

    public final SurveyData component1() {
        return this.surveyData;
    }

    public final Carousel component2() {
        return this.carousel;
    }

    public final int component3() {
        return this.bottomPadding;
    }

    public final Intercom.Visibility component4() {
        return this.launcherVisibility;
    }

    public final Intercom.Visibility component5() {
        return this.inAppNotificationsVisibility;
    }

    public final List<Conversation> component6() {
        return this.conversations;
    }

    public final Set<String> component7() {
        return this.dismissedPartIds;
    }

    public final Activity component8() {
        return this.resumedHostActivity;
    }

    public final Activity component9() {
        return this.pausedHostActivity;
    }

    public final OverlayState copy(SurveyData surveyData, Carousel carousel, int i, Intercom.Visibility visibility, Intercom.Visibility visibility2, List<Conversation> list, Set<String> set, Activity activity, Activity activity2) {
        surveyData.getClass();
        carousel.getClass();
        visibility.getClass();
        visibility2.getClass();
        list.getClass();
        set.getClass();
        return new OverlayState(surveyData, carousel, i, visibility, visibility2, list, set, activity, activity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlayState)) {
            return false;
        }
        OverlayState overlayState = (OverlayState) obj;
        return xj5.a(this.surveyData, overlayState.surveyData) && xj5.a(this.carousel, overlayState.carousel) && this.bottomPadding == overlayState.bottomPadding && this.launcherVisibility == overlayState.launcherVisibility && this.inAppNotificationsVisibility == overlayState.inAppNotificationsVisibility && xj5.a(this.conversations, overlayState.conversations) && xj5.a(this.dismissedPartIds, overlayState.dismissedPartIds) && xj5.a(this.resumedHostActivity, overlayState.resumedHostActivity) && xj5.a(this.pausedHostActivity, overlayState.pausedHostActivity);
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final Carousel getCarousel() {
        return this.carousel;
    }

    public final List<Conversation> getConversations() {
        return this.conversations;
    }

    public final Set<String> getDismissedPartIds() {
        return this.dismissedPartIds;
    }

    public final Intercom.Visibility getInAppNotificationsVisibility() {
        return this.inAppNotificationsVisibility;
    }

    public final Intercom.Visibility getLauncherVisibility() {
        return this.launcherVisibility;
    }

    public final Activity getPausedHostActivity() {
        return this.pausedHostActivity;
    }

    public final Activity getResumedHostActivity() {
        return this.resumedHostActivity;
    }

    public final SurveyData getSurveyData() {
        return this.surveyData;
    }

    public int hashCode() {
        int iHashCode = (this.dismissedPartIds.hashCode() + ho2.a((this.inAppNotificationsVisibility.hashCode() + ((this.launcherVisibility.hashCode() + os2.a(this.bottomPadding, (this.carousel.hashCode() + (this.surveyData.hashCode() * 31)) * 31, 31)) * 31)) * 31, 31, this.conversations)) * 31;
        Activity activity = this.resumedHostActivity;
        int iHashCode2 = (iHashCode + (activity == null ? 0 : activity.hashCode())) * 31;
        Activity activity2 = this.pausedHostActivity;
        return iHashCode2 + (activity2 != null ? activity2.hashCode() : 0);
    }

    public String toString() {
        return "OverlayState(surveyData=" + this.surveyData + ", carousel=" + this.carousel + ", bottomPadding=" + this.bottomPadding + ", launcherVisibility=" + this.launcherVisibility + ", inAppNotificationsVisibility=" + this.inAppNotificationsVisibility + ", conversations=" + this.conversations + ", dismissedPartIds=" + this.dismissedPartIds + ", resumedHostActivity=" + this.resumedHostActivity + ", pausedHostActivity=" + this.pausedHostActivity + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }

    public OverlayState(SurveyData surveyData, Carousel carousel, int i, Intercom.Visibility visibility, Intercom.Visibility visibility2, List<Conversation> list, Set<String> set, Activity activity, Activity activity2) {
        surveyData.getClass();
        carousel.getClass();
        visibility.getClass();
        visibility2.getClass();
        list.getClass();
        set.getClass();
        this.surveyData = surveyData;
        this.carousel = carousel;
        this.bottomPadding = i;
        this.launcherVisibility = visibility;
        this.inAppNotificationsVisibility = visibility2;
        this.conversations = list;
        this.dismissedPartIds = set;
        this.resumedHostActivity = activity;
        this.pausedHostActivity = activity2;
    }

    public OverlayState() {
        this(null, null, 0, null, null, null, null, null, null, 511, null);
    }
}
