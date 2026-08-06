package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yxc extends p2 {
    public static final Parcelable.Creator<yxc> CREATOR = new ayc();
    public final List t;

    public yxc(ArrayList arrayList) {
        this.t = arrayList;
    }

    public static yxc j(asc... ascVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(ascVarArr[0].t));
        return new yxc(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        List list = this.t;
        if (list != null) {
            int iM2 = ms3.m(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            ms3.n(parcel, iM2);
        }
        ms3.n(parcel, iM);
    }
}
