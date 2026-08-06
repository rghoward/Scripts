package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wq4 extends nx4 {
    public final vg4 P = new vg4(new d());
    public final shb Q;
    public final boolean R;
    public final o7a S;
    public static final /* synthetic */ ho5<Object>[] T = {new ne8(wq4.class, "binding", "getBinding()Lcom/hwpo_training_app/affiliated_gym/databinding/DialogGymLocationFilterBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements ci4<Integer, Boolean, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(Integer num, Boolean bool) {
            int iIntValue = num.intValue();
            boolean zBooleanValue = bool.booleanValue();
            rr4 rr4Var = (rr4) this.receiver;
            Iterator<w23> it = rr4Var.b().d.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                w23 next = it.next();
                if ((next instanceof mr4) && ((mr4) next).c) {
                    break;
                }
                i++;
            }
            Iterator<w23> it2 = rr4Var.b().d.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                w23 next2 = it2.next();
                if ((next2 instanceof mr4) && ((mr4) next2).a == iIntValue) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                Object objB = th1.B(i, rr4Var.b().d);
                mr4 mr4Var = objB instanceof mr4 ? (mr4) objB : null;
                w23 w23Var = rr4Var.b().d.get(i2);
                mr4 mr4Var2 = w23Var instanceof mr4 ? (mr4) w23Var : null;
                if (mr4Var2 != null) {
                    mr4 mr4VarA = mr4Var != null ? mr4.a(mr4Var, !zBooleanValue) : null;
                    mr4 mr4VarA2 = mr4.a(mr4Var2, zBooleanValue);
                    ArrayList arrayList = new ArrayList(rr4Var.b().d);
                    if (mr4VarA != null) {
                        arrayList.set(i, mr4VarA);
                    }
                    arrayList.set(i2, mr4VarA2);
                    boolean z = rr4Var.J.b() != null || zBooleanValue;
                    rr4Var.e(new pq4.c(arrayList));
                    rr4Var.e(new pq4.i(z));
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements oh4<Integer, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Integer num) {
            int iIntValue = num.intValue();
            rr4 rr4Var = (rr4) this.receiver;
            if (rr4Var.b().f && !rr4Var.b().a && !rr4Var.b().e && iIntValue + 5 >= rr4Var.b().d.size()) {
                oy0.d(rhb.b(rr4Var), null, null, new tr4(rr4Var, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<wq4, oz2> {
        @Override // defpackage.oh4
        public final oz2 invoke(wq4 wq4Var) {
            wq4 wq4Var2 = wq4Var;
            wq4Var2.getClass();
            return oz2.bind(wq4Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<androidx.fragment.app.f> {
        public e() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return wq4.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? wq4.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public wq4() {
        ss5 ss5VarC = hv5.c(j26.u, new f(new e()));
        this.Q = new shb(ll8.a(rr4.class), new g(ss5VarC), new i(ss5VarC), new h(ss5VarC));
        this.R = true;
        this.S = new o7a(new xf1(1, this));
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_gym_location_filter, viewGroup);
    }

    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        w().E.e(getViewLifecycleOwner(), new zq4(new ar4(new er4(v().g, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        w().I.e(getViewLifecycleOwner(), new zq4(new br4(v().b)));
        yq6 yq6Var = w().D;
        o7a o7aVar = this.S;
        yq6Var.e(getViewLifecycleOwner(), new zq4(new cr4((qq4) o7aVar.getValue())));
        w().F.e(getViewLifecycleOwner(), new zq4(new dr4(this)));
        int i2 = 1;
        w().G.e(getViewLifecycleOwner(), new zq4(new ik3(i2, v().h)));
        w().H.e(getViewLifecycleOwner(), new zq4(new jk3(i2, v().e)));
        rr4 rr4VarW = w();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        rr4VarW.c(viewLifecycleOwner, new tq4(0, this));
        oz2 oz2VarV = v();
        MaterialToolbar materialToolbar = oz2VarV.h;
        ConstraintLayout constraintLayout = oz2VarV.a;
        constraintLayout.getClass();
        xgb.g(materialToolbar, R.drawable.ic_close_results_dialog, constraintLayout.getContext().getColor(R.color.colorPrimary));
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: uq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                wq4.a aVar = wq4.Companion;
                this.t.i();
            }
        });
        final oz2 oz2VarV2 = v();
        oz2VarV2.a.post(new Runnable() { // from class: vq4
            @Override // java.lang.Runnable
            public final void run() {
                wq4.a aVar = wq4.Companion;
                ConstraintLayout constraintLayout2 = oz2VarV2.a;
                constraintLayout2.getClass();
                int dimension = (int) constraintLayout2.getResources().getDimension(R.dimen.bottom_sheet_top_padding);
                wq4 wq4Var = this;
                wq4Var.p().K(wq4Var.v().a.getHeight() + dimension);
            }
        });
        RecyclerView recyclerView = oz2VarV2.d;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter((qq4) o7aVar.getValue());
        Drawable drawable = requireContext().getDrawable(R.drawable.common_divider);
        if (drawable == null) {
            z90.a("Required value was null.");
            return;
        }
        recyclerView.h(new feb(drawable, (int) getResources().getDimension(R.dimen.default_margin), (int) getResources().getDimension(R.dimen.default_margin)));
        oz2 oz2VarV3 = v();
        xgb.a(oz2VarV3.b, new xq4(this, null));
        xgb.a(oz2VarV3.c, new yq4(this, null));
    }

    @Override // defpackage.zj0
    public final boolean r() {
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final oz2 v() {
        T tA = this.P.a(this, T[0]);
        tA.getClass();
        return (oz2) tA;
    }

    public final rr4 w() {
        return (rr4) this.Q.getValue();
    }
}
