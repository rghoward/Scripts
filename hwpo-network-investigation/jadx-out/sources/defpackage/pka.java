package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.g;
import androidx.fragment.app.l;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pka extends ky4 {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(pka.class, "binding", "getBinding()Lcom/hwpo_training_app/report/databinding/FragmentThankYouBinding;", 0)};
    public static final a Companion = new a();
    public final vg4 A = new vg4(new c());
    public final shb B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static pka a(long j, String str) {
            str.getClass();
            pka pkaVar = new pka();
            pkaVar.setArguments(uy0.c(new js7("com.hwpo_training_app.report.presentation.thank_you.ThankYouFragment.REASON_TEXT_EXTRA", str), new js7("com.hwpo_training_app.report.presentation.thank_you.ThankYouFragment.COMMENT_ID_EXTRA", Long.valueOf(j))));
            return pkaVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.report.presentation.thank_you.ThankYouFragment$initListeners$1$1", f = "ThankYouFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return pka.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = pka.Companion;
            ((tka) pka.this.B.getValue()).g();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<pka, hg4> {
        @Override // defpackage.oh4
        public final hg4 invoke(pka pkaVar) {
            pka pkaVar2 = pkaVar;
            pkaVar2.getClass();
            return hg4.bind(pkaVar2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<androidx.fragment.app.f> {
        public d() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return pka.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? pka.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public pka() {
        ss5 ss5VarC = hv5.c(j26.u, new e(new d()));
        this.B = new shb(ll8.a(tka.class), new f(ss5VarC), new h(ss5VarC), new g(ss5VarC));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0
    public final void i() {
        hg4 hg4Var = (hg4) this.A.a(this, C[0]);
        xgb.a(hg4Var.b, new b(null));
        hg4Var.c.setNavigationOnClickListener(new View.OnClickListener() { // from class: oka
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pka.a aVar = pka.Companion;
                ((tka) this.t.B.getValue()).g();
            }
        });
    }

    @Override // defpackage.hk0
    public final void j() {
        ((tka) this.B.getValue()).g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new mka(), view2);
            g2b g2bVar = g2b.a;
        }
        shb shbVar = this.B;
        ((tka) shbVar.getValue()).z.e(getViewLifecycleOwner(), new qka(new rka(((hg4) this.A.a(this, C[0])).c)));
        tka tkaVar = (tka) shbVar.getValue();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        tkaVar.c(viewLifecycleOwner, new oh4() { // from class: nka
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                g activity;
                l supportFragmentManager;
                gm3 gm3Var = (gm3) obj;
                pka.a aVar = pka.Companion;
                gm3Var.getClass();
                if ((gm3Var instanceof lka.a) && (activity = this.t.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.e0(uy0.c(new js7("com.hwpo_training_app.report.Report.COMMENT_ID", Long.valueOf(((lka.a) gm3Var).b))), "com.hwpo_training_app.report.Report.RESULT");
                }
                return g2b.a;
            }
        });
    }
}
