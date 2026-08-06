package io.intercom.android.sdk.m5.navigation;

import defpackage.h62;
import defpackage.jo3;
import defpackage.oh4;
import defpackage.pu;
import defpackage.qu;
import defpackage.r47;
import defpackage.ru;
import defpackage.th3;
import defpackage.ti5;
import defpackage.xv;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomTransitionsKt {
    private static final oh4<ru<r47>, th3> slideUpEnterTransition = new h62(1);
    private static final oh4<ru<r47>, jo3> slideDownExitTransition = new ti5();

    public static final oh4<ru<r47>, jo3> getSlideDownExitTransition() {
        return slideDownExitTransition;
    }

    public static final oh4<ru<r47>, th3> getSlideUpEnterTransition() {
        return slideUpEnterTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jo3 slideDownExitTransition$lambda$1(ru ruVar) {
        ruVar.getClass();
        return ruVar.b(xv.c(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS, 0, null, 6), qu.u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final th3 slideUpEnterTransition$lambda$0(ru ruVar) {
        ruVar.getClass();
        return ruVar.e(xv.c(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS, 0, null, 6), pu.u);
    }
}
