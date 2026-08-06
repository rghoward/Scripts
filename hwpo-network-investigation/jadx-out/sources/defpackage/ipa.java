package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ipa implements Parcelable {
    public static final Parcelable.Creator<ipa> CREATOR = new a();
    public final String t;
    public final String u;
    public final b v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<ipa> {
        @Override // android.os.Parcelable.Creator
        public final ipa createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ipa(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ipa[] newArray(int i) {
            return new ipa[i];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final String t;
        public final u60 u;
        public final String v;
        public final String w;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString(), u60.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(String str, u60 u60Var, String str2, String str3) {
            str.getClass();
            u60Var.getClass();
            str2.getClass();
            str3.getClass();
            this.t = str;
            this.u = u60Var;
            this.v = str2;
            this.w = str3;
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
            return xj5.a(this.t, bVar.t) && this.u == bVar.u && xj5.a(this.v, bVar.v) && xj5.a(this.w, bVar.w);
        }

        public final int hashCode() {
            return this.w.hashCode() + ru3.c((this.u.hashCode() + (this.t.hashCode() * 31)) * 31, 31, this.v);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TipAttachment(thumb=");
            sb.append(this.t);
            sb.append(", type=");
            sb.append(this.u);
            sb.append(", imageSource=");
            return ao2.a(sb, this.v, ", videoSource=", this.w, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.t);
            parcel.writeString(this.u.name());
            parcel.writeString(this.v);
            parcel.writeString(this.w);
        }
    }

    public ipa(String str, String str2, b bVar) {
        str.getClass();
        str2.getClass();
        this.t = str;
        this.u = str2;
        this.v = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        b bVar = this.v;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i);
        }
    }
}
