package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uzc implements Parcelable.Creator {
    public static void a(szc szcVar, Parcel parcel) {
        int i = szcVar.t;
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(i);
        ms3.i(parcel, 2, szcVar.u);
        long j = szcVar.v;
        ms3.l(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = szcVar.w;
        if (l != null) {
            ms3.l(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        ms3.i(parcel, 6, szcVar.x);
        ms3.i(parcel, 7, szcVar.y);
        Double d = szcVar.z;
        if (d != null) {
            ms3.l(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        ms3.n(parcel, iM);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        String strF = null;
        Long lValueOf = null;
        Float fValueOf = null;
        String strF2 = null;
        String strF3 = null;
        Double dValueOf = null;
        long jM = 0;
        int iL = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iL = sz8.l(parcel, i);
                    break;
                case 2:
                    strF = sz8.f(parcel, i);
                    break;
                case 3:
                    jM = sz8.m(parcel, i);
                    break;
                case 4:
                    int iN = sz8.n(parcel, i);
                    if (iN != 0) {
                        sz8.r(parcel, iN, 8);
                        lValueOf = Long.valueOf(parcel.readLong());
                    } else {
                        lValueOf = null;
                    }
                    break;
                case 5:
                    int iN2 = sz8.n(parcel, i);
                    if (iN2 != 0) {
                        sz8.r(parcel, iN2, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case 6:
                    strF2 = sz8.f(parcel, i);
                    break;
                case 7:
                    strF3 = sz8.f(parcel, i);
                    break;
                case '\b':
                    int iN3 = sz8.n(parcel, i);
                    if (iN3 != 0) {
                        sz8.r(parcel, iN3, 8);
                        dValueOf = Double.valueOf(parcel.readDouble());
                    } else {
                        dValueOf = null;
                    }
                    break;
                default:
                    sz8.o(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new szc(iL, strF, jM, lValueOf, fValueOf, strF2, strF3, dValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new szc[i];
    }
}
