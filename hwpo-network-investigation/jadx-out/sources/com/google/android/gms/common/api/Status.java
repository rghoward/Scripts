package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ax1;
import defpackage.bv8;
import defpackage.d43;
import defpackage.h4c;
import defpackage.jdc;
import defpackage.ms3;
import defpackage.p2;
import defpackage.te7;
import defpackage.z97;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends p2 implements bv8, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status x;
    public static final Status y;
    public static final Status z;
    public final int t;
    public final String u;
    public final PendingIntent v;
    public final ax1 w;

    static {
        new Status(-1, null, null, null);
        x = new Status(0, null, null, null);
        new Status(14, null, null, null);
        new Status(8, null, null, null);
        y = new Status(15, null, null, null);
        z = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new jdc();
    }

    public Status(int i, String str, PendingIntent pendingIntent, ax1 ax1Var) {
        this.t = i;
        this.u = str;
        this.v = pendingIntent;
        this.w = ax1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.t == status.t && te7.a(this.u, status.u) && te7.a(this.v, status.v) && te7.a(this.w, status.w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.t), this.u, this.v, this.w});
    }

    public final String toString() {
        te7.a aVar = new te7.a(this);
        String strA = this.u;
        if (strA == null) {
            int i = this.t;
            switch (i) {
                case -1:
                    strA = "SUCCESS_CACHE";
                    break;
                case 0:
                    strA = "SUCCESS";
                    break;
                case 1:
                case 9:
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case 12:
                default:
                    strA = d43.a(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
                    break;
                case 2:
                    strA = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strA = "SERVICE_DISABLED";
                    break;
                case 4:
                    strA = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strA = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strA = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strA = "NETWORK_ERROR";
                    break;
                case 8:
                    strA = "INTERNAL_ERROR";
                    break;
                case 10:
                    strA = "DEVELOPER_ERROR";
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    strA = "ERROR";
                    break;
                case 14:
                    strA = "INTERRUPTED";
                    break;
                case h4c.e /* 15 */:
                    strA = "TIMEOUT";
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    strA = "CANCELED";
                    break;
                case 17:
                    strA = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strA = "DEAD_CLIENT";
                    break;
                case 19:
                    strA = "REMOTE_EXCEPTION";
                    break;
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    strA = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strA = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strA = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        aVar.a(strA, "statusCode");
        aVar.a(this.v, "resolution");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.i(parcel, 2, this.u);
        ms3.h(parcel, 3, this.v, i);
        ms3.h(parcel, 4, this.w, i);
        ms3.n(parcel, iM);
    }

    @Override // defpackage.bv8
    public final Status f() {
        return this;
    }
}
