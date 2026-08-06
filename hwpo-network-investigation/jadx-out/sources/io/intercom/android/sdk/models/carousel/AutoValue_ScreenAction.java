package io.intercom.android.sdk.models.carousel;

import defpackage.ac4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ScreenAction extends ScreenAction {
    private final List<String> androidPermissions;
    private final String backgroundColor;
    private final String id;
    private final String textColor;
    private final String title;
    private final String type;
    private final String uri;

    public AutoValue_ScreenAction(String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        if (str == null) {
            ac4.c("Null id");
            throw null;
        }
        this.id = str;
        if (str2 == null) {
            ac4.c("Null type");
            throw null;
        }
        this.type = str2;
        if (str3 == null) {
            ac4.c("Null title");
            throw null;
        }
        this.title = str3;
        if (str4 == null) {
            ac4.c("Null textColor");
            throw null;
        }
        this.textColor = str4;
        if (str5 == null) {
            ac4.c("Null backgroundColor");
            throw null;
        }
        this.backgroundColor = str5;
        if (str6 == null) {
            ac4.c("Null uri");
            throw null;
        }
        this.uri = str6;
        if (list != null) {
            this.androidPermissions = list;
        } else {
            ac4.c("Null androidPermissions");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScreenAction) {
            ScreenAction screenAction = (ScreenAction) obj;
            if (this.id.equals(screenAction.getId()) && this.type.equals(screenAction.getType()) && this.title.equals(screenAction.getTitle()) && this.textColor.equals(screenAction.getTextColor()) && this.backgroundColor.equals(screenAction.getBackgroundColor()) && this.uri.equals(screenAction.getUri()) && this.androidPermissions.equals(screenAction.getAndroidPermissions())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public List<String> getAndroidPermissions() {
        return this.androidPermissions;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getId() {
        return this.id;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getTextColor() {
        return this.textColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getTitle() {
        return this.title;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getType() {
        return this.type;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.androidPermissions.hashCode() ^ ((((((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.textColor.hashCode()) * 1000003) ^ this.backgroundColor.hashCode()) * 1000003) ^ this.uri.hashCode()) * 1000003);
    }

    public String toString() {
        return "ScreenAction{id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", uri=" + this.uri + ", androidPermissions=" + this.androidPermissions + "}";
    }
}
