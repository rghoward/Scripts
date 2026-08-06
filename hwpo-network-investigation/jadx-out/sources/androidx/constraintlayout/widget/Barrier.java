package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.hh8;
import defpackage.rj0;
import defpackage.vx1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {
    public int B;
    public int C;
    public rj0 D;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.D.u0;
    }

    public int getMargin() {
        return this.D.v0;
    }

    public int getType() {
        return this.B;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.D = new rj0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hh8.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.D.u0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.D.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.w = this.D;
        k();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void i(vx1 vx1Var, boolean z) {
        int i = this.B;
        this.C = i;
        if (z) {
            if (i == 5) {
                this.C = 1;
            } else if (i == 6) {
                this.C = 0;
            }
        } else if (i == 5) {
            this.C = 0;
        } else if (i == 6) {
            this.C = 1;
        }
        if (vx1Var instanceof rj0) {
            ((rj0) vx1Var).t0 = this.C;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.D.u0 = z;
    }

    public void setDpMargin(int i) {
        this.D.v0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.D.v0 = i;
    }

    public void setType(int i) {
        this.B = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
