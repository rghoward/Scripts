package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.f;
import androidx.fragment.app.l;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yf4 extends l.m {
    public final /* synthetic */ f a;
    public final /* synthetic */ FrameLayout b;

    public yf4(xf4 xf4Var, f fVar, FrameLayout frameLayout) {
        this.a = fVar;
        this.b = frameLayout;
    }

    @Override // androidx.fragment.app.l.m
    public final void c(l lVar, f fVar, View view) {
        if (fVar == this.a) {
            lVar.l0(this);
            xf4.u(view, this.b);
        }
    }
}
