package com.hwpo_training_app.leaderboards.details.header.presentation;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.c;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.databinding.FragmentLeaderboardsDetailsHeaderBinding;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel;
import com.hwpo_training_app.leaderboards.details.header.presentation.adapter.AthletesListTabAdapter;
import com.hwpo_training_app.leaderboards.details.header.presentation.entity.ExpandableDescriptionStatesUiEntity;
import com.hwpo_training_app.leaderboards.details.header.presentation.entity.HeaderUiEntity;
import defpackage.e36;
import defpackage.ee5;
import defpackage.f36;
import defpackage.g2b;
import defpackage.gi4;
import defpackage.ho5;
import defpackage.hv5;
import defpackage.j26;
import defpackage.js7;
import defpackage.k74;
import defpackage.ll8;
import defpackage.lo2;
import defpackage.m76;
import defpackage.ne8;
import defpackage.nq1;
import defpackage.oh4;
import defpackage.p86;
import defpackage.qc0;
import defpackage.qwa;
import defpackage.r54;
import defpackage.rhb;
import defpackage.shb;
import defpackage.ss5;
import defpackage.u;
import defpackage.uy0;
import defpackage.vg4;
import defpackage.wk6;
import defpackage.xgb;
import defpackage.yk2;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsHeaderFragment extends Hilt_LeaderboardDetailsHeaderFragment {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(LeaderboardDetailsHeaderFragment.class, "binding", "getBinding()Lcom/hwpo_training_app/leaderboards/databinding/FragmentLeaderboardsDetailsHeaderBinding;", 0)};
    public static final Companion Companion = new Companion(0);
    public final vg4 A = new vg4(new oh4<LeaderboardDetailsHeaderFragment, FragmentLeaderboardsDetailsHeaderBinding>() { // from class: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment$special$$inlined$viewBindingFragment$default$1
        @Override // defpackage.oh4
        public final FragmentLeaderboardsDetailsHeaderBinding invoke(LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment) {
            LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment2 = leaderboardDetailsHeaderFragment;
            leaderboardDetailsHeaderFragment2.getClass();
            return FragmentLeaderboardsDetailsHeaderBinding.bind(leaderboardDetailsHeaderFragment2.requireView());
        }
    });
    public final shb B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ExpandableDescriptionStatesUiEntity.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public LeaderboardDetailsHeaderFragment() {
        ss5 ss5VarC = hv5.c(j26.u, new LeaderboardDetailsHeaderFragment$special$$inlined$viewModels$default$2(new LeaderboardDetailsHeaderFragment$special$$inlined$viewModels$default$1(this)));
        this.B = new shb(ll8.a(LeaderboardDetailsHeaderViewModel.class), new LeaderboardDetailsHeaderFragment$special$$inlined$viewModels$default$3(ss5VarC), new LeaderboardDetailsHeaderFragment$special$$inlined$viewModels$default$5(this, ss5VarC), new LeaderboardDetailsHeaderFragment$special$$inlined$viewModels$default$4(ss5VarC));
    }

    @Override // defpackage.hk0
    public final void i() {
        final FragmentLeaderboardsDetailsHeaderBinding fragmentLeaderboardsDetailsHeaderBindingP = p();
        fragmentLeaderboardsDetailsHeaderBindingP.s.setNavigationOnClickListener(new View.OnClickListener() { // from class: b36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                this.t.q().y.a();
            }
        });
        xgb.a(fragmentLeaderboardsDetailsHeaderBindingP.m, new LeaderboardDetailsHeaderFragment$initListeners$1$2(this, null));
        xgb.a(fragmentLeaderboardsDetailsHeaderBindingP.i, new LeaderboardDetailsHeaderFragment$initListeners$1$3(this, null));
        xgb.a(fragmentLeaderboardsDetailsHeaderBindingP.k, new LeaderboardDetailsHeaderFragment$initListeners$1$4(this, null));
        xgb.a(fragmentLeaderboardsDetailsHeaderBindingP.g, new LeaderboardDetailsHeaderFragment$initListeners$1$5(this, null));
        xgb.a(fragmentLeaderboardsDetailsHeaderBindingP.o, new LeaderboardDetailsHeaderFragment$initListeners$1$6(this, null));
        xgb.a(fragmentLeaderboardsDetailsHeaderBindingP.f, new LeaderboardDetailsHeaderFragment$initListeners$1$7(this, null));
        xgb.a(fragmentLeaderboardsDetailsHeaderBindingP.p, new LeaderboardDetailsHeaderFragment$initListeners$1$8(this, null));
        fragmentLeaderboardsDetailsHeaderBindingP.r.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: c36
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                LeaderboardDetailsHeaderViewModel.Action.ChangeSearchToolbarState changeSearchToolbarState;
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModelQ = this.q();
                Editable text = fragmentLeaderboardsDetailsHeaderBindingP.r.getText();
                boolean z2 = text == null || text.length() == 0;
                if (z) {
                    changeSearchToolbarState = new LeaderboardDetailsHeaderViewModel.Action.ChangeSearchToolbarState(false, true);
                } else if (z || !z2) {
                    changeSearchToolbarState = (z || z2) ? null : new LeaderboardDetailsHeaderViewModel.Action.ChangeSearchToolbarState(false, true);
                } else {
                    changeSearchToolbarState = new LeaderboardDetailsHeaderViewModel.Action.ChangeSearchToolbarState(true, false);
                }
                if (changeSearchToolbarState != null) {
                    leaderboardDetailsHeaderViewModelQ.e(changeSearchToolbarState);
                }
            }
        });
        xgb.a(fragmentLeaderboardsDetailsHeaderBindingP.e, new LeaderboardDetailsHeaderFragment$initListeners$1$10(this, null));
        LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModelQ = q();
        r54<String> textChangesFlow = p().r.getTextChangesFlow();
        textChangesFlow.getClass();
        yk2.o(new k74(textChangesFlow, new LeaderboardDetailsHeaderViewModel$onSearchTextFlow$1(leaderboardDetailsHeaderViewModelQ, null)), rhb.b(leaderboardDetailsHeaderViewModelQ));
    }

    @Override // defpackage.hk0
    public final void j() {
        q().y.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        final FragmentLeaderboardsDetailsHeaderBinding fragmentLeaderboardsDetailsHeaderBindingP = p();
        ViewPager2 viewPager2 = fragmentLeaderboardsDetailsHeaderBindingP.d;
        if (viewPager2.getAdapter() == null) {
            viewPager2.setAdapter(new AthletesListTabAdapter(this, requireArguments().getInt("leaderboard_id")));
        }
        new c(fragmentLeaderboardsDetailsHeaderBindingP.l, viewPager2, new lo2(this)).a();
        fragmentLeaderboardsDetailsHeaderBindingP.h.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment$initViews$lambda$0$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view2.removeOnLayoutChangeListener(this);
                int width = view2.getWidth();
                MaterialTextView materialTextView = fragmentLeaderboardsDetailsHeaderBindingP.k;
                ViewGroup.LayoutParams layoutParams = materialTextView.getLayoutParams();
                int marginStart = width - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
                ViewGroup.LayoutParams layoutParams2 = materialTextView.getLayoutParams();
                int marginEnd = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0;
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModelQ = this.q();
                leaderboardDetailsHeaderViewModelQ.J = marginStart - marginEnd;
                leaderboardDetailsHeaderViewModelQ.g();
            }
        });
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new gi4() { // from class: a36
                @Override // defpackage.gi4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj).intValue();
                    int iIntValue2 = ((Integer) obj2).intValue();
                    int iIntValue3 = ((Integer) obj3).intValue();
                    View view3 = (View) obj4;
                    LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                    view3.getClass();
                    int i = ((ec5) obj5).d;
                    int i2 = iIntValue == 0 ? iIntValue2 + i : iIntValue + i;
                    AppBarLayout appBarLayout = this.t.p().b;
                    appBarLayout.setPadding(appBarLayout.getPaddingLeft(), iIntValue3, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
                    view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), i2);
                    return g2b.a;
                }
            }, view2);
        }
        LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModelQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        leaderboardDetailsHeaderViewModelQ.c(viewLifecycleOwner, new f36(0, this));
        q().M.e(getViewLifecycleOwner(), new LeaderboardDetailsHeaderFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<HeaderUiEntity, g2b>() { // from class: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment$onViewCreated$$inlined$observe$1
            @Override // defpackage.oh4
            public final g2b invoke(HeaderUiEntity headerUiEntity) {
                HeaderUiEntity headerUiEntity2 = headerUiEntity;
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                FragmentLeaderboardsDetailsHeaderBinding fragmentLeaderboardsDetailsHeaderBindingP2 = this.t.p();
                MaterialTextView materialTextView = fragmentLeaderboardsDetailsHeaderBindingP2.k;
                MaterialToolbar materialToolbar = fragmentLeaderboardsDetailsHeaderBindingP2.s;
                String str = headerUiEntity2.a;
                boolean z = headerUiEntity2.e;
                materialToolbar.setTitle(str);
                materialToolbar.setSubtitle(headerUiEntity2.b);
                ScrollView scrollView = fragmentLeaderboardsDetailsHeaderBindingP2.j;
                boolean z2 = headerUiEntity2.d;
                scrollView.setVisibility(z2 ? 0 : 8);
                if (z2) {
                    fragmentLeaderboardsDetailsHeaderBindingP2.f.setVisibility(z ? 0 : 8);
                    fragmentLeaderboardsDetailsHeaderBindingP2.h.setVisibility(!z ? 0 : 8);
                    if (!z) {
                        materialTextView.setText(headerUiEntity2.c);
                        p86.Companion.getClass();
                        materialTextView.setMovementMethod((p86) p86.a.getValue());
                        fragmentLeaderboardsDetailsHeaderBindingP2.p.setVisibility(headerUiEntity2.f ? 0 : 8);
                    }
                }
                return g2b.a;
            }
        }));
        q().K.e(getViewLifecycleOwner(), new LeaderboardDetailsHeaderFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<ExpandableDescriptionStatesUiEntity, g2b>() { // from class: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment$onViewCreated$$inlined$observe$2
            @Override // defpackage.oh4
            public final g2b invoke(ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity) {
                int iB;
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment = this.t;
                FragmentLeaderboardsDetailsHeaderBinding fragmentLeaderboardsDetailsHeaderBindingP2 = leaderboardDetailsHeaderFragment.p();
                MaterialTextView materialTextView = fragmentLeaderboardsDetailsHeaderBindingP2.k;
                ConstraintLayout constraintLayout = fragmentLeaderboardsDetailsHeaderBindingP2.h;
                View view3 = fragmentLeaderboardsDetailsHeaderBindingP2.i;
                MaterialTextView materialTextView2 = fragmentLeaderboardsDetailsHeaderBindingP2.m;
                int iOrdinal = expandableDescriptionStatesUiEntity.ordinal();
                if (iOrdinal != 0) {
                    int i = 1;
                    int i2 = 0;
                    if (iOrdinal == 1) {
                        materialTextView2.setVisibility(0);
                        xgb.c(view3, false);
                        iB = -2;
                    } else if (iOrdinal == 2) {
                        materialTextView.post(new e36(i2, fragmentLeaderboardsDetailsHeaderBindingP2));
                    } else if (iOrdinal == 3) {
                        constraintLayout.post(new nq1(i, fragmentLeaderboardsDetailsHeaderBindingP2));
                    } else {
                        if (iOrdinal != 4) {
                            u.b();
                            return null;
                        }
                        materialTextView2.setVisibility(0);
                        xgb.c(view3, true);
                        iB = wk6.b(leaderboardDetailsHeaderFragment.getResources().getDimension(R.dimen.leaderboard_description_collapsed_height));
                    }
                    androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                    cVar.c(constraintLayout);
                    cVar.d(materialTextView.getId(), iB);
                    qwa.a(fragmentLeaderboardsDetailsHeaderBindingP2.a, null);
                    cVar.a(constraintLayout);
                } else {
                    materialTextView.setVisibility(8);
                    materialTextView2.setVisibility(8);
                    view3.setVisibility(8);
                }
                return g2b.a;
            }
        }));
        q().L.e(getViewLifecycleOwner(), new LeaderboardDetailsHeaderFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<String, g2b>() { // from class: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment$onViewCreated$$inlined$observe$3
            @Override // defpackage.oh4
            public final g2b invoke(String str) {
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                this.t.p().m.setText(str);
                return g2b.a;
            }
        }));
        q().N.e(getViewLifecycleOwner(), new LeaderboardDetailsHeaderFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment$onViewCreated$$inlined$observe$4
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                this.t.p().n.setVisibility(zBooleanValue ? 0 : 8);
                return g2b.a;
            }
        }));
        q().O.e(getViewLifecycleOwner(), new LeaderboardDetailsHeaderFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment$onViewCreated$$inlined$observe$5
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment = this.t;
                if (zBooleanValue) {
                    final FragmentLeaderboardsDetailsHeaderBinding fragmentLeaderboardsDetailsHeaderBindingP2 = leaderboardDetailsHeaderFragment.p();
                    fragmentLeaderboardsDetailsHeaderBindingP2.e.post(new Runnable() { // from class: d36
                        @Override // java.lang.Runnable
                        public final void run() {
                            LeaderboardDetailsHeaderFragment.Companion companion2 = LeaderboardDetailsHeaderFragment.Companion;
                            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                            FragmentLeaderboardsDetailsHeaderBinding fragmentLeaderboardsDetailsHeaderBinding = fragmentLeaderboardsDetailsHeaderBindingP2;
                            ConstraintLayout constraintLayout = fragmentLeaderboardsDetailsHeaderBinding.c;
                            cVar.c(constraintLayout);
                            int id = fragmentLeaderboardsDetailsHeaderBinding.s.getId();
                            Integer numValueOf = Integer.valueOf(id);
                            HashMap<Integer, androidx.constraintlayout.widget.c.a> map = cVar.c;
                            androidx.constraintlayout.widget.c.b bVar = (map.containsKey(numValueOf) ? map.get(Integer.valueOf(id)) : null).d;
                            bVar.l = 0;
                            bVar.n = -1;
                            qc0 qc0Var = new qc0();
                            qc0Var.G(200L);
                            qwa.a(constraintLayout, qc0Var);
                            cVar.a(constraintLayout);
                        }
                    });
                } else {
                    FragmentLeaderboardsDetailsHeaderBinding fragmentLeaderboardsDetailsHeaderBindingP3 = leaderboardDetailsHeaderFragment.p();
                    androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                    ConstraintLayout constraintLayout = fragmentLeaderboardsDetailsHeaderBindingP3.c;
                    cVar.c(constraintLayout);
                    int id = fragmentLeaderboardsDetailsHeaderBindingP3.s.getId();
                    Integer numValueOf = Integer.valueOf(id);
                    HashMap<Integer, androidx.constraintlayout.widget.c.a> map = cVar.c;
                    androidx.constraintlayout.widget.c.b bVar = (map.containsKey(numValueOf) ? map.get(Integer.valueOf(id)) : null).d;
                    bVar.l = -1;
                    bVar.n = 0;
                    qc0 qc0Var = new qc0();
                    qc0Var.G(200L);
                    qwa.a(constraintLayout, qc0Var);
                    cVar.a(constraintLayout);
                }
                return g2b.a;
            }
        }));
        q().P.e(getViewLifecycleOwner(), new LeaderboardDetailsHeaderFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment$onViewCreated$$inlined$observe$6
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                this.t.p().e.setVisibility(zBooleanValue ? 0 : 8);
                return g2b.a;
            }
        }));
        q().Q.e(getViewLifecycleOwner(), new LeaderboardDetailsHeaderFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment$onViewCreated$$inlined$observe$7
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                this.t.p().q.setVisible(zBooleanValue);
                return g2b.a;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FragmentLeaderboardsDetailsHeaderBinding p() {
        T tA = this.A.a(this, C[0]);
        tA.getClass();
        return (FragmentLeaderboardsDetailsHeaderBinding) tA;
    }

    public final LeaderboardDetailsHeaderViewModel q() {
        return (LeaderboardDetailsHeaderViewModel) this.B.getValue();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static LeaderboardDetailsHeaderFragment a(int i, String str, String str2, String str3, boolean z) {
            str.getClass();
            LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment = new LeaderboardDetailsHeaderFragment();
            leaderboardDetailsHeaderFragment.setArguments(uy0.c(new js7("leaderboard_id", Integer.valueOf(i)), new js7("leaderboard_title", str), new js7("leaderboard_description", str2), new js7("leaderboard_updated_at_desc", str3), new js7("allow_navigate_to_tracking", Boolean.valueOf(z))));
            return leaderboardDetailsHeaderFragment;
        }

        private Companion() {
        }
    }
}
