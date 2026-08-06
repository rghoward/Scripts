package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nbc extends gac implements obc {
    @Override // defpackage.gac
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) iac.a(parcel, Bundle.CREATOR);
        iac.d(parcel);
        ((ibc) this).D(bundle);
        parcel2.writeNoException();
        return true;
    }
}
