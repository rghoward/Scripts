package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l89 implements Parcelable {
    public static final Parcelable.Creator<l89> CREATOR = new a();
    public final String A;
    public final long B;
    public final String C;
    public final s60 D;
    public final z60 E;
    public final String F;
    public final Integer G;
    public final String H;
    public final long t;
    public final String u;
    public final u60 v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<l89> {
        @Override // android.os.Parcelable.Creator
        public final l89 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l89(parcel.readLong(), parcel.readString(), u60.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), s60.valueOf(parcel.readString()), z60.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final l89[] newArray(int i) {
            return new l89[i];
        }
    }

    public l89(long j, String str, u60 u60Var, String str2, String str3, String str4, String str5, String str6, long j2, String str7, s60 s60Var, z60 z60Var, String str8, Integer num) {
        str.getClass();
        u60Var.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        s60Var.getClass();
        z60Var.getClass();
        this.t = j;
        this.u = str;
        this.v = u60Var;
        this.w = str2;
        this.x = str3;
        this.y = str4;
        this.z = str5;
        this.A = str6;
        this.B = j2;
        this.C = str7;
        this.D = s60Var;
        this.E = z60Var;
        this.F = str8;
        this.G = num;
        this.H = z2a.L(str2, "://", str2);
    }

    public static l89 a(l89 l89Var, s60 s60Var, z60 z60Var, int i) {
        long j = l89Var.t;
        String str = l89Var.u;
        u60 u60Var = l89Var.v;
        String str2 = l89Var.w;
        String str3 = l89Var.x;
        String str4 = l89Var.y;
        String str5 = l89Var.z;
        String str6 = l89Var.A;
        long j2 = l89Var.B;
        String str7 = l89Var.C;
        s60 s60Var2 = (i & 1024) != 0 ? l89Var.D : s60Var;
        z60 z60Var2 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? l89Var.E : z60Var;
        String str8 = l89Var.F;
        Integer num = l89Var.G;
        str.getClass();
        u60Var.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        s60Var2.getClass();
        z60Var2.getClass();
        return new l89(j, str, u60Var, str2, str3, str4, str5, str6, j2, str7, s60Var2, z60Var2, str8, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l89)) {
            return false;
        }
        l89 l89Var = (l89) obj;
        return this.t == l89Var.t && xj5.a(this.u, l89Var.u) && this.v == l89Var.v && xj5.a(this.w, l89Var.w) && xj5.a(this.x, l89Var.x) && xj5.a(this.y, l89Var.y) && xj5.a(this.z, l89Var.z) && xj5.a(this.A, l89Var.A) && this.B == l89Var.B && xj5.a(this.C, l89Var.C) && this.D == l89Var.D && this.E == l89Var.E && xj5.a(this.F, l89Var.F) && xj5.a(this.G, l89Var.G);
    }

    public final int hashCode() {
        int iHashCode = (this.E.hashCode() + ((this.D.hashCode() + ru3.c(al.c(this.B, ru3.c(ru3.c(ru3.c(ru3.c(ru3.c((this.v.hashCode() + ru3.c(Long.hashCode(this.t) * 31, 31, this.u)) * 31, 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31), 31, this.C)) * 31)) * 31;
        String str = this.F;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.G;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionAttachment(id=");
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
        sb.append(", attachmentDownloadingStatus=");
        sb.append(this.D);
        sb.append(", attachmentUploadingStatus=");
        sb.append(this.E);
        sb.append(", youtubeVideoId=");
        sb.append(this.F);
        sb.append(", position=");
        sb.append(this.G);
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
        parcel.writeLong(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D.name());
        parcel.writeString(this.E.name());
        parcel.writeString(this.F);
        Integer num = this.G;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public /* synthetic */ l89(long j, String str, u60 u60Var, String str2, String str3, String str4, String str5) {
        this(j, str, u60Var, str2, str3, str4, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0L, str5, s60.t, z60.t, null, null);
    }
}
