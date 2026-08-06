package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.g;
import androidx.fragment.app.i;
import androidx.fragment.app.l;
import androidx.fragment.app.r;
import com.hwpo_training_app.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class og6 extends qx4 {
    public static final /* synthetic */ ho5<Object>[] F = {new ne8(og6.class, "binding", "getBinding()Lcom/hwpo_training_app/main_tabs/databinding/FragmentMainBinding;", 0)};
    public final vg4 A = new vg4(new a());
    public final shb B;
    public final o7a C;
    public final w9<String> D;
    public hu0 E;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements oh4<og6, ve4> {
        @Override // defpackage.oh4
        public final ve4 invoke(og6 og6Var) {
            og6 og6Var2 = og6Var;
            og6Var2.getClass();
            return ve4.bind(og6Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements mh4<androidx.fragment.app.f> {
        public b() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return og6.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements mh4<whb> {
        public final /* synthetic */ b u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.u = bVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ss5 ss5Var) {
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
    public static final class f extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? og6.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public og6() {
        ss5 ss5VarC = hv5.c(j26.u, new c(new b()));
        this.B = new shb(ll8.a(qg6.class), new d(ss5VarC), new f(ss5VarC), new e(ss5VarC));
        this.C = new o7a(new hg6(0, this));
        w9<String> w9VarRegisterForActivityResult = registerForActivityResult(new t9(), new n9() { // from class: ig6
            @Override // defpackage.n9
            public final void a(Object obj) {
                ho5<Object>[] ho5VarArr = og6.F;
                qg6 qg6VarR = this.t.r();
                oy0.d(rhb.b(qg6VarR), null, null, new bh6(qg6VarR, null), 3);
            }
        });
        w9VarRegisterForActivityResult.getClass();
        this.D = w9VarRegisterForActivityResult;
    }

    @Override // defpackage.hk0
    public final void j() {
        Object next;
        List<androidx.fragment.app.f> listF = getChildFragmentManager().c.f();
        listF.getClass();
        Iterator<T> it = listF.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((androidx.fragment.app.f) next).isDetached());
        androidx.fragment.app.f fVar = (androidx.fragment.app.f) next;
        hk0 hk0Var = fVar instanceof hk0 ? (hk0) fVar : null;
        if (hk0Var != null) {
            hk0Var.j();
        } else {
            r().x.b();
        }
    }

    @Override // androidx.fragment.app.f
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ee5.a(new fg6(), p().b);
        p().b.setOnItemSelectedListener(new gg6(this));
        int i = 0;
        r().I.e(getViewLifecycleOwner(), new lg6(new mg6(this, i)));
        r().J.e(getViewLifecycleOwner(), new lg6(new ng6(i, this)));
        qg6 qg6VarR = r();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qg6VarR.c(viewLifecycleOwner, new oh4() { // from class: jg6
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                ho5<Object>[] ho5VarArr = og6.F;
                gm3Var.getClass();
                boolean z = gm3Var instanceof eg6;
                final og6 og6Var = this.t;
                if (z) {
                    og6Var.m(((eg6) gm3Var).b);
                } else if (gm3Var instanceof cg6) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        og6Var.D.a("android.permission.POST_NOTIFICATIONS");
                    }
                } else if (gm3Var instanceof dg6) {
                    g gVarRequireActivity = og6Var.requireActivity();
                    gVarRequireActivity.getClass();
                    nr1.d(gVarRequireActivity, xp5.MAIN_TABS);
                } else if (gm3Var instanceof bg6) {
                    ((aw8) og6Var.C.getValue()).b().b(new fh7() { // from class: kg6
                        @Override // defpackage.fh7
                        public final void b(r9a r9aVar) {
                            ho5<Object>[] ho5VarArr2 = og6.F;
                            r9aVar.getClass();
                            if (!r9aVar.n()) {
                                rma.a.b(r9aVar.i());
                            } else {
                                og6 og6Var2 = og6Var;
                                ((aw8) og6Var2.C.getValue()).a(og6Var2.requireActivity(), (zv8) r9aVar.j());
                            }
                        }
                    });
                }
                return g2b.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ve4 p() {
        return (ve4) this.A.a(this, F[0]);
    }

    public final hu0 q() {
        hu0 hu0Var = this.E;
        if (hu0Var != null) {
            return hu0Var;
        }
        xj5.e("bottomTabs");
        throw null;
    }

    public final qg6 r() {
        return (qg6) this.B.getValue();
    }

    public final void s(String str) {
        Object next;
        androidx.fragment.app.f fVarE = getChildFragmentManager().E(str);
        List<androidx.fragment.app.f> listF = getChildFragmentManager().c.f();
        listF.getClass();
        Iterator<T> it = listF.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((androidx.fragment.app.f) next).isDetached());
        androidx.fragment.app.f fVar = (androidx.fragment.app.f) next;
        if (fVar == null || fVarE == null || fVar != fVarE) {
            l childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
            aVar.b = R.anim.fragment_fade_in_animation;
            aVar.c = R.anim.fragment_fade_out_animation;
            aVar.d = R.anim.fragment_fade_in_animation;
            aVar.e = R.anim.fragment_fade_out_animation;
            if (fVarE == null) {
                ku0 ku0VarE = q().e(str);
                i iVarJ = getChildFragmentManager().J();
                iVarJ.getClass();
                aVar.d(R.id.tabContainer, ku0VarE.a(iVarJ), str, 1);
            }
            if (fVar != null) {
                aVar.c(fVar);
            }
            if (fVarE != null) {
                aVar.b(new r.a(fVarE, 7));
            }
            aVar.i();
        }
    }
}
