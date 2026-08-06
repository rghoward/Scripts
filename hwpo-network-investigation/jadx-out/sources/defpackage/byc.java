package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class byc extends p2 {
    public static final Parcelable.Creator<byc> CREATOR = new dyc();
    public final List t;

    public byc(ArrayList arrayList) {
        this.t = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.k(parcel, 1, this.t);
        ms3.n(parcel, iM);
    }
}
