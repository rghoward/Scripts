package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Card {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder {
        String articleId;
        Author author;
        String description;
        String linkType;
        String text;
        String title;
        String type;

        public Card build() {
            Author author = this.author;
            if (author == null) {
                author = new Author();
            }
            return Card.create(NullSafety.valueOrEmpty(this.type), NullSafety.valueOrEmpty(this.text), NullSafety.valueOrEmpty(this.title), NullSafety.valueOrEmpty(this.description), author);
        }
    }

    public static Card create(String str, String str2, String str3, String str4, Author author) {
        return new AutoValue_Card(str, str2, str3, str4, author);
    }

    public abstract Author getAuthor();

    public abstract String getDescription();

    public abstract String getText();

    public abstract String getTitle();

    public abstract String getType();
}
