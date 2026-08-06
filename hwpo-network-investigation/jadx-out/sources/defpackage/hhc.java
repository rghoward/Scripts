package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hhc extends ik0 {
    @Override // defpackage.ik0, zw.e
    public final int l() {
        return 12451000;
    }

    @Override // defpackage.ik0
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof jgc ? (jgc) iInterfaceQueryLocalInterface : new xfc(iBinder);
    }

    @Override // defpackage.ik0
    public final String y() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.ik0
    public final String z() {
        return "com.google.android.gms.measurement.START";
    }
}
