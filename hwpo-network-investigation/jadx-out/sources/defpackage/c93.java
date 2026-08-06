package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.a;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c93 extends fg3 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final x83 i;
    public final y83 j;
    public final z83 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v0, types: [x83] */
    /* JADX WARN: Type inference failed for: r0v1, types: [y83] */
    /* JADX WARN: Type inference failed for: r0v2, types: [z83] */
    public c93(a aVar) {
        super(aVar);
        this.i = new View.OnClickListener() { // from class: x83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.t.t();
            }
        };
        this.j = new View.OnFocusChangeListener() { // from class: y83
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                c93 c93Var = this.a;
                c93Var.l = z;
                c93Var.p();
                if (z) {
                    return;
                }
                c93Var.s(false);
                c93Var.m = false;
            }
        };
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: z83
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                c93 c93Var = this.t;
                AutoCompleteTextView autoCompleteTextView = c93Var.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                c93Var.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = az6.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = az6.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = az6.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, aw.a);
    }

    @Override // defpackage.fg3
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && od3.e(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new Runnable() { // from class: a93
            @Override // java.lang.Runnable
            public final void run() {
                c93 c93Var = this.t;
                boolean zIsPopupShowing = c93Var.h.isPopupShowing();
                c93Var.s(zIsPopupShowing);
                c93Var.m = zIsPopupShowing;
            }
        });
    }

    @Override // defpackage.fg3
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.fg3
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.fg3
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.fg3
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.fg3
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.fg3
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.fg3
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.fg3
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            ru3.d("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: v83
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    c93 c93Var = this.t;
                    long j = jUptimeMillis - c93Var.o;
                    if (j < 0 || j > 300) {
                        c93Var.m = false;
                    }
                    c93Var.t();
                    c93Var.m = true;
                    c93Var.o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: w83
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                c93 c93Var = this.a;
                c93Var.m = true;
                c93Var.o = SystemClock.uptimeMillis();
                c93Var.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.fg3
    public final void m(j4 j4Var) {
        if (!od3.e(this.h)) {
            j4Var.j("android.widget.Spinner");
        }
        if (j4Var.g()) {
            j4Var.n(null);
        }
    }

    @Override // defpackage.fg3
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || od3.e(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            t();
            this.m = true;
            this.o = SystemClock.uptimeMillis();
        }
    }

    @Override // defpackage.fg3
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u83
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u83
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new b93(this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.fg3
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
