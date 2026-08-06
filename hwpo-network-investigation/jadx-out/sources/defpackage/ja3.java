package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ja3 extends pa3 {
    @Override // defpackage.pa3
    public void b(w7a w7aVar, w7a w7aVar2, Window window, View view, boolean z, boolean z2) {
        x10 anbVar;
        w7aVar.getClass();
        w7aVar2.getClass();
        window.getClass();
        view.getClass();
        jmb.a(window, false);
        window.setStatusBarColor(z ? w7aVar.b : w7aVar.a);
        window.setNavigationBarColor(w7aVar2.b);
        yv9 yv9Var = new yv9(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            anbVar = new dnb(window, yv9Var);
        } else if (i >= 30) {
            anbVar = new bnb(window, yv9Var);
        } else {
            anbVar = i >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
        }
        anbVar.h(!z);
    }
}
