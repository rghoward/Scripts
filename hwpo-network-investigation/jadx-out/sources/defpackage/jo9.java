package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jo9 extends iy4 {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(jo9.class, "binding", "getBinding()Lcom/hwpo_training_app/onboarding/databinding/FragmentSignInBinding;", 0)};
    public final vg4 A = new vg4(new d());
    public final shb B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.sign_in.SignInFragment$initListeners$1$1", f = "SignInFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public final /* synthetic */ wf4 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wf4 wf4Var, r02<? super a> r02Var) {
            super(3, r02Var);
            this.u = wf4Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return jo9.this.new a(this.u, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            ho5<Object>[] ho5VarArr = jo9.C;
            qo9 qo9VarQ = jo9.this.q();
            wf4 wf4Var = this.u;
            oy0.d(rhb.b(qo9VarQ), null, null, new yo9(qo9VarQ, String.valueOf(wf4Var.b.getText()), String.valueOf(wf4Var.f.getText()), null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.sign_in.SignInFragment$initListeners$1$2", f = "SignInFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return jo9.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            ho5<Object>[] ho5VarArr = jo9.C;
            jo9.this.q().y.e();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.sign_in.SignInFragment$initListeners$1$3", f = "SignInFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public c(r02<? super c> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return jo9.this.new c(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            ho5<Object>[] ho5VarArr = jo9.C;
            jo9.this.q().y.f();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<jo9, wf4> {
        @Override // defpackage.oh4
        public final wf4 invoke(jo9 jo9Var) {
            jo9 jo9Var2 = jo9Var;
            jo9Var2.getClass();
            return wf4.bind(jo9Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<androidx.fragment.app.f> {
        public e() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return jo9.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? jo9.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public jo9() {
        ss5 ss5VarC = hv5.c(j26.u, new f(new e()));
        this.B = new shb(ll8.a(qo9.class), new g(ss5VarC), new i(ss5VarC), new h(ss5VarC));
    }

    @Override // defpackage.hk0
    public final void i() {
        wf4 wf4VarP = p();
        qo9 qo9VarQ = q();
        r54 r54VarD = xgb.d(wf4VarP.b);
        r54 r54VarD2 = xgb.d(wf4VarP.f);
        r54VarD.getClass();
        r54VarD2.getClass();
        oy0.d(rhb.b(qo9VarQ), null, null, new zo9(qo9VarQ, r54VarD, r54VarD2, null), 3);
        xgb.a(wf4VarP.i, new a(wf4VarP, null));
        xgb.a(wf4VarP.c, new b(null));
        xgb.a(wf4VarP.e, new c(null));
    }

    @Override // defpackage.hk0
    public final void j() {
        q().y.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ee5.a(new gi4() { // from class: io9
            @Override // defpackage.gi4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                View view2 = (View) obj4;
                ho5<Object>[] ho5VarArr = jo9.C;
                view2.getClass();
                int i2 = ((ec5) obj5).d;
                int i3 = iIntValue == 0 ? iIntValue2 + i2 : iIntValue + i2;
                jo9 jo9Var = this.t;
                if (iIntValue == 0) {
                    LinearLayoutCompat linearLayoutCompat = jo9Var.p().d;
                    linearLayoutCompat.setPadding(linearLayoutCompat.getPaddingLeft(), iIntValue3, linearLayoutCompat.getPaddingRight(), i3);
                } else {
                    LinearLayoutCompat linearLayoutCompat2 = jo9Var.p().d;
                    linearLayoutCompat2.setPadding(linearLayoutCompat2.getPaddingLeft(), iIntValue3, linearLayoutCompat2.getPaddingRight(), 0);
                }
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    ac4.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = iIntValue;
                view2.setLayoutParams(marginLayoutParams);
                return g2b.a;
            }
        }, p().h);
        int i2 = 1;
        q().F.e(getViewLifecycleOwner(), new ko9(new ti3(this, i2)));
        q().G.e(getViewLifecycleOwner(), new ko9(new lo9(this)));
        qo9 qo9VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qo9VarQ.c(viewLifecycleOwner, new su5(i2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wf4 p() {
        return (wf4) this.A.a(this, C[0]);
    }

    public final qo9 q() {
        return (qo9) this.B.getValue();
    }
}
