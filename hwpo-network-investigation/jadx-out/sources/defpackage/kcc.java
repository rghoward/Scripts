package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kcc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        Bundle bundleA = null;
        String strF = null;
        boolean zJ = false;
        long jM = 0;
        long jM2 = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jM = sz8.m(parcel, i);
            } else if (c == 2) {
                jM2 = sz8.m(parcel, i);
            } else if (c == 3) {
                zJ = sz8.j(parcel, i);
            } else if (c == 7) {
                bundleA = sz8.a(parcel, i);
            } else if (c != '\b') {
                sz8.o(parcel, i);
            } else {
                strF = sz8.f(parcel, i);
            }
        }
        sz8.i(parcel, iP);
        return new jcc(jM, jM2, zJ, bundleA, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new jcc[i];
    }
}
