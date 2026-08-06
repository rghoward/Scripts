package defpackage;

import androidx.appcompat.widget.AppCompatImageButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ac3 implements oh4<Integer, g2b> {
    public final /* synthetic */ rb3 t;

    public ac3(rb3 rb3Var) {
        this.t = rb3Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Integer num) {
        Integer num2 = num;
        rb3.a aVar = rb3.Companion;
        AppCompatImageButton appCompatImageButton = this.t.r().b;
        appCompatImageButton.setVisibility(num2 != null ? 0 : 8);
        if (num2 != null) {
            appCompatImageButton.setImageResource(num2.intValue());
            g2b g2bVar = g2b.a;
        }
        return g2b.a;
    }
}
