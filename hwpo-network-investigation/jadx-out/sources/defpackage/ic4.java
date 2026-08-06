package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ic4 extends lx4 {
    public final boolean P = true;
    public final vg4 Q = new vg4(new e());
    public final shb R;
    public static final /* synthetic */ ho5<Object>[] S = {new ne8(ic4.class, "binding", "getBinding()Lcom/hwpo_training_app/profile/databinding/DialogForgotPasswordBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<Boolean, g2b> {
        public final /* synthetic */ MaterialButton t;

        public b(MaterialButton materialButton) {
            this.t = materialButton;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            this.t.setEnabled(bool.booleanValue());
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<Boolean, g2b> {
        public final /* synthetic */ d t;

        public c(d dVar) {
            this.t = dVar;
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
    public static final /* synthetic */ class d extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return Boolean.valueOf(((SimpleProgressBar) this.receiver).t);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements oh4<ic4, nz2> {
        @Override // defpackage.oh4
        public final nz2 invoke(ic4 ic4Var) {
            ic4 ic4Var2 = ic4Var;
            ic4Var2.getClass();
            return nz2.bind(ic4Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<androidx.fragment.app.f> {
        public f() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return ic4.this;
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
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? ic4.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ic4() {
        ss5 ss5VarC = hv5.c(j26.u, new g(new f()));
        this.R = new shb(ll8.a(cd4.class), new h(ss5VarC), new j(ss5VarC), new i(ss5VarC));
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_forgot_password, viewGroup);
    }

    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        final nz2 nz2VarV = v();
        nz2VarV.a.post(new Runnable() { // from class: hc4
            @Override // java.lang.Runnable
            public final void run() {
                ic4.a aVar = ic4.Companion;
                ConstraintLayout constraintLayout = nz2VarV.a;
                constraintLayout.getClass();
                int dimension = (int) constraintLayout.getResources().getDimension(R.dimen.bottom_sheet_top_padding);
                ic4 ic4Var = this;
                ic4Var.p().K(ic4Var.v().a.getHeight() + dimension);
            }
        });
        nz2 nz2VarV2 = v();
        cd4 cd4VarW = w();
        TextInputEditText textInputEditText = nz2VarV2.c;
        r54 r54VarD = xgb.d(textInputEditText);
        r54VarD.getClass();
        oy0.d(rhb.b(cd4VarW), null, null, new yc4(cd4VarW, r54VarD, null), 3);
        qd3.a(textInputEditText, new int[]{6}, new oh4() { // from class: fc4
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                ((Integer) obj).getClass();
                ic4.a aVar = ic4.Companion;
                cd4 cd4VarW2 = this.t.w();
                cd4VarW2.e(ec4.d.a);
                oy0.d(rhb.b(cd4VarW2), null, null, new wc4(cd4VarW2, null), 3);
                return g2b.a;
            }
        });
        xgb.a(nz2VarV2.b, new jc4(this, null));
        nz2VarV2.e.setNavigationOnClickListener(new View.OnClickListener() { // from class: gc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ic4.a aVar = ic4.Companion;
                this.t.i();
            }
        });
        w().z.e(getViewLifecycleOwner(), new kc4(new b(v().b)));
        w().A.e(getViewLifecycleOwner(), new kc4(new c(new d(v().d, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        cd4 cd4VarW2 = w();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        cd4VarW2.c(viewLifecycleOwner, new mc(1, this));
    }

    @Override // defpackage.zj0
    public final boolean r() {
        return this.P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nz2 v() {
        T tA = this.Q.a(this, S[0]);
        tA.getClass();
        return (nz2) tA;
    }

    public final cd4 w() {
        return (cd4) this.R.getValue();
    }
}
