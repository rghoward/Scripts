package defpackage;

import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.g;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ue4<H> extends le4 {
    public final g t;
    public final g u;
    public final Handler v;
    public final bf4 w;

    public ue4(g gVar) {
        Handler handler = new Handler();
        this.t = gVar;
        this.u = gVar;
        this.v = handler;
        this.w = new bf4();
    }

    public abstract void d(PrintWriter printWriter, String[] strArr);

    public abstract g e();

    public abstract LayoutInflater f();

    public abstract boolean g(String str);

    public abstract void h();
}
