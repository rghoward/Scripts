package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fd2 implements LeadingMarginSpan {
    public final int A;
    public final jl9 t;
    public final float u;
    public final float v;
    public final float w;
    public final e73 x;
    public final tx2 y;
    public final int z;

    public fd2(jl9 jl9Var, float f, float f2, float f3, float f4, e73 e73Var, tx2 tx2Var, float f5) {
        this.t = jl9Var;
        this.u = f;
        this.v = f2;
        this.w = f4;
        this.x = e73Var;
        this.y = tx2Var;
        int iB = wk6.b(f + f3);
        this.z = iB;
        this.A = wk6.b(f5) - iB;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Paint.Cap cap;
        Paint.Join join;
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.z;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        zy3 zy3Var = zy3.a;
        e73 e73Var = this.x;
        Integer numValueOf = null;
        if (xj5.a(e73Var, zy3Var)) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            if (!(e73Var instanceof b3a)) {
                u.b();
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            b3a b3aVar = (b3a) e73Var;
            paint.setStrokeWidth(b3aVar.a);
            paint.setStrokeMiter(b3aVar.b);
            int i10 = b3aVar.c;
            if (i10 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i10 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            int i11 = b3aVar.d;
            if (i11 == 0) {
                join = Paint.Join.MITER;
            } else if (i11 == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            paint.setStrokeJoin(join);
            paint.setPathEffect(null);
        }
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.u)) << 32) | (((long) Float.floatToRawIntBits(this.v)) & 4294967295L);
        mh4 mh4Var = new mh4() { // from class: ed2
            @Override // defpackage.mh4
            public final Object invoke() {
                fd2 fd2Var = this.t;
                jl9 jl9Var = fd2Var.t;
                int i12 = i2;
                dm7 dm7VarMo0createOutlinePq9zytI = jl9Var.mo0createOutlinePq9zytI(jFloatToRawIntBits, i12 > 0 ? tq5.t : tq5.u, fd2Var.y);
                float f2 = i9;
                boolean z2 = dm7VarMo0createOutlinePq9zytI instanceof dm7.a;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (z2) {
                    canvas2.save();
                    cu7 cu7Var = ((dm7.a) dm7VarMo0createOutlinePq9zytI).a;
                    sk8 bounds = cu7Var.getBounds();
                    canvas2.translate(f2, f3 - ((bounds.d - bounds.b) / 2.0f));
                    if (!(cu7Var instanceof vp)) {
                        ru3.f("Unable to obtain android.graphics.Path");
                        return null;
                    }
                    canvas2.drawPath(((vp) cu7Var).a, paint2);
                    canvas2.restore();
                } else if (dm7VarMo0createOutlinePq9zytI instanceof dm7.c) {
                    vx8 vx8Var = ((dm7.c) dm7VarMo0createOutlinePq9zytI).a;
                    if (dc4.c(vx8Var)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (vx8Var.e >> 32));
                        canvas2.drawRoundRect(f2, f3 - (vx8Var.a() / 2.0f), (vx8Var.b() * i12) + f2, (vx8Var.a() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint2);
                    } else {
                        vp vpVarA = xp.a();
                        vpVarA.q(vx8Var);
                        canvas2.save();
                        canvas2.translate(f2, f3 - (vx8Var.a() / 2.0f));
                        canvas2.drawPath(vpVarA.a, paint2);
                        canvas2.restore();
                    }
                } else {
                    if (!(dm7VarMo0createOutlinePq9zytI instanceof dm7.b)) {
                        u.b();
                        return null;
                    }
                    sk8 sk8Var = ((dm7.b) dm7VarMo0createOutlinePq9zytI).a;
                    float f4 = (sk8Var.d - sk8Var.b) / 2.0f;
                    canvas2.drawRect(f2, f3 - f4, go.a(sk8Var.c, sk8Var.a, i12, f2), f4 + f3, paint2);
                }
                return g2b.a;
            }
        };
        float f2 = this.w;
        if (!Float.isNaN(f2)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(f2 * 255.0f));
        }
        mh4Var.invoke();
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.A;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
