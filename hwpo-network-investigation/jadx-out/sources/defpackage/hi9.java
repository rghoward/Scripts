package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import hi9.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hi9 extends gy4 {
    public wj9 A;
    public final vg4 B = new vg4(new l());
    public final shb C;
    public final o7a D;
    public final o7a E;
    public static final /* synthetic */ ho5<Object>[] F = {new ne8(hi9.class, "binding", "getBinding()Lcom/hwpo_training_app/sessions/databinding/FragmentSessionsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<fd8, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(fd8 fd8Var) {
            fd8 fd8Var2 = fd8Var;
            fd8Var2.getClass();
            lj9 lj9Var = (lj9) this.receiver;
            lj9Var.getClass();
            ri9 ri9Var = lj9Var.x;
            bc8 bc8Var = lj9Var.b().a;
            if (bc8Var != null) {
                ri9Var.s(bc8Var.t, fd8Var2.t, fd8Var2.v);
                return g2b.a;
            }
            z90.a("Required value was null.");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements ci4<Integer, Boolean, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(Integer num, Boolean bool) {
            int iIntValue = num.intValue();
            boolean zBooleanValue = bool.booleanValue();
            lj9 lj9Var = (lj9) this.receiver;
            lj9Var.getClass();
            if (zBooleanValue) {
                oy0.d(rhb.b(lj9Var), null, null, new vj9(lj9Var, iIntValue, null), 3);
            } else {
                oy0.d(rhb.b(lj9Var), null, null, new mj9(lj9Var, iIntValue, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements oh4<w60, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(w60 w60Var) {
            String str;
            w60 w60Var2 = w60Var;
            w60Var2.getClass();
            lj9 lj9Var = (lj9) this.receiver;
            ri9 ri9Var = lj9Var.x;
            w60.b bVar = w60Var2 instanceof w60.b ? (w60.b) w60Var2 : null;
            u60 u60Var = bVar != null ? bVar.c : null;
            int i = u60Var == null ? -1 : lj9.b.a[u60Var.ordinal()];
            if (i == 1) {
                String str2 = ((w60.b) w60Var2).g;
                if (str2 == null) {
                    str2 = BuildConfig.FLAVOR;
                }
                ri9Var.f(new String[]{str2}, 0);
            } else if (i == 2) {
                ri9Var.u(((w60.b) w60Var2).f);
            } else if (i == 3 && (str = ((w60.b) w60Var2).h) != null) {
                lj9Var.f(new atb(str));
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends pi4 implements oh4<String, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            str2.getClass();
            lj9 lj9Var = (lj9) this.receiver;
            lj9Var.getClass();
            lj9Var.f(new uh9(str2));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class f extends pi4 implements oh4<zpa, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(zpa zpaVar) {
            String str;
            zpa zpaVar2 = zpaVar;
            zpaVar2.getClass();
            lj9 lj9Var = (lj9) this.receiver;
            lj9Var.getClass();
            w60 w60Var = zpaVar2.w;
            ipa.b bVar = null;
            w60.b bVar2 = w60Var instanceof w60.b ? (w60.b) w60Var : null;
            if (bVar2 != null) {
                String str2 = bVar2.f;
                String str3 = bVar2.e;
                u60 u60Var = bVar2.c;
                if (lj9.b.a[u60Var.ordinal()] == 3) {
                    str = bVar2.h;
                    if (str == null) {
                        str = BuildConfig.FLAVOR;
                    }
                } else {
                    str = bVar2.g;
                    if (str == null) {
                        str = str2;
                    }
                }
                bVar = new ipa.b(str3, u60Var, str2, str);
            }
            lj9Var.x.k(new ipa(zpaVar2.u, zpaVar2.x, bVar));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class g extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            lj9 lj9Var = (lj9) this.receiver;
            bc8 bc8Var = lj9Var.b().a;
            if (bc8Var != null) {
                List<s23> list = bc8Var.A;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof r89) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    arrayList2.add(Integer.valueOf(((r89) obj2).a()));
                }
                List listT = th1.T(th1.W(arrayList2));
                bc8 bc8Var2 = lj9Var.b().a;
                if (bc8Var2 != null) {
                    ArrayList arrayList3 = bc8Var2.u.w;
                    ArrayList arrayList4 = new ArrayList();
                    int size2 = arrayList3.size();
                    while (i < size2) {
                        Object obj3 = arrayList3.get(i);
                        i++;
                        h08 h08Var = (h08) obj3;
                        if (listT.contains(Integer.valueOf(h08Var.t)) || h08Var.v) {
                            arrayList4.add(obj3);
                        }
                    }
                    lj9Var.f(new xh9(arrayList4));
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsFragment$initListeners$1$2", f = "SessionsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public h(r02<? super h> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return hi9.this.new h(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Integer num;
            dv8.b(obj);
            a aVar = hi9.Companion;
            lj9 lj9VarQ = hi9.this.q();
            bc8 bc8Var = lj9VarQ.b().a;
            if (bc8Var != null && (num = bc8Var.u.t) != null) {
                lj9VarQ.x.n(num.intValue());
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsFragment$initListeners$1$3", f = "SessionsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public i(r02<? super i> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return hi9.this.new i(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = hi9.Companion;
            hi9.this.q().f(zh9.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsFragment$initListeners$1$4", f = "SessionsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public j(r02<? super j> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return hi9.this.new j(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = hi9.Companion;
            hi9.this.q().f(yh9.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l implements oh4<hi9, uf4> {
        @Override // defpackage.oh4
        public final uf4 invoke(hi9 hi9Var) {
            hi9 hi9Var2 = hi9Var;
            hi9Var2.getClass();
            return uf4.bind(hi9Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m extends wp5 implements mh4<androidx.fragment.app.f> {
        public m() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return hi9.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n extends wp5 implements mh4<whb> {
        public final /* synthetic */ m u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.u = mVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class p extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ss5 ss5Var) {
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

    public hi9() {
        mh4 mh4Var = new mh4() { // from class: ei9
            @Override // defpackage.mh4
            public final Object invoke() {
                hi9 hi9Var = this.t;
                wj9 wj9Var = hi9Var.A;
                if (wj9Var == null) {
                    xj5.e("viewModelFactory");
                    throw null;
                }
                whb parentFragment = hi9Var.getParentFragment();
                iy8 iy8Var = parentFragment instanceof iy8 ? (iy8) parentFragment : null;
                wj9Var.p = iy8Var != null ? iy8Var.e() : null;
                return wj9Var;
            }
        };
        ss5 ss5VarC = hv5.c(j26.u, new n(new m()));
        this.C = new shb(ll8.a(lj9.class), new o(ss5VarC), mh4Var, new p(ss5VarC));
        this.D = new o7a(new mh4() { // from class: fi9
            @Override // defpackage.mh4
            public final Object invoke() {
                hi9.a aVar = hi9.Companion;
                return this.t.new k();
            }
        });
        this.E = new o7a(new mh4() { // from class: gi9
            @Override // defpackage.mh4
            public final Object invoke() {
                hi9.a aVar = hi9.Companion;
                hi9 hi9Var = this.t;
                hi9.b bVar = new hi9.b(1, hi9Var.q(), lj9.class, "onSessionClick", "onSessionClick(Lcom/hwpo_training_app/core/presentation/entity/program/ProgramSection;)V", 0);
                final hi9.c cVar = new hi9.c(2, hi9Var.q(), lj9.class, "onCompleteBtnClick", "onCompleteBtnClick(IZ)V", 0);
                final hi9.d dVar = new hi9.d(1, hi9Var.q(), lj9.class, "onAttachmentClick", "onAttachmentClick(Lcom/hwpo_training_app/core/presentation/entity/AttachmentUiEntity;)V", 0);
                final hi9.e eVar = new hi9.e(1, hi9Var.q(), lj9.class, "onGoWodClick", "onGoWodClick(Ljava/lang/String;)V", 0);
                final hi9.f fVar = new hi9.f(1, hi9Var.q(), lj9.class, "onShowDetailsClick", "onShowDetailsClick(Lcom/hwpo_training_app/core/presentation/entity/program/TodayTips;)V", 0);
                final hi9.g gVar = new hi9.g(0, hi9Var.q(), lj9.class, "showOptionsClicked", "showOptionsClicked()V", 0);
                return new oh9(new oh9.a(), new e93(new on4(), new qn4(3), new oh4() { // from class: pn4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ya yaVar = (ya) obj;
                        yaVar.getClass();
                        w96 w96Var = (w96) yaVar.u;
                        ConstraintLayout constraintLayout = w96Var.a;
                        constraintLayout.getClass();
                        xgb.a(constraintLayout, new sn4(eVar, yaVar, null));
                        xgb.a(w96Var.b, new tn4(cVar, yaVar, null));
                        yaVar.s(new wo0(1, yaVar));
                        return g2b.a;
                    }
                }, rn4.u), new e93(new je9(), new me9(3), new ke9(bVar, cVar, 0), ne9.u), new e93(new jk1(1), new mk1(3, 1), new oh4() { // from class: aqa
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        final ya yaVar = (ya) obj;
                        yaVar.getClass();
                        xgb.a(((pa6) yaVar.u).c, new cqa(yaVar, dVar, null));
                        final hi9.f fVar2 = fVar;
                        yaVar.s(new oh4() { // from class: bqa
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                ((List) obj2).getClass();
                                ya yaVar2 = yaVar;
                                pa6 pa6Var = (pa6) yaVar2.u;
                                MaterialTextView materialTextView = pa6Var.g;
                                ShapeableImageView shapeableImageView = pa6Var.c;
                                materialTextView.setText(((zpa) yaVar2.t()).u);
                                MaterialTextView materialTextView2 = pa6Var.e;
                                ek7.a(materialTextView2, new eqa(materialTextView2, pa6Var, fVar2, yaVar2));
                                materialTextView2.setVisibility(!z2a.w(((zpa) yaVar2.t()).x) ? 0 : 8);
                                materialTextView2.setText(Html.fromHtml(((zpa) yaVar2.t()).x, 63));
                                shapeableImageView.setVisibility(((zpa) yaVar2.t()).w instanceof w60.b ? 0 : 8);
                                w60 w60Var = ((zpa) yaVar2.t()).w;
                                w60.b bVar2 = w60Var instanceof w60.b ? (w60.b) w60Var : null;
                                e85.b(shapeableImageView, bVar2 != null ? bVar2.e : null, 0, false);
                                w60 w60Var2 = ((zpa) yaVar2.t()).w;
                                w60.b bVar3 = w60Var2 instanceof w60.b ? (w60.b) w60Var2 : null;
                                u60 u60Var = bVar3 != null ? bVar3.c : null;
                                pa6Var.b.setVisibility((u60Var == u60.u || u60Var == u60.t) ? 0 : 8);
                                return g2b.a;
                            }
                        });
                        return g2b.a;
                    }
                }, nk1.w), new e93(new nk7(), new pk7(3), new oh4() { // from class: ok7
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ya yaVar = (ya) obj;
                        yaVar.getClass();
                        xgb.a(((ha6) yaVar.u).b, new qk7(gVar, null));
                        yaVar.s(new vy5(2, yaVar));
                        return g2b.a;
                    }
                }, i33.w));
            }
        });
    }

    @Override // defpackage.hk0
    public final void i() {
        uf4 uf4VarP = p();
        uf4VarP.h.setNavigationOnClickListener(new View.OnClickListener() { // from class: ci9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi9.a aVar = hi9.Companion;
                this.t.q().x.a();
            }
        });
        xgb.a(uf4VarP.f, new h(null));
        xgb.a(uf4VarP.d, new i(null));
        xgb.a(uf4VarP.b, new j(null));
        getLifecycle().a(q());
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new di9(), view2);
            g2b g2bVar = g2b.a;
        }
        RecyclerView recyclerView = p().g;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter((oh9) this.E.getValue());
        recyclerView.setItemAnimator(null);
        int dimension = (int) recyclerView.getResources().getDimension(R.dimen.default_margin);
        recyclerView.h(new eeb(0, 0, dimension, dimension));
        uf4 uf4VarP = p();
        int i2 = 1;
        q().T.e(getViewLifecycleOwner(), new ii9(new y61(i2, p().h)));
        q().U.e(getViewLifecycleOwner(), new ii9(new z61(i2, p().h)));
        q().N.e(getViewLifecycleOwner(), new ii9(new mi9(this)));
        q().O.e(getViewLifecycleOwner(), new ii9(new sf(this, i2)));
        q().Q.e(getViewLifecycleOwner(), new ii9(new tf(i2, this)));
        q().P.e(getViewLifecycleOwner(), new ii9(new uf(1, new ki9(uf4VarP.f, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        q().Q.e(getViewLifecycleOwner(), new ii9(new ni9(uf4VarP, this)));
        q().R.e(getViewLifecycleOwner(), new ii9(new wf(1, uf4VarP)));
        q().S.e(getViewLifecycleOwner(), new ii9(new xf(1, uf4VarP)));
        lj9 lj9VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        lj9VarQ.c(viewLifecycleOwner, new cl0(2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final uf4 p() {
        return (uf4) this.B.a(this, F[0]);
    }

    public final lj9 q() {
        return (lj9) this.C.getValue();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k implements Animation.AnimationListener {
        public k() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            a aVar = hi9.Companion;
            RecyclerView.e0 e0VarH = hi9.this.p().g.H(0);
            ya yaVar = e0VarH instanceof ya ? (ya) e0VarH : null;
            if ((yaVar != null ? yaVar.t() : null) instanceof h08) {
                yaVar.a.clearAnimation();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }
}
