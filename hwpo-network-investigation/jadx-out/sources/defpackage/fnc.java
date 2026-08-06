package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fnc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        int iL = 0;
        rnc[] rncVarArr = null;
        String[] strArr = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                iL = sz8.l(parcel, i);
            } else if (c == 3) {
                rncVarArr = (rnc[]) sz8.g(parcel, i, rnc.CREATOR);
            } else if (c != 4) {
                sz8.o(parcel, i);
            } else {
                int iN = sz8.n(parcel, i);
                int iDataPosition = parcel.dataPosition();
                if (iN == 0) {
                    strArr = null;
                } else {
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    parcel.setDataPosition(iDataPosition + iN);
                    strArr = strArrCreateStringArray;
                }
            }
        }
        sz8.i(parcel, iP);
        return new dnc(iL, rncVarArr, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dnc[i];
    }
}
