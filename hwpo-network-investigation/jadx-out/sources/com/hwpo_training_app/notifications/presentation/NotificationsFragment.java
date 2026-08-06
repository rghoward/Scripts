package com.hwpo_training_app.notifications.presentation;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;
import com.hwpo_training_app.notifications.presentation.adapter.NotificationsAdapter;
import com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity;
import defpackage.cf4;
import defpackage.e10;
import defpackage.ee5;
import defpackage.feb;
import defpackage.g2b;
import defpackage.gb2;
import defpackage.ho5;
import defpackage.hv5;
import defpackage.hy8;
import defpackage.iy8;
import defpackage.j26;
import defpackage.jd7;
import defpackage.ll8;
import defpackage.m76;
import defpackage.mh4;
import defpackage.my1;
import defpackage.ne8;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.rv;
import defpackage.shb;
import defpackage.ss5;
import defpackage.vg4;
import defpackage.vz7;
import defpackage.whb;
import defpackage.z90;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationsFragment extends Hilt_NotificationsFragment implements iy8, rv {
    public static final /* synthetic */ ho5<Object>[] E = {new ne8(NotificationsFragment.class, "binding", "getBinding()Lcom/hwpo_training_app/chat/databinding/FragmentNotificationsBinding;", 0)};
    public final vg4 A = new vg4(new oh4<NotificationsFragment, cf4>() { // from class: com.hwpo_training_app.notifications.presentation.NotificationsFragment$special$$inlined$viewBindingFragment$default$1
        @Override // defpackage.oh4
        public final cf4 invoke(NotificationsFragment notificationsFragment) {
            NotificationsFragment notificationsFragment2 = notificationsFragment;
            notificationsFragment2.getClass();
            return cf4.bind(notificationsFragment2.requireView());
        }
    });
    public final shb B;
    public final o7a C;
    public final NotificationsFragment$adapterDataObserver$1 D;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.hwpo_training_app.notifications.presentation.NotificationsFragment$adapterDataObserver$1] */
    public NotificationsFragment() {
        ss5 ss5VarC = hv5.c(j26.u, new NotificationsFragment$special$$inlined$viewModels$default$2(new NotificationsFragment$special$$inlined$viewModels$default$1(this)));
        this.B = new shb(ll8.a(NotificationsViewModel.class), new NotificationsFragment$special$$inlined$viewModels$default$3(ss5VarC), new NotificationsFragment$special$$inlined$viewModels$default$5(this, ss5VarC), new NotificationsFragment$special$$inlined$viewModels$default$4(ss5VarC));
        this.C = new o7a(new mh4() { // from class: com.hwpo_training_app.notifications.presentation.a
            @Override // defpackage.mh4
            public final Object invoke() {
                ho5<Object>[] ho5VarArr = NotificationsFragment.E;
                NotificationsFragment notificationsFragment = this.t;
                return new NotificationsAdapter(new NotificationsFragment$adapter$2$1(1, notificationsFragment.q(), NotificationsViewModel.class, "onNotificationClicked", "onNotificationClicked(Lcom/hwpo_training_app/notifications/presentation/entity/NotificationUiEntity;)V", 0), new NotificationsFragment$adapter$2$2(1, notificationsFragment.q(), NotificationsViewModel.class, "onItemShown", "onItemShown(I)V", 0));
            }
        });
        this.D = new RecyclerView.h() { // from class: com.hwpo_training_app.notifications.presentation.NotificationsFragment$adapterDataObserver$1
            @Override // androidx.recyclerview.widget.RecyclerView.h
            public final void d(int i, int i2) {
                ho5<Object>[] ho5VarArr = NotificationsFragment.E;
                NotificationsFragment notificationsFragment = this.a;
                RecyclerView.o layoutManager = notificationsFragment.p().b.getLayoutManager();
                layoutManager.getClass();
                if (((LinearLayoutManager) layoutManager).U0() == 0) {
                    notificationsFragment.p().b.m0(0);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public final void e(int i, int i2) {
                ho5<Object>[] ho5VarArr = NotificationsFragment.E;
                NotificationsFragment notificationsFragment = this.a;
                RecyclerView.o layoutManager = notificationsFragment.p().b.getLayoutManager();
                layoutManager.getClass();
                if (((LinearLayoutManager) layoutManager).U0() == 0) {
                    notificationsFragment.p().b.m0(0);
                }
            }
        };
    }

    @Override // defpackage.iy8
    public final hy8 e() {
        whb parentFragment = getParentFragment();
        parentFragment.getClass();
        return ((iy8) parentFragment).e();
    }

    @Override // defpackage.hk0
    public final void i() {
        p().c.setOnRefreshListener(new my1(this));
    }

    @Override // defpackage.hk0
    public final void j() {
        hy8 hy8VarE;
        whb parentFragment = getParentFragment();
        iy8 iy8Var = parentFragment instanceof iy8 ? (iy8) parentFragment : null;
        if (iy8Var == null || (hy8VarE = iy8Var.e()) == null) {
            return;
        }
        hy8VarE.b();
    }

    @Override // androidx.fragment.app.f
    public final void onDestroyView() {
        ((NotificationsAdapter) this.C.getValue()).t(this.D);
        super.onDestroyView();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new jd7(), view2);
        }
        cf4 cf4VarP = p();
        cf4VarP.c.setColorSchemeResources(R.color.colorPrimary);
        RecyclerView recyclerView = cf4VarP.b;
        o7a o7aVar = this.C;
        recyclerView.setAdapter((NotificationsAdapter) o7aVar.getValue());
        Drawable drawable = requireContext().getDrawable(R.drawable.common_divider);
        if (drawable == null) {
            z90.a("Required value was null.");
            return;
        }
        ((NotificationsAdapter) o7aVar.getValue()).r(this.D);
        recyclerView.h(new feb(drawable, 0, 0));
        NotificationsViewModel notificationsViewModelQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        notificationsViewModelQ.c(viewLifecycleOwner, new gb2(2, this));
        q().E.e(getViewLifecycleOwner(), new NotificationsFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<List<? extends NotificationUiEntity>, g2b>() { // from class: com.hwpo_training_app.notifications.presentation.NotificationsFragment$onViewCreated$$inlined$observe$1
            @Override // defpackage.oh4
            public final g2b invoke(List<? extends NotificationUiEntity> list) {
                ho5<Object>[] ho5VarArr = NotificationsFragment.E;
                ((NotificationsAdapter) this.t.C.getValue()).u(list);
                return g2b.a;
            }
        }));
        q().D.e(getViewLifecycleOwner(), new NotificationsFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.notifications.presentation.NotificationsFragment$onViewCreated$$inlined$observe$2
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                ho5<Object>[] ho5VarArr = NotificationsFragment.E;
                this.t.p().e.setVisible(zBooleanValue);
                return g2b.a;
            }
        }));
        q().F.e(getViewLifecycleOwner(), new NotificationsFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<vz7, g2b>() { // from class: com.hwpo_training_app.notifications.presentation.NotificationsFragment$onViewCreated$$inlined$observe$3
            @Override // defpackage.oh4
            public final g2b invoke(vz7 vz7Var) {
                vz7 vz7Var2 = vz7Var;
                ho5<Object>[] ho5VarArr = NotificationsFragment.E;
                NotificationsFragment notificationsFragment = this.t;
                cf4 cf4VarP2 = notificationsFragment.p();
                boolean z = vz7Var2.b;
                PlaceHolder placeHolder = cf4VarP2.d;
                if (z) {
                    placeHolder.setTitle(vz7Var2.d);
                    placeHolder.q(vz7Var2.e);
                    placeHolder.p(vz7Var2.f, vz7Var2.c);
                    placeHolder.i(new e10(1, notificationsFragment));
                    PlaceHolder.r(placeHolder);
                } else {
                    PlaceHolder.h(placeHolder);
                }
                return g2b.a;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cf4 p() {
        T tC = this.A.a(this, E[0]);
        tC.getClass();
        return (cf4) tC;
    }

    public final NotificationsViewModel q() {
        return (NotificationsViewModel) this.B.getValue();
    }
}
