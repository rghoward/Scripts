package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uyc extends p2 {
    public static final Parcelable.Creator<uyc> CREATOR = new i0d();
    public final String t;
    public final boolean u;
    public final boolean v;
    public final Context w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public uyc(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.t = str;
        this.u = z;
        this.v = z2;
        this.w = (Context) se7.i(y55.a.g(iBinder));
        this.x = z3;
        this.y = z4;
        this.z = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 1, this.t);
        ms3.l(parcel, 2, 4);
        parcel.writeInt(this.u ? 1 : 0);
        ms3.l(parcel, 3, 4);
        parcel.writeInt(this.v ? 1 : 0);
        ms3.f(parcel, 4, new se7(this.w));
        ms3.l(parcel, 5, 4);
        parcel.writeInt(this.x ? 1 : 0);
        ms3.l(parcel, 6, 4);
        parcel.writeInt(this.y ? 1 : 0);
        ms3.l(parcel, 8, 4);
        parcel.writeInt(this.z ? 1 : 0);
        ms3.n(parcel, iM);
    }
}
