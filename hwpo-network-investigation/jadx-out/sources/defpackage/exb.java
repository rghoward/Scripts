package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class exb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        int iL = 0;
        boolean zJ = false;
        boolean zJ2 = false;
        IBinder iBinderK = null;
        ax1 ax1Var = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iL = sz8.l(parcel, i);
            } else if (c == 2) {
                iBinderK = sz8.k(parcel, i);
            } else if (c == 3) {
                ax1Var = (ax1) sz8.e(parcel, i, ax1.CREATOR);
            } else if (c == 4) {
                zJ = sz8.j(parcel, i);
            } else if (c != 5) {
                sz8.o(parcel, i);
            } else {
                zJ2 = sz8.j(parcel, i);
            }
        }
        sz8.i(parcel, iP);
        return new dxb(iL, iBinderK, ax1Var, zJ, zJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dxb[i];
    }
}
