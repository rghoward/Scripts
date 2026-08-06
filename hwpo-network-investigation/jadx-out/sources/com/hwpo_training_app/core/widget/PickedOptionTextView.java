package com.hwpo_training_app.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.intercom.twig.BuildConfig;
import defpackage.aib;
import defpackage.ch8;
import defpackage.ll8;
import defpackage.qq2;
import defpackage.sd1;
import defpackage.xfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class PickedOptionTextView extends LinearLayout {
    public final aib t;
    public String u;
    public String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickedOptionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Context context2 = getContext();
        context2.getClass();
        sd1 sd1VarA = ll8.a(aib.class);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        layoutInflaterFrom.getClass();
        aib aibVar = (aib) xfb.a(sd1VarA, layoutInflaterFrom, this, true);
        this.t = aibVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ch8.d);
        typedArrayObtainStyledAttributes.getClass();
        String string = typedArrayObtainStyledAttributes.getString(1);
        String str = BuildConfig.FLAVOR;
        string = string == null ? BuildConfig.FLAVOR : string;
        String string2 = typedArrayObtainStyledAttributes.getString(0);
        str = string2 != null ? string2 : str;
        aibVar.c.setText(string);
        aibVar.b.setText(str);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String getPickedOptionText() {
        return this.v;
    }

    public final String getTitle() {
        return this.u;
    }

    public final void setPickedOptionText(String str) {
        this.v = str;
        this.t.b.setText(str);
    }

    public final void setTitle(String str) {
        this.u = str;
        this.t.c.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PickedOptionTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PickedOptionTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PickedOptionTextView(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
