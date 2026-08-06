package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o73 implements lu3 {
    public final Drawable a;
    public final zk7 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lu3.a<Drawable> {
        @Override // lu3.a
        public final lu3 a(Object obj, zk7 zk7Var) {
            return new o73((Drawable) obj, zk7Var);
        }
    }

    public o73(Drawable drawable, zk7 zk7Var) {
        this.a = drawable;
        this.b = zk7Var;
    }

    @Override // defpackage.lu3
    public final Object a(r02<? super ku3> r02Var) {
        Bitmap.Config[] configArr = v.a;
        Drawable bitmapDrawable = this.a;
        boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof wcb);
        if (z) {
            zk7 zk7Var = this.b;
            bitmapDrawable = new BitmapDrawable(zk7Var.a.getResources(), e83.a(bitmapDrawable, zk7Var.b, zk7Var.d, zk7Var.e, zk7Var.f));
        }
        return new u73(bitmapDrawable, z, jf2.u);
    }
}
