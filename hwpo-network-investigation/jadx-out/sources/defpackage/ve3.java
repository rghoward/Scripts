package defpackage;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ve3 extends ReplacementSpan {
    public final uza u;
    public final Paint.FontMetricsInt t = new Paint.FontMetricsInt();
    public short v = -1;
    public float w = 1.0f;

    public ve3(uza uzaVar) {
        b78.d(uzaVar, "rasterizer cannot be null");
        this.u = uzaVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.t;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        uza uzaVar = this.u;
        yu6 yu6VarB = uzaVar.b();
        int iA = yu6VarB.a(14);
        this.w = fAbs / (iA != 0 ? yu6VarB.b.getShort(iA + yu6VarB.a) : (short) 0);
        yu6 yu6VarB2 = uzaVar.b();
        int iA2 = yu6VarB2.a(14);
        if (iA2 != 0) {
            yu6VarB2.b.getShort(iA2 + yu6VarB2.a);
        }
        yu6 yu6VarB3 = uzaVar.b();
        int iA3 = yu6VarB3.a(12);
        short s = (short) ((iA3 != 0 ? yu6VarB3.b.getShort(iA3 + yu6VarB3.a) : (short) 0) * this.w);
        this.v = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
