package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class inc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        long jM = 0;
        String strF = null;
        String strF2 = null;
        dnc[] dncVarArr = null;
        byte[] bArrB = null;
        boolean zJ = false;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strF = sz8.f(parcel, i);
                    break;
                case 3:
                    strF2 = sz8.f(parcel, i);
                    break;
                case 4:
                    dncVarArr = (dnc[]) sz8.g(parcel, i, dnc.CREATOR);
                    break;
                case 5:
                    zJ = sz8.j(parcel, i);
                    break;
                case 6:
                    bArrB = sz8.b(parcel, i);
                    break;
                case 7:
                    jM = sz8.m(parcel, i);
                    break;
                default:
                    sz8.o(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new gnc(strF, strF2, dncVarArr, zJ, bArrB, jM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new gnc[i];
    }
}
