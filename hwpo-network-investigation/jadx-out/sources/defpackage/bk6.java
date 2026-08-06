package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bk6 extends AppCompatCheckBox {
    public static final int[] R = {R.attr.state_indeterminate};
    public static final int[] S = {R.attr.state_error};
    public static final int[][] T = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int U = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean A;
    public boolean B;
    public boolean C;
    public CharSequence D;
    public Drawable E;
    public Drawable F;
    public boolean G;
    public ColorStateList H;
    public ColorStateList I;
    public PorterDuff.Mode J;
    public int K;
    public int[] L;
    public boolean M;
    public CharSequence N;
    public CompoundButton.OnCheckedChangeListener O;
    public final yu P;
    public final a Q;
    public final LinkedHashSet<c> x;
    public final LinkedHashSet<b> y;
    public ColorStateList z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends tt {
        public a() {
        }

        @Override // defpackage.tt
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = bk6.this.H;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // defpackage.tt
        public final void b(Drawable drawable) {
            bk6 bk6Var = bk6.this;
            ColorStateList colorStateList = bk6Var.H;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(bk6Var.L, colorStateList.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d(parcel);
                dVar.t = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.t;
            if (i != 1) {
                str = i != 2 ? "unchecked" : "indeterminate";
            } else {
                str = "checked";
            }
            return av.a(sb, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.t));
        }
    }

    public bk6(Context context, AttributeSet attributeSet, int i) {
        super(uk6.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.x = new LinkedHashSet<>();
        this.y = new LinkedHashSet<>();
        Context context2 = getContext();
        yu yuVar = new yu(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = iu8.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        yuVar.t = drawable;
        drawable.setCallback(yuVar.y);
        new yu.c(yuVar.t.getConstantState());
        this.P = yuVar;
        this.Q = new a();
        Context context3 = getContext();
        this.E = getButtonDrawable();
        this.H = getSuperButtonTintList();
        setSupportButtonTintList(null);
        gpa gpaVarE = vka.e(context3, attributeSet, bh8.q, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = gpaVarE.b;
        this.F = gpaVarE.b(2);
        if (this.E != null && bj6.c(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == U && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.E = e00.b(context3, R.drawable.mtrl_checkbox_button);
                this.G = true;
                if (this.F == null) {
                    this.F = e00.b(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.I = jk6.a(context3, gpaVarE, 3);
        this.J = wib.c(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.A = typedArray.getBoolean(11, false);
        this.B = typedArray.getBoolean(6, true);
        this.C = typedArray.getBoolean(9, false);
        this.D = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        if (typedArray.hasValue(10)) {
            setRippleColor(jk6.a(context3, gpaVarE, 10));
        }
        gpaVarE.f();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.K;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.z == null) {
            int iA = g53.a(R.attr.colorControlActivated, this);
            int iA2 = g53.a(R.attr.colorError, this);
            int iA3 = g53.a(R.attr.colorSurface, this);
            int iA4 = g53.a(R.attr.colorOnSurface, this);
            this.z = new ColorStateList(T, new int[]{g53.d(iA3, 1.0f, iA2), g53.d(iA3, 1.0f, iA), g53.d(iA3, 0.54f, iA4), g53.d(iA3, 0.38f, iA4), g53.d(iA3, 0.38f, iA4)});
        }
        return this.z;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.H;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        zu zuVar;
        Drawable drawableMutate = this.E;
        ColorStateList colorStateList3 = this.H;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.E = drawableMutate;
        Drawable drawableMutate2 = this.F;
        ColorStateList colorStateList4 = this.I;
        PorterDuff.Mode mode = this.J;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.F = drawableMutate2;
        if (this.G) {
            yu yuVar = this.P;
            if (yuVar != null) {
                yu.b bVar = yuVar.u;
                Drawable drawable = yuVar.t;
                a aVar = this.Q;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.a == null) {
                        aVar.a = new st(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.a);
                }
                ArrayList<tt> arrayList = yuVar.x;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (yuVar.x.size() == 0 && (zuVar = yuVar.w) != null) {
                        bVar.b.removeListener(zuVar);
                        yuVar.w = null;
                    }
                }
                Drawable drawable2 = yuVar.t;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.a == null) {
                        aVar.a = new st(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.a);
                } else if (aVar != null) {
                    if (yuVar.x == null) {
                        yuVar.x = new ArrayList<>();
                    }
                    if (!yuVar.x.contains(aVar)) {
                        yuVar.x.add(aVar);
                        if (yuVar.w == null) {
                            yuVar.w = new zu(yuVar);
                        }
                        bVar.b.addListener(yuVar.w);
                    }
                }
            }
            Drawable drawable3 = this.E;
            if ((drawable3 instanceof AnimatedStateListDrawable) && yuVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, yuVar, false);
                ((AnimatedStateListDrawable) this.E).addTransition(R.id.indeterminate, R.id.unchecked, yuVar, false);
            }
        }
        Drawable drawable4 = this.E;
        if (drawable4 != null && (colorStateList2 = this.H) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.F;
        if (drawable5 != null && (colorStateList = this.I) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.E;
        Drawable drawable7 = this.F;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.E;
    }

    public Drawable getButtonIconDrawable() {
        return this.F;
    }

    public ColorStateList getButtonIconTintList() {
        return this.I;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.J;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.H;
    }

    public int getCheckedState() {
        return this.K;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.D;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.K == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A && this.H == null && this.I == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        if (this.C) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, S);
        }
        for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
            }
            this.L = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.L = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.B || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.C) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.D));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.t);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.t = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(e00.b(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.F = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(e00.b(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.I == colorStateList) {
            return;
        }
        this.I = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.J == mode) {
            return;
        }
        this.J = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.H == colorStateList) {
            return;
        }
        this.H = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.B = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.K != i) {
            this.K = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.N == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.M) {
                return;
            }
            this.M = true;
            LinkedHashSet<b> linkedHashSet = this.y;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.K != 2 && (onCheckedChangeListener = this.O) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = vl.a(getContext().getSystemService(ul.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.M = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.D = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.C == z) {
            return;
        }
        this.C = z;
        refreshDrawableState();
        Iterator<c> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.O = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.N = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.A = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.E = drawable;
        this.G = false;
        a();
    }
}
