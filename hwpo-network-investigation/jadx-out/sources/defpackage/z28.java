package defpackage;

import android.widget.FrameLayout;
import androidx.media3.ui.c;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z28 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ FrameLayout u;

    public /* synthetic */ z28(FrameLayout frameLayout, int i) {
        this.t = i;
        this.u = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        FrameLayout frameLayout = this.u;
        switch (i) {
            case 0:
                ((c) frameLayout).s();
                break;
            default:
                SimpleProgressBar simpleProgressBar = (SimpleProgressBar) frameLayout;
                SimpleProgressBar.a aVar = SimpleProgressBar.Companion;
                simpleProgressBar.setVisibility(8);
                simpleProgressBar.w = -1L;
                break;
        }
    }
}
