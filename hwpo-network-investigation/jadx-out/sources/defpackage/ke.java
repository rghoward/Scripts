package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.PickedOptionTextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ke extends yw4 {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(ke.class, "binding", "getBinding()Lcom/hwpo_training_app/affiliated_gym/databinding/FragmentAffilatedGymFilterBinding;", 0)};
    public static final a Companion = new a();
    public final vg4 A = new vg4(new e());
    public final shb B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.filters.screen.AffiliatedGymFilterFragment$initListeners$1$1", f = "AffiliatedGymFilterFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return ke.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = ke.Companion;
            ue ueVarQ = ke.this.q();
            ueVarQ.f(new ee(new re(ueVarQ.b().a, ueVarQ.b().b)));
            ueVarQ.x.a();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.filters.screen.AffiliatedGymFilterFragment$initListeners$1$4", f = "AffiliatedGymFilterFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public c(r02<? super c> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return ke.this.new c(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = ke.Companion;
            ue ueVarQ = ke.this.q();
            ed6.b bVar = new ed6.b(ueVarQ.b().a, R.string.country, R.string.select_your_country);
            ueVarQ.y = bVar;
            ueVarQ.f(new fe(bVar));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.filters.screen.AffiliatedGymFilterFragment$initListeners$1$5", f = "AffiliatedGymFilterFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public d(r02<? super d> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return ke.this.new d(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            dv8.b(obj);
            a aVar = ke.Companion;
            ue ueVarQ = ke.this.q();
            oq4.a aVar2 = ueVarQ.b().b;
            oq4.b bVar = ueVarQ.b().a;
            if (bVar != null && (str = bVar.t) != null) {
                ed6.a aVar3 = new ed6.a(str, aVar2, R.string.city, R.string.select_your_city);
                ueVarQ.y = aVar3;
                ueVarQ.f(new fe(aVar3));
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements oh4<ke, fe4> {
        @Override // defpackage.oh4
        public final fe4 invoke(ke keVar) {
            ke keVar2 = keVar;
            keVar2.getClass();
            return fe4.bind(keVar2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<androidx.fragment.app.f> {
        public f() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return ke.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements mh4<whb> {
        public final /* synthetic */ f u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.u = fVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ss5 ss5Var) {
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
    public static final class j extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? ke.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ke() {
        ss5 ss5VarC = hv5.c(j26.u, new g(new f()));
        this.B = new shb(ll8.a(ue.class), new h(ss5VarC), new j(ss5VarC), new i(ss5VarC));
    }

    public static void p(ke keVar, String str, Bundle bundle) {
        Parcelable parcelable;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundle.getParcelable("com.hwpo_training_app.affilated_gym.filters.location_filter.GymLocationFilterFragment.SELECT_FILTER_RESULT_KEY", oq4.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("com.hwpo_training_app.affilated_gym.filters.location_filter.GymLocationFilterFragment.SELECT_FILTER_RESULT_KEY");
            if (!(parcelable2 instanceof oq4)) {
                parcelable2 = null;
            }
            parcelable = (oq4) parcelable2;
        }
        ue ueVarQ = keVar.q();
        oq4 oq4Var = (oq4) parcelable;
        ed6 ed6Var = ueVarQ.y;
        if (ed6Var == null) {
            return;
        }
        if (ed6Var instanceof ed6.b) {
            if (!xj5.a(oq4Var, ueVarQ.b().a)) {
                ueVarQ.e(new de.a(null));
            }
            ueVarQ.e(new de.b(oq4Var instanceof oq4.b ? (oq4.b) oq4Var : null));
        } else {
            if (!(ed6Var instanceof ed6.a)) {
                u.b();
                return;
            }
            ueVarQ.e(new de.a(oq4Var instanceof oq4.a ? (oq4.a) oq4Var : null));
        }
        ueVarQ.y = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0
    public final void i() {
        fe4 fe4Var = (fe4) this.A.a(this, C[0]);
        xgb.a(fe4Var.b, new b(null));
        fe4Var.e.setNavigationOnClickListener(new View.OnClickListener() { // from class: he
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ke.a aVar = ke.Companion;
                this.t.q().x.a();
            }
        });
        getChildFragmentManager().f0("com.hwpo_training_app.affilated_gym.filters.location_filter.GymLocationFilterFragment.SELECT_FILTER_REQUEST_KEY", getViewLifecycleOwner(), new pf4() { // from class: ie
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                ke.p(this.t, str, bundle);
            }
        });
        xgb.a(fe4Var.d, new c(null));
        xgb.a(fe4Var.c, new d(null));
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new je(), view2);
        }
        ue ueVarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        int i2 = 0;
        ueVarQ.c(viewLifecycleOwner, new ge(i2, this));
        yq6 yq6Var = q().z;
        ho5<?>[] ho5VarArr = C;
        ho5<?> ho5Var = ho5VarArr[0];
        vg4 vg4Var = this.A;
        yq6Var.e(getViewLifecycleOwner(), new le(new me(i2, new oe(0, ((fe4) vg4Var.a(this, ho5Var)).d, PickedOptionTextView.class, "pickedOptionText", "getPickedOptionText()Ljava/lang/String;", 0))));
        q().A.e(getViewLifecycleOwner(), new le(new ne(new pe(((fe4) vg4Var.a(this, ho5VarArr[0])).c, PickedOptionTextView.class, "pickedOptionText", "getPickedOptionText()Ljava/lang/String;", 0), i2)));
    }

    public final ue q() {
        return (ue) this.B.getValue();
    }
}
