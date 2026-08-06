package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dxb extends p2 {
    public static final Parcelable.Creator<dxb> CREATOR = new exb();
    public final int t;
    public final IBinder u;
    public final ax1 v;
    public final boolean w;
    public final boolean x;

    public dxb(int i, IBinder iBinder, ax1 ax1Var, boolean z, boolean z2) {
        this.t = i;
        this.u = iBinder;
        this.v = ax1Var;
        this.w = z;
        this.x = z2;
    }

    public final boolean equals(Object obj) {
        Object o3dVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxb)) {
            return false;
        }
        dxb dxbVar = (dxb) obj;
        if (!this.v.equals(dxbVar.v)) {
            return false;
        }
        Object o3dVar2 = null;
        IBinder iBinder = this.u;
        if (iBinder == null) {
            o3dVar = null;
        } else {
            int i = p55.a.b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            o3dVar = iInterfaceQueryLocalInterface instanceof p55 ? (p55) iInterfaceQueryLocalInterface : new o3d(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = dxbVar.u;
        if (iBinder2 != null) {
            int i2 = p55.a.b;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            o3dVar2 = iInterfaceQueryLocalInterface2 instanceof p55 ? (p55) iInterfaceQueryLocalInterface2 : new o3d(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return te7.a(o3dVar, o3dVar2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.f(parcel, 2, this.u);
        ms3.h(parcel, 3, this.v, i);
        ms3.l(parcel, 4, 4);
        parcel.writeInt(this.w ? 1 : 0);
        ms3.l(parcel, 5, 4);
        parcel.writeInt(this.x ? 1 : 0);
        ms3.n(parcel, iM);
    }
}
