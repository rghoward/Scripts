package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SearchEditText;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xb extends xw4 {
    public final vg4 A = new vg4(new e());
    public final shb B;
    public final o7a C;
    public static final /* synthetic */ ho5<Object>[] D = {new ne8(xb.class, "binding", "getBinding()Lcom/hwpo_training_app/tracking/databinding/FragmentAddValueBinding;", 0)};
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
            gd gdVar = (gd) this.receiver;
            Iterator<t23> it = gdVar.b().e.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                t23 next = it.next();
                if ((next instanceof rc) && ((rc) next).c) {
                    break;
                }
                i2++;
            }
            Iterator<t23> it2 = gdVar.b().e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                t23 next2 = it2.next();
                if ((next2 instanceof rc) && ((rc) next2).a == iIntValue) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                Object objB = th1.B(i2, gdVar.b().e);
                rc rcVar = objB instanceof rc ? (rc) objB : null;
                t23 t23Var = gdVar.b().e.get(i);
                rc rcVar2 = t23Var instanceof rc ? (rc) t23Var : null;
                if (rcVar2 != null) {
                    rc rcVarA = rcVar != null ? rc.a(rcVar, !zBooleanValue) : null;
                    rc rcVarA2 = rc.a(rcVar2, zBooleanValue);
                    ArrayList arrayList = new ArrayList(gdVar.b().e);
                    if (rcVarA != null) {
                        arrayList.set(i2, rcVarA);
                    }
                    arrayList.set(i, rcVarA2);
                    gdVar.e(new pb.c(arrayList));
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
            gd gdVar = (gd) this.receiver;
            if (gdVar.b().i && !gdVar.b().g && !gdVar.b().h && iIntValue + 5 >= gdVar.b().e.size()) {
                oy0.d(rhb.b(gdVar), null, null, new kd(gdVar, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.add_value.AddValueFragment$initListeners$1$1", f = "AddValueFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public d(r02<? super d> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return xb.this.new d(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object next;
            dv8.b(obj);
            a aVar = xb.Companion;
            gd gdVarQ = xb.this.q();
            Iterator<T> it = gdVarQ.b().e.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                t23 t23Var = (t23) next;
                if ((t23Var instanceof rc) && ((rc) t23Var).c) {
                    break;
                }
            }
            rc rcVar = next instanceof rc ? (rc) next : null;
            if (rcVar != null) {
                for (Object obj3 : gdVarQ.b().f) {
                    if (((cbb) obj3).a == rcVar.a) {
                        obj2 = obj3;
                        break;
                    }
                }
                cbb cbbVar = (cbb) obj2;
                if (cbbVar != null) {
                    gdVarQ.x.e(cbbVar.a, cbbVar.b, cbbVar.d.ordinal(), cbbVar.c.ordinal(), gdVarQ.E.ordinal(), false);
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements oh4<xb, ee4> {
        @Override // defpackage.oh4
        public final ee4 invoke(xb xbVar) {
            xb xbVar2 = xbVar;
            xbVar2.getClass();
            return ee4.bind(xbVar2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<androidx.fragment.app.f> {
        public f() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return xb.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? xb.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public xb() {
        ss5 ss5VarC = hv5.c(j26.u, new g(new f()));
        this.B = new shb(ll8.a(gd.class), new h(ss5VarC), new j(ss5VarC), new i(ss5VarC));
        this.C = new o7a(new tb(0, this));
    }

    @Override // defpackage.hk0
    public final void i() {
        ee4 ee4VarP = p();
        xgb.a(ee4VarP.c, new d(null));
        ee4VarP.f.setNavigationOnClickListener(new View.OnClickListener() { // from class: sb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xb.a aVar = xb.Companion;
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
        RecyclerView recyclerView = p().h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        Drawable drawable = requireContext().getDrawable(R.drawable.common_divider);
        if (drawable == null) {
            z90.a("Required value was null.");
            return;
        }
        recyclerView.setAdapter((qb) this.C.getValue());
        recyclerView.h(new feb(drawable, 0, 0));
        gd gdVarQ = q();
        r54<String> textChangesFlow = p().b.getTextChangesFlow();
        textChangesFlow.getClass();
        yk2.o(new k74(yk2.h(new id(yk2.i(textChangesFlow)), 250L), new jd(2, gdVarQ, gd.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 4)), rhb.b(gdVarQ));
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new gi4() { // from class: ub
                @Override // defpackage.gi4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj).intValue();
                    int iIntValue2 = ((Integer) obj2).intValue();
                    int iIntValue3 = ((Integer) obj3).intValue();
                    View view3 = (View) obj4;
                    ec5 ec5Var = (ec5) obj5;
                    xb.a aVar = xb.Companion;
                    view3.getClass();
                    view3.setPadding(view3.getPaddingLeft(), ec5Var.b + iIntValue3, view3.getPaddingRight(), ec5Var.d + iIntValue2);
                    xb xbVar = this.t;
                    for (ViewGroup viewGroup : ws0.i(xbVar.p().d, xbVar.p().e)) {
                        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), iIntValue);
                    }
                    return g2b.a;
                }
            }, view2);
            g2b g2bVar = g2b.a;
        }
        gd gdVarQ2 = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        gdVarQ2.c(viewLifecycleOwner, new oh4() { // from class: wb
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                xb.a aVar = xb.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof rb) {
                    this.t.m(((rb) gm3Var).b);
                }
                return g2b.a;
            }
        });
        q().F.e(getViewLifecycleOwner(), new yb(new zb(this)));
        q().H.e(getViewLifecycleOwner(), new yb(new ac(this)));
        q().G.e(getViewLifecycleOwner(), new yb(new bc(new ic(p().e, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        q().J.e(getViewLifecycleOwner(), new yb(new cc(p().f)));
        q().K.e(getViewLifecycleOwner(), new yb(new dc(new jc(p().b, SearchEditText.class, "hint", "getHint()Ljava/lang/String;", 0))));
        q().L.e(getViewLifecycleOwner(), new yb(new ec(p().g)));
        q().I.e(getViewLifecycleOwner(), new yb(new fc(p().c)));
        q().M.e(getViewLifecycleOwner(), new yb(new gc(p().c)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ee4 p() {
        return (ee4) this.A.a(this, D[0]);
    }

    public final gd q() {
        return (gd) this.B.getValue();
    }
}
