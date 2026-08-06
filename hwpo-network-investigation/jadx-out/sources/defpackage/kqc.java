package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kqc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        rx8 rx8Var = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zJ = false;
        boolean zJ2 = false;
        int iL = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    rx8Var = (rx8) sz8.e(parcel, i, rx8.CREATOR);
                    break;
                case 2:
                    zJ = sz8.j(parcel, i);
                    break;
                case 3:
                    zJ2 = sz8.j(parcel, i);
                    break;
                case 4:
                    iArrD = sz8.d(parcel, i);
                    break;
                case 5:
                    iL = sz8.l(parcel, i);
                    break;
                case 6:
                    iArrD2 = sz8.d(parcel, i);
                    break;
                default:
                    sz8.o(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new ex1(rx8Var, zJ, zJ2, iArrD, iL, iArrD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ex1[i];
    }
}
