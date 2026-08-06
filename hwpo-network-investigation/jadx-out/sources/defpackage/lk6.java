package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lk6 implements jac {
    public static final /* synthetic */ lk6 t = new lk6();

    public static f41 b(int i) {
        if (i != 0) {
            return i != 1 ? new by8() : new td2();
        }
        return new by8();
    }

    public static void c(ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof kk6) {
            ((kk6) background).o(f);
        }
    }

    public static void d(View view, kk6 kk6Var) {
        ee3 ee3Var = kk6Var.u.b;
        if (ee3Var == null || !ee3Var.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        kk6.c cVar = kk6Var.u;
        if (cVar.l != elevation) {
            cVar.l = elevation;
            kk6Var.w();
        }
    }

    public static void e(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof kk6) {
            d(viewGroup, (kk6) background);
        }
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(l6c.u.get().a());
    }
}
