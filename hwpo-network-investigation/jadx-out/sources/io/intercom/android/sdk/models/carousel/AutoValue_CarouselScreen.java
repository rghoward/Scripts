package io.intercom.android.sdk.models.carousel;

import defpackage.ac4;
import defpackage.av;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CarouselScreen extends CarouselScreen {
    private final List<ScreenAction> actions;
    private final String backgroundColor;
    private final List<Block> blocks;
    private final String id;
    private final String textColor;
    private final String verticalAlignment;

    public AutoValue_CarouselScreen(String str, String str2, String str3, List<Block> list, List<ScreenAction> list2, String str4) {
        if (str == null) {
            ac4.c("Null id");
            throw null;
        }
        this.id = str;
        if (str2 == null) {
            ac4.c("Null backgroundColor");
            throw null;
        }
        this.backgroundColor = str2;
        if (str3 == null) {
            ac4.c("Null textColor");
            throw null;
        }
        this.textColor = str3;
        if (list == null) {
            ac4.c("Null blocks");
            throw null;
        }
        this.blocks = list;
        if (list2 == null) {
            ac4.c("Null actions");
            throw null;
        }
        this.actions = list2;
        if (str4 != null) {
            this.verticalAlignment = str4;
        } else {
            ac4.c("Null verticalAlignment");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CarouselScreen) {
            CarouselScreen carouselScreen = (CarouselScreen) obj;
            if (this.id.equals(carouselScreen.getId()) && this.backgroundColor.equals(carouselScreen.getBackgroundColor()) && this.textColor.equals(carouselScreen.getTextColor()) && this.blocks.equals(carouselScreen.getBlocks()) && this.actions.equals(carouselScreen.getActions()) && this.verticalAlignment.equals(carouselScreen.getVerticalAlignment())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public List<ScreenAction> getActions() {
        return this.actions;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public String getId() {
        return this.id;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public String getTextColor() {
        return this.textColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public String getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        return this.verticalAlignment.hashCode() ^ ((((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.backgroundColor.hashCode()) * 1000003) ^ this.textColor.hashCode()) * 1000003) ^ this.blocks.hashCode()) * 1000003) ^ this.actions.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CarouselScreen{id=");
        sb.append(this.id);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", blocks=");
        sb.append(this.blocks);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", verticalAlignment=");
        return av.a(sb, this.verticalAlignment, "}");
    }
}
