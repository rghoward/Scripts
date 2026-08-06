package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wnc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        boolean zJ = false;
        String strF = null;
        String strF2 = null;
        rnc rncVar = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strF = sz8.f(parcel, i);
            } else if (c == 3) {
                strF2 = sz8.f(parcel, i);
            } else if (c == 4) {
                rncVar = (rnc) sz8.e(parcel, i, rnc.CREATOR);
            } else if (c != 5) {
                sz8.o(parcel, i);
            } else {
                zJ = sz8.j(parcel, i);
            }
        }
        sz8.i(parcel, iP);
        return new unc(strF, strF2, rncVar, zJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new unc[i];
    }
}
