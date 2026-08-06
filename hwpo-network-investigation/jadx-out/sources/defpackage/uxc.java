package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uxc extends p2 {
    public static final Parcelable.Creator<uxc> CREATOR = new wxc();
    public final long t;
    public byte[] u;
    public final String v;
    public final Bundle w;
    public final int x;
    public final long y;
    public String z;

    public uxc(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.t = j;
        this.u = bArr;
        this.v = str;
        this.w = bundle;
        this.x = i;
        this.y = j2;
        this.z = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 8);
        parcel.writeLong(this.t);
        ms3.d(parcel, 2, this.u);
        ms3.i(parcel, 3, this.v);
        ms3.c(parcel, 4, this.w);
        ms3.l(parcel, 5, 4);
        parcel.writeInt(this.x);
        ms3.l(parcel, 6, 8);
        parcel.writeLong(this.y);
        ms3.i(parcel, 7, this.z);
        ms3.n(parcel, iM);
    }
}
