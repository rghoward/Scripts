package io.intercom.android.sdk.metrics;

import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnreadConversationsTracker {
    public static final int $stable = 8;
    private final Set<String> trackedPartIds;
    private final Provider<MetricTracker> trackerProvider;

    public UnreadConversationsTracker(Provider<MetricTracker> provider) {
        provider.getClass();
        this.trackerProvider = provider;
        this.trackedPartIds = new LinkedHashSet();
    }

    private final MetricTracker getTracker() {
        MetricTracker metricTracker = this.trackerProvider.get();
        metricTracker.getClass();
        return metricTracker;
    }

    private final void trackReceivedPart(Part part, String str) {
        boolean zHasAttachments = part.hasAttachments();
        boolean zIsLinkCard = PartExtensionsKt.isLinkCard(part);
        String id = part.getId();
        MessageStyle messageStyle = part.getMessageStyle();
        if (DeliveryOption.SUMMARY != part.getDeliveryOption()) {
            getTracker().receivedMessageFromFullWhenClosed(zHasAttachments, zIsLinkCard, str, id, messageStyle);
        } else if (part.isInitialMessage()) {
            getTracker().receivedMessageFromSnippetWhenClosed(zHasAttachments, zIsLinkCard, str, id, messageStyle);
        } else {
            getTracker().receivedReplyFromSnippetWhenClosed(zHasAttachments, zIsLinkCard, str, id);
        }
    }

    public final void clear() {
        this.trackedPartIds.clear();
    }

    public final void track(UsersResponse usersResponse) {
        usersResponse.getClass();
        List<Conversation> conversations = usersResponse.getUnreadConversations().getConversations();
        conversations.getClass();
        for (Conversation conversation : conversations) {
            Part partLastPart = conversation.lastPart();
            if (!this.trackedPartIds.contains(partLastPart.getId())) {
                Set<String> set = this.trackedPartIds;
                String id = partLastPart.getId();
                id.getClass();
                set.add(id);
                trackReceivedPart(partLastPart, conversation.getId());
            }
        }
    }
}
