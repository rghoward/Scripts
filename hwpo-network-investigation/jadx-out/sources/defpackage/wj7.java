package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.fragment.app.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.hwpo_training_app.R;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wj7 extends ux4 {
    public static final /* synthetic */ ho5<Object>[] D = {new ne8(wj7.class, "binding", "getBinding()Lcom/hwpo_training_app/onboarding/databinding/FragmentOnboardingTutorialPagerBinding;", 0)};
    public k55 A;
    public final vg4 B = new vg4(new d());
    public final shb C;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.tutorial.OnboardingTutorialPagerFragment$initListeners$1$1", f = "OnboardingTutorialPagerFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public a(r02<? super a> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return wj7.this.new a(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            ho5<Object>[] ho5VarArr = wj7.D;
            ((yj7) wj7.this.C.getValue()).x.a();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.tutorial.OnboardingTutorialPagerFragment$initListeners$1$2", f = "OnboardingTutorialPagerFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return wj7.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            wj7 wj7Var = wj7.this;
            Context context = wj7Var.getContext();
            if (context != null) {
                if (wj7Var.A == null) {
                    xj5.e("buildConfig");
                    throw null;
                }
                yz1.a(context, "https://www.hwpotraining.com/programs");
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.tutorial.OnboardingTutorialPagerFragment$initListeners$1$3", f = "OnboardingTutorialPagerFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public c(r02<? super c> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return wj7.this.new c(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            ho5<Object>[] ho5VarArr = wj7.D;
            ((yj7) wj7.this.C.getValue()).x.d();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<wj7, gf4> {
        @Override // defpackage.oh4
        public final gf4 invoke(wj7 wj7Var) {
            wj7 wj7Var2 = wj7Var;
            wj7Var2.getClass();
            return gf4.bind(wj7Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<androidx.fragment.app.f> {
        public e() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return wj7.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<whb> {
        public final /* synthetic */ e u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.u = eVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ss5 ss5Var) {
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
    public static final class i extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? wj7.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public wj7() {
        ss5 ss5VarC = hv5.c(j26.u, new f(new e()));
        this.C = new shb(ll8.a(yj7.class), new g(ss5VarC), new i(ss5VarC), new h(ss5VarC));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0
    public final void i() {
        gf4 gf4Var = (gf4) this.B.a(this, D[0]);
        xgb.a(gf4Var.b, new a(null));
        xgb.a(gf4Var.d, new b(null));
        xgb.a(gf4Var.c, new c(null));
    }

    @Override // defpackage.hk0
    public final void j() {
        ((yj7) this.C.getValue()).x.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ee5.a(new uj7(0), view);
        final gf4 gf4Var = (gf4) this.B.a(this, D[0]);
        ViewPager2 viewPager2 = gf4Var.f;
        List listI = ws0.i(new ak7.a(2131231137, p(1, R.string.onboarding_tutorial_first_title), R.string.onboarding_tutorial_first_description), new ak7.a(2131231138, p(2, R.string.onboarding_tutorial_second_title), R.string.onboarding_tutorial_second_description), new ak7.a(2131231139, p(3, R.string.onboarding_tutorial_third_title), R.string.onboarding_tutorial_third_description));
        l childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        s66 lifecycle = getLifecycle();
        lifecycle.getClass();
        viewPager2.setAdapter(new ak7(listI, childFragmentManager, lifecycle));
        ViewPager2 viewPager3 = gf4Var.f;
        oz3.a aVar = new oz3.a(new oz3(new bhb(viewPager3), true, vgb.t));
        RecyclerView recyclerView = (RecyclerView) (!aVar.hasNext() ? null : aVar.next());
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        new com.google.android.material.tabs.c(gf4Var.e, viewPager3, new com.google.android.material.tabs.c.b() { // from class: vj7
            @Override // com.google.android.material.tabs.c.b
            public final void a(TabLayout.g gVar, int i2) {
                ho5<Object>[] ho5VarArr = wj7.D;
                gf4Var.f.c(gVar.d, true);
            }
        }).a();
    }

    public final SpannedString p(int i2, int i3) {
        int color = requireContext().getColor(R.color.colorPrimary);
        String string = getString(i3);
        string.getClass();
        String lowerCase = string.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (i2 + "."));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) lowerCase);
        return new SpannedString(spannableStringBuilder);
    }
}
