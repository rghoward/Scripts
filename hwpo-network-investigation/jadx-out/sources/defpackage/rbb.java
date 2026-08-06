package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.p;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import rbb.j;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rbb extends oy4 {
    public final vg4 A = new vg4(new d());
    public final shb B;
    public final o7a C;
    public final o7a D;
    public final o7a E;
    public final o7a F;
    public static final /* synthetic */ ho5<Object>[] G = {new ne8(rbb.class, "binding", "getBinding()Lcom/hwpo_training_app/tracking/databinding/FragmentValuesListBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements oh4<wab, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(wab wabVar) {
            wab wabVar2 = wabVar;
            wabVar2.getClass();
            ybb ybbVar = (ybb) this.receiver;
            ybbVar.getClass();
            oy0.d(rhb.b(ybbVar), null, null, new ccb(ybbVar, wabVar2, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements oh4<Integer, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Integer num) {
            int iIntValue = num.intValue();
            ybb ybbVar = (ybb) this.receiver;
            if (ybbVar.b().d && !ybbVar.b().b && !ybbVar.b().c && iIntValue + 5 >= ybbVar.b().a.size()) {
                oy0.d(rhb.b(ybbVar), null, null, new fcb(ybbVar, ybbVar.E, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<rbb, ug4> {
        @Override // defpackage.oh4
        public final ug4 invoke(rbb rbbVar) {
            rbb rbbVar2 = rbbVar;
            rbbVar2.getClass();
            return ug4.bind(rbbVar2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<androidx.fragment.app.f> {
        public e() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return rbb.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<whb> {
        public final /* synthetic */ e u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.u = eVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ss5 ss5Var) {
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
    public static final class i extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? rbb.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j implements g7a.a {
        public j() {
        }

        @Override // g7a.a
        public final void a(int i) {
            a aVar = rbb.Companion;
            rbb rbbVar = rbb.this;
            final RecyclerView.e0 e0VarI = rbbVar.p().d.I(i, false);
            if (e0VarI == null) {
                return;
            }
            final a0 a0Var = (a0) rbbVar.D.getValue();
            a0Var.getClass();
            a0Var.r.post(new Runnable() { // from class: qk8
                @Override // java.lang.Runnable
                public final void run() {
                    a0 a0Var2 = a0Var;
                    RecyclerView.e0 e0Var = e0VarI;
                    a0Var2.l(e0Var, false);
                    ArrayList arrayList = a0Var2.a;
                    View view = e0Var.a;
                    if (arrayList.remove(view)) {
                        a0Var2.m.getClass();
                        p.d.a(e0Var);
                    }
                    if (xj5.a(a0Var2.w, view)) {
                        a0Var2.w = null;
                    }
                    view.requestLayout();
                }
            });
        }

        @Override // g7a.a
        public final void b(int i) {
            String strB;
            a aVar = rbb.Companion;
            ybb ybbVarQ = rbb.this.q();
            bu8 bu8Var = ybbVarQ.C;
            y23 y23Var = ybbVarQ.b().a.get(i);
            wab wabVar = y23Var instanceof wab ? (wab) y23Var : null;
            Integer numValueOf = wabVar != null ? Integer.valueOf(wabVar.c()) : null;
            ybbVarQ.G = numValueOf;
            if (numValueOf != null) {
                int iOrdinal = ybbVarQ.I.ordinal();
                if (iOrdinal == 0) {
                    strB = bu8Var.b(R.string.personal_record, new Object[0]);
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        u.b();
                        return;
                    }
                    strB = bu8Var.b(R.string.benchmark_workout, new Object[0]);
                }
                ybbVarQ.f(new jbb(new l55.b(bu8Var.b(R.string.are_you_sure, new Object[0]), bu8Var.b(R.string.confirm_value_deletion_text, strB), bu8Var.b(R.string.no_keep, strB), bu8Var.b(R.string.yes_delete, strB), Integer.valueOf(bu8Var.a(R.color.alertErrorText)))));
            }
        }
    }

    public rbb() {
        ss5 ss5VarC = hv5.c(j26.u, new f(new e()));
        this.B = new shb(ll8.a(ybb.class), new g(ss5VarC), new i(ss5VarC), new h(ss5VarC));
        int i2 = 2;
        this.C = new o7a(new ol2(i2, this));
        this.D = new o7a(new pl2(i2, this));
        this.E = new o7a(new mh4() { // from class: obb
            @Override // defpackage.mh4
            public final Object invoke() {
                rbb.a aVar = rbb.Companion;
                return this.t.new j();
            }
        });
        this.F = new o7a(new mh4() { // from class: pbb
            @Override // defpackage.mh4
            public final Object invoke() {
                rbb.a aVar = rbb.Companion;
                rbb rbbVar = this.t;
                Context contextRequireContext = rbbVar.requireContext();
                contextRequireContext.getClass();
                return new g7a(contextRequireContext, (g7a.a) rbbVar.E.getValue());
            }
        });
    }

    @Override // defpackage.hk0
    public final void i() {
        getChildFragmentManager().f0("result_dialog_confirm", getViewLifecycleOwner(), new pf4() { // from class: qbb
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                ybb ybbVarQ;
                Integer num;
                rbb.a aVar = rbb.Companion;
                if (!bundle.getBoolean("arg_dialog_is_confirmed") || (num = (ybbVarQ = this.t.q()).G) == null) {
                    return;
                }
                oy0.d(rhb.b(ybbVarQ), null, null, new zbb(ybbVarQ, num.intValue(), null), 3);
            }
        });
    }

    @Override // androidx.fragment.app.f
    public final void onStart() {
        super.onStart();
        ybb ybbVarQ = q();
        if (ybbVarQ.H) {
            ybbVarQ.g(BuildConfig.FLAVOR);
            ybbVarQ.H = false;
        }
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new mbb(), view2);
            g2b g2bVar = g2b.a;
        }
        ybb ybbVarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ybbVarQ.c(viewLifecycleOwner, new oh4() { // from class: nbb
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                rbb.a aVar = rbb.Companion;
                gm3Var.getClass();
                boolean z = gm3Var instanceof kbb;
                rbb rbbVar = this.t;
                if (z) {
                    rbbVar.m(((kbb) gm3Var).b);
                } else if (gm3Var instanceof lbb) {
                    rbbVar.n(((lbb) gm3Var).b);
                } else if (gm3Var instanceof jbb) {
                    l55.b bVar = ((jbb) gm3Var).b;
                    n55.Companion.getClass();
                    n55 n55Var = new n55();
                    n55Var.setArguments(uy0.c(new js7("dialog_params", bVar)));
                    l childFragmentManager = rbbVar.getChildFragmentManager();
                    childFragmentManager.getClass();
                    n55Var.r(childFragmentManager);
                }
                return g2b.a;
            }
        });
        int i2 = 1;
        q().L.e(getViewLifecycleOwner(), new tbb(new ul2(this, i2)));
        q().K.e(getViewLifecycleOwner(), new tbb(new vl2(i2, new vbb(p().c, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        q().J.e(getViewLifecycleOwner(), new tbb(new ubb(this)));
        androidx.fragment.app.f parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        if (parentFragment != null) {
            z66 z66VarA = i76.a(parentFragment.getLifecycle());
            oy0.d(z66VarA, null, null, new w66(z66VarA, new sbb(this, null), null), 3);
        }
        RecyclerView recyclerView = p().d;
        a0 a0Var = (a0) this.D.getValue();
        p.b bVar = a0Var.z;
        RecyclerView recyclerView2 = a0Var.r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                ArrayList arrayList = a0Var.p;
                recyclerView2.f0(a0Var);
                RecyclerView recyclerView3 = a0Var.r;
                recyclerView3.K.remove(bVar);
                if (recyclerView3.L == bVar) {
                    recyclerView3.L = null;
                }
                ArrayList arrayList2 = a0Var.r.W;
                if (arrayList2 != null) {
                    arrayList2.remove(a0Var);
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    p.f fVar = (p.f) arrayList.get(0);
                    fVar.g.cancel();
                    g7a g7aVar = a0Var.m;
                    RecyclerView.e0 e0Var = fVar.e;
                    g7aVar.getClass();
                    p.d.a(e0Var);
                }
                arrayList.clear();
                a0Var.w = null;
                VelocityTracker velocityTracker = a0Var.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    a0Var.t = null;
                }
                p.e eVar = a0Var.y;
                if (eVar != null) {
                    eVar.t = false;
                    a0Var.y = null;
                }
                if (a0Var.x != null) {
                    a0Var.x = null;
                }
            }
            a0Var.r = recyclerView;
            Resources resources = recyclerView.getResources();
            a0Var.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            a0Var.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            a0Var.q = ViewConfiguration.get(a0Var.r.getContext()).getScaledTouchSlop();
            a0Var.r.h(a0Var);
            a0Var.r.K.add(bVar);
            RecyclerView recyclerView4 = a0Var.r;
            if (recyclerView4.W == null) {
                recyclerView4.W = new ArrayList();
            }
            recyclerView4.W.add(a0Var);
            a0Var.y = new p.e(a0Var);
            a0Var.x = new GestureDetector(a0Var.r.getContext(), a0Var.y);
        }
        int dimension = (int) recyclerView.getResources().getDimension(R.dimen.values_list_margin_vertical);
        int dimension2 = (int) recyclerView.getResources().getDimension(R.dimen.values_list_margin_horizontal);
        int dimension3 = (int) recyclerView.getResources().getDimension(R.dimen.values_list_margin_between);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((ibb) this.C.getValue());
        recyclerView.h(new gbb(dimension2, dimension3, dimension, dimension));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ug4 p() {
        return (ug4) this.A.a(this, G[0]);
    }

    public final ybb q() {
        return (ybb) this.B.getValue();
    }
}
