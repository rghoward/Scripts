package defpackage;

import io.intercom.android.sdk.models.carousel.Carousel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.data.repository.TrackingValuesRepositoryImpl", f = "TrackingValuesRepositoryImpl.kt", l = {Carousel.ENTITY_TYPE}, m = "getStoredValue", v = 2)
public final class jua extends u02 {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ tta v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jua(tta ttaVar, u02 u02Var) {
        super(u02Var);
        this.v = ttaVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.d(0, this);
    }
}
