package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.bh8;
import defpackage.bj6;
import defpackage.by8;
import defpackage.h0;
import defpackage.i0a;
import defpackage.kk6;
import defpackage.kl9;
import defpackage.ll9;
import defpackage.ml9;
import defpackage.qa3;
import defpackage.u94;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable I = new ColorDrawable(0);
    public static final int[] J = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator K = new OvershootInterpolator(4.0f);
    public static final a L = new a("interpolation");
    public WeakReference<kk6> A;
    public float B;
    public ObjectAnimator C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public b H;
    public final Paint t;
    public final RectF u;
    public final Rect v;
    public final Path w;
    public final Path x;
    public final Matrix y;
    public final ml9 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends FloatProperty<FocusRingDrawable> {
        @Override // android.util.Property
        public final Float get(Object obj) {
            return Float.valueOf(((FocusRingDrawable) obj).D);
        }

        @Override // android.util.FloatProperty
        public final void setValue(FocusRingDrawable focusRingDrawable, float f) {
            FocusRingDrawable focusRingDrawable2 = focusRingDrawable;
            focusRingDrawable2.D = f;
            focusRingDrawable2.invalidateSelf();
        }
    }

    public FocusRingDrawable(b bVar, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.t = paint;
        this.u = new RectF();
        this.v = new Rect();
        this.w = new Path();
        this.x = new Path();
        this.y = new Matrix();
        this.z = ml9.b();
        this.B = -1.0f;
        this.D = 1.0f;
        this.F = false;
        this.G = false;
        b bVar2 = new b(bVar);
        this.H = bVar2;
        Drawable.ConstantState constantState = bVar2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.H.j)) {
            return;
        }
        paint.setStrokeWidth(this.H.j);
    }

    public static int c(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static FocusRingDrawable e(Context context, LayerDrawable layerDrawable, kk6 kk6Var) {
        if (!bj6.c(context.getTheme(), com.hwpo_training_app.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, I);
        if (kk6Var != null) {
            focusRingDrawable.A = new WeakReference<>(kk6Var);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public static float f(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(RectF rectF) {
        Rect rect = this.H.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference<kk6> weakReference = this.A;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(this.A.get().getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.v;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        d(theme);
    }

    public final void b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.u;
        a(rectF);
        float f3 = f * 2.0f;
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.w;
        path.transform(matrix, path2);
        float f4 = f2 * this.D;
        Paint paint = this.t;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    public final void d(Resources.Theme theme) {
        TypedValue typedValueA;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(bh8.j);
        int i = this.H.d;
        if (i != Integer.MIN_VALUE && (typedValueA = bj6.a(theme, i)) != null) {
            b bVar = this.H;
            bVar.c = typedValueA.data != 0;
            bVar.e = true;
        }
        b bVar2 = this.H;
        if (!bVar2.e) {
            bVar2.c = bj6.c(theme, com.hwpo_training_app.R.attr.focusRingsEnabled, bVar2.c);
        }
        b bVar3 = this.H;
        if (bVar3.c) {
            int color = bVar3.f;
            int i2 = bVar3.g;
            if (color == Integer.MIN_VALUE) {
                if (i2 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i2, typedValue, true)) {
                        color = typedValue.data;
                    } else {
                        color = typedArrayObtainStyledAttributes.getColor(5, -16777216);
                    }
                } else {
                    color = typedArrayObtainStyledAttributes.getColor(5, -16777216);
                }
            }
            bVar3.f = color;
            b bVar4 = this.H;
            int color2 = bVar4.h;
            int i3 = bVar4.i;
            if (color2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue2, true)) {
                        color2 = typedValue2.data;
                    } else {
                        color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
                    }
                } else {
                    color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
                }
            }
            bVar4.h = color2;
            b bVar5 = this.H;
            bVar5.j = f(bVar5.j, theme, bVar5.k, typedArrayObtainStyledAttributes, 6, com.hwpo_training_app.R.dimen.mtrl_focus_ring_outer_stroke_width);
            b bVar6 = this.H;
            bVar6.l = f(bVar6.l, theme, bVar6.m, typedArrayObtainStyledAttributes, 3, com.hwpo_training_app.R.dimen.mtrl_focus_ring_inner_stroke_width);
            b bVar7 = this.H;
            bVar7.n = f(bVar7.n, theme, bVar7.o, typedArrayObtainStyledAttributes, 7, 0);
            b bVar8 = this.H;
            bVar8.p = f(bVar8.p, theme, bVar8.q, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.H.p)) {
                this.H.p = 0.0f;
            }
            b bVar9 = this.H;
            bVar9.r = f(bVar9.r, theme, bVar9.s, typedArrayObtainStyledAttributes, 2, com.hwpo_training_app.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            b bVar10 = this.H;
            int i4 = bVar10.u;
            int[] iArr = bh8.B;
            if (i4 != Integer.MIN_VALUE) {
                bVar10.t = ll9.h(theme.obtainStyledAttributes(i4, iArr), new h0(0.0f)).a();
            } else {
                int i5 = bVar10.v;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = com.hwpo_training_app.R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueA2 = bj6.a(theme, i5);
                if (typedValueA2 != null) {
                    this.H.t = ll9.h(theme.obtainStyledAttributes(typedValueA2.resourceId, iArr), new h0(0.0f)).a();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.t;
        paint.setStyle(style);
        if (Float.isNaN(this.H.j)) {
            return;
        }
        paint.setStrokeWidth(this.H.j);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fMax;
        Drawable drawable;
        int radius;
        super.draw(canvas);
        b bVar = this.H;
        if (bVar.c && this.F) {
            float f = bVar.p;
            float f2 = bVar.j / 2.0f;
            float f3 = this.D;
            float f4 = (f2 * f3) + f;
            float f5 = ((bVar.l / 2.0f) * f3) + f + bVar.r;
            Path path = this.x;
            if (path.isEmpty()) {
                WeakReference<kk6> weakReference = this.A;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = this.A.get().B;
                    if (path.isEmpty()) {
                        path = null;
                    }
                }
            }
            Path path2 = path;
            b bVar2 = this.H;
            if (path2 != null) {
                b(canvas, path2, f5, bVar2.l, bVar2.h);
                b bVar3 = this.H;
                b(canvas, path2, f4, bVar3.j, bVar3.f);
                return;
            }
            if (Float.isNaN(bVar2.n)) {
                fMax = this.B;
                if (fMax < 0.0f) {
                    WeakReference<kk6> weakReference2 = this.A;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        drawable = getDrawable();
                        if ((drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
                            fMax = 0.0f;
                        } else {
                            fMax = radius;
                        }
                    } else {
                        kk6 kk6Var = this.A.get();
                        float fB = kk6Var.b(kk6Var.e(), kk6Var.u.a.d(), kk6Var.V);
                        if (fB >= 0.0f) {
                            fB *= kk6Var.u.i;
                        }
                        if (fB >= 0.0f) {
                            fMax = Math.max(0.0f, fB - (this.H.j / 2.0f));
                        } else {
                            drawable = getDrawable();
                            if (drawable instanceof RippleDrawable) {
                                fMax = 0.0f;
                            } else {
                                fMax = 0.0f;
                            }
                        }
                    }
                }
            } else {
                fMax = this.H.n;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.H.j / 2.0f));
            b bVar4 = this.H;
            float f6 = bVar4.l;
            int i = bVar4.h;
            RectF rectF = this.u;
            a(rectF);
            rectF.inset(f5, f5);
            float f7 = f6 * this.D;
            Paint paint = this.t;
            paint.setStrokeWidth(f7);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, fMax2, fMax2, paint);
            b bVar5 = this.H;
            float f8 = bVar5.j;
            int i2 = bVar5.f;
            a(rectF);
            rectF.inset(f4, f4);
            paint.setStrokeWidth(f8 * this.D);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
        }
    }

    public final void g(kl9 kl9Var) {
        RectF rectF = this.u;
        a(rectF);
        ll9 ll9VarB = kl9Var.b(J);
        boolean zJ = ll9VarB.j(rectF);
        Path path = this.x;
        if (!zJ) {
            this.z.a(ll9VarB, null, 1.0f, rectF, null, path);
            this.B = -1.0f;
            return;
        }
        b bVar = this.H;
        float f = ((bVar.j / 2.0f) * this.D) + bVar.p;
        rectF.inset(f, f);
        this.B = ll9VarB.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        b bVar = this.H;
        if (bVar.a == null) {
            return null;
        }
        bVar.b = getChangingConfigurations();
        return this.H;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.H.c;
        } catch (NoSuchMethodError unused) {
            return this.H.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = bh8.j;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.H.d = c(typedArrayObtainStyledAttributes, 0);
        if (this.H.d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            b bVar = this.H;
            bVar.c = typedArrayObtainStyledAttributes.getBoolean(0, bVar.c);
            this.H.e = true;
        }
        this.H.g = c(typedArrayObtainStyledAttributes, 5);
        b bVar2 = this.H;
        if (bVar2.g == Integer.MIN_VALUE) {
            bVar2.f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.H.i = c(typedArrayObtainStyledAttributes, 1);
        b bVar3 = this.H;
        if (bVar3.i == Integer.MIN_VALUE) {
            bVar3.h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.H.k = c(typedArrayObtainStyledAttributes, 6);
        b bVar4 = this.H;
        if (bVar4.k == Integer.MIN_VALUE) {
            bVar4.j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.H.m = c(typedArrayObtainStyledAttributes, 3);
        b bVar5 = this.H;
        if (bVar5.m == Integer.MIN_VALUE) {
            bVar5.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.H.m = c(typedArrayObtainStyledAttributes, 3);
        b bVar6 = this.H;
        if (bVar6.m == Integer.MIN_VALUE) {
            bVar6.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.H.o = c(typedArrayObtainStyledAttributes, 7);
        b bVar7 = this.H;
        if (bVar7.o == Integer.MIN_VALUE) {
            bVar7.n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.H.q = c(typedArrayObtainStyledAttributes, 4);
        b bVar8 = this.H;
        if (bVar8.q == Integer.MIN_VALUE) {
            bVar8.p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.H.s = c(typedArrayObtainStyledAttributes, 2);
        b bVar9 = this.H;
        if (bVar9.s == Integer.MIN_VALUE) {
            bVar9.r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.H.v = c(typedArrayObtainStyledAttributes, 8);
        this.H.u = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.H.a = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = I;
            setDrawable(colorDrawable);
            this.H.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.H.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.C;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.C = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.G && super.mutate() == this) {
            this.H = new b(this.H);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.H.a = drawable.getConstantState();
            }
            this.G = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        ll9 ll9Var;
        super.onBoundsChange(rect);
        b bVar = this.H;
        if (bVar.c) {
            kl9 kl9Var = bVar.t;
            if (kl9Var != null) {
                g(kl9Var);
                return;
            }
            Drawable drawable = getDrawable();
            kl9 kl9Var2 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    by8 by8Var = new by8();
                    by8 by8Var2 = new by8();
                    by8 by8Var3 = new by8();
                    by8 by8Var4 = new by8();
                    qa3 qa3Var = new qa3();
                    qa3 qa3Var2 = new qa3();
                    qa3 qa3Var3 = new qa3();
                    qa3 qa3Var4 = new qa3();
                    float radius = outline.getRadius();
                    h0 h0Var = new h0(radius);
                    h0 h0Var2 = new h0(radius);
                    h0 h0Var3 = new h0(radius);
                    h0 h0Var4 = new h0(radius);
                    ll9Var = new ll9();
                    ll9Var.a = by8Var;
                    ll9Var.b = by8Var2;
                    ll9Var.c = by8Var3;
                    ll9Var.d = by8Var4;
                    ll9Var.e = h0Var;
                    ll9Var.f = h0Var2;
                    ll9Var.g = h0Var3;
                    ll9Var.h = h0Var4;
                    ll9Var.i = qa3Var;
                    ll9Var.j = qa3Var2;
                    ll9Var.k = qa3Var3;
                    ll9Var.l = qa3Var4;
                    kl9Var2 = ll9Var;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    by8 by8Var5 = new by8();
                    by8 by8Var6 = new by8();
                    by8 by8Var7 = new by8();
                    by8 by8Var8 = new by8();
                    qa3 qa3Var5 = new qa3();
                    qa3 qa3Var6 = new qa3();
                    qa3 qa3Var7 = new qa3();
                    qa3 qa3Var8 = new qa3();
                    h0 h0Var5 = new h0(Math.min(cornerRadii[0], cornerRadii[1]));
                    h0 h0Var6 = new h0(Math.min(cornerRadii[2], cornerRadii[3]));
                    h0 h0Var7 = new h0(Math.min(cornerRadii[4], cornerRadii[5]));
                    h0 h0Var8 = new h0(Math.min(cornerRadii[6], cornerRadii[7]));
                    ll9Var = new ll9();
                    ll9Var.a = by8Var5;
                    ll9Var.b = by8Var6;
                    ll9Var.c = by8Var7;
                    ll9Var.d = by8Var8;
                    ll9Var.e = h0Var5;
                    ll9Var.f = h0Var6;
                    ll9Var.g = h0Var7;
                    ll9Var.h = h0Var8;
                    ll9Var.i = qa3Var5;
                    ll9Var.j = qa3Var6;
                    ll9Var.k = qa3Var7;
                    ll9Var.l = qa3Var8;
                    kl9Var2 = ll9Var;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        by8 by8Var9 = new by8();
                        by8 by8Var10 = new by8();
                        by8 by8Var11 = new by8();
                        by8 by8Var12 = new by8();
                        qa3 qa3Var9 = new qa3();
                        qa3 qa3Var10 = new qa3();
                        qa3 qa3Var11 = new qa3();
                        qa3 qa3Var12 = new qa3();
                        h0 h0Var9 = new h0(cornerRadius);
                        h0 h0Var10 = new h0(cornerRadius);
                        h0 h0Var11 = new h0(cornerRadius);
                        h0 h0Var12 = new h0(cornerRadius);
                        ll9 ll9Var2 = new ll9();
                        ll9Var2.a = by8Var9;
                        ll9Var2.b = by8Var10;
                        ll9Var2.c = by8Var11;
                        ll9Var2.d = by8Var12;
                        ll9Var2.e = h0Var9;
                        ll9Var2.f = h0Var10;
                        ll9Var2.g = h0Var11;
                        ll9Var2.h = h0Var12;
                        ll9Var2.i = qa3Var9;
                        ll9Var2.j = qa3Var10;
                        ll9Var2.k = qa3Var11;
                        ll9Var2.l = qa3Var12;
                        kl9Var2 = ll9Var2;
                    }
                }
            }
            if (kl9Var2 != null) {
                g(kl9Var2);
            } else {
                this.B = -1.0f;
                this.x.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        b bVar = this.H;
        if (!bVar.c) {
            this.F = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(bVar.x, iArr);
        boolean z = this.F != zStateSetMatches;
        this.F = zStateSetMatches;
        if (z && iArr.length > 0 && !this.E) {
            ObjectAnimator objectAnimator = this.C;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.C = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, L, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(K);
                objectAnimatorOfFloat.addListener(new u94(this));
                this.C = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.D = 1.0f;
            }
        }
        this.E = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends Drawable.ConstantState {
        public Drawable.ConstantState a;
        public int b;
        public boolean c;
        public int d;
        public boolean e;
        public int f;
        public int g;
        public int h;
        public int i;
        public float j;
        public int k;
        public float l;
        public int m;
        public float n;
        public int o;
        public float p;
        public int q;
        public float r;
        public int s;
        public kl9 t;
        public int u;
        public int v;
        public final Rect w;
        public int[] x;

        public b(b bVar) {
            this.b = 0;
            this.c = false;
            this.d = Integer.MIN_VALUE;
            this.e = false;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = Integer.MIN_VALUE;
            this.i = Integer.MIN_VALUE;
            this.j = Float.NaN;
            this.k = Integer.MIN_VALUE;
            this.l = Float.NaN;
            this.m = Integer.MIN_VALUE;
            this.n = Float.NaN;
            this.o = Integer.MIN_VALUE;
            this.p = Float.NaN;
            this.q = Integer.MIN_VALUE;
            this.r = Float.NaN;
            this.s = Integer.MIN_VALUE;
            this.t = null;
            this.u = Integer.MIN_VALUE;
            this.v = Integer.MIN_VALUE;
            this.w = null;
            this.x = FocusRingDrawable.J;
            if (bVar != null) {
                this.a = bVar.a;
                this.b = bVar.b;
                this.c = bVar.c;
                this.d = bVar.d;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.i = bVar.i;
                this.j = bVar.j;
                this.k = bVar.k;
                this.l = bVar.l;
                this.m = bVar.m;
                this.n = bVar.n;
                this.o = bVar.o;
                this.p = bVar.p;
                this.q = bVar.q;
                this.r = bVar.r;
                this.s = bVar.s;
                this.u = bVar.u;
                this.v = bVar.v;
                kl9 kl9Var = bVar.t;
                if (kl9Var instanceof ll9) {
                    this.t = ((ll9) kl9Var).k().a();
                } else if (kl9Var instanceof i0a) {
                    i0a.a aVarI = ((i0a) kl9Var).i();
                    this.t = aVarI.a != 0 ? new i0a(aVarI) : null;
                } else {
                    this.t = kl9Var;
                }
                if (bVar.w != null) {
                    this.w = new Rect(bVar.w);
                }
                int[] iArr = bVar.x;
                this.x = Arrays.copyOf(iArr, iArr.length);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.a;
            return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new FocusRingDrawable(this, (Resources) null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new FocusRingDrawable(this, resources);
        }
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.t = new Paint(1);
        this.u = new RectF();
        this.v = new Rect();
        this.w = new Path();
        this.x = new Path();
        this.y = new Matrix();
        this.z = ml9.b();
        this.B = -1.0f;
        this.D = 1.0f;
        this.F = false;
        this.G = false;
        b bVar = new b(null);
        this.H = bVar;
        if (drawable != null) {
            bVar.a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public FocusRingDrawable() {
        super(null);
        this.t = new Paint(1);
        this.u = new RectF();
        this.v = new Rect();
        this.w = new Path();
        this.x = new Path();
        this.y = new Matrix();
        this.z = ml9.b();
        this.B = -1.0f;
        this.D = 1.0f;
        this.F = false;
        this.G = false;
        this.H = new b(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
