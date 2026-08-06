package com.hwpo_training_app.leaderboards.list.common.presentation.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.m;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.databinding.ListItemMyTopAthleteBinding;
import com.hwpo_training_app.leaderboards.databinding.ListItemTopAthleteBinding;
import com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.LeaderboardMyTopAthleteDelegateKt$leaderboardMyAthleteDelegate$$inlined$adapterDelegateViewBinding$default$1;
import com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.LeaderboardTopAthleteDelegateKt$leaderboardAthleteDelegate$$inlined$adapterDelegateViewBinding$default$1;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.TopValueUiEntity;
import defpackage.a81;
import defpackage.c81;
import defpackage.e93;
import defpackage.g2b;
import defpackage.n50;
import defpackage.ny;
import defpackage.oh4;
import defpackage.r46;
import defpackage.x36;
import defpackage.xgb;
import defpackage.y36;
import defpackage.ya;
import defpackage.za;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardAthletesAdapter extends n50<TopValueUiEntity> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TopValueDiffCallback extends m.e<TopValueUiEntity> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(TopValueUiEntity topValueUiEntity, TopValueUiEntity topValueUiEntity2) {
            return topValueUiEntity.equals(topValueUiEntity2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(TopValueUiEntity topValueUiEntity, TopValueUiEntity topValueUiEntity2) {
            return topValueUiEntity.a == topValueUiEntity2.a;
        }
    }

    public LeaderboardAthletesAdapter(final ny nyVar, final oh4 oh4Var, final oh4 oh4Var2) {
        super(new TopValueDiffCallback());
        za<List<T>> zaVar = this.d;
        zaVar.b(new e93(new a81(1), new r46(), new oh4() { // from class: com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.d
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                ya yaVar = (ya) obj;
                yaVar.getClass();
                ListItemTopAthleteBinding listItemTopAthleteBinding = (ListItemTopAthleteBinding) yaVar.u;
                ConstraintLayout constraintLayout = listItemTopAthleteBinding.a;
                constraintLayout.getClass();
                xgb.a(constraintLayout, new LeaderboardTopAthleteDelegateKt$leaderboardAthleteDelegate$3$1$1(nyVar, yaVar, null));
                xgb.a(listItemTopAthleteBinding.e, new LeaderboardTopAthleteDelegateKt$leaderboardAthleteDelegate$3$1$2(oh4Var, yaVar, null));
                xgb.a(listItemTopAthleteBinding.h, new LeaderboardTopAthleteDelegateKt$leaderboardAthleteDelegate$3$1$3(oh4Var2, yaVar, null));
                yaVar.s(new c81(yaVar, 1));
                return g2b.a;
            }
        }, LeaderboardTopAthleteDelegateKt$leaderboardAthleteDelegate$$inlined$adapterDelegateViewBinding$default$1.u));
        zaVar.b(new e93(new x36(), new y36(), new oh4() { // from class: com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.a
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                ListItemMyTopAthleteBinding listItemMyTopAthleteBinding = (ListItemMyTopAthleteBinding) yaVar.u;
                ConstraintLayout constraintLayout = listItemMyTopAthleteBinding.a;
                constraintLayout.getClass();
                xgb.a(constraintLayout, new LeaderboardMyTopAthleteDelegateKt$leaderboardMyAthleteDelegate$3$1$1(nyVar, yaVar, null));
                xgb.a(listItemMyTopAthleteBinding.e, new LeaderboardMyTopAthleteDelegateKt$leaderboardMyAthleteDelegate$3$1$2(oh4Var, yaVar, null));
                xgb.a(listItemMyTopAthleteBinding.h, new LeaderboardMyTopAthleteDelegateKt$leaderboardMyAthleteDelegate$3$1$3(oh4Var2, yaVar, null));
                yaVar.s(new oh4() { // from class: z36
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        V v = yaVar2.u;
                        Context context = yaVar2.w;
                        ListItemMyTopAthleteBinding listItemMyTopAthleteBinding2 = (ListItemMyTopAthleteBinding) v;
                        String str = ((TopValueUiEntity) yaVar2.t()).c;
                        int i = 0;
                        boolean z = str == null || z2a.w(str);
                        ShapeableImageView shapeableImageView = listItemMyTopAthleteBinding2.f;
                        MaterialTextView materialTextView = listItemMyTopAthleteBinding2.g;
                        MaterialTextView materialTextView2 = listItemMyTopAthleteBinding2.e;
                        MaterialTextView materialTextView3 = listItemMyTopAthleteBinding2.c;
                        shapeableImageView.setVisibility(!z ? 0 : 8);
                        materialTextView3.setVisibility(z ? 0 : 8);
                        materialTextView3.setText(((TopValueUiEntity) yaVar2.t()).d);
                        if (str != null && !z2a.w(str)) {
                            xgb.f(listItemMyTopAthleteBinding2.f, str, new bi9(1));
                        }
                        listItemMyTopAthleteBinding2.d.setText(((TopValueUiEntity) yaVar2.t()).b);
                        listItemMyTopAthleteBinding2.b.setText(((TopValueUiEntity) yaVar2.t()).g);
                        xx.f(materialTextView2, ((TopValueUiEntity) yaVar2.t()).h);
                        materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, ((TopValueUiEntity) yaVar2.t()).j ? context.getDrawable(R.drawable.ic_arrow_down) : null, (Drawable) null);
                        MaterialButton materialButton = listItemMyTopAthleteBinding2.h;
                        String str2 = ((TopValueUiEntity) yaVar2.t()).h;
                        if (str2 != null && str2.length() != 0) {
                            i = 8;
                        }
                        materialButton.setVisibility(i);
                        materialTextView.setText(((TopValueUiEntity) yaVar2.t()).e);
                        materialTextView.setBackgroundTintList(vz1.b(context, ((TopValueUiEntity) yaVar2.t()).f));
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, LeaderboardMyTopAthleteDelegateKt$leaderboardMyAthleteDelegate$$inlined$adapterDelegateViewBinding$default$1.u));
    }
}
