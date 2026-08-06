package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c3c extends p2 {
    public static final Parcelable.Creator<c3c> CREATOR = new e4c();
    public final long t;
    public final int u;
    public final long v;

    public c3c(long j, int i, long j2) {
        this.t = j;
        this.u = i;
        this.v = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 8);
        parcel.writeLong(this.t);
        ms3.l(parcel, 2, 4);
        parcel.writeInt(this.u);
        ms3.l(parcel, 3, 8);
        parcel.writeLong(this.v);
        ms3.n(parcel, iM);
    }
}
