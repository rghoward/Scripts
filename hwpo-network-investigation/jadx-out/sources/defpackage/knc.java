package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class knc extends p2 {
    public static final Parcelable.Creator<knc> CREATOR = new mnc();
    public final byte[] t;

    public knc(byte[] bArr) {
        this.t = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.d(parcel, 2, this.t);
        ms3.n(parcel, iM);
    }
}
