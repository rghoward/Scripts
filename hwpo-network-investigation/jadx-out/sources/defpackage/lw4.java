package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lw4 extends qw4 {
    @Override // defpackage.qw4
    public final <V extends View> int a(V v, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v.getMeasuredWidth() + marginLayoutParams.leftMargin;
    }

    @Override // defpackage.qw4
    public final int b() {
        return 2;
    }

    @Override // defpackage.qw4
    public final ViewPropertyAnimator c(int i, View view) {
        return view.animate().translationX(-i);
    }
}
