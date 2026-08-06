package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yvb extends p2 implements bv8 {
    public static final Parcelable.Creator<yvb> CREATOR = new awb();
    public final List t;
    public final String u;

    public yvb(String str, ArrayList arrayList) {
        this.t = arrayList;
        this.u = str;
    }

    @Override // defpackage.bv8
    public final Status f() {
        return this.u != null ? Status.x : Status.z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        List<String> list = this.t;
        if (list != null) {
            int iM2 = ms3.m(parcel, 1);
            parcel.writeStringList(list);
            ms3.n(parcel, iM2);
        }
        ms3.i(parcel, 2, this.u);
        ms3.n(parcel, iM);
    }
}
