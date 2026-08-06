package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cv6 extends p2 {
    public static final Parcelable.Creator<cv6> CREATOR = new uwb();
    public final int A;
    public final int B;
    public final int t;
    public final int u;
    public final int v;
    public final long w;
    public final long x;
    public final String y;
    public final String z;

    public cv6(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.w = j;
        this.x = j2;
        this.y = str;
        this.z = str2;
        this.A = i4;
        this.B = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.l(parcel, 2, 4);
        parcel.writeInt(this.u);
        ms3.l(parcel, 3, 4);
        parcel.writeInt(this.v);
        ms3.l(parcel, 4, 8);
        parcel.writeLong(this.w);
        ms3.l(parcel, 5, 8);
        parcel.writeLong(this.x);
        ms3.i(parcel, 6, this.y);
        ms3.i(parcel, 7, this.z);
        ms3.l(parcel, 8, 4);
        parcel.writeInt(this.A);
        ms3.l(parcel, 9, 4);
        parcel.writeInt(this.B);
        ms3.n(parcel, iM);
    }
}
