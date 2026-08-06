package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jdc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        String strF = null;
        ax1 ax1Var = null;
        int iL = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iL = sz8.l(parcel, i);
            } else if (c == 2) {
                strF = sz8.f(parcel, i);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) sz8.e(parcel, i, PendingIntent.CREATOR);
            } else if (c != 4) {
                sz8.o(parcel, i);
            } else {
                ax1Var = (ax1) sz8.e(parcel, i, ax1.CREATOR);
            }
        }
        sz8.i(parcel, iP);
        return new Status(iL, strF, pendingIntent, ax1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
