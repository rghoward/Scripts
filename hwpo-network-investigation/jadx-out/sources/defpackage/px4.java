package defpackage;

import android.os.Bundle;
import com.hwpo_training_app.R;
import com.hwpo_training_app.host.presentation.HostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class px4 extends tj0 implements bk4 {
    public volatile d9 u;
    public final Object v;
    public boolean w;

    public px4() {
        super(R.layout.activity_host);
        this.v = new Object();
        this.w = false;
        addOnContextAvailableListener(new ox4((HostActivity) this));
    }

    @Override // defpackage.ak4
    public final Object a() {
        return v().a();
    }

    @Override // defpackage.dq1, defpackage.wt4
    public final thb.c getDefaultViewModelProviderFactory() {
        thb.c defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        rv2.c cVarA = ((rv2.a) kl3.b(rv2.a.class, this)).a();
        vs5 vs5Var = cVarA.a;
        defaultViewModelProviderFactory.getClass();
        return new sw4(vs5Var, defaultViewModelProviderFactory, cVarA.b);
    }

    @Override // defpackage.tj0, androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d9 d9VarV = v();
        ma maVar = d9VarV.w;
        px4 px4Var = maVar.t;
        la laVar = new la(maVar.u);
        vhb viewModelStore = px4Var.getViewModelStore();
        lb2 defaultViewModelCreationExtras = px4Var.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        uhb uhbVar = new uhb(viewModelStore, laVar, defaultViewModelCreationExtras);
        sd1 sd1VarA = ll8.a(ma.b.class);
        String strE = sd1VarA.e();
        if (strE == null) {
            z90.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        t09 t09Var = ((ma.b) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE))).u;
        d9VarV.x = t09Var;
        if (t09Var.a == null) {
            lb2 defaultViewModelCreationExtras2 = d9VarV.v.getDefaultViewModelCreationExtras();
            dx0.b(t09Var.b, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            t09Var.a = defaultViewModelCreationExtras2;
        }
    }

    @Override // defpackage.uy, androidx.fragment.app.g, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        t09 t09Var = v().x;
        if (t09Var != null) {
            t09Var.a = null;
        }
    }

    public final d9 v() {
        if (this.u == null) {
            synchronized (this.v) {
                try {
                    if (this.u == null) {
                        this.u = new d9(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.u;
    }
}
