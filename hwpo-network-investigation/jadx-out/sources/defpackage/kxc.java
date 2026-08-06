package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kxc extends p2 {
    public static final Parcelable.Creator<kxc> CREATOR = new lxc();
    public final String t;
    public final long u;
    public final int v;

    public kxc(int i, long j, String str) {
        this.t = str;
        this.u = j;
        this.v = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 1, this.t);
        ms3.l(parcel, 2, 8);
        parcel.writeLong(this.u);
        ms3.l(parcel, 3, 4);
        parcel.writeInt(this.v);
        ms3.n(parcel, iM);
    }
}
