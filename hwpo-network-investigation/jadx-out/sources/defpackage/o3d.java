package defpackage;

import android.accounts.Account;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o3d extends vxb implements p55 {
    @Override // defpackage.p55
    public final Account b() {
        Parcel parcelA = a(g(), 2);
        Account account = (Account) xac.a(parcelA, Account.CREATOR);
        parcelA.recycle();
        return account;
    }
}
