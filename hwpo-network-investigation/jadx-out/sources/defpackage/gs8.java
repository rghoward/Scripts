package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gs8 extends ey4 {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(gs8.class, "binding", "getBinding()Lcom/hwpo_training_app/reschedule/databinding/FragmentRescheduleBinding;", 0)};
    public static final a Companion = new a();
    public final vg4 A = new vg4(new d());
    public final shb B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.reschedule.presentation.RescheduleFragment$initListeners$1$3", f = "RescheduleFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return gs8.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = gs8.Companion;
            ct8 ct8VarQ = gs8.this.q();
            oy0.d(rhb.b(ct8VarQ), null, null, new bt8(ct8VarQ, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<gs8, of4> {
        @Override // defpackage.oh4
        public final of4 invoke(gs8 gs8Var) {
            gs8 gs8Var2 = gs8Var;
            gs8Var2.getClass();
            return of4.bind(gs8Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<androidx.fragment.app.f> {
        public e() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return gs8.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? gs8.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public gs8() {
        ss5 ss5VarC = hv5.c(j26.u, new f(new e()));
        this.B = new shb(ll8.a(ct8.class), new g(ss5VarC), new i(ss5VarC), new h(ss5VarC));
    }

    @Override // defpackage.hk0
    public final void i() {
        of4 of4VarP = p();
        of4VarP.j.setNavigationOnClickListener(new View.OnClickListener() { // from class: cs8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gs8.a aVar = gs8.Companion;
                this.t.j();
            }
        });
        TextInputEditText textInputEditText = of4VarP.e;
        textInputEditText.addTextChangedListener(new c());
        xgb.a(of4VarP.b, new b(null));
        qd3.a(textInputEditText, new int[]{6}, new oh4() { // from class: ds8
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                ((Integer) obj).getClass();
                gs8.a aVar = gs8.Companion;
                ct8 ct8VarQ = this.t.q();
                oy0.d(rhb.b(ct8VarQ), null, null, new bt8(ct8VarQ, null), 3);
                return g2b.a;
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
        ct8 ct8VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ct8VarQ.c(viewLifecycleOwner, new oh4() { // from class: fs8
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                gs8.a aVar = gs8.Companion;
                gm3Var.getClass();
                boolean z = gm3Var instanceof bs8.b;
                gs8 gs8Var = this.t;
                if (z) {
                    gs8Var.n(((bs8.b) gm3Var).b);
                } else if (gm3Var instanceof bs8.a) {
                    gs8Var.m(((bs8.a) gm3Var).b);
                }
                return g2b.a;
            }
        });
        q().E.e(getViewLifecycleOwner(), new hs8(new is8(p().i)));
        q().G.e(getViewLifecycleOwner(), new hs8(new js8(p().b)));
        q().H.e(getViewLifecycleOwner(), new hs8(new ks8(this)));
        q().F.e(getViewLifecycleOwner(), new hs8(new ls8(this)));
        q().I.e(getViewLifecycleOwner(), new hs8(new ms8(new ps8(p().h, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        q().J.e(getViewLifecycleOwner(), new hs8(new ns8(new qs8(p().c, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        q().K.e(getViewLifecycleOwner(), new hs8(new os8(this)));
        MaterialTextView materialTextView = p().k;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.what_day_would_you_like));
        String string = getString(R.string.day);
        string.getClass();
        z63.b(spannableStringBuilder, string);
        materialTextView.setText(spannableStringBuilder);
        i();
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new es8(), view2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final of4 p() {
        T tA = this.A.a(this, C[0]);
        tA.getClass();
        return (of4) tA;
    }

    public final ct8 q() {
        return (ct8) this.B.getValue();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Integer numValueOf;
            a aVar = gs8.Companion;
            ct8 ct8VarQ = gs8.this.q();
            try {
                numValueOf = Integer.valueOf(Integer.parseInt(String.valueOf(editable)));
            } catch (NumberFormatException unused) {
                numValueOf = null;
            }
            ct8VarQ.e(new yr8.f(numValueOf));
            if (numValueOf == null || numValueOf.intValue() <= ct8VarQ.b().c) {
                return;
            }
            ct8VarQ.e(new yr8.c(ct8VarQ.C.b(R.string.reschedule_error_message, Integer.valueOf(ct8VarQ.b().c))));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
