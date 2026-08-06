package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mub implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListH = null;
        String strF7 = null;
        String strF8 = null;
        long jM = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strF = sz8.f(parcel, i);
                    break;
                case 3:
                    strF2 = sz8.f(parcel, i);
                    break;
                case 4:
                    strF3 = sz8.f(parcel, i);
                    break;
                case 5:
                    strF4 = sz8.f(parcel, i);
                    break;
                case 6:
                    uri = (Uri) sz8.e(parcel, i, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = sz8.f(parcel, i);
                    break;
                case '\b':
                    jM = sz8.m(parcel, i);
                    break;
                case '\t':
                    strF6 = sz8.f(parcel, i);
                    break;
                case '\n':
                    arrayListH = sz8.h(parcel, i, Scope.CREATOR);
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    strF7 = sz8.f(parcel, i);
                    break;
                case '\f':
                    strF8 = sz8.f(parcel, i);
                    break;
                default:
                    sz8.o(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new GoogleSignInAccount(strF, strF2, strF3, strF4, uri, strF5, jM, strF6, arrayListH, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
