package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yd5 extends pmb.b {
    public final View v;
    public int w;
    public int x;
    public final int[] y;

    public yd5(View view) {
        super(0);
        this.y = new int[2];
        this.v = view;
    }

    @Override // pmb.b
    public final void a(pmb pmbVar) {
        this.v.setTranslationY(0.0f);
    }

    @Override // pmb.b
    public final void c(pmb pmbVar) {
        View view = this.v;
        int[] iArr = this.y;
        view.getLocationOnScreen(iArr);
        this.w = iArr[1];
    }

    @Override // pmb.b
    public final umb d(umb umbVar, List<pmb> list) {
        for (pmb pmbVar : list) {
            if ((pmbVar.a.d() & 8) != 0) {
                this.v.setTranslationY(aw.c(this.x, pmbVar.a.c(), 0));
                break;
            }
        }
        return umbVar;
    }

    @Override // pmb.b
    public final pmb.a e(pmb pmbVar, pmb.a aVar) {
        View view = this.v;
        int[] iArr = this.y;
        view.getLocationOnScreen(iArr);
        int i = this.w - iArr[1];
        this.x = i;
        view.setTranslationY(i);
        return aVar;
    }
}
