package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ax1 extends p2 {
    public final int t;
    public final int u;
    public final PendingIntent v;
    public final String w;
    public final Integer x;
    public static final ax1 y = new ax1(0, null, null);
    public static final Parcelable.Creator<ax1> CREATOR = new pxb();

    public ax1(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.t = i;
        this.u = i2;
        this.v = pendingIntent;
        this.w = str;
        this.x = num;
    }

    public static String j(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case h4c.e /* 15 */:
                        return "INTERRUPTED";
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case InboxPagingSource.PAGE_SIZE /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ax1)) {
            return false;
        }
        ax1 ax1Var = (ax1) obj;
        return this.u == ax1Var.u && te7.a(this.v, ax1Var.v) && te7.a(this.w, ax1Var.w) && te7.a(this.x, ax1Var.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.u), this.v, this.w, this.x});
    }

    public final String toString() {
        te7.a aVar = new te7.a(this);
        aVar.a(j(this.u), "statusCode");
        aVar.a(this.v, "resolution");
        aVar.a(this.w, MetricTracker.Object.MESSAGE);
        aVar.a(this.x, "clientMethodKey");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.l(parcel, 2, 4);
        parcel.writeInt(this.u);
        ms3.h(parcel, 3, this.v, i);
        ms3.i(parcel, 4, this.w);
        Integer num = this.x;
        if (num != null) {
            ms3.l(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        ms3.n(parcel, iM);
    }

    public ax1(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
