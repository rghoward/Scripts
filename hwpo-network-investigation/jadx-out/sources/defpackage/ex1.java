package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ex1 extends p2 {
    public static final Parcelable.Creator<ex1> CREATOR = new kqc();
    public final rx8 t;
    public final boolean u;
    public final boolean v;
    public final int[] w;
    public final int x;
    public final int[] y;

    public ex1(rx8 rx8Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.t = rx8Var;
        this.u = z;
        this.v = z2;
        this.w = iArr;
        this.x = i;
        this.y = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.h(parcel, 1, this.t, i);
        ms3.l(parcel, 2, 4);
        parcel.writeInt(this.u ? 1 : 0);
        ms3.l(parcel, 3, 4);
        parcel.writeInt(this.v ? 1 : 0);
        ms3.g(parcel, 4, this.w);
        ms3.l(parcel, 5, 4);
        parcel.writeInt(this.x);
        ms3.g(parcel, 6, this.y);
        ms3.n(parcel, iM);
    }
}
