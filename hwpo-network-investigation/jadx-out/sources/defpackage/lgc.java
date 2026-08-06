package defpackage;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lgc extends fac implements pgc {
    @Override // defpackage.pgc
    public final void L(List list) {
        Parcel parcelG = g();
        parcelG.writeTypedList(list);
        O(parcelG);
    }
}
