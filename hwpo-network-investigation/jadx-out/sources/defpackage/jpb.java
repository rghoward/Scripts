package defpackage;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.hwpo_training_app.R;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jpb extends py4 implements iy8, rv {
    public static final /* synthetic */ ho5<Object>[] F = {new ne8(jpb.class, "binding", "getBinding()Lcom/hwpo_training_app/workouts/databinding/FragmentWorkoutsBinding;", 0)};
    public eqb A;
    public final o7a B = new o7a(new g12(1));
    public final vg4 C = new vg4(new c());
    public final shb D;
    public final o7a E;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<LocalDate, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(LocalDate localDate) {
            LocalDate localDate2 = localDate;
            localDate2.getClass();
            ((wpb) this.receiver).g(localDate2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<LocalDate, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(LocalDate localDate) {
            LocalDate localDate2 = localDate;
            localDate2.getClass();
            ((wpb) this.receiver).g(localDate2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<jpb, xg4> {
        @Override // defpackage.oh4
        public final xg4 invoke(jpb jpbVar) {
            jpb jpbVar2 = jpbVar;
            jpbVar2.getClass();
            return xg4.bind(jpbVar2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<androidx.fragment.app.f> {
        public d() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return jpb.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<whb> {
        public final /* synthetic */ d u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.u = dVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ss5 ss5Var) {
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

    public jpb() {
        int i = 1;
        s30 s30Var = new s30(i, this);
        ss5 ss5VarC = hv5.c(j26.u, new e(new d()));
        this.D = new shb(ll8.a(wpb.class), new f(ss5VarC), s30Var, new g(ss5VarC));
        this.E = new o7a(new ak8(i, this));
    }

    @Override // defpackage.iy8
    public final hy8 e() {
        whb parentFragment = getParentFragment();
        iy8 iy8Var = parentFragment instanceof iy8 ? (iy8) parentFragment : null;
        if (iy8Var != null) {
            return iy8Var.e();
        }
        z90.a("Required value was null.");
        return null;
    }

    @Override // defpackage.hk0
    public final void i() {
        xg4 xg4VarP = p();
        xg4VarP.e.setOnDateChanged(new a(1, q(), wpb.class, "onDateSelected", "onDateSelected(Ljava/time/LocalDate;)V", 0));
        xg4VarP.d.getMenu().findItem(R.id.menu_item_calendar).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: hpb
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ho5<Object>[] ho5VarArr = jpb.F;
                menuItem.getClass();
                wpb wpbVarQ = this.a.q();
                wpbVarQ.f(new cpb(yk2.v(wpbVarQ.b().b)));
                return true;
            }
        });
        xg4VarP.e.setOnDateChanged(new b(1, q(), wpb.class, "onDateSelected", "onDateSelected(Ljava/time/LocalDate;)V", 0));
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.a();
    }

    @Override // androidx.fragment.app.f
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        wpb wpbVarQ = q();
        LocalDate localDate = wpbVarQ.C.a;
        if (localDate == null) {
            localDate = wpbVarQ.b().b;
        }
        wpbVarQ.y.b(Long.valueOf(yk2.y(localDate)), "com.hwpo_training_app.client.ui.bottom_tabs.workouts.WorkoutsViewModel.INITIAL_DATE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new gpb(), view2);
            g2b g2bVar = g2b.a;
        }
        getLifecycle().a(q());
        p().e.setAdapter((tlb) this.E.getValue());
        o7a o7aVar = this.B;
        yp7 yp7Var = (yp7) o7aVar.getValue();
        yp7Var.h = true;
        yp7Var.i = 0;
        ViewPager2 viewPager2 = p().b;
        if (viewPager2.getAdapter() == null) {
            if (viewPager2.getChildCount() <= 0) {
                px1.b("Sequence is empty.");
                return;
            }
            View childAt = viewPager2.getChildAt(0);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null) {
                recyclerView.setItemAnimator((yp7) o7aVar.getValue());
            }
            viewPager2.setOffscreenPageLimit(2);
            qm2 qm2VarA = (qm2) q().I.d();
            l childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            s66 lifecycle = getLifecycle();
            lifecycle.getClass();
            sm2 sm2Var = new sm2(childFragmentManager, lifecycle);
            if (qm2VarA == null) {
                qm2.a aVar = qm2.Companion;
                LocalDate localDateNow = LocalDate.now();
                localDateNow.getClass();
                aVar.getClass();
                qm2VarA = qm2.a.a(localDateNow);
            }
            sm2Var.m = qm2VarA;
            viewPager2.setAdapter(sm2Var);
            viewPager2.v.a.add(new kpb(this, viewPager2));
        }
        q().F.e(getViewLifecycleOwner(), new lpb(new mpb(this)));
        q().G.e(getViewLifecycleOwner(), new lpb(new npb(this)));
        q().I.e(getViewLifecycleOwner(), new lpb(new opb(this)));
        q().H.e(getViewLifecycleOwner(), new lpb(new ppb(p().e)));
        wpb wpbVarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        wpbVarQ.c(viewLifecycleOwner, new oh4() { // from class: fpb
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                ho5<Object>[] ho5VarArr = jpb.F;
                gm3Var.getClass();
                boolean z = gm3Var instanceof cpb;
                jpb jpbVar = this.t;
                if (z) {
                    long j = ((cpb) gm3Var).b;
                    e21.Companion.getClass();
                    e21 e21VarA = e21.a.a(j, null, null);
                    e21VarA.J = new qpb(1, jpbVar.q(), wpb.class, "onDateSelected", "onDateSelected(Ljava/time/LocalDate;)V", 0);
                    l childFragmentManager2 = jpbVar.getChildFragmentManager();
                    childFragmentManager2.getClass();
                    e21VarA.o(childFragmentManager2, e21.class.getName());
                } else if (gm3Var instanceof dpb) {
                    jpbVar.m(((dpb) gm3Var).b);
                }
                return g2b.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xg4 p() {
        return (xg4) this.C.a(this, F[0]);
    }

    public final wpb q() {
        return (wpb) this.D.getValue();
    }
}
