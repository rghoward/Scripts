package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aoc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        ArrayList arrayListH = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                sz8.o(parcel, i);
            } else {
                arrayListH = sz8.h(parcel, i, unc.CREATOR);
            }
        }
        sz8.i(parcel, iP);
        return new ync(arrayListH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ync[i];
    }
}
