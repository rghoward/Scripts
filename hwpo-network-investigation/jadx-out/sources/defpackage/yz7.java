package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yz7 implements Parcelable {
    public static final Parcelable.Creator<yz7> CREATOR = new a();
    public final Integer t;
    public final String u;
    public final String v;
    public final ArrayList w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<yz7> {
        @Override // android.os.Parcelable.Creator
        public final yz7 createFromParcel(Parcel parcel) {
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(h08.CREATOR.createFromParcel(parcel));
            }
            return new yz7(numValueOf, string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final yz7[] newArray(int i) {
            return new yz7[i];
        }
    }

    public yz7(Integer num, String str, String str2, ArrayList arrayList) {
        str.getClass();
        this.t = num;
        this.u = str;
        this.v = str2;
        this.w = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz7)) {
            return false;
        }
        yz7 yz7Var = (yz7) obj;
        return xj5.a(this.t, yz7Var.t) && xj5.a(this.u, yz7Var.u) && xj5.a(this.v, yz7Var.v) && this.w.equals(yz7Var.w);
    }

    public final int hashCode() {
        Integer num = this.t;
        int iC = ru3.c((num == null ? 0 : num.hashCode()) * 31, 31, this.u);
        String str = this.v;
        return this.w.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Plan(id=" + this.t + ", title=" + this.u + ", cover=" + this.v + ", options=" + this.w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = 0;
        Integer num = this.t;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        ArrayList arrayList = this.w;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((h08) obj).writeToParcel(parcel, i);
        }
    }
}
