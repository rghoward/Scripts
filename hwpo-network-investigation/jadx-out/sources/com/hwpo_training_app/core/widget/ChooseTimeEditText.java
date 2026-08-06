package com.hwpo_training_app.core.widget;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.qq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ChooseTimeEditText extends AppCompatEditText {
    public /* synthetic */ ChooseTimeEditText(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (text == null) {
            super.onSelectionChanged(i, i2);
        } else {
            if (i == text.length() && i2 == text.length()) {
                return;
            }
            setSelection(text.length(), text.length());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChooseTimeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseTimeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setCursorVisible(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChooseTimeEditText(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
