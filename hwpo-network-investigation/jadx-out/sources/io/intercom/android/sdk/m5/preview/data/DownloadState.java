package io.intercom.android.sdk.m5.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ru3;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DownloadState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DownloadState> CREATOR = new Creator();
    private final String fileSavedText;
    private final String fileSavingText;
    private final String permissionDeniedText;
    private final String saveFailedText;
    private final boolean showDownloadAction;

    public DownloadState(boolean z, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.showDownloadAction = z;
        this.fileSavingText = str;
        this.fileSavedText = str2;
        this.saveFailedText = str3;
        this.permissionDeniedText = str4;
    }

    public static /* synthetic */ DownloadState copy$default(DownloadState downloadState, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = downloadState.showDownloadAction;
        }
        if ((i & 2) != 0) {
            str = downloadState.fileSavingText;
        }
        if ((i & 4) != 0) {
            str2 = downloadState.fileSavedText;
        }
        if ((i & 8) != 0) {
            str3 = downloadState.saveFailedText;
        }
        if ((i & 16) != 0) {
            str4 = downloadState.permissionDeniedText;
        }
        String str5 = str4;
        String str6 = str2;
        return downloadState.copy(z, str, str6, str3, str5);
    }

    public final boolean component1() {
        return this.showDownloadAction;
    }

    public final String component2() {
        return this.fileSavingText;
    }

    public final String component3() {
        return this.fileSavedText;
    }

    public final String component4() {
        return this.saveFailedText;
    }

    public final String component5() {
        return this.permissionDeniedText;
    }

    public final DownloadState copy(boolean z, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new DownloadState(z, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadState)) {
            return false;
        }
        DownloadState downloadState = (DownloadState) obj;
        return this.showDownloadAction == downloadState.showDownloadAction && xj5.a(this.fileSavingText, downloadState.fileSavingText) && xj5.a(this.fileSavedText, downloadState.fileSavedText) && xj5.a(this.saveFailedText, downloadState.saveFailedText) && xj5.a(this.permissionDeniedText, downloadState.permissionDeniedText);
    }

    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    public final String getPermissionDeniedText() {
        return this.permissionDeniedText;
    }

    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    public int hashCode() {
        return this.permissionDeniedText.hashCode() + ru3.c(ru3.c(ru3.c(Boolean.hashCode(this.showDownloadAction) * 31, 31, this.fileSavingText), 31, this.fileSavedText), 31, this.saveFailedText);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownloadState(showDownloadAction=");
        sb.append(this.showDownloadAction);
        sb.append(", fileSavingText=");
        sb.append(this.fileSavingText);
        sb.append(", fileSavedText=");
        sb.append(this.fileSavedText);
        sb.append(", saveFailedText=");
        sb.append(this.saveFailedText);
        sb.append(", permissionDeniedText=");
        return wu0.a(sb, this.permissionDeniedText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.showDownloadAction ? 1 : 0);
        parcel.writeString(this.fileSavingText);
        parcel.writeString(this.fileSavedText);
        parcel.writeString(this.saveFailedText);
        parcel.writeString(this.permissionDeniedText);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<DownloadState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DownloadState createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new DownloadState(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DownloadState[] newArray(int i) {
            return new DownloadState[i];
        }
    }
}
