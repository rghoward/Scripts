package com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.leaderboards.databinding.ListItemMyEmptyResultBinding;
import com.hwpo_training_app.leaderboards.details.list.presentation.c;
import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import defpackage.bi9;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.xgb;
import defpackage.z2a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MyEmptyResultViewHolder extends BaseAthleteViewHolder<AthleteResultUiEntity.MyEmptyResultUiEntity> {
    public static final Companion Companion = new Companion(0);
    public final ListItemMyEmptyResultBinding u;
    public final oh4<AthleteResultUiEntity, g2b> v;

    /* JADX WARN: Illegal instructions before constructor call */
    public MyEmptyResultViewHolder(ListItemMyEmptyResultBinding listItemMyEmptyResultBinding, c cVar) {
        cVar.getClass();
        ConstraintLayout constraintLayout = listItemMyEmptyResultBinding.a;
        constraintLayout.getClass();
        super(constraintLayout);
        this.u = listItemMyEmptyResultBinding;
        this.v = cVar;
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders.BaseAthleteViewHolder
    public final void s(AthleteResultUiEntity athleteResultUiEntity) {
        AthleteResultUiEntity.MyEmptyResultUiEntity myEmptyResultUiEntity = (AthleteResultUiEntity.MyEmptyResultUiEntity) athleteResultUiEntity;
        String str = myEmptyResultUiEntity.b;
        int i = 1;
        boolean z = str == null || z2a.w(str);
        ListItemMyEmptyResultBinding listItemMyEmptyResultBinding = this.u;
        ShapeableImageView shapeableImageView = listItemMyEmptyResultBinding.f;
        MaterialTextView materialTextView = listItemMyEmptyResultBinding.d;
        shapeableImageView.setVisibility(!z ? 0 : 8);
        materialTextView.setVisibility(z ? 0 : 8);
        materialTextView.setText(myEmptyResultUiEntity.c);
        if (str != null && !z2a.w(str)) {
            xgb.f(listItemMyEmptyResultBinding.f, str, new bi9(i));
        }
        listItemMyEmptyResultBinding.e.setText(myEmptyResultUiEntity.e);
        listItemMyEmptyResultBinding.c.setText(myEmptyResultUiEntity.f);
        listItemMyEmptyResultBinding.g.setText(myEmptyResultUiEntity.d);
        xgb.a(listItemMyEmptyResultBinding.b, new MyEmptyResultViewHolder$bind$1$1(this, myEmptyResultUiEntity, null));
        ConstraintLayout constraintLayout = listItemMyEmptyResultBinding.a;
        constraintLayout.getClass();
        xgb.a(constraintLayout, new MyEmptyResultViewHolder$bind$1$2(this, myEmptyResultUiEntity, null));
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
