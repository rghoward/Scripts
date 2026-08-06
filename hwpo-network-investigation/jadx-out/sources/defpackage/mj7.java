package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mj7 extends tx4 {
    public final vg4 A = new vg4(new j());
    public final shb B;
    public final o7a C;
    public static final /* synthetic */ ho5<Object>[] D = {new ne8(mj7.class, "binding", "getBinding()Lcom/hwpo_training_app/client/databinding/FragmentOnboardingSettingsSecondPageBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<pr8, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(pr8 pr8Var) {
            pr8 pr8Var2 = pr8Var;
            pr8Var2.getClass();
            rj7 rj7Var = (rj7) this.receiver;
            rj7Var.getClass();
            rj7Var.f(new jj7.c(pr8Var2.b.t));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide2.presentation.OnboardingSettingsSecondPageFragment$initListeners$1$2", f = "OnboardingSettingsSecondPageFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public c(r02<? super c> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return mj7.this.new c(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = mj7.Companion;
            rj7 rj7VarQ = mj7.this.q();
            oy0.d(rhb.b(rj7VarQ), null, null, new sj7(rj7VarQ, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide2.presentation.OnboardingSettingsSecondPageFragment$initListeners$1$3", f = "OnboardingSettingsSecondPageFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public d(r02<? super d> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return mj7.this.new d(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = mj7.Companion;
            mj7.this.q().y.a();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return Boolean.valueOf(((SimpleProgressBar) this.receiver).t);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class f extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return Boolean.valueOf(((View) this.receiver).getVisibility() == 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g implements oh4<Boolean, g2b> {
        public final /* synthetic */ e t;

        public g(e eVar) {
            this.t = eVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.getClass();
            ((SimpleProgressBar) this.t.receiver).setVisible(bool2.booleanValue());
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h implements oh4<Boolean, g2b> {
        public final /* synthetic */ f t;

        public h(f fVar) {
            this.t = fVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.getClass();
            ((View) this.t.receiver).setVisibility(bool2.booleanValue() ? 0 : 8);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i implements oh4<List<? extends pr8>, g2b> {
        public final /* synthetic */ qr8 t;

        public i(qr8 qr8Var) {
            this.t = qr8Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(List<? extends pr8> list) {
            this.t.u(list);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j implements oh4<mj7, ff4> {
        @Override // defpackage.oh4
        public final ff4 invoke(mj7 mj7Var) {
            mj7 mj7Var2 = mj7Var;
            mj7Var2.getClass();
            return ff4.bind(mj7Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k extends wp5 implements mh4<androidx.fragment.app.f> {
        public k() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return mj7.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l extends wp5 implements mh4<whb> {
        public final /* synthetic */ k u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.u = kVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final lb2 invoke() {
            whb whbVar = (whb) this.u.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return wt4Var != null ? wt4Var.getDefaultViewModelCreationExtras() : lb2.a.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? mj7.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public mj7() {
        ss5 ss5VarC = hv5.c(j26.u, new l(new k()));
        this.B = new shb(ll8.a(rj7.class), new m(ss5VarC), new o(ss5VarC), new n(ss5VarC));
        this.C = new o7a(new tx5(1, this));
    }

    @Override // defpackage.hk0
    public final void i() {
        ff4 ff4VarP = p();
        ff4VarP.g.getMenu().findItem(R.id.mi_skip).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: kj7
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                mj7.a aVar = mj7.Companion;
                menuItem.getClass();
                rj7 rj7VarQ = this.a.q();
                oy0.d(rhb.b(rj7VarQ), null, null, new sj7(rj7VarQ, null), 3);
                return true;
            }
        });
        xgb.a(ff4VarP.d, new c(null));
        xgb.a(ff4VarP.c, new d(null));
    }

    @Override // defpackage.hk0
    public final void j() {
        q().y.a();
    }

    @Override // androidx.fragment.app.f
    public final void onDestroyView() {
        p().b.setAdapter(null);
        super.onDestroyView();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = p().b;
        Drawable drawable = requireContext().getDrawable(R.drawable.common_divider);
        if (drawable == null) {
            z90.a("Required value was null.");
            return;
        }
        int iB = wk6.b(getResources().getDimension(R.dimen.default_margin));
        recyclerView.setItemAnimator(null);
        recyclerView.h(new feb(drawable, iB, iB));
        o7a o7aVar = this.C;
        recyclerView.setAdapter((qr8) o7aVar.getValue());
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new gi4() { // from class: lj7
                @Override // defpackage.gi4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj2).intValue();
                    int iIntValue2 = ((Integer) obj3).intValue();
                    View view3 = (View) obj4;
                    ec5 ec5Var = (ec5) obj5;
                    mj7.a aVar = mj7.Companion;
                    view3.getClass();
                    view3.setPadding(view3.getPaddingLeft(), ec5Var.b + iIntValue2, view3.getPaddingRight(), ec5Var.d + iIntValue);
                    NestedScrollView nestedScrollView = this.t.p().e;
                    nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), nestedScrollView.getPaddingTop(), nestedScrollView.getPaddingRight(), iIntValue);
                    return g2b.a;
                }
            }, view2);
        }
        rj7 rj7VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        rj7VarQ.c(viewLifecycleOwner, new ye6(1, this));
        getChildFragmentManager().f0("RESULT_REQUIRED_BENCHMARK_DIALOG", getViewLifecycleOwner(), new hd5(this));
        ff4 ff4VarP = p();
        q().E.e(getViewLifecycleOwner(), new nj7(new g(new e(ff4VarP.f, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        q().D.e(getViewLifecycleOwner(), new nj7(new h(new f(ff4VarP.e, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        q().C.e(getViewLifecycleOwner(), new nj7(new i((qr8) o7aVar.getValue())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ff4 p() {
        T tA = this.A.a(this, D[0]);
        tA.getClass();
        return (ff4) tA;
    }

    public final rj7 q() {
        return (rj7) this.B.getValue();
    }
}
