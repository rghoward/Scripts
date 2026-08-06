package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kl4 extends p2 {
    public static final Parcelable.Creator<kl4> CREATOR = new psc();
    public static final Scope[] H = new Scope[0];
    public static final fu3[] I = new fu3[0];
    public Account A;
    public fu3[] B;
    public fu3[] C;
    public final boolean D;
    public final int E;
    public final boolean F;
    public final String G;
    public final int t;
    public final int u;
    public final int v;
    public String w;
    public IBinder x;
    public Scope[] y;
    public Bundle z;

    public kl4(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, fu3[] fu3VarArr, fu3[] fu3VarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? H : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        fu3[] fu3VarArr3 = I;
        fu3VarArr = fu3VarArr == null ? fu3VarArr3 : fu3VarArr;
        fu3VarArr2 = fu3VarArr2 == null ? fu3VarArr3 : fu3VarArr2;
        this.t = i;
        this.u = i2;
        this.v = i3;
        if ("com.google.android.gms".equals(str)) {
            this.w = "com.google.android.gms";
        } else {
            this.w = str;
        }
        if (i < 2) {
            Account accountB = null;
            if (iBinder != null) {
                int i5 = p55.a.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                p55 o3dVar = iInterfaceQueryLocalInterface instanceof p55 ? (p55) iInterfaceQueryLocalInterface : new o3d(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                int i6 = a5.c;
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        accountB = o3dVar.b();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.A = accountB;
        } else {
            this.x = iBinder;
            this.A = account;
        }
        this.y = scopeArr;
        this.z = bundle;
        this.B = fu3VarArr;
        this.C = fu3VarArr2;
        this.D = z;
        this.E = i4;
        this.F = z2;
        this.G = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        psc.a(this, parcel, i);
    }
}
