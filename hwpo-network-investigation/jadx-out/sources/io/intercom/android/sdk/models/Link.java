package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Link {
    public static final String ARTICLE_TYPE = "educate.article";
    public static final String HELP_CENTER_TYPE = "educate.help_center";
    public static final String SUGGESTION_TYPE = "educate.suggestion";

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder {
        List<Block.Builder> blocks;
        Card.Builder card;
        long created_at;
        String id;
        ReactionReply.Builder reactions_reply;
        long updated_at;

        public Link build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            String str = string;
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.blocks));
            List<Block.Builder> list = this.blocks;
            if (list != null) {
                for (Block.Builder builder : list) {
                    if (builder != null) {
                        arrayList.add(builder.build());
                    }
                }
            }
            ReactionReply.Builder builder2 = this.reactions_reply;
            ReactionReply reactionReplyBuild = builder2 == null ? ReactionReply.NULL : builder2.build();
            Card.Builder builder3 = this.card;
            if (builder3 == null) {
                builder3 = new Card.Builder();
            }
            return new AutoValue_Link(str, builder3.build(), arrayList, reactionReplyBuild, this.created_at, this.updated_at);
        }
    }

    public Author getAuthor() {
        return getCard().getAuthor();
    }

    public abstract List<Block> getBlocks();

    public abstract Card getCard();

    public abstract long getCreatedAt();

    public String getDescription() {
        return getCard().getDescription();
    }

    public abstract String getId();

    public abstract ReactionReply getReactionReply();

    public String getText() {
        return getCard().getText();
    }

    public String getTitle() {
        return getCard().getTitle();
    }

    public String getType() {
        return getCard().getType();
    }

    public abstract long getUpdatedAt();
}
