package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f6 implements e6 {
    public static final a Companion = new a();
    public final AccountManager a;
    public s10 b;
    public final String c;
    public final Account d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public f6(AccountManager accountManager, Context context) {
        accountManager.getClass();
        this.a = accountManager;
        String packageName = context.getPackageName();
        this.c = packageName;
        this.d = new Account("HWPO", packageName);
    }

    @Override // defpackage.e6
    public final void a(s10 s10Var) {
        s10Var.getClass();
        this.b = s10Var;
        String str = this.c;
        AccountManager accountManager = this.a;
        Account[] accountsByType = accountManager.getAccountsByType(str);
        accountsByType.getClass();
        if (accountsByType.length == 0) {
            return;
        }
        accountManager.setUserData(this.d, "KEY_USER_LANG", s10Var.t);
    }

    @Override // defpackage.e6
    public final String b() throws OperationCanceledException, IOException, AuthenticatorException {
        Account[] accountsByType = this.a.getAccountsByType(this.c);
        accountsByType.getClass();
        if (accountsByType.length == 0) {
            return null;
        }
        Bundle result = this.a.getAuthToken(this.d, "auth_token_type", uy0.c(new js7[0]), false, (AccountManagerCallback<Bundle>) null, (Handler) null).getResult();
        String string = result.getString("authAccount");
        String string2 = result.getString("accountType");
        String string3 = result.getString("authtoken");
        if (xj5.a(string, string) && xj5.a(string2, string2)) {
            return string3;
        }
        return null;
    }

    @Override // defpackage.e6
    public final s10 c() {
        s10 s10Var = this.b;
        if (s10Var != null) {
            return s10Var;
        }
        String str = this.c;
        AccountManager accountManager = this.a;
        Account[] accountsByType = accountManager.getAccountsByType(str);
        accountsByType.getClass();
        s10 s10Var2 = null;
        Object obj = null;
        if (accountsByType.length == 0) {
            return null;
        }
        String userData = accountManager.getUserData(this.d, "KEY_USER_LANG");
        if (userData != null) {
            s10.Companion.getClass();
            for (Object obj2 : s10.y) {
                if (((s10) obj2).t.equals(userData)) {
                    obj = obj2;
                    break;
                }
            }
            s10Var2 = (s10) obj;
            if (s10Var2 == null) {
                return s10.ENGLISH;
            }
        }
        return s10Var2;
    }

    @Override // defpackage.e6
    public final g2b d() {
        this.a.removeAccountExplicitly(this.d);
        return g2b.a;
    }

    @Override // defpackage.e6
    public final g2b e(String str) {
        s10 s10Var = this.b;
        Bundle bundleC = uy0.c(new js7("KEY_USER_LANG", s10Var != null ? s10Var.t : null));
        AccountManager accountManager = this.a;
        Account account = this.d;
        accountManager.addAccountExplicitly(account, null, bundleC);
        accountManager.setAuthToken(account, "auth_token_type", str);
        return g2b.a;
    }
}
