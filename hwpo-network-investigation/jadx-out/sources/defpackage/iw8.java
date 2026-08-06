package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iw8 implements l43, CheckableImageButton.b {
    public final /* synthetic */ Object t;

    public /* synthetic */ iw8(Object obj) {
        this.t = obj;
    }

    @Override // com.google.android.material.internal.CheckableImageButton.b
    public void a() {
        jz9 jz9Var = (jz9) this.t;
        CheckableImageButton checkableImageButton = jz9Var.w;
        i65.e(checkableImageButton, jz9Var.B, checkableImageButton.getContentDescription());
    }

    @Override // defpackage.l43
    public double c(double d) {
        zua zuaVar = (zua) this.t;
        double d2 = zuaVar.b;
        double d3 = zuaVar.c;
        double d4 = zuaVar.d;
        return d >= zuaVar.e ? Math.pow((d2 * d) + d3, zuaVar.a) + zuaVar.f : (d4 * d) + zuaVar.g;
    }
}
