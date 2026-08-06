package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import defpackage.b00;
import defpackage.bk6;
import defpackage.dj6;
import defpackage.m00;
import defpackage.p00;
import defpackage.vy;
import defpackage.xy;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends p00 {
    @Override // defpackage.p00
    public final vy a(Context context, AttributeSet attributeSet) {
        return new dj6(context, attributeSet);
    }

    @Override // defpackage.p00
    public final xy b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.p00
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new bk6(context, attributeSet, 0);
    }

    @Override // defpackage.p00
    public final b00 d(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // defpackage.p00
    public final m00 e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
