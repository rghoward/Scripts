package io.intercom.android.sdk.m5.home.reducers;

import io.intercom.android.sdk.m5.home.data.Badge;
import io.intercom.android.sdk.m5.home.data.BadgeType;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeItemBadgeReducerKt {
    public static final HomeItemBadge reduceHomeItemBadge(Badge badge) {
        if (badge == null) {
            return HomeItemBadge.None.INSTANCE;
        }
        if (badge.getBadgeType() == BadgeType.PASSIVE) {
            return HomeItemBadge.IconWithIndicator.INSTANCE;
        }
        return (badge.getBadgeType() != BadgeType.UNREAD || badge.getLabel() == null) ? HomeItemBadge.None.INSTANCE : new HomeItemBadge.IndicatorWithCount(Integer.parseInt(badge.getLabel()));
    }
}
