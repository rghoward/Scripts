package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ayc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        while (true) {
            ArrayList arrayList = null;
            while (true) {
                if (parcel.dataPosition() >= iP) {
                    sz8.i(parcel, iP);
                    return new yxc(arrayList);
                }
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    sz8.o(parcel, i);
                } else {
                    int iN = sz8.n(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iN == 0) {
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = parcel.readInt();
                    for (int i3 = 0; i3 < i2; i3++) {
                        arrayList2.add(Integer.valueOf(parcel.readInt()));
                    }
                    parcel.setDataPosition(iDataPosition + iN);
                    arrayList = arrayList2;
                }
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new yxc[i];
    }
}
