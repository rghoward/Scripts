package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h6c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        String strF = null;
        String strF2 = null;
        szc szcVar = null;
        String strF3 = null;
        z9c z9cVar = null;
        z9c z9cVar2 = null;
        z9c z9cVar3 = null;
        long jM = 0;
        long jM2 = 0;
        long jM3 = 0;
        boolean zJ = false;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strF = sz8.f(parcel, i);
                    break;
                case 3:
                    strF2 = sz8.f(parcel, i);
                    break;
                case 4:
                    szcVar = (szc) sz8.e(parcel, i, szc.CREATOR);
                    break;
                case 5:
                    jM = sz8.m(parcel, i);
                    break;
                case 6:
                    zJ = sz8.j(parcel, i);
                    break;
                case 7:
                    strF3 = sz8.f(parcel, i);
                    break;
                case '\b':
                    z9cVar = (z9c) sz8.e(parcel, i, z9c.CREATOR);
                    break;
                case '\t':
                    jM2 = sz8.m(parcel, i);
                    break;
                case '\n':
                    z9cVar2 = (z9c) sz8.e(parcel, i, z9c.CREATOR);
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    jM3 = sz8.m(parcel, i);
                    break;
                case '\f':
                    z9cVar3 = (z9c) sz8.e(parcel, i, z9c.CREATOR);
                    break;
                default:
                    sz8.o(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new e5c(strF, strF2, szcVar, jM, zJ, strF3, z9cVar, jM2, z9cVar2, jM3, z9cVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new e5c[i];
    }
}
