package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ux4 extends hk0 implements bk4 {
    public ggb.a v;
    public boolean w;
    public volatile ke4 x;
    public final Object y;
    public boolean z;

    public ux4() {
        super(R.layout.fragment_onboarding_tutorial_pager);
        this.w = false;
        this.y = new Object();
        this.z = false;
    }

    @Override // defpackage.ak4
    public final Object a() {
        if (this.x == null) {
            synchronized (this.y) {
                try {
                    if (this.x == null) {
                        this.x = new ke4(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.x.a();
    }

    @Override // androidx.fragment.app.f
    public final Context getContext() {
        if (super.getContext() == null && !this.w) {
            return null;
        }
        o();
        return this.v;
    }

    @Override // androidx.fragment.app.f, defpackage.wt4
    public final thb.c getDefaultViewModelProviderFactory() {
        return rv2.a(this, super.getDefaultViewModelProviderFactory());
    }

    public final void o() {
        if (this.v == null) {
            this.v = new ggb.a(super.getContext(), this);
            this.w = te4.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.f
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ggb.a aVar = this.v;
        dx0.b(aVar == null || ke4.c(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        if (this.z) {
            return;
        }
        this.z = true;
        ((xj7) a()).n((wj7) this);
    }

    @Override // androidx.fragment.app.f
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ggb.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.f
    public final void onAttach(Context context) {
        super.onAttach(context);
        o();
        if (this.z) {
            return;
        }
        this.z = true;
        ((xj7) a()).n((wj7) this);
    }
}
