package io.intercom.android.sdk.m5.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hf3;
import defpackage.os2;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.xj5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPreviewArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<IntercomPreviewArgs> CREATOR = new Creator();
    private final String ctaText;
    private final DeleteType deleteType;
    private final DownloadState downloadState;
    private final int initialIndex;
    private final boolean showSendCTA;
    private final List<IntercomPreviewFile> uris;

    public /* synthetic */ IntercomPreviewArgs(List list, DeleteType deleteType, String str, boolean z, int i, DownloadState downloadState, int i2, qq2 qq2Var) {
        this((i2 & 1) != 0 ? hf3.t : list, (i2 & 2) != 0 ? DeleteType.None.INSTANCE : deleteType, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? new DownloadState(false, "Saving...", "File saved", "Something went wrong", "Permission denied") : downloadState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomPreviewArgs copy$default(IntercomPreviewArgs intercomPreviewArgs, List list, DeleteType deleteType, String str, boolean z, int i, DownloadState downloadState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = intercomPreviewArgs.uris;
        }
        if ((i2 & 2) != 0) {
            deleteType = intercomPreviewArgs.deleteType;
        }
        if ((i2 & 4) != 0) {
            str = intercomPreviewArgs.ctaText;
        }
        if ((i2 & 8) != 0) {
            z = intercomPreviewArgs.showSendCTA;
        }
        if ((i2 & 16) != 0) {
            i = intercomPreviewArgs.initialIndex;
        }
        if ((i2 & 32) != 0) {
            downloadState = intercomPreviewArgs.downloadState;
        }
        int i3 = i;
        DownloadState downloadState2 = downloadState;
        return intercomPreviewArgs.copy(list, deleteType, str, z, i3, downloadState2);
    }

    public final List<IntercomPreviewFile> component1() {
        return this.uris;
    }

    public final DeleteType component2() {
        return this.deleteType;
    }

    public final String component3() {
        return this.ctaText;
    }

    public final boolean component4() {
        return this.showSendCTA;
    }

    public final int component5() {
        return this.initialIndex;
    }

    public final DownloadState component6() {
        return this.downloadState;
    }

    public final IntercomPreviewArgs copy(List<? extends IntercomPreviewFile> list, DeleteType deleteType, String str, boolean z, int i, DownloadState downloadState) {
        list.getClass();
        deleteType.getClass();
        downloadState.getClass();
        return new IntercomPreviewArgs(list, deleteType, str, z, i, downloadState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomPreviewArgs)) {
            return false;
        }
        IntercomPreviewArgs intercomPreviewArgs = (IntercomPreviewArgs) obj;
        return xj5.a(this.uris, intercomPreviewArgs.uris) && xj5.a(this.deleteType, intercomPreviewArgs.deleteType) && xj5.a(this.ctaText, intercomPreviewArgs.ctaText) && this.showSendCTA == intercomPreviewArgs.showSendCTA && this.initialIndex == intercomPreviewArgs.initialIndex && xj5.a(this.downloadState, intercomPreviewArgs.downloadState);
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final DeleteType getDeleteType() {
        return this.deleteType;
    }

    public final DownloadState getDownloadState() {
        return this.downloadState;
    }

    public final int getInitialIndex() {
        return this.initialIndex;
    }

    public final boolean getShowSendCTA() {
        return this.showSendCTA;
    }

    public final List<IntercomPreviewFile> getUris() {
        return this.uris;
    }

    public int hashCode() {
        int iHashCode = (this.deleteType.hashCode() + (this.uris.hashCode() * 31)) * 31;
        String str = this.ctaText;
        return this.downloadState.hashCode() + os2.a(this.initialIndex, uo2.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.showSendCTA, 31), 31);
    }

    public String toString() {
        return "IntercomPreviewArgs(uris=" + this.uris + ", deleteType=" + this.deleteType + ", ctaText=" + this.ctaText + ", showSendCTA=" + this.showSendCTA + ", initialIndex=" + this.initialIndex + ", downloadState=" + this.downloadState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List<IntercomPreviewFile> list = this.uris;
        parcel.writeInt(list.size());
        Iterator<IntercomPreviewFile> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeParcelable(this.deleteType, i);
        parcel.writeString(this.ctaText);
        parcel.writeInt(this.showSendCTA ? 1 : 0);
        parcel.writeInt(this.initialIndex);
        this.downloadState.writeToParcel(parcel, i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<IntercomPreviewArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntercomPreviewArgs createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(IntercomPreviewArgs.class.getClassLoader()));
            }
            return new IntercomPreviewArgs(arrayList, (DeleteType) parcel.readParcelable(IntercomPreviewArgs.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), DownloadState.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntercomPreviewArgs[] newArray(int i) {
            return new IntercomPreviewArgs[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntercomPreviewArgs(List<? extends IntercomPreviewFile> list, DeleteType deleteType, String str, boolean z, int i, DownloadState downloadState) {
        list.getClass();
        deleteType.getClass();
        downloadState.getClass();
        this.uris = list;
        this.deleteType = deleteType;
        this.ctaText = str;
        this.showSendCTA = z;
        this.initialIndex = i;
        this.downloadState = downloadState;
    }

    public IntercomPreviewArgs() {
        this(null, null, null, false, 0, null, 63, null);
    }
}
