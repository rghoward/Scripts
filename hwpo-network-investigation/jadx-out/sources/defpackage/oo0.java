package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oo0 extends ax4 {
    public kp0 A;
    public final vg4 B = new vg4(new c());
    public final shb C;
    public static final /* synthetic */ ho5<Object>[] D = {new ne8(oo0.class, "binding", "getBinding()Lcom/hwpo_training_app/benchmarks/databinding/FragmentBenchmarksBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.benchmarks.presentation.benchmarks.BenchmarksFragment$initListeners$1$1", f = "BenchmarksFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public final /* synthetic */ he4 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(he4 he4Var, r02<? super b> r02Var) {
            super(3, r02Var);
            this.u = he4Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return oo0.this.new b(this.u, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = oo0.Companion;
            fp0 fp0VarR = oo0.this.r();
            HashMap<Integer, String> benchmarksText = this.u.b.getBenchmarksText();
            benchmarksText.getClass();
            if (!benchmarksText.isEmpty()) {
                oy0.d(rhb.b(fp0VarR), null, null, new jp0(fp0VarR, benchmarksText, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<oo0, he4> {
        @Override // defpackage.oh4
        public final he4 invoke(oo0 oo0Var) {
            oo0 oo0Var2 = oo0Var;
            oo0Var2.getClass();
            return he4.bind(oo0Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<androidx.fragment.app.f> {
        public d() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return oo0.this;
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

    public oo0() {
        o10 o10Var = new o10(1, this);
        ss5 ss5VarC = hv5.c(j26.u, new e(new d()));
        this.C = new shb(ll8.a(fp0.class), new f(ss5VarC), o10Var, new g(ss5VarC));
    }

    public static kp0 p(oo0 oo0Var) {
        kp0 kp0Var = oo0Var.A;
        if (kp0Var == null) {
            xj5.e("viewModelFactory");
            throw null;
        }
        Bundle bundleRequireArguments = oo0Var.requireArguments();
        bundleRequireArguments.getClass();
        kp0Var.i = bundleRequireArguments.getInt("PROGRAM_ID_KEY", -1);
        kp0Var.j = bundleRequireArguments.getInt("SESSION_ID_KEY", -1);
        List<vn0> parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundleRequireArguments.getParcelableArrayList("BENCHMARKS_KEY", vn0.class) : bundleRequireArguments.getParcelableArrayList("BENCHMARKS_KEY");
        if (parcelableArrayList == null) {
            parcelableArrayList = hf3.t;
        }
        kp0Var.k = parcelableArrayList;
        return kp0Var;
    }

    @Override // defpackage.hk0
    public final void i() {
        he4 he4VarQ = q();
        fp0 fp0VarR = r();
        zl9<HashMap<Integer, String>> benchmarkUpdatesFlow = he4VarQ.b.getBenchmarkUpdatesFlow();
        benchmarkUpdatesFlow.getClass();
        yk2.o(new k74(new hp0(yk2.i(benchmarkUpdatesFlow), fp0VarR), new ip0(fp0VarR, null)), rhb.b(fp0VarR));
        xgb.a(he4VarQ.d, new b(he4VarQ, null));
        he4VarQ.e.setNavigationOnClickListener(new View.OnClickListener() { // from class: lo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oo0.a aVar = oo0.Companion;
                this.t.r().A.b();
            }
        });
    }

    @Override // defpackage.hk0
    public final void j() {
        r().A.b();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new mo0(), view2);
        }
        r().H.e(getViewLifecycleOwner(), new po0(new qo0(this)));
        r().I.e(getViewLifecycleOwner(), new po0(new ro0(this)));
        r().J.e(getViewLifecycleOwner(), new po0(new so0(this)));
        fp0 fp0VarR = r();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        fp0VarR.c(viewLifecycleOwner, new no0(0, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final he4 q() {
        return (he4) this.B.a(this, D[0]);
    }

    public final fp0 r() {
        return (fp0) this.C.getValue();
    }
}
