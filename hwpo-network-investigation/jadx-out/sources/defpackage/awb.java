package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class awb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        ArrayList<String> arrayList = null;
        String strF = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                int iN = sz8.n(parcel, i);
                int iDataPosition = parcel.dataPosition();
                if (iN == 0) {
                    arrayList = null;
                } else {
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    parcel.setDataPosition(iDataPosition + iN);
                    arrayList = arrayListCreateStringArrayList;
                }
            } else if (c != 2) {
                sz8.o(parcel, i);
            } else {
                strF = sz8.f(parcel, i);
            }
        }
        sz8.i(parcel, iP);
        return new yvb(strF, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new yvb[i];
    }
}
