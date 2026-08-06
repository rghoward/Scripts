package com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.databinding.ListItemOtherAthleteResultBinding;
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
public final class OtherAthleteResultViewHolder extends BaseAthleteViewHolder<AthleteResultUiEntity.OtherAthleteResultUiEntity> {
    public static final Companion Companion = new Companion(0);
    public final ListItemOtherAthleteResultBinding u;
    public final oh4<AthleteResultUiEntity, g2b> v;
    public final oh4<AthleteResultUiEntity, g2b> w;
    public final oh4<AthleteResultUiEntity.OtherAthleteResultUiEntity, g2b> x;
    public final oh4<AthleteResultUiEntity, g2b> y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public OtherAthleteResultViewHolder(ListItemOtherAthleteResultBinding listItemOtherAthleteResultBinding, oh4<? super AthleteResultUiEntity, g2b> oh4Var, oh4<? super AthleteResultUiEntity, g2b> oh4Var2, oh4<? super AthleteResultUiEntity.OtherAthleteResultUiEntity, g2b> oh4Var3, oh4<? super AthleteResultUiEntity, g2b> oh4Var4) {
        oh4Var.getClass();
        oh4Var2.getClass();
        oh4Var3.getClass();
        oh4Var4.getClass();
        ConstraintLayout constraintLayout = listItemOtherAthleteResultBinding.a;
        constraintLayout.getClass();
        super(constraintLayout);
        this.u = listItemOtherAthleteResultBinding;
        this.v = oh4Var;
        this.w = oh4Var2;
        this.x = oh4Var3;
        this.y = oh4Var4;
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders.BaseAthleteViewHolder
    public final void s(AthleteResultUiEntity athleteResultUiEntity) {
        Drawable drawableMutate;
        Drawable drawableMutate2;
        AthleteResultUiEntity.OtherAthleteResultUiEntity otherAthleteResultUiEntity = (AthleteResultUiEntity.OtherAthleteResultUiEntity) athleteResultUiEntity;
        int i = otherAthleteResultUiEntity.r;
        int i2 = otherAthleteResultUiEntity.p;
        int i3 = otherAthleteResultUiEntity.n;
        String str = otherAthleteResultUiEntity.b;
        boolean z = str == null || z2a.w(str);
        ListItemOtherAthleteResultBinding listItemOtherAthleteResultBinding = this.u;
        ConstraintLayout constraintLayout = listItemOtherAthleteResultBinding.a;
        MaterialTextView materialTextView = listItemOtherAthleteResultBinding.h;
        MaterialTextView materialTextView2 = listItemOtherAthleteResultBinding.c;
        ShapeableImageView shapeableImageView = listItemOtherAthleteResultBinding.g;
        ImageView imageView = listItemOtherAthleteResultBinding.l;
        MaterialTextView materialTextView3 = listItemOtherAthleteResultBinding.i;
        MaterialTextView materialTextView4 = listItemOtherAthleteResultBinding.f;
        MaterialTextView materialTextView5 = listItemOtherAthleteResultBinding.e;
        boolean z2 = z;
        MaterialTextView materialTextView6 = listItemOtherAthleteResultBinding.k;
        constraintLayout.getClass();
        xgb.a(constraintLayout, new OtherAthleteResultViewHolder$bind$1$1(this, otherAthleteResultUiEntity, null));
        shapeableImageView.setVisibility(!z2 ? 0 : 8);
        materialTextView2.setVisibility(z2 ? 0 : 8);
        materialTextView2.setText(otherAthleteResultUiEntity.c);
        if (str != null && !z2a.w(str)) {
            xgb.f(shapeableImageView, str, new bi9(1));
        }
        listItemOtherAthleteResultBinding.d.setText(otherAthleteResultUiEntity.e);
        listItemOtherAthleteResultBinding.b.setText(otherAthleteResultUiEntity.f);
        xx.f(materialTextView5, otherAthleteResultUiEntity.h);
        xgb.a(materialTextView5, new OtherAthleteResultViewHolder$bind$1$2(this, otherAthleteResultUiEntity, null));
        materialTextView5.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, otherAthleteResultUiEntity.i ? constraintLayout.getContext().getDrawable(R.drawable.ic_arrow_down) : null, (Drawable) null);
        materialTextView.setText(otherAthleteResultUiEntity.d);
        materialTextView.setBackgroundTintList(vz1.b(constraintLayout.getContext(), otherAthleteResultUiEntity.g));
        materialTextView4.setText(String.valueOf(otherAthleteResultUiEntity.m));
        materialTextView3.setText(String.valueOf(otherAthleteResultUiEntity.o));
        materialTextView6.setText(otherAthleteResultUiEntity.q);
        materialTextView4.setTextColor(i3);
        Drawable[] compoundDrawablesRelative = materialTextView4.getCompoundDrawablesRelative();
        compoundDrawablesRelative.getClass();
        Drawable drawable = compoundDrawablesRelative.length == 0 ? null : compoundDrawablesRelative[0];
        if (drawable != null && (drawableMutate2 = drawable.mutate()) != null) {
            drawableMutate2.setTint(i3);
        }
        materialTextView3.setTextColor(i2);
        Drawable[] compoundDrawablesRelative2 = materialTextView3.getCompoundDrawablesRelative();
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
        xgb.a(materialTextView6, new OtherAthleteResultViewHolder$bind$1$3(this, otherAthleteResultUiEntity, null));
        imageView.setVisibility(8);
        Context context2 = this.a.getContext();
        context2.getClass();
        imageView.setImageDrawable(ou8.a(context2, otherAthleteResultUiEntity.s, otherAthleteResultUiEntity.t));
        xgb.a(imageView, new OtherAthleteResultViewHolder$bind$1$4(this, otherAthleteResultUiEntity, null));
        listItemOtherAthleteResultBinding.j.setVisibility(otherAthleteResultUiEntity.l ? 0 : 8);
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
