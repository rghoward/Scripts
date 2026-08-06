package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ho4 extends ln4 {
    public final CharSequence x;
    public final TextPaint y;

    public ho4(CharSequence charSequence, TextPaint textPaint) {
        super(11);
        this.x = charSequence;
        this.y = textPaint;
    }

    @Override // defpackage.ln4
    public final int R0(int i) {
        CharSequence charSequence = this.x;
        return this.y.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.ln4
    public final int V0(int i) {
        CharSequence charSequence = this.x;
        return this.y.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
