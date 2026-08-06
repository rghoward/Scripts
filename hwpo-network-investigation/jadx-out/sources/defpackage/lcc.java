package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lcc extends p2 {
    public static final Parcelable.Creator<lcc> CREATOR = new mcc();
    public final int t;
    public final String u;
    public final Intent v;

    public lcc(int i, String str, Intent intent) {
        this.t = i;
        this.u = str;
        this.v = intent;
    }

    public static lcc j(Activity activity) {
        return new lcc(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcc)) {
            return false;
        }
        lcc lccVar = (lcc) obj;
        return this.t == lccVar.t && Objects.equals(this.u, lccVar.u) && Objects.equals(this.v, lccVar.v);
    }

    public final int hashCode() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.i(parcel, 2, this.u);
        ms3.h(parcel, 3, this.v, i);
        ms3.n(parcel, iM);
    }
}
