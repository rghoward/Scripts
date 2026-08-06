package com.hwpo_training_app.leaderboards.filter.presentation;

import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import defpackage.js7;
import defpackage.u;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ExtensionsKt {
    public static final void a(SelectedGymFilterUiEntity selectedGymFilterUiEntity, MaterialTextView materialTextView, ImageView imageView, MaterialTextView materialTextView2) {
        selectedGymFilterUiEntity.getClass();
        materialTextView.setEnabled(selectedGymFilterUiEntity.a());
        materialTextView.setAlpha(selectedGymFilterUiEntity.a() ? 1.0f : 0.5f);
        if (selectedGymFilterUiEntity instanceof SelectedGymFilterUiEntity.None) {
            imageView.setVisibility(8);
            materialTextView2.setText((CharSequence) null);
        } else if (selectedGymFilterUiEntity instanceof SelectedGymFilterUiEntity.MyGym) {
            imageView.setVisibility(0);
            materialTextView2.setText((CharSequence) null);
        } else if (!(selectedGymFilterUiEntity instanceof SelectedGymFilterUiEntity.Affiliated)) {
            u.b();
        } else {
            imageView.setVisibility(8);
            materialTextView2.setText(((SelectedGymFilterUiEntity.Affiliated) selectedGymFilterUiEntity).c);
        }
    }

    public static final SelectedGymFilterUiEntity b(js7<Integer, String> js7Var, boolean z, boolean z2) {
        if (js7Var != null) {
            return new SelectedGymFilterUiEntity.Affiliated(js7Var.t.intValue(), js7Var.u, z);
        }
        return z2 ? SelectedGymFilterUiEntity.MyGym.a : new SelectedGymFilterUiEntity.None(z);
    }
}
