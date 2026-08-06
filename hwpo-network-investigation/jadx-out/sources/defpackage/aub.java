package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aub extends p2 implements bv8 {
    public static final Parcelable.Creator<aub> CREATOR = new lub();
    public final int t;
    public final int u;
    public final Intent v;

    public aub(int i, int i2, Intent intent) {
        this.t = i;
        this.u = i2;
        this.v = intent;
    }

    @Override // defpackage.bv8
    public final Status f() {
        return this.u == 0 ? Status.x : Status.z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.l(parcel, 2, 4);
        parcel.writeInt(this.u);
        ms3.h(parcel, 3, this.v, i);
        ms3.n(parcel, iM);
    }

    public aub() {
        this(2, 0, null);
    }
}
