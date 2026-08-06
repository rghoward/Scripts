package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {385, 386, 388, 389, 396, CarouselScreenFragment.CAROUSEL_ANIMATION_MS}, m = "readDataOrHandleCorruption", v = 1)
public final class jg2 extends u02 {
    public int A;
    public boolean t;
    public Object u;
    public gl8 v;
    public Serializable w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ xf2<Object> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg2(xf2 xf2Var, u02 u02Var) {
        super(u02Var);
        this.z = xf2Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return xf2.g(this.z, false, this);
    }
}
