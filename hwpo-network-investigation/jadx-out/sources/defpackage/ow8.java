package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ow8 extends en9 {
    public final SideSheetBehavior<? extends View> a;

    public ow8(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.en9
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // defpackage.en9
    public final float b(int i) {
        float f = this.a.F;
        return (f - i) / (f - d());
    }

    @Override // defpackage.en9
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // defpackage.en9
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return Math.max(0, (sideSheetBehavior.F - sideSheetBehavior.E) - sideSheetBehavior.H);
    }

    @Override // defpackage.en9
    public final int e() {
        return this.a.F;
    }

    @Override // defpackage.en9
    public final int f() {
        return this.a.F;
    }

    @Override // defpackage.en9
    public final int g() {
        return d();
    }

    @Override // defpackage.en9
    public final <V extends View> int h(V v) {
        return v.getLeft() - this.a.H;
    }

    @Override // defpackage.en9
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // defpackage.en9
    public final int j() {
        return 0;
    }

    @Override // defpackage.en9
    public final boolean k(float f) {
        return f < 0.0f;
    }

    @Override // defpackage.en9
    public final boolean l(View view) {
        return view.getLeft() > (d() + this.a.F) / 2;
    }

    @Override // defpackage.en9
    public final boolean m(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
    }

    @Override // defpackage.en9
    public final boolean n(View view, float f) {
        return Math.abs((f * this.a.D) + ((float) view.getRight())) > 0.5f;
    }

    @Override // defpackage.en9
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // defpackage.en9
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.a.F;
        if (i <= i3) {
            marginLayoutParams.rightMargin = i3 - i;
        }
    }
}
