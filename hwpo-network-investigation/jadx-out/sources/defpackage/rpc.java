package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rpc extends gac {
    @Override // defpackage.gac
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) iac.a(parcel, Status.CREATOR);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        iac.d(parcel);
        t9a t9aVar = ((koc) this).b;
        if (status.t > 0) {
            j30.a(status, null, t9aVar);
            return true;
        }
        try {
            f1c f1cVar = f1c.b;
            int i2 = h0c.a;
            j30.a(status, awc.z(bArrCreateByteArray, f1c.c), t9aVar);
            return true;
        } catch (k2c e) {
            t9aVar.a(e);
            return true;
        }
    }
}
