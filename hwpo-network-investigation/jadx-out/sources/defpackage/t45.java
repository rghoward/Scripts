package defpackage;

import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t45 implements kx6<wm4, InputStream> {
    public static final mk7<Integer> b = mk7.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final jx6<wm4, wm4> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements lx6<wm4, InputStream> {
        public final jx6<wm4, wm4> a = new jx6<>();

        @Override // defpackage.lx6
        public final kx6<wm4, InputStream> d(i07 i07Var) {
            return new t45(this.a);
        }
    }

    public t45(jx6<wm4, wm4> jx6Var) {
        this.a = jx6Var;
    }

    @Override // defpackage.kx6
    public final kx6.a<InputStream> a(wm4 wm4Var, int i, int i2, xk7 xk7Var) {
        wm4 wm4Var2 = wm4Var;
        jx6<wm4, wm4> jx6Var = this.a;
        if (jx6Var != null) {
            ix6 ix6Var = jx6Var.a;
            jx6.a aVarA = jx6.a.a(wm4Var2);
            Object objA = ix6Var.a(aVarA);
            ArrayDeque arrayDeque = jx6.a.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(aVarA);
            }
            wm4 wm4Var3 = (wm4) objA;
            if (wm4Var3 == null) {
                ix6Var.d(jx6.a.a(wm4Var2), wm4Var2);
            } else {
                wm4Var2 = wm4Var3;
            }
        }
        return new kx6.a<>(wm4Var2, new g55(wm4Var2, ((Integer) xk7Var.c(b)).intValue()));
    }

    @Override // defpackage.kx6
    public final /* bridge */ /* synthetic */ boolean b(wm4 wm4Var) {
        return true;
    }
}
