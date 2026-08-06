package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s9d extends h9c {
    @Override // defpackage.h9c
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) xac.a(parcel, Bundle.CREATOR);
            xac.c(parcel);
            acc accVar = (acc) this;
            a78.h(accVar.b, "onPostInitComplete can be called only once per call to getRemoteService");
            ik0 ik0Var = accVar.b;
            int i3 = accVar.c;
            ik0Var.getClass();
            pec pecVar = new pec(ik0Var, i2, strongBinder, bundle);
            e9c e9cVar = ik0Var.y;
            e9cVar.sendMessage(e9cVar.obtainMessage(1, i3, -1, pecVar));
            accVar.b = null;
        } else if (i == 2) {
            parcel.readInt();
            xac.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            mmc mmcVar = (mmc) xac.a(parcel, mmc.CREATOR);
            xac.c(parcel);
            acc accVar2 = (acc) this;
            ik0 ik0Var2 = accVar2.b;
            a78.h(ik0Var2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            a78.g(mmcVar);
            ik0Var2.P = mmcVar;
            Bundle bundle2 = mmcVar.t;
            a78.h(accVar2.b, "onPostInitComplete can be called only once per call to getRemoteService");
            ik0 ik0Var3 = accVar2.b;
            int i5 = accVar2.c;
            ik0Var3.getClass();
            pec pecVar2 = new pec(ik0Var3, i4, strongBinder2, bundle2);
            e9c e9cVar2 = ik0Var3.y;
            e9cVar2.sendMessage(e9cVar2.obtainMessage(1, i5, -1, pecVar2));
            accVar2.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
