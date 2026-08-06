package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.settings.presentation.view.AccountSettingsView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class q6 extends ww4 {
    public final vg4 P = new vg4(new m());
    public final shb Q;
    public final boolean R;
    public static final /* synthetic */ ho5<Object>[] S = {new ne8(q6.class, "binding", "getBinding()Lcom/hwpo_training_app/profile/databinding/DialogAccountSettingsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return Boolean.valueOf(((SimpleProgressBar) this.receiver).t);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return ((AccountSettingsView) this.receiver).getGender();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return ((AccountSettingsView) this.receiver).getWeightUnits();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return ((AccountSettingsView) this.receiver).getDistanceUnits();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class f extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return ((AccountSettingsView) this.receiver).getLanguage();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g implements oh4<wj4, g2b> {
        public final /* synthetic */ c t;

        public g(c cVar) {
            this.t = cVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(wj4 wj4Var) {
            ((AccountSettingsView) this.t.receiver).setGender(wj4Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h implements oh4<zlb, g2b> {
        public final /* synthetic */ d t;

        public h(d dVar) {
            this.t = dVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(zlb zlbVar) {
            ((AccountSettingsView) this.t.receiver).setWeightUnits(zlbVar);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i implements oh4<o33, g2b> {
        public final /* synthetic */ e t;

        public i(e eVar) {
            this.t = eVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(o33 o33Var) {
            ((AccountSettingsView) this.t.receiver).setDistanceUnits(o33Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j implements oh4<s10, g2b> {
        public final /* synthetic */ f t;

        public j(f fVar) {
            this.t = fVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(s10 s10Var) {
            ((AccountSettingsView) this.t.receiver).setLanguage(s10Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k implements oh4<Boolean, g2b> {
        public final /* synthetic */ MaterialButton t;

        public k(MaterialButton materialButton) {
            this.t = materialButton;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            this.t.setEnabled(bool.booleanValue());
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l implements oh4<Boolean, g2b> {
        public final /* synthetic */ b t;

        public l(b bVar) {
            this.t = bVar;
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
    public static final class m implements oh4<q6, gz2> {
        @Override // defpackage.oh4
        public final gz2 invoke(q6 q6Var) {
            q6 q6Var2 = q6Var;
            q6Var2.getClass();
            return gz2.bind(q6Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n extends wp5 implements mh4<androidx.fragment.app.f> {
        public n() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return q6.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o extends wp5 implements mh4<whb> {
        public final /* synthetic */ n u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.u = nVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class p extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class q extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ss5 ss5Var) {
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
    public static final class r extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? q6.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public q6() {
        ss5 ss5VarC = hv5.c(j26.u, new o(new n()));
        this.Q = new shb(ll8.a(r7.class), new p(ss5VarC), new r(ss5VarC), new q(ss5VarC));
        this.R = true;
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_account_settings, viewGroup);
    }

    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        gz2 gz2VarV = v();
        gz2VarV.a.post(new p6(0, gz2VarV, this));
        r7 r7VarW = w();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        r7VarW.c(viewLifecycleOwner, new oh4() { // from class: n6
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                q6.a aVar = q6.Companion;
                gm3Var.getClass();
                boolean z = gm3Var instanceof y6.c;
                q6 q6Var = this.t;
                if (z) {
                    q6Var.t(((y6.c) gm3Var).b);
                } else if (gm3Var instanceof y6.a) {
                    q6Var.i();
                } else if (gm3Var instanceof y6.b) {
                    g gVarRequireActivity = q6Var.requireActivity();
                    gVarRequireActivity.getClass();
                    nr1.d(gVarRequireActivity, xp5.MAIN_TABS);
                }
                return g2b.a;
            }
        });
        gz2 gz2VarV2 = v();
        xgb.a(gz2VarV2.c, new r6(this, null));
        gz2VarV2.e.setNavigationOnClickListener(new View.OnClickListener() { // from class: o6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q6.a aVar = q6.Companion;
                this.t.i();
            }
        });
        AccountSettingsView accountSettingsView = gz2VarV2.b;
        accountSettingsView.setOnGenderChangeListener(new s6(1, w(), r7.class, "onGenderChanged", "onGenderChanged(Lcom/hwpo_training_app/core/presentation/entity/GenderUiEntity;)V", 0));
        accountSettingsView.setOnWeightUnitsChangeListener(new t6(1, w(), r7.class, "onWeightUnitsChanged", "onWeightUnitsChanged(Lcom/hwpo_training_app/core/presentation/entity/WeightUnitsUiEntity;)V", 0, 0));
        accountSettingsView.setOnDistanceUnitsChangeListener(new u6(1, w(), r7.class, "onDistanceUnitsChanged", "onDistanceUnitsChanged(Lcom/hwpo_training_app/core/presentation/entity/DistanceUnitsUiEntity;)V", 0));
        accountSettingsView.setOnLanguageChangeListener(new v6(1, w(), r7.class, "onLanguageChanged", "onLanguageChanged(Lcom/hwpo_training_app/multilanguage/domain/entity/AppLanguage;)V", 0));
        gz2 gz2VarV3 = v();
        yq6 yq6Var = w().A;
        AccountSettingsView accountSettingsView2 = gz2VarV3.b;
        yq6Var.e(getViewLifecycleOwner(), new w6(new g(new c(accountSettingsView2, AccountSettingsView.class, "gender", "getGender()Lcom/hwpo_training_app/core/presentation/entity/GenderUiEntity;", 0))));
        w().B.e(getViewLifecycleOwner(), new w6(new h(new d(accountSettingsView2, AccountSettingsView.class, "weightUnits", "getWeightUnits()Lcom/hwpo_training_app/core/presentation/entity/WeightUnitsUiEntity;", 0))));
        w().C.e(getViewLifecycleOwner(), new w6(new i(new e(accountSettingsView2, AccountSettingsView.class, "distanceUnits", "getDistanceUnits()Lcom/hwpo_training_app/core/presentation/entity/DistanceUnitsUiEntity;", 0))));
        w().D.e(getViewLifecycleOwner(), new w6(new j(new f(accountSettingsView2, AccountSettingsView.class, "language", "getLanguage()Lcom/hwpo_training_app/multilanguage/domain/entity/AppLanguage;", 0))));
        w().E.e(getViewLifecycleOwner(), new w6(new k(gz2VarV3.c)));
        w().F.e(getViewLifecycleOwner(), new w6(new l(new b(gz2VarV3.d, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
    }

    @Override // defpackage.zj0
    public final boolean r() {
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gz2 v() {
        T tA = this.P.a(this, S[0]);
        tA.getClass();
        return (gz2) tA;
    }

    public final r7 w() {
        return (r7) this.Q.getValue();
    }
}
