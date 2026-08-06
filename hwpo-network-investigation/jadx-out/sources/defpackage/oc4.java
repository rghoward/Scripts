package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class oc4 extends mx4 {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(oc4.class, "binding", "getBinding()Lcom/hwpo_training_app/onboarding/databinding/FragmentForgotPasswordBinding;", 0)};
    public final vg4 A = new vg4(new d());
    public final shb B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.forgot_password.ForgotPasswordFragment$initListeners$1$1", f = "ForgotPasswordFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public final /* synthetic */ se4 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(se4 se4Var, r02<? super a> r02Var) {
            super(3, r02Var);
            this.u = se4Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return oc4.this.new a(this.u, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            ho5<Object>[] ho5VarArr = oc4.C;
            bd4 bd4VarQ = oc4.this.q();
            oy0.d(rhb.b(bd4VarQ), null, null, new xc4(bd4VarQ, String.valueOf(this.u.d.getText()), null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.forgot_password.ForgotPasswordFragment$initListeners$1$2", f = "ForgotPasswordFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return oc4.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            oc4.this.j();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.forgot_password.ForgotPasswordFragment$initListeners$1$3", f = "ForgotPasswordFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public c(r02<? super c> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return oc4.this.new c(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            oc4.this.j();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<oc4, se4> {
        @Override // defpackage.oh4
        public final se4 invoke(oc4 oc4Var) {
            oc4 oc4Var2 = oc4Var;
            oc4Var2.getClass();
            return se4.bind(oc4Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<androidx.fragment.app.f> {
        public e() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return oc4.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? oc4.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public oc4() {
        ss5 ss5VarC = hv5.c(j26.u, new f(new e()));
        this.B = new shb(ll8.a(bd4.class), new g(ss5VarC), new i(ss5VarC), new h(ss5VarC));
    }

    @Override // defpackage.hk0
    public final void i() {
        se4 se4VarP = p();
        bd4 bd4VarQ = q();
        r54 r54VarD = xgb.d(se4VarP.d);
        r54VarD.getClass();
        oy0.d(rhb.b(bd4VarQ), null, null, new zc4(bd4VarQ, r54VarD, null), 3);
        xgb.a(se4VarP.g, new a(se4VarP, null));
        xgb.a(se4VarP.c, new b(null));
        xgb.a(se4VarP.b, new c(null));
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ee5.a(new gi4() { // from class: nc4
            @Override // defpackage.gi4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                View view2 = (View) obj4;
                ho5<Object>[] ho5VarArr = oc4.C;
                view2.getClass();
                int i2 = ((ec5) obj5).d;
                int i3 = iIntValue == 0 ? iIntValue2 + i2 : iIntValue + i2;
                oc4 oc4Var = this.t;
                if (iIntValue == 0) {
                    LinearLayoutCompat linearLayoutCompat = oc4Var.p().e;
                    linearLayoutCompat.setPadding(linearLayoutCompat.getPaddingLeft(), iIntValue3, linearLayoutCompat.getPaddingRight(), i3);
                } else {
                    LinearLayoutCompat linearLayoutCompat2 = oc4Var.p().e;
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
                MaterialButton materialButton = oc4Var.p().b;
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 == null) {
                    ac4.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = iIntValue3;
                materialButton.setLayoutParams(marginLayoutParams2);
                return g2b.a;
            }
        }, p().h);
        q().A.e(getViewLifecycleOwner(), new pc4(new qc4(this, 0)));
        q().B.e(getViewLifecycleOwner(), new pc4(new rc4(this, 0)));
        bd4 bd4VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        bd4VarQ.c(viewLifecycleOwner, new t62(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final se4 p() {
        return (se4) this.A.a(this, C[0]);
    }

    public final bd4 q() {
        return (bd4) this.B.getValue();
    }
}
