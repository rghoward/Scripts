package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wxc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        byte[] bArrB = null;
        String strF = null;
        Bundle bundleA = null;
        String strF2 = null;
        long jM = 0;
        long jM2 = 0;
        int iL = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jM = sz8.m(parcel, i);
                    break;
                case 2:
                    bArrB = sz8.b(parcel, i);
                    break;
                case 3:
                    strF = sz8.f(parcel, i);
                    break;
                case 4:
                    bundleA = sz8.a(parcel, i);
                    break;
                case 5:
                    iL = sz8.l(parcel, i);
                    break;
                case 6:
                    jM2 = sz8.m(parcel, i);
                    break;
                case 7:
                    strF2 = sz8.f(parcel, i);
                    break;
                default:
                    sz8.o(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new uxc(jM, bArrB, strF, bundleA, iL, jM2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new uxc[i];
    }
}
