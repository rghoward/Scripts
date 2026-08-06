package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zc8 implements Parcelable {
    public final int A;
    public final boolean B;
    public final v59 C;
    public final String D;
    public final int t;
    public final u59 u;
    public final int v;
    public final int w;
    public final int x;
    public final List<String> y;
    public final dd8 z;
    public static final a Companion = new a();
    public static final Parcelable.Creator<zc8> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements Parcelable.Creator<zc8> {
        @Override // android.os.Parcelable.Creator
        public final zc8 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new zc8(parcel.readInt(), u59.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList(), dd8.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0, v59.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final zc8[] newArray(int i) {
            return new zc8[i];
        }
    }

    public zc8(int i, u59 u59Var, int i2, int i3, int i4, List<String> list, dd8 dd8Var, int i5, boolean z, v59 v59Var, String str) {
        u59Var.getClass();
        list.getClass();
        dd8Var.getClass();
        v59Var.getClass();
        str.getClass();
        this.t = i;
        this.u = u59Var;
        this.v = i2;
        this.w = i3;
        this.x = i4;
        this.y = list;
        this.z = dd8Var;
        this.A = i5;
        this.B = z;
        this.C = v59Var;
        this.D = str;
    }

    public static zc8 a(zc8 zc8Var, dd8 dd8Var) {
        int i = zc8Var.t;
        u59 u59Var = zc8Var.u;
        int i2 = zc8Var.v;
        int i3 = zc8Var.w;
        int i4 = zc8Var.x;
        List<String> list = zc8Var.y;
        int i5 = zc8Var.A;
        boolean z = zc8Var.B;
        v59 v59Var = zc8Var.C;
        String str = zc8Var.D;
        u59Var.getClass();
        list.getClass();
        v59Var.getClass();
        str.getClass();
        return new zc8(i, u59Var, i2, i3, i4, list, dd8Var, i5, z, v59Var, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc8)) {
            return false;
        }
        zc8 zc8Var = (zc8) obj;
        return this.t == zc8Var.t && this.u == zc8Var.u && this.v == zc8Var.v && this.w == zc8Var.w && this.x == zc8Var.x && xj5.a(this.y, zc8Var.y) && xj5.a(this.z, zc8Var.z) && this.A == zc8Var.A && this.B == zc8Var.B && this.C == zc8Var.C && xj5.a(this.D, zc8Var.D);
    }

    public final int hashCode() {
        return this.D.hashCode() + ((this.C.hashCode() + uo2.a(os2.a(this.A, (this.z.hashCode() + ho2.a(os2.a(this.x, os2.a(this.w, os2.a(this.v, (this.u.hashCode() + (Integer.hashCode(this.t) * 31)) * 31, 31), 31), 31), 31, this.y)) * 31, 31), this.B, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgramScore(id=");
        sb.append(this.t);
        sb.append(", measureType=");
        sb.append(this.u);
        sb.append(", repsCount=");
        p23.a(sb, this.v, ", roundsCount=", this.w, ", intervalsCount=");
        sb.append(this.x);
        sb.append(", description=");
        sb.append(this.y);
        sb.append(", value=");
        sb.append(this.z);
        sb.append(", timeCapObjective=");
        sb.append(this.A);
        sb.append(", isScoreHasValue=");
        sb.append(this.B);
        sb.append(", scoreType=");
        sb.append(this.C);
        sb.append(", symbol=");
        return av.a(sb, this.D, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.t);
        parcel.writeString(this.u.name());
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeStringList(this.y);
        this.z.writeToParcel(parcel, i);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.C.name());
        parcel.writeString(this.D);
    }

    public zc8() {
        this(0);
    }

    public /* synthetic */ zc8(int i) {
        this(-1, u59.B, -1, -1, -1, hf3.t, new dd8(0, 1023, null), -1, false, v59.t, BuildConfig.FLAVOR);
    }
}
