package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xya<T> implements m93<T> {
    public final int a;
    public final int b;
    public final aa3 c;

    public xya(int i, aa3 aa3Var, int i2) {
        this((i2 & 1) != 0 ? CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS : i, 0, (i2 & 4) != 0 ? ca3.a : aa3Var);
    }

    @Override // defpackage.wv
    public final edb a(cza czaVar) {
        return new qdb(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xya) {
            xya xyaVar = (xya) obj;
            if (xyaVar.a == this.a && xyaVar.b == this.b && xj5.a(xyaVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.m93, defpackage.wv
    public final idb a(cza czaVar) {
        return new qdb(this.a, this.b, this.c);
    }

    public xya(int i, int i2, aa3 aa3Var) {
        this.a = i;
        this.b = i2;
        this.c = aa3Var;
    }
}
