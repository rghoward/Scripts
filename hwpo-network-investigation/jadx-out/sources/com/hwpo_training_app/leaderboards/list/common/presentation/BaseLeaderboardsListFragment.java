package com.hwpo_training_app.leaderboards.list.common.presentation;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;
import com.hwpo_training_app.leaderboards.databinding.FragmentLeaderboardsListBinding;
import com.hwpo_training_app.leaderboards.list.common.presentation.adapter.LeaderboardsListAdapter;
import com.hwpo_training_app.leaderboards.list.common.presentation.adapter.decorator.LeaderboardItemDecorator;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity;
import defpackage.g2b;
import defpackage.hk0;
import defpackage.ho5;
import defpackage.jk0;
import defpackage.kk0;
import defpackage.lk0;
import defpackage.m76;
import defpackage.mh4;
import defpackage.ne8;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.vg4;
import defpackage.vz7;
import defpackage.wk6;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseLeaderboardsListFragment extends hk0 {
    public static final /* synthetic */ ho5<Object>[] z = {new ne8(BaseLeaderboardsListFragment.class, "binding", "getBinding()Lcom/hwpo_training_app/leaderboards/databinding/FragmentLeaderboardsListBinding;", 0)};
    public final vg4 v;
    public BaseLeaderboardsListViewModel w;
    public final RecyclerView.u x;
    public final o7a y;

    public BaseLeaderboardsListFragment() {
        super(R.layout.fragment_leaderboards_list);
        this.v = new vg4(new oh4<BaseLeaderboardsListFragment, FragmentLeaderboardsListBinding>() { // from class: com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListFragment$special$$inlined$viewBindingFragment$default$1
            @Override // defpackage.oh4
            public final FragmentLeaderboardsListBinding invoke(BaseLeaderboardsListFragment baseLeaderboardsListFragment) {
                BaseLeaderboardsListFragment baseLeaderboardsListFragment2 = baseLeaderboardsListFragment;
                baseLeaderboardsListFragment2.getClass();
                return FragmentLeaderboardsListBinding.bind(baseLeaderboardsListFragment2.requireView());
            }
        });
        this.x = new RecyclerView.u();
        this.y = new o7a(new mh4() { // from class: com.hwpo_training_app.leaderboards.list.common.presentation.a
            @Override // defpackage.mh4
            public final Object invoke() {
                BaseLeaderboardsListFragment baseLeaderboardsListFragment = this.t;
                return new LeaderboardsListAdapter(baseLeaderboardsListFragment.x, new BaseLeaderboardsListFragment$adapter$2$1(1, baseLeaderboardsListFragment.p(), BaseLeaderboardsListViewModel.class, "onLeaderboardItemClicked", "onLeaderboardItemClicked(Lcom/hwpo_training_app/leaderboards/list/common/presentation/entity/LeaderboardItemUiEntity;)V", 0), new BaseLeaderboardsListFragment$adapter$2$3(1, baseLeaderboardsListFragment.p(), BaseLeaderboardsListViewModel.class, "onLeaderboardScoresClicked", "onLeaderboardScoresClicked(Lcom/hwpo_training_app/leaderboards/list/common/presentation/entity/TopValueUiEntity;)V", 0), new BaseLeaderboardsListFragment$adapter$2$2(1, baseLeaderboardsListFragment.p(), BaseLeaderboardsListViewModel.class, "onTopValueItemClicked", "onTopValueItemClicked(Lcom/hwpo_training_app/leaderboards/list/common/presentation/entity/TopValueUiEntity;)V", 0), new BaseLeaderboardsListFragment$adapter$2$4(1, baseLeaderboardsListFragment.p(), BaseLeaderboardsListViewModel.class, "onOpenLeaderboardClicked", "onOpenLeaderboardClicked(Lcom/hwpo_training_app/leaderboards/list/common/presentation/entity/TopValueUiEntity;)V", 0), new BaseLeaderboardsListFragment$adapter$2$5(1, baseLeaderboardsListFragment.p(), BaseLeaderboardsListViewModel.class, "onItemShown", "onItemShown(I)V", 0));
            }
        });
    }

    @Override // defpackage.hk0
    public final void i() {
        o().b.setOnRefreshListener(new lk0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FragmentLeaderboardsListBinding o() {
        T tA = this.v.a(this, z[0]);
        tA.getClass();
        return (FragmentLeaderboardsListBinding) tA;
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        FragmentLeaderboardsListBinding fragmentLeaderboardsListBindingO = o();
        fragmentLeaderboardsListBindingO.b.setColorSchemeResources(R.color.colorPrimary);
        RecyclerView recyclerView = fragmentLeaderboardsListBindingO.c;
        recyclerView.setAdapter((LeaderboardsListAdapter) this.y.getValue());
        int dimension = (int) getResources().getDimension(R.dimen.default_margin);
        SwipeRefreshLayout swipeRefreshLayout = fragmentLeaderboardsListBindingO.a;
        swipeRefreshLayout.getClass();
        recyclerView.h(new LeaderboardItemDecorator(dimension, dimension, dimension, dimension, wk6.b(swipeRefreshLayout.getResources().getDimension(R.dimen.program_search_result_item_divider_height))));
        BaseLeaderboardsListViewModel baseLeaderboardsListViewModelP = p();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        baseLeaderboardsListViewModelP.c(viewLifecycleOwner, new kk0(0, this));
        p().D.e(getViewLifecycleOwner(), new BaseLeaderboardsListFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<List<? extends LeaderboardItemUiEntity>, g2b>() { // from class: com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListFragment$onViewCreated$$inlined$observe$1
            @Override // defpackage.oh4
            public final g2b invoke(List<? extends LeaderboardItemUiEntity> list) {
                ho5<Object>[] ho5VarArr = BaseLeaderboardsListFragment.z;
                ((LeaderboardsListAdapter) this.t.y.getValue()).u(list);
                return g2b.a;
            }
        }));
        p().E.e(getViewLifecycleOwner(), new BaseLeaderboardsListFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<vz7, g2b>() { // from class: com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListFragment$onViewCreated$$inlined$observe$2
            @Override // defpackage.oh4
            public final g2b invoke(vz7 vz7Var) {
                vz7 vz7Var2 = vz7Var;
                ho5<Object>[] ho5VarArr = BaseLeaderboardsListFragment.z;
                BaseLeaderboardsListFragment baseLeaderboardsListFragment = this.t;
                FragmentLeaderboardsListBinding fragmentLeaderboardsListBindingO2 = baseLeaderboardsListFragment.o();
                boolean z2 = vz7Var2.b;
                PlaceHolder placeHolder = fragmentLeaderboardsListBindingO2.d;
                if (z2) {
                    placeHolder.setPlaceholderId(vz7Var2.a);
                    placeHolder.setTitle(vz7Var2.d);
                    placeHolder.q(vz7Var2.e);
                    placeHolder.p(vz7Var2.f, vz7Var2.c);
                    placeHolder.i(new jk0(baseLeaderboardsListFragment, 0));
                    PlaceHolder.r(placeHolder);
                } else {
                    PlaceHolder.h(placeHolder);
                }
                return g2b.a;
            }
        }));
        p().F.e(getViewLifecycleOwner(), new BaseLeaderboardsListFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListFragment$onViewCreated$$inlined$observe$3
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                ho5<Object>[] ho5VarArr = BaseLeaderboardsListFragment.z;
                this.t.o().e.setVisible(zBooleanValue);
                return g2b.a;
            }
        }));
    }

    public final BaseLeaderboardsListViewModel p() {
        BaseLeaderboardsListViewModel baseLeaderboardsListViewModel = this.w;
        if (baseLeaderboardsListViewModel != null) {
            return baseLeaderboardsListViewModel;
        }
        xj5.e("viewModel");
        throw null;
    }
}
