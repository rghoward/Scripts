package com.hwpo_training_app.leaderboards.filter.details.presentation.screen;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.hwpo_training_app.leaderboards.databinding.DialogLeaderboardDetailsFiltersBinding;
import com.hwpo_training_app.leaderboards.databinding.LayoutGymFilterBinding;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersExtensionsKt;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersEvents;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity.AgeRangeStateUiEntity;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity.GenderCheckboxesStateUiEntity;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity.ScoreStatusCheckboxesStateUiEntity;
import com.hwpo_training_app.leaderboards.filter.presentation.ExtensionsKt;
import com.hwpo_training_app.leaderboards.filter.presentation.SelectedGymFilterUiEntity;
import defpackage.bg0;
import defpackage.g2b;
import defpackage.ho5;
import defpackage.hv5;
import defpackage.j26;
import defpackage.ll8;
import defpackage.m76;
import defpackage.ne8;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.shb;
import defpackage.ss5;
import defpackage.t26;
import defpackage.tb;
import defpackage.u26;
import defpackage.vg4;
import defpackage.xgb;
import defpackage.z2a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsFiltersFragment extends Hilt_LeaderboardDetailsFiltersFragment {
    public final vg4 A = new vg4(new oh4<LeaderboardDetailsFiltersFragment, DialogLeaderboardDetailsFiltersBinding>() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$special$$inlined$viewBindingFragment$default$1
        @Override // defpackage.oh4
        public final DialogLeaderboardDetailsFiltersBinding invoke(LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment) {
            LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment2 = leaderboardDetailsFiltersFragment;
            leaderboardDetailsFiltersFragment2.getClass();
            return DialogLeaderboardDetailsFiltersBinding.bind(leaderboardDetailsFiltersFragment2.requireView());
        }
    });
    public final vg4 B = new vg4(new oh4<LeaderboardDetailsFiltersFragment, LayoutGymFilterBinding>() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$special$$inlined$viewBindingFragment$default$2
        @Override // defpackage.oh4
        public final LayoutGymFilterBinding invoke(LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment) {
            LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment2 = leaderboardDetailsFiltersFragment;
            leaderboardDetailsFiltersFragment2.getClass();
            return LayoutGymFilterBinding.bind(leaderboardDetailsFiltersFragment2.requireView());
        }
    });
    public boolean C;
    public final shb D;
    public final o7a E;
    public static final /* synthetic */ ho5<Object>[] F = {new ne8(LeaderboardDetailsFiltersFragment.class, "binding", "getBinding()Lcom/hwpo_training_app/leaderboards/databinding/DialogLeaderboardDetailsFiltersBinding;", 0), new ne8(LeaderboardDetailsFiltersFragment.class, "mergedBinding", "getMergedBinding()Lcom/hwpo_training_app/leaderboards/databinding/LayoutGymFilterBinding;", 0)};
    public static final Companion Companion = new Companion(0);

    public LeaderboardDetailsFiltersFragment() {
        ss5 ss5VarC = hv5.c(j26.u, new LeaderboardDetailsFiltersFragment$special$$inlined$viewModels$default$2(new LeaderboardDetailsFiltersFragment$special$$inlined$viewModels$default$1(this)));
        this.D = new shb(ll8.a(LeaderboardDetailsFiltersViewModel.class), new LeaderboardDetailsFiltersFragment$special$$inlined$viewModels$default$3(ss5VarC), new LeaderboardDetailsFiltersFragment$special$$inlined$viewModels$default$5(this, ss5VarC), new LeaderboardDetailsFiltersFragment$special$$inlined$viewModels$default$4(ss5VarC));
        this.E = new o7a(new tb(1, this));
    }

    @Override // defpackage.hk0
    public final void i() {
        DialogLeaderboardDetailsFiltersBinding dialogLeaderboardDetailsFiltersBindingP = p();
        xgb.a(dialogLeaderboardDetailsFiltersBindingP.g, new LeaderboardDetailsFiltersFragment$initListeners$1$1(this, null));
        dialogLeaderboardDetailsFiltersBindingP.p.setNavigationOnClickListener(new View.OnClickListener() { // from class: s26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
                this.t.s().f(LeaderboardDetailsFiltersEvents.CloseDialog.b);
            }
        });
        xgb.a(r().f, new LeaderboardDetailsFiltersFragment$initListeners$1$3(this, null));
        xgb.a(r().b, new LeaderboardDetailsFiltersFragment$initListeners$1$4(this, null));
        xgb.a(dialogLeaderboardDetailsFiltersBindingP.c, new LeaderboardDetailsFiltersFragment$initListeners$1$5(this, null));
        xgb.a(dialogLeaderboardDetailsFiltersBindingP.l, new LeaderboardDetailsFiltersFragment$initListeners$1$6(this, null));
        xgb.a(dialogLeaderboardDetailsFiltersBindingP.j, new LeaderboardDetailsFiltersFragment$initListeners$1$7(this, null));
        xgb.a(dialogLeaderboardDetailsFiltersBindingP.m, new LeaderboardDetailsFiltersFragment$initListeners$1$8(this, null));
        xgb.a(dialogLeaderboardDetailsFiltersBindingP.n, new LeaderboardDetailsFiltersFragment$initListeners$1$9(this, null));
        dialogLeaderboardDetailsFiltersBindingP.f.addTextChangedListener(new TextWatcher() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$initListeners$lambda$0$$inlined$addTextChangedListener$default$1
            /* JADX WARN: Code duplicated, block: B:12:0x001c  */
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment = this.t;
                if (leaderboardDetailsFiltersFragment.C) {
                    return;
                }
                LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModelS = leaderboardDetailsFiltersFragment.s();
                if (editable == null) {
                    string = null;
                } else {
                    if (z2a.w(editable)) {
                        editable = null;
                    }
                    if (editable != null) {
                        string = editable.toString();
                    } else {
                        string = null;
                    }
                }
                LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModelD = LeaderboardDetailsFiltersModel.d(leaderboardDetailsFiltersViewModelS.C, false, false, false, string != null ? Integer.valueOf(Integer.parseInt(string)) : null, null, null, null, null, false, 503);
                leaderboardDetailsFiltersViewModelS.C = leaderboardDetailsFiltersModelD;
                leaderboardDetailsFiltersViewModelS.e(new LeaderboardDetailsFiltersViewModel.Action.ChangeApplyButtonState(LeaderboardDetailsFiltersExtensionsKt.a(leaderboardDetailsFiltersModelD, leaderboardDetailsFiltersViewModelS.B)));
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        dialogLeaderboardDetailsFiltersBindingP.e.addTextChangedListener(new TextWatcher() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$initListeners$lambda$0$$inlined$addTextChangedListener$default$2
            /* JADX WARN: Code duplicated, block: B:12:0x001c  */
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment = this.t;
                if (leaderboardDetailsFiltersFragment.C) {
                    return;
                }
                LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModelS = leaderboardDetailsFiltersFragment.s();
                if (editable == null) {
                    string = null;
                } else {
                    if (z2a.w(editable)) {
                        editable = null;
                    }
                    if (editable != null) {
                        string = editable.toString();
                    } else {
                        string = null;
                    }
                }
                LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModelD = LeaderboardDetailsFiltersModel.d(leaderboardDetailsFiltersViewModelS.C, false, false, false, null, string != null ? Integer.valueOf(Integer.parseInt(string)) : null, null, null, null, false, 495);
                leaderboardDetailsFiltersViewModelS.C = leaderboardDetailsFiltersModelD;
                leaderboardDetailsFiltersViewModelS.e(new LeaderboardDetailsFiltersViewModel.Action.ChangeApplyButtonState(LeaderboardDetailsFiltersExtensionsKt.a(leaderboardDetailsFiltersModelD, leaderboardDetailsFiltersViewModelS.B)));
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        xgb.a(dialogLeaderboardDetailsFiltersBindingP.o, new LeaderboardDetailsFiltersFragment$initListeners$1$12(this, null));
        xgb.a(dialogLeaderboardDetailsFiltersBindingP.k, new LeaderboardDetailsFiltersFragment$initListeners$1$13(this, null));
        dialogLeaderboardDetailsFiltersBindingP.b.setOnExpansionUpdateListener(new t26(dialogLeaderboardDetailsFiltersBindingP));
        getParentFragmentManager().f0("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.AFFILIATED_GYM_UPDATED_KEY", getViewLifecycleOwner(), new u26(this));
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        i();
        LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModelS = s();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        leaderboardDetailsFiltersViewModelS.c(viewLifecycleOwner, new bg0(1, this));
        s().D.e(getViewLifecycleOwner(), new LeaderboardDetailsFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<GenderCheckboxesStateUiEntity, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$listenStates$$inlined$observe$1
            @Override // defpackage.oh4
            public final g2b invoke(GenderCheckboxesStateUiEntity genderCheckboxesStateUiEntity) {
                GenderCheckboxesStateUiEntity genderCheckboxesStateUiEntity2 = genderCheckboxesStateUiEntity;
                LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
                LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment = this.t;
                DialogLeaderboardDetailsFiltersBinding dialogLeaderboardDetailsFiltersBindingP = leaderboardDetailsFiltersFragment.p();
                dialogLeaderboardDetailsFiltersBindingP.l.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, leaderboardDetailsFiltersFragment.q(genderCheckboxesStateUiEntity2.a), (Drawable) null);
                dialogLeaderboardDetailsFiltersBindingP.j.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, leaderboardDetailsFiltersFragment.q(genderCheckboxesStateUiEntity2.b), (Drawable) null);
                dialogLeaderboardDetailsFiltersBindingP.m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, leaderboardDetailsFiltersFragment.q(genderCheckboxesStateUiEntity2.c), (Drawable) null);
                return g2b.a;
            }
        }));
        s().E.e(getViewLifecycleOwner(), new LeaderboardDetailsFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<ScoreStatusCheckboxesStateUiEntity, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$listenStates$$inlined$observe$2
            @Override // defpackage.oh4
            public final g2b invoke(ScoreStatusCheckboxesStateUiEntity scoreStatusCheckboxesStateUiEntity) {
                ScoreStatusCheckboxesStateUiEntity scoreStatusCheckboxesStateUiEntity2 = scoreStatusCheckboxesStateUiEntity;
                LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
                if (scoreStatusCheckboxesStateUiEntity2 != null) {
                    boolean z = scoreStatusCheckboxesStateUiEntity2.a;
                    LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment = this.t;
                    DialogLeaderboardDetailsFiltersBinding dialogLeaderboardDetailsFiltersBindingP = leaderboardDetailsFiltersFragment.p();
                    dialogLeaderboardDetailsFiltersBindingP.o.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, leaderboardDetailsFiltersFragment.q(!z), (Drawable) null);
                    dialogLeaderboardDetailsFiltersBindingP.k.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, leaderboardDetailsFiltersFragment.q(z), (Drawable) null);
                }
                return g2b.a;
            }
        }));
        s().F.e(getViewLifecycleOwner(), new LeaderboardDetailsFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<AgeRangeStateUiEntity, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$listenStates$$inlined$observe$3
            @Override // defpackage.oh4
            public final g2b invoke(AgeRangeStateUiEntity ageRangeStateUiEntity) {
                AgeRangeStateUiEntity ageRangeStateUiEntity2 = ageRangeStateUiEntity;
                LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
                LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment = this.t;
                DialogLeaderboardDetailsFiltersBinding dialogLeaderboardDetailsFiltersBindingP = leaderboardDetailsFiltersFragment.p();
                dialogLeaderboardDetailsFiltersBindingP.n.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, leaderboardDetailsFiltersFragment.q(ageRangeStateUiEntity2.a), (Drawable) null);
                dialogLeaderboardDetailsFiltersBindingP.b.setExpanded(ageRangeStateUiEntity2.a);
                leaderboardDetailsFiltersFragment.C = true;
                dialogLeaderboardDetailsFiltersBindingP.f.setText(ageRangeStateUiEntity2.b);
                dialogLeaderboardDetailsFiltersBindingP.e.setText(ageRangeStateUiEntity2.c);
                leaderboardDetailsFiltersFragment.C = false;
                return g2b.a;
            }
        }));
        s().G.e(getViewLifecycleOwner(), new LeaderboardDetailsFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$listenStates$$inlined$observe$4
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
                this.t.p().c.setEnabled(zBooleanValue);
                return g2b.a;
            }
        }));
        s().H.e(getViewLifecycleOwner(), new LeaderboardDetailsFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$listenStates$$inlined$observe$5
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
                DialogLeaderboardDetailsFiltersBinding dialogLeaderboardDetailsFiltersBindingP = this.t.p();
                dialogLeaderboardDetailsFiltersBindingP.d.setVisibility(zBooleanValue ? 0 : 8);
                dialogLeaderboardDetailsFiltersBindingP.h.setVisibility(zBooleanValue ? 0 : 8);
                return g2b.a;
            }
        }));
        s().I.e(getViewLifecycleOwner(), new LeaderboardDetailsFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<SelectedGymFilterUiEntity, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$listenStates$$inlined$observe$6
            @Override // defpackage.oh4
            public final g2b invoke(SelectedGymFilterUiEntity selectedGymFilterUiEntity) {
                LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
                LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment = this.t;
                ExtensionsKt.a(selectedGymFilterUiEntity, leaderboardDetailsFiltersFragment.r().f, leaderboardDetailsFiltersFragment.r().e, leaderboardDetailsFiltersFragment.r().c);
                return g2b.a;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DialogLeaderboardDetailsFiltersBinding p() {
        T tC = this.A.a(this, F[0]);
        tC.getClass();
        return (DialogLeaderboardDetailsFiltersBinding) tC;
    }

    public final Drawable q(boolean z) {
        if (z) {
            return (Drawable) this.E.getValue();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LayoutGymFilterBinding r() {
        T tC = this.B.a(this, F[1]);
        tC.getClass();
        return (LayoutGymFilterBinding) tC;
    }

    public final LeaderboardDetailsFiltersViewModel s() {
        return (LeaderboardDetailsFiltersViewModel) this.D.getValue();
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
