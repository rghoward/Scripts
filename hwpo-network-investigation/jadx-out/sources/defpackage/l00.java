package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l00 implements Runnable {
    public final /* synthetic */ TextView t;
    public final /* synthetic */ Typeface u;
    public final /* synthetic */ int v;

    public l00(TextView textView, Typeface typeface, int i) {
        this.t = textView;
        this.u = typeface;
        this.v = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.setTypeface(this.u, this.v);
    }
}
