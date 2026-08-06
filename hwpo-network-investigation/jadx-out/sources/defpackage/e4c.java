package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e4c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        long jM = 0;
        long jM2 = 0;
        int iL = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jM = sz8.m(parcel, i);
            } else if (c == 2) {
                iL = sz8.l(parcel, i);
            } else if (c != 3) {
                sz8.o(parcel, i);
            } else {
                jM2 = sz8.m(parcel, i);
            }
        }
        sz8.i(parcel, iP);
        return new c3c(jM, iL, jM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new c3c[i];
    }
}
