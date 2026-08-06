package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final class md5 {
    public final View a;
    public final ss5 b = hv5.c(j26.u, new a());
    public final yv9 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<InputMethodManager> {
        public a() {
            super(0);
        }

        @Override // defpackage.mh4
        public final InputMethodManager invoke() {
            Object systemService = md5.this.a.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    }

    public md5(View view) {
        this.a = view;
        this.c = new yv9(view);
    }

    public final void a(int i, int i2, int i3, int i4) {
        ((InputMethodManager) this.b.getValue()).updateSelection(this.a, i, i2, i3, i4);
    }
}
