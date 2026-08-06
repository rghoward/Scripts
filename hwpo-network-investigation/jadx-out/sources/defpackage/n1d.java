package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n1d extends p2 {
    public static final Parcelable.Creator<n1d> CREATOR = new p2d();
    public final boolean t;
    public final String u;
    public final int v;
    public final int w;
    public final long x;

    public n1d(int i, int i2, long j, String str, boolean z) {
        this.t = z;
        this.u = str;
        this.v = e23.c(i) - 1;
        this.w = u7d.m(i2) - 1;
        this.x = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t ? 1 : 0);
        ms3.i(parcel, 2, this.u);
        ms3.l(parcel, 3, 4);
        parcel.writeInt(this.v);
        ms3.l(parcel, 4, 4);
        parcel.writeInt(this.w);
        ms3.l(parcel, 5, 8);
        parcel.writeLong(this.x);
        ms3.n(parcel, iM);
    }
}
