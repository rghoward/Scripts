package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hwpo_training_app.R;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ql2 extends fx4 {
    public om2 A;
    public final vg4 B = new vg4(new c());
    public final shb C;
    public final o7a D;
    public final o7a E;
    public final o7a F;
    public static final /* synthetic */ ho5<Object>[] G = {new ne8(ql2.class, "binding", "getBinding()Lcom/hwpo_training_app/workouts/databinding/FragmentDayWorkoutsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<bc8, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(bc8 bc8Var) {
            bc8 bc8Var2 = bc8Var;
            bc8Var2.getClass();
            cm2 cm2Var = (cm2) this.receiver;
            cm2Var.getClass();
            spb spbVar = cm2Var.x;
            LocalDate localDateP = yk2.p(bc8Var2.y);
            localDateP.getClass();
            int i = bc8Var2.t;
            yz7 yz7Var = bc8Var2.u;
            spbVar.b(localDateP, i, yz7Var.t, yz7Var.u, bc8Var2.w, bc8Var2.v);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<ql2, ne4> {
        @Override // defpackage.oh4
        public final ne4 invoke(ql2 ql2Var) {
            ql2 ql2Var2 = ql2Var;
            ql2Var2.getClass();
            return ne4.bind(ql2Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<androidx.fragment.app.f> {
        public d() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return ql2.this;
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

    public ql2() {
        int i = 0;
        ll2 ll2Var = new ll2(i, this);
        ss5 ss5VarC = hv5.c(j26.u, new e(new d()));
        this.C = new shb(ll8.a(cm2.class), new f(ss5VarC), ll2Var, new g(ss5VarC));
        this.D = new o7a(new ml2(i, this));
        this.E = new o7a(new nl2(i, this));
        this.F = new o7a(new ol2(i, this));
    }

    @Override // defpackage.hk0
    public final void i() {
        p().d.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: kl2
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void a() {
                ql2.a aVar = ql2.Companion;
                cm2 cm2VarQ = this.t.q();
                cm2VarQ.e(cm2.b.e.a);
                oy0.d(rhb.b(cm2VarQ), null, null, new nm2(cm2VarQ, null), 3);
            }
        });
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ne4 ne4VarP = p();
        ne4VarP.d.setColorSchemeResources(R.color.colorPrimary);
        RecyclerView recyclerView = ne4VarP.c;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        o7a o7aVar = this.D;
        recyclerView.setAdapter((xob) o7aVar.getValue());
        recyclerView.h((eeb) this.F.getValue());
        q().E.e(getViewLifecycleOwner(), new rl2(new sl2(this)));
        q().F.e(getViewLifecycleOwner(), new rl2(new tl2(this)));
        q().G.e(getViewLifecycleOwner(), new rl2(new ul2(this, 0)));
        q().H.e(getViewLifecycleOwner(), new rl2(new vl2(0, (xob) o7aVar.getValue())));
        cm2 cm2VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        cm2VarQ.c(viewLifecycleOwner, new ds(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ne4 p() {
        return (ne4) this.B.a(this, G[0]);
    }

    public final cm2 q() {
        return (cm2) this.C.getValue();
    }
}
