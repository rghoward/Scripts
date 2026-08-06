package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pnc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        String strF = null;
        byte[] bArrB = null;
        byte[][] bArrC = null;
        byte[][] bArrC2 = null;
        byte[][] bArrC3 = null;
        byte[][] bArrC4 = null;
        int[] iArrD = null;
        byte[][] bArrC5 = null;
        int[] iArrD2 = null;
        byte[][] bArrC6 = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strF = sz8.f(parcel, i);
                    break;
                case 3:
                    bArrB = sz8.b(parcel, i);
                    break;
                case 4:
                    bArrC = sz8.c(parcel, i);
                    break;
                case 5:
                    bArrC2 = sz8.c(parcel, i);
                    break;
                case 6:
                    bArrC3 = sz8.c(parcel, i);
                    break;
                case 7:
                    bArrC4 = sz8.c(parcel, i);
                    break;
                case '\b':
                    iArrD = sz8.d(parcel, i);
                    break;
                case '\t':
                    bArrC5 = sz8.c(parcel, i);
                    break;
                case '\n':
                    iArrD2 = sz8.d(parcel, i);
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    bArrC6 = sz8.c(parcel, i);
                    break;
                default:
                    sz8.o(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new onc(strF, bArrB, bArrC, bArrC2, bArrC3, bArrC4, iArrD, bArrC5, iArrD2, bArrC6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new onc[i];
    }
}
