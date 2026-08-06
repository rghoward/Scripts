package com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.databinding.ListItemMyFilledResultBinding;
import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import defpackage.bi9;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.ou8;
import defpackage.vz1;
import defpackage.xgb;
import defpackage.xx;
import defpackage.z2a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MyFilledResultViewHolder extends BaseAthleteViewHolder<AthleteResultUiEntity.MyFilledResultUiEntity> {
    public static final Companion Companion = new Companion(0);
    public final ListItemMyFilledResultBinding u;
    public final oh4<AthleteResultUiEntity, g2b> v;
    public final oh4<AthleteResultUiEntity, g2b> w;
    public final oh4<AthleteResultUiEntity, g2b> x;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public MyFilledResultViewHolder(ListItemMyFilledResultBinding listItemMyFilledResultBinding, oh4<? super AthleteResultUiEntity, g2b> oh4Var, oh4<? super AthleteResultUiEntity, g2b> oh4Var2, oh4<? super AthleteResultUiEntity, g2b> oh4Var3) {
        oh4Var.getClass();
        oh4Var2.getClass();
        oh4Var3.getClass();
        ConstraintLayout constraintLayout = listItemMyFilledResultBinding.a;
        constraintLayout.getClass();
        super(constraintLayout);
        this.u = listItemMyFilledResultBinding;
        this.v = oh4Var;
        this.w = oh4Var2;
        this.x = oh4Var3;
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders.BaseAthleteViewHolder
    public final void s(AthleteResultUiEntity athleteResultUiEntity) {
        Drawable drawableMutate;
        Drawable drawableMutate2;
        AthleteResultUiEntity.MyFilledResultUiEntity myFilledResultUiEntity = (AthleteResultUiEntity.MyFilledResultUiEntity) athleteResultUiEntity;
        int i = myFilledResultUiEntity.r;
        int i2 = myFilledResultUiEntity.p;
        int i3 = myFilledResultUiEntity.n;
        String str = myFilledResultUiEntity.b;
        boolean z = str == null || z2a.w(str);
        ListItemMyFilledResultBinding listItemMyFilledResultBinding = this.u;
        ConstraintLayout constraintLayout = listItemMyFilledResultBinding.a;
        MaterialTextView materialTextView = listItemMyFilledResultBinding.c;
        ShapeableImageView shapeableImageView = listItemMyFilledResultBinding.g;
        MaterialTextView materialTextView2 = listItemMyFilledResultBinding.i;
        MaterialTextView materialTextView3 = listItemMyFilledResultBinding.f;
        MaterialTextView materialTextView4 = listItemMyFilledResultBinding.h;
        MaterialTextView materialTextView5 = listItemMyFilledResultBinding.e;
        MaterialTextView materialTextView6 = listItemMyFilledResultBinding.j;
        constraintLayout.getClass();
        boolean z2 = z;
        xgb.a(constraintLayout, new MyFilledResultViewHolder$bind$1$1(this, myFilledResultUiEntity, null));
        shapeableImageView.setVisibility(!z2 ? 0 : 8);
        materialTextView.setVisibility(z2 ? 0 : 8);
        materialTextView.setText(myFilledResultUiEntity.c);
        if (str != null && !z2a.w(str)) {
            xgb.f(shapeableImageView, str, new bi9(1));
        }
        listItemMyFilledResultBinding.d.setText(myFilledResultUiEntity.e);
        listItemMyFilledResultBinding.b.setText(myFilledResultUiEntity.f);
        xx.f(materialTextView5, myFilledResultUiEntity.i);
        xgb.a(materialTextView5, new MyFilledResultViewHolder$bind$1$2(this, myFilledResultUiEntity, null));
        materialTextView5.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, myFilledResultUiEntity.j ? constraintLayout.getContext().getDrawable(R.drawable.ic_arrow_down) : null, (Drawable) null);
        materialTextView4.setText(myFilledResultUiEntity.d);
        materialTextView4.setBackgroundTintList(vz1.b(constraintLayout.getContext(), myFilledResultUiEntity.g));
        materialTextView4.setTextColor(constraintLayout.getContext().getColor(myFilledResultUiEntity.h));
        materialTextView3.setText(String.valueOf(myFilledResultUiEntity.m));
        materialTextView2.setText(String.valueOf(myFilledResultUiEntity.o));
        materialTextView6.setText(myFilledResultUiEntity.q);
        materialTextView3.setTextColor(i3);
        Drawable[] compoundDrawablesRelative = materialTextView3.getCompoundDrawablesRelative();
        compoundDrawablesRelative.getClass();
        Drawable drawable = compoundDrawablesRelative.length == 0 ? null : compoundDrawablesRelative[0];
        if (drawable != null && (drawableMutate2 = drawable.mutate()) != null) {
            drawableMutate2.setTint(i3);
        }
        materialTextView2.setTextColor(i2);
        Drawable[] compoundDrawablesRelative2 = materialTextView2.getCompoundDrawablesRelative();
        compoundDrawablesRelative2.getClass();
        Drawable drawable2 = compoundDrawablesRelative2.length == 0 ? null : compoundDrawablesRelative2[0];
        if (drawable2 != null && (drawableMutate = drawable2.mutate()) != null) {
            drawableMutate.setTint(i2);
        }
        Context context = constraintLayout.getContext();
        context.getClass();
        Drawable drawableA = ou8.a(context, R.drawable.ic_like, i);
        materialTextView6.setTextColor(i);
        materialTextView6.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
        xgb.a(materialTextView6, new MyFilledResultViewHolder$bind$1$3(this, myFilledResultUiEntity, null));
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
