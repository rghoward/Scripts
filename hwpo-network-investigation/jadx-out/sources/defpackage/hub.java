package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hub extends p2 {
    public static final Parcelable.Creator<hub> CREATOR = new zub();
    public final int t;
    public final String u;
    public final long v;
    public final int w;
    public final boolean x;

    public hub(int i, int i2, long j, String str, boolean z) {
        this.t = i;
        this.u = str;
        this.v = j;
        this.w = i2;
        this.x = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.i(parcel, 2, this.u);
        ms3.l(parcel, 3, 8);
        parcel.writeLong(this.v);
        ms3.l(parcel, 4, 4);
        parcel.writeInt(this.w);
        ms3.l(parcel, 5, 4);
        parcel.writeInt(this.x ? 1 : 0);
        ms3.n(parcel, iM);
    }
}
