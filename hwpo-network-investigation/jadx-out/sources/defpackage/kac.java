package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kac extends fac implements nac {
    @Override // defpackage.nac
    public final Bundle y(Bundle bundle) {
        Parcel parcelG = g();
        iac.b(parcelG, bundle);
        Parcel parcelA = a(parcelG, 1);
        Bundle bundle2 = (Bundle) iac.a(parcelA, Bundle.CREATOR);
        parcelA.recycle();
        return bundle2;
    }
}
