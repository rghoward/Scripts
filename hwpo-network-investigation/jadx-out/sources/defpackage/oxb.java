package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oxb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                sz8.o(parcel, i);
            } else {
                intent = (Intent) sz8.e(parcel, i, Intent.CREATOR);
            }
        }
        sz8.i(parcel, iP);
        return new jg1(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new jg1[i];
    }
}
