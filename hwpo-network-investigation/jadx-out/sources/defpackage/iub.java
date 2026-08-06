package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iub extends kn4 {
    @Override // defpackage.ik0
    public final boolean A() {
        return true;
    }

    @Override // defpackage.ik0, zw.e
    public final int l() {
        return 253600000;
    }

    @Override // defpackage.ik0
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof fwb ? (fwb) iInterfaceQueryLocalInterface : new fwb(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
    }

    @Override // defpackage.ik0
    public final fu3[] t() {
        return ovb.c;
    }

    @Override // defpackage.ik0
    public final String y() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // defpackage.ik0
    public final String z() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }
}
