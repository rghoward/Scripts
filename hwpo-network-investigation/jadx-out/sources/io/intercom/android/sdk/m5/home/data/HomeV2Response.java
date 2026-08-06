package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeV2Response {
    public static final int $stable = 8;

    @SerializedName("cards")
    private final List<HomeCards> cards;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeV2Response(List<? extends HomeCards> list) {
        list.getClass();
        this.cards = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeV2Response copy$default(HomeV2Response homeV2Response, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = homeV2Response.cards;
        }
        return homeV2Response.copy(list);
    }

    public final List<HomeCards> component1() {
        return this.cards;
    }

    public final HomeV2Response copy(List<? extends HomeCards> list) {
        list.getClass();
        return new HomeV2Response(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeV2Response) && xj5.a(this.cards, ((HomeV2Response) obj).cards);
    }

    public final List<HomeCards> getCards() {
        return this.cards;
    }

    public int hashCode() {
        return this.cards.hashCode();
    }

    public String toString() {
        return zc6.a(new StringBuilder("HomeV2Response(cards="), this.cards, ')');
    }
}
