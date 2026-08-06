package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yz2 extends v0 implements l03, pg7 {
    public final Window t;
    public final dt7 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends pmb.b {
        public a() {
            super(1);
        }

        @Override // pmb.b
        public final umb d(umb umbVar, List<pmb> list) {
            yz2 yz2Var = yz2.this;
            if (!yz2Var.w) {
                View childAt = yz2Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, yz2Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, yz2Var.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return umbVar.a.r(iMax, iMax2, iMax3, iMax4);
                }
            }
            return umbVar;
        }

        @Override // pmb.b
        public final pmb.a e(pmb pmbVar, pmb.a aVar) {
            yz2 yz2Var = yz2.this;
            if (!yz2Var.w) {
                View childAt = yz2Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, yz2Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, yz2Var.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    xd5 xd5VarC = xd5.c(iMax, iMax2, iMax3, iMax4);
                    int i = xd5VarC.a;
                    xd5 xd5Var = aVar.a;
                    int i2 = xd5VarC.b;
                    int i3 = xd5VarC.c;
                    int i4 = xd5VarC.d;
                    return new pmb.a(umb.e(xd5Var, i, i2, i3, i4), umb.e(aVar.b, i, i2, i3, i4));
                }
            }
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(2);
            this.v = i;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            num.intValue();
            int iS = gz3.s(this.v | 1);
            yz2.this.Content(jt1Var, iS);
            return g2b.a;
        }
    }

    public yz2(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.t = window;
        this.u = bl7.i(hr1.a);
        WeakHashMap<View, fib> weakHashMap = egb.a;
        egb.d.c(this, this);
        egb.q(this, new a());
    }

    @Override // defpackage.v0
    public final void Content(jt1 jt1Var, int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(1735448596);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            ((ci4) this.u.getValue()).invoke(bj4VarO, 0);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new b(i);
        }
    }

    @Override // defpackage.pg7
    public final umb b(View view, umb umbVar) {
        if (!this.w) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return umbVar.a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return umbVar;
    }

    @Override // defpackage.v0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.y;
    }

    @Override // defpackage.l03
    public final Window getWindow() {
        return this.t;
    }

    @Override // defpackage.v0
    public final void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // defpackage.v0
    public final void internalOnMeasure$ui(int i, int i2) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.t;
        if (mode != Integer.MIN_VALUE || this.v || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.w) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = ax.a.a(window);
            } else if (i3 < 32) {
                iA = gx.a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.w || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.v) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
