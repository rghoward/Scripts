package defpackage;

import android.os.Bundle;
import android.view.View;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class opa extends ly4 {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(opa.class, "binding", "getBinding()Lcom/hwpo_training_app/sessions/databinding/FragmentTodayTipDetailsBinding;", 0)};
    public static final a Companion = new a();
    public final vg4 A = new vg4(new c());
    public final shb B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.today_tips.TodayTipDetailsFragment$initListeners$1$1", f = "TodayTipDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return opa.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            String str2;
            String str3;
            dv8.b(obj);
            a aVar = opa.Companion;
            wpa wpaVarQ = opa.this.q();
            hy8 hy8Var = wpaVarQ.x;
            ipa.b bVar = wpaVarQ.b().c;
            u60 u60Var = bVar != null ? bVar.u : null;
            int i = u60Var == null ? -1 : wpa.b.a[u60Var.ordinal()];
            String str4 = BuildConfig.FLAVOR;
            if (i == 1) {
                ipa.b bVar2 = wpaVarQ.b().c;
                if (bVar2 != null && (str = bVar2.w) != null) {
                    str4 = str;
                }
                hy8Var.c(new y38(str4));
                g2b g2bVar = g2b.a;
            } else if (i == 2) {
                ipa.b bVar3 = wpaVarQ.b().c;
                if (bVar3 != null && (str2 = bVar3.v) != null) {
                    str4 = str2;
                }
                hy8Var.c(new p52(str4, true));
                g2b g2bVar2 = g2b.a;
            } else if (i != 3) {
                g2b g2bVar3 = g2b.a;
            } else {
                ipa.b bVar4 = wpaVarQ.b().c;
                if (bVar4 != null && (str3 = bVar4.w) != null) {
                    wpaVarQ.f(new atb(str3));
                    g2b g2bVar4 = g2b.a;
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<opa, ig4> {
        @Override // defpackage.oh4
        public final ig4 invoke(opa opaVar) {
            opa opaVar2 = opaVar;
            opaVar2.getClass();
            return ig4.bind(opaVar2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<androidx.fragment.app.f> {
        public d() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return opa.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? opa.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public opa() {
        ss5 ss5VarC = hv5.c(j26.u, new e(new d()));
        this.B = new shb(ll8.a(wpa.class), new f(ss5VarC), new h(ss5VarC), new g(ss5VarC));
    }

    @Override // defpackage.hk0
    public final void i() {
        ig4 ig4VarP = p();
        xgb.a(ig4VarP.c, new b(null));
        ig4VarP.g.setNavigationOnClickListener(new View.OnClickListener() { // from class: npa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                opa.a aVar = opa.Companion;
                this.t.q().x.b();
            }
        });
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.b();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new mpa(), view2);
        }
        q().y.e(getViewLifecycleOwner(), new ppa(new qpa(p().g)));
        q().z.e(getViewLifecycleOwner(), new ppa(new rpa(this)));
        int i = 1;
        q().A.e(getViewLifecycleOwner(), new ppa(new mg6(this, i)));
        q().B.e(getViewLifecycleOwner(), new ppa(new ng6(i, new spa(p().f, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        wpa wpaVarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        wpaVarQ.c(viewLifecycleOwner, new r58(2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ig4 p() {
        return (ig4) this.A.a(this, C[0]);
    }

    public final wpa q() {
        return (wpa) this.B.getValue();
    }
}
