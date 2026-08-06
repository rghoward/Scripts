package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class va6 implements ao9 {
    public static final Method T;
    public static final Method U;
    public boolean B;
    public boolean C;
    public boolean D;
    public d G;
    public View H;
    public AdapterView.OnItemClickListener I;
    public AdapterView.OnItemSelectedListener J;
    public final Handler O;
    public Rect Q;
    public boolean R;
    public final zz S;
    public final Context t;
    public ListAdapter u;
    public m83 v;
    public int y;
    public int z;
    public final int w = -2;
    public int x = -2;
    public final int A = 1002;
    public int E = 0;
    public final int F = Integer.MAX_VALUE;
    public final g K = new g();
    public final f L = new f();
    public final e M = new e();
    public final c N = new c();
    public final Rect P = new Rect();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m83 m83Var = va6.this.v;
            if (m83Var != null) {
                m83Var.setListSelectionHidden(true);
                m83Var.requestLayout();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            va6 va6Var = va6.this;
            if (va6Var.S.isShowing()) {
                va6Var.b();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            va6.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            va6 va6Var = va6.this;
            g gVar = va6Var.K;
            Handler handler = va6Var.O;
            zz zzVar = va6Var.S;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && zzVar != null && zzVar.isShowing() && x >= 0 && x < zzVar.getWidth() && y >= 0 && y < zzVar.getHeight()) {
                handler.postDelayed(gVar, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            handler.removeCallbacks(gVar);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            va6 va6Var = va6.this;
            m83 m83Var = va6Var.v;
            if (m83Var == null || !m83Var.isAttachedToWindow() || va6Var.v.getCount() <= va6Var.v.getChildCount() || va6Var.v.getChildCount() > va6Var.F) {
                return;
            }
            va6Var.S.setInputMethodMode(2);
            va6Var.b();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                T = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                U = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public va6(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.t = context;
        this.O = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ph8.o, i, 0);
        this.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.B = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        zz zzVar = new zz(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ph8.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            zzVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        zzVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : e00.b(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.S = zzVar;
        zzVar.setInputMethodMode(1);
    }

    @Override // defpackage.ao9
    public final boolean a() {
        return this.S.isShowing();
    }

    @Override // defpackage.ao9
    public final void b() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        m83 m83Var;
        m83 m83Var2 = this.v;
        Context context = this.t;
        zz zzVar = this.S;
        if (m83Var2 == null) {
            m83 m83VarQ = q(context, !this.R);
            this.v = m83VarQ;
            m83VarQ.setAdapter(this.u);
            this.v.setOnItemClickListener(this.I);
            this.v.setFocusable(true);
            this.v.setFocusableInTouchMode(true);
            this.v.setOnItemSelectedListener(new ua6(this));
            this.v.setOnScrollListener(this.M);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.J;
            if (onItemSelectedListener != null) {
                this.v.setOnItemSelectedListener(onItemSelectedListener);
            }
            zzVar.setContentView(this.v);
        }
        Drawable background = zzVar.getBackground();
        Rect rect = this.P;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.B) {
                this.z = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = a.a(zzVar, this.H, this.z, zzVar.getInputMethodMode() == 2);
        int i3 = this.w;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.x;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.v.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.v.getPaddingBottom() + this.v.getPaddingTop() + i : 0);
        }
        boolean z = zzVar.getInputMethodMode() == 2;
        zzVar.setWindowLayoutType(this.A);
        if (zzVar.isShowing()) {
            if (this.H.isAttachedToWindow()) {
                int width = this.x;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.H.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.x;
                    if (z) {
                        zzVar.setWidth(i5 == -1 ? -1 : 0);
                        zzVar.setHeight(0);
                    } else {
                        zzVar.setWidth(i5 == -1 ? -1 : 0);
                        zzVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                zzVar.setOutsideTouchable(true);
                int i6 = width;
                View view = this.H;
                int i7 = this.y;
                int i8 = this.z;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                zzVar.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.x;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.H.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        zzVar.setWidth(width2);
        zzVar.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = T;
            if (method != null) {
                try {
                    method.invoke(zzVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(zzVar, true);
        }
        zzVar.setOutsideTouchable(true);
        zzVar.setTouchInterceptor(this.L);
        if (this.D) {
            zzVar.setOverlapAnchor(this.C);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = U;
            if (method2 != null) {
                try {
                    method2.invoke(zzVar, this.Q);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            b.a(zzVar, this.Q);
        }
        zzVar.showAsDropDown(this.H, this.y, this.z, this.E);
        this.v.setSelection(-1);
        if ((!this.R || this.v.isInTouchMode()) && (m83Var = this.v) != null) {
            m83Var.setListSelectionHidden(true);
            m83Var.requestLayout();
        }
        if (this.R) {
            return;
        }
        this.O.post(this.N);
    }

    public final int c() {
        return this.y;
    }

    @Override // defpackage.ao9
    public final void dismiss() {
        zz zzVar = this.S;
        zzVar.dismiss();
        zzVar.setContentView(null);
        this.v = null;
        this.O.removeCallbacks(this.K);
    }

    public final void e(int i) {
        this.y = i;
    }

    public final Drawable h() {
        return this.S.getBackground();
    }

    @Override // defpackage.ao9
    public final m83 j() {
        return this.v;
    }

    public final void k(Drawable drawable) {
        this.S.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.z = i;
        this.B = true;
    }

    public final int o() {
        if (this.B) {
            return this.z;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.G;
        if (dVar == null) {
            this.G = new d();
        } else {
            ListAdapter listAdapter2 = this.u;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.u = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.G);
        }
        m83 m83Var = this.v;
        if (m83Var != null) {
            m83Var.setAdapter(this.u);
        }
    }

    public m83 q(Context context, boolean z) {
        return new m83(context, z);
    }

    public final void r(int i) {
        Drawable background = this.S.getBackground();
        if (background == null) {
            this.x = i;
            return;
        }
        Rect rect = this.P;
        background.getPadding(rect);
        this.x = rect.left + rect.right + i;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            va6 va6Var = va6.this;
            g gVar = va6Var.K;
            zz zzVar = va6Var.S;
            if (i != 1 || zzVar.getInputMethodMode() == 2 || zzVar.getContentView() == null) {
                return;
            }
            va6Var.O.removeCallbacks(gVar);
            gVar.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }
    }
}
