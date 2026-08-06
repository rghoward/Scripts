package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nwb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        ax1 ax1Var = null;
        int iL = 0;
        dxb dxbVar = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iL = sz8.l(parcel, i);
            } else if (c == 2) {
                ax1Var = (ax1) sz8.e(parcel, i, ax1.CREATOR);
            } else if (c != 3) {
                sz8.o(parcel, i);
            } else {
                dxbVar = (dxb) sz8.e(parcel, i, dxb.CREATOR);
            }
        }
        sz8.i(parcel, iP);
        return new kwb(iL, ax1Var, dxbVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kwb[i];
    }
}
