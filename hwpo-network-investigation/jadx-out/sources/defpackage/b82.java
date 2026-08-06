package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b82 implements Parcelable {
    public static final Parcelable.Creator<b82> CREATOR = new a();
    public final String t;
    public final AtomicLong u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<b82> {
        @Override // android.os.Parcelable.Creator
        public final b82 createFromParcel(Parcel parcel) {
            return new b82(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b82[] newArray(int i) {
            return new b82[i];
        }
    }

    public b82(Parcel parcel) {
        this.t = parcel.readString();
        this.u = new AtomicLong(parcel.readLong());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.t);
        parcel.writeLong(this.u.get());
    }

    public b82(String str) {
        this.t = str;
        this.u = new AtomicLong(0L);
    }
}
