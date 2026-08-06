package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dl9 extends CharacterStyle implements UpdateAppearance {
    public final cl9 t;
    public final float u;
    public final dt7 v = bl7.i(new cr9(9205357640488583168L));
    public final my2 w = bl7.f(new c10(1, this));

    public dl9(cl9 cl9Var, float f) {
        this.t = cl9Var;
        this.u = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j84.d(textPaint, this.u);
        textPaint.setShader((Shader) this.w.getValue());
    }
}
