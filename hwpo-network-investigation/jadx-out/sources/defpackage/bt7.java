package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bt7 extends su9 implements Parcelable {
    public static final Parcelable.Creator<bt7> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<bt7> {
        @Override // android.os.Parcelable.Creator
        public final bt7 createFromParcel(Parcel parcel) {
            return new bt7(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final bt7[] newArray(int i) {
            return new bt7[i];
        }
    }

    public bt7(int i) {
        hu9 hu9VarJ = qu9.j();
        su9.a aVar = new su9.a(i, hu9VarJ.g());
        if (!(hu9VarJ instanceof fn4)) {
            aVar.b = new su9.a(i, 1L);
        }
        this.u = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(k());
    }
}
