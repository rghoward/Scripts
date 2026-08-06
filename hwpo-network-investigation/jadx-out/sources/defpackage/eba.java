package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eba extends ln4 {
    public final /* synthetic */ dba A;
    public final /* synthetic */ Context x;
    public final /* synthetic */ TextPaint y;
    public final /* synthetic */ ln4 z;

    public eba(dba dbaVar, Context context, TextPaint textPaint, ln4 ln4Var) {
        super(26);
        this.A = dbaVar;
        this.x = context;
        this.y = textPaint;
        this.z = ln4Var;
    }

    @Override // defpackage.ln4
    public final void S0(int i) {
        this.z.S0(i);
    }

    @Override // defpackage.ln4
    public final void T0(Typeface typeface, boolean z) {
        this.A.e(this.x, this.y, typeface);
        this.z.T0(typeface, z);
    }
}
