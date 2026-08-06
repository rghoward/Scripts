package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class h08 implements Parcelable, s23 {
    public static final Parcelable.Creator<h08> CREATOR = new a();
    public final int t;
    public final String u;
    public final boolean v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<h08> {
        @Override // android.os.Parcelable.Creator
        public final h08 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h08(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final h08[] newArray(int i) {
            return new h08[i];
        }
    }

    public h08(int i, String str, boolean z) {
        str.getClass();
        this.t = i;
        this.u = str;
        this.v = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h08)) {
            return false;
        }
        h08 h08Var = (h08) obj;
        return this.t == h08Var.t && xj5.a(this.u, h08Var.u) && this.v == h08Var.v;
    }

    @Override // defpackage.s23, defpackage.ep1
    public final int getId() {
        return this.t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.v) + ru3.c(Integer.hashCode(this.t) * 31, 31, this.u);
    }

    public final String toString() {
        return fz.c(il.a("PlanOptionUiEntity(id=", ", title=", this.u, ", isDefault=", this.t), this.v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v ? 1 : 0);
    }
}
