package com.hwpo_training_app.leaderboards.details.header.presentation.delegate;

import android.text.TextPaint;
import com.hwpo_training_app.R;
import defpackage.bu8;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptionTextHeightDelegate {
    public final bu8 a;
    public final TextPaint b;

    public DescriptionTextHeightDelegate(bu8 bu8Var) {
        bu8Var.getClass();
        this.a = bu8Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(bu8Var.d(R.dimen.description_text_size));
        this.b = textPaint;
    }
}
