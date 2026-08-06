package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bxb extends p2 {
    public static final Parcelable.Creator<bxb> CREATOR = new cxb();
    public final int t;
    public final Account u;
    public final int v;
    public final GoogleSignInAccount w;

    public bxb(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.t = i;
        this.u = account;
        this.v = i2;
        this.w = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.h(parcel, 2, this.u, i);
        ms3.l(parcel, 3, 4);
        parcel.writeInt(this.v);
        ms3.h(parcel, 4, this.w, i);
        ms3.n(parcel, iM);
    }
}
