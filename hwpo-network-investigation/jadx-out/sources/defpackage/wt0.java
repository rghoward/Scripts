package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wt0 implements wib.b {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ BottomSheetBehavior b;

    public wt0(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.b = bottomSheetBehavior;
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    @Override // wib.b
    public final umb a(View view, umb umbVar, wib.c cVar) {
        boolean z;
        umb.q qVar = umbVar.a;
        xd5 xd5VarI = qVar.i(519);
        xd5 xd5VarI2 = qVar.i(32);
        BottomSheetBehavior bottomSheetBehavior = this.b;
        boolean z2 = bottomSheetBehavior.I;
        int i = xd5VarI.b;
        int i2 = xd5VarI.c;
        int i3 = xd5VarI.a;
        bottomSheetBehavior.Q = i;
        boolean z3 = true;
        boolean z4 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (z2) {
            int iA = umbVar.a();
            bottomSheetBehavior.P = iA;
            paddingBottom = iA + cVar.d;
        }
        if (bottomSheetBehavior.J) {
            paddingLeft = (z4 ? cVar.c : cVar.a) + i3;
        }
        if (bottomSheetBehavior.K) {
            paddingRight = (z4 ? cVar.a : cVar.c) + i2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.M || marginLayoutParams.leftMargin == i3) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.N && marginLayoutParams.rightMargin != i2) {
            marginLayoutParams.rightMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.O) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = xd5VarI.b;
            if (i4 != i5) {
                marginLayoutParams.topMargin = i5;
            } else {
                z3 = z;
            }
        } else {
            z3 = z;
        }
        if (z3) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z5 = this.a;
        if (z5) {
            bottomSheetBehavior.G = xd5VarI2.d;
        }
        if (!z2 && !z5) {
            return umbVar;
        }
        bottomSheetBehavior.S();
        return umbVar;
    }
}
