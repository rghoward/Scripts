package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cxb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        Account account = null;
        int iL = 0;
        int iL2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iL = sz8.l(parcel, i);
            } else if (c == 2) {
                account = (Account) sz8.e(parcel, i, Account.CREATOR);
            } else if (c == 3) {
                iL2 = sz8.l(parcel, i);
            } else if (c != 4) {
                sz8.o(parcel, i);
            } else {
                googleSignInAccount = (GoogleSignInAccount) sz8.e(parcel, i, GoogleSignInAccount.CREATOR);
            }
        }
        sz8.i(parcel, iP);
        return new bxb(iL, account, iL2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bxb[i];
    }
}
