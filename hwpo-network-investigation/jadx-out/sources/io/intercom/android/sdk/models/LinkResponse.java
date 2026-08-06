package io.intercom.android.sdk.models;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class LinkResponse extends BaseResponse {
    private final Link link;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder extends BaseResponse.Builder {
        Link.Builder article;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public LinkResponse build() {
            return new LinkResponse(this);
        }
    }

    public LinkResponse(Builder builder) {
        super(builder);
        Link.Builder builder2 = builder.article;
        this.link = builder2 == null ? new Link.Builder().build() : builder2.build();
    }

    public Link getLink() {
        return this.link;
    }
}
