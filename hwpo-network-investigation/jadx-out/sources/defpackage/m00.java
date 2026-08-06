package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class m00 extends TextView {
    private final wy mBackgroundTintHelper;
    private vz mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<y68> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final j00 mTextClassifierHelper;
    private final k00 mTextHelper;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a(int i);

        void b(int i);

        void c(int i, float f);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends b {
        public c() {
            super();
        }

        @Override // m00.b, m00.a
        public final void a(int i) {
            m00.super.setLastBaselineToBottomHeight(i);
        }

        @Override // m00.b, m00.a
        public final void b(int i) {
            m00.super.setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends c {
        public d() {
            super();
        }

        @Override // m00.b, m00.a
        public final void c(int i, float f) {
            m00.super.setLineHeight(i, f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dpa.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        xka.a(this, getContext());
        wy wyVar = new wy(this);
        this.mBackgroundTintHelper = wyVar;
        wyVar.d(attributeSet, i);
        k00 k00Var = new k00(this);
        this.mTextHelper = k00Var;
        k00Var.f(attributeSet, i);
        k00Var.b();
        j00 j00Var = new j00();
        j00Var.a = this;
        this.mTextClassifierHelper = j00Var;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<y68> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                y68 y68Var = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    y68Var.getClass();
                    setText((CharSequence) null);
                } else {
                    y68.a aVarA = eka.a(this);
                    y68Var.getClass();
                    aVarA.a(null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private vz getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new vz(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        wy wyVar = this.mBackgroundTintHelper;
        if (wyVar != null) {
            wyVar.a();
        }
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (yib.c) {
            return super.getAutoSizeMaxTextSize();
        }
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            return Math.round(k00Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (yib.c) {
            return super.getAutoSizeMinTextSize();
        }
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            return Math.round(k00Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (yib.c) {
            return super.getAutoSizeStepGranularity();
        }
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            return Math.round(k00Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (yib.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        k00 k00Var = this.mTextHelper;
        return k00Var != null ? k00Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (yib.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            return k00Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return eka.e(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.mSuperCaller = new d();
            } else if (i >= 28) {
                this.mSuperCaller = new c();
            } else if (i >= 26) {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        wy wyVar = this.mBackgroundTintHelper;
        if (wyVar != null) {
            return wyVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wy wyVar = this.mBackgroundTintHelper;
        if (wyVar != null) {
            return wyVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        j00 j00Var;
        if (Build.VERSION.SDK_INT >= 28 || (j00Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = j00Var.b;
        return textClassifier == null ? j00.a.a(j00Var.a) : textClassifier;
    }

    public y68.a getTextMetricsParamsCompat() {
        return eka.a(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b.a.b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            vd3.c(editorInfo, getText());
        }
        wz.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k00 k00Var = this.mTextHelper;
        if (k00Var == null || yib.c) {
            return;
        }
        k00Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        k00 k00Var = this.mTextHelper;
        if (k00Var == null || yib.c || !k00Var.i.f()) {
            return;
        }
        this.mTextHelper.i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (yib.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (yib.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (yib.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wy wyVar = this.mBackgroundTintHelper;
        if (wyVar != null) {
            wyVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        wy wyVar = this.mBackgroundTintHelper;
        if (wyVar != null) {
            wyVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? e00.b(context, i) : null, i2 != 0 ? e00.b(context, i2) : null, i3 != 0 ? e00.b(context, i3) : null, i4 != 0 ? e00.b(context, i4) : null);
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? e00.b(context, i) : null, i2 != 0 ? e00.b(context, i2) : null, i3 != 0 ? e00.b(context, i3) : null, i4 != 0 ? e00.b(context, i4) : null);
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(eka.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i);
        } else {
            eka.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            eka.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().c(i, f);
        } else if (i2 >= 34) {
            eka.b.a(this, i, f);
        } else {
            eka.d(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(y68 y68Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            y68Var.getClass();
            setText((CharSequence) null);
        } else {
            y68.a aVarA = eka.a(this);
            y68Var.getClass();
            aVarA.a(null);
            throw null;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wy wyVar = this.mBackgroundTintHelper;
        if (wyVar != null) {
            wyVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wy wyVar = this.mBackgroundTintHelper;
        if (wyVar != null) {
            wyVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        j00 j00Var;
        if (Build.VERSION.SDK_INT >= 28 || (j00Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            j00Var.b = textClassifier;
        }
    }

    public void setTextFuture(Future<y68> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(y68.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.a);
        setBreakStrategy(aVar.c);
        setHyphenationFrequency(aVar.d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = yib.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            n00 n00Var = k00Var.i;
            if (z || n00Var.f()) {
                return;
            }
            n00Var.g(f, i);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            rza rzaVar = kza.a;
            if (context == null) {
                z90.a("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements a {
        public b() {
        }

        @Override // m00.a
        public void a(int i) {
        }

        @Override // m00.a
        public void b(int i) {
        }

        @Override // m00.a
        public void c(int i, float f) {
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        eka.d(this, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        k00 k00Var = this.mTextHelper;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    public m00(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public m00(Context context) {
        this(context, null);
    }
}
