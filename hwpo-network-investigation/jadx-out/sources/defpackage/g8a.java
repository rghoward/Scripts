package defpackage;

import android.os.Bundle;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import androidx.fragment.app.l;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g8a extends jy4 implements iy8 {
    public static final a Companion = new a();
    public ic6 A;
    public hu0 B;
    public final o7a C = new o7a(new md2(2, this));
    public final o7a D = new o7a(new mh4() { // from class: f8a
        @Override // defpackage.mh4
        public final Object invoke() {
            g8a g8aVar = this.t;
            g gVarRequireActivity = g8aVar.requireActivity();
            gVarRequireActivity.getClass();
            l childFragmentManager = g8aVar.getChildFragmentManager();
            childFragmentManager.getClass();
            return new n20(gVarRequireActivity, R.id.specialTabContainer, childFragmentManager);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    @Override // defpackage.iy8
    public final hy8 e() {
        String string = requireArguments().getString("TAB_KEY");
        if (string == null) {
            z90.a("Required value was null.");
            return null;
        }
        ic6 ic6Var = this.A;
        if (ic6Var != null) {
            return ic6Var.a(string).a;
        }
        xj5.e("localCiceroneHolder");
        throw null;
    }

    @Override // defpackage.hk0
    public final void j() {
        f fVarD = getChildFragmentManager().D(R.id.specialTabContainer);
        hk0 hk0Var = fVarD instanceof hk0 ? (hk0) fVarD : null;
        if (hk0Var != null) {
            hk0Var.j();
        }
    }

    @Override // androidx.fragment.app.f
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String string = requireArguments().getString("TAB_KEY");
            if (string == null) {
                z90.a("Required value was null.");
                return;
            }
            ic6 ic6Var = this.A;
            if (ic6Var == null) {
                xj5.e("localCiceroneHolder");
                throw null;
            }
            hy8 hy8Var = ic6Var.a(string).a;
            if (string.equals(p().b().x)) {
                ju0.a aVarB = p().b();
                aVarB.getClass();
                hy8Var.d(new iu0(aVarB));
                return;
            }
            if (string.equals(p().c().x)) {
                ju0.b bVarC = p().c();
                bVarC.getClass();
                hy8Var.d(new lu0(bVarC));
            } else if (string.equals(p().a().x)) {
                ju0.c cVarA = p().a();
                cVarA.getClass();
                hy8Var.d(new mu0(cVarA));
            } else if (string.equals(p().d().x)) {
                ju0.d dVarD = p().d();
                dVarD.getClass();
                hy8Var.d(new nu0(dVarD));
            }
        }
    }

    @Override // androidx.fragment.app.f
    public final void onPause() {
        ((yc1) this.C.getValue()).a.a.a = null;
        super.onPause();
    }

    @Override // androidx.fragment.app.f
    public final void onResume() {
        super.onResume();
        ((yc1) this.C.getValue()).a.a.b((n20) this.D.getValue());
    }

    public final hu0 p() {
        hu0 hu0Var = this.B;
        if (hu0Var != null) {
            return hu0Var;
        }
        xj5.e("bottomTabs");
        throw null;
    }
}
