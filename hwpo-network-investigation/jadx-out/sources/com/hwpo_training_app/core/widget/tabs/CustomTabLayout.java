package com.hwpo_training_app.core.widget.tabs;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.tabs.TabLayout;
import com.hwpo_training_app.R;
import defpackage.qq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabLayout extends TabLayout {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            view.getClass();
            outline.getClass();
            CustomTabLayout customTabLayout = CustomTabLayout.this;
            outline.setRoundRect(0, 0, customTabLayout.getMeasuredWidth(), customTabLayout.getMeasuredHeight(), customTabLayout.getResources().getDimension(R.dimen.m_radius));
        }
    }

    public /* synthetic */ CustomTabLayout(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.google.android.material.tabs.TabLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOutlineProvider(new a());
        setClipToOutline(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomTabLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
