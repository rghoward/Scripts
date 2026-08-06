package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hwpo_training_app.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z77 extends FrameLayout {
    public final t77 t;
    public final w77 u;
    public final x77 v;
    public r5a w;
    public c x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    public z77(Context context, AttributeSet attributeSet, int i, int i2) {
        ?? r11;
        super(uk6.a(context, attributeSet, i, i2), attributeSet, i);
        x77 x77Var = new x77();
        x77Var.u = false;
        this.v = x77Var;
        Context context2 = getContext();
        gpa gpaVarE = vka.e(context2, attributeSet, bh8.z, i, i2, 17, 15);
        t77 t77Var = new t77(context2, getClass(), getMaxItemCount());
        this.t = t77Var;
        tt0 tt0Var = new tt0(context2);
        this.u = tt0Var;
        tt0Var.setMinimumHeight(getSuggestedMinimumHeight());
        tt0Var.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        x77Var.t = tt0Var;
        x77Var.v = 1;
        tt0Var.setPresenter(x77Var);
        t77Var.b(x77Var, t77Var.a);
        x77Var.h(getContext(), t77Var);
        TypedArray typedArray = gpaVarE.b;
        if (typedArray.hasValue(11)) {
            tt0Var.setIconTintList(gpaVarE.a(11));
        } else {
            tt0Var.setIconTintList(tt0Var.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(17)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(17, 0));
        }
        if (typedArray.hasValue(15)) {
            setItemTextAppearanceActive(typedArray.getResourceId(15, 0));
        }
        if (typedArray.hasValue(4)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(3)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(3, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(16, true));
        if (typedArray.hasValue(18)) {
            setItemTextColor(gpaVarE.a(18));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListA = f83.a(background);
        if (background == null || colorStateListA != null) {
            kk6 kk6Var = new kk6(ll9.g(context2, attributeSet, i, i2).a());
            if (colorStateListA != null) {
                kk6Var.p(colorStateListA);
            }
            kk6Var.l(context2);
            setBackground(kk6Var);
        }
        if (typedArray.hasValue(13)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(13, 0));
        }
        if (typedArray.hasValue(12)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(12, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(5)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(5, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(jk6.a(context2, gpaVarE, 1));
        setLabelVisibilityMode(typedArray.getInteger(21, -1));
        setItemIconGravity(typedArray.getInteger(9, 0));
        setItemGravity(typedArray.getInteger(8, 49));
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            tt0Var.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(jk6.a(context2, gpaVarE, 14));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(22, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(19, false));
        setLabelMaxLines(typedArray.getInteger(20, 1));
        int resourceId2 = typedArray.getResourceId(6, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, bh8.y);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = typedArrayObtainStyledAttributes.getString(9);
            int dimensionPixelSize2 = -2;
            if (string != null) {
                if (String.valueOf(-1).equals(string)) {
                    dimensionPixelSize2 = -1;
                } else if (!String.valueOf(-2).equals(string)) {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(dimensionPixelSize2);
            setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset));
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize3);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize3);
            int i3 = getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset2 = getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            Rect rect = tt0Var.r0;
            rect.left = i3;
            rect.top = dimensionPixelOffset4;
            rect.right = dimensionPixelOffset2;
            rect.bottom = dimensionPixelOffset5;
            v77[] v77VarArr = tt0Var.z;
            if (v77VarArr != null) {
                for (v77 v77Var : v77VarArr) {
                    if (v77Var instanceof r77) {
                        ((r77) v77Var).setActiveIndicatorExpandedPadding(rect);
                    }
                }
            }
            setItemActiveIndicatorColor(jk6.b(context2, typedArrayObtainStyledAttributes, 2));
            r11 = 0;
            setItemActiveIndicatorShapeAppearance(ll9.f(context2, typedArrayObtainStyledAttributes.getResourceId(11, 0), 0).a());
            typedArrayObtainStyledAttributes.recycle();
        } else {
            r11 = 0;
        }
        if (typedArray.hasValue(23)) {
            int resourceId3 = typedArray.getResourceId(23, r11);
            x77 x77Var2 = this.v;
            x77Var2.u = true;
            getMenuInflater().inflate(resourceId3, this.t);
            x77Var2.u = r11;
            x77Var2.d(true);
        }
        gpaVarE.f();
        addView(this.u);
        this.t.e = new a((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.w == null) {
            this.w = new r5a(getContext());
        }
        return this.w;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.u.setMeasurePaddingFromLabelBaseline(z);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.u.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.u.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.u.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.u.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.u.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.u.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.u.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.u.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.u.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.u.getItemActiveIndicatorMarginHorizontal();
    }

    public ll9 getItemActiveIndicatorShapeAppearance() {
        return this.u.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.u.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.u.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.u.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.u.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.u.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.u.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.u.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.u.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.u.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.u.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.u.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.u.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.u.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.u.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.t;
    }

    public k getMenuView() {
        return this.u;
    }

    public ViewGroup getMenuViewGroup() {
        return this.u;
    }

    public x77 getPresenter() {
        return this.v;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.u.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.u.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lk6.e(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.t);
        Bundle bundle = dVar.v;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.t.u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (WeakReference<j> weakReference : copyOnWriteArrayList) {
            j jVar = weakReference.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = jVar.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    jVar.i(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableL;
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.v = bundle;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.t.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return dVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<j> weakReference : copyOnWriteArrayList) {
            j jVar = weakReference.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = jVar.getId();
                if (id > 0 && (parcelableL = jVar.l()) != null) {
                    sparseArray.put(id, parcelableL);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return dVar;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.u.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        lk6.c(this, f);
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.u.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.u.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.u.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.u.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.u.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.u.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.u.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.u.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.u.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.u.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(ll9 ll9Var) {
        this.u.setItemActiveIndicatorShapeAppearance(ll9Var);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.u.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.u.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.u.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) {
        w77 w77Var = this.u;
        if (w77Var.getItemGravity() != i) {
            w77Var.setItemGravity(i);
            this.v.d(false);
        }
    }

    public void setItemIconGravity(int i) {
        w77 w77Var = this.u;
        if (w77Var.getItemIconGravity() != i) {
            w77Var.setItemIconGravity(i);
            this.v.d(false);
        }
    }

    public void setItemIconSize(int i) {
        this.u.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.u.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.u.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.u.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.u.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.u.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.u.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.u.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.u.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.u.setLabelFontScalingEnabled(z);
    }

    public void setLabelMaxLines(int i) {
        this.u.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) {
        w77 w77Var = this.u;
        if (w77Var.getLabelVisibilityMode() != i) {
            w77Var.setLabelVisibilityMode(i);
            this.v.d(false);
        }
    }

    public void setOnItemSelectedListener(c cVar) {
        this.x = cVar;
    }

    public void setSelectedItemId(int i) {
        t77 t77Var = this.t;
        MenuItem menuItemFindItem = t77Var.findItem(i);
        if (menuItemFindItem != null) {
            boolean zQ = t77Var.q(menuItemFindItem, this.v, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zQ || menuItemFindItem.isChecked()) {
                    this.u.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d extends e0 {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public Bundle v;

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.v = parcel.readBundle(classLoader == null ? d.class.getClassLoader() : classLoader);
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.v);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new d[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements f.a {
        public final /* synthetic */ BottomNavigationView t;

        public a(BottomNavigationView bottomNavigationView) {
            this.t = bottomNavigationView;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            c cVar = this.t.x;
            if (cVar == null) {
                return false;
            }
            og6 og6Var = ((gg6) cVar).a;
            ho5<Object>[] ho5VarArr = og6.F;
            menuItem.getClass();
            qg6 qg6VarR = og6Var.r();
            int itemId = menuItem.getItemId();
            qg6VarR.H.b(Integer.valueOf(itemId), "SELECTED_TAB_KEY");
            qg6VarR.e(new qg6.a.C0226a(itemId));
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }
}
