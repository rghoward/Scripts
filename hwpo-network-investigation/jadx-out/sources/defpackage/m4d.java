package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m4d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        boolean zJ = false;
        String strF = null;
        IBinder iBinderK = null;
        boolean zJ2 = false;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strF = sz8.f(parcel, i);
            } else if (c == 2) {
                iBinderK = sz8.k(parcel, i);
            } else if (c == 3) {
                zJ = sz8.j(parcel, i);
            } else if (c != 4) {
                sz8.o(parcel, i);
            } else {
                zJ2 = sz8.j(parcel, i);
            }
        }
        sz8.i(parcel, iP);
        return new n3d(strF, iBinderK, zJ, zJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new n3d[i];
    }
}
