package com.hwpo_training_app.core.data.service.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.bk4;
import defpackage.d5;
import defpackage.e5;
import defpackage.xj5;
import defpackage.zd9;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class AccountAuthenticatorService extends Service implements bk4 {
    public volatile zd9 t;
    public final Object u = new Object();
    public boolean v = false;
    public d5 w;

    @Override // defpackage.ak4
    public final Object a() {
        if (this.t == null) {
            synchronized (this.u) {
                try {
                    if (this.t == null) {
                        this.t = new zd9(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.t.a();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!xj5.a(intent != null ? intent.getAction() : null, "android.accounts.AccountAuthenticator")) {
            return null;
        }
        d5 d5Var = this.w;
        if (d5Var != null) {
            return d5Var.getIBinder();
        }
        xj5.e("accountAuthenticator");
        throw null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.v) {
            this.v = true;
            ((e5) a()).b(this);
        }
        super.onCreate();
    }
}
