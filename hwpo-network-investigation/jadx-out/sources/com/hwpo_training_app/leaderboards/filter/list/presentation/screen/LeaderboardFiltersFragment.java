package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import androidx.fragment.app.l;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.databinding.DialogLeaderboardFiltersBinding;
import com.hwpo_training_app.leaderboards.databinding.LayoutGymFilterBinding;
import com.hwpo_training_app.leaderboards.databinding.LayoutLeaderboardFilterDatesBinding;
import com.hwpo_training_app.leaderboards.databinding.LayoutLeaderboardFilterDaysBinding;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel;
import com.hwpo_training_app.leaderboards.filter.presentation.ExtensionsKt;
import com.hwpo_training_app.leaderboards.filter.presentation.SelectedGymFilterUiEntity;
import defpackage.e21;
import defpackage.g2b;
import defpackage.gm3;
import defpackage.ho5;
import defpackage.hv5;
import defpackage.j26;
import defpackage.ll8;
import defpackage.m36;
import defpackage.m76;
import defpackage.ne8;
import defpackage.oh4;
import defpackage.pf4;
import defpackage.r36;
import defpackage.shb;
import defpackage.ss5;
import defpackage.v2a;
import defpackage.vg4;
import defpackage.xgb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardFiltersFragment extends Hilt_LeaderboardFiltersFragment {
    public final InputFilter[] A = {new r36(), new InputFilter.LengthFilter(8)};
    public final LeaderboardFiltersFragment$dayFromInputListener$1 B = new TextWatcher() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$dayFromInputListener$1
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string;
            LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
            LeaderboardFiltersViewModel leaderboardFiltersViewModelR = this.t.r();
            leaderboardFiltersViewModelR.C = LeaderboardFiltersModel.d(leaderboardFiltersViewModelR.C, false, false, null, null, (editable == null || (string = editable.toString()) == null) ? null : v2a.f(string), null, false, null, null, false, 8063);
            leaderboardFiltersViewModelR.g();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };
    public final LeaderboardFiltersFragment$dayToInputListener$1 C = new TextWatcher() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$dayToInputListener$1
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string;
            LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
            LeaderboardFiltersViewModel leaderboardFiltersViewModelR = this.t.r();
            leaderboardFiltersViewModelR.C = LeaderboardFiltersModel.d(leaderboardFiltersViewModelR.C, false, false, null, null, null, (editable == null || (string = editable.toString()) == null) ? null : v2a.f(string), false, null, null, false, 7935);
            leaderboardFiltersViewModelR.g();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };
    public final vg4 D = new vg4(new oh4<LeaderboardFiltersFragment, DialogLeaderboardFiltersBinding>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$special$$inlined$viewBindingFragment$default$1
        @Override // defpackage.oh4
        public final DialogLeaderboardFiltersBinding invoke(LeaderboardFiltersFragment leaderboardFiltersFragment) {
            LeaderboardFiltersFragment leaderboardFiltersFragment2 = leaderboardFiltersFragment;
            leaderboardFiltersFragment2.getClass();
            return DialogLeaderboardFiltersBinding.bind(leaderboardFiltersFragment2.requireView());
        }
    });
    public final vg4 E = new vg4(new oh4<LeaderboardFiltersFragment, LayoutGymFilterBinding>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$special$$inlined$viewBindingFragment$default$2
        @Override // defpackage.oh4
        public final LayoutGymFilterBinding invoke(LeaderboardFiltersFragment leaderboardFiltersFragment) {
            LeaderboardFiltersFragment leaderboardFiltersFragment2 = leaderboardFiltersFragment;
            leaderboardFiltersFragment2.getClass();
            return LayoutGymFilterBinding.bind(leaderboardFiltersFragment2.requireView());
        }
    });
    public final shb F;
    public static final /* synthetic */ ho5<Object>[] G = {new ne8(LeaderboardFiltersFragment.class, "binding", "getBinding()Lcom/hwpo_training_app/leaderboards/databinding/DialogLeaderboardFiltersBinding;", 0), new ne8(LeaderboardFiltersFragment.class, "mergedBinding", "getMergedBinding()Lcom/hwpo_training_app/leaderboards/databinding/LayoutGymFilterBinding;", 0)};
    public static final Companion Companion = new Companion(0);

    /* JADX WARN: Type inference failed for: r0v2, types: [com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$dayFromInputListener$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$dayToInputListener$1] */
    public LeaderboardFiltersFragment() {
        ss5 ss5VarC = hv5.c(j26.u, new LeaderboardFiltersFragment$special$$inlined$viewModels$default$2(new LeaderboardFiltersFragment$special$$inlined$viewModels$default$1(this)));
        this.F = new shb(ll8.a(LeaderboardFiltersViewModel.class), new LeaderboardFiltersFragment$special$$inlined$viewModels$default$3(ss5VarC), new LeaderboardFiltersFragment$special$$inlined$viewModels$default$5(this, ss5VarC), new LeaderboardFiltersFragment$special$$inlined$viewModels$default$4(ss5VarC));
    }

    @Override // defpackage.hk0
    public final void i() {
        DialogLeaderboardFiltersBinding dialogLeaderboardFiltersBindingP = p();
        xgb.a(dialogLeaderboardFiltersBindingP.h, new LeaderboardFiltersFragment$initListeners$1$1(this, null));
        xgb.a(q().f, new LeaderboardFiltersFragment$initListeners$1$2(this, null));
        xgb.a(dialogLeaderboardFiltersBindingP.b, new LeaderboardFiltersFragment$initListeners$1$3(this, null));
        xgb.a(q().b, new LeaderboardFiltersFragment$initListeners$1$4(this, null));
        dialogLeaderboardFiltersBindingP.i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n36
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                compoundButton.getClass();
                LeaderboardFiltersViewModel leaderboardFiltersViewModelR = this.a.r();
                leaderboardFiltersViewModelR.C = LeaderboardFiltersModel.d(leaderboardFiltersViewModelR.C, false, false, null, null, null, null, z, null, null, false, 7679);
                leaderboardFiltersViewModelR.g();
            }
        });
        dialogLeaderboardFiltersBindingP.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o36
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                compoundButton.getClass();
                LeaderboardFiltersViewModel leaderboardFiltersViewModelR = this.a.r();
                leaderboardFiltersViewModelR.C = LeaderboardFiltersModel.d(leaderboardFiltersViewModelR.C, z, false, null, null, null, null, false, null, null, false, 8183);
                leaderboardFiltersViewModelR.g();
            }
        });
        dialogLeaderboardFiltersBindingP.d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p36
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                compoundButton.getClass();
                LeaderboardFiltersViewModel leaderboardFiltersViewModelR = this.a.r();
                leaderboardFiltersViewModelR.C = LeaderboardFiltersModel.d(leaderboardFiltersViewModelR.C, false, z, null, null, null, null, false, null, null, false, 8175);
                leaderboardFiltersViewModelR.g();
            }
        });
        LayoutLeaderboardFilterDatesBinding layoutLeaderboardFilterDatesBinding = dialogLeaderboardFiltersBindingP.e;
        xgb.a(layoutLeaderboardFilterDatesBinding.b, new LeaderboardFiltersFragment$initListeners$1$8(this, null));
        xgb.a(layoutLeaderboardFilterDatesBinding.c, new LeaderboardFiltersFragment$initListeners$1$9(this, null));
        LayoutLeaderboardFilterDaysBinding layoutLeaderboardFilterDaysBinding = dialogLeaderboardFiltersBindingP.f;
        layoutLeaderboardFilterDaysBinding.b.addTextChangedListener(this.B);
        layoutLeaderboardFilterDaysBinding.c.addTextChangedListener(this.C);
        getParentFragmentManager().f0("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.AFFILIATED_GYM_UPDATED_KEY", getViewLifecycleOwner(), new pf4() { // from class: q36
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                String string;
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                int i = bundle.getInt("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.SELECTED_GYM_ID_KEY");
                Integer numValueOf = Integer.valueOf(i);
                if (i == 0) {
                    numValueOf = null;
                }
                if (numValueOf == null || (string = bundle.getString("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.SELECTED_GYM_NAME_KEY")) == null) {
                    return;
                }
                LeaderboardFiltersViewModel leaderboardFiltersViewModelR = this.t.r();
                leaderboardFiltersViewModelR.C = LeaderboardFiltersModel.d(leaderboardFiltersViewModelR.C, false, false, null, null, null, null, false, null, new js7(numValueOf, string), false, 2047);
                leaderboardFiltersViewModelR.g();
            }
        });
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        DialogLeaderboardFiltersBinding dialogLeaderboardFiltersBindingP = p();
        MaterialToolbar materialToolbar = dialogLeaderboardFiltersBindingP.j;
        ConstraintLayout constraintLayout = dialogLeaderboardFiltersBindingP.a;
        constraintLayout.getClass();
        xgb.g(materialToolbar, R.drawable.ic_close_results_dialog, constraintLayout.getContext().getColor(R.color.colorPrimary));
        materialToolbar.setNavigationOnClickListener(new m36(this, 0));
        LayoutLeaderboardFilterDaysBinding layoutLeaderboardFilterDaysBinding = p().f;
        AppCompatEditText appCompatEditText = layoutLeaderboardFilterDaysBinding.b;
        InputFilter[] inputFilterArr = this.A;
        appCompatEditText.setFilters(inputFilterArr);
        layoutLeaderboardFilterDaysBinding.c.setFilters(inputFilterArr);
        i();
        LeaderboardFiltersViewModel leaderboardFiltersViewModelR = r();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        leaderboardFiltersViewModelR.c(viewLifecycleOwner, new oh4() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.a
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                gm3Var.getClass();
                boolean z = gm3Var instanceof LeaderboardFiltersEvents.CloseDialog;
                LeaderboardFiltersFragment leaderboardFiltersFragment = this.t;
                if (z) {
                    f parentFragment = leaderboardFiltersFragment.getParentFragment();
                    e eVar = parentFragment instanceof e ? (e) parentFragment : null;
                    if (eVar != null) {
                        eVar.i();
                    }
                } else if (gm3Var instanceof LeaderboardFiltersEvents.ShowCalendarFromDateEvent) {
                    LeaderboardFiltersEvents.ShowCalendarFromDateEvent showCalendarFromDateEvent = (LeaderboardFiltersEvents.ShowCalendarFromDateEvent) gm3Var;
                    e21.a aVar = e21.Companion;
                    long j = showCalendarFromDateEvent.b;
                    Long lValueOf = Long.valueOf(showCalendarFromDateEvent.c);
                    aVar.getClass();
                    e21 e21VarA = e21.a.a(j, null, lValueOf);
                    e21VarA.J = new LeaderboardFiltersFragment$showDateFromCalendar$1$1(1, leaderboardFiltersFragment.r(), LeaderboardFiltersViewModel.class, "onDateFromSelected", "onDateFromSelected(Ljava/time/LocalDate;)V", 0);
                    l childFragmentManager = leaderboardFiltersFragment.getChildFragmentManager();
                    childFragmentManager.getClass();
                    e21VarA.o(childFragmentManager, e21.class.getName());
                } else if (gm3Var instanceof LeaderboardFiltersEvents.ShowCalendarToDateEvent) {
                    LeaderboardFiltersEvents.ShowCalendarToDateEvent showCalendarToDateEvent = (LeaderboardFiltersEvents.ShowCalendarToDateEvent) gm3Var;
                    e21.a aVar2 = e21.Companion;
                    long j2 = showCalendarToDateEvent.b;
                    Long l = showCalendarToDateEvent.c;
                    Long lValueOf2 = Long.valueOf(showCalendarToDateEvent.d);
                    aVar2.getClass();
                    e21 e21VarA2 = e21.a.a(j2, l, lValueOf2);
                    e21VarA2.J = new LeaderboardFiltersFragment$showDateToCalendar$1$1(1, leaderboardFiltersFragment.r(), LeaderboardFiltersViewModel.class, "onDateToSelected", "onDateToSelected(Ljava/time/LocalDate;)V", 0);
                    l childFragmentManager2 = leaderboardFiltersFragment.getChildFragmentManager();
                    childFragmentManager2.getClass();
                    e21VarA2.o(childFragmentManager2, e21.class.getName());
                }
                return g2b.a;
            }
        });
        r().D.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$1
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                this.t.p().g.setChecked(zBooleanValue);
                return g2b.a;
            }
        }));
        r().E.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$2
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                this.t.p().d.setChecked(zBooleanValue);
                return g2b.a;
            }
        }));
        r().G.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$3
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                this.t.p().i.setChecked(zBooleanValue);
                return g2b.a;
            }
        }));
        r().F.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<SelectedGymFilterUiEntity, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$4
            @Override // defpackage.oh4
            public final g2b invoke(SelectedGymFilterUiEntity selectedGymFilterUiEntity) {
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                LeaderboardFiltersFragment leaderboardFiltersFragment = this.t;
                ExtensionsKt.a(selectedGymFilterUiEntity, leaderboardFiltersFragment.q().f, leaderboardFiltersFragment.q().e, leaderboardFiltersFragment.q().c);
                return g2b.a;
            }
        }));
        r().H.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<String, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$5
            @Override // defpackage.oh4
            public final g2b invoke(String str) {
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                this.t.p().e.d.setText(str);
                return g2b.a;
            }
        }));
        r().I.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<String, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$6
            @Override // defpackage.oh4
            public final g2b invoke(String str) {
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                this.t.p().e.e.setText(str);
                return g2b.a;
            }
        }));
        r().J.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<String, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$7
            @Override // defpackage.oh4
            public final g2b invoke(String str) {
                String str2 = str;
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                LeaderboardFiltersFragment leaderboardFiltersFragment = this.t;
                LayoutLeaderboardFilterDaysBinding layoutLeaderboardFilterDaysBinding2 = leaderboardFiltersFragment.p().f;
                AppCompatEditText appCompatEditText2 = layoutLeaderboardFilterDaysBinding2.b;
                LeaderboardFiltersFragment$dayFromInputListener$1 leaderboardFiltersFragment$dayFromInputListener$1 = leaderboardFiltersFragment.B;
                appCompatEditText2.removeTextChangedListener(leaderboardFiltersFragment$dayFromInputListener$1);
                AppCompatEditText appCompatEditText3 = layoutLeaderboardFilterDaysBinding2.b;
                appCompatEditText3.setText(str2);
                appCompatEditText3.setSelection(str2 != null ? str2.length() : 0);
                appCompatEditText3.addTextChangedListener(leaderboardFiltersFragment$dayFromInputListener$1);
                return g2b.a;
            }
        }));
        r().K.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<String, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$8
            @Override // defpackage.oh4
            public final g2b invoke(String str) {
                String str2 = str;
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                LeaderboardFiltersFragment leaderboardFiltersFragment = this.t;
                LayoutLeaderboardFilterDaysBinding layoutLeaderboardFilterDaysBinding2 = leaderboardFiltersFragment.p().f;
                AppCompatEditText appCompatEditText2 = layoutLeaderboardFilterDaysBinding2.c;
                LeaderboardFiltersFragment$dayToInputListener$1 leaderboardFiltersFragment$dayToInputListener$1 = leaderboardFiltersFragment.C;
                appCompatEditText2.removeTextChangedListener(leaderboardFiltersFragment$dayToInputListener$1);
                AppCompatEditText appCompatEditText3 = layoutLeaderboardFilterDaysBinding2.c;
                appCompatEditText3.setText(str2);
                appCompatEditText3.setSelection(str2 != null ? str2.length() : 0);
                appCompatEditText3.addTextChangedListener(leaderboardFiltersFragment$dayToInputListener$1);
                return g2b.a;
            }
        }));
        r().M.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$9
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                LeaderboardFiltersFragment leaderboardFiltersFragment = this.t;
                LinearLayoutCompat linearLayoutCompat = leaderboardFiltersFragment.p().f.a;
                linearLayoutCompat.getClass();
                linearLayoutCompat.setVisibility(zBooleanValue ? 0 : 8);
                LinearLayoutCompat linearLayoutCompat2 = leaderboardFiltersFragment.p().e.a;
                linearLayoutCompat2.getClass();
                linearLayoutCompat2.setVisibility(zBooleanValue ? 8 : 0);
                return g2b.a;
            }
        }));
        r().L.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$10
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                this.t.p().b.setEnabled(zBooleanValue);
                return g2b.a;
            }
        }));
        r().N.e(getViewLifecycleOwner(), new LeaderboardFiltersFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$listenStates$$inlined$observe$11
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                this.t.p().c.setVisibility(zBooleanValue ? 0 : 8);
                return g2b.a;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DialogLeaderboardFiltersBinding p() {
        T tA = this.D.a(this, G[0]);
        tA.getClass();
        return (DialogLeaderboardFiltersBinding) tA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LayoutGymFilterBinding q() {
        T tA = this.E.a(this, G[1]);
        tA.getClass();
        return (LayoutGymFilterBinding) tA;
    }

    public final LeaderboardFiltersViewModel r() {
        return (LeaderboardFiltersViewModel) this.F.getValue();
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
