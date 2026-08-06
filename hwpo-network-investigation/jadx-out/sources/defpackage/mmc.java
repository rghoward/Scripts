package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mmc extends p2 {
    public static final Parcelable.Creator<mmc> CREATOR = new noc();
    public Bundle t;
    public fu3[] u;
    public int v;
    public ex1 w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.c(parcel, 1, this.t);
        ms3.j(parcel, 2, this.u, i);
        int i2 = this.v;
        ms3.l(parcel, 3, 4);
        parcel.writeInt(i2);
        ms3.h(parcel, 4, this.w, i);
        ms3.n(parcel, iM);
    }
}
