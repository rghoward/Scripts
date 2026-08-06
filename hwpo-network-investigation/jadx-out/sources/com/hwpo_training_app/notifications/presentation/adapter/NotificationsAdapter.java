package com.hwpo_training_app.notifications.presentation.adapter;

import android.text.Html;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.notifications.presentation.adapter.delegate.NotificationDelegateKt$notificationDelegate$$inlined$adapterDelegateViewBinding$default$1;
import com.hwpo_training_app.notifications.presentation.adapter.delegate.NotificationDelegateKt$notificationDelegate$$inlined$adapterDelegateViewBinding$default$2;
import com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity;
import defpackage.a3a;
import defpackage.ad7;
import defpackage.bi9;
import defpackage.e93;
import defpackage.g2b;
import defpackage.ga6;
import defpackage.n50;
import defpackage.oh4;
import defpackage.xgb;
import defpackage.ya;
import defpackage.z2a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationsAdapter extends n50<NotificationUiEntity> {
    public final oh4<Integer, g2b> f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NotificationsDiffCallback extends m.e<NotificationUiEntity> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(NotificationUiEntity notificationUiEntity, NotificationUiEntity notificationUiEntity2) {
            return notificationUiEntity.equals(notificationUiEntity2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(NotificationUiEntity notificationUiEntity, NotificationUiEntity notificationUiEntity2) {
            return notificationUiEntity.c() == notificationUiEntity2.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsAdapter(final oh4<? super NotificationUiEntity, g2b> oh4Var, oh4<? super Integer, g2b> oh4Var2) {
        super(new NotificationsDiffCallback());
        this.f = oh4Var2;
        this.d.b(new e93(new ad7(0), new NotificationDelegateKt$notificationDelegate$$inlined$adapterDelegateViewBinding$default$1(), new oh4() { // from class: bd7
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                final oh4 oh4Var3 = oh4Var;
                yaVar.s(new oh4() { // from class: com.hwpo_training_app.notifications.presentation.adapter.delegate.a
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        ConstraintLayout constraintLayout = ((ga6) yaVar2.u).a;
                        constraintLayout.getClass();
                        xgb.a(constraintLayout, new NotificationDelegateKt$notificationDelegate$2$1$1(oh4Var3, yaVar2, null));
                        ga6 ga6Var = (ga6) yaVar2.u;
                        MaterialTextView materialTextView = ga6Var.b;
                        ShapeableImageView shapeableImageView = ga6Var.c;
                        materialTextView.setText(((NotificationUiEntity) yaVar2.t()).b());
                        MaterialTextView materialTextView2 = ga6Var.g;
                        materialTextView2.setText(String.valueOf(a3a.S(((NotificationUiEntity) yaVar2.t()).b())));
                        MaterialTextView materialTextView3 = ga6Var.f;
                        String strE = ((NotificationUiEntity) yaVar2.t()).e();
                        materialTextView3.setText(strE != null ? Html.fromHtml(strE, 63) : null);
                        ga6Var.e.setText(((NotificationUiEntity) yaVar2.t()).d());
                        ga6Var.d.setVisibility(((NotificationUiEntity) yaVar2.t()).f() ? 8 : 0);
                        String strA = ((NotificationUiEntity) yaVar2.t()).a();
                        boolean z = strA == null || z2a.w(strA);
                        shapeableImageView.setVisibility(!z ? 0 : 8);
                        materialTextView2.setVisibility(z ? 0 : 8);
                        if (strA != null && !z2a.w(strA)) {
                            xgb.f(shapeableImageView, strA, new bi9(1));
                        }
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, NotificationDelegateKt$notificationDelegate$$inlined$adapterDelegateViewBinding$default$2.u));
    }

    @Override // defpackage.n50, androidx.recyclerview.widget.RecyclerView.f
    public final void j(RecyclerView.e0 e0Var, int i) {
        e0Var.getClass();
        super.j(e0Var, i);
        this.f.invoke(Integer.valueOf(i));
    }

    @Override // defpackage.n50, androidx.recyclerview.widget.RecyclerView.f
    public final void k(RecyclerView.e0 e0Var, int i, List<Object> list) {
        list.getClass();
        super.k(e0Var, i, list);
        this.f.invoke(Integer.valueOf(i));
    }
}
