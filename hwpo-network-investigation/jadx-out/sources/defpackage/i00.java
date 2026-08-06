package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i00 extends Spinner {
    public static final int[] B = {R.attr.spinnerMode};
    public final Rect A;
    public final wy t;
    public final Context u;
    public final h00 v;
    public SpinnerAdapter w;
    public final boolean x;
    public final g y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            i00 i00Var = i00.this;
            if (!i00Var.getInternalPopup().a()) {
                i00Var.y.n(i00Var.getTextDirection(), i00Var.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = i00Var.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements g, DialogInterface.OnClickListener {
        public androidx.appcompat.app.e t;
        public d u;
        public CharSequence v;

        public c() {
        }

        @Override // i00.g
        public final boolean a() {
            androidx.appcompat.app.e eVar = this.t;
            if (eVar != null) {
                return eVar.isShowing();
            }
            return false;
        }

        @Override // i00.g
        public final int c() {
            return 0;
        }

        @Override // i00.g
        public final void dismiss() {
            androidx.appcompat.app.e eVar = this.t;
            if (eVar != null) {
                eVar.dismiss();
                this.t = null;
            }
        }

        @Override // i00.g
        public final void e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // i00.g
        public final CharSequence f() {
            return this.v;
        }

        @Override // i00.g
        public final Drawable h() {
            return null;
        }

        @Override // i00.g
        public final void i(CharSequence charSequence) {
            this.v = charSequence;
        }

        @Override // i00.g
        public final void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // i00.g
        public final void l(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // i00.g
        public final void m(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // i00.g
        public final void n(int i, int i2) {
            if (this.u == null) {
                return;
            }
            i00 i00Var = i00.this;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(i00Var.getPopupContext());
            CharSequence charSequence = this.v;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.e eVarCreate = aVar.setSingleChoiceItems(this.u, i00Var.getSelectedItemPosition(), this).create();
            this.t = eVarCreate;
            AlertController.RecycleListView recycleListView = eVarCreate.z.g;
            recycleListView.setTextDirection(i);
            recycleListView.setTextAlignment(i2);
            this.t.show();
        }

        @Override // i00.g
        public final int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            i00 i00Var = i00.this;
            i00Var.setSelection(i);
            if (i00Var.getOnItemClickListener() != null) {
                i00Var.performItemClick(null, i, this.u.getItemId(i));
            }
            dismiss();
        }

        @Override // i00.g
        public final void p(ListAdapter listAdapter) {
            this.u = (d) listAdapter;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter t;
        public ListAdapter u;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.u;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.t;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.t;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.t;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.t;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.t;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.u;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.t;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.t;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e extends va6 implements g {
        public CharSequence V;
        public d W;
        public final Rect X;
        public int Y;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                e eVar = e.this;
                i00 i00Var = i00.this;
                i00Var.setSelection(i);
                if (i00Var.getOnItemClickListener() != null) {
                    i00Var.performItemClick(view, i, eVar.W.getItemId(i));
                }
                eVar.dismiss();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e eVar = e.this;
                i00 i00Var = i00.this;
                if (!i00Var.isAttachedToWindow() || !i00Var.getGlobalVisibleRect(eVar.X)) {
                    eVar.dismiss();
                } else {
                    eVar.s();
                    eVar.b();
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ b t;

            public c(b bVar) {
                this.t = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = i00.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.t);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.X = new Rect();
            this.H = i00.this;
            this.R = true;
            this.S.setFocusable(true);
            this.I = new a();
        }

        @Override // i00.g
        public final CharSequence f() {
            return this.V;
        }

        @Override // i00.g
        public final void i(CharSequence charSequence) {
            this.V = charSequence;
        }

        @Override // i00.g
        public final void m(int i) {
            this.Y = i;
        }

        @Override // i00.g
        public final void n(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            zz zzVar = this.S;
            boolean zIsShowing = zzVar.isShowing();
            s();
            zzVar.setInputMethodMode(2);
            b();
            m83 m83Var = this.v;
            m83Var.setChoiceMode(1);
            m83Var.setTextDirection(i);
            m83Var.setTextAlignment(i2);
            i00 i00Var = i00.this;
            int selectedItemPosition = i00Var.getSelectedItemPosition();
            m83 m83Var2 = this.v;
            if (zzVar.isShowing() && m83Var2 != null) {
                m83Var2.setListSelectionHidden(false);
                m83Var2.setSelection(selectedItemPosition);
                if (m83Var2.getChoiceMode() != 0) {
                    m83Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = i00Var.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            zzVar.setOnDismissListener(new c(bVar));
        }

        @Override // defpackage.va6, i00.g
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.W = (d) listAdapter;
        }

        public final void s() {
            int i;
            zz zzVar = this.S;
            Drawable background = zzVar.getBackground();
            i00 i00Var = i00.this;
            Rect rect = i00Var.A;
            if (background != null) {
                background.getPadding(rect);
                boolean z = yib.a;
                i = i00Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
            } else {
                i = 0;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = i00Var.getPaddingLeft();
            int paddingRight = i00Var.getPaddingRight();
            int width = i00Var.getWidth();
            int i2 = i00Var.z;
            if (i2 == -2) {
                int iA = i00Var.a(this.W, zzVar.getBackground());
                int i3 = (i00Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
                if (iA > i3) {
                    iA = i3;
                }
                r(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i2);
            }
            boolean z2 = yib.a;
            this.y = i00Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.x) - this.Y) + i : paddingLeft + this.Y + i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public boolean t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                f fVar = new f(parcel);
                fVar.t = parcel.readByte() != 0;
                return fVar;
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i) {
                return new f[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface g {
        boolean a();

        int c();

        void dismiss();

        void e(int i);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i);

        void m(int i);

        void n(int i, int i2);

        int o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    public i00(Context context, AttributeSet attributeSet, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.A = new Rect();
        xka.a(this, getContext());
        int[] iArr = ph8.u;
        gpa gpaVarE = gpa.e(context, attributeSet, iArr, i);
        TypedArray typedArray = gpaVarE.b;
        this.t = new wy(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.u = new p02(context, resourceId);
        } else {
            this.u = context;
        }
        int i2 = -1;
        TypedArray typedArray2 = null;
        try {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i2 != 0) {
                        c cVar = new c();
                        this.y = cVar;
                        cVar.v = typedArray.getString(2);
                    } else if (i2 == 1) {
                        e eVar = new e(this.u, attributeSet, i);
                        gpa gpaVarE2 = gpa.e(this.u, attributeSet, iArr, i);
                        this.z = gpaVarE2.b.getLayoutDimension(3, -2);
                        eVar.k(gpaVarE2.b(1));
                        eVar.V = typedArray.getString(2);
                        gpaVarE2.f();
                        this.y = eVar;
                        this.v = new h00(this, this, eVar);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.hwpo_training_app.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    gpaVarE.f();
                    this.x = true;
                    spinnerAdapter = this.w;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.w = null;
                    }
                    this.t.d(attributeSet, i);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            c cVar2 = new c();
            this.y = cVar2;
            cVar2.v = typedArray.getString(2);
        } else if (i2 == 1) {
            e eVar2 = new e(this.u, attributeSet, i);
            gpa gpaVarE3 = gpa.e(this.u, attributeSet, iArr, i);
            this.z = gpaVarE3.b.getLayoutDimension(3, -2);
            eVar2.k(gpaVarE3.b(1));
            eVar2.V = typedArray.getString(2);
            gpaVarE3.f();
            this.y = eVar2;
            this.v = new h00(this, this, eVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.hwpo_training_app.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        gpaVarE.f();
        this.x = true;
        spinnerAdapter = this.w;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.w = null;
        }
        this.t.d(attributeSet, i);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.A;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.y;
        return gVar != null ? gVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.y;
        return gVar != null ? gVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.y != null ? this.z : super.getDropDownWidth();
    }

    public final g getInternalPopup() {
        return this.y;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.y;
        return gVar != null ? gVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.u;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.y;
        return gVar != null ? gVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        wy wyVar = this.t;
        if (wyVar != null) {
            return wyVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wy wyVar = this.t;
        if (wyVar != null) {
            return wyVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.y;
        if (gVar == null || !gVar.a()) {
            return;
        }
        gVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.y == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.t || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.y;
        fVar.t = gVar != null && gVar.a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h00 h00Var = this.v;
        if (h00Var == null || !h00Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        g gVar = this.y;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        gVar.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.x) {
            this.w = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        g gVar = this.y;
        if (gVar != null) {
            Context context = this.u;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            d dVar = new d();
            dVar.t = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                dVar.u = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    b.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof yka) {
                    yka ykaVar = (yka) spinnerAdapter;
                    if (ykaVar.getDropDownViewTheme() == null) {
                        ykaVar.a();
                    }
                }
            }
            gVar.p(dVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        g gVar = this.y;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            gVar.m(i);
            gVar.e(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        g gVar = this.y;
        if (gVar != null) {
            gVar.l(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.y != null) {
            this.z = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.y;
        if (gVar != null) {
            gVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(e00.b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.y;
        if (gVar != null) {
            gVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.i(mode);
        }
    }
}
