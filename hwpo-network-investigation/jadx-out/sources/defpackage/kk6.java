package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.material.button.MaterialButton;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class kk6 extends Drawable implements tl9 {
    public static final Paint Y;
    public static final e[] Z;
    public final Matrix A;
    public final Path B;
    public final Path C;
    public final RectF D;
    public final RectF E;
    public final Region F;
    public final Region G;
    public final Paint H;
    public final Paint I;
    public final hl9 J;
    public final b K;
    public final ml9 L;
    public PorterDuffColorFilter M;
    public PorterDuffColorFilter N;
    public int O;
    public final RectF P;
    public boolean Q;
    public boolean R;
    public ll9 S;
    public ry9 T;
    public final qy9[] U;
    public float[] V;
    public float[] W;
    public d X;
    public final a t;
    public c u;
    public final rl9.f[] v;
    public final rl9.f[] w;
    public final BitSet x;
    public boolean y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a {
        public a() {
        }

        public final d72 a(d72 d72Var) {
            return d72Var instanceof yl8 ? d72Var : new xd(-kk6.this.h(), d72Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b {
        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e extends ln4 {
        public final int x;

        public e(int i) {
            super(9);
            this.x = i;
        }

        @Override // defpackage.ln4
        public final float Q0(kk6 kk6Var) {
            float[] fArr = kk6Var.V;
            if (fArr != null) {
                return fArr[this.x];
            }
            return 0.0f;
        }

        @Override // defpackage.ln4
        public final void Z0(kk6 kk6Var, float f) {
            float[] fArr = kk6Var.V;
            if (fArr != null) {
                int i = this.x;
                if (fArr[i] != f) {
                    fArr[i] = f;
                    d dVar = kk6Var.X;
                    if (dVar != null) {
                        float f2 = kk6Var.f();
                        MaterialButton materialButton = ((kj6) dVar).a;
                        int i2 = (int) (f2 * 0.11f);
                        if (materialButton.V != i2) {
                            materialButton.V = i2;
                            materialButton.s();
                            materialButton.invalidate();
                        }
                    }
                    kk6Var.invalidateSelf();
                }
            }
        }
    }

    static {
        new by8();
        new by8();
        new by8();
        new by8();
        new qa3();
        new qa3();
        new qa3();
        new qa3();
        int i = 0;
        lk6.b(0);
        Paint paint = new Paint(1);
        Y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Z = new e[4];
        while (true) {
            e[] eVarArr = Z;
            if (i >= eVarArr.length) {
                return;
            }
            eVarArr[i] = new e(i);
            i++;
        }
    }

    public kk6(c cVar) {
        this.t = new a();
        this.v = new rl9.f[4];
        this.w = new rl9.f[4];
        this.x = new BitSet(8);
        this.A = new Matrix();
        this.B = new Path();
        this.C = new Path();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new Region();
        this.G = new Region();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.J = new hl9();
        this.L = ml9.b();
        this.P = new RectF();
        this.Q = true;
        this.R = true;
        this.U = new qy9[4];
        this.u = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        t(getState());
        this.K = new b();
    }

    public final void a(RectF rectF, Path path) {
        this.L.a(this.u.a.d(), this.V, this.u.i, rectF, this.K, path);
        if (this.u.h != 1.0f) {
            Matrix matrix = this.A;
            matrix.reset();
            float f = this.u.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.P, true);
    }

    public final float b(RectF rectF, ll9 ll9Var, float[] fArr) {
        if (fArr == null) {
            if (ll9Var.j(rectF)) {
                return ll9Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (this.R) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void c(Canvas canvas) {
        if (this.x.cardinality() > 0) {
            Log.w("kk6", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.u.o;
        Path path = this.B;
        hl9 hl9Var = this.J;
        if (i != 0) {
            canvas.drawPath(path, hl9Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            rl9.f fVar = this.v[i2];
            int i3 = this.u.n;
            Matrix matrix = rl9.f.b;
            fVar.a(matrix, hl9Var, i3, canvas);
            this.w[i2].a(matrix, hl9Var, this.u.n, canvas);
        }
        if (this.Q) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.u.o));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.u.o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, Y);
            canvas.translate(iSin, iCos);
        }
    }

    public void d(Canvas canvas) {
        ll9 ll9Var = this.S;
        float[] fArr = this.W;
        RectF rectFE = e();
        RectF rectF = this.E;
        rectF.set(rectFE);
        float fH = h();
        rectF.inset(fH, fH);
        float fB = b(rectF, ll9Var, fArr);
        Paint paint = this.I;
        if (fB < 0.0f) {
            canvas.drawPath(this.C, paint);
        } else {
            float f = fB * this.u.i;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        PorterDuffColorFilter porterDuffColorFilter = this.M;
        Paint paint = this.H;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.u.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.N;
        Paint paint2 = this.I;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.u.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.u.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = j() || !m();
        Paint.Style style = this.u.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.y;
            Path path = this.B;
            if (z2) {
                if (z) {
                    a(e(), path);
                }
                this.y = false;
            }
            if (j()) {
                canvas.save();
                canvas.translate((int) (((double) this.u.o) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.u.o)));
                if (this.Q) {
                    Rect bounds = getBounds();
                    RectF rectF = this.P;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        ru3.e(u43.b("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: ", iWidth, iHeight), rectF);
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.u.n * 2) + ((int) rectF.width()) + iWidth, (this.u.n * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i3 = bounds.left;
                    f = 0.0f;
                    int i4 = this.u.n;
                    float f2 = (i3 - i4) - iWidth;
                    float f3 = (bounds.top - i4) - iHeight;
                    canvas2.translate(-f2, -f3);
                    c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            ll9 ll9VarD = this.u.a.d();
            float[] fArr = this.V;
            RectF rectFE = e();
            float fB = b(rectFE, ll9VarD, fArr);
            if (fB >= f) {
                float f4 = fB * this.u.i;
                canvas.drawRoundRect(rectFE, f4, f4, paint);
            } else {
                canvas.drawPath(path, paint);
            }
        } else {
            f = 0.0f;
        }
        if (k()) {
            if (this.z) {
                ll9 ll9VarG = g();
                ll9.a aVarK = ll9VarG.k();
                d72 d72Var = ll9VarG.e;
                a aVar = this.t;
                aVarK.e = aVar.a(d72Var);
                aVarK.f = aVar.a(ll9VarG.f);
                aVarK.h = aVar.a(ll9VarG.h);
                aVarK.g = aVar.a(ll9VarG.g);
                this.S = aVarK.a();
                float[] fArr2 = this.V;
                if (fArr2 != null) {
                    if (this.W == null) {
                        this.W = new float[fArr2.length];
                    }
                    float fH = h();
                    int i5 = 0;
                    while (true) {
                        float[] fArr3 = this.V;
                        if (i5 >= fArr3.length) {
                            break;
                        }
                        this.W[i5] = Math.max(f, fArr3[i5] - fH);
                        i5++;
                    }
                } else {
                    this.W = null;
                }
                if (z) {
                    ll9 ll9Var = this.S;
                    float[] fArr4 = this.W;
                    float f5 = this.u.i;
                    RectF rectFE2 = e();
                    RectF rectF2 = this.E;
                    rectF2.set(rectFE2);
                    float fH2 = h();
                    rectF2.inset(fH2, fH2);
                    this.L.a(ll9Var, fArr4, f5, rectF2, null, this.C);
                }
                this.z = false;
            }
            d(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final RectF e() {
        Rect bounds = getBounds();
        RectF rectF = this.D;
        rectF.set(bounds);
        return rectF;
    }

    public final float f() {
        float[] fArr = this.V;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFE = e();
        ll9 ll9VarG = g();
        ml9 ml9Var = this.L;
        ml9Var.getClass();
        float fA = ll9VarG.e.a(rectFE);
        ll9 ll9VarG2 = g();
        ml9Var.getClass();
        float fA2 = ll9VarG2.h.a(rectFE) + fA;
        ll9 ll9VarG3 = g();
        ml9Var.getClass();
        float fA3 = fA2 - ll9VarG3.g.a(rectFE);
        ll9 ll9VarG4 = g();
        ml9Var.getClass();
        return (fA3 - ll9VarG4.f.a(rectFE)) / 2.0f;
    }

    public final ll9 g() {
        return this.u.a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.u.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.u.getClass();
        RectF rectFE = e();
        if (rectFE.isEmpty()) {
            return;
        }
        float fB = b(rectFE, this.u.a.d(), this.V);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.u.i);
            return;
        }
        boolean z = this.y;
        Path path = this.B;
        if (z) {
            a(rectFE, path);
            this.y = false;
        }
        f83.b(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.u.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.F;
        region.set(bounds);
        RectF rectFE = e();
        Path path = this.B;
        a(rectFE, path);
        Region region2 = this.G;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        if (k()) {
            return this.I.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float i() {
        float[] fArr = this.V;
        return fArr != null ? fArr[3] : this.u.a.d().e.a(e());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.y = true;
        this.z = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.u.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.u.getClass();
        ColorStateList colorStateList2 = this.u.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.u.c;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.u.a.e();
    }

    public final boolean j() {
        c cVar = this.u;
        cVar.getClass();
        return cVar.n > 0 && !m() && !this.B.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public final boolean k() {
        Paint.Style style = this.u.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.I.getStrokeWidth() > 0.0f;
    }

    public final void l(Context context) {
        this.u.b = new ee3(context);
        w();
    }

    public final boolean m() {
        if (this.u.a.b(getState()).j(e())) {
            return this.V == null || this.R;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.u = new c(this.u);
        return this;
    }

    public final void n(ry9 ry9Var) {
        if (this.T == ry9Var) {
            return;
        }
        this.T = ry9Var;
        int i = 0;
        while (true) {
            qy9[] qy9VarArr = this.U;
            if (i >= qy9VarArr.length) {
                u(getState(), true);
                invalidateSelf();
                return;
            }
            if (qy9VarArr[i] == null) {
                qy9 qy9Var = new qy9(this, Z[i]);
                qy9Var.s = null;
                qy9Var.t = Float.MAX_VALUE;
                qy9Var.u = false;
                qy9VarArr[i] = qy9Var;
            }
            qy9 qy9Var2 = qy9VarArr[i];
            ry9 ry9Var2 = new ry9();
            ry9Var2.a((float) ry9Var.b);
            double d2 = ry9Var.a;
            ry9Var2.b((float) (d2 * d2));
            qy9Var2.s = ry9Var2;
            i++;
        }
    }

    public final void o(float f) {
        c cVar = this.u;
        if (cVar.m != f) {
            cVar.m = f;
            w();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.y = true;
        this.z = true;
        super.onBoundsChange(rect);
        if (!this.u.a.e() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        boolean z = false;
        for (qy9 qy9Var : this.U) {
            if (qy9Var != null && qy9Var.f) {
                z = true;
                break;
            }
        }
        u(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.u.a.e()) {
            u(iArr, false);
        }
        boolean z = t(iArr) || v();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(ColorStateList colorStateList) {
        c cVar = this.u;
        if (cVar.c != colorStateList) {
            cVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void q(float f) {
        c cVar = this.u;
        if (cVar.i != f) {
            cVar.i = f;
            this.y = true;
            this.z = true;
            invalidateSelf();
        }
    }

    public final void r() {
        this.J.a(-12303292);
        this.u.getClass();
        super.invalidateSelf();
    }

    public final void s(kl9 kl9Var) {
        if (kl9Var instanceof ll9) {
            setShapeAppearanceModel((ll9) kl9Var);
            return;
        }
        i0a i0aVar = (i0a) kl9Var;
        c cVar = this.u;
        if (cVar.a != i0aVar) {
            cVar.a = i0aVar;
            u(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c cVar = this.u;
        if (cVar.k != i) {
            cVar.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.u.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.tl9
    public final void setShapeAppearanceModel(ll9 ll9Var) {
        this.u.a = ll9Var;
        this.V = null;
        this.W = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.u.e = colorStateList;
        v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.u;
        if (cVar.f != mode) {
            cVar.f = mode;
            v();
            super.invalidateSelf();
        }
    }

    public final boolean t(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.u.c == null || color2 == (colorForState2 = this.u.c.getColorForState(iArr, (color2 = (paint2 = this.H).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.u.d == null || color == (colorForState = this.u.d.getColorForState(iArr, (color = (paint = this.I).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    public final void u(int[] iArr, boolean z) {
        boolean z2;
        d72 d72Var;
        RectF rectFE = e();
        if (!this.u.a.e() || rectFE.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z3 = z | (this.T == null);
        if (this.V == null) {
            this.V = new float[4];
        }
        ll9 ll9VarB = this.u.a.b(iArr);
        float[] fArr = this.V;
        if (fArr.length > 1) {
            float f = fArr[0];
            int i2 = 1;
            while (true) {
                if (i2 < fArr.length) {
                    if (fArr[i2] == f) {
                        i2++;
                    }
                } else if (ll9VarB.j(e())) {
                    z2 = true;
                }
                z2 = false;
            }
        } else if (ll9VarB.j(e())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.R = z2;
        if (!z2) {
            this.y = true;
            this.z = true;
        }
        while (i < 4) {
            this.L.getClass();
            if (i == 1) {
                d72Var = ll9VarB.g;
            } else if (i != 2) {
                d72Var = i != 3 ? ll9VarB.f : ll9VarB.e;
            } else {
                d72Var = ll9VarB.h;
            }
            float fA = d72Var.a(rectFE);
            if (z3) {
                this.V[i] = fA;
            }
            qy9[] qy9VarArr = this.U;
            qy9 qy9Var = qy9VarArr[i];
            if (qy9Var != null) {
                qy9Var.d(fA);
                if (z3) {
                    qy9 qy9Var2 = qy9VarArr[i];
                    if (qy9Var2.s.b <= 0.0d) {
                        ru3.f("Spring animations can only come to an end when there is damping");
                        return;
                    }
                    ov.d dVar = t93.b().e;
                    dVar.getClass();
                    if (Thread.currentThread() != dVar.b.getThread()) {
                        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                    }
                    if (qy9Var2.f) {
                        qy9Var2.u = true;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.M;
        PorterDuffColorFilter porterDuffColorFilter3 = this.N;
        c cVar = this.u;
        ColorStateList colorStateList = cVar.e;
        PorterDuff.Mode mode = cVar.f;
        if (colorStateList == null || mode == null) {
            int color = this.H.getColor();
            c cVar2 = this.u;
            float f = cVar2.m + 0.0f + cVar2.l;
            ee3 ee3Var = cVar2.b;
            int iA = ee3Var != null ? ee3Var.a(f, color) : color;
            this.O = iA;
            porterDuffColorFilter = iA != color ? new PorterDuffColorFilter(iA, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            c cVar3 = this.u;
            float f2 = cVar3.m + 0.0f + cVar3.l;
            ee3 ee3Var2 = cVar3.b;
            if (ee3Var2 != null) {
                colorForState = ee3Var2.a(f2, colorForState);
            }
            this.O = colorForState;
            porterDuffColorFilter = new PorterDuffColorFilter(colorForState, mode);
        }
        this.M = porterDuffColorFilter;
        this.u.getClass();
        this.N = null;
        this.u.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.M) && Objects.equals(porterDuffColorFilter3, this.N)) ? false : true;
    }

    public final void w() {
        c cVar = this.u;
        float f = cVar.m + 0.0f;
        cVar.n = (int) Math.ceil(0.75f * f);
        this.u.o = (int) Math.ceil(f * 0.25f);
        v();
        if (j() || !m()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends Drawable.ConstantState {
        public kl9 a;
        public ee3 b;
        public ColorStateList c;
        public ColorStateList d;
        public ColorStateList e;
        public PorterDuff.Mode f;
        public Rect g;
        public final float h;
        public float i;
        public float j;
        public int k;
        public float l;
        public float m;
        public int n;
        public int o;
        public final Paint.Style p;

        public c(c cVar) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.g = null;
            this.h = 1.0f;
            this.i = 1.0f;
            this.k = 255;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 0;
            this.o = 0;
            this.p = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.b = cVar.b;
            this.j = cVar.j;
            this.c = cVar.c;
            this.d = cVar.d;
            this.f = cVar.f;
            this.e = cVar.e;
            this.k = cVar.k;
            this.h = cVar.h;
            this.o = cVar.o;
            this.i = cVar.i;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.p = cVar.p;
            if (cVar.g != null) {
                this.g = new Rect(cVar.g);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            kk6 kk6Var = new kk6(this);
            kk6Var.y = true;
            kk6Var.z = true;
            return kk6Var;
        }

        public c(kl9 kl9Var) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.g = null;
            this.h = 1.0f;
            this.i = 1.0f;
            this.k = 255;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 0;
            this.o = 0;
            this.p = Paint.Style.FILL_AND_STROKE;
            this.a = kl9Var;
            this.b = null;
        }
    }

    public kk6(Context context, AttributeSet attributeSet, int i, int i2) {
        this(ll9.g(context, attributeSet, i, i2).a());
    }

    public kk6(ll9 ll9Var) {
        this(new c(ll9Var));
    }

    public kk6(kl9 kl9Var) {
        this(new c(kl9Var));
    }

    public kk6() {
        this(new ll9());
    }
}
