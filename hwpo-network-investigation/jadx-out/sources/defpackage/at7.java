package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class at7 extends ru9 implements Parcelable {
    public static final Parcelable.Creator<at7> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<at7> {
        @Override // android.os.Parcelable.Creator
        public final at7 createFromParcel(Parcel parcel) {
            return new at7(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final at7[] newArray(int i) {
            return new at7[i];
        }
    }

    public at7(float f) {
        hu9 hu9VarJ = qu9.j();
        ru9.a aVar = new ru9.a(f, hu9VarJ.g());
        if (!(hu9VarJ instanceof fn4)) {
            aVar.b = new ru9.a(f, 1L);
        }
        this.u = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}
