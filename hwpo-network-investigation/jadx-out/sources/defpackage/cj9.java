package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.l;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cj9 extends hy4 implements yi9, iy8 {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(cj9.class, "binding", "getBinding()Lcom/hwpo_training_app/sessions/databinding/FragmentSessionsSwipeContainerBinding;", 0)};
    public static final a Companion = new a();
    public final vg4 A = new vg4(new b());
    public final shb B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<cj9, vf4> {
        @Override // defpackage.oh4
        public final vf4 invoke(cj9 cj9Var) {
            cj9 cj9Var2 = cj9Var;
            cj9Var2.getClass();
            return vf4.bind(cj9Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements mh4<androidx.fragment.app.f> {
        public c() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return cj9.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<whb> {
        public final /* synthetic */ c u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.u = cVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ss5 ss5Var) {
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
    public static final class g extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? cj9.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public cj9() {
        ss5 ss5VarC = hv5.c(j26.u, new d(new c()));
        this.B = new shb(ll8.a(ij9.class), new e(ss5VarC), new g(ss5VarC), new f(ss5VarC));
    }

    @Override // defpackage.yi9
    public final void b(tf0 tf0Var, xi9 xi9Var) {
        xi9Var.getClass();
        p().c.post(new ge3(this, tf0Var, xi9Var, 1));
    }

    @Override // defpackage.yi9
    public final void d() {
        ViewPager2 viewPager2 = p().c;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1);
    }

    @Override // defpackage.iy8
    public final hy8 e() {
        whb parentFragment = getParentFragment();
        iy8 iy8Var = parentFragment instanceof iy8 ? (iy8) parentFragment : null;
        if (iy8Var != null) {
            return iy8Var.e();
        }
        z90.a("Required value was null.");
        return null;
    }

    @Override // defpackage.yi9
    public final void f() {
        ViewPager2 viewPager2 = p().c;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
    }

    @Override // defpackage.hk0
    public final void j() {
        ij9 ij9VarQ = q();
        hy8 hy8Var = ij9VarQ.A;
        if (hy8Var == null) {
            hy8Var = ij9VarQ.x;
        }
        hy8Var.b();
    }

    @Override // androidx.fragment.app.f
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        ij9 ij9VarQ = q();
        q09 q09Var = ij9VarQ.z;
        sh9.a aVarA = th9.a(ij9VarQ.b().a.t, ij9VarQ.b().a.u.intValue());
        if (aVarA == null) {
            return;
        }
        q09Var.b(Long.valueOf(yk2.y(aVarA.a.a())), "com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_PROGRAM_DATE");
        q09Var.b(aVarA.c, "com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_SUBTITLE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        q().A = e();
        ee5.a(new gi4() { // from class: bj9
            @Override // defpackage.gi4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                ((Integer) obj2).getClass();
                int iIntValue = ((Integer) obj3).intValue();
                cj9.a aVar = cj9.Companion;
                ((View) obj4).getClass();
                MaterialToolbar materialToolbar = this.t.p().b;
                materialToolbar.setPadding(materialToolbar.getPaddingLeft(), iIntValue, materialToolbar.getPaddingRight(), materialToolbar.getPaddingBottom());
                return g2b.a;
            }
        }, view);
        q().B.e(getViewLifecycleOwner(), new ej9(new fj9(this)));
        ViewPager2 viewPager2 = p().c;
        if (viewPager2.getAdapter() == null) {
            viewPager2.setOffscreenPageLimit(2);
            js7 js7Var = (js7) q().B.d();
            sh9 sh9Var = js7Var != null ? (sh9) js7Var.t : null;
            if (sh9Var == null) {
                z90.a("Required value was null.");
                return;
            }
            l childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            s66 lifecycle = getLifecycle();
            lifecycle.getClass();
            aj9 aj9Var = new aj9(childFragmentManager, lifecycle);
            aj9Var.m = sh9Var;
            viewPager2.setAdapter(aj9Var);
            viewPager2.v.a.add(new dj9(this, viewPager2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vf4 p() {
        return (vf4) this.A.a(this, C[0]);
    }

    public final ij9 q() {
        return (ij9) this.B.getValue();
    }
}
