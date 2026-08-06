package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nj6 extends com.google.android.material.button.a {
    public boolean A;
    public boolean B;
    public HashSet C;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends m3 {
        public a() {
        }

        @Override // defpackage.m3
        public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
            super.onInitializeAccessibilityNodeInfo(view, j4Var);
            int i = -1;
            if (view instanceof MaterialButton) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    nj6 nj6Var = nj6.this;
                    if (i2 >= nj6Var.getChildCount()) {
                        break;
                    }
                    if (nj6Var.getChildAt(i2) == view) {
                        i = i3;
                        break;
                    }
                    if ((nj6Var.getChildAt(i2) instanceof MaterialButton) && nj6Var.getChildAt(i2).getVisibility() != 8) {
                        i3++;
                    }
                    i2++;
                }
            }
            j4Var.l(j4.h.a(((MaterialButton) view).M, 0, 1, i, 1));
        }
    }

    private String getChildrenA11yClassName() {
        return (this.A ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // com.google.android.material.button.a, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        g(materialButton.getId(), materialButton.M);
        egb.o(materialButton, new a());
    }

    public final void g(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.C);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.A && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.B || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        h(hashSet);
    }

    public int getCheckedButtonId() {
        if (!this.A || this.C.isEmpty()) {
            return -1;
        }
        return ((Integer) this.C.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.C.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final void h(Set<Integer> set) {
        HashSet hashSet = this.C;
        this.C = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.z = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.z = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                throw null;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        h(Collections.singleton(0));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.g.a(1, getVisibleButtonCount(), this.A ? 1 : 2).a);
    }

    public void setSelectionRequired(boolean z) {
        this.B = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.A != z) {
            this.A = z;
            h(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
