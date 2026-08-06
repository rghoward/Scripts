package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface b85 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Context a;
        public at2 b = q.a;
        public uq1 c = null;
        public final c85 d = new c85();

        public a(Context context) {
            this.a = context.getApplicationContext();
        }

        public final void a() {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            at2 at2Var = this.b;
            this.b = new at2(at2Var.a, at2Var.b, at2Var.c, at2Var.d, at2Var.e, at2Var.f, config, at2Var.h, at2Var.i, at2Var.j, at2Var.k, at2Var.l, at2Var.m, at2Var.n, at2Var.o);
        }

        public final ti8 b() {
            at2 at2Var = this.b;
            int i = 1;
            o7a o7aVar = new o7a(new lj(i, this));
            o7a o7aVar2 = new o7a(new mj(i, this));
            o7a o7aVar3 = new o7a(new a85());
            uq1 uq1Var = this.c;
            if (uq1Var == null) {
                uq1Var = new uq1();
            }
            return new ti8(this.a, at2Var, o7aVar, o7aVar2, o7aVar3, uq1Var, this.d);
        }
    }

    z23 a(k85 k85Var);

    at2 b();

    Object c(k85 k85Var, u02 u02Var);
}
