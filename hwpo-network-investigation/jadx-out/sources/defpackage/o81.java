package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o81 extends cx4 {
    public final vg4 P = new vg4(new l());
    public final shb Q;
    public final boolean R;
    public static final /* synthetic */ ho5<Object>[] S = {new ne8(o81.class, "binding", "getBinding()Lcom/hwpo_training_app/profile/databinding/DialogChangePasswordBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b t;
        public static final b u;
        public static final /* synthetic */ b[] v;

        static {
            b bVar = new b("NOTIFY_PASSWORD_CHANGED", 0);
            t = bVar;
            b bVar2 = new b("OPEN_FORGOT_PASSWORD", 1);
            u = bVar2;
            v = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) v.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return Boolean.valueOf(((SimpleProgressBar) this.receiver).t);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<String, g2b> {
        public final /* synthetic */ TextInputEditText t;

        public d(TextInputEditText textInputEditText) {
            this.t = textInputEditText;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            qd3.b(this.t, str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements oh4<String, g2b> {
        public final /* synthetic */ TextInputEditText t;

        public e(TextInputEditText textInputEditText) {
            this.t = textInputEditText;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            qd3.b(this.t, str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements oh4<String, g2b> {
        public final /* synthetic */ TextInputEditText t;

        public f(TextInputEditText textInputEditText) {
            this.t = textInputEditText;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            qd3.b(this.t, str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g implements oh4<String, g2b> {
        public final /* synthetic */ iz2 t;

        public g(o81 o81Var, iz2 iz2Var) {
            this.t = iz2Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            TextInputLayout textInputLayout = this.t.e;
            a aVar = o81.Companion;
            textInputLayout.setErrorEnabled(str2 != null);
            textInputLayout.setError(str2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h implements oh4<String, g2b> {
        public final /* synthetic */ iz2 t;

        public h(o81 o81Var, iz2 iz2Var) {
            this.t = iz2Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            TextInputLayout textInputLayout = this.t.i;
            a aVar = o81.Companion;
            textInputLayout.setErrorEnabled(str2 != null);
            textInputLayout.setError(str2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i implements oh4<String, g2b> {
        public final /* synthetic */ iz2 t;

        public i(o81 o81Var, iz2 iz2Var) {
            this.t = iz2Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            TextInputLayout textInputLayout = this.t.g;
            a aVar = o81.Companion;
            textInputLayout.setErrorEnabled(str2 != null);
            textInputLayout.setError(str2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j implements oh4<Boolean, g2b> {
        public final /* synthetic */ MaterialButton t;

        public j(MaterialButton materialButton) {
            this.t = materialButton;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            this.t.setEnabled(bool.booleanValue());
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k implements oh4<Boolean, g2b> {
        public final /* synthetic */ c t;

        public k(c cVar) {
            this.t = cVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.getClass();
            ((SimpleProgressBar) this.t.receiver).setVisible(bool2.booleanValue());
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l implements oh4<o81, iz2> {
        @Override // defpackage.oh4
        public final iz2 invoke(o81 o81Var) {
            o81 o81Var2 = o81Var;
            o81Var2.getClass();
            return iz2.bind(o81Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m extends wp5 implements mh4<androidx.fragment.app.f> {
        public m() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return o81.this;
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class q extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? o81.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public o81() {
        ss5 ss5VarC = hv5.c(j26.u, new n(new m()));
        this.Q = new shb(ll8.a(m91.class), new o(ss5VarC), new q(ss5VarC), new p(ss5VarC));
        this.R = true;
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_change_password, viewGroup);
    }

    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        m91 m91VarW = w();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        m91VarW.c(viewLifecycleOwner, new m81(this, 0));
        final iz2 iz2VarV = v();
        iz2VarV.a.post(new Runnable(this) { // from class: n81
            public final /* synthetic */ o81 u;

            {
                this.u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                o81.a aVar = o81.Companion;
                ConstraintLayout constraintLayout = iz2VarV.a;
                constraintLayout.getClass();
                int dimension = (int) constraintLayout.getResources().getDimension(R.dimen.bottom_sheet_top_padding);
                o81 o81Var = this.u;
                o81Var.p().K(o81Var.v().a.getHeight() + dimension);
            }
        });
        iz2 iz2VarV2 = v();
        iz2VarV2.d.addTextChangedListener(new r81(this));
        iz2VarV2.h.addTextChangedListener(new s81(this));
        TextInputEditText textInputEditText = iz2VarV2.f;
        textInputEditText.addTextChangedListener(new t81(this));
        qd3.a(textInputEditText, new int[]{6}, new nm0(1, this));
        xgb.a(iz2VarV2.b, new p81(this, null));
        xgb.a(iz2VarV2.c, new q81(this, null));
        iz2VarV2.k.setNavigationOnClickListener(new View.OnClickListener() { // from class: l81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o81.a aVar = o81.Companion;
                this.t.i();
            }
        });
        iz2 iz2VarV3 = v();
        w().A.e(getViewLifecycleOwner(), new u81(new d(iz2VarV3.d)));
        w().B.e(getViewLifecycleOwner(), new u81(new e(iz2VarV3.h)));
        w().C.e(getViewLifecycleOwner(), new u81(new f(iz2VarV3.f)));
        w().D.e(getViewLifecycleOwner(), new u81(new g(this, iz2VarV3)));
        w().E.e(getViewLifecycleOwner(), new u81(new h(this, iz2VarV3)));
        w().F.e(getViewLifecycleOwner(), new u81(new i(this, iz2VarV3)));
        w().G.e(getViewLifecycleOwner(), new u81(new j(iz2VarV3.c)));
        w().H.e(getViewLifecycleOwner(), new u81(new k(new c(iz2VarV3.j, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
    }

    @Override // defpackage.zj0
    public final boolean r() {
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final iz2 v() {
        T tA = this.P.a(this, S[0]);
        tA.getClass();
        return (iz2) tA;
    }

    public final m91 w() {
        return (m91) this.Q.getValue();
    }
}
