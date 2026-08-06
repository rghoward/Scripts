package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jcc extends p2 {
    public static final Parcelable.Creator<jcc> CREATOR = new kcc();
    public final long t;
    public final long u;
    public final boolean v;
    public final Bundle w;
    public final String x;

    public jcc(long j, long j2, boolean z, Bundle bundle, String str) {
        this.t = j;
        this.u = j2;
        this.v = z;
        this.w = bundle;
        this.x = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 8);
        parcel.writeLong(this.t);
        ms3.l(parcel, 2, 8);
        parcel.writeLong(this.u);
        ms3.l(parcel, 3, 4);
        parcel.writeInt(this.v ? 1 : 0);
        ms3.c(parcel, 7, this.w);
        ms3.i(parcel, 8, this.x);
        ms3.n(parcel, iM);
    }
}
