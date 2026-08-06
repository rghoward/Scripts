package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bac implements Parcelable.Creator {
    public static void a(z9c z9cVar, Parcel parcel, int i) {
        String str = z9cVar.t;
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 2, str);
        ms3.h(parcel, 3, z9cVar.u, i);
        ms3.i(parcel, 4, z9cVar.v);
        long j = z9cVar.w;
        ms3.l(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = z9cVar.x;
        ms3.l(parcel, 6, 8);
        parcel.writeLong(j2);
        ms3.n(parcel, iM);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        long jM = 0;
        long jM2 = 0;
        String strF = null;
        v9c v9cVar = null;
        String strF2 = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strF = sz8.f(parcel, i);
            } else if (c == 3) {
                v9cVar = (v9c) sz8.e(parcel, i, v9c.CREATOR);
            } else if (c == 4) {
                strF2 = sz8.f(parcel, i);
            } else if (c == 5) {
                jM = sz8.m(parcel, i);
            } else if (c != 6) {
                sz8.o(parcel, i);
            } else {
                jM2 = sz8.m(parcel, i);
            }
        }
        sz8.i(parcel, iP);
        return new z9c(strF, v9cVar, strF2, jM, jM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new z9c[i];
    }
}
