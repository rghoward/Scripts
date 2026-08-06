package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n3d extends p2 {
    public static final Parcelable.Creator<n3d> CREATOR = new m4d();
    public final String t;
    public final moc u;
    public final boolean v;
    public final boolean w;

    public n3d(String str, IBinder iBinder, boolean z, boolean z2) {
        this.t = str;
        moc mocVar = null;
        if (iBinder != null) {
            try {
                int i = lmc.c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                y55 y55VarD = (iInterfaceQueryLocalInterface instanceof p7d ? (p7d) iInterfaceQueryLocalInterface : new n5d(iBinder, "com.google.android.gms.common.internal.ICertData")).d();
                byte[] bArr = y55VarD == null ? null : (byte[]) se7.i(y55VarD);
                if (bArr != null) {
                    mocVar = new moc(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.u = mocVar;
        this.v = z;
        this.w = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 1, this.t);
        moc mocVar = this.u;
        if (mocVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            mocVar = null;
        }
        ms3.f(parcel, 2, mocVar);
        ms3.l(parcel, 3, 4);
        parcel.writeInt(this.v ? 1 : 0);
        ms3.l(parcel, 4, 4);
        parcel.writeInt(this.w ? 1 : 0);
        ms3.n(parcel, iM);
    }

    public n3d(String str, moc mocVar, boolean z, boolean z2) {
        this.t = str;
        this.u = mocVar;
        this.v = z;
        this.w = z2;
    }
}
