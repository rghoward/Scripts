package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends ViewGroup {
    public boolean A;
    public final a t;
    public final Context u;
    public ActionMenuView v;
    public androidx.appcompat.widget.a w;
    public int x;
    public fib y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements hib {
        public boolean a = false;
        public int b;

        public a() {
        }

        @Override // defpackage.hib
        public final void a() {
            c0.super.setVisibility(0);
            this.a = false;
        }

        @Override // defpackage.hib
        public final void b() {
            if (this.a) {
                return;
            }
            c0 c0Var = c0.this;
            c0Var.y = null;
            c0.super.setVisibility(this.b);
        }

        @Override // defpackage.hib
        public final void c() {
            this.a = true;
        }
    }

    public c0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.u = context;
        } else {
            this.u = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int d(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final fib e(int i, long j) {
        fib fibVar = this.y;
        if (fibVar != null) {
            fibVar.b();
        }
        a aVar = this.t;
        if (i != 0) {
            fib fibVarB = egb.b(this);
            fibVarB.a(0.0f);
            fibVarB.c(j);
            c0.this.y = fibVarB;
            aVar.b = i;
            fibVarB.d(aVar);
            return fibVarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        fib fibVarB2 = egb.b(this);
        fibVarB2.a(1.0f);
        fibVarB2.c(j);
        c0.this.y = fibVarB2;
        aVar.b = i;
        fibVarB2.d(aVar);
        return fibVarB2;
    }

    public int getAnimatedVisibility() {
        return this.y != null ? this.t.b : getVisibility();
    }

    public int getContentHeight() {
        return this.x;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, ph8.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.w;
        if (aVar != null) {
            Configuration configuration2 = aVar.u.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            aVar.J = i;
            f fVar = aVar.v;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A = false;
        }
        if (!this.A) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.A = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.A = false;
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.z = false;
        }
        if (!this.z) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.z = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.z = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.x = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            fib fibVar = this.y;
            if (fibVar != null) {
                fibVar.b();
            }
            super.setVisibility(i);
        }
    }
}
