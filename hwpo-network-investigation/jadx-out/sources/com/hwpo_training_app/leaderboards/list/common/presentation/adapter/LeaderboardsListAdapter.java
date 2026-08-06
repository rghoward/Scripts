package com.hwpo_training_app.leaderboards.list.common.presentation.adapter;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.google.android.material.card.MaterialCardView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.databinding.ListItemLeaderboardProgramBinding;
import com.hwpo_training_app.leaderboards.databinding.ListItemLeaderboardProgramSearchResultBinding;
import com.hwpo_training_app.leaderboards.list.common.presentation.adapter.LeaderboardAthletesAdapter;
import com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.LeaderboardProgramDelegateKt$leaderboardProgramDelegate$$inlined$adapterDelegateViewBinding$default$1;
import com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.LeaderboardProgramDelegateKt$leaderboardProgramDelegate$$inlined$adapterDelegateViewBinding$default$2;
import com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.LeaderboardProgramSearchResultDelegateKt$leaderboardProgramSearchResultDelegate$$inlined$adapterDelegateViewBinding$default$1;
import com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.LeaderboardProgramSearchResultDelegateKt$leaderboardProgramSearchResultDelegate$$inlined$adapterDelegateViewBinding$default$2;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.TopValueUiEntity;
import defpackage.e93;
import defpackage.g2b;
import defpackage.g46;
import defpackage.i46;
import defpackage.n50;
import defpackage.oh4;
import defpackage.xgb;
import defpackage.xx;
import defpackage.ya;
import defpackage.za;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardsListAdapter extends n50<LeaderboardItemUiEntity> {
    public final oh4<Integer, g2b> f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LeaderboardProgramDiffCallback extends m.e<LeaderboardItemUiEntity> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(LeaderboardItemUiEntity leaderboardItemUiEntity, LeaderboardItemUiEntity leaderboardItemUiEntity2) {
            LeaderboardItemUiEntity leaderboardItemUiEntity3 = leaderboardItemUiEntity;
            LeaderboardItemUiEntity leaderboardItemUiEntity4 = leaderboardItemUiEntity2;
            return ((leaderboardItemUiEntity3 instanceof LeaderboardItemUiEntity.LeaderboardProgramUiEntity) && (leaderboardItemUiEntity4 instanceof LeaderboardItemUiEntity.LeaderboardProgramUiEntity) && leaderboardItemUiEntity3.equals(leaderboardItemUiEntity4)) || ((leaderboardItemUiEntity3 instanceof LeaderboardItemUiEntity.LeaderboardProgramsSearchResultUiEntity) && (leaderboardItemUiEntity4 instanceof LeaderboardItemUiEntity.LeaderboardProgramsSearchResultUiEntity) && leaderboardItemUiEntity3.equals(leaderboardItemUiEntity4));
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(LeaderboardItemUiEntity leaderboardItemUiEntity, LeaderboardItemUiEntity leaderboardItemUiEntity2) {
            return leaderboardItemUiEntity.c() == leaderboardItemUiEntity2.c();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ViewType {
        public static final /* synthetic */ ViewType[] t = {new ViewType("LEADERBOARD_PROGRAM", 0), new ViewType("LEADERBOARD_PROGRAM_SEARCH_RESULT", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ViewType EF5;

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) t.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LeaderboardsListAdapter(final RecyclerView.u uVar, final oh4<? super LeaderboardItemUiEntity, g2b> oh4Var, final oh4<? super TopValueUiEntity, g2b> oh4Var2, final oh4<? super TopValueUiEntity, g2b> oh4Var3, final oh4<? super TopValueUiEntity, g2b> oh4Var4, oh4<? super Integer, g2b> oh4Var5) {
        super(new LeaderboardProgramDiffCallback());
        uVar.getClass();
        this.f = oh4Var5;
        za<List<T>> zaVar = this.d;
        zaVar.a(0, new e93(new g46(0), new LeaderboardProgramDelegateKt$leaderboardProgramDelegate$$inlined$adapterDelegateViewBinding$default$1(), new oh4() { // from class: h46
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                final LeaderboardAthletesAdapter leaderboardAthletesAdapter = new LeaderboardAthletesAdapter(new ny(oh4Var3, 3), oh4Var2, oh4Var4);
                Drawable drawable = yaVar.w.getDrawable(R.drawable.stroke_divider);
                if (drawable == null) {
                    z90.a("Required value was null.");
                    return null;
                }
                RecyclerView recyclerView = ((ListItemLeaderboardProgramBinding) yaVar.u).g;
                recyclerView.setItemAnimator(null);
                recyclerView.setAdapter(leaderboardAthletesAdapter);
                recyclerView.setRecycledViewPool(uVar);
                recyclerView.h(new feb(drawable, 0, 0));
                final oh4 oh4Var6 = oh4Var;
                yaVar.s(new oh4() { // from class: com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.b
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        ListItemLeaderboardProgramBinding listItemLeaderboardProgramBinding = (ListItemLeaderboardProgramBinding) yaVar2.u;
                        leaderboardAthletesAdapter.u(((LeaderboardItemUiEntity.LeaderboardProgramUiEntity) yaVar2.t()).h);
                        MaterialCardView materialCardView = listItemLeaderboardProgramBinding.a;
                        materialCardView.getClass();
                        xgb.a(materialCardView, new LeaderboardProgramDelegateKt$leaderboardProgramDelegate$2$2$1$1(oh4Var6, yaVar2, null));
                        listItemLeaderboardProgramBinding.f.setText(((LeaderboardItemUiEntity.LeaderboardProgramUiEntity) yaVar2.t()).b);
                        xx.f(listItemLeaderboardProgramBinding.e, ((LeaderboardItemUiEntity.LeaderboardProgramUiEntity) yaVar2.t()).c);
                        xx.f(listItemLeaderboardProgramBinding.d, ((LeaderboardItemUiEntity.LeaderboardProgramUiEntity) yaVar2.t()).f);
                        xx.f(listItemLeaderboardProgramBinding.c, ((LeaderboardItemUiEntity.LeaderboardProgramUiEntity) yaVar2.t()).g);
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, LeaderboardProgramDelegateKt$leaderboardProgramDelegate$$inlined$adapterDelegateViewBinding$default$2.u));
        zaVar.a(1, new e93(new i46(), new LeaderboardProgramSearchResultDelegateKt$leaderboardProgramSearchResultDelegate$$inlined$adapterDelegateViewBinding$default$1(), new oh4() { // from class: j46
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                final oh4 oh4Var6 = oh4Var;
                yaVar.s(new oh4() { // from class: com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.c
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        ListItemLeaderboardProgramSearchResultBinding listItemLeaderboardProgramSearchResultBinding = (ListItemLeaderboardProgramSearchResultBinding) yaVar2.u;
                        LinearLayout linearLayout = listItemLeaderboardProgramSearchResultBinding.a;
                        linearLayout.getClass();
                        xgb.a(linearLayout, new LeaderboardProgramSearchResultDelegateKt$leaderboardProgramSearchResultDelegate$2$1$1$1(oh4Var6, yaVar2, null));
                        listItemLeaderboardProgramSearchResultBinding.c.setText(((LeaderboardItemUiEntity.LeaderboardProgramsSearchResultUiEntity) yaVar2.t()).b);
                        xx.f(listItemLeaderboardProgramSearchResultBinding.b, ((LeaderboardItemUiEntity.LeaderboardProgramsSearchResultUiEntity) yaVar2.t()).c);
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, LeaderboardProgramSearchResultDelegateKt$leaderboardProgramSearchResultDelegate$$inlined$adapterDelegateViewBinding$default$2.u));
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
