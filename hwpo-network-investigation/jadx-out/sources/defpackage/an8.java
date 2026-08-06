package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class an8 implements Parcelable.Creator<zm8> {
    @Override // android.os.Parcelable.Creator
    public final zm8 createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                sz8.o(parcel, i);
            } else {
                bundleA = sz8.a(parcel, i);
            }
        }
        sz8.i(parcel, iP);
        return new zm8(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final zm8[] newArray(int i) {
        return new zm8[i];
    }
}
