package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e56 extends en9 {
    public final SideSheetBehavior<? extends View> a;

    public e56(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.en9
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // defpackage.en9
    public final float b(int i) {
        float fE = e();
        return (i - fE) / (d() - fE);
    }

    @Override // defpackage.en9
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // defpackage.en9
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return Math.max(0, sideSheetBehavior.G + sideSheetBehavior.H);
    }

    @Override // defpackage.en9
    public final int e() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return (-sideSheetBehavior.E) - sideSheetBehavior.H;
    }

    @Override // defpackage.en9
    public final int f() {
        return this.a.H;
    }

    @Override // defpackage.en9
    public final int g() {
        return -this.a.E;
    }

    @Override // defpackage.en9
    public final <V extends View> int h(V v) {
        return v.getRight() + this.a.H;
    }

    @Override // defpackage.en9
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // defpackage.en9
    public final int j() {
        return 1;
    }

    @Override // defpackage.en9
    public final boolean k(float f) {
        return f > 0.0f;
    }

    @Override // defpackage.en9
    public final boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // defpackage.en9
    public final boolean m(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
    }

    @Override // defpackage.en9
    public final boolean n(View view, float f) {
        return Math.abs((f * this.a.D) + ((float) view.getLeft())) > 0.5f;
    }

    @Override // defpackage.en9
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // defpackage.en9
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.F) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
