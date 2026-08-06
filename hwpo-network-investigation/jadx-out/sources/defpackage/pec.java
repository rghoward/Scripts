package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pec extends qxb {
    public final IBinder g;
    public final /* synthetic */ ik0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pec(ik0 ik0Var, int i, IBinder iBinder, Bundle bundle) {
        super(ik0Var, i, bundle);
        this.h = ik0Var;
        this.g = iBinder;
    }

    @Override // defpackage.qxb
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            a78.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            ik0 ik0Var = this.h;
            if (!ik0Var.y().equals(interfaceDescriptor)) {
                String strY = ik0Var.y();
                Log.w("GmsClient", ao2.a(new StringBuilder(strY.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strY, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceR = ik0Var.r(iBinder);
            if (iInterfaceR == null || !(ik0Var.B(2, 4, iInterfaceR) || ik0Var.B(3, 4, iInterfaceR))) {
                return false;
            }
            ik0Var.N = null;
            ik0.a aVar = ik0Var.H;
            if (aVar == null) {
                return true;
            }
            aVar.i();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.qxb
    public final void c(ax1 ax1Var) {
        ik0.b bVar = this.h.I;
        if (bVar != null) {
            bVar.a(ax1Var);
        }
        System.currentTimeMillis();
    }
}
