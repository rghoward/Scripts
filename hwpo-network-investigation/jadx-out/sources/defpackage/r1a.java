package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r1a implements Comparable<r1a>, Parcelable {
    public static final Parcelable.Creator<r1a> CREATOR = new a();
    public final int t;
    public final int u;
    public final int v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<r1a> {
        @Override // android.os.Parcelable.Creator
        public final r1a createFromParcel(Parcel parcel) {
            return new r1a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final r1a[] newArray(int i) {
            return new r1a[i];
        }
    }

    static {
        n6b.H(0);
        n6b.H(1);
        n6b.H(2);
    }

    public r1a(Parcel parcel) {
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(r1a r1aVar) {
        r1a r1aVar2 = r1aVar;
        int i = this.t - r1aVar2.t;
        return (i == 0 && (i = this.u - r1aVar2.u) == 0) ? this.v - r1aVar2.v : i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1a.class == obj.getClass()) {
            r1a r1aVar = (r1a) obj;
            if (this.t == r1aVar.t && this.u == r1aVar.u && this.v == r1aVar.v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.t * 31) + this.u) * 31) + this.v;
    }

    public final String toString() {
        return this.t + "." + this.u + "." + this.v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
    }
}
