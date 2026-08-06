package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dd8 implements Parcelable {
    public static final Parcelable.Creator<dd8> CREATOR = new a();
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final int t;
    public final double u;
    public final String v;
    public final List<dd8> w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<dd8> {
        @Override // android.os.Parcelable.Creator
        public final dd8 createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            double d = parcel.readDouble();
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(dd8.CREATOR.createFromParcel(parcel));
            }
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new dd8(i, d, string, arrayList, i4, i5, i6, z, parcel.readInt() != 0, parcel.readInt() != 0 ? z : false);
        }

        @Override // android.os.Parcelable.Creator
        public final dd8[] newArray(int i) {
            return new dd8[i];
        }
    }

    public dd8(int i, double d, String str, List<dd8> list, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        str.getClass();
        list.getClass();
        this.t = i;
        this.u = d;
        this.v = str;
        this.w = list;
        this.x = i2;
        this.y = i3;
        this.z = i4;
        this.A = z;
        this.B = z2;
        this.C = z3;
    }

    public static dd8 a(dd8 dd8Var, double d, String str, ArrayList arrayList, int i, int i2, boolean z, boolean z2, boolean z3, int i3) {
        int i4 = dd8Var.t;
        if ((i3 & 2) != 0) {
            d = dd8Var.u;
        }
        double d2 = d;
        String str2 = (i3 & 4) != 0 ? dd8Var.v : str;
        List<dd8> list = (i3 & 8) != 0 ? dd8Var.w : arrayList;
        int i5 = (i3 & 16) != 0 ? dd8Var.x : i;
        int i6 = (i3 & 32) != 0 ? dd8Var.y : i2;
        int i7 = dd8Var.z;
        boolean z4 = (i3 & 128) != 0 ? dd8Var.A : z;
        boolean z5 = (i3 & 256) != 0 ? dd8Var.B : z2;
        boolean z6 = (i3 & 512) != 0 ? dd8Var.C : z3;
        dd8Var.getClass();
        str2.getClass();
        list.getClass();
        return new dd8(i4, d2, str2, list, i5, i6, i7, z4, z5, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd8)) {
            return false;
        }
        dd8 dd8Var = (dd8) obj;
        return this.t == dd8Var.t && Double.compare(this.u, dd8Var.u) == 0 && xj5.a(this.v, dd8Var.v) && xj5.a(this.w, dd8Var.w) && this.x == dd8Var.x && this.y == dd8Var.y && this.z == dd8Var.z && this.A == dd8Var.A && this.B == dd8Var.B && this.C == dd8Var.C;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.C) + uo2.a(uo2.a(os2.a(this.z, os2.a(this.y, os2.a(this.x, ho2.a(ru3.c((Double.hashCode(this.u) + (Integer.hashCode(this.t) * 31)) * 31, 31, this.v), 31, this.w), 31), 31), 31), this.A, 31), this.B, 31);
    }

    public final String toString() {
        return "ProgramScoreValue(id=" + this.t + ", value=" + this.u + ", formattedValue=" + this.v + ", intervals=" + this.w + ", rounds=" + this.x + ", reps=" + this.y + ", position=" + this.z + ", isScaled=" + this.A + ", linkMedia=" + this.B + ", linkNotes=" + this.C + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.t);
        parcel.writeDouble(this.u);
        parcel.writeString(this.v);
        List<dd8> list = this.w;
        parcel.writeInt(list.size());
        Iterator<dd8> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
    }

    public dd8() {
        this(0, 1023, null);
    }

    public /* synthetic */ dd8(int i, int i2, List list) {
        this(-1, -1.0d, BuildConfig.FLAVOR, (i2 & 8) != 0 ? hf3.t : list, -1, -1, (i2 & 64) != 0 ? -1 : i, false, false, false);
    }
}
