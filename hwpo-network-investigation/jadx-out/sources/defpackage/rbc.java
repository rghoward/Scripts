package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rbc extends fac implements tbc {
    public rbc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.tbc
    public final int f() {
        Parcel parcelA = a(g(), 2);
        int i = parcelA.readInt();
        parcelA.recycle();
        return i;
    }

    @Override // defpackage.tbc
    public final void l(String str, String str2, Bundle bundle, long j) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        iac.b(parcelG, bundle);
        parcelG.writeLong(j);
        i(parcelG, 1);
    }
}
