package io.intercom.android.sdk.activities;

import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Reaction;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ConversationReactionListener implements ReactionListener {
    private final Api api;
    private final String conversationId;
    private final MetricTracker.ReactionLocation location;
    private final MetricTracker metricTracker;
    private final String partId;

    public ConversationReactionListener(MetricTracker.ReactionLocation reactionLocation, String str, String str2, Api api, MetricTracker metricTracker) {
        this.conversationId = str2;
        this.partId = str;
        this.location = reactionLocation;
        this.api = api;
        this.metricTracker = metricTracker;
    }

    @Override // io.intercom.android.sdk.conversation.ReactionListener
    public void onReactionSelected(Reaction reaction) {
        this.api.reactToConversation(this.conversationId, reaction.getIndex());
        this.metricTracker.sentReaction(this.conversationId, this.partId, reaction.getIndex(), this.location);
    }
}
