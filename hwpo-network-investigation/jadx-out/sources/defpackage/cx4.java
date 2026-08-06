package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cx4 extends zj0 implements bk4 {
    public ggb.a K;
    public volatile ke4 M;
    public boolean L = false;
    public final Object N = new Object();
    public boolean O = false;

    @Override // defpackage.ak4
    public final Object a() {
        if (this.M == null) {
            synchronized (this.N) {
                try {
                    if (this.M == null) {
                        this.M = new ke4(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.M.a();
    }

    @Override // androidx.fragment.app.f
    public final Context getContext() {
        if (super.getContext() == null && !this.L) {
            return null;
        }
        u();
        return this.K;
    }

    @Override // androidx.fragment.app.f, defpackage.wt4
    public final thb.c getDefaultViewModelProviderFactory() {
        return rv2.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.f
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ggb.a aVar = this.K;
        dx0.b(aVar == null || ke4.c(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        u();
        if (this.O) {
            return;
        }
        this.O = true;
        v81 v81Var = (v81) a();
        v81Var.getClass();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ggb.a(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void u() {
        if (this.K == null) {
            this.K = new ggb.a(super.getContext(), this);
            this.L = te4.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public final void onAttach(Context context) {
        super.onAttach(context);
        u();
        if (this.O) {
            return;
        }
        this.O = true;
        v81 v81Var = (v81) a();
        v81Var.getClass();
    }
}
