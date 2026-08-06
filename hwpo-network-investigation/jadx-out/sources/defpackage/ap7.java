package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {647, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS, 306, 669, 691, 333, 713, 735, 361}, m = "doInitialLoad", v = 1)
public final class ap7 extends u02 {
    public Object t;
    public Object u;
    public a47 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ uo7<Object, Object> x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap7(uo7 uo7Var, u02 u02Var) {
        super(u02Var);
        this.x = uo7Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.f(this);
    }
}
