package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vn0 implements Parcelable {
    public static final Parcelable.Creator<vn0> CREATOR = new a();
    public final boolean A;
    public final int t;
    public final String u;
    public final double v;
    public final Double w;
    public final String x;
    public final m2b y;
    public final xn0 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<vn0> {
        @Override // android.os.Parcelable.Creator
        public final vn0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new vn0(parcel.readInt(), parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), m2b.valueOf(parcel.readString()), xn0.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final vn0[] newArray(int i) {
            return new vn0[i];
        }
    }

    public vn0(int i, String str, double d, Double d2, String str2, m2b m2bVar, xn0 xn0Var, boolean z) {
        str.getClass();
        str2.getClass();
        m2bVar.getClass();
        xn0Var.getClass();
        this.t = i;
        this.u = str;
        this.v = d;
        this.w = d2;
        this.x = str2;
        this.y = m2bVar;
        this.z = xn0Var;
        this.A = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn0)) {
            return false;
        }
        vn0 vn0Var = (vn0) obj;
        return this.t == vn0Var.t && xj5.a(this.u, vn0Var.u) && Double.compare(this.v, vn0Var.v) == 0 && xj5.a(this.w, vn0Var.w) && xj5.a(this.x, vn0Var.x) && this.y == vn0Var.y && this.z == vn0Var.z && this.A == vn0Var.A;
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.v) + ru3.c(Integer.hashCode(this.t) * 31, 31, this.u)) * 31;
        Double d = this.w;
        return Boolean.hashCode(this.A) + ((this.z.hashCode() + ((this.y.hashCode() + ru3.c((iHashCode + (d == null ? 0 : d.hashCode())) * 31, 31, this.x)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("Benchmark(id=", ", name=", this.u, ", value=", this.t);
        sbA.append(this.v);
        sbA.append(", secondValue=");
        sbA.append(this.w);
        sbA.append(", symbol=");
        sbA.append(this.x);
        sbA.append(", units=");
        sbA.append(this.y);
        sbA.append(", benchmarkMeasureType=");
        sbA.append(this.z);
        sbA.append(", benchmarkIsEmpty=");
        sbA.append(this.A);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.t);
        parcel.writeString(this.u);
        parcel.writeDouble(this.v);
        Double d = this.w;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.x);
        parcel.writeString(this.y.name());
        parcel.writeString(this.z.name());
        parcel.writeInt(this.A ? 1 : 0);
    }
}
