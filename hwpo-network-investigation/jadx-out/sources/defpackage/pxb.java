package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pxb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        PendingIntent pendingIntent = null;
        String strF = null;
        Integer numValueOf = null;
        int iL = 0;
        int iL2 = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iL = sz8.l(parcel, i);
            } else if (c == 2) {
                iL2 = sz8.l(parcel, i);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) sz8.e(parcel, i, PendingIntent.CREATOR);
            } else if (c == 4) {
                strF = sz8.f(parcel, i);
            } else if (c != 5) {
                sz8.o(parcel, i);
            } else {
                int iN = sz8.n(parcel, i);
                if (iN == 0) {
                    numValueOf = null;
                } else {
                    sz8.r(parcel, iN, 4);
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
            }
        }
        sz8.i(parcel, iP);
        return new ax1(iL, iL2, pendingIntent, strF, numValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ax1[i];
    }
}
