package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import defpackage.z90;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class s extends RecyclerView.z {
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public s(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public final void c(int i, int i2, RecyclerView.z.a aVar) {
        if (this.b.G.w() == 0) {
            f();
            return;
        }
        int i3 = this.o;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.o = i4;
        int i5 = this.p;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.p = i7;
        if (i4 == 0 && i7 == 0) {
            PointF pointFA = a(this.a);
            if (pointFA != null) {
                float f = pointFA.x;
                if (f != 0.0f || pointFA.y != 0.0f) {
                    float f2 = pointFA.y;
                    float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                    float f3 = pointFA.x / fSqrt;
                    pointFA.x = f3;
                    float f4 = pointFA.y / fSqrt;
                    pointFA.y = f4;
                    this.k = pointFA;
                    this.o = (int) (f3 * 10000.0f);
                    this.p = (int) (f4 * 10000.0f);
                    int iK = k(10000);
                    int i8 = (int) (this.o * 1.2f);
                    int i9 = (int) (this.p * 1.2f);
                    aVar.a = i8;
                    aVar.b = i9;
                    aVar.c = (int) (iK * 1.2f);
                    aVar.e = this.i;
                    aVar.f = true;
                    return;
                }
            }
            aVar.d = this.a;
            f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public final void d() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void e(View view, RecyclerView.z.a aVar) {
        int i;
        PointF pointF = this.k;
        int i2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iH = h(i, view);
        PointF pointF2 = this.k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        }
        int i3 = i(i2, view);
        int iCeil = (int) Math.ceil(((double) k((int) Math.sqrt((i3 * i3) + (iH * iH)))) / 0.3356d);
        if (iCeil > 0) {
            aVar.a = -iH;
            aVar.b = -i3;
            aVar.c = iCeil;
            aVar.e = this.j;
            aVar.f = true;
        }
    }

    public int g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            z90.a("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int h(int i, View view) {
        RecyclerView.o oVar = this.c;
        if (oVar == null || !oVar.e()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return g(RecyclerView.o.C(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, RecyclerView.o.F(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, oVar.J(), oVar.n - oVar.K(), i);
    }

    public int i(int i, View view) {
        RecyclerView.o oVar = this.c;
        if (oVar == null || !oVar.f()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return g(RecyclerView.o.G(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, RecyclerView.o.A(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, oVar.L(), oVar.o - oVar.I(), i);
    }

    public float j(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int k(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = j(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }
}
