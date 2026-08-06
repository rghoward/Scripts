package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wx4 extends MaterialCardView implements bk4 {
    public ggb H;
    public final boolean I;

    public wx4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode() || this.I) {
            return;
        }
        this.I = true;
        ((qv7) a()).getClass();
    }

    @Override // defpackage.ak4
    public final Object a() {
        if (this.H == null) {
            this.H = new ggb(this);
        }
        return this.H.a();
    }
}
