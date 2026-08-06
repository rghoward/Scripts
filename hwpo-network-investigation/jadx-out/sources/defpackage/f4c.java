package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f4c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        boolean zJ = false;
        boolean zJ2 = false;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iL = sz8.l(parcel, i);
            } else if (c == 2) {
                zJ = sz8.j(parcel, i);
            } else if (c == 3) {
                zJ2 = sz8.j(parcel, i);
            } else if (c == 4) {
                iL2 = sz8.l(parcel, i);
            } else if (c != 5) {
                sz8.o(parcel, i);
            } else {
                iL3 = sz8.l(parcel, i);
            }
        }
        sz8.i(parcel, iP);
        return new rx8(iL, iL2, iL3, zJ, zJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rx8[i];
    }
}
