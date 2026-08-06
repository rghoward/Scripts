package com.jsibbold.zoomage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.aa0;
import defpackage.eh8;
import defpackage.ptb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ZoomageView extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener {
    public float A;
    public float B;
    public final RectF C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public int K;
    public final PointF L;
    public float M;
    public float N;
    public float O;
    public int P;
    public int Q;
    public ScaleGestureDetector R;
    public ValueAnimator S;
    public GestureDetector T;
    public boolean U;
    public boolean V;
    public final b W;
    public ImageView.ScaleType t;
    public final Matrix u;
    public Matrix v;
    public final float[] w;
    public float[] x;
    public float y;
    public float z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final float[] a = new float[9];
        public final Matrix b = new Matrix();
        public final /* synthetic */ int c;

        public a(int i) {
            this.c = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ZoomageView zoomageView = ZoomageView.this;
            Matrix imageMatrix = zoomageView.getImageMatrix();
            Matrix matrix = this.b;
            matrix.set(imageMatrix);
            float[] fArr = this.a;
            matrix.getValues(fArr);
            fArr[this.c] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            matrix.setValues(fArr);
            zoomageView.setImageMatrix(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            ZoomageView zoomageView = ZoomageView.this;
            if (action == 1) {
                zoomageView.U = true;
            }
            zoomageView.V = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            ZoomageView.this.V = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            ZoomageView.this.V = true;
            return false;
        }
    }

    public ZoomageView(Context context) {
        super(context);
        this.u = new Matrix();
        this.v = new Matrix();
        this.w = new float[9];
        this.x = null;
        this.y = 0.6f;
        this.z = 8.0f;
        this.A = 0.6f;
        this.B = 8.0f;
        this.C = new RectF();
        this.L = new PointF(0.0f, 0.0f);
        this.M = 1.0f;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = 1;
        this.Q = 0;
        this.U = false;
        this.V = false;
        this.W = new b();
        f(context, null);
    }

    private float getCurrentDisplayedHeight() {
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicHeight() * this.w[4];
        }
        return 0.0f;
    }

    private float getCurrentDisplayedWidth() {
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicWidth() * this.w[0];
        }
        return 0.0f;
    }

    public final void c(float f, int i) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.w[i], f);
        valueAnimatorOfFloat.addUpdateListener(new a(i));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
    }

    public final void d(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        Matrix matrix2 = new Matrix(getImageMatrix());
        float[] fArr2 = this.w;
        matrix2.getValues(fArr2);
        float f = fArr[0] - fArr2[0];
        float f2 = fArr[4] - fArr2[4];
        float f3 = fArr[2] - fArr2[2];
        float f4 = fArr[5] - fArr2[5];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ptb(this, matrix2, f3, f4, f, f2));
        this.S.addListener(new com.jsibbold.zoomage.a(this, matrix));
        this.S.setDuration(200L);
        this.S.start();
    }

    public final void e() {
        if (this.I) {
            float currentDisplayedWidth = getCurrentDisplayedWidth();
            float width = getWidth();
            RectF rectF = this.C;
            if (currentDisplayedWidth > width) {
                if (rectF.left > 0.0f) {
                    c(0.0f, 2);
                } else if (rectF.right < getWidth()) {
                    c((rectF.left + getWidth()) - rectF.right, 2);
                }
            } else if (rectF.left < 0.0f) {
                c(0.0f, 2);
            } else if (rectF.right > getWidth()) {
                c((rectF.left + getWidth()) - rectF.right, 2);
            }
            if (getCurrentDisplayedHeight() > getHeight()) {
                if (rectF.top > 0.0f) {
                    c(0.0f, 5);
                    return;
                } else {
                    if (rectF.bottom < getHeight()) {
                        c((rectF.top + getHeight()) - rectF.bottom, 5);
                        return;
                    }
                    return;
                }
            }
            if (rectF.top < 0.0f) {
                c(0.0f, 5);
            } else if (rectF.bottom > getHeight()) {
                c((rectF.top + getHeight()) - rectF.bottom, 5);
            }
        }
    }

    public final void f(Context context, AttributeSet attributeSet) {
        this.R = new ScaleGestureDetector(context, this);
        this.T = new GestureDetector(context, this.W);
        int i = 0;
        this.R.setQuickScaleEnabled(false);
        this.t = getScaleType();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eh8.a);
        this.E = typedArrayObtainStyledAttributes.getBoolean(9, true);
        this.D = typedArrayObtainStyledAttributes.getBoolean(8, true);
        this.H = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.I = typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.G = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.F = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.y = typedArrayObtainStyledAttributes.getFloat(6, 0.6f);
        this.z = typedArrayObtainStyledAttributes.getFloat(5, 8.0f);
        this.J = typedArrayObtainStyledAttributes.getFloat(4, 3.0f);
        int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (i2 == 1) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else if (i2 == 3) {
            i = 3;
        }
        this.K = i;
        h();
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void g() {
        boolean z = this.H;
        Matrix matrix = this.v;
        if (z) {
            d(matrix);
        } else {
            setImageMatrix(matrix);
        }
    }

    public boolean getAnimateOnReset() {
        return this.H;
    }

    public boolean getAutoCenter() {
        return this.I;
    }

    public int getAutoResetMode() {
        return this.K;
    }

    public float getCurrentScaleFactor() {
        return this.O;
    }

    public boolean getDoubleTapToZoom() {
        return this.F;
    }

    public float getDoubleTapToZoomScaleFactor() {
        return this.J;
    }

    public boolean getRestrictBounds() {
        return this.G;
    }

    public final void h() {
        float f = this.y;
        float f2 = this.z;
        if (f >= f2) {
            aa0.c("minScale must be less than maxScale");
            return;
        }
        if (f < 0.0f) {
            aa0.c("minScale must be greater than 0");
            return;
        }
        if (f2 < 0.0f) {
            aa0.c("maxScale must be greater than 0");
            return;
        }
        if (this.J > f2) {
            this.J = f2;
        }
        if (this.J < f) {
            this.J = f;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.M;
        float f = this.w[0];
        float f2 = scaleFactor / f;
        this.N = f2;
        float f3 = f2 * f;
        float f4 = this.A;
        if (f3 < f4) {
            this.N = f4 / f;
        } else {
            float f5 = this.B;
            if (f3 > f5) {
                this.N = f5 / f;
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.M = this.w[0];
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.N = 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        char c2;
        ValueAnimator valueAnimator;
        float f;
        float height;
        float f2;
        float width;
        float f3;
        if (isClickable() || !isEnabled() || (!this.E && !this.D)) {
            return super.onTouchEvent(motionEvent);
        }
        ImageView.ScaleType scaleType = getScaleType();
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType != scaleType2) {
            super.setScaleType(scaleType2);
        }
        if (this.x == null) {
            this.x = new float[9];
            Matrix matrix = new Matrix(getImageMatrix());
            this.v = matrix;
            matrix.getValues(this.x);
            float f4 = this.y;
            float f5 = this.x[0];
            this.A = f4 * f5;
            this.B = this.z * f5;
        }
        this.Q = motionEvent.getPointerCount();
        Matrix imageMatrix = getImageMatrix();
        Matrix matrix2 = this.u;
        matrix2.set(imageMatrix);
        float[] fArr = this.w;
        matrix2.getValues(fArr);
        Drawable drawable = getDrawable();
        RectF rectF = this.C;
        if (drawable != null) {
            rectF.set(fArr[2], fArr[5], (getDrawable().getIntrinsicWidth() * fArr[0]) + fArr[2], (getDrawable().getIntrinsicHeight() * fArr[4]) + fArr[5]);
        }
        this.R.onTouchEvent(motionEvent);
        this.T.onTouchEvent(motionEvent);
        if (this.F && this.U) {
            this.U = false;
            this.V = false;
            if (fArr[0] != this.x[0]) {
                g();
                return true;
            }
            Matrix matrix3 = new Matrix(matrix2);
            float f6 = this.J;
            matrix3.postScale(f6, f6, this.R.getFocusX(), this.R.getFocusY());
            d(matrix3);
            return true;
        }
        if (this.V) {
            c2 = 0;
        } else {
            int actionMasked = motionEvent.getActionMasked();
            PointF pointF = this.L;
            if (actionMasked == 0 || this.Q != this.P) {
                c2 = 0;
                pointF.set(this.R.getFocusX(), this.R.getFocusY());
            } else if (motionEvent.getActionMasked() == 2) {
                float focusX = this.R.getFocusX();
                float focusY = this.R.getFocusY();
                if (!this.D || this.O <= 1.0f) {
                    c2 = 0;
                } else {
                    float width2 = focusX - pointF.x;
                    if (this.G) {
                        if (getCurrentDisplayedWidth() >= getWidth()) {
                            float f7 = rectF.left;
                            if (f7 <= 0.0f && f7 + width2 > 0.0f && !this.R.isInProgress()) {
                                width2 = -rectF.left;
                            } else if (rectF.right >= getWidth() && rectF.right + width2 < getWidth() && !this.R.isInProgress()) {
                                width = getWidth();
                                f3 = rectF.right;
                                width2 = width - f3;
                            }
                        } else if (!this.R.isInProgress()) {
                            float f8 = rectF.left;
                            if (f8 >= 0.0f && f8 + width2 < 0.0f) {
                                width2 = -f8;
                            } else if (rectF.right <= getWidth() && rectF.right + width2 > getWidth()) {
                                width = getWidth();
                                f3 = rectF.right;
                                width2 = width - f3;
                            }
                        }
                    }
                    float f9 = rectF.right;
                    if (f9 + width2 < 0.0f) {
                        width2 = -f9;
                    } else if (rectF.left + width2 > getWidth()) {
                        width2 = getWidth() - rectF.left;
                    }
                    float height2 = focusY - pointF.y;
                    if (this.G) {
                        c2 = 0;
                        if (getCurrentDisplayedHeight() >= getHeight()) {
                            float f10 = rectF.top;
                            if (f10 <= 0.0f && f10 + height2 > 0.0f && !this.R.isInProgress()) {
                                f = rectF.top;
                                height2 = -f;
                            } else if (rectF.bottom >= getHeight() && rectF.bottom + height2 < getHeight() && !this.R.isInProgress()) {
                                height = getHeight();
                                f2 = rectF.bottom;
                                height2 = height - f2;
                            }
                        } else if (!this.R.isInProgress()) {
                            f = rectF.top;
                            if (f >= 0.0f && f + height2 < 0.0f) {
                                height2 = -f;
                            } else if (rectF.bottom <= getHeight() && rectF.bottom + height2 > getHeight()) {
                                height = getHeight();
                                f2 = rectF.bottom;
                                height2 = height - f2;
                            }
                        }
                    } else {
                        c2 = 0;
                    }
                    float f11 = rectF.bottom;
                    if (f11 + height2 < 0.0f) {
                        height2 = -f11;
                    } else if (rectF.top + height2 > getHeight()) {
                        height2 = getHeight() - rectF.top;
                    }
                    matrix2.postTranslate(width2, height2);
                }
                if (this.E) {
                    float f12 = this.N;
                    matrix2.postScale(f12, f12, focusX, focusY);
                    this.O = fArr[c2] / this.x[c2];
                }
                setImageMatrix(matrix2);
                pointF.set(focusX, focusY);
            } else {
                c2 = 0;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                this.N = 1.0f;
                int i = this.K;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            g();
                        } else if (i == 3) {
                            e();
                        }
                    } else if (fArr[c2] >= this.x[c2]) {
                        g();
                    } else {
                        e();
                    }
                } else if (fArr[c2] <= this.x[c2]) {
                    g();
                } else {
                    e();
                }
            }
        }
        getParent().requestDisallowInterceptTouchEvent((this.Q > 1 || this.O > 1.0f || ((valueAnimator = this.S) != null && valueAnimator.isRunning())) ? 1 : c2);
        this.P = this.Q;
        return true;
    }

    public void setAnimateOnReset(boolean z) {
        this.H = z;
    }

    public void setAutoCenter(boolean z) {
        this.I = z;
    }

    public void setAutoResetMode(int i) {
        this.K = i;
    }

    public void setDoubleTapToZoom(boolean z) {
        this.F = z;
    }

    public void setDoubleTapToZoomScaleFactor(float f) {
        this.J = f;
        h();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        setScaleType(this.t);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setScaleType(this.t);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setScaleType(this.t);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        setScaleType(this.t);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setScaleType(this.t);
    }

    public void setRestrictBounds(boolean z) {
        this.G = z;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            super.setScaleType(scaleType);
            this.t = scaleType;
            this.x = null;
        }
    }

    public void setTranslatable(boolean z) {
        this.D = z;
    }

    public void setZoomable(boolean z) {
        this.E = z;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public class c implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public ZoomageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = new Matrix();
        this.v = new Matrix();
        this.w = new float[9];
        this.x = null;
        this.y = 0.6f;
        this.z = 8.0f;
        this.A = 0.6f;
        this.B = 8.0f;
        this.C = new RectF();
        this.L = new PointF(0.0f, 0.0f);
        this.M = 1.0f;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = 1;
        this.Q = 0;
        this.U = false;
        this.V = false;
        this.W = new b();
        f(context, attributeSet);
    }

    public ZoomageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new Matrix();
        this.v = new Matrix();
        this.w = new float[9];
        this.x = null;
        this.y = 0.6f;
        this.z = 8.0f;
        this.A = 0.6f;
        this.B = 8.0f;
        this.C = new RectF();
        this.L = new PointF(0.0f, 0.0f);
        this.M = 1.0f;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = 1;
        this.Q = 0;
        this.U = false;
        this.V = false;
        this.W = new b();
        f(context, attributeSet);
    }
}
