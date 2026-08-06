package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fu3 extends p2 {
    public static final Parcelable.Creator<fu3> CREATOR = new d9c();
    public final String t;

    @Deprecated
    public final int u;
    public final long v;
    public final boolean w;

    public fu3(String str, int i, long j, boolean z) {
        this.t = str;
        this.u = i;
        this.v = j;
        this.w = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fu3) {
            fu3 fu3Var = (fu3) obj;
            if (te7.a(this.t, fu3Var.t) && j() == fu3Var.j() && this.w == fu3Var.w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.t, Long.valueOf(j()), Boolean.valueOf(this.w)});
    }

    public final long j() {
        long j = this.v;
        return j == -1 ? this.u : j;
    }

    public final String toString() {
        te7.a aVar = new te7.a(this);
        aVar.a(this.t, "name");
        aVar.a(Long.valueOf(j()), "version");
        aVar.a(Boolean.valueOf(this.w), "is_fully_rolled_out");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 1, this.t);
        ms3.l(parcel, 2, 4);
        parcel.writeInt(this.u);
        long j = j();
        ms3.l(parcel, 3, 8);
        parcel.writeLong(j);
        ms3.l(parcel, 4, 4);
        parcel.writeInt(this.w ? 1 : 0);
        ms3.n(parcel, iM);
    }

    public fu3(String str) {
        this(str, -1, 1L, false);
    }
}
