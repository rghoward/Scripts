package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.hwpo_training_app.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tt0 extends w77 {
    public final int u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public boolean y0;
    public final ArrayList z0;

    public tt0(Context context) {
        super(context);
        this.z0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.u0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.v0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.w0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.x0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // defpackage.w77
    public final st0 f(Context context) {
        return new st0(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int i4;
        int iMin;
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        ArrayList arrayList = this.z0;
        arrayList.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        int i8 = 0;
        if (getItemIconGravity() == 0) {
            int labelVisibilityMode = getLabelVisibilityMode();
            int i9 = this.w0;
            if (labelVisibilityMode != -1 ? labelVisibilityMode != 0 : currentVisibleContentItemCount <= 3) {
                iMin = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), i9);
                i5 = size - (currentVisibleContentItemCount * iMin);
                for (i6 = 0; i6 < childCount; i6++) {
                    if (getChildAt(i6).getVisibility() != 8) {
                        i7 = 0;
                    } else if (i5 > 0) {
                        i7 = iMin + 1;
                        i5--;
                    } else {
                        i7 = iMin;
                    }
                    arrayList.add(Integer.valueOf(i7));
                }
            } else if (this.y0) {
                View childAt = getChildAt(getSelectedItemPosition());
                int visibility = childAt.getVisibility();
                int iMax2 = this.x0;
                if (visibility != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i10 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin2 = Math.min(size - (this.v0 * i10), Math.min(iMax2, i9));
                int i11 = size - iMin2;
                int iMin3 = Math.min(i11 / (i10 != 0 ? i10 : 1), this.u0);
                int i12 = i11 - (i10 * iMin3);
                int i13 = 0;
                while (i13 < childCount) {
                    if (getChildAt(i13).getVisibility() != 8) {
                        i4 = i13 == getSelectedItemPosition() ? iMin2 : iMin3;
                        if (i12 > 0) {
                            i4++;
                            i12--;
                        }
                    } else {
                        i4 = 0;
                    }
                    arrayList.add(Integer.valueOf(i4));
                    i13++;
                }
            } else {
                iMin = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), i9);
                i5 = size - (currentVisibleContentItemCount * iMin);
                while (i6 < childCount) {
                    if (getChildAt(i6).getVisibility() != 8) {
                        i7 = 0;
                    } else if (i5 > 0) {
                        i7 = iMin + 1;
                        i5--;
                    } else {
                        i7 = iMin;
                    }
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            i3 = 0;
            iMax = 0;
            while (i8 < childCount) {
                View childAt2 = getChildAt(i8);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i8)).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    int measuredWidth = childAt2.getMeasuredWidth() + i3;
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                    i3 = measuredWidth;
                }
                i8++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f = size;
            float fMin = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f;
            float f2 = currentVisibleContentItemCount;
            int iRound = Math.round(fMin / f2);
            int iRound2 = Math.round(f / f2);
            int i14 = 0;
            int iMax3 = 0;
            while (i8 < childCount) {
                View childAt3 = getChildAt(i8);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    int measuredWidth2 = childAt3.getMeasuredWidth() + i14;
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                    i14 = measuredWidth2;
                }
                i8++;
            }
            i3 = i14;
            iMax = iMax3;
        }
        setMeasuredDimension(i3, Math.max(iMax, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.y0 = z;
    }
}
