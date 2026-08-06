package defpackage;

import android.os.Handler;
import androidx.media3.exoplayer.d;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h90 {
    public final Handler a;
    public final d.b b;

    public h90(Handler handler, d.b bVar) {
        this.a = handler;
        this.b = bVar;
    }

    public final void a(ln2 ln2Var) {
        synchronized (ln2Var) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new p6(1, this, ln2Var));
        }
    }
}
