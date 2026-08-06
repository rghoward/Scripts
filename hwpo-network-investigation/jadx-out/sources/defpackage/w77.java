package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w77 extends ViewGroup implements k {
    public static final int[] s0 = {R.attr.state_checked};
    public static final int[] t0 = {-16842910};
    public int A;
    public int B;
    public ColorStateList C;
    public int D;
    public ColorStateList E;
    public final ColorStateList F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public Drawable L;
    public ColorStateList M;
    public int N;
    public final SparseArray<ti0> O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public ll9 e0;
    public boolean f0;
    public ColorStateList g0;
    public x77 h0;
    public u77 i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public int m0;
    public boolean n0;
    public MenuItem o0;
    public int p0;
    public boolean q0;
    public final Rect r0;
    public final qc0 t;
    public final a u;
    public z58 v;
    public final SparseArray<View.OnTouchListener> w;
    public int x;
    public int y;
    public v77[] z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements View.OnClickListener {
        public final /* synthetic */ tt0 t;

        public a(tt0 tt0Var) {
            this.t = tt0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h itemData = ((r77) view).getItemData();
            tt0 tt0Var = this.t;
            u77 u77Var = tt0Var.i0;
            boolean zQ = u77Var.a.q(itemData, tt0Var.h0, 0);
            if (itemData == null || !itemData.isCheckable()) {
                return;
            }
            if (!zQ || itemData.isChecked()) {
                tt0Var.setCheckedItem(itemData);
            }
        }
    }

    public w77(Context context) {
        super(context);
        this.w = new SparseArray<>();
        this.A = -1;
        this.B = -1;
        this.O = new SparseArray<>();
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.d0 = 49;
        this.f0 = false;
        this.l0 = 1;
        this.m0 = 0;
        this.o0 = null;
        this.p0 = 7;
        this.q0 = false;
        this.r0 = new Rect();
        this.F = c();
        if (isInEditMode()) {
            this.t = null;
        } else {
            qc0 qc0Var = new qc0();
            this.t = qc0Var;
            qc0Var.S(0);
            qc0Var.o();
            qc0Var.G(az6.c(getContext(), com.hwpo_training_app.R.attr.motionDurationMedium4, getResources().getInteger(com.hwpo_training_app.R.integer.material_motion_duration_long_1)));
            qc0Var.I(az6.d(getContext(), com.hwpo_training_app.R.attr.motionEasingStandard, aw.b));
            qc0Var.O(new pja());
        }
        this.u = new a((tt0) this);
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.p0, this.i0.e);
    }

    private r77 getNewItem() {
        z58 z58Var = this.v;
        r77 r77Var = z58Var != null ? (r77) z58Var.b() : null;
        return r77Var == null ? f(getContext()) : r77Var;
    }

    private void setBadgeIfNeeded(r77 r77Var) {
        ti0 ti0Var;
        int id = r77Var.getId();
        if (id == -1 || (ti0Var = this.O.get(id)) == null) {
            return;
        }
        r77Var.setBadge(ti0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        r77 r77VarE;
        View viewE;
        p77 p77Var;
        removeAllViews();
        v77[] v77VarArr = this.z;
        if (v77VarArr != null && this.v != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    r77 r77Var = (r77) v77Var;
                    this.v.a(r77Var);
                    ImageView imageView = r77Var.M;
                    if (r77Var.t0 != null) {
                        if (imageView != null) {
                            r77Var.setClipChildren(true);
                            r77Var.setClipToPadding(true);
                            ti0 ti0Var = r77Var.t0;
                            if (ti0Var != null) {
                                if (ti0Var.e() != null) {
                                    ti0Var.e().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(ti0Var);
                                }
                            }
                        }
                        r77Var.t0 = null;
                    }
                    r77Var.e0 = null;
                    r77Var.k0 = 0.0f;
                    r77Var.t = false;
                }
            }
        }
        this.h0.u = true;
        this.i0.b();
        this.h0.u = false;
        int i = this.i0.c;
        if (i == 0) {
            this.A = 0;
            this.B = 0;
            this.z = null;
            this.v = null;
            return;
        }
        if (this.v == null || this.m0 != i) {
            this.m0 = i;
            this.v = new z58(i);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.i0.b.size(); i2++) {
            hashSet.add(Integer.valueOf(this.i0.a(i2).getItemId()));
        }
        int i3 = 0;
        while (true) {
            SparseArray<ti0> sparseArray = this.O;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i3++;
        }
        int size = this.i0.b.size();
        this.z = new v77[size];
        int i4 = this.x;
        boolean z = i4 != -1 ? i4 == 0 : getCurrentVisibleContentItemCount() > 3;
        int size2 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem menuItemA = this.i0.a(i6);
            boolean z2 = menuItemA instanceof w33;
            if (z2) {
                Context context = getContext();
                p77Var = new p77(context);
                LayoutInflater.from(context).inflate(com.hwpo_training_app.R.layout.m3_navigation_menu_divider, (ViewGroup) p77Var, true);
                p77Var.a();
                p77Var.setOnlyShowWhenExpanded(true);
                p77Var.setDividersEnabled(this.q0);
            } else if (menuItemA.hasSubMenu()) {
                if (size2 > 0) {
                    z90.a("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                    return;
                }
                y77 y77Var = new y77(getContext());
                int i7 = this.J;
                if (i7 == 0) {
                    i7 = this.H;
                }
                y77Var.setTextAppearance(i7);
                y77Var.setTextColor(this.E);
                y77Var.setOnlyShowWhenExpanded(true);
                y77Var.c((h) menuItemA);
                size2 = menuItemA.getSubMenu().size();
                viewE = y77Var;
            } else if (size2 > 0) {
                r77VarE = e(i6, (h) menuItemA, z, true);
                size2--;
            } else {
                h hVar = (h) menuItemA;
                boolean z3 = i5 >= this.p0;
                i5++;
                viewE = e(i6, hVar, z, z3);
            }
            if (z2) {
                viewE = r77VarE;
                viewE = p77Var;
            } else {
                viewE = r77VarE;
                if (menuItemA.isCheckable() && this.B == -1) {
                    viewE = p77Var;
                    this.B = i6;
                } else {
                    viewE = p77Var;
                }
            }
            this.z[i6] = viewE;
            addView(viewE);
        }
        int iMin = Math.min(size - 1, this.B);
        this.B = iMin;
        setCheckedItem(this.z[iMin].getItemData());
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar) {
        this.i0 = new u77(fVar);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = vz1.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.hwpo_training_app.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = s0;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = t0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListB.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    public final kk6 d() {
        if (this.e0 == null || this.g0 == null) {
            return null;
        }
        kk6 kk6Var = new kk6(this.e0);
        kk6Var.p(this.g0);
        return kk6Var;
    }

    public final r77 e(int i, h hVar, boolean z, boolean z2) {
        this.h0.u = true;
        hVar.setCheckable(true);
        this.h0.u = false;
        r77 newItem = getNewItem();
        newItem.setShifting(z);
        newItem.setLabelMaxLines(this.l0);
        newItem.setIconTintList(this.C);
        newItem.setIconSize(this.D);
        newItem.setTextColor(this.F);
        newItem.setTextAppearanceInactive(this.G);
        newItem.setTextAppearanceActive(this.H);
        newItem.setHorizontalTextAppearanceInactive(this.I);
        newItem.setHorizontalTextAppearanceActive(this.J);
        newItem.setTextAppearanceActiveBoldEnabled(this.K);
        newItem.setTextColor(this.E);
        int i2 = this.P;
        if (i2 != -1) {
            newItem.setItemPaddingTop(i2);
        }
        int i3 = this.Q;
        if (i3 != -1) {
            newItem.setItemPaddingBottom(i3);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.j0);
        newItem.setLabelFontScalingEnabled(this.k0);
        int i4 = this.R;
        if (i4 != -1) {
            newItem.setActiveIndicatorLabelPadding(i4);
        }
        int i5 = this.S;
        if (i5 != -1) {
            newItem.setIconLabelHorizontalSpacing(i5);
        }
        newItem.setActiveIndicatorWidth(this.U);
        newItem.setActiveIndicatorHeight(this.V);
        newItem.setActiveIndicatorExpandedWidth(this.W);
        newItem.setActiveIndicatorExpandedHeight(this.a0);
        newItem.setActiveIndicatorMarginHorizontal(this.b0);
        newItem.setItemGravity(this.d0);
        newItem.setActiveIndicatorExpandedPadding(this.r0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.c0);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.f0);
        newItem.setActiveIndicatorEnabled(this.T);
        Drawable drawable = this.L;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.N);
        }
        newItem.setItemRippleColor(this.M);
        newItem.setLabelVisibilityMode(this.x);
        newItem.setItemIconGravity(this.y);
        newItem.setOnlyShowWhenExpanded(z2);
        newItem.setExpanded(this.n0);
        newItem.c(hVar);
        newItem.setItemPosition(i);
        int i6 = hVar.a;
        newItem.setOnTouchListener(this.w.get(i6));
        newItem.setOnClickListener(this.u);
        int i7 = this.A;
        if (i7 != 0 && i6 == i7) {
            this.B = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public abstract st0 f(Context context);

    public final r77 g() {
        h();
        v77[] v77VarArr = this.z;
        if (v77VarArr == null) {
            return null;
        }
        for (v77 v77Var : v77VarArr) {
            if (v77Var instanceof r77) {
                r77 r77Var = (r77) v77Var;
                if (r77Var.getId() == com.hwpo_training_app.R.id.notificaions) {
                    return r77Var;
                }
            }
        }
        return null;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.R;
    }

    public SparseArray<ti0> getBadgeDrawables() {
        return this.O;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.n0 ? this.i0.d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.J;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.I;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.S;
    }

    public ColorStateList getIconTintList() {
        return this.C;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.g0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.T;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.a0;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.c0;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.W;
    }

    public int getItemActiveIndicatorHeight() {
        return this.V;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.b0;
    }

    public ll9 getItemActiveIndicatorShapeAppearance() {
        return this.e0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.U;
    }

    public Drawable getItemBackground() {
        v77[] v77VarArr = this.z;
        if (v77VarArr != null && v77VarArr.length > 0) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    return ((r77) v77Var).getBackground();
                }
            }
        }
        return this.L;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.N;
    }

    public int getItemGravity() {
        return this.d0;
    }

    public int getItemIconGravity() {
        return this.y;
    }

    public int getItemIconSize() {
        return this.D;
    }

    public int getItemPaddingBottom() {
        return this.Q;
    }

    public int getItemPaddingTop() {
        return this.P;
    }

    public ColorStateList getItemRippleColor() {
        return this.M;
    }

    public int getItemTextAppearanceActive() {
        return this.H;
    }

    public int getItemTextAppearanceInactive() {
        return this.G;
    }

    public ColorStateList getItemTextColor() {
        return this.E;
    }

    public int getLabelMaxLines() {
        return this.l0;
    }

    public int getLabelVisibilityMode() {
        return this.x;
    }

    public u77 getMenu() {
        return this.i0;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.k0;
    }

    public int getSelectedItemId() {
        return this.A;
    }

    public int getSelectedItemPosition() {
        return this.B;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.g.a(1, getCurrentVisibleContentItemCount(), 1).a);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.R = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.o0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.o0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.o0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.o0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i) {
        this.p0 = i;
    }

    public void setExpanded(boolean z) {
        this.n0 = z;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                v77Var.setExpanded(z);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.J = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.I = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.S = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.g0 = colorStateList;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.T = z;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorEnabled(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.a0 = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.c0 = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.W = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.V = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.b0 = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f0 = z;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorResizeable(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(ll9 ll9Var) {
        this.e0 = ll9Var;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.U = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.L = drawable;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.N = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.d0 = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.y = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(int i) {
        this.D = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setIconSize(i);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.Q = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setItemPaddingBottom(this.Q);
                }
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.P = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.M = colorStateList;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.H = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.K = z;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setTextAppearanceActiveBoldEnabled(z);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.G = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.k0 = z;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setLabelFontScalingEnabled(z);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.l0 = i;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.x = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z) {
        this.j0 = z;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof r77) {
                    ((r77) v77Var).setMeasureBottomPaddingFromLabelBaseline(z);
                }
            }
        }
    }

    public void setPresenter(x77 x77Var) {
        this.h0 = x77Var;
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.q0 == z) {
            return;
        }
        this.q0 = z;
        v77[] v77VarArr = this.z;
        if (v77VarArr != null) {
            for (v77 v77Var : v77VarArr) {
                if (v77Var instanceof p77) {
                    ((p77) v77Var).setDividersEnabled(z);
                }
            }
        }
    }

    public static void h() {
    }
}
