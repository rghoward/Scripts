package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.xa1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class va1<T extends xa1<? extends t55<? extends qj3>>> extends ViewGroup implements za1 {
    public Paint A;
    public hrb B;
    public boolean C;
    public qy2 D;
    public h66 E;
    public eh7 F;
    public db1 G;
    public String H;
    public j66 I;
    public ff2 J;
    public ya1 K;
    public bib L;
    public wa1 M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public boolean R;
    public rw4[] S;
    public float T;
    public boolean U;
    public w55 V;
    public ArrayList<Runnable> W;
    public boolean a0;
    public boolean t;
    public T u;
    public boolean v;
    public boolean w;
    public float x;
    public iv2 y;
    public Paint z;

    public static void f(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                f(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public abstract void b();

    public rw4 c(float f, float f2) {
        if (this.u != null) {
            return getHighlighter().a(f, f2);
        }
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
        return null;
    }

    public final void d(rw4 rw4Var, boolean z) {
        eh7 eh7Var;
        qj3 qj3Var = null;
        if (rw4Var == null) {
            this.S = null;
        } else {
            if (this.t) {
                Log.i("MPAndroidChart", "Highlighted: ".concat(rw4Var.toString()));
            }
            qj3 qj3VarE = this.u.e(rw4Var);
            if (qj3VarE == null) {
                this.S = null;
            } else {
                this.S = new rw4[]{rw4Var};
            }
            qj3Var = qj3VarE;
        }
        setLastHighlighted(this.S);
        if (z && (eh7Var = this.F) != null) {
            rw4[] rw4VarArr = this.S;
            boolean z2 = false;
            if (rw4VarArr != null && rw4VarArr.length > 0 && rw4VarArr[0] != null) {
                z2 = true;
            }
            if (z2) {
                eh7Var.a(qj3Var);
            } else {
                eh7Var.getClass();
            }
        }
        invalidate();
    }

    public abstract void e();

    public wa1 getAnimator() {
        return this.M;
    }

    public sf6 getCenter() {
        return sf6.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public sf6 getCenterOfView() {
        return getCenter();
    }

    public sf6 getCenterOffsets() {
        RectF rectF = this.L.b;
        return sf6.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    public RectF getContentRect() {
        return this.L.b;
    }

    public T getData() {
        return this.u;
    }

    public nab getDefaultValueFormatter() {
        return this.y;
    }

    public qy2 getDescription() {
        return this.D;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.x;
    }

    public float getExtraBottomOffset() {
        return this.P;
    }

    public float getExtraLeftOffset() {
        return this.Q;
    }

    public float getExtraRightOffset() {
        return this.O;
    }

    public float getExtraTopOffset() {
        return this.N;
    }

    public rw4[] getHighlighted() {
        return this.S;
    }

    public v55 getHighlighter() {
        return this.K;
    }

    public ArrayList<Runnable> getJobs() {
        return this.W;
    }

    public h66 getLegend() {
        return this.E;
    }

    public j66 getLegendRenderer() {
        return this.I;
    }

    public w55 getMarker() {
        return this.V;
    }

    @Deprecated
    public w55 getMarkerView() {
        return getMarker();
    }

    @Override // defpackage.za1
    public float getMaxHighlightDistance() {
        return this.T;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public dh7 getOnChartGestureListener() {
        return null;
    }

    public db1 getOnTouchListener() {
        return this.G;
    }

    public ff2 getRenderer() {
        return this.J;
    }

    public bib getViewPortHandler() {
        return this.L;
    }

    public hrb getXAxis() {
        return this.B;
    }

    public float getXChartMax() {
        return this.B.C;
    }

    public float getXChartMin() {
        return this.B.D;
    }

    public float getXRange() {
        return this.B.E;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.u.a;
    }

    public float getYMin() {
        return this.u.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a0) {
            f(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.u == null) {
            if (TextUtils.isEmpty(this.H)) {
                return;
            }
            sf6 center = getCenter();
            canvas.drawText(this.H, center.b, center.c, this.A);
            return;
        }
        if (this.R) {
            return;
        }
        b();
        this.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iC = (int) t6b.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iC, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iC, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        ArrayList<Runnable> arrayList = this.W;
        if (this.t) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            if (this.t) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + i + ", height: " + i2);
            }
            bib bibVar = this.L;
            float f = i;
            float f2 = i2;
            RectF rectF = bibVar.b;
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = bibVar.c - rectF.right;
            float fH = bibVar.h();
            bibVar.d = f2;
            bibVar.c = f;
            bibVar.b.set(f3, f4, f - f5, f2 - fH);
        } else if (this.t) {
            Log.w("MPAndroidChart", "*Avoiding* setting chart dimens! width: " + i + ", height: " + i2);
        }
        e();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Runnable runnable = arrayList.get(i5);
            i5++;
            post(runnable);
        }
        arrayList.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(T t) {
        iv2 iv2Var = this.y;
        this.u = t;
        int i = 0;
        this.R = false;
        if (t == null) {
            return;
        }
        float f = t.b;
        float f2 = t.a;
        float fD = t6b.d(t.d() < 2 ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f));
        iv2Var.b(Float.isInfinite(fD) ? 0 : ((int) Math.ceil(-Math.log10(fD))) + 2);
        ArrayList arrayList = this.u.i;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t55 t55Var = (t55) obj;
            if (t55Var.r() || t55Var.l() == iv2Var) {
                t55Var.m(iv2Var);
            }
        }
        e();
        if (this.t) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }

    public void setDescription(qy2 qy2Var) {
        this.D = qy2Var;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.w = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.x = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setDrawMarkers(boolean z) {
        this.U = z;
    }

    public void setExtraBottomOffset(float f) {
        this.P = t6b.c(f);
    }

    public void setExtraLeftOffset(float f) {
        this.Q = t6b.c(f);
    }

    public void setExtraRightOffset(float f) {
        this.O = t6b.c(f);
    }

    public void setExtraTopOffset(float f) {
        this.N = t6b.c(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.v = z;
    }

    public void setHighlighter(ya1 ya1Var) {
        this.K = ya1Var;
    }

    public void setLastHighlighted(rw4[] rw4VarArr) {
        rw4 rw4Var;
        if (rw4VarArr == null || rw4VarArr.length <= 0 || (rw4Var = rw4VarArr[0]) == null) {
            this.G.u = null;
        } else {
            this.G.u = rw4Var;
        }
    }

    public void setLogEnabled(boolean z) {
        this.t = z;
    }

    public void setMarker(w55 w55Var) {
        this.V = w55Var;
    }

    @Deprecated
    public void setMarkerView(w55 w55Var) {
        setMarker(w55Var);
    }

    public void setMaxHighlightDistance(float f) {
        this.T = t6b.c(f);
    }

    public void setNoDataText(String str) {
        this.H = str;
    }

    public void setNoDataTextColor(int i) {
        this.A.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.A.setTypeface(typeface);
    }

    public void setOnChartValueSelectedListener(eh7 eh7Var) {
        this.F = eh7Var;
    }

    public void setOnTouchListener(db1 db1Var) {
        this.G = db1Var;
    }

    public void setRenderer(ff2 ff2Var) {
        if (ff2Var != null) {
            this.J = ff2Var;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.C = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.a0 = z;
    }

    public void setOnChartGestureListener(dh7 dh7Var) {
    }
}
