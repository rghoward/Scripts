package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ma3 extends la3 {
    @Override // defpackage.ka3, defpackage.pa3
    public void b(w7a w7aVar, w7a w7aVar2, Window window, View view, boolean z, boolean z2) {
        x10 anbVar;
        w7aVar.getClass();
        w7aVar2.getClass();
        window.getClass();
        view.getClass();
        jmb.a(window, false);
        window.setStatusBarColor(w7aVar.a(z));
        window.setNavigationBarColor(w7aVar2.a(z2));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(w7aVar2.c == 0);
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
        anbVar.g(!z2);
    }
}
