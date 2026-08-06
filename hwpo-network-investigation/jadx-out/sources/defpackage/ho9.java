package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ho9 extends kn4<vvb> implements svb {
    public final boolean U;
    public final nf1 V;
    public final Bundle W;
    public final Integer X;

    public ho9(Context context, Looper looper, nf1 nf1Var, Bundle bundle, yn4.a aVar, yn4.b bVar) {
        super(context, looper, 44, nf1Var, aVar, bVar);
        this.U = true;
        this.V = nf1Var;
        this.W = bundle;
        this.X = nf1Var.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.svb
    public final void a(lvb lvbVar) {
        GoogleSignInAccount googleSignInAccountK;
        try {
            Account account = this.V.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = this.v;
                ReentrantLock reentrantLock = f1a.c;
                a78.g(context);
                ReentrantLock reentrantLock2 = f1a.c;
                reentrantLock2.lock();
                try {
                    if (f1a.d == null) {
                        f1a.d = new f1a(context.getApplicationContext());
                    }
                    f1a f1aVar = f1a.d;
                    reentrantLock2.unlock();
                    String strA = f1aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(strA).length());
                        sb.append("googleSignInAccount:");
                        sb.append(strA);
                        String strA2 = f1aVar.a(sb.toString());
                        if (strA2 != null) {
                            try {
                                googleSignInAccountK = GoogleSignInAccount.k(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountK = null;
                            }
                        }
                    }
                    googleSignInAccountK = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountK = null;
            }
            Integer num = this.X;
            a78.g(num);
            bxb bxbVar = new bxb(2, account, num.intValue(), googleSignInAccountK);
            vvb vvbVar = (vvb) x();
            dwb dwbVar = new dwb(1, bxbVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(vvbVar.c);
            int i = avb.a;
            parcelObtain.writeInt(1);
            dwbVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(lvbVar);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                vvbVar.b.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                lvbVar.c.post(new kvb(lvbVar, new kwb(1, new ax1(8, null, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.svb
    public final void k() {
        g(new ik0.d(this));
    }

    @Override // defpackage.ik0, zw.e
    public final int l() {
        return 12451000;
    }

    @Override // defpackage.ik0, zw.e
    public final boolean o() {
        return this.U;
    }

    @Override // defpackage.ik0
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof vvb ? (vvb) iInterfaceQueryLocalInterface : new vvb(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // defpackage.ik0
    public final Bundle v() {
        nf1 nf1Var = this.V;
        boolean zEquals = this.v.getPackageName().equals(nf1Var.e);
        Bundle bundle = this.W;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", nf1Var.e);
        }
        return bundle;
    }

    @Override // defpackage.ik0
    public final String y() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.ik0
    public final String z() {
        return "com.google.android.gms.signin.service.START";
    }
}
