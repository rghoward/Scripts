package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.layout_manager.HorizontalRatioLayoutManager;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gk3 extends jx4 {
    public final vg4 A = new vg4(new e());
    public final shb B;
    public final o7a C;
    public final o7a D;
    public static final /* synthetic */ ho5<Object>[] E = {new ne8(gk3.class, "binding", "getBinding()Lcom/hwpo_training_app/tracking/databinding/FragmentEntryDetailsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            ((gl3) this.receiver).i(l89Var2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.EntryDetailsFragment$initListeners$1", f = "EntryDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public c(r02<? super c> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return gk3.this.new c(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = gk3.Companion;
            gl3 gl3VarQ = gk3.this.q();
            xj3 xj3Var = gl3VarQ.b().d;
            if (xj3Var != null) {
                vn0 vn0Var = new vn0(gl3VarQ.H, gl3VarQ.I, xj3Var.d, xj3Var.e, xj3Var.f, xj3Var.g, gl3VarQ.K, false);
                LocalDate localDate = LocalDate.parse(gl3VarQ.J, DateTimeFormatter.ofPattern("d MMM, yyyy"));
                e70 e70Var = gl3VarQ.z;
                List<m89> list = xj3Var.h;
                e70Var.getClass();
                ArrayList arrayListB = e70.b(list);
                pta ptaVar = gl3VarQ.x;
                int iOrdinal = gl3VarQ.G.ordinal();
                int i = xj3Var.a;
                localDate.getClass();
                xj3 xj3Var2 = gl3VarQ.b().d;
                ptaVar.h(iOrdinal, i, vn0Var, xj3Var2 != null ? xj3Var2.b : null, localDate, arrayListB);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            ((gl3) this.receiver).i(l89Var2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements oh4<gk3, re4> {
        @Override // defpackage.oh4
        public final re4 invoke(gk3 gk3Var) {
            gk3 gk3Var2 = gk3Var;
            gk3Var2.getClass();
            return re4.bind(gk3Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<androidx.fragment.app.f> {
        public f() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return gk3.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? gk3.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public gk3() {
        ss5 ss5VarC = hv5.c(j26.u, new g(new f()));
        this.B = new shb(ll8.a(gl3.class), new h(ss5VarC), new j(ss5VarC), new i(ss5VarC));
        this.C = new o7a(new mh4() { // from class: ek3
            @Override // defpackage.mh4
            public final Object invoke() {
                gk3.a aVar = gk3.Companion;
                return new wm6(new gk3.d(1, this.t.q(), gl3.class, "onAttachmentClick", "onAttachmentClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)V", 0));
            }
        });
        this.D = new o7a(new mh4() { // from class: fk3
            @Override // defpackage.mh4
            public final Object invoke() {
                gk3.a aVar = gk3.Companion;
                return new jw3(new gk3.b(1, this.t.q(), gl3.class, "onAttachmentClick", "onAttachmentClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)V", 0), R.color.attachmentsBackground);
            }
        });
    }

    @Override // defpackage.hk0
    public final void i() {
        xgb.a(p().b, new c(null));
        p().h.setNavigationOnClickListener(new View.OnClickListener() { // from class: dk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gk3.a aVar = gk3.Companion;
                this.t.j();
            }
        });
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        re4 re4VarP = p();
        int dimension = (int) getResources().getDimension(R.dimen.default_margin);
        f15 f15Var = new f15(dimension, dimension);
        RecyclerView recyclerView = re4VarP.d;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        recyclerView.setLayoutManager(new HorizontalRatioLayoutManager(contextRequireContext));
        new cs2().a(p().d);
        recyclerView.h(f15Var);
        recyclerView.setAdapter((wm6) this.C.getValue());
        RecyclerView recyclerView2 = re4VarP.c;
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        recyclerView2.setLayoutManager(new HorizontalRatioLayoutManager(contextRequireContext2));
        new cs2().a(p().c);
        recyclerView2.h(f15Var);
        recyclerView2.setAdapter((jw3) this.D.getValue());
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new ck3(), view2);
            g2b g2bVar = g2b.a;
        }
        q().N.e(getViewLifecycleOwner(), new hk3(new ik3(0, new rk3(p().g, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        q().L.e(getViewLifecycleOwner(), new hk3(new jk3(0, p().h)));
        q().M.e(getViewLifecycleOwner(), new hk3(new kk3(p().h)));
        q().P.e(getViewLifecycleOwner(), new hk3(new lk3(p().e)));
        q().Q.e(getViewLifecycleOwner(), new hk3(new mk3(new sk3(p().e, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        q().R.e(getViewLifecycleOwner(), new hk3(new nk3(this)));
        q().S.e(getViewLifecycleOwner(), new hk3(new ok3(this)));
        q().O.e(getViewLifecycleOwner(), new hk3(new pk3(this)));
        gl3 gl3VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        gl3VarQ.c(viewLifecycleOwner, new s1(2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final re4 p() {
        return (re4) this.A.a(this, E[0]);
    }

    public final gl3 q() {
        return (gl3) this.B.getValue();
    }
}
