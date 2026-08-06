package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class re implements Parcelable {
    public static final Parcelable.Creator<re> CREATOR = new a();
    public final oq4.b t;
    public final oq4.a u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<re> {
        @Override // android.os.Parcelable.Creator
        public final re createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new re(parcel.readInt() == 0 ? null : oq4.b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? oq4.a.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final re[] newArray(int i) {
            return new re[i];
        }
    }

    public re(oq4.b bVar, oq4.a aVar) {
        this.t = bVar;
        this.u = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        return xj5.a(this.t, reVar.t) && xj5.a(this.u, reVar.u);
    }

    public final int hashCode() {
        oq4.b bVar = this.t;
        int iHashCode = (bVar == null ? 0 : bVar.t.hashCode()) * 31;
        oq4.a aVar = this.u;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "AffiliatedGymFilterResult(country=" + this.t + ", city=" + this.u + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        oq4.b bVar = this.t;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.t);
        }
        oq4.a aVar = this.u;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i);
        }
    }
}
