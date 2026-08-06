package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.aw;
import defpackage.bh8;
import defpackage.d07;
import defpackage.d30;
import defpackage.go;
import defpackage.k51;
import defpackage.l51;
import defpackage.m51;
import defpackage.n51;
import defpackage.o51;
import defpackage.p51;
import defpackage.pp2;
import defpackage.ti6;
import defpackage.vi1;
import defpackage.ym7;
import defpackage.z90;
import defpackage.zn3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    public int A;
    public int B;
    public final int C;
    public int p;
    public int q;
    public int r;
    public final a s;
    public final d07 t;
    public c u;
    public com.google.android.material.carousel.b v;
    public int w;
    public HashMap x;
    public n51 y;
    public final View.OnLayoutChangeListener z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends RecyclerView.n {
        public final Paint a;
        public List<com.google.android.material.carousel.b.C0053b> b;

        public a() {
            Paint paint = new Paint();
            this.a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            Canvas canvas2;
            float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
            Paint paint = this.a;
            paint.setStrokeWidth(dimension);
            for (com.google.android.material.carousel.b.C0053b c0053b : this.b) {
                float f = c0053b.c;
                ThreadLocal<double[]> threadLocal = vi1.a;
                float f2 = 1.0f - f;
                paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * f) + (Color.blue(-65281) * f2))));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).X0()) {
                    canvas2 = canvas;
                    canvas2.drawLine(c0053b.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.g(), c0053b.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.c(), paint);
                } else {
                    canvas2 = canvas;
                    canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).y.d(), c0053b.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.e(), c0053b.b, paint);
                }
                canvas = canvas2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final com.google.android.material.carousel.b.C0053b a;
        public final com.google.android.material.carousel.b.C0053b b;

        public b(com.google.android.material.carousel.b.C0053b c0053b, com.google.android.material.carousel.b.C0053b c0053b2) {
            if (c0053b.a > c0053b2.a) {
                zn3.b();
                throw null;
            }
            this.a = c0053b;
            this.b = c0053b2;
        }
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = new a();
        this.w = 0;
        this.z = new View.OnLayoutChangeListener() { // from class: i51
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new j51(0, this.a));
            }
        };
        this.B = -1;
        this.C = 0;
        this.t = new d07();
        d1();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bh8.f);
            this.C = typedArrayObtainStyledAttributes.getInt(0, 0);
            d1();
            f1(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b W0(List<com.google.android.material.carousel.b.C0053b> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            com.google.android.material.carousel.b.C0053b c0053b = list.get(i5);
            float f6 = z ? c0053b.b : c0053b.a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new b(list.get(i), list.get(i3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void B(Rect rect, View view) {
        super.B(rect, view);
        float fCenterY = rect.centerY();
        if (X0()) {
            fCenterY = rect.centerX();
        }
        b bVarW0 = W0(this.v.c, fCenterY, true);
        com.google.android.material.carousel.b.C0053b c0053b = bVarW0.a;
        float f = c0053b.d;
        com.google.android.material.carousel.b.C0053b c0053b2 = bVarW0.b;
        float fB = aw.b(f, c0053b2.d, c0053b.b, c0053b2.b, fCenterY);
        float fWidth = X0() ? (rect.width() - fB) / 2.0f : 0.0f;
        float fHeight = X0() ? 0.0f : (rect.height() - fB) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void H0(RecyclerView recyclerView, int i) {
        k51 k51Var = new k51(this, recyclerView.getContext());
        k51Var.a = i;
        I0(k51Var);
    }

    public final float K0(float f, float f2) {
        return Y0() ? f - f2 : f + f2;
    }

    public final void L0(RecyclerView.v vVar, int i, int i2) {
        if (i < 0 || i >= H()) {
            return;
        }
        float fP0 = P0(i);
        View viewD = vVar.d(i);
        b1(viewD);
        float fK0 = K0(fP0, this.v.a / 2.0f);
        b bVarW0 = W0(this.v.c, fK0, false);
        float fO0 = O0(fK0, bVarW0);
        float f = this.v.a / 2.0f;
        b(viewD, i2, false);
        b1(viewD);
        this.y.h(viewD, (int) (fO0 - f), (int) (fO0 + f));
        g1(viewD, fK0, bVarW0);
    }

    public final void M0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        float fP0 = P0(i);
        while (i < a0Var.b()) {
            float fK0 = K0(fP0, this.v.a / 2.0f);
            b bVarW0 = W0(this.v.c, fK0, false);
            float fO0 = O0(fK0, bVarW0);
            if (Z0(fO0, bVarW0)) {
                return;
            }
            fP0 = K0(fP0, this.v.a);
            if (!a1(fO0, bVarW0)) {
                View viewD = vVar.d(i);
                float f = this.v.a / 2.0f;
                b(viewD, -1, false);
                b1(viewD);
                this.y.h(viewD, (int) (fO0 - f), (int) (fO0 + f));
                g1(viewD, fK0, bVarW0);
            }
            i++;
        }
    }

    public final void N0(RecyclerView.v vVar, int i) {
        float fP0 = P0(i);
        while (i >= 0) {
            float fK0 = K0(fP0, this.v.a / 2.0f);
            b bVarW0 = W0(this.v.c, fK0, false);
            float fO0 = O0(fK0, bVarW0);
            if (a1(fO0, bVarW0)) {
                return;
            }
            float f = this.v.a;
            fP0 = Y0() ? fP0 + f : fP0 - f;
            if (!Z0(fO0, bVarW0)) {
                View viewD = vVar.d(i);
                float f2 = this.v.a / 2.0f;
                b(viewD, 0, false);
                b1(viewD);
                this.y.h(viewD, (int) (fO0 - f2), (int) (fO0 + f2));
                g1(viewD, fK0, bVarW0);
            }
            i--;
        }
    }

    public final float O0(float f, b bVar) {
        com.google.android.material.carousel.b.C0053b c0053b = bVar.a;
        float f2 = c0053b.b;
        com.google.android.material.carousel.b.C0053b c0053b2 = bVar.b;
        float f3 = c0053b2.b;
        float f4 = c0053b.a;
        float f5 = c0053b2.a;
        float fB = aw.b(f2, f3, f4, f5, f);
        if (c0053b2 != this.v.b() && c0053b != this.v.d()) {
            return fB;
        }
        return go.a(1.0f, c0053b2.c, f - f5, fB);
    }

    public final float P0(int i) {
        return K0(this.y.f() - this.p, this.v.a * i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean Q() {
        return true;
    }

    public final void Q0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        while (w() > 0) {
            View viewV = v(0);
            float fS0 = S0(viewV);
            if (!a1(fS0, W0(this.v.c, fS0, true))) {
                break;
            } else {
                s0(viewV, vVar);
            }
        }
        while (w() - 1 >= 0) {
            View viewV2 = v(w() - 1);
            float fS1 = S0(viewV2);
            if (!Z0(fS1, W0(this.v.c, fS1, true))) {
                break;
            } else {
                s0(viewV2, vVar);
            }
        }
        if (w() == 0) {
            N0(vVar, this.w - 1);
            M0(this.w, vVar, a0Var);
        } else {
            int iM = RecyclerView.o.M(v(0));
            int iM2 = RecyclerView.o.M(v(w() - 1));
            N0(vVar, iM - 1);
            M0(iM2 + 1, vVar, a0Var);
        }
    }

    public final int R0() {
        return X0() ? this.n : this.o;
    }

    public final float S0(View view) {
        Rect rect = new Rect();
        super.B(rect, view);
        return X0() ? rect.centerX() : rect.centerY();
    }

    public final com.google.android.material.carousel.b T0(int i) {
        com.google.android.material.carousel.b bVar;
        HashMap map = this.x;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(ym7.d(i, 0, Math.max(0, H() + (-1)))))) == null) ? this.u.a : bVar;
    }

    public final int U0(int i, com.google.android.material.carousel.b bVar) {
        if (!Y0()) {
            return (int) ((bVar.a / 2.0f) + ((i * bVar.a) - bVar.a().a));
        }
        float fR0 = R0() - bVar.c().a;
        float f = bVar.a;
        return (int) ((fR0 - (i * f)) - (f / 2.0f));
    }

    public final int V0(int i, com.google.android.material.carousel.b bVar) {
        int i2 = Integer.MAX_VALUE;
        for (com.google.android.material.carousel.b.C0053b c0053b : bVar.c.subList(bVar.d, bVar.e + 1)) {
            float f = bVar.a;
            float f2 = (f / 2.0f) + (i * f);
            int iR0 = (Y0() ? (int) ((R0() - c0053b.a) - f2) : (int) (f2 - c0053b.a)) - this.p;
            if (Math.abs(i2) > Math.abs(iR0)) {
                i2 = iR0;
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void X(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        d07 d07Var = this.t;
        float dimension = d07Var.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        d07Var.a = dimension;
        float dimension2 = d07Var.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        d07Var.b = dimension2;
        d1();
        recyclerView.addOnLayoutChangeListener(this.z);
    }

    public final boolean X0() {
        return this.y.a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Y(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.z);
    }

    public final boolean Y0() {
        return X0() && this.b.getLayoutDirection() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final View Z(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        byte b2;
        if (w() == 0) {
            return null;
        }
        int i2 = this.y.a;
        if (i == 1) {
            b2 = -1;
        } else if (i == 2) {
            b2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                    } else if (i2 == 1) {
                        b2 = 1;
                    }
                    b2 = -2147483648;
                } else if (i2 != 0) {
                    b2 = -2147483648;
                } else if (Y0()) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
            } else if (i2 == 1) {
                b2 = -1;
            } else {
                b2 = -2147483648;
            }
        } else if (i2 != 0) {
            b2 = -2147483648;
        } else if (Y0()) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 == -2147483648) {
            return null;
        }
        if (b2 == -1) {
            if (RecyclerView.o.M(view) == 0) {
                return null;
            }
            L0(vVar, RecyclerView.o.M(v(0)) - 1, 0);
            return v(Y0() ? w() - 1 : 0);
        }
        if (RecyclerView.o.M(view) == H() - 1) {
            return null;
        }
        L0(vVar, RecyclerView.o.M(v(w() - 1)) + 1, -1);
        return v(Y0() ? 0 : w() - 1);
    }

    public final boolean Z0(float f, b bVar) {
        com.google.android.material.carousel.b.C0053b c0053b = bVar.a;
        float f2 = c0053b.d;
        com.google.android.material.carousel.b.C0053b c0053b2 = bVar.b;
        float fB = aw.b(f2, c0053b2.d, c0053b.b, c0053b2.b, f) / 2.0f;
        float f3 = Y0() ? f + fB : f - fB;
        if (Y0()) {
            return f3 < 0.0f;
        }
        return f3 > ((float) R0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF a(int i) {
        if (this.u == null) {
            return null;
        }
        int iU0 = U0(i, T0(i)) - this.p;
        return X0() ? new PointF(iU0, 0.0f) : new PointF(0.0f, iU0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void a0(AccessibilityEvent accessibilityEvent) {
        super.a0(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.o.M(v(0)));
            accessibilityEvent.setToIndex(RecyclerView.o.M(v(w() - 1)));
        }
    }

    public final boolean a1(float f, b bVar) {
        com.google.android.material.carousel.b.C0053b c0053b = bVar.a;
        float f2 = c0053b.d;
        com.google.android.material.carousel.b.C0053b c0053b2 = bVar.b;
        float fK0 = K0(f, aw.b(f2, c0053b2.d, c0053b.b, c0053b2.b, f) / 2.0f);
        if (Y0()) {
            return fK0 > ((float) R0());
        }
        return fK0 < 0.0f;
    }

    public final void b1(View view) {
        if (!(view instanceof ti6)) {
            aa0.c("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        Rect rect = new Rect();
        d(rect, view);
        int i = rect.left + rect.right;
        int i2 = rect.top + rect.bottom;
        c cVar = this.u;
        view.measure(RecyclerView.o.x(X0(), this.n, this.l, K() + J() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i, (int) ((cVar == null || this.y.a != 0) ? ((ViewGroup.MarginLayoutParams) pVar).width : cVar.a.a)), RecyclerView.o.x(f(), this.o, this.m, I() + L() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i2, (int) ((cVar == null || this.y.a != 1) ? ((ViewGroup.MarginLayoutParams) pVar).height : cVar.a.a)));
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0489  */
    /* JADX WARN: Code duplicated, block: B:145:0x048c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0494  */
    /* JADX WARN: Code duplicated, block: B:151:0x049e  */
    /* JADX WARN: Code duplicated, block: B:156:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:158:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:160:0x0501  */
    /* JADX WARN: Code duplicated, block: B:163:0x051d  */
    /* JADX WARN: Code duplicated, block: B:166:0x052b A[LOOP:14: B:161:0x0517->B:166:0x052b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x0537  */
    /* JADX WARN: Code duplicated, block: B:172:0x0554  */
    /* JADX WARN: Code duplicated, block: B:201:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:202:0x05db  */
    /* JADX WARN: Code duplicated, block: B:207:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:208:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:213:0x0624  */
    /* JADX WARN: Code duplicated, block: B:215:0x0628  */
    /* JADX WARN: Code duplicated, block: B:217:0x0650  */
    /* JADX WARN: Code duplicated, block: B:219:0x065e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0671 A[LOOP:12: B:218:0x065c->B:222:0x0671, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x067f  */
    /* JADX WARN: Code duplicated, block: B:228:0x069d  */
    /* JADX WARN: Code duplicated, block: B:231:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:263:0x0676 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x066e A[EDGE_INSN: B:264:0x066e->B:221:0x066e BREAK  A[LOOP:12: B:218:0x065c->B:222:0x0671], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x055e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x052e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0529 A[SYNTHETIC] */
    public final void c1(RecyclerView.v vVar) {
        int[] iArr;
        com.google.android.material.carousel.b bVarD;
        int i;
        int i2;
        int iL;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        int i6;
        com.google.android.material.carousel.b bVar;
        int i7;
        int size;
        int i8;
        boolean z;
        float f3;
        List<com.google.android.material.carousel.b.C0053b> list;
        int i9;
        int i10;
        float f4;
        int i11;
        float f5;
        int i12;
        com.google.android.material.carousel.b bVar2;
        int i13;
        List<com.google.android.material.carousel.b.C0053b> list2;
        int i14;
        float f6;
        int i15;
        com.google.android.material.carousel.b.C0053b c0053b;
        com.google.android.material.carousel.b.C0053b c0053b2;
        int i16;
        int i17;
        float f7;
        View viewD = vVar.d(0);
        b1(viewD);
        d07 d07Var = this.t;
        d07Var.getClass();
        int i18 = this.o;
        if (X0()) {
            i18 = this.n;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewD.getLayoutParams();
        float f8 = ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        float measuredHeight = viewD.getMeasuredHeight();
        if (X0()) {
            f8 = ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
            measuredHeight = viewD.getMeasuredWidth();
        }
        float f9 = d07Var.a + f8;
        float fMax = Math.max(d07Var.b + f8, f9);
        float f10 = i18;
        float fMin = Math.min(measuredHeight + f8, f10);
        float fC = ym7.c((measuredHeight / 3.0f) + f8, f9 + f8, fMax + f8);
        float f11 = (fMin + fC) / 2.0f;
        float f12 = f9 * 2.0f;
        int[] iArr2 = f10 <= f12 ? new int[]{0} : d07.d;
        int i19 = this.C;
        int[] iArr3 = d07.e;
        if (i19 == 1) {
            int length = iArr2.length;
            int[] iArr4 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                iArr4[i20] = iArr2[i20] * 2;
            }
            int[] iArr5 = new int[2];
            for (int i21 = 0; i21 < 2; i21++) {
                iArr5[i21] = iArr3[i21] * 2;
            }
            iArr = iArr5;
            iArr2 = iArr4;
        } else {
            iArr = iArr3;
        }
        int length2 = iArr.length;
        int i22 = 0;
        int i23 = Integer.MIN_VALUE;
        while (i22 < length2) {
            int i24 = length2;
            int i25 = iArr[i22];
            if (i25 > i23) {
                i23 = i25;
            }
            i22++;
            length2 = i24;
        }
        float f13 = f10 - (i23 * f11);
        int length3 = iArr2.length;
        int i26 = 0;
        int i27 = Integer.MIN_VALUE;
        while (i26 < length3) {
            int i28 = i26;
            int i29 = iArr2[i28];
            if (i29 > i27) {
                i27 = i29;
            }
            i26 = i28 + 1;
        }
        int iMax = (int) Math.max(1.0d, Math.floor((f13 - (i27 * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i30 = (iCeil - iMax) + 1;
        int[] iArr6 = new int[i30];
        for (int i31 = 0; i31 < i30; i31++) {
            iArr6[i31] = iCeil - i31;
        }
        d30 d30VarA = d30.a(f10, fC, f9, fMax, iArr2, f11, iArr, fMin, iArr6);
        int i32 = d30VarA.c;
        int i33 = d30VarA.g;
        d07Var.c = i32 + d30VarA.d + i33;
        int iH = H();
        int i34 = d30VarA.c;
        int i35 = d30VarA.d;
        int i36 = ((i34 + i35) + i33) - iH;
        boolean z2 = i36 > 0 && (i34 > 0 || i35 > 1);
        while (i36 > 0) {
            int i37 = d30VarA.c;
            if (i37 > 0) {
                d30VarA.c = i37 - 1;
            } else {
                int i38 = d30VarA.d;
                if (i38 > 1) {
                    d30VarA.d = i38 - 1;
                }
            }
            i36--;
        }
        int i39 = d30VarA.d;
        if (i39 == 0 && d30VarA.c == 0 && f10 > f12) {
            d30VarA.c = 1;
            z2 = true;
        }
        if (z2) {
            d30VarA = d30.a(f10, fC, f9, fMax, new int[]{d30VarA.c}, f11, new int[]{i39}, fMin, new int[]{i33});
        }
        Context context = viewD.getContext();
        if (i19 == 1) {
            float fMin2 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f8, d30VarA.f);
            float f14 = fMin2 / 2.0f;
            float f15 = 0.0f - f14;
            float fB = com.google.android.material.carousel.a.b(0.0f, d30VarA.b, d30VarA.c);
            float fC2 = com.google.android.material.carousel.a.c(0.0f, com.google.android.material.carousel.a.a(fB, d30VarA.b, (int) Math.floor(d30VarA.c / 2.0f)), d30VarA.b, d30VarA.c);
            float fB2 = com.google.android.material.carousel.a.b(fC2, d30VarA.e, d30VarA.d);
            float fC3 = com.google.android.material.carousel.a.c(fC2, com.google.android.material.carousel.a.a(fB2, d30VarA.e, (int) Math.floor(d30VarA.d / 2.0f)), d30VarA.e, d30VarA.d);
            float f16 = d30VarA.f;
            int i40 = d30VarA.g;
            float fB3 = com.google.android.material.carousel.a.b(fC3, f16, i40);
            float fC4 = com.google.android.material.carousel.a.c(fC3, com.google.android.material.carousel.a.a(fB3, d30VarA.f, i40), d30VarA.f, i40);
            float fB4 = com.google.android.material.carousel.a.b(fC4, d30VarA.e, d30VarA.d);
            float fB5 = com.google.android.material.carousel.a.b(com.google.android.material.carousel.a.c(fC4, com.google.android.material.carousel.a.a(fB4, d30VarA.e, (int) Math.ceil(d30VarA.d / 2.0f)), d30VarA.e, d30VarA.d), d30VarA.b, d30VarA.c);
            float f17 = f10 + f14;
            float fA = o51.a(fMin2, d30VarA.f, f8);
            float fA2 = o51.a(d30VarA.b, d30VarA.f, f8);
            float fA3 = o51.a(d30VarA.e, d30VarA.f, f8);
            com.google.android.material.carousel.b.a aVar = new com.google.android.material.carousel.b.a(d30VarA.f, i18);
            aVar.a(f15, fA, fMin2, false, true);
            int i41 = d30VarA.c;
            if (i41 > 0) {
                aVar.c(fB, fA2, d30VarA.b, (int) Math.floor(i41 / 2.0f), false);
            }
            int i42 = d30VarA.d;
            if (i42 > 0) {
                aVar.c(fB2, fA3, d30VarA.e, (int) Math.floor(i42 / 2.0f), false);
                f7 = fA3;
            } else {
                f7 = fA3;
            }
            aVar.c(fB3, 0.0f, d30VarA.f, d30VarA.g, true);
            int i43 = d30VarA.d;
            if (i43 > 0) {
                aVar.c(fB4, f7, d30VarA.e, (int) Math.ceil(i43 / 2.0f), false);
            }
            int i44 = d30VarA.c;
            if (i44 > 0) {
                aVar.c(fB5, fA2, d30VarA.b, (int) Math.ceil(i44 / 2.0f), false);
            }
            aVar.a(f17, fA, fMin2, false, true);
            bVarD = aVar.d();
        } else {
            float fMin3 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f8, d30VarA.f);
            float f18 = fMin3 / 2.0f;
            float f19 = 0.0f - f18;
            float f20 = d30VarA.f;
            int i45 = d30VarA.g;
            float fB6 = com.google.android.material.carousel.a.b(0.0f, f20, i45);
            float fC5 = com.google.android.material.carousel.a.c(0.0f, com.google.android.material.carousel.a.a(fB6, d30VarA.f, i45), d30VarA.f, i45);
            float fB7 = com.google.android.material.carousel.a.b(fC5, d30VarA.e, d30VarA.d);
            float fB8 = com.google.android.material.carousel.a.b(com.google.android.material.carousel.a.c(fC5, fB7, d30VarA.e, d30VarA.d), d30VarA.b, d30VarA.c);
            float f21 = f10 + f18;
            float fA4 = o51.a(fMin3, d30VarA.f, f8);
            float fA5 = o51.a(d30VarA.b, d30VarA.f, f8);
            float fA6 = o51.a(d30VarA.e, d30VarA.f, f8);
            com.google.android.material.carousel.b.a aVar2 = new com.google.android.material.carousel.b.a(d30VarA.f, i18);
            aVar2.a(f19, fA4, fMin3, false, true);
            aVar2.c(fB6, 0.0f, d30VarA.f, d30VarA.g, true);
            if (d30VarA.d > 0) {
                aVar2.a(fB7, fA6, d30VarA.e, false, false);
            }
            int i46 = d30VarA.c;
            if (i46 > 0) {
                aVar2.c(fB8, fA5, d30VarA.b, i46, false);
            }
            aVar2.a(f21, fA4, fMin3, false, true);
            bVarD = aVar2.d();
        }
        if (Y0()) {
            int iR0 = R0();
            com.google.android.material.carousel.b.a aVar3 = new com.google.android.material.carousel.b.a(bVarD.a, iR0);
            float f22 = (iR0 - bVarD.d().b) - (bVarD.d().d / 2.0f);
            List<com.google.android.material.carousel.b.C0053b> list3 = bVarD.c;
            int size2 = list3.size() - 1;
            while (size2 >= 0) {
                com.google.android.material.carousel.b.C0053b c0053b3 = list3.get(size2);
                float f23 = c0053b3.d;
                aVar3.a((f23 / 2.0f) + f22, c0053b3.c, f23, size2 >= bVarD.d && size2 <= bVarD.e, c0053b3.e);
                f22 += c0053b3.d;
                size2--;
            }
            bVarD = aVar3.d();
        }
        com.google.android.material.carousel.b bVar3 = bVarD;
        List<com.google.android.material.carousel.b.C0053b> list4 = bVar3.c;
        if (w() > 0) {
            RecyclerView.p pVar2 = (RecyclerView.p) v(0).getLayoutParams();
            if (this.y.a == 0) {
                i16 = ((ViewGroup.MarginLayoutParams) pVar2).leftMargin;
                i17 = ((ViewGroup.MarginLayoutParams) pVar2).rightMargin;
            } else {
                i16 = ((ViewGroup.MarginLayoutParams) pVar2).topMargin;
                i17 = ((ViewGroup.MarginLayoutParams) pVar2).bottomMargin;
            }
            i = i17 + i16;
        } else {
            i = 0;
        }
        float f24 = i;
        if (y()) {
            iL = 0;
            i2 = 1;
        } else {
            i2 = 1;
            iL = this.y.a == 1 ? L() : J();
        }
        float f25 = iL;
        float fI = y() ? 0 : this.y.a == i2 ? I() : K();
        d07Var.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar3);
        int i47 = 0;
        while (true) {
            i3 = bVar3.e;
            i4 = bVar3.d;
            if (i47 >= list4.size()) {
                i47 = -1;
                break;
            } else if (!list4.get(i47).e) {
                break;
            } else {
                i47++;
            }
        }
        int i48 = X0() ? this.n : this.o;
        if (bVar3.a().b - (bVar3.a().d / 2.0f) >= 0.0f) {
            com.google.android.material.carousel.b.C0053b c0053bA = bVar3.a();
            int i49 = 0;
            while (true) {
                if (i49 >= list4.size()) {
                    c0053b2 = null;
                    break;
                }
                c0053b2 = list4.get(i49);
                if (!c0053b2.e) {
                    break;
                } else {
                    i49++;
                }
            }
            if (c0053bA == c0053b2) {
                if (f25 > 0.0f) {
                    arrayList.add(c.f(bVar3, f25, i48, true, f24));
                }
            } else if (i47 == -1) {
                i5 = i4 - i47;
                f = bVar3.b().b - (bVar3.b().d / 2.0f);
                if (i5 <= 0 || bVar3.a().f <= 0.0f) {
                    f2 = 0.0f;
                    i6 = 0;
                    while (i6 < i5) {
                        int i50 = i47;
                        bVar = (com.google.android.material.carousel.b) p51.b(1, arrayList);
                        i7 = i5;
                        int i51 = i50 + i6;
                        size = list4.size() - 1;
                        f2 += list4.get(i51).f;
                        i8 = i51 - 1;
                        if (i8 >= 0) {
                            f3 = list4.get(i8).c;
                            int i52 = bVar.e;
                            list = bVar.c;
                            i9 = i52;
                            while (true) {
                                if (i9 >= list.size()) {
                                    int size3 = list.size();
                                    z = true;
                                    i9 = size3 - 1;
                                    break;
                                } else {
                                    if (f3 == list.get(i9).c) {
                                        z = true;
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            size = i9 - 1;
                        } else {
                            z = true;
                        }
                        com.google.android.material.carousel.b bVarE = c.e(bVar, i50, size, f + f2, (i4 - i6) - 1, (i3 - i6) - 1, i48);
                        if (i6 != i7 - 1 && f25 > 0.0f) {
                            bVarE = c.f(bVarE, f25, i48, z, f24);
                        }
                        arrayList.add(bVarE);
                        i6++;
                        i47 = i50;
                        i5 = i7;
                        f = f;
                    }
                } else {
                    arrayList.add(c.e(bVar3, 0, 0, f + bVar3.a().f + f25, bVar3.d, bVar3.e, i48));
                }
            } else if (f25 > 0.0f) {
                arrayList.add(c.f(bVar3, f25, i48, true, f24));
            }
        } else if (i47 == -1) {
            i5 = i4 - i47;
            f = bVar3.b().b - (bVar3.b().d / 2.0f);
            if (i5 <= 0) {
                f2 = 0.0f;
                i6 = 0;
                while (i6 < i5) {
                    int i53 = i47;
                    bVar = (com.google.android.material.carousel.b) p51.b(1, arrayList);
                    i7 = i5;
                    int i54 = i53 + i6;
                    size = list4.size() - 1;
                    f2 += list4.get(i54).f;
                    i8 = i54 - 1;
                    if (i8 >= 0) {
                        f3 = list4.get(i8).c;
                        int i55 = bVar.e;
                        list = bVar.c;
                        i9 = i55;
                        while (true) {
                            if (i9 >= list.size()) {
                                int size4 = list.size();
                                z = true;
                                i9 = size4 - 1;
                                break;
                            } else {
                                if (f3 == list.get(i9).c) {
                                    z = true;
                                    break;
                                }
                                i9++;
                            }
                        }
                        size = i9 - 1;
                    } else {
                        z = true;
                    }
                    com.google.android.material.carousel.b bVarE2 = c.e(bVar, i53, size, f + f2, (i4 - i6) - 1, (i3 - i6) - 1, i48);
                    if (i6 != i7 - 1) {
                    }
                    arrayList.add(bVarE2);
                    i6++;
                    i47 = i53;
                    i5 = i7;
                    f = f;
                }
            } else {
                f2 = 0.0f;
                i6 = 0;
                while (i6 < i5) {
                    int i56 = i47;
                    bVar = (com.google.android.material.carousel.b) p51.b(1, arrayList);
                    i7 = i5;
                    int i57 = i56 + i6;
                    size = list4.size() - 1;
                    f2 += list4.get(i57).f;
                    i8 = i57 - 1;
                    if (i8 >= 0) {
                        f3 = list4.get(i8).c;
                        int i58 = bVar.e;
                        list = bVar.c;
                        i9 = i58;
                        while (true) {
                            if (i9 >= list.size()) {
                                int size5 = list.size();
                                z = true;
                                i9 = size5 - 1;
                                break;
                            } else {
                                if (f3 == list.get(i9).c) {
                                    z = true;
                                    break;
                                }
                                i9++;
                            }
                        }
                        size = i9 - 1;
                    } else {
                        z = true;
                    }
                    com.google.android.material.carousel.b bVarE3 = c.e(bVar, i56, size, f + f2, (i4 - i6) - 1, (i3 - i6) - 1, i48);
                    if (i6 != i7 - 1) {
                    }
                    arrayList.add(bVarE3);
                    i6++;
                    i47 = i56;
                    i5 = i7;
                    f = f;
                }
            }
        } else if (f25 > 0.0f) {
            arrayList.add(c.f(bVar3, f25, i48, true, f24));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bVar3);
        int size6 = list4.size() - 1;
        while (true) {
            if (size6 < 0) {
                size6 = -1;
                break;
            } else if (!list4.get(size6).e) {
                break;
            } else {
                size6--;
            }
        }
        int i59 = X0() ? this.n : this.o;
        int i60 = this.o;
        if (X0()) {
            i60 = this.n;
        }
        if ((bVar3.c().d / 2.0f) + bVar3.c().b <= i60) {
            com.google.android.material.carousel.b.C0053b c0053bC = bVar3.c();
            int size7 = list4.size() - 1;
            while (true) {
                if (size7 < 0) {
                    c0053b = null;
                    break;
                }
                c0053b = list4.get(size7);
                if (!c0053b.e) {
                    break;
                } else {
                    size7--;
                }
            }
            if (c0053bC == c0053b) {
                if (fI > 0.0f) {
                    arrayList2.add(c.f(bVar3, fI, i59, false, f24));
                }
            } else if (size6 == -1) {
                i10 = size6 - i3;
                f4 = bVar3.b().b - (bVar3.b().d / 2.0f);
                if (i10 <= 0 || bVar3.c().f <= 0.0f) {
                    i11 = 0;
                    f5 = 0.0f;
                    while (i11 < i10) {
                        i12 = i10;
                        bVar2 = (com.google.android.material.carousel.b) p51.b(1, arrayList2);
                        float f26 = f4;
                        int i61 = size6 - i11;
                        f5 += list4.get(i61).f;
                        i13 = i61 + 1;
                        int i62 = size6;
                        if (i13 < list4.size()) {
                            f6 = list4.get(i13).c;
                            i15 = bVar2.d - 1;
                            while (true) {
                                if (i15 < 0) {
                                    list2 = list4;
                                    i15 = 0;
                                    break;
                                } else {
                                    list2 = list4;
                                    if (f6 == bVar2.c.get(i15).c) {
                                        break;
                                    }
                                    i15--;
                                    list4 = list2;
                                }
                            }
                            i14 = i15 + 1;
                        } else {
                            list2 = list4;
                            i14 = 0;
                        }
                        com.google.android.material.carousel.b bVarE4 = c.e(bVar2, i62, i14, f26 - f5, i4 + i11 + 1, i3 + i11 + 1, i59);
                        if (i11 != i12 - 1 && fI > 0.0f) {
                            bVarE4 = c.f(bVarE4, fI, i59, false, f24);
                        }
                        arrayList2.add(bVarE4);
                        i11++;
                        i10 = i12;
                        size6 = i62;
                        f4 = f26;
                        list4 = list2;
                    }
                } else {
                    arrayList2.add(c.e(bVar3, 0, 0, (f4 - bVar3.c().f) - fI, bVar3.d, bVar3.e, i59));
                }
            } else if (fI > 0.0f) {
                arrayList2.add(c.f(bVar3, fI, i59, false, f24));
            }
        } else if (size6 == -1) {
            i10 = size6 - i3;
            f4 = bVar3.b().b - (bVar3.b().d / 2.0f);
            if (i10 <= 0) {
                i11 = 0;
                f5 = 0.0f;
                while (i11 < i10) {
                    i12 = i10;
                    bVar2 = (com.google.android.material.carousel.b) p51.b(1, arrayList2);
                    float f27 = f4;
                    int i63 = size6 - i11;
                    f5 += list4.get(i63).f;
                    i13 = i63 + 1;
                    int i64 = size6;
                    if (i13 < list4.size()) {
                        f6 = list4.get(i13).c;
                        i15 = bVar2.d - 1;
                        while (true) {
                            if (i15 < 0) {
                                list2 = list4;
                                i15 = 0;
                                break;
                            }
                            list2 = list4;
                            if (f6 == bVar2.c.get(i15).c) {
                                break;
                                break;
                            } else {
                                i15--;
                                list4 = list2;
                            }
                        }
                        i14 = i15 + 1;
                    } else {
                        list2 = list4;
                        i14 = 0;
                    }
                    com.google.android.material.carousel.b bVarE5 = c.e(bVar2, i64, i14, f27 - f5, i4 + i11 + 1, i3 + i11 + 1, i59);
                    if (i11 != i12 - 1) {
                    }
                    arrayList2.add(bVarE5);
                    i11++;
                    i10 = i12;
                    size6 = i64;
                    f4 = f27;
                    list4 = list2;
                }
            } else {
                i11 = 0;
                f5 = 0.0f;
                while (i11 < i10) {
                    i12 = i10;
                    bVar2 = (com.google.android.material.carousel.b) p51.b(1, arrayList2);
                    float f28 = f4;
                    int i65 = size6 - i11;
                    f5 += list4.get(i65).f;
                    i13 = i65 + 1;
                    int i66 = size6;
                    if (i13 < list4.size()) {
                        f6 = list4.get(i13).c;
                        i15 = bVar2.d - 1;
                        while (true) {
                            if (i15 < 0) {
                                list2 = list4;
                                i15 = 0;
                                break;
                            }
                            list2 = list4;
                            if (f6 == bVar2.c.get(i15).c) {
                                break;
                                break;
                            } else {
                                i15--;
                                list4 = list2;
                            }
                        }
                        i14 = i15 + 1;
                    } else {
                        list2 = list4;
                        i14 = 0;
                    }
                    com.google.android.material.carousel.b bVarE6 = c.e(bVar2, i66, i14, f28 - f5, i4 + i11 + 1, i3 + i11 + 1, i59);
                    if (i11 != i12 - 1) {
                    }
                    arrayList2.add(bVarE6);
                    i11++;
                    i10 = i12;
                    size6 = i66;
                    f4 = f28;
                    list4 = list2;
                }
            }
        } else if (fI > 0.0f) {
            arrayList2.add(c.f(bVar3, fI, i59, false, f24));
        }
        this.u = new c(bVar3, arrayList, arrayList2);
    }

    public final void d1() {
        this.u = null;
        v0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean e() {
        return X0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void e0(int i, int i2) {
        i1();
    }

    public final int e1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (w() != 0 && i != 0) {
            if (this.u == null) {
                c1(vVar);
            }
            int iH = H();
            c cVar = this.u;
            if (iH > (Y0() ? cVar.a() : cVar.c()).b) {
                int i2 = this.p;
                int i3 = this.q;
                int i4 = this.r;
                int i5 = i2 + i;
                if (i5 < i3) {
                    i = i3 - i2;
                } else if (i5 > i4) {
                    i = i4 - i2;
                }
                this.p = i2 + i;
                h1(this.u);
                float f = this.v.a / 2.0f;
                float fP0 = P0(RecyclerView.o.M(v(0)));
                Rect rect = new Rect();
                boolean zY0 = Y0();
                com.google.android.material.carousel.b bVar = this.v;
                float f2 = zY0 ? bVar.c().b : bVar.a().b;
                float f3 = Float.MAX_VALUE;
                for (int i6 = 0; i6 < w(); i6++) {
                    View viewV = v(i6);
                    float fK0 = K0(fP0, f);
                    b bVarW0 = W0(this.v.c, fK0, false);
                    float fO0 = O0(fK0, bVarW0);
                    super.B(rect, viewV);
                    g1(viewV, fK0, bVarW0);
                    this.y.j(viewV, rect, f, fO0);
                    float fAbs = Math.abs(f2 - fO0);
                    if (fAbs < f3) {
                        this.B = RecyclerView.o.M(viewV);
                        f3 = fAbs;
                    }
                    fP0 = K0(fP0, this.v.a);
                }
                Q0(vVar, a0Var);
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean f() {
        return !X0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void f0() {
        i1();
    }

    public final void f1(int i) {
        n51 m51Var;
        if (i != 0 && i != 1) {
            z90.a(pp2.a(i, "invalid orientation:"));
            return;
        }
        c(null);
        n51 n51Var = this.y;
        if (n51Var == null || i != n51Var.a) {
            if (i == 0) {
                m51Var = new m51(this);
            } else {
                if (i != 1) {
                    z90.a("invalid orientation");
                    return;
                }
                m51Var = new l51(this);
            }
            this.y = m51Var;
            d1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(View view, float f, b bVar) {
        if (view instanceof ti6) {
            com.google.android.material.carousel.b.C0053b c0053b = bVar.a;
            float f2 = c0053b.c;
            com.google.android.material.carousel.b.C0053b c0053b2 = bVar.b;
            float fB = aw.b(f2, c0053b2.c, c0053b.a, c0053b2.a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFB = this.y.b(height, width, aw.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), aw.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fO0 = O0(f, bVar);
            RectF rectF = new RectF(fO0 - (rectFB.width() / 2.0f), fO0 - (rectFB.height() / 2.0f), (rectFB.width() / 2.0f) + fO0, (rectFB.height() / 2.0f) + fO0);
            RectF rectF2 = new RectF(this.y.d(), this.y.g(), this.y.e(), this.y.c());
            this.t.getClass();
            this.y.a(rectFB, rectF, rectF2);
            this.y.i(rectFB, rectF, rectF2);
            ((ti6) view).a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h0(int i, int i2) {
        i1();
    }

    public final void h1(c cVar) {
        int i = this.r;
        int i2 = this.q;
        if (i <= i2) {
            this.v = Y0() ? cVar.a() : cVar.c();
        } else {
            this.v = cVar.b(this.p, i2, i);
        }
        List<com.google.android.material.carousel.b.C0053b> list = this.v.c;
        a aVar = this.s;
        aVar.getClass();
        aVar.b = Collections.unmodifiableList(list);
    }

    public final void i1() {
        int iH = H();
        int i = this.A;
        if (iH == i || this.u == null) {
            return;
        }
        d07 d07Var = this.t;
        if ((i < d07Var.c && H() >= d07Var.c) || (i >= d07Var.c && H() < d07Var.c)) {
            d1();
        }
        this.A = iH;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.b() <= 0 || R0() <= 0.0f) {
            q0(vVar);
            this.w = 0;
            return;
        }
        boolean zY0 = Y0();
        c cVar = this.u;
        int i = 1;
        boolean z = cVar == null;
        if (z || cVar.a.f != R0()) {
            c1(vVar);
        }
        c cVar2 = this.u;
        boolean zY1 = Y0();
        com.google.android.material.carousel.b bVarA = zY1 ? cVar2.a() : cVar2.c();
        float f = (zY1 ? bVarA.c() : bVarA.a()).a;
        float f2 = bVarA.a / 2.0f;
        int iF = (int) (this.y.f() - (Y0() ? f + f2 : f - f2));
        c cVar3 = this.u;
        boolean zY2 = Y0();
        com.google.android.material.carousel.b bVarC = zY2 ? cVar3.c() : cVar3.a();
        com.google.android.material.carousel.b.C0053b c0053bA = zY2 ? bVarC.a() : bVarC.c();
        int iB = (int) ((((zY2 ? -1 : 1) * c0053bA.d) / 2.0f) + ((((a0Var.b() - 1) * bVarC.a) * (zY2 ? -1.0f : 1.0f)) - (c0053bA.a - this.y.f())));
        int iMin = zY2 ? Math.min(0, iB) : Math.max(0, iB);
        this.q = zY0 ? iMin : iF;
        if (zY0) {
            iMin = iF;
        }
        this.r = iMin;
        if (z) {
            this.p = iF;
            c cVar4 = this.u;
            int iH = H();
            int i2 = this.q;
            int i3 = this.r;
            boolean zY3 = Y0();
            List<com.google.android.material.carousel.b> list = cVar4.b;
            List<com.google.android.material.carousel.b> list2 = cVar4.c;
            float f3 = cVar4.a.a;
            HashMap map = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (i4 < iH) {
                int i6 = zY3 ? (iH - i4) - i : i4;
                int i7 = i;
                if (i6 * f3 * (zY3 ? -1 : i7) > i3 - cVar4.g || i4 >= iH - list2.size()) {
                    map.put(Integer.valueOf(i6), list2.get(ym7.d(i5, 0, list2.size() - 1)));
                    i5++;
                }
                i4++;
                i = i7;
            }
            int i8 = i;
            int i9 = 0;
            for (int i10 = iH - 1; i10 >= 0; i10--) {
                int i11 = zY3 ? (iH - i10) - 1 : i10;
                if (i11 * f3 * (zY3 ? -1 : i8) < i2 + cVar4.f || i10 < list.size()) {
                    map.put(Integer.valueOf(i11), list.get(ym7.d(i9, 0, list.size() - 1)));
                    i9++;
                }
            }
            this.x = map;
            int i12 = this.B;
            if (i12 != -1) {
                this.p = U0(i12, T0(i12));
            }
        }
        int i13 = this.p;
        int i14 = this.q;
        int i15 = this.r;
        this.p = (i13 < i14 ? i14 - i13 : i13 > i15 ? i15 - i13 : 0) + i13;
        this.w = ym7.d(this.w, 0, a0Var.b());
        h1(this.u);
        q(vVar);
        Q0(vVar, a0Var);
        this.A = H();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int k(RecyclerView.a0 a0Var) {
        if (w() == 0 || this.u == null || H() <= 1) {
            return 0;
        }
        return (int) (this.n * (this.u.a.a / m(a0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void k0(RecyclerView.a0 a0Var) {
        if (w() == 0) {
            this.w = 0;
        } else {
            this.w = RecyclerView.o.M(v(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int l(RecyclerView.a0 a0Var) {
        return this.p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int m(RecyclerView.a0 a0Var) {
        return this.r - this.q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int n(RecyclerView.a0 a0Var) {
        if (w() == 0 || this.u == null || H() <= 1) {
            return 0;
        }
        return (int) (this.o * (this.u.a.a / p(a0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int o(RecyclerView.a0 a0Var) {
        return this.p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int p(RecyclerView.a0 a0Var) {
        return this.r - this.q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p s() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean u0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iV0;
        if (this.u == null || (iV0 = V0(RecyclerView.o.M(view), T0(RecyclerView.o.M(view)))) == 0) {
            return false;
        }
        int i = this.p;
        int i2 = this.q;
        int i3 = this.r;
        int i4 = i + iV0;
        if (i4 < i2) {
            iV0 = i2 - i;
        } else if (i4 > i3) {
            iV0 = i3 - i;
        }
        int iV1 = V0(RecyclerView.o.M(view), this.u.b(i + iV0, i2, i3));
        if (X0()) {
            recyclerView.scrollBy(iV1, 0);
            return true;
        }
        recyclerView.scrollBy(0, iV1);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int w0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (X0()) {
            return e1(i, vVar, a0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void x0(int i) {
        this.B = i;
        if (this.u == null) {
            return;
        }
        this.p = U0(i, T0(i));
        this.w = ym7.d(i, 0, Math.max(0, H() - 1));
        h1(this.u);
        v0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int y0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (f()) {
            return e1(i, vVar, a0Var);
        }
        return 0;
    }

    public CarouselLayoutManager() {
        d07 d07Var = new d07();
        this.s = new a();
        this.w = 0;
        this.z = new View.OnLayoutChangeListener() { // from class: i51
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new j51(0, this.a));
            }
        };
        this.B = -1;
        this.C = 0;
        this.t = d07Var;
        d1();
        f1(0);
    }
}
