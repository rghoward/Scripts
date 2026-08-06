package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class er8 extends dy4 {
    public final vg4 P = new vg4(new g());
    public final shb Q;
    public final boolean R;
    public static final /* synthetic */ ho5<Object>[] S = {new ne8(er8.class, "binding", "getBinding()Lcom/hwpo_training_app/client/databinding/DialogRequiredBenchmarkInputBinding;", 0)};
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
    public static final class c implements oh4<String, g2b> {
        public final /* synthetic */ MaterialToolbar t;

        public c(MaterialToolbar materialToolbar) {
            this.t = materialToolbar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            this.t.setTitle(str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<vn0, g2b> {
        public d() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(vn0 vn0Var) {
            vn0 vn0Var2 = vn0Var;
            a aVar = er8.Companion;
            if (vn0Var2 != null) {
                er8.this.v().b.k(null, ws0.h(vn0Var2));
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements oh4<Boolean, g2b> {
        public final /* synthetic */ MaterialButton t;

        public e(MaterialButton materialButton) {
            this.t = materialButton;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            this.t.setEnabled(bool.booleanValue());
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements oh4<Boolean, g2b> {
        public final /* synthetic */ b t;

        public f(b bVar) {
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
    public static final class g implements oh4<er8, g03> {
        @Override // defpackage.oh4
        public final g03 invoke(er8 er8Var) {
            er8 er8Var2 = er8Var;
            er8Var2.getClass();
            return g03.bind(er8Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements mh4<androidx.fragment.app.f> {
        public h() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return er8.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? er8.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public er8() {
        ss5 ss5VarC = hv5.c(j26.u, new i(new h()));
        this.Q = new shb(ll8.a(jr8.class), new j(ss5VarC), new l(ss5VarC), new k(ss5VarC));
        this.R = true;
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_required_benchmark_input, viewGroup);
    }

    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        g03 g03VarV = v();
        w().C.e(getViewLifecycleOwner(), new gr8(new c(g03VarV.e)));
        w().D.e(getViewLifecycleOwner(), new gr8(new d()));
        w().E.e(getViewLifecycleOwner(), new gr8(new e(g03VarV.c)));
        w().F.e(getViewLifecycleOwner(), new gr8(new f(new b(g03VarV.d, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        g03 g03VarV2 = v();
        MaterialToolbar materialToolbar = g03VarV2.e;
        ConstraintLayout constraintLayout = g03VarV2.a;
        constraintLayout.getClass();
        xgb.g(materialToolbar, R.drawable.ic_close_results_dialog, constraintLayout.getContext().getColor(R.color.colorPrimary));
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: dr8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                er8.a aVar = er8.Companion;
                this.t.w().f(ir8.a.b);
            }
        });
        final g03 g03VarV3 = v();
        g03VarV3.a.post(new Runnable() { // from class: cr8
            @Override // java.lang.Runnable
            public final void run() {
                er8.a aVar = er8.Companion;
                ConstraintLayout constraintLayout2 = g03VarV3.a;
                constraintLayout2.getClass();
                int dimension = (int) constraintLayout2.getResources().getDimension(R.dimen.bottom_sheet_top_padding);
                er8 er8Var = this;
                er8Var.p().K(er8Var.v().a.getHeight() + dimension);
            }
        });
        g03 g03VarV4 = v();
        xgb.a(g03VarV4.c, new fr8(this, g03VarV4, null));
        jr8 jr8VarW = w();
        zl9<HashMap<Integer, String>> benchmarkUpdatesFlow = g03VarV4.b.getBenchmarkUpdatesFlow();
        benchmarkUpdatesFlow.getClass();
        yk2.o(new k74(new lr8(yk2.i(benchmarkUpdatesFlow), jr8VarW), new mr8(jr8VarW, null)), rhb.b(jr8VarW));
        jr8 jr8VarW2 = w();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        jr8VarW2.c(viewLifecycleOwner, new nl7(1, this));
    }

    @Override // defpackage.zj0
    public final boolean r() {
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g03 v() {
        T tA = this.P.a(this, S[0]);
        tA.getClass();
        return (g03) tA;
    }

    public final jr8 w() {
        return (jr8) this.Q.getValue();
    }
}
