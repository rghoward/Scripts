package com.hwpo_training_app.leaderboards.attachments.presentation;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;
import com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsFragment;
import com.hwpo_training_app.leaderboards.databinding.FragmentLeaderboardValueAttachmentsBinding;
import defpackage.a56;
import defpackage.ee5;
import defpackage.feb;
import defpackage.g2b;
import defpackage.ho5;
import defpackage.hv5;
import defpackage.j26;
import defpackage.ll8;
import defpackage.m76;
import defpackage.m81;
import defpackage.mh4;
import defpackage.ne8;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.q00;
import defpackage.q8;
import defpackage.rhb;
import defpackage.shb;
import defpackage.sk1;
import defpackage.ss5;
import defpackage.uy;
import defpackage.vg4;
import defpackage.vk1;
import defpackage.vz7;
import defpackage.w46;
import defpackage.xgb;
import defpackage.y46;
import defpackage.z46;
import defpackage.z90;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardValueAttachmentsFragment extends Hilt_LeaderboardValueAttachmentsFragment {
    public final vg4 A = new vg4(new oh4<LeaderboardValueAttachmentsFragment, FragmentLeaderboardValueAttachmentsBinding>() { // from class: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsFragment$special$$inlined$viewBindingFragment$default$1
        @Override // defpackage.oh4
        public final FragmentLeaderboardValueAttachmentsBinding invoke(LeaderboardValueAttachmentsFragment leaderboardValueAttachmentsFragment) {
            LeaderboardValueAttachmentsFragment leaderboardValueAttachmentsFragment2 = leaderboardValueAttachmentsFragment;
            leaderboardValueAttachmentsFragment2.getClass();
            return FragmentLeaderboardValueAttachmentsBinding.bind(leaderboardValueAttachmentsFragment2.requireView());
        }
    });
    public final shb B;
    public final o7a C;
    public static final /* synthetic */ ho5<Object>[] D = {new ne8(LeaderboardValueAttachmentsFragment.class, "binding", "getBinding()Lcom/hwpo_training_app/leaderboards/databinding/FragmentLeaderboardValueAttachmentsBinding;", 0)};
    public static final Companion Companion = new Companion(0);

    public LeaderboardValueAttachmentsFragment() {
        ss5 ss5VarC = hv5.c(j26.u, new LeaderboardValueAttachmentsFragment$special$$inlined$viewModels$default$2(new LeaderboardValueAttachmentsFragment$special$$inlined$viewModels$default$1(this)));
        this.B = new shb(ll8.a(LeaderboardValueAttachmentsViewModel.class), new LeaderboardValueAttachmentsFragment$special$$inlined$viewModels$default$3(ss5VarC), new LeaderboardValueAttachmentsFragment$special$$inlined$viewModels$default$5(this, ss5VarC), new LeaderboardValueAttachmentsFragment$special$$inlined$viewModels$default$4(ss5VarC));
        this.C = new o7a(new mh4() { // from class: com.hwpo_training_app.leaderboards.attachments.presentation.a
            @Override // defpackage.mh4
            public final Object invoke() {
                LeaderboardValueAttachmentsFragment.Companion companion = LeaderboardValueAttachmentsFragment.Companion;
                y46 y46Var = new y46();
                q00 q00Var = new q00(3);
                LeaderboardValueAttachmentsFragment leaderboardValueAttachmentsFragment = this.t;
                return new vk1(false, y46Var, q00Var, new LeaderboardValueAttachmentsFragment$adapter$2$3(1, leaderboardValueAttachmentsFragment.q(), LeaderboardValueAttachmentsViewModel.class, "onFileAttachmentClick", "onFileAttachmentClick(Lcom/hwpo_training_app/core/presentation/entity/AttachmentUiEntity$FileAttachment;)V", 0), new LeaderboardValueAttachmentsFragment$adapter$2$4(2, leaderboardValueAttachmentsFragment.q(), LeaderboardValueAttachmentsViewModel.class, "onMediaAttachmentClick", "onMediaAttachmentClick(Lcom/hwpo_training_app/core/presentation/entity/AttachmentUiEntity$MediaAttachment;Ljava/util/List;)V", 0), new z46(), new a56(0));
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
        RecyclerView recyclerView = p().b;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter((vk1) this.C.getValue());
        recyclerView.setItemAnimator(null);
        Drawable drawable = requireContext().getDrawable(R.drawable.common_divider);
        if (drawable == null) {
            z90.a("Required value was null.");
            return;
        }
        recyclerView.h(new feb(drawable, 0, 0));
        FragmentLeaderboardValueAttachmentsBinding fragmentLeaderboardValueAttachmentsBindingP = p();
        g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        uy uyVar = (uy) gVarRequireActivity;
        MaterialToolbar materialToolbar = fragmentLeaderboardValueAttachmentsBindingP.e;
        uyVar.setSupportActionBar(materialToolbar);
        q8 supportActionBar = uyVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m();
        }
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: x46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LeaderboardValueAttachmentsFragment.Companion companion = LeaderboardValueAttachmentsFragment.Companion;
                this.t.q().x.a();
            }
        });
        ConstraintLayout constraintLayout = fragmentLeaderboardValueAttachmentsBindingP.a;
        constraintLayout.getClass();
        xgb.g(materialToolbar, R.drawable.ic_back_btn, constraintLayout.getContext().getColor(R.color.iconPrimaryActive));
        ConstraintLayout constraintLayout2 = p().a;
        constraintLayout2.getClass();
        ee5.a(new w46(), constraintLayout2);
        LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModelQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        leaderboardValueAttachmentsViewModelQ.c(viewLifecycleOwner, new m81(this, 1));
        q().G.e(getViewLifecycleOwner(), new LeaderboardValueAttachmentsFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsFragment$onViewCreated$$inlined$observe$1
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardValueAttachmentsFragment.Companion companion = LeaderboardValueAttachmentsFragment.Companion;
                this.t.p().d.setVisible(zBooleanValue);
                return g2b.a;
            }
        }));
        q().H.e(getViewLifecycleOwner(), new LeaderboardValueAttachmentsFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<vz7, g2b>() { // from class: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsFragment$onViewCreated$$inlined$observe$2
            @Override // defpackage.oh4
            public final g2b invoke(vz7 vz7Var) {
                vz7 vz7Var2 = vz7Var;
                LeaderboardValueAttachmentsFragment.Companion companion = LeaderboardValueAttachmentsFragment.Companion;
                boolean z = vz7Var2.b;
                final LeaderboardValueAttachmentsFragment leaderboardValueAttachmentsFragment = this.t;
                if (z) {
                    PlaceHolder placeHolder = leaderboardValueAttachmentsFragment.p().c;
                    placeHolder.setTitle(vz7Var2.d);
                    placeHolder.q(vz7Var2.e);
                    placeHolder.p(vz7Var2.f, vz7Var2.c);
                    placeHolder.i(new mh4() { // from class: com.hwpo_training_app.leaderboards.attachments.presentation.b
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            LeaderboardValueAttachmentsFragment.Companion companion2 = LeaderboardValueAttachmentsFragment.Companion;
                            LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModelQ2 = leaderboardValueAttachmentsFragment.q();
                            oy0.d(rhb.b(leaderboardValueAttachmentsViewModelQ2), null, null, new LeaderboardValueAttachmentsViewModel$loadValueAttachments$1(leaderboardValueAttachmentsViewModelQ2, null), 3);
                            return g2b.a;
                        }
                    });
                    PlaceHolder.r(placeHolder);
                } else {
                    PlaceHolder.h(leaderboardValueAttachmentsFragment.p().c);
                }
                return g2b.a;
            }
        }));
        q().I.e(getViewLifecycleOwner(), new LeaderboardValueAttachmentsFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<List<? extends sk1.a>, g2b>() { // from class: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsFragment$onViewCreated$$inlined$observe$3
            @Override // defpackage.oh4
            public final g2b invoke(List<? extends sk1.a> list) {
                LeaderboardValueAttachmentsFragment.Companion companion = LeaderboardValueAttachmentsFragment.Companion;
                ((vk1) this.t.C.getValue()).u(list);
                return g2b.a;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FragmentLeaderboardValueAttachmentsBinding p() {
        T tA = this.A.a(this, D[0]);
        tA.getClass();
        return (FragmentLeaderboardValueAttachmentsBinding) tA;
    }

    public final LeaderboardValueAttachmentsViewModel q() {
        return (LeaderboardValueAttachmentsViewModel) this.B.getValue();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
