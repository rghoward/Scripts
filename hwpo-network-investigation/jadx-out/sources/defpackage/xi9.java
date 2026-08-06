package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xi9 implements Parcelable {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends xi9 {
        public static final Parcelable.Creator<a> CREATOR = new C0281a();
        public final int t;
        public final LocalDate u;

        /* JADX INFO: renamed from: xi9$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0281a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readInt(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(int i, LocalDate localDate) {
            localDate.getClass();
            this.t = i;
            this.u = localDate;
        }

        @Override // defpackage.xi9
        public final LocalDate a() {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.t == aVar.t && xj5.a(this.u, aVar.u);
        }

        public final int hashCode() {
            return this.u.hashCode() + (Integer.hashCode(this.t) * 31);
        }

        public final String toString() {
            return "PlanId(id=" + this.t + ", date=" + this.u + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.t);
            parcel.writeSerializable(this.u);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends xi9 {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final int t;
        public final LocalDate u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readInt(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(int i, LocalDate localDate) {
            localDate.getClass();
            this.t = i;
            this.u = localDate;
        }

        @Override // defpackage.xi9
        public final LocalDate a() {
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
            return this.t == bVar.t && xj5.a(this.u, bVar.u);
        }

        public final int hashCode() {
            return this.u.hashCode() + (Integer.hashCode(this.t) * 31);
        }

        public final String toString() {
            return "ProgramId(id=" + this.t + ", date=" + this.u + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.t);
            parcel.writeSerializable(this.u);
        }
    }

    public abstract LocalDate a();
}
