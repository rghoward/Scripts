package io.intercom.android.sdk.views;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ButtonSelector extends StateListDrawable {
    private final int color;

    public ButtonSelector(Context context, int i, int i2) {
        this.color = i2;
        addState(new int[]{R.attr.state_enabled}, context.getResources().getDrawable(i));
        addState(new int[]{R.attr.state_focused}, context.getResources().getDrawable(i));
        addState(new int[]{R.attr.state_pressed}, context.getResources().getDrawable(i));
    }

    private static int darken(int i, double d) {
        return Color.argb(255, (int) (((double) Color.red(i)) * d), (int) (((double) Color.green(i)) * d), (int) (((double) Color.blue(i)) * d));
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842919 || i == 16842908) {
                z = true;
            }
        }
        int i2 = this.color;
        if (z) {
            setColorFilter(darken(i2, 0.9d), PorterDuff.Mode.SRC);
        } else {
            setColorFilter(i2, PorterDuff.Mode.SRC);
        }
        return super.onStateChange(iArr);
    }
}
