package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import defpackage.ho2;
import defpackage.ru3;
import defpackage.wu0;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Card {
    public static final int $stable = 8;

    @SerializedName("action")
    private final Action action;

    @SerializedName("card_title")
    private final String cardTitle;

    @SerializedName("space_items")
    private final List<SpaceItem> spaceItems;

    @SerializedName("suggested_articles")
    private final List<SuggestedArticle> suggestedArticles;

    @SerializedName("type")
    private final String type;

    public Card(Action action, String str, List<SpaceItem> list, List<SuggestedArticle> list2, String str2) {
        action.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        this.action = action;
        this.cardTitle = str;
        this.spaceItems = list;
        this.suggestedArticles = list2;
        this.type = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Card copy$default(Card card, Action action, String str, List list, List list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            action = card.action;
        }
        if ((i & 2) != 0) {
            str = card.cardTitle;
        }
        if ((i & 4) != 0) {
            list = card.spaceItems;
        }
        if ((i & 8) != 0) {
            list2 = card.suggestedArticles;
        }
        if ((i & 16) != 0) {
            str2 = card.type;
        }
        String str3 = str2;
        List list3 = list;
        return card.copy(action, str, list3, list2, str3);
    }

    public final Action component1() {
        return this.action;
    }

    public final String component2() {
        return this.cardTitle;
    }

    public final List<SpaceItem> component3() {
        return this.spaceItems;
    }

    public final List<SuggestedArticle> component4() {
        return this.suggestedArticles;
    }

    public final String component5() {
        return this.type;
    }

    public final Card copy(Action action, String str, List<SpaceItem> list, List<SuggestedArticle> list2, String str2) {
        action.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        return new Card(action, str, list, list2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return xj5.a(this.action, card.action) && xj5.a(this.cardTitle, card.cardTitle) && xj5.a(this.spaceItems, card.spaceItems) && xj5.a(this.suggestedArticles, card.suggestedArticles) && xj5.a(this.type, card.type);
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final List<SpaceItem> getSpaceItems() {
        return this.spaceItems;
    }

    public final List<SuggestedArticle> getSuggestedArticles() {
        return this.suggestedArticles;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + ho2.a(ho2.a(ru3.c(this.action.hashCode() * 31, 31, this.cardTitle), 31, this.spaceItems), 31, this.suggestedArticles);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Card(action=");
        sb.append(this.action);
        sb.append(", cardTitle=");
        sb.append(this.cardTitle);
        sb.append(", spaceItems=");
        sb.append(this.spaceItems);
        sb.append(", suggestedArticles=");
        sb.append(this.suggestedArticles);
        sb.append(", type=");
        return wu0.a(sb, this.type, ')');
    }
}
