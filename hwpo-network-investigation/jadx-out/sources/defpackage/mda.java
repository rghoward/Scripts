package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mda {
    public float c;
    public float d;
    public final WeakReference<b> f;
    public dba g;
    public final TextPaint a = new TextPaint(1);
    public final a b = new a(this);
    public boolean e = true;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ln4 {
        public final /* synthetic */ mda x;

        public a(mda mdaVar) {
            super(26);
            this.x = mdaVar;
        }

        @Override // defpackage.ln4
        public final void S0(int i) {
            mda mdaVar = this.x;
            mdaVar.e = true;
            b bVar = mdaVar.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.ln4
        public final void T0(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            mda mdaVar = this.x;
            mdaVar.e = true;
            b bVar = mdaVar.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public mda(ti0 ti0Var) {
        this.f = new WeakReference<>(null);
        this.f = new WeakReference<>(ti0Var);
    }

    public final void a(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }
}
