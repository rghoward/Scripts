package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ymb extends x10 {
    public final Window f;
    public final yv9 g;

    public ymb(Window window, yv9 yv9Var) {
        this.f = window;
        this.g = yv9Var;
    }

    @Override // defpackage.x10
    public final void b(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    j(4);
                } else if (i2 == 2) {
                    j(2);
                } else if (i2 == 8) {
                    this.g.a.a();
                }
            }
        }
    }

    public final void j(int i) {
        View decorView = this.f.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void k(int i) {
        View decorView = this.f.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
