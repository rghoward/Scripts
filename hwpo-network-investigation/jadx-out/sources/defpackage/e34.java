package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.g;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e34 implements hh4 {
    public final Set<Activity> a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    @Override // defpackage.hh4
    public final void a(g gVar) {
        if (!this.b && this.a.add(gVar)) {
            View decorView = gVar.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new d34(this, decorView));
        }
    }
}
