package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.bh8;
import defpackage.d72;
import defpackage.g0a;
import defpackage.i0a;
import defpackage.j0a;
import defpackage.ll9;
import defpackage.z90;
import java.util.Comparator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class a extends LinearLayout {
    public int t;
    public Integer[] u;
    public g0a v;
    public i0a w;
    public int x;
    public boolean y;

    /* JADX INFO: renamed from: com.google.android.material.button.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class C0052a extends LinearLayout.LayoutParams {
    }

    public static C0052a c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C0052a((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0052a((ViewGroup.MarginLayoutParams) layoutParams) : new C0052a(layoutParams);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (d(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            View childAt2 = getChildAt(i - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.x <= 0) {
                    iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    iMin = 0;
                }
            } else {
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            LinearLayout.LayoutParams c0052a = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new C0052a(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                c0052a.setMarginEnd(0);
                c0052a.setMarginStart(this.x - iMin);
                c0052a.topMargin = 0;
            } else {
                c0052a.bottomMargin = 0;
                c0052a.topMargin = this.x - iMin;
                c0052a.setMarginStart(0);
            }
            childAt.setLayoutParams(c0052a);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        LinearLayout.LayoutParams c0052a2 = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : new C0052a(layoutParams2.width, layoutParams2.height);
        if (getOrientation() == 1) {
            c0052a2.topMargin = 0;
            c0052a2.bottomMargin = 0;
        } else {
            c0052a2.setMarginEnd(0);
            c0052a2.setMarginStart(0);
            c0052a2.leftMargin = 0;
            c0052a2.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        e();
        this.y = true;
        int iIndexOfChild = indexOfChild(null);
        if (iIndexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(null);
        materialButton.getShapeAppearance();
        throw null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0052a generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0052a c0052a = new C0052a(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bh8.m);
        typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
        return c0052a;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0052a;
    }

    public final boolean d(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap((Comparator) null);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.u = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).getClass();
        }
    }

    public final void f() {
        int i;
        if (!(this.v == null && this.w == null) && this.y) {
            this.y = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    i0a i0aVar = this.w;
                    if (i0aVar == null) {
                        throw null;
                    }
                    if (!z && !z2) {
                        throw null;
                    }
                    i0a.a aVarI = i0aVar.i();
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i3 = ~i;
                    g0a g0aVar = this.v;
                    if ((i3 | 1) == i3) {
                        aVarI.e = g0aVar;
                    }
                    if ((i3 | 2) == i3) {
                        aVarI.f = g0aVar;
                    }
                    if ((i3 | 4) == i3) {
                        aVarI.g = g0aVar;
                    }
                    if ((i3 | 8) == i3) {
                        aVarI.h = g0aVar;
                    }
                    i0a i0aVar2 = aVarI.a != 0 ? new i0a(aVarI) : null;
                    boolean zE = i0aVar2.e();
                    i0a i0aVarH = i0aVar2;
                    if (!zE) {
                        i0aVarH = i0aVar2.h();
                    }
                    materialButton.setShapeAppearance(i0aVarH);
                }
                i2++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0052a(-2, -2);
    }

    public j0a getButtonSizeChange() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.u;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public d72 getInnerCornerSize() {
        return this.v.b;
    }

    public g0a getInnerCornerSizeStateList() {
        return this.v;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.t;
    }

    public ll9 getShapeAppearance() {
        i0a i0aVar = this.w;
        if (i0aVar == null) {
            return null;
        }
        return i0aVar.h();
    }

    public int getSpacing() {
        return this.x;
    }

    public i0a getStateListShapeAppearance() {
        return this.w;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            e();
            getFirstVisibleChildIndex();
            getLastVisibleChildIndex();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a();
        if (this.t == 2) {
            if (getOrientation() == 1) {
                z90.a("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            } else {
                if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
                    throw null;
                }
                z90.a("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
        }
        f();
        super.onMeasure(i, i2);
        if (this.t != 2 || getMeasuredHeight() == 0) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), 0);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        if (indexOfChild(view) >= 0) {
            throw null;
        }
        this.y = true;
        f();
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(d72 d72Var) {
        g0a g0aVar = new g0a();
        int[][] iArr = new int[10][];
        g0aVar.c = iArr;
        g0aVar.d = new d72[10];
        int[] iArr2 = StateSet.WILD_CARD;
        int i = g0aVar.a;
        if (i == 0 || iArr2.length == 0) {
            g0aVar.b = d72Var;
        }
        if (i >= 10) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr, 0, iArr3, 0, i);
            g0aVar.c = iArr3;
            d72[] d72VarArr = new d72[i2];
            System.arraycopy(g0aVar.d, 0, d72VarArr, 0, i);
            g0aVar.d = d72VarArr;
        }
        int[][] iArr4 = g0aVar.c;
        int i3 = g0aVar.a;
        iArr4[i3] = iArr2;
        g0aVar.d[i3] = d72Var;
        g0aVar.a = i3 + 1;
        this.v = g0aVar;
        this.y = true;
        f();
        invalidate();
    }

    public void setInnerCornerSizeStateList(g0a g0aVar) {
        this.v = g0aVar;
        this.y = true;
        f();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.y = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i) {
        throw null;
    }

    public void setOverflowMode(int i) {
        if (this.t != i) {
            this.t = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(ll9 ll9Var) {
        i0a.a aVar = new i0a.a();
        aVar.b();
        aVar.a(StateSet.WILD_CARD, ll9Var);
        this.w = aVar.a == 0 ? null : new i0a(aVar);
        this.y = true;
        f();
        invalidate();
    }

    public void setSpacing(int i) {
        this.x = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(i0a i0aVar) {
        this.w = i0aVar;
        this.y = true;
        f();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C0052a(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    public void setButtonSizeChange(j0a j0aVar) {
    }
}
