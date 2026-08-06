package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zm8 extends p2 {
    public static final Parcelable.Creator<zm8> CREATOR = new an8();
    public final Bundle t;
    public n30 u;

    public zm8(Bundle bundle) {
        this.t = bundle;
    }

    public final HashMap j() {
        if (this.u == null) {
            n30 n30Var = new n30();
            Bundle bundle = this.t;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(TicketDetailDestinationKt.LAUNCHED_FROM) && !str.equals("message_type") && !str.equals("collapse_key")) {
                        n30Var.put(str, str2);
                    }
                }
            }
            this.u = n30Var;
        }
        return new HashMap(this.u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.c(parcel, 2, this.t);
        ms3.n(parcel, iM);
    }
}
