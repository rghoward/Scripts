package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class noc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        Bundle bundleA = null;
        ex1 ex1Var = null;
        int iL = 0;
        fu3[] fu3VarArr = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                bundleA = sz8.a(parcel, i);
            } else if (c == 2) {
                fu3VarArr = (fu3[]) sz8.g(parcel, i, fu3.CREATOR);
            } else if (c == 3) {
                iL = sz8.l(parcel, i);
            } else if (c != 4) {
                sz8.o(parcel, i);
            } else {
                ex1Var = (ex1) sz8.e(parcel, i, ex1.CREATOR);
            }
        }
        sz8.i(parcel, iP);
        mmc mmcVar = new mmc();
        mmcVar.t = bundleA;
        mmcVar.u = fu3VarArr;
        mmcVar.v = iL;
        mmcVar.w = ex1Var;
        return mmcVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new mmc[i];
    }
}
