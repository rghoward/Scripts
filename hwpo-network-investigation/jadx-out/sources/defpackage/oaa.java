package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oaa extends p2 {
    public static final Parcelable.Creator<oaa> CREATOR = new gub();
    public final int t;
    public List u;

    public oaa(int i, List list) {
        this.t = i;
        this.u = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.k(parcel, 2, this.u);
        ms3.n(parcel, iM);
    }
}
