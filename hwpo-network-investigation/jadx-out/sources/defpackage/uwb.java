package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uwb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        int iL = -1;
        int iL2 = 0;
        int iL3 = 0;
        int iL4 = 0;
        int iL5 = 0;
        String strF = null;
        String strF2 = null;
        long jM = 0;
        long jM2 = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iL2 = sz8.l(parcel, i);
                    break;
                case 2:
                    iL3 = sz8.l(parcel, i);
                    break;
                case 3:
                    iL4 = sz8.l(parcel, i);
                    break;
                case 4:
                    jM = sz8.m(parcel, i);
                    break;
                case 5:
                    jM2 = sz8.m(parcel, i);
                    break;
                case 6:
                    strF = sz8.f(parcel, i);
                    break;
                case 7:
                    strF2 = sz8.f(parcel, i);
                    break;
                case '\b':
                    iL5 = sz8.l(parcel, i);
                    break;
                case '\t':
                    iL = sz8.l(parcel, i);
                    break;
                default:
                    sz8.o(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new cv6(iL2, iL3, iL4, jM, jM2, strF, strF2, iL5, iL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cv6[i];
    }
}
