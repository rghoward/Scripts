package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ct7 extends tu9 implements Parcelable {
    public static final Parcelable.Creator<ct7> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<ct7> {
        @Override // android.os.Parcelable.Creator
        public final ct7 createFromParcel(Parcel parcel) {
            return new ct7(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ct7[] newArray(int i) {
            return new ct7[i];
        }
    }

    public ct7(long j) {
        hu9 hu9VarJ = qu9.j();
        tu9.a aVar = new tu9.a(hu9VarJ.g(), j);
        if (!(hu9VarJ instanceof fn4)) {
            aVar.b = new tu9.a(1L, j);
        }
        this.u = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(b());
    }
}
