package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class py6 extends ConstraintLayout implements o97 {
    public static final /* synthetic */ int W = 0;
    public float J;
    public int K;
    public float L;
    public float M;
    public long N;
    public c O;
    public boolean P;
    public int Q;
    public float R;
    public boolean S;
    public boolean T;
    public d U;
    public boolean V;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b {
        public float a;
        public float b;
        public int c;
        public int d;

        public final void a() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public static final d t;
        public static final d u;
        public static final /* synthetic */ d[] v;

        /* JADX INFO: Fake field, exist only in values array */
        d EF0;

        static {
            d dVar = new d("UNDEFINED", 0);
            d dVar2 = new d("SETUP", 1);
            d dVar3 = new d("MOVING", 2);
            t = dVar3;
            d dVar4 = new d("FINISHED", 3);
            u = dVar4;
            v = new d[]{dVar, dVar2, dVar3, dVar4};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) v.clone();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void d(int i) {
        this.D = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.N == -1) {
            this.N = getNanoTime();
        }
        float f = this.M;
        if (f > 0.0f && f < 1.0f) {
            this.K = -1;
        }
        boolean z = false;
        if (!this.P) {
            if (f >= 1.0f) {
                boolean z2 = this.K != 0;
                this.K = 0;
                z = z2;
            } else if (f <= 0.0f) {
                z = this.K != -1;
                this.K = -1;
            }
            this.V |= z;
            if (z && !this.S) {
                super.requestLayout();
            }
            this.L = this.M;
            super.dispatchDraw(canvas);
            return;
        }
        float fSignum = Math.signum(1.0f - f);
        long nanoTime = getNanoTime();
        float f2 = (((nanoTime - this.N) * fSignum) * 1.0E-9f) / 0.0f;
        float f3 = this.M + f2;
        if ((fSignum > 0.0f && f3 >= 1.0f) || (fSignum <= 0.0f && f3 <= 1.0f)) {
            f3 = 1.0f;
        }
        this.M = f3;
        this.L = f3;
        this.N = nanoTime;
        this.J = f2;
        if (Math.abs(f2) > 1.0E-5f) {
            setState(d.t);
        }
        if ((fSignum > 0.0f && f3 >= 1.0f) || (fSignum <= 0.0f && f3 <= 1.0f)) {
            f3 = 1.0f;
        }
        if (f3 >= 1.0f || f3 <= 0.0f) {
            setState(d.u);
        }
        getChildCount();
        this.P = false;
        getNanoTime();
        throw null;
    }

    public final void g() {
        this.O.getClass();
        if (this.R != this.L) {
            if (this.Q != -1) {
                throw null;
            }
            this.Q = -1;
            this.R = this.L;
            throw null;
        }
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.K;
    }

    public ArrayList<uy6.a> getDefinedTransitions() {
        return null;
    }

    public uy2 getDesignTool() {
        return null;
    }

    public int getEndState() {
        return 0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.M;
    }

    public uy6 getScene() {
        return null;
    }

    public int getStartState() {
        return -1;
    }

    public float getTargetPosition() {
        return 1.0f;
    }

    public Bundle getTransitionState() {
        throw null;
    }

    public long getTransitionTimeMs() {
        return 0L;
    }

    public float getVelocity() {
        return this.J;
    }

    public final void h() {
        this.O.getClass();
        if (this.Q != -1) {
            this.O.getClass();
            throw null;
        }
        this.Q = this.K;
        throw null;
    }

    @Override // defpackage.o97
    public final void k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i == 0 && i2 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
    }

    @Override // defpackage.n97
    public final boolean m(View view, View view2, int i, int i2) {
        return false;
    }

    @Override // defpackage.n97
    public final void n(View view, View view2, int i, int i2) {
        getNanoTime();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        if (!this.T) {
            throw null;
        }
        post(new a());
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.S = true;
        try {
            super.onLayout(z, i, i2, i3, i4);
        } finally {
            this.S = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof oy6) {
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        throw null;
    }

    public void setDebugMode(int i) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.T = z;
    }

    public void setInterpolatedProgress(float f) {
        setProgress(f);
    }

    public void setOnHide(float f) {
        throw null;
    }

    public void setOnShow(float f) {
        throw null;
    }

    public void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            throw null;
        }
        d dVar = d.u;
        d dVar2 = d.t;
        if (f <= 0.0f) {
            if (this.M == 1.0f && this.K == 0) {
                setState(dVar2);
            }
            this.K = -1;
            if (this.M == 0.0f) {
                setState(dVar);
                return;
            }
            return;
        }
        if (f < 1.0f) {
            this.K = -1;
            setState(dVar2);
            return;
        }
        if (this.M == 0.0f && this.K == -1) {
            setState(dVar2);
        }
        this.K = 0;
        if (this.M == 1.0f) {
            setState(dVar);
        }
    }

    public void setScene(uy6 uy6Var) {
        c();
        throw null;
    }

    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            throw null;
        }
        this.K = i;
    }

    public void setState(d dVar) {
        d dVar2 = d.u;
        if (dVar == dVar2 && this.K == -1) {
            return;
        }
        d dVar3 = this.U;
        this.U = dVar;
        d dVar4 = d.t;
        if (dVar3 == dVar4 && dVar == dVar4) {
            g();
        }
        int iOrdinal = dVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && dVar == dVar2) {
                h();
                return;
            }
            return;
        }
        if (dVar == dVar4) {
            g();
        }
        if (dVar == dVar2) {
            h();
        }
    }

    public void setTransition(uy6.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.O = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        bundle.getFloat("motion.progress");
        throw null;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return wm2.a(context, -1) + "->" + wm2.a(context, 0) + " (pos:" + this.M + " Dpos/Dt:" + this.J;
    }

    public void setTransition(int i) {
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    public void setInteractionEnabled(boolean z) {
    }

    @Override // defpackage.n97
    public final void j(int i, View view) {
    }

    @Override // defpackage.n97
    public final void o(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // defpackage.n97
    public final void l(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
