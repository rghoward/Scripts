package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class snc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        boolean zJ = false;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        String strF = null;
        String strF2 = null;
        byte[] bArrB = null;
        double d = 0.0d;
        long jM = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strF = sz8.f(parcel, i);
                    break;
                case 3:
                    jM = sz8.m(parcel, i);
                    break;
                case 4:
                    zJ = sz8.j(parcel, i);
                    break;
                case 5:
                    sz8.q(parcel, i, 8);
                    d = parcel.readDouble();
                    break;
                case 6:
                    strF2 = sz8.f(parcel, i);
                    break;
                case 7:
                    bArrB = sz8.b(parcel, i);
                    break;
                case '\b':
                    iL = sz8.l(parcel, i);
                    break;
                case '\t':
                    iL2 = sz8.l(parcel, i);
                    break;
                case '\n':
                    iL3 = sz8.l(parcel, i);
                    break;
                default:
                    sz8.o(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new rnc(strF, jM, zJ, d, strF2, bArrB, iL, iL2, iL3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rnc[i];
    }
}
