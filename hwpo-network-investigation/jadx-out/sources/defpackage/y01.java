package defpackage;

import android.graphics.Bitmap;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y01 {
    public final ss5 a;
    public final ss5 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final nu4 f;

    public y01(ni8 ni8Var) throws EOFException {
        w01 w01Var = new w01(0, this);
        j26 j26Var = j26.u;
        this.a = hv5.c(j26Var, w01Var);
        this.b = hv5.c(j26Var, new x01(0, this));
        this.c = Long.parseLong(ni8Var.I(Long.MAX_VALUE));
        this.d = Long.parseLong(ni8Var.I(Long.MAX_VALUE));
        this.e = Integer.parseInt(ni8Var.I(Long.MAX_VALUE)) > 0;
        int i = Integer.parseInt(ni8Var.I(Long.MAX_VALUE));
        nu4.a aVar = new nu4.a();
        for (int i2 = 0; i2 < i; i2++) {
            String strI = ni8Var.I(Long.MAX_VALUE);
            Bitmap.Config[] configArr = v.a;
            int iT = z2a.t(strI, ':', 0, 6);
            if (iT == -1) {
                ca0.a("Unexpected header: ".concat(strI));
                throw null;
            }
            aVar.c(z2a.R(strI.substring(0, iT)).toString(), strI.substring(iT + 1));
        }
        this.f = aVar.d();
    }

    public final void a(mi8 mi8Var) {
        mi8Var.o0(this.c);
        mi8Var.writeByte(10);
        mi8Var.o0(this.d);
        mi8Var.writeByte(10);
        mi8Var.o0(this.e ? 1L : 0L);
        mi8Var.writeByte(10);
        nu4 nu4Var = this.f;
        mi8Var.o0(nu4Var.size());
        mi8Var.writeByte(10);
        int size = nu4Var.size();
        for (int i = 0; i < size; i++) {
            mi8Var.R(nu4Var.e(i));
            mi8Var.R(": ");
            mi8Var.R(nu4Var.j(i));
            mi8Var.writeByte(10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y01(qu8 qu8Var) {
        w01 w01Var = new w01(0, this);
        j26 j26Var = j26.u;
        this.a = hv5.c(j26Var, w01Var);
        this.b = hv5.c(j26Var, new x01(0 == true ? 1 : 0, this));
        this.c = qu8Var.E;
        this.d = qu8Var.F;
        this.e = qu8Var.x != null;
        this.f = qu8Var.y;
    }
}
