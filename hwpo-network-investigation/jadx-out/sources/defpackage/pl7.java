package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pl7 extends vx4 {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(pl7.class, "binding", "getBinding()Lcom/hwpo_training_app/report/databinding/FragmentOtherReasonBinding;", 0)};
    public static final a Companion = new a();
    public final vg4 A = new vg4(new d());
    public final shb B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.report.presentation.other_reason.OtherReasonFragment$initListeners$1$3", f = "OtherReasonFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public final /* synthetic */ if4 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(if4 if4Var, r02<? super b> r02Var) {
            super(3, r02Var);
            this.u = if4Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return pl7.this.new b(this.u, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = pl7.Companion;
            wl7 wl7VarQ = pl7.this.q();
            oy0.d(rhb.b(wl7VarQ), null, null, new vl7(wl7VarQ, String.valueOf(this.u.c.getText()), null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<pl7, if4> {
        @Override // defpackage.oh4
        public final if4 invoke(pl7 pl7Var) {
            pl7 pl7Var2 = pl7Var;
            pl7Var2.getClass();
            return if4.bind(pl7Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<androidx.fragment.app.f> {
        public e() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return pl7.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? pl7.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public pl7() {
        ss5 ss5VarC = hv5.c(j26.u, new f(new e()));
        this.B = new shb(ll8.a(wl7.class), new g(ss5VarC), new i(ss5VarC), new h(ss5VarC));
    }

    @Override // defpackage.hk0
    public final void i() {
        if4 if4VarP = p();
        if4VarP.c.addTextChangedListener(new c(if4VarP, this));
        if4VarP.f.setNavigationOnClickListener(new View.OnClickListener() { // from class: ol7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pl7.a aVar = pl7.Companion;
                this.t.q().x.a();
            }
        });
        xgb.a(if4VarP.b, new b(if4VarP, null));
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        int i2 = 0;
        p().d.setText(getString(R.string.note_symbols_count, 0));
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new ml7(), view2);
            g2b g2bVar = g2b.a;
        }
        q().E.e(getViewLifecycleOwner(), new ql7(new rl7(new tl7(p().e, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        q().F.e(getViewLifecycleOwner(), new ql7(new sl7(this)));
        wl7 wl7VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        wl7VarQ.c(viewLifecycleOwner, new nl7(i2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final if4 p() {
        return (if4) this.A.a(this, C[0]);
    }

    public final wl7 q() {
        return (wl7) this.B.getValue();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements TextWatcher {
        public final /* synthetic */ if4 t;
        public final /* synthetic */ pl7 u;

        public c(if4 if4Var, pl7 pl7Var) {
            this.t = if4Var;
            this.u = pl7Var;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int length = editable != null ? editable.length() : 0;
            MaterialTextView materialTextView = this.t.d;
            Object[] objArr = {Integer.valueOf(length)};
            pl7 pl7Var = this.u;
            materialTextView.setText(pl7Var.getString(R.string.note_symbols_count, objArr));
            pl7Var.q().e(new ll7.a(length > 0));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
