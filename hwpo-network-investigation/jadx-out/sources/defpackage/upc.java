package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import io.ably.lib.util.Crypto;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class upc extends gac {
    @Override // defpackage.gac
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) iac.a(parcel, Status.CREATOR);
                iac.d(parcel);
                j30.a(status, null, ((ipc) this).b);
                return true;
            case 2:
                Status status2 = (Status) iac.a(parcel, Status.CREATOR);
                iac.d(parcel);
                j30.a(status2, null, ((ipc) this).b);
                return true;
            case 3:
                Status status3 = (Status) iac.a(parcel, Status.CREATOR);
                iac.d(parcel);
                j30.a(status3, null, ((ipc) this).b);
                return true;
            case 4:
                Status status4 = (Status) iac.a(parcel, Status.CREATOR);
                gnc gncVar = (gnc) iac.a(parcel, gnc.CREATOR);
                iac.d(parcel);
                j30.a(status4, gncVar, ((ipc) this).b);
                return true;
            case 5:
                Status status5 = (Status) iac.a(parcel, Status.CREATOR);
                iac.d(parcel);
                j30.a(status5, null, ((ipc) this).b);
                return true;
            case 6:
                Status status6 = (Status) iac.a(parcel, Status.CREATOR);
                onc oncVar = (onc) iac.a(parcel, onc.CREATOR);
                iac.d(parcel);
                j30.a(status6, oncVar, ((ipc) this).b);
                return true;
            case 7:
                Status status7 = (Status) iac.a(parcel, Status.CREATOR);
                knc kncVar = (knc) iac.a(parcel, knc.CREATOR);
                iac.d(parcel);
                j30.a(status7, kncVar, ((ipc) this).b);
                return true;
            case 8:
                Status status8 = (Status) iac.a(parcel, Status.CREATOR);
                iac.d(parcel);
                j30.a(status8, null, ((ipc) this).b);
                return true;
            case 9:
                Status status9 = (Status) iac.a(parcel, Status.CREATOR);
                rnc rncVar = (rnc) iac.a(parcel, rnc.CREATOR);
                iac.d(parcel);
                j30.a(status9, rncVar, ((ipc) this).b);
                return true;
            case 10:
                Status status10 = (Status) iac.a(parcel, Status.CREATOR);
                gnc gncVar2 = (gnc) iac.a(parcel, gnc.CREATOR);
                iac.d(parcel);
                j30.a(status10, gncVar2, ((ipc) this).b);
                return true;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Status status11 = (Status) iac.a(parcel, Status.CREATOR);
                parcel.readLong();
                iac.d(parcel);
                j30.a(status11, null, ((ipc) this).b);
                return true;
            case 12:
                Status status12 = (Status) iac.a(parcel, Status.CREATOR);
                iac.d(parcel);
                j30.a(status12, null, ((ipc) this).b);
                return true;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Status status13 = (Status) iac.a(parcel, Status.CREATOR);
                ync yncVar = (ync) iac.a(parcel, ync.CREATOR);
                iac.d(parcel);
                j30.a(status13, yncVar, ((ipc) this).b);
                return true;
            case 14:
                Status status14 = (Status) iac.a(parcel, Status.CREATOR);
                iac.d(parcel);
                j30.a(status14, null, ((ipc) this).b);
                return true;
            case h4c.e /* 15 */:
                Status status15 = (Status) iac.a(parcel, Status.CREATOR);
                iac.d(parcel);
                j30.a(status15, null, ((ipc) this).b);
                return true;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                Status status16 = (Status) iac.a(parcel, Status.CREATOR);
                long j = parcel.readLong();
                iac.d(parcel);
                j30.a(status16, Long.valueOf(j), ((ipc) this).b);
                return true;
            default:
                return false;
        }
    }
}
