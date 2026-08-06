package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rx8 extends p2 {
    public static final Parcelable.Creator<rx8> CREATOR = new f4c();
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final int x;

    public rx8(int i, int i2, int i3, boolean z, boolean z2) {
        this.t = i;
        this.u = z;
        this.v = z2;
        this.w = i2;
        this.x = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.l(parcel, 2, 4);
        parcel.writeInt(this.u ? 1 : 0);
        ms3.l(parcel, 3, 4);
        parcel.writeInt(this.v ? 1 : 0);
        ms3.l(parcel, 4, 4);
        parcel.writeInt(this.w);
        ms3.l(parcel, 5, 4);
        parcel.writeInt(this.x);
        ms3.n(parcel, iM);
    }
}
