package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a11 {
    public final jp8 a;
    public final qu8 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:24:0x002e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0038  */
        public static boolean a(jp8 jp8Var, qu8 qu8Var) {
            String strD;
            int i = qu8Var.w;
            if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
                if (i == 307) {
                    strD = qu8Var.y.d("Expires");
                    if (strD == null) {
                        strD = null;
                    }
                    if (strD == null && qu8Var.h().c == -1 && !qu8Var.h().f && !qu8Var.h().e) {
                        return false;
                    }
                } else if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS /* 300 */:
                        case 301:
                            break;
                        case 302:
                            strD = qu8Var.y.d("Expires");
                            if (strD == null) {
                                strD = null;
                            }
                            if (strD == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (qu8Var.h().b || jp8Var.a().b) ? false : true;
        }
    }

    public a11(jp8 jp8Var, qu8 qu8Var) {
        this.a = jp8Var;
        this.b = qu8Var;
    }
}
