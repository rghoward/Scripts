package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class to8 extends cy4 {
    public final vg4 A = new vg4(new c());
    public final shb B;
    public final o7a C;
    public static final /* synthetic */ ho5<Object>[] D = {new ne8(to8.class, "binding", "getBinding()Lcom/hwpo_training_app/report/databinding/FragmentReportReasonsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<jo8, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(jo8 jo8Var) {
            jo8 jo8Var2 = jo8Var;
            jo8Var2.getClass();
            gp8 gp8Var = (gp8) this.receiver;
            gp8Var.getClass();
            q09 q09Var = gp8Var.x;
            if (jo8Var2.a.equals("something_else")) {
                do8 do8Var = gp8Var.y;
                long jG = gp8Var.g();
                Object objA = q09Var.a("com.hwpo_training_app.report.presentation.reasons.ReportReasonsFragment.SCORE_ID_EXTRA");
                if (objA == null) {
                    z90.a("Required value was null.");
                    return null;
                }
                do8Var.d(jG, ((Number) objA).intValue(), (Integer) q09Var.a("com.hwpo_training_app.report.presentation.reasons.ReportReasonsFragment.SCORE_VALUE_ID_EXTRA"));
            } else {
                oy0.d(rhb.b(gp8Var), null, null, new fp8(gp8Var, jo8Var2, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<to8, nf4> {
        @Override // defpackage.oh4
        public final nf4 invoke(to8 to8Var) {
            to8 to8Var2 = to8Var;
            to8Var2.getClass();
            return nf4.bind(to8Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<androidx.fragment.app.f> {
        public d() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return to8.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? to8.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public to8() {
        ss5 ss5VarC = hv5.c(j26.u, new e(new d()));
        this.B = new shb(ll8.a(gp8.class), new f(ss5VarC), new h(ss5VarC), new g(ss5VarC));
        this.C = new o7a(new lt4(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0
    public final void i() {
        ((nf4) this.A.a(this, D[0])).d.setNavigationOnClickListener(new View.OnClickListener() { // from class: so8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                to8.a aVar = to8.Companion;
                this.t.p().y.a();
            }
        });
    }

    @Override // defpackage.hk0
    public final void j() {
        p().y.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ho5<?>[] ho5VarArr = D;
        ho5<?> ho5Var = ho5VarArr[0];
        vg4 vg4Var = this.A;
        RecyclerView recyclerView = ((nf4) vg4Var.a(this, ho5Var)).c;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        o7a o7aVar = this.C;
        recyclerView.setAdapter((qo8) o7aVar.getValue());
        Drawable drawable = recyclerView.getContext().getDrawable(R.drawable.common_divider);
        if (drawable == null) {
            z90.a("Required value was null.");
            return;
        }
        recyclerView.h(new feb(drawable, (int) recyclerView.getResources().getDimension(R.dimen.default_margin), (int) recyclerView.getResources().getDimension(R.dimen.default_margin)));
        View view2 = getView();
        int i = 1;
        if (view2 != null) {
            ee5.a(new uj7(1), view2);
            g2b g2bVar = g2b.a;
        }
        p().C.e(getViewLifecycleOwner(), new uo8(new vo8((qo8) o7aVar.getValue())));
        p().D.e(getViewLifecycleOwner(), new uo8(new wo8(new xo8(((nf4) vg4Var.a(this, ho5VarArr[0])).b, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        gp8 gp8VarP = p();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        gp8VarP.c(viewLifecycleOwner, new f32(i, this));
    }

    public final gp8 p() {
        return (gp8) this.B.getValue();
    }
}
