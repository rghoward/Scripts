package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lxc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        int iL = 0;
        long jM = 0;
        String strF = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strF = sz8.f(parcel, i);
            } else if (c == 2) {
                jM = sz8.m(parcel, i);
            } else if (c != 3) {
                sz8.o(parcel, i);
            } else {
                iL = sz8.l(parcel, i);
            }
        }
        sz8.i(parcel, iP);
        return new kxc(iL, jM, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kxc[i];
    }
}
