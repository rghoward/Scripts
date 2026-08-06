package defpackage;

import android.animation.LayoutTransition;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qf extends zw4 {
    public final vg4 A = new vg4(new h());
    public final shb B;
    public final o7a C;
    public static final /* synthetic */ ho5<Object>[] D = {new ne8(qf.class, "binding", "getBinding()Lcom/hwpo_training_app/affiliated_gym/databinding/FragmentAffilatedGymsListBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g31.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements ci4<Integer, Boolean, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(Integer num, Boolean bool) {
            int iIntValue = num.intValue();
            boolean zBooleanValue = bool.booleanValue();
            pg pgVar = (pg) this.receiver;
            Iterator<u23> it = pgVar.b().a.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                u23 next = it.next();
                if ((next instanceof fh) && ((fh) next).d) {
                    break;
                }
                i2++;
            }
            Iterator<u23> it2 = pgVar.b().a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                u23 next2 = it2.next();
                if ((next2 instanceof fh) && ((fh) next2).a == iIntValue) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                Object objB = th1.B(i2, pgVar.b().a);
                fh fhVar = objB instanceof fh ? (fh) objB : null;
                u23 u23Var = pgVar.b().a.get(i);
                fh fhVar2 = u23Var instanceof fh ? (fh) u23Var : null;
                if (fhVar2 != null) {
                    fh fhVarA = fhVar != null ? fh.a(fhVar, !zBooleanValue) : null;
                    fh fhVarA2 = fh.a(fhVar2, zBooleanValue);
                    ArrayList arrayList = new ArrayList(pgVar.b().a);
                    if (fhVarA != null) {
                        arrayList.set(i2, fhVarA);
                    }
                    arrayList.set(i, fhVarA2);
                    pgVar.e(new ef.d(arrayList));
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements oh4<Integer, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Integer num) {
            int iIntValue = num.intValue();
            pg pgVar = (pg) this.receiver;
            if (pgVar.b().g && !pgVar.b().e && !pgVar.b().f && iIntValue + 5 >= pgVar.b().a.size()) {
                oy0.d(rhb.b(pgVar), null, null, new tg(pgVar, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.list.AffiliatedGymListFragment$initListeners$1$1", f = "AffiliatedGymListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public e(r02<? super e> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return qf.this.new e(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = qf.Companion;
            pg pgVarS = qf.this.s();
            is4 is4Var = (is4) pgVarS.K.getValue();
            oq4.b bVar = pgVarS.b().c;
            String str = bVar != null ? bVar.t : null;
            oq4.a aVar2 = pgVarS.b().d;
            Integer numValueOf = aVar2 != null ? Integer.valueOf(aVar2.t) : null;
            oq4.a aVar3 = pgVarS.b().d;
            is4Var.c(str, aVar3 != null ? aVar3.u : null, numValueOf);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.list.AffiliatedGymListFragment$initListeners$1$2", f = "AffiliatedGymListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public f(r02<? super f> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return qf.this.new f(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object next;
            dv8.b(obj);
            a aVar = qf.Companion;
            pg pgVarS = qf.this.s();
            List<u23> list = pgVarS.b().a;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof fh) {
                    arrayList.add(obj3);
                }
            }
            int size = arrayList.size();
            int i = 0;
            do {
                if (i >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i);
                i++;
            } while (!((fh) obj2).d);
            fh fhVar = (fh) obj2;
            if (fhVar != null) {
                int i2 = fhVar.a;
                Iterator<T> it = pgVarS.b().b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((yp4.a) next).t != i2);
                yp4.a aVar2 = (yp4.a) next;
                if (aVar2 != null) {
                    int iOrdinal = ((g31) pgVarS.J.getValue()).ordinal();
                    if (iOrdinal == 0) {
                        oy0.d(rhb.b(pgVarS), null, null, new ah(pgVarS, aVar2, null), 3);
                    } else {
                        if (iOrdinal != 1) {
                            u.b();
                            return null;
                        }
                        pgVarS.f(new hf(aVar2.t, aVar2.u));
                        ((is4) pgVarS.K.getValue()).a();
                    }
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.list.AffiliatedGymListFragment$initListeners$1$3", f = "AffiliatedGymListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public g(r02<? super g> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return qf.this.new g(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = qf.Companion;
            qf.this.s().f(gf.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h implements oh4<qf, ge4> {
        @Override // defpackage.oh4
        public final ge4 invoke(qf qfVar) {
            qf qfVar2 = qfVar;
            qfVar2.getClass();
            return ge4.bind(qfVar2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i extends wp5 implements mh4<androidx.fragment.app.f> {
        public i() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return qf.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j extends wp5 implements mh4<whb> {
        public final /* synthetic */ i u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.u = iVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ss5 ss5Var) {
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
    public static final class m extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? qf.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public qf() {
        ss5 ss5VarC = hv5.c(j26.u, new j(new i()));
        this.B = new shb(ll8.a(pg.class), new k(ss5VarC), new m(ss5VarC), new l(ss5VarC));
        this.C = new o7a(new mh4() { // from class: kf
            @Override // defpackage.mh4
            public final Object invoke() {
                qf.a aVar = qf.Companion;
                qf qfVar = this.t;
                return new ff(new qf.c(2, qfVar.s(), pg.class, "onItemCheckedChanged", "onItemCheckedChanged(IZ)V", 0), new qf.d(1, qfVar.s(), pg.class, "onItemShown", "onItemShown(I)V", 0));
            }
        });
    }

    public static void p(qf qfVar, String str, Bundle bundle) {
        Parcelable parcelable;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundle.getParcelable("com.hwpo_training_app.affilated_gym.filters.screen.AffilatedGymFilterFragment.GYM_FILTER_RESULT_KEY", re.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("com.hwpo_training_app.affilated_gym.filters.screen.AffilatedGymFilterFragment.GYM_FILTER_RESULT_KEY");
            if (!(parcelable2 instanceof re)) {
                parcelable2 = null;
            }
            parcelable = (re) parcelable2;
        }
        re reVar = (re) parcelable;
        if (reVar != null) {
            pg pgVarS = qfVar.s();
            pgVarS.e(new ef.k(reVar.t, reVar.u));
            oy0.d(rhb.b(pgVarS), null, null, new sg(pgVarS, null), 3);
        }
    }

    @Override // defpackage.hk0
    public final void i() {
        ge4 ge4VarQ = q();
        xgb.a(ge4VarQ.c, new e(null));
        xgb.a(ge4VarQ.f, new f(null));
        xgb.a(ge4VarQ.b, new g(null));
        ge4VarQ.i.setNavigationOnClickListener(new View.OnClickListener() { // from class: nf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qf.a aVar = qf.Companion;
                ((is4) this.t.s().K.getValue()).a();
            }
        });
        pg pgVarS = s();
        r54<String> textChangesFlow = q().g.getTextChangesFlow();
        textChangesFlow.getClass();
        yk2.o(new k74(yk2.h(new qg(yk2.i(textChangesFlow)), 250L), new rg(2, pgVarS, pg.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 4)), rhb.b(pgVarS));
        getParentFragmentManager().f0("com.hwpo_training_app.affilated_gym.filters.screen.AffilatedGymFilterFragment.GYM_FILTER_REQUEST_KEY", getViewLifecycleOwner(), new of(this));
    }

    @Override // defpackage.hk0
    public final void j() {
        ((is4) s().K.getValue()).a();
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MaterialToolbar materialToolbar;
        int iB;
        layoutInflater.getClass();
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (viewOnCreateView == null || (materialToolbar = (MaterialToolbar) viewOnCreateView.findViewById(R.id.toolbar)) == null) {
            return viewOnCreateView;
        }
        ViewGroup.LayoutParams layoutParams = materialToolbar.getLayoutParams();
        if (layoutParams == null) {
            ac4.c("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return null;
        }
        g31 g31VarR = r();
        int i2 = g31VarR == null ? -1 : b.a[g31VarR.ordinal()];
        if (i2 == -1) {
            iB = layoutParams.height;
        } else if (i2 == 1) {
            iB = wk6.b(getResources().getDimension(R.dimen.toolbar_custom_size));
        } else {
            if (i2 != 2) {
                u.b();
                return null;
            }
            iB = wk6.b(getResources().getDimension(R.dimen.bottom_dialog_toolbar_custom_size));
        }
        layoutParams.height = iB;
        materialToolbar.setLayoutParams(layoutParams);
        return viewOnCreateView;
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (r() == g31.t && (view2 = getView()) != null) {
            ee5.a(new pf(), view2);
        }
        RecyclerView recyclerView = q().j;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter((ff) this.C.getValue());
        int dimension = (int) recyclerView.getResources().getDimension(R.dimen.default_margin);
        int dimension2 = (int) recyclerView.getResources().getDimension(R.dimen.default_margin);
        Drawable drawable = requireContext().getDrawable(R.drawable.common_divider);
        if (drawable == null) {
            z90.a("Required value was null.");
            return;
        }
        recyclerView.h(new feb(drawable, dimension, dimension2));
        pg pgVarS = s();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        int i2 = 0;
        pgVarS.c(viewLifecycleOwner, new mf(i2, this));
        s().F.e(getViewLifecycleOwner(), new rf(new sf(this, i2)));
        s().E.e(getViewLifecycleOwner(), new rf(new tf(i2, new yf(q().e, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        s().I.e(getViewLifecycleOwner(), new rf(new uf(i2, q().f)));
        s().H.e(getViewLifecycleOwner(), new rf(new vf(new zf(q().c, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        s().G.e(getViewLifecycleOwner(), new rf(new wf(i2, new ag(q().b, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        s().D.e(getViewLifecycleOwner(), new rf(new xf(i2, this)));
        LayoutTransition layoutTransition = q().h.getLayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        layoutTransition.enableTransitionType(2);
        layoutTransition.enableTransitionType(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ge4 q() {
        return (ge4) this.A.a(this, D[0]);
    }

    public final g31 r() {
        Object serializable;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = arguments.getSerializable("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.CAME_FOM_KEY", g31.class);
        } else {
            Object serializable2 = arguments.getSerializable("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.CAME_FOM_KEY");
            serializable = (g31) (serializable2 instanceof g31 ? serializable2 : null);
        }
        return (g31) serializable;
    }

    public final pg s() {
        return (pg) this.B.getValue();
    }
}
