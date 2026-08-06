package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f73 extends CharacterStyle implements UpdateAppearance {
    public final e73 t;

    public f73(e73 e73Var) {
        this.t = e73Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            zy3 zy3Var = zy3.a;
            e73 e73Var = this.t;
            if (xj5.a(e73Var, zy3Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(e73Var instanceof b3a)) {
                u.b();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            b3a b3aVar = (b3a) e73Var;
            textPaint.setStrokeWidth(b3aVar.a);
            textPaint.setStrokeMiter(b3aVar.b);
            int i = b3aVar.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = b3aVar.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
