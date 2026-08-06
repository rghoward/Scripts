package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t60 implements Parcelable {
    public static final Parcelable.Creator<t60> CREATOR = new a();
    public final String A;
    public final Long B;
    public final String C;
    public final long t;
    public final String u;
    public final u60 v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<t60> {
        @Override // android.os.Parcelable.Creator
        public final t60 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t60(parcel.readLong(), parcel.readString(), u60.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final t60[] newArray(int i) {
            return new t60[i];
        }
    }

    public t60(long j, String str, u60 u60Var, String str2, String str3, String str4, String str5, String str6, Long l, String str7) {
        str.getClass();
        u60Var.getClass();
        str2.getClass();
        str5.getClass();
        str7.getClass();
        this.t = j;
        this.u = str;
        this.v = u60Var;
        this.w = str2;
        this.x = str3;
        this.y = str4;
        this.z = str5;
        this.A = str6;
        this.B = l;
        this.C = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t60)) {
            return false;
        }
        t60 t60Var = (t60) obj;
        return this.t == t60Var.t && xj5.a(this.u, t60Var.u) && this.v == t60Var.v && xj5.a(this.w, t60Var.w) && xj5.a(this.x, t60Var.x) && xj5.a(this.y, t60Var.y) && xj5.a(this.z, t60Var.z) && xj5.a(this.A, t60Var.A) && xj5.a(this.B, t60Var.B) && xj5.a(this.C, t60Var.C);
    }

    public final int hashCode() {
        int iC = ru3.c((this.v.hashCode() + ru3.c(Long.hashCode(this.t) * 31, 31, this.u)) * 31, 31, this.w);
        String str = this.x;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.y;
        int iC2 = ru3.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.z);
        String str3 = this.A;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.B;
        return this.C.hashCode() + ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachmentDto(id=");
        sb.append(this.t);
        sb.append(", title=");
        sb.append(this.u);
        sb.append(", type=");
        sb.append(this.v);
        sb.append(", sourceUrl=");
        sb.append(this.w);
        ux1.b(sb, ", streamUrl=", this.x, ", thumbnailUrl=", this.y);
        ux1.b(sb, ", contentType=", this.z, ", fileSize=", this.A);
        sb.append(", fileSizeInBytes=");
        sb.append(this.B);
        sb.append(", fileExtension=");
        sb.append(this.C);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v.name());
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        Long l = this.B;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.C);
    }
}
