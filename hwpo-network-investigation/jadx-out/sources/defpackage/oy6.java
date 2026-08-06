package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oy6 extends b implements py6.c {
    public boolean B;
    public boolean C;
    public float D;
    public View[] E;

    public float getProgress() {
        return this.D;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hh8.i);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.B = typedArrayObtainStyledAttributes.getBoolean(index, this.B);
                } else if (index == 0) {
                    this.C = typedArrayObtainStyledAttributes.getBoolean(index, this.C);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.D = f;
        int i = 0;
        if (this.u <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                viewGroup.getChildAt(i);
                i++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.z;
        if (viewArr == null || viewArr.length != this.u) {
            this.z = new View[this.u];
        }
        for (int i2 = 0; i2 < this.u; i2++) {
            this.z[i2] = constraintLayout.t.get(this.t[i2]);
        }
        this.E = this.z;
        while (i < this.u) {
            View view = this.E[i];
            i++;
        }
    }
}
