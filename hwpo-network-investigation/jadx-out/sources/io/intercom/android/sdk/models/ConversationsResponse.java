package io.intercom.android.sdk.models;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ConversationsResponse extends BaseResponse {
    private final ConversationList conversationPage;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder extends BaseResponse.Builder {
        ConversationList.Builder conversation_page;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public ConversationsResponse build() {
            return new ConversationsResponse(this);
        }

        public Builder withConversationPage(ConversationList.Builder builder) {
            this.conversation_page = builder;
            return this;
        }
    }

    public ConversationsResponse(Builder builder) {
        super(builder);
        ConversationList.Builder builder2 = builder.conversation_page;
        this.conversationPage = builder2 == null ? new ConversationList.Builder().build() : builder2.build();
    }

    public ConversationList getConversationPage() {
        return this.conversationPage;
    }
}
