package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kwb extends p2 {
    public static final Parcelable.Creator<kwb> CREATOR = new nwb();
    public final int t;
    public final ax1 u;
    public final dxb v;

    public kwb(int i, ax1 ax1Var, dxb dxbVar) {
        this.t = i;
        this.u = ax1Var;
        this.v = dxbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.h(parcel, 2, this.u, i);
        ms3.h(parcel, 3, this.v, i);
        ms3.n(parcel, iM);
    }
}
