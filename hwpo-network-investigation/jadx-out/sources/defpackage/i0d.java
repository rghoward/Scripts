package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i0d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        boolean zJ = false;
        boolean zJ2 = false;
        boolean zJ3 = false;
        boolean zJ4 = false;
        boolean zJ5 = false;
        String strF = null;
        IBinder iBinderK = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strF = sz8.f(parcel, i);
                    break;
                case 2:
                    zJ = sz8.j(parcel, i);
                    break;
                case 3:
                    zJ2 = sz8.j(parcel, i);
                    break;
                case 4:
                    iBinderK = sz8.k(parcel, i);
                    break;
                case 5:
                    zJ3 = sz8.j(parcel, i);
                    break;
                case 6:
                    zJ4 = sz8.j(parcel, i);
                    break;
                case 7:
                default:
                    sz8.o(parcel, i);
                    break;
                case '\b':
                    zJ5 = sz8.j(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new uyc(strF, zJ, zJ2, iBinderK, zJ3, zJ4, zJ5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new uyc[i];
    }
}
