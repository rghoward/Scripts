package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sgc extends gac implements ugc {
    @Override // defpackage.gac
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        byc bycVar = (byc) iac.a(parcel, byc.CREATOR);
        iac.d(parcel);
        ((etc) this).H(bycVar);
        return true;
    }
}
