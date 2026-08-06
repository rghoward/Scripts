package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.hh8;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends ConstraintLayout.a {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float r0;
        public boolean s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a();
        aVar.r0 = 1.0f;
        aVar.s0 = false;
        aVar.t0 = 0.0f;
        aVar.u0 = 0.0f;
        aVar.v0 = 0.0f;
        aVar.w0 = 0.0f;
        aVar.x0 = 1.0f;
        aVar.y0 = 1.0f;
        aVar.z0 = 0.0f;
        aVar.A0 = 0.0f;
        aVar.B0 = 0.0f;
        aVar.C0 = 0.0f;
        aVar.D0 = 0.0f;
        return aVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.r0 = 1.0f;
        aVar.s0 = false;
        aVar.t0 = 0.0f;
        aVar.u0 = 0.0f;
        aVar.v0 = 0.0f;
        aVar.w0 = 0.0f;
        aVar.x0 = 1.0f;
        aVar.y0 = 1.0f;
        aVar.z0 = 0.0f;
        aVar.A0 = 0.0f;
        aVar.B0 = 0.0f;
        aVar.C0 = 0.0f;
        aVar.D0 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hh8.e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 15) {
                aVar.r0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.r0);
            } else if (index == 28) {
                aVar.t0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.t0);
                aVar.s0 = true;
            } else if (index == 23) {
                aVar.v0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.v0);
            } else if (index == 24) {
                aVar.w0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.w0);
            } else if (index == 22) {
                aVar.u0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.u0);
            } else if (index == 20) {
                aVar.x0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.x0);
            } else if (index == 21) {
                aVar.y0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.y0);
            } else if (index == 16) {
                aVar.z0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.z0);
            } else if (index == 17) {
                aVar.A0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.A0);
            } else if (index == 18) {
                aVar.B0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.B0);
            } else if (index == 19) {
                aVar.C0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.C0);
            } else if (index == 27) {
                aVar.D0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.D0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public c getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
