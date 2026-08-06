package io.intercom.android.sdk.models;

import defpackage.ac4;
import defpackage.jp2;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Link extends Link {
    private final List<Block> blocks;
    private final Card card;
    private final long createdAt;
    private final String id;
    private final ReactionReply reactionReply;
    private final long updatedAt;

    public AutoValue_Link(String str, Card card, List<Block> list, ReactionReply reactionReply, long j, long j2) {
        if (str == null) {
            ac4.c("Null id");
            throw null;
        }
        this.id = str;
        if (card == null) {
            ac4.c("Null card");
            throw null;
        }
        this.card = card;
        if (list == null) {
            ac4.c("Null blocks");
            throw null;
        }
        this.blocks = list;
        if (reactionReply == null) {
            ac4.c("Null reactionReply");
            throw null;
        }
        this.reactionReply = reactionReply;
        this.createdAt = j;
        this.updatedAt = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Link) {
            Link link = (Link) obj;
            if (this.id.equals(link.getId()) && this.card.equals(link.getCard()) && this.blocks.equals(link.getBlocks()) && this.reactionReply.equals(link.getReactionReply()) && this.createdAt == link.getCreatedAt() && this.updatedAt == link.getUpdatedAt()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Link
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override // io.intercom.android.sdk.models.Link
    public Card getCard() {
        return this.card;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.intercom.android.sdk.models.Link
    public String getId() {
        return this.id;
    }

    @Override // io.intercom.android.sdk.models.Link
    public ReactionReply getReactionReply() {
        return this.reactionReply;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = (((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.card.hashCode()) * 1000003) ^ this.blocks.hashCode()) * 1000003) ^ this.reactionReply.hashCode()) * 1000003;
        long j = this.createdAt;
        long j2 = this.updatedAt;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Link{id=");
        sb.append(this.id);
        sb.append(", card=");
        sb.append(this.card);
        sb.append(", blocks=");
        sb.append(this.blocks);
        sb.append(", reactionReply=");
        sb.append(this.reactionReply);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", updatedAt=");
        return jp2.a(this.updatedAt, "}", sb);
    }
}
