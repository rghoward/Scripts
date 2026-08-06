package io.intercom.android.sdk.models;

import defpackage.ac4;
import io.intercom.android.sdk.blocks.lib.models.Author;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Card extends Card {
    private final Author author;
    private final String description;
    private final String text;
    private final String title;
    private final String type;

    public AutoValue_Card(String str, String str2, String str3, String str4, Author author) {
        if (str == null) {
            ac4.c("Null type");
            throw null;
        }
        this.type = str;
        if (str2 == null) {
            ac4.c("Null text");
            throw null;
        }
        this.text = str2;
        if (str3 == null) {
            ac4.c("Null title");
            throw null;
        }
        this.title = str3;
        if (str4 == null) {
            ac4.c("Null description");
            throw null;
        }
        this.description = str4;
        if (author != null) {
            this.author = author;
        } else {
            ac4.c("Null author");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Card) {
            Card card = (Card) obj;
            if (this.type.equals(card.getType()) && this.text.equals(card.getText()) && this.title.equals(card.getTitle()) && this.description.equals(card.getDescription()) && this.author.equals(card.getAuthor())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Card
    public Author getAuthor() {
        return this.author;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getDescription() {
        return this.description;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getText() {
        return this.text;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getTitle() {
        return this.title;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.author.hashCode() ^ ((((((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003);
    }

    public String toString() {
        return "Card{type=" + this.type + ", text=" + this.text + ", title=" + this.title + ", description=" + this.description + ", author=" + this.author + "}";
    }
}
