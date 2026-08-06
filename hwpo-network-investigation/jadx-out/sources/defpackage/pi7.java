package defpackage;

import android.os.Bundle;
import android.view.View;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.settings.presentation.view.AccountSettingsView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pi7 extends sx4 {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(pi7.class, "binding", "getBinding()Lcom/hwpo_training_app/client/databinding/FragmentOnboardingSettingsFirstPageBinding;", 0)};
    public static final a Companion = new a();
    public final vg4 A = new vg4(new g());
    public final shb B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide1.presentation.OnboardingSettingsFirstPageFragment$initListeners$1$1", f = "OnboardingSettingsFirstPageFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return pi7.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = pi7.Companion;
            fj7 fj7VarP = pi7.this.p();
            fj7VarP.e(mi7.e.a);
            oy0.d(rhb.b(fj7VarP), null, null, new ej7(fj7VarP, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements oh4<wj4, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(wj4 wj4Var) {
            wj4 wj4Var2 = wj4Var;
            wj4Var2.getClass();
            fj7 fj7Var = (fj7) this.receiver;
            fj7Var.getClass();
            fj7Var.e(new mi7.c(wj4Var2));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements oh4<zlb, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(zlb zlbVar) {
            zlb zlbVar2 = zlbVar;
            zlbVar2.getClass();
            fj7 fj7Var = (fj7) this.receiver;
            fj7Var.getClass();
            fj7Var.e(new mi7.h(zlbVar2));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends pi4 implements oh4<o33, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(o33 o33Var) {
            o33 o33Var2 = o33Var;
            o33Var2.getClass();
            fj7 fj7Var = (fj7) this.receiver;
            fj7Var.getClass();
            fj7Var.e(new mi7.a(o33Var2));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class f extends pi4 implements oh4<s10, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(s10 s10Var) {
            s10 s10Var2 = s10Var;
            s10Var2.getClass();
            fj7 fj7Var = (fj7) this.receiver;
            fj7Var.getClass();
            fj7Var.e(new mi7.d(s10Var2));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g implements oh4<pi7, ef4> {
        @Override // defpackage.oh4
        public final ef4 invoke(pi7 pi7Var) {
            pi7 pi7Var2 = pi7Var;
            pi7Var2.getClass();
            return ef4.bind(pi7Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements mh4<androidx.fragment.app.f> {
        public h() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return pi7.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i extends wp5 implements mh4<whb> {
        public final /* synthetic */ h u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.u = hVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ss5 ss5Var) {
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
    public static final class l extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? pi7.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public pi7() {
        ss5 ss5VarC = hv5.c(j26.u, new i(new h()));
        this.B = new shb(ll8.a(fj7.class), new j(ss5VarC), new l(ss5VarC), new k(ss5VarC));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0
    public final void i() {
        T tA = this.A.a(this, C[0]);
        tA.getClass();
        ef4 ef4Var = (ef4) tA;
        xgb.a(ef4Var.c, new b(null));
        AccountSettingsView accountSettingsView = ef4Var.b;
        accountSettingsView.setOnGenderChangeListener(new c(1, p(), fj7.class, "onGenderChanged", "onGenderChanged(Lcom/hwpo_training_app/core/presentation/entity/GenderUiEntity;)V", 0));
        accountSettingsView.setOnWeightUnitsChangeListener(new d(1, p(), fj7.class, "onWeightUnitsChanged", "onWeightUnitsChanged(Lcom/hwpo_training_app/core/presentation/entity/WeightUnitsUiEntity;)V", 0));
        accountSettingsView.setOnDistanceUnitsChangeListener(new e(1, p(), fj7.class, "onDistanceUnitsChanged", "onDistanceUnitsChanged(Lcom/hwpo_training_app/core/presentation/entity/DistanceUnitsUiEntity;)V", 0));
        accountSettingsView.setOnLanguageChangeListener(new f(1, p(), fj7.class, "onLanguageChanged", "onLanguageChanged(Lcom/hwpo_training_app/multilanguage/domain/entity/AppLanguage;)V", 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new oi7(), view2);
            g2b g2bVar = g2b.a;
        }
        fj7 fj7VarP = p();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        fj7VarP.c(viewLifecycleOwner, new ew6(1, this));
        T tA = this.A.a(this, C[0]);
        tA.getClass();
        ef4 ef4Var = (ef4) tA;
        yq6 yq6Var = p().F;
        AccountSettingsView accountSettingsView = ef4Var.b;
        yq6Var.e(getViewLifecycleOwner(), new qi7(new wi7(new si7(accountSettingsView, AccountSettingsView.class, "gender", "getGender()Lcom/hwpo_training_app/core/presentation/entity/GenderUiEntity;", 0))));
        p().G.e(getViewLifecycleOwner(), new qi7(new xi7(0, new ti7(accountSettingsView, AccountSettingsView.class, "weightUnits", "getWeightUnits()Lcom/hwpo_training_app/core/presentation/entity/WeightUnitsUiEntity;", 0))));
        p().H.e(getViewLifecycleOwner(), new qi7(new yi7(new ui7(accountSettingsView, AccountSettingsView.class, "distanceUnits", "getDistanceUnits()Lcom/hwpo_training_app/core/presentation/entity/DistanceUnitsUiEntity;", 0))));
        p().I.e(getViewLifecycleOwner(), new qi7(new zi7(new vi7(accountSettingsView, AccountSettingsView.class, "language", "getLanguage()Lcom/hwpo_training_app/multilanguage/domain/entity/AppLanguage;", 0))));
        p().J.e(getViewLifecycleOwner(), new qi7(new aj7(new ri7(ef4Var.d, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
    }

    public final fj7 p() {
        return (fj7) this.B.getValue();
    }
}
