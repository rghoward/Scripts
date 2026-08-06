package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.hwpo_training_app.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rqa implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static rqa D;
    public static rqa E;
    public zqa A;
    public boolean B;
    public boolean C;
    public final View t;
    public final CharSequence u;
    public final int v;
    public final qqa w = new Runnable() { // from class: qqa
        @Override // java.lang.Runnable
        public final void run() {
            this.t.c(false);
        }
    };
    public final lj6 x = new lj6(1, this);
    public int y;
    public int z;

    /* JADX WARN: Type inference failed for: r0v0, types: [qqa] */
    public rqa(View view, CharSequence charSequence) {
        this.t = view;
        this.u = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = ngb.a;
        this.v = Build.VERSION.SDK_INT >= 28 ? ngb.b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.C = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(rqa rqaVar) {
        rqa rqaVar2 = D;
        if (rqaVar2 != null) {
            rqaVar2.t.removeCallbacks(rqaVar2.w);
        }
        D = rqaVar;
        if (rqaVar != null) {
            rqaVar.t.postDelayed(rqaVar.w, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        rqa rqaVar = E;
        View view = this.t;
        if (rqaVar == this) {
            E = null;
            zqa zqaVar = this.A;
            if (zqaVar != null) {
                View view2 = zqaVar.b;
                if (view2.getParent() != null) {
                    ((WindowManager) zqaVar.a.getSystemService("window")).removeView(view2);
                }
                this.A = null;
                this.C = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (D == this) {
            b(null);
        }
        view.removeCallbacks(this.x);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.t;
        if (view.isAttachedToWindow()) {
            b(null);
            rqa rqaVar = E;
            if (rqaVar != null) {
                rqaVar.a();
            }
            E = this;
            this.B = z;
            zqa zqaVar = new zqa(view.getContext());
            this.A = zqaVar;
            int width = this.y;
            int i4 = this.z;
            boolean z2 = this.B;
            View view2 = zqaVar.b;
            ViewParent parent = view2.getParent();
            Context context = zqaVar.a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            zqaVar.c.setText(this.u);
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            WindowManager.LayoutParams layoutParams = zqaVar.d;
            layoutParams.token = applicationWindowToken;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                Rect rect = zqaVar.e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = zqaVar.g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = zqaVar.f;
                view.getLocationOnScreen(iArr2);
                int i5 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i5;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams.x = (i5 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i6 = iArr2[i3];
                int i7 = ((i6 + i) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i7 >= 0) {
                        layoutParams.y = i7;
                    } else {
                        layoutParams.y = i8;
                    }
                } else if (measuredHeight + i8 <= rect.height()) {
                    layoutParams.y = i8;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.B) {
                j2 = 2500;
            } else {
                WeakHashMap<View, fib> weakHashMap = egb.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            lj6 lj6Var = this.x;
            view.removeCallbacks(lj6Var);
            view.postDelayed(lj6Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.A == null || !this.B) {
            View view2 = this.t;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.C = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.A == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.C) {
                        this.y = x;
                        this.z = y;
                        this.C = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.y);
                        int i = this.v;
                        if (iAbs > i || Math.abs(y - this.z) > i) {
                            this.y = x;
                            this.z = y;
                            this.C = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.y = view.getWidth() / 2;
        this.z = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
