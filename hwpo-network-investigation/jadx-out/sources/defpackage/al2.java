package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class al2 implements a21.c {
    public static final Parcelable.Creator<al2> CREATOR = new a();
    public final long t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<al2> {
        @Override // android.os.Parcelable.Creator
        public final al2 createFromParcel(Parcel parcel) {
            return new al2(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final al2[] newArray(int i) {
            return new al2[i];
        }
    }

    public al2(long j) {
        this.t = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al2) && this.t == ((al2) obj).t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.t)});
    }

    @Override // a21.c
    public final boolean p(long j) {
        return j >= this.t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.t);
    }
}
