package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.bj6;
import defpackage.cy6;
import defpackage.egb;
import defpackage.f6b;
import defpackage.gk6;
import defpackage.j4;
import defpackage.ks7;
import defpackage.m3;
import defpackage.n21;
import defpackage.rj6;
import defpackage.wk2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {
    public final boolean t;
    public rj6.d u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends m3 {
        @Override // defpackage.m3
        public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
            super.onInitializeAccessibilityNodeInfo(view, j4Var);
            j4Var.k(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f6b.e(null);
        if (gk6.r(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.hwpo_training_app.R.id.cancel_button);
            setNextFocusRightId(com.hwpo_training_app.R.id.confirm_button);
        }
        this.t = gk6.r(getContext(), com.hwpo_training_app.R.attr.nestedScrollable);
        egb.o(this, new a());
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        cy6 cy6Var = (cy6) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.I;
        if (bj6.c(context.getTheme(), com.hwpo_training_app.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            n21 n21Var = cy6Var.w;
            if (n21Var != null) {
                focusRingDrawable.H.t = n21Var.a.f;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final cy6 b() {
        return (cy6) super.getAdapter();
    }

    public final boolean c(int i, boolean z) {
        rj6.d dVar;
        rj6.d dVar2;
        int iB = z ? ((cy6) super.getAdapter()).b(i) : ((cy6) super.getAdapter()).c(i);
        if (iB != -1) {
            setSelection(iB);
            return true;
        }
        if (!z && (dVar2 = this.u) != null) {
            return rj6.j(rj6.this, false);
        }
        if (!z || (dVar = this.u) == null) {
            return true;
        }
        return rj6.j(rj6.this, true);
    }

    public final boolean d(int i) {
        cy6 cy6Var = (cy6) super.getAdapter();
        if (!cy6Var.f(i)) {
            long itemId = cy6Var.getItemId(i);
            int i2 = 1;
            while (true) {
                if (i2 >= cy6Var.t.w) {
                    i = -1;
                    break;
                }
                int i3 = i + i2;
                if ((i3 < cy6.A && cy6Var.getItemId(i3) == itemId && cy6Var.f(i3)) || ((i3 = i - i2) >= 0 && cy6Var.getItemId(i3) == itemId && cy6Var.f(i3))) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (cy6) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((cy6) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: xj6
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.a(this.t);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cy6 cy6Var = (cy6) super.getAdapter();
        wk2<?> wk2Var = cy6Var.u;
        int iMax = Math.max(cy6Var.d(), getFirstVisiblePosition());
        int iMin = Math.min(cy6Var.g(), getLastVisiblePosition());
        cy6Var.getItem(iMax);
        cy6Var.getItem(iMin);
        ArrayList arrayListI = wk2Var.i();
        int size = arrayListI.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListI.get(i);
            i++;
            ((ks7) obj).getClass();
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int iC;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            cy6 cy6Var = (cy6) super.getAdapter();
            iC = cy6Var.c(cy6Var.g() + 1);
        } else if (i == 130 || i == 2) {
            cy6 cy6Var2 = (cy6) super.getAdapter();
            iC = cy6Var2.b(cy6Var2.d() - 1);
        } else {
            iC = -1;
        }
        if (iC != -1) {
            setSelection(iC);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = getLayoutDirection() == 1;
        if (i == 21) {
            return c(selectedItemPosition, z);
        }
        if (i == 22) {
            return c(selectedItemPosition, !z);
        }
        if (i == 61) {
            int iC = keyEvent.isShiftPressed() ? ((cy6) super.getAdapter()).c(selectedItemPosition) : ((cy6) super.getAdapter()).b(selectedItemPosition);
            if (iC == -1) {
                return false;
            }
            setSelection(iC);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        cy6 cy6Var = (cy6) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || cy6Var.f(selectedItemPosition2)) {
            return true;
        }
        cy6 cy6Var2 = (cy6) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > cy6Var2.g()) {
                            break;
                        }
                        if (!d(numColumns)) {
                            selectedItemPosition2 = getNumColumns();
                        }
                    }
                }
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                selectedItemPosition2 -= numColumns2;
                if (selectedItemPosition2 < cy6Var2.d()) {
                    return false;
                }
                if (d(selectedItemPosition2)) {
                    break;
                }
                numColumns2 = getNumColumns();
            }
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.t) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof cy6)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), cy6.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        cy6 cy6Var = (cy6) super.getAdapter();
        super.setSelection(Math.max(i, cy6Var.b(cy6Var.d() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (cy6) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
