package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pq8 {
    public final ti8 a;
    public final x7a b;
    public final ut4 c;

    public pq8(ti8 ti8Var, x7a x7aVar) {
        ut4 g95Var;
        this.a = ti8Var;
        this.b = x7aVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (!k.a) {
                g95Var = (i == 26 || i == 27) ? new b86() : new g95(true);
            }
            this.c = g95Var;
        }
        boolean z = k.a;
        g95Var = new g95(false);
        this.c = g95Var;
    }

    public static dm3 a(k85 k85Var, Throwable th) {
        Drawable drawableB;
        if (th instanceof qd7) {
            k85Var.getClass();
            at2 at2Var = k85Var.G;
            drawableB = at2Var.l;
            at2 at2Var2 = q.a;
            if (drawableB == null) {
                drawableB = q.b(k85Var, k85Var.E, k85Var.D, at2Var.k);
            }
        } else {
            drawableB = q.b(k85Var, k85Var.E, k85Var.D, k85Var.G.k);
        }
        return new dm3(drawableB, k85Var, th);
    }

    public static boolean b(k85 k85Var, Bitmap.Config config) {
        if (!b.b(config)) {
            return true;
        }
        if (!k85Var.n) {
            return false;
        }
        k9a k9aVar = k85Var.c;
        if (!(k9aVar instanceof pib)) {
            return true;
        }
        View viewA = ((pib) k9aVar).a();
        return !viewA.isAttachedToWindow() || viewA.isHardwareAccelerated();
    }

    public final zk7 c(k85 k85Var, br9 br9Var) {
        List<eva> list = k85Var.i;
        Bitmap.Config config = k85Var.g;
        if ((!list.isEmpty() && !u30.t(config, v.a)) || (b.b(config) && (!b(k85Var, config) || !this.c.a(br9Var)))) {
            config = Bitmap.Config.ARGB_8888;
        }
        s03 s03Var = br9Var.a;
        s03.b bVar = s03.b.a;
        return new zk7(k85Var.a, config, null, br9Var, (xj5.a(s03Var, bVar) || xj5.a(br9Var.b, bVar)) ? s39.u : k85Var.z, q.a(k85Var), k85Var.o && list.isEmpty() && config != Bitmap.Config.ALPHA_8, k85Var.p, k85Var.f, k85Var.k, k85Var.l, k85Var.A, k85Var.q, k85Var.r, k85Var.s);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    public final zk7 d(zk7 zk7Var) {
        boolean z;
        boolean z2;
        Bitmap.Config config = zk7Var.b;
        v01 v01Var = zk7Var.o;
        boolean z3 = true;
        if (!b.b(config) || this.c.b()) {
            z = false;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z = true;
        }
        Bitmap.Config config2 = config;
        if (zk7Var.o.t) {
            x7a x7aVar = this.b;
            synchronized (x7aVar) {
                x7aVar.a();
                z2 = x7aVar.x;
            }
            if (z2) {
                z3 = z;
            } else {
                v01Var = v01.DISABLED;
            }
        } else {
            z3 = z;
        }
        return z3 ? new zk7(zk7Var.a, config2, zk7Var.c, zk7Var.d, zk7Var.e, zk7Var.f, zk7Var.g, zk7Var.h, zk7Var.i, zk7Var.j, zk7Var.k, zk7Var.l, zk7Var.m, zk7Var.n, v01Var) : zk7Var;
    }
}
