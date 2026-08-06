package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wcb extends vcb {
    public static final PorterDuff.Mode C = PorterDuff.Mode.SRC_IN;
    public final Matrix A;
    public final Rect B;
    public g u;
    public PorterDuffColorFilter v;
    public ColorFilter w;
    public boolean x;
    public boolean y;
    public final float[] z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends e {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends e {
        public mp1 d;
        public mp1 f;
        public float e = 0.0f;
        public float g = 1.0f;
        public float h = 1.0f;
        public float i = 0.0f;
        public float j = 1.0f;
        public float k = 0.0f;
        public Paint.Cap l = Paint.Cap.BUTT;
        public Paint.Join m = Paint.Join.MITER;
        public float n = 4.0f;

        @Override // wcb.d
        public final boolean a() {
            return this.f.b() || this.d.b();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0036  */
        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        @Override // wcb.d
        public final boolean b(int[] iArr) {
            boolean z;
            mp1 mp1Var = this.f;
            boolean z2 = true;
            if (mp1Var.b()) {
                ColorStateList colorStateList = mp1Var.b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != mp1Var.c) {
                    mp1Var.c = colorForState;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            mp1 mp1Var2 = this.d;
            if (mp1Var2.b()) {
                ColorStateList colorStateList2 = mp1Var2.b;
                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                if (colorForState2 != mp1Var2.c) {
                    mp1Var2.c = colorForState2;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            return z | z2;
        }

        public float getFillAlpha() {
            return this.h;
        }

        public int getFillColor() {
            return this.f.c;
        }

        public float getStrokeAlpha() {
            return this.g;
        }

        public int getStrokeColor() {
            return this.d.c;
        }

        public float getStrokeWidth() {
            return this.e;
        }

        public float getTrimPathEnd() {
            return this.j;
        }

        public float getTrimPathOffset() {
            return this.k;
        }

        public float getTrimPathStart() {
            return this.i;
        }

        public void setFillAlpha(float f) {
            this.h = f;
        }

        public void setFillColor(int i) {
            this.f.c = i;
        }

        public void setStrokeAlpha(float f) {
            this.g = f;
        }

        public void setStrokeColor(int i) {
            this.d.c = i;
        }

        public void setStrokeWidth(float f) {
            this.e = f;
        }

        public void setTrimPathEnd(float f) {
            this.j = f;
        }

        public void setTrimPathOffset(float f) {
            this.k = f;
        }

        public void setTrimPathStart(float f) {
            this.i = f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public wcb() {
        this.y = true;
        this.z = new float[9];
        this.A = new Matrix();
        this.B = new Rect();
        g gVar = new g();
        gVar.c = null;
        gVar.d = C;
        gVar.b = new f();
        this.u = gVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.t;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.B;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.w;
        if (colorFilter == null) {
            colorFilter = this.v;
        }
        Matrix matrix = this.A;
        canvas.getMatrix(matrix);
        float[] fArr = this.z;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(AudioConstants.AUDIO_FILE_BUFFER_SIZE, iWidth);
        int iMin2 = Math.min(AudioConstants.AUDIO_FILE_BUFFER_SIZE, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        g gVar = this.u;
        Bitmap bitmap = gVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != gVar.f.getHeight()) {
            gVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            gVar.k = true;
        }
        boolean z = this.y;
        g gVar2 = this.u;
        if (!z) {
            gVar2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(gVar2.f);
            f fVar = gVar2.b;
            fVar.a(fVar.g, f.p, canvas2, iMin, iMin2);
        } else if (gVar2.k || gVar2.g != gVar2.c || gVar2.h != gVar2.d || gVar2.j != gVar2.e || gVar2.i != gVar2.b.getRootAlpha()) {
            g gVar3 = this.u;
            gVar3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(gVar3.f);
            f fVar2 = gVar3.b;
            fVar2.a(fVar2.g, f.p, canvas3, iMin, iMin2);
            g gVar4 = this.u;
            gVar4.g = gVar4.c;
            gVar4.h = gVar4.d;
            gVar4.i = gVar4.b.getRootAlpha();
            gVar4.j = gVar4.e;
            gVar4.k = false;
        }
        g gVar5 = this.u;
        if (gVar5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (gVar5.l == null) {
                Paint paint2 = new Paint();
                gVar5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            gVar5.l.setAlpha(gVar5.b.getRootAlpha());
            gVar5.l.setColorFilter(colorFilter);
            paint = gVar5.l;
        }
        canvas.drawBitmap(gVar5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.t;
        return drawable != null ? drawable.getAlpha() : this.u.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.t;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.u.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.t;
        return drawable != null ? drawable.getColorFilter() : this.w;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.t != null) {
            return new h(this.t.getConstantState());
        }
        this.u.a = getChangingConfigurations();
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.t;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.u.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.t;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.u.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.t;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        boolean z;
        int i3;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.u;
        gVar.b = new f();
        TypedArray typedArrayD = iza.d(resources, theme, attributeSet, yq.a);
        g gVar2 = this.u;
        f fVar = gVar2.b;
        int i4 = !iza.c(xmlPullParser, "tintMode") ? -1 : typedArrayD.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case h4c.e /* 15 */:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar2.d = mode;
        ColorStateList colorStateListA = iza.a(typedArrayD, xmlPullParser, theme);
        if (colorStateListA != null) {
            gVar2.c = colorStateListA;
        }
        boolean z2 = gVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z2 = typedArrayD.getBoolean(5, z2);
        }
        gVar2.e = z2;
        float f2 = fVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f2 = typedArrayD.getFloat(7, f2);
        }
        fVar.j = f2;
        float f3 = fVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f3 = typedArrayD.getFloat(8, f3);
        }
        fVar.k = f3;
        if (fVar.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayD.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 <= 0.0f) {
            throw new XmlPullParserException(typedArrayD.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        fVar.h = typedArrayD.getDimension(3, fVar.h);
        int i6 = 2;
        float dimension = typedArrayD.getDimension(2, fVar.i);
        fVar.i = dimension;
        if (fVar.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayD.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayD.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = fVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayD.getFloat(4, alpha);
        }
        fVar.setAlpha(alpha);
        boolean z3 = false;
        String string = typedArrayD.getString(0);
        if (string != null) {
            fVar.m = string;
            fVar.o.put(string, fVar);
        }
        typedArrayD.recycle();
        gVar.a = getChangingConfigurations();
        int i7 = 1;
        gVar.k = true;
        g gVar3 = this.u;
        f fVar2 = gVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        c cVar = fVar2.g;
        n30<String, Object> n30Var = fVar2.o;
        arrayDeque.push(cVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z4 = true;
        while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
            if (eventType == i6) {
                String name = xmlPullParser.getName();
                c cVar2 = (c) arrayDeque.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    TypedArray typedArrayD2 = iza.d(resources, theme, attributeSet, yq.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayD2.getString(0);
                        if (string2 != null) {
                            bVar.b = string2;
                        }
                        String string3 = typedArrayD2.getString(2);
                        if (string3 != null) {
                            bVar.a = ku7.b(string3);
                        }
                        bVar.f = iza.b(typedArrayD2, xmlPullParser, theme, "fillColor", 1);
                        float f4 = bVar.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f4 = typedArrayD2.getFloat(12, f4);
                        }
                        bVar.h = f4;
                        int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayD2.getInt(8, -1) : -1;
                        Paint.Cap cap2 = bVar.l;
                        if (i8 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (i8 != 1) {
                            cap = i8 != 2 ? cap2 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        bVar.l = cap;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayD2.getInt(9, -1) : -1;
                        Paint.Join join2 = bVar.m;
                        if (i9 == 0) {
                            join = Paint.Join.MITER;
                        } else if (i9 != 1) {
                            join = i9 != 2 ? join2 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        bVar.m = join;
                        float f5 = bVar.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f5 = typedArrayD2.getFloat(10, f5);
                        }
                        bVar.n = f5;
                        bVar.d = iza.b(typedArrayD2, xmlPullParser, theme, "strokeColor", 3);
                        float f6 = bVar.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f6 = typedArrayD2.getFloat(11, f6);
                        }
                        bVar.g = f6;
                        float f7 = bVar.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f7 = typedArrayD2.getFloat(4, f7);
                        }
                        bVar.e = f7;
                        float f8 = bVar.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f8 = typedArrayD2.getFloat(6, f8);
                        }
                        bVar.j = f8;
                        float f9 = bVar.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f9 = typedArrayD2.getFloat(7, f9);
                        }
                        bVar.k = f9;
                        float f10 = bVar.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f10 = typedArrayD2.getFloat(5, f10);
                        }
                        bVar.i = f10;
                        int i10 = bVar.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i10 = typedArrayD2.getInt(13, i10);
                        }
                        bVar.c = i10;
                    }
                    typedArrayD2.recycle();
                    cVar2.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        n30Var.put(bVar.getPathName(), bVar);
                    }
                    gVar3.a = gVar3.a;
                    z = false;
                    i2 = 2;
                    z4 = false;
                } else {
                    depth = depth;
                    if ("clip-path".equals(name)) {
                        a aVar = new a();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayD3 = iza.d(resources, theme, attributeSet, yq.d);
                            String string4 = typedArrayD3.getString(0);
                            if (string4 != null) {
                                aVar.b = string4;
                            }
                            String string5 = typedArrayD3.getString(1);
                            if (string5 != null) {
                                aVar.a = ku7.b(string5);
                            }
                            aVar.c = !iza.c(xmlPullParser, "fillType") ? 0 : typedArrayD3.getInt(2, 0);
                            typedArrayD3.recycle();
                        }
                        cVar2.b.add(aVar);
                        if (aVar.getPathName() != null) {
                            n30Var.put(aVar.getPathName(), aVar);
                        }
                        gVar3.a = gVar3.a;
                    } else if ("group".equals(name)) {
                        c cVar3 = new c();
                        TypedArray typedArrayD4 = iza.d(resources, theme, attributeSet, yq.b);
                        float f11 = cVar3.c;
                        if (iza.c(xmlPullParser, "rotation")) {
                            f11 = typedArrayD4.getFloat(5, f11);
                        }
                        cVar3.c = f11;
                        cVar3.d = typedArrayD4.getFloat(1, cVar3.d);
                        i2 = 2;
                        cVar3.e = typedArrayD4.getFloat(2, cVar3.e);
                        float f12 = cVar3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f12 = typedArrayD4.getFloat(3, f12);
                        }
                        cVar3.f = f12;
                        float f13 = cVar3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f13 = typedArrayD4.getFloat(4, f13);
                        }
                        cVar3.g = f13;
                        float f14 = cVar3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f14 = typedArrayD4.getFloat(6, f14);
                        }
                        cVar3.h = f14;
                        float f15 = cVar3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f15 = typedArrayD4.getFloat(7, f15);
                        }
                        cVar3.i = f15;
                        z = false;
                        String string6 = typedArrayD4.getString(0);
                        if (string6 != null) {
                            cVar3.k = string6;
                        }
                        cVar3.c();
                        typedArrayD4.recycle();
                        cVar2.b.add(cVar3);
                        arrayDeque.push(cVar3);
                        if (cVar3.getGroupName() != null) {
                            n30Var.put(cVar3.getGroupName(), cVar3);
                        }
                        gVar3.a = gVar3.a;
                    }
                    z = false;
                    i2 = 2;
                }
                i3 = 3;
                i = 1;
            } else {
                depth = depth;
                i = 1;
                i2 = i6;
                z = z3;
                i3 = i5;
                if (eventType == i3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i5 = i3;
            z3 = z;
            i6 = i2;
            i7 = i;
            depth = depth;
        }
        if (z4) {
            throw new XmlPullParserException("no path defined");
        }
        this.v = a(gVar.c, gVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.t;
        return drawable != null ? drawable.isAutoMirrored() : this.u.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.t;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        g gVar = this.u;
        if (gVar == null) {
            return false;
        }
        f fVar = gVar.b;
        if (fVar.n == null) {
            fVar.n = Boolean.valueOf(fVar.g.a());
        }
        if (fVar.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.u.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.x && super.mutate() == this) {
            g gVar = this.u;
            g gVar2 = new g();
            gVar2.c = null;
            gVar2.d = C;
            if (gVar != null) {
                gVar2.a = gVar.a;
                f fVar = new f(gVar.b);
                gVar2.b = fVar;
                if (gVar.b.e != null) {
                    fVar.e = new Paint(gVar.b.e);
                }
                if (gVar.b.d != null) {
                    gVar2.b.d = new Paint(gVar.b.d);
                }
                gVar2.c = gVar.c;
                gVar2.d = gVar.d;
                gVar2.e = gVar.e;
            }
            this.u = gVar2;
            this.x = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.t;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.u;
        ColorStateList colorStateList = gVar.c;
        if (colorStateList == null || (mode = gVar.d) == null) {
            z = false;
        } else {
            this.v = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        f fVar = gVar.b;
        if (fVar.n == null) {
            fVar.n = Boolean.valueOf(fVar.g.a());
        }
        if (fVar.n.booleanValue()) {
            boolean zB = gVar.b.g.b(iArr);
            gVar.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.u.b.getRootAlpha() != i) {
            this.u.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.u.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.w = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        g gVar = this.u;
        if (gVar.c != colorStateList) {
            gVar.c = colorStateList;
            this.v = a(colorStateList, gVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        g gVar = this.u;
        if (gVar.d != mode) {
            gVar.d = mode;
            this.v = a(gVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.t;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g extends Drawable.ConstantState {
        public int a;
        public f b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new wcb(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new wcb(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class h extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public h(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            wcb wcbVar = new wcb();
            wcbVar.t = (VectorDrawable) this.a.newDrawable();
            return wcbVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            wcb wcbVar = new wcb();
            wcbVar.t = (VectorDrawable) this.a.newDrawable(resources);
            return wcbVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            wcb wcbVar = new wcb();
            wcbVar.t = (VectorDrawable) this.a.newDrawable(resources, theme);
            return wcbVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class e extends d {
        public ku7.a[] a;
        public String b;
        public int c;

        public e(e eVar) {
            this.a = null;
            this.c = 0;
            this.b = eVar.b;
            ku7.a[] aVarArr = eVar.a;
            ku7.a[] aVarArr2 = new ku7.a[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                aVarArr2[i] = new ku7.a(aVarArr[i]);
            }
            this.a = aVarArr2;
        }

        public ku7.a[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(ku7.a[] aVarArr) {
            ku7.a[] aVarArr2 = this.a;
            if (aVarArr2 != null && aVarArr != null && aVarArr2.length == aVarArr.length) {
                int i = 0;
                while (true) {
                    if (i >= aVarArr2.length) {
                        ku7.a[] aVarArr3 = this.a;
                        for (int i2 = 0; i2 < aVarArr.length; i2++) {
                            aVarArr3[i2].a = aVarArr[i2].a;
                            int i3 = 0;
                            while (true) {
                                float[] fArr = aVarArr[i2].b;
                                if (i3 < fArr.length) {
                                    aVarArr3[i2].b[i3] = fArr[i3];
                                    i3++;
                                }
                            }
                        }
                        return;
                    }
                    ku7.a aVar = aVarArr2[i];
                    char c = aVar.a;
                    ku7.a aVar2 = aVarArr[i];
                    if (c != aVar2.a || aVar.b.length != aVar2.b.length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            ku7.a[] aVarArr4 = new ku7.a[aVarArr.length];
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                aVarArr4[i4] = new ku7.a(aVarArr[i4]);
            }
            this.a = aVarArr4;
        }

        public e() {
            this.a = null;
            this.c = 0;
        }
    }

    public wcb(g gVar) {
        this.y = true;
        this.z = new float[9];
        this.A = new Matrix();
        this.B = new Rect();
        this.u = gVar;
        this.v = a(gVar.c, gVar.d);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f {
        public static final Matrix p = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public final c g;
        public float h;
        public float i;
        public float j;
        public float k;
        public int l;
        public String m;
        public Boolean n;
        public final n30<String, Object> o;

        public f(f fVar) {
            this.c = new Matrix();
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 255;
            this.m = null;
            this.n = null;
            n30<String, Object> n30Var = new n30<>();
            this.o = n30Var;
            this.g = new c(fVar.g, n30Var);
            this.a = new Path(fVar.a);
            this.b = new Path(fVar.b);
            this.h = fVar.h;
            this.i = fVar.i;
            this.j = fVar.j;
            this.k = fVar.k;
            this.l = fVar.l;
            this.m = fVar.m;
            String str = fVar.m;
            if (str != null) {
                n30Var.put(str, this);
            }
            this.n = fVar.n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i, int i2) {
            int i3;
            float f;
            int i4;
            Matrix matrix2 = cVar.a;
            ArrayList<d> arrayList = cVar.b;
            matrix2.set(matrix);
            Matrix matrix3 = cVar.a;
            matrix3.preConcat(cVar.j);
            canvas.save();
            char c = 0;
            int i5 = 0;
            while (i5 < arrayList.size()) {
                d dVar = arrayList.get(i5);
                if (dVar instanceof c) {
                    a((c) dVar, matrix3, canvas, i, i2);
                } else {
                    if (dVar instanceof e) {
                        e eVar = (e) dVar;
                        float f2 = i / this.j;
                        float f3 = i2 / this.k;
                        float fMin = Math.min(f2, f3);
                        Matrix matrix4 = this.c;
                        matrix4.set(matrix3);
                        matrix4.postScale(f2, f3);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix3.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                        boolean z = c;
                        i3 = i5;
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                        if (fAbs != 0.0f) {
                            Path path = this.a;
                            path.reset();
                            ku7.a[] aVarArr = eVar.a;
                            if (aVarArr != null) {
                                ku7.a.b(aVarArr, path);
                            }
                            Path path2 = this.b;
                            path2.reset();
                            if (eVar instanceof a) {
                                path2.setFillType(eVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                path2.addPath(path, matrix4);
                                canvas.clipPath(path2);
                            } else {
                                b bVar = (b) eVar;
                                float f5 = bVar.i;
                                if (f5 != 0.0f || bVar.j != 1.0f) {
                                    float f6 = bVar.k;
                                    float f7 = (f5 + f6) % 1.0f;
                                    float f8 = (bVar.j + f6) % 1.0f;
                                    if (this.f == null) {
                                        this.f = new PathMeasure();
                                    }
                                    this.f.setPath(path, z);
                                    float length = this.f.getLength();
                                    float f9 = f7 * length;
                                    float f10 = f8 * length;
                                    path.reset();
                                    PathMeasure pathMeasure = this.f;
                                    if (f9 > f10) {
                                        pathMeasure.getSegment(f9, length, path, true);
                                        f = 0.0f;
                                        this.f.getSegment(0.0f, f10, path, true);
                                    } else {
                                        f = 0.0f;
                                        pathMeasure.getSegment(f9, f10, path, true);
                                    }
                                    path.rLineTo(f, f);
                                }
                                path2.addPath(path, matrix4);
                                mp1 mp1Var = bVar.f;
                                float f11 = 255.0f;
                                if (mp1Var.a == null && mp1Var.c == 0) {
                                    f11 = 255.0f;
                                    i4 = 16777215;
                                } else {
                                    if (this.e == null) {
                                        i4 = 16777215;
                                        Paint paint = new Paint(1);
                                        this.e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    } else {
                                        i4 = 16777215;
                                    }
                                    Paint paint2 = this.e;
                                    Shader shader = mp1Var.a;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix4);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(bVar.h * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i6 = mp1Var.c;
                                        float f12 = bVar.h;
                                        PorterDuff.Mode mode = wcb.C;
                                        paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    path2.setFillType(bVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(path2, paint2);
                                }
                                mp1 mp1Var2 = bVar.d;
                                if (mp1Var2.a != null || mp1Var2.c != 0) {
                                    if (this.d == null) {
                                        Paint paint3 = new Paint(1);
                                        this.d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = this.d;
                                    Paint.Join join = bVar.m;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = bVar.l;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(bVar.n);
                                    Shader shader2 = mp1Var2.a;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix4);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(bVar.g * f11));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i7 = mp1Var2.c;
                                        float f13 = bVar.g;
                                        PorterDuff.Mode mode2 = wcb.C;
                                        paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(bVar.e * fMin * fAbs);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                    }
                    i5 = i3 + 1;
                    c = 0;
                }
                i3 = i5;
                i5 = i3 + 1;
                c = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.l = i;
        }

        public f() {
            this.c = new Matrix();
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 255;
            this.m = null;
            this.n = null;
            this.o = new n30<>();
            this.g = new c();
            this.a = new Path();
            this.b = new Path();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends d {
        public final Matrix a;
        public final ArrayList<d> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public String k;

        public c(c cVar, n30<String, Object> n30Var) {
            e aVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.k = null;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            String str = cVar.k;
            this.k = str;
            if (str != null) {
                n30Var.put(str, this);
            }
            matrix.set(cVar.j);
            ArrayList<d> arrayList = cVar.b;
            for (int i = 0; i < arrayList.size(); i++) {
                d dVar = arrayList.get(i);
                if (dVar instanceof c) {
                    this.b.add(new c((c) dVar, n30Var));
                } else {
                    if (dVar instanceof b) {
                        b bVar = (b) dVar;
                        b bVar2 = new b(bVar);
                        bVar2.e = 0.0f;
                        bVar2.g = 1.0f;
                        bVar2.h = 1.0f;
                        bVar2.i = 0.0f;
                        bVar2.j = 1.0f;
                        bVar2.k = 0.0f;
                        bVar2.l = Paint.Cap.BUTT;
                        bVar2.m = Paint.Join.MITER;
                        bVar2.n = 4.0f;
                        bVar2.d = bVar.d;
                        bVar2.e = bVar.e;
                        bVar2.g = bVar.g;
                        bVar2.f = bVar.f;
                        bVar2.c = bVar.c;
                        bVar2.h = bVar.h;
                        bVar2.i = bVar.i;
                        bVar2.j = bVar.j;
                        bVar2.k = bVar.k;
                        bVar2.l = bVar.l;
                        bVar2.m = bVar.m;
                        bVar2.n = bVar.n;
                        aVar = bVar2;
                    } else {
                        if (!(dVar instanceof a)) {
                            aa0.c("Unknown object in the tree!");
                            throw null;
                        }
                        aVar = new a((a) dVar);
                    }
                    this.b.add(aVar);
                    String str2 = aVar.b;
                    if (str2 != null) {
                        n30Var.put(str2, aVar);
                    }
                }
            }
        }

        @Override // wcb.d
        public final boolean a() {
            int i = 0;
            while (true) {
                ArrayList<d> arrayList = this.b;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).a()) {
                    return true;
                }
                i++;
            }
        }

        @Override // wcb.d
        public final boolean b(int[] iArr) {
            int i = 0;
            boolean zB = false;
            while (true) {
                ArrayList<d> arrayList = this.b;
                if (i >= arrayList.size()) {
                    return zB;
                }
                zB |= arrayList.get(i).b(iArr);
                i++;
            }
        }

        public final void c() {
            Matrix matrix = this.j;
            matrix.reset();
            matrix.postTranslate(-this.d, -this.e);
            matrix.postScale(this.f, this.g);
            matrix.postRotate(this.c, 0.0f, 0.0f);
            matrix.postTranslate(this.h + this.d, this.i + this.e);
        }

        public String getGroupName() {
            return this.k;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                c();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                c();
            }
        }

        public c() {
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.k = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
