package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sbc extends gac implements tbc {
    @Override // defpackage.gac
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(((cec) this).b);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) iac.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        iac.d(parcel);
        ((cec) this).l(string, string2, bundle, j);
        parcel2.writeNoException();
        return true;
    }
}
