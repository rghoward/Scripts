package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.decode.ImageDecoderDecoder$wrapDrawable$2", f = "ImageDecoderDecoder.kt", l = {}, m = "invokeSuspend")
public final class s75 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ Drawable t;
    public final /* synthetic */ mh4<g2b> u;
    public final /* synthetic */ mh4<g2b> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s75(Drawable drawable, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, r02<? super s75> r02Var) {
        super(2, r02Var);
        this.t = drawable;
        this.u = mh4Var;
        this.v = mh4Var2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new s75(this.t, this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((s75) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        ((AnimatedImageDrawable) this.t).registerAnimationCallback(new h(this.u, this.v));
        return g2b.a;
    }
}
