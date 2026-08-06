package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s2d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        long jM = 0;
        long jM2 = 0;
        long jM3 = 0;
        long jM4 = 0;
        long jM5 = 0;
        long jM6 = 0;
        long jM7 = 0;
        long jM8 = 0;
        boolean zJ = false;
        int iL = 0;
        boolean zJ2 = false;
        boolean zJ3 = false;
        int iL2 = 0;
        int iL3 = 0;
        String strF = BuildConfig.FLAVOR;
        String strF2 = strF;
        String strF3 = strF2;
        String strF4 = strF3;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        Boolean boolValueOf = null;
        ArrayList<String> arrayList = null;
        String strF11 = null;
        String strF12 = null;
        int iL4 = 100;
        boolean zJ4 = true;
        boolean zJ5 = true;
        long jM9 = -2147483648L;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strF5 = sz8.f(parcel, i);
                    break;
                case 3:
                    strF6 = sz8.f(parcel, i);
                    break;
                case 4:
                    strF7 = sz8.f(parcel, i);
                    break;
                case 5:
                    strF8 = sz8.f(parcel, i);
                    break;
                case 6:
                    jM = sz8.m(parcel, i);
                    break;
                case 7:
                    jM2 = sz8.m(parcel, i);
                    break;
                case '\b':
                    strF9 = sz8.f(parcel, i);
                    break;
                case '\t':
                    zJ4 = sz8.j(parcel, i);
                    break;
                case '\n':
                    zJ = sz8.j(parcel, i);
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    jM9 = sz8.m(parcel, i);
                    break;
                case '\f':
                    strF10 = sz8.f(parcel, i);
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 17:
                case 19:
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                case 24:
                case '!':
                default:
                    sz8.o(parcel, i);
                    break;
                case 14:
                    jM3 = sz8.m(parcel, i);
                    break;
                case h4c.e /* 15 */:
                    iL = sz8.l(parcel, i);
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    zJ5 = sz8.j(parcel, i);
                    break;
                case 18:
                    zJ2 = sz8.j(parcel, i);
                    break;
                case 21:
                    int iN = sz8.n(parcel, i);
                    if (iN != 0) {
                        sz8.r(parcel, iN, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 22:
                    jM4 = sz8.m(parcel, i);
                    break;
                case 23:
                    int iN2 = sz8.n(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iN2 != 0) {
                        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                        parcel.setDataPosition(iDataPosition + iN2);
                        arrayList = arrayListCreateStringArrayList;
                    } else {
                        arrayList = null;
                    }
                    break;
                case 25:
                    strF = sz8.f(parcel, i);
                    break;
                case 26:
                    strF2 = sz8.f(parcel, i);
                    break;
                case 27:
                    strF11 = sz8.f(parcel, i);
                    break;
                case 28:
                    zJ3 = sz8.j(parcel, i);
                    break;
                case 29:
                    jM5 = sz8.m(parcel, i);
                    break;
                case 30:
                    iL4 = sz8.l(parcel, i);
                    break;
                case 31:
                    strF3 = sz8.f(parcel, i);
                    break;
                case ' ':
                    iL2 = sz8.l(parcel, i);
                    break;
                case '\"':
                    jM6 = sz8.m(parcel, i);
                    break;
                case '#':
                    strF12 = sz8.f(parcel, i);
                    break;
                case '$':
                    strF4 = sz8.f(parcel, i);
                    break;
                case '%':
                    jM7 = sz8.m(parcel, i);
                    break;
                case '&':
                    iL3 = sz8.l(parcel, i);
                    break;
                case '\'':
                    jM8 = sz8.m(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new q1d(strF5, strF6, strF7, strF8, jM, jM2, strF9, zJ4, zJ, jM9, strF10, jM3, iL, zJ5, zJ2, boolValueOf, jM4, arrayList, strF, strF2, strF11, zJ3, jM5, iL4, strF3, iL2, jM6, strF12, strF4, jM7, iL3, jM8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new q1d[i];
    }
}
