package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dwb extends p2 {
    public static final Parcelable.Creator<dwb> CREATOR = new gwb();
    public final int t;
    public final bxb u;

    public dwb(int i, bxb bxbVar) {
        this.t = i;
        this.u = bxbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.h(parcel, 2, this.u, i);
        ms3.n(parcel, iM);
    }
}
