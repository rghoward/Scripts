package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yr2 implements Parcelable {
    public static final Parcelable.Creator<yr2> CREATOR = new a();
    public final int t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<yr2> {
        @Override // android.os.Parcelable.Creator
        public final yr2 createFromParcel(Parcel parcel) {
            return new yr2(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final yr2[] newArray(int i) {
            return new yr2[i];
        }
    }

    public yr2(int i) {
        this.t = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr2) && this.t == ((yr2) obj).t;
    }

    public final int hashCode() {
        return Integer.hashCode(this.t);
    }

    public final String toString() {
        return e44.a(new StringBuilder("DefaultLazyKey(index="), this.t, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.t);
    }
}
