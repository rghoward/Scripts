package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ed6 implements Parcelable {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ed6 {
        public static final Parcelable.Creator<a> CREATOR = new C0081a();
        public final String t;
        public final oq4.a u;
        public final int v;
        public final int w;

        /* JADX INFO: renamed from: ed6$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0081a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readString(), parcel.readInt() == 0 ? null : oq4.a.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(String str, oq4.a aVar, int i, int i2) {
            str.getClass();
            this.t = str;
            this.u = aVar;
            this.v = i;
            this.w = i2;
        }

        @Override // defpackage.ed6
        public final int a() {
            return this.w;
        }

        @Override // defpackage.ed6
        public final oq4 b() {
            return this.u;
        }

        @Override // defpackage.ed6
        public final int c() {
            return this.v;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.t, aVar.t) && xj5.a(this.u, aVar.u) && this.v == aVar.v && this.w == aVar.w;
        }

        public final int hashCode() {
            int iHashCode = this.t.hashCode() * 31;
            oq4.a aVar = this.u;
            return Integer.hashCode(this.w) + os2.a(this.v, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        }

        public final String toString() {
            return "City(country=" + this.t + ", preSelected=" + this.u + ", title=" + this.v + ", itemsLabelText=" + this.w + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.t);
            oq4.a aVar = this.u;
            if (aVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                aVar.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.v);
            parcel.writeInt(this.w);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends ed6 {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final oq4.b t;
        public final int u;
        public final int v;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readInt() == 0 ? null : oq4.b.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(oq4.b bVar, int i, int i2) {
            this.t = bVar;
            this.u = i;
            this.v = i2;
        }

        @Override // defpackage.ed6
        public final int a() {
            return this.v;
        }

        @Override // defpackage.ed6
        public final oq4 b() {
            return this.t;
        }

        @Override // defpackage.ed6
        public final int c() {
            return this.u;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return xj5.a(this.t, bVar.t) && this.u == bVar.u && this.v == bVar.v;
        }

        public final int hashCode() {
            oq4.b bVar = this.t;
            return Integer.hashCode(this.v) + os2.a(this.u, (bVar == null ? 0 : bVar.t.hashCode()) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Country(preSelected=");
            sb.append(this.t);
            sb.append(", title=");
            sb.append(this.u);
            sb.append(", itemsLabelText=");
            return i34.b(this.v, ")", sb);
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
            parcel.writeInt(this.u);
            parcel.writeInt(this.v);
        }
    }

    public abstract int a();

    public abstract oq4 b();

    public abstract int c();
}
