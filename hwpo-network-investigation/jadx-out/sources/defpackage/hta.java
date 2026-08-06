package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SearchEditText;
import com.intercom.twig.BuildConfig;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hta extends my4 implements k89 {
    public static final /* synthetic */ ho5<Object>[] D = {new ne8(hta.class, "binding", "getBinding()Lcom/hwpo_training_app/tracking/databinding/FragmentTrackingBinding;", 0)};
    public final vg4 A = new vg4(new c());
    public final shb B;
    public li8 C;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.container.TrackingFragment$initListeners$1$1", f = "TrackingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public a(r02<? super a> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return hta.this.new a(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            ho5<Object>[] ho5VarArr = hta.D;
            nua nuaVarQ = hta.this.q();
            if (nuaVarQ.b().a == 0) {
                nuaVarQ.x.v();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements TabLayout.d {
        public final /* synthetic */ jg4 b;

        public b(jg4 jg4Var) {
            this.b = jg4Var;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            Iterable iterableI;
            ho5<Object>[] ho5VarArr = hta.D;
            nua nuaVarQ = hta.this.q();
            int selectedTabPosition = this.b.c.getSelectedTabPosition();
            bu8 bu8Var = nuaVarQ.y;
            nuaVarQ.e(new ssa.a(selectedTabPosition));
            if (selectedTabPosition != 0) {
                iterableI = selectedTabPosition != 1 ? hf3.t : ws0.i(new ssa.c(bu8Var.b(R.string.search_benchmark_workouts_hint, new Object[0])), new ssa.b(false));
            } else {
                iterableI = ws0.i(new ssa.c(bu8Var.b(R.string.search_personal_records_hint, new Object[0])), new ssa.b(true));
            }
            Iterator it = iterableI.iterator();
            while (it.hasNext()) {
                nuaVarQ.e((bl0) it.next());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<hta, jg4> {
        @Override // defpackage.oh4
        public final jg4 invoke(hta htaVar) {
            hta htaVar2 = htaVar;
            htaVar2.getClass();
            return jg4.bind(htaVar2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<androidx.fragment.app.f> {
        public d() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return hta.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<whb> {
        public final /* synthetic */ d u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.u = dVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ss5 ss5Var) {
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
    public static final class h extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? hta.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public hta() {
        ss5 ss5VarC = hv5.c(j26.u, new e(new d()));
        this.B = new shb(ll8.a(nua.class), new f(ss5VarC), new h(ss5VarC), new g(ss5VarC));
    }

    @Override // defpackage.k89
    public final void c(sbb.a aVar) {
        qd3.a(p().d.getEditText(), new int[]{3}, new l57(1, aVar));
    }

    @Override // defpackage.k89
    public final li8 g() {
        li8 li8Var = this.C;
        if (li8Var != null) {
            return li8Var;
        }
        xj5.e("searchQueryState");
        throw null;
    }

    @Override // defpackage.hk0
    public final void i() {
        jg4 jg4VarP = p();
        xgb.a(jg4VarP.b, new a(null));
        jg4VarP.e.setNavigationOnClickListener(new View.OnClickListener() { // from class: fta
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ho5<Object>[] ho5VarArr = hta.D;
                this.t.j();
            }
        });
        jg4VarP.c.a(new b(jg4VarP));
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.C = yk2.u(yk2.h(new ita(p().d.getTextChangesFlow()), 250L), i76.a(getLifecycle()), um9.a.a, BuildConfig.FLAVOR);
        jg4 jg4VarP = p();
        ViewPager2 viewPager2 = jg4VarP.f;
        if (viewPager2.getAdapter() == null) {
            viewPager2.setAdapter(new qta(this));
            viewPager2.setOffscreenPageLimit(2);
        }
        new com.google.android.material.tabs.c(jg4VarP.c, viewPager2, new up3(this)).a();
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new gta(), view2);
            g2b g2bVar = g2b.a;
        }
        q().z.e(getViewLifecycleOwner(), new jta(new kta(new mta(p().d, SearchEditText.class, "hint", "getHint()Ljava/lang/String;", 0))));
        q().A.e(getViewLifecycleOwner(), new jta(new lta(new nta(p().b, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jg4 p() {
        return (jg4) this.A.a(this, D[0]);
    }

    public final nua q() {
        return (nua) this.B.getValue();
    }
}
