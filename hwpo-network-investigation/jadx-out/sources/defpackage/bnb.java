package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class bnb extends x10 {
    public final WindowInsetsController f;
    public final yv9 g;
    public final Window h;

    public bnb(Window window, yv9 yv9Var) {
        WindowInsetsController insetsController = window.getInsetsController();
        new ep9();
        this.f = insetsController;
        this.g = yv9Var;
        this.h = window;
    }

    @Override // defpackage.x10
    public final void b(int i) {
        if ((i & 8) != 0) {
            this.g.a.a();
        }
        this.f.hide(i & (-9));
    }

    @Override // defpackage.x10
    public boolean c() {
        Window window = this.h;
        if (window == null) {
            this.f.setSystemBarsAppearance(0, 0);
            if ((this.f.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
        } else if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.x10
    public void g(boolean z) {
        j(16, z, 16);
    }

    @Override // defpackage.x10
    public void h(boolean z) {
        j(8192, z, 8);
    }

    public final void j(int i, boolean z, int i2) {
        Window window = this.h;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.f;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
