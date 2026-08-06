package defpackage;

import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ngc extends gac implements pgc {
    @Override // defpackage.gac
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(kxc.CREATOR);
        iac.d(parcel);
        ((ctc) this).L(arrayListCreateTypedArrayList);
        return true;
    }
}
