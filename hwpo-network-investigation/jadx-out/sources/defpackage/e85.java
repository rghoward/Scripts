package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class e85 {
    public static final void b(ImageView imageView, String str, int i, boolean z) {
        imageView.getClass();
        oq8 oq8VarI = new oq8().i(i);
        if (z) {
            oq8VarI.getClass();
            oq8VarI = (oq8) oq8VarI.p(q43.c, new z51());
        }
        oq8VarI.getClass();
        l73 l73Var = new l73(true);
        lq8 lq8VarC = a.c(imageView.getContext());
        lq8VarC.getClass();
        rp8 rp8VarD = new rp8(lq8VarC.t, lq8VarC, Drawable.class, lq8VarC.u).z(str).d(k13.c);
        x73 x73Var = new x73();
        x73Var.t = l73Var;
        rp8 rp8VarU = rp8VarD.A(x73Var).a(oq8VarI);
        rp8VarU.getClass();
        rp8VarU.y(imageView);
    }

    public Activity a() {
        throw null;
    }
}
