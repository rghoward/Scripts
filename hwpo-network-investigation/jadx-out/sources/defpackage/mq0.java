package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mq0 implements lu3 {
    public final Bitmap a;
    public final zk7 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lu3.a<Bitmap> {
        @Override // lu3.a
        public final lu3 a(Object obj, zk7 zk7Var) {
            return new mq0((Bitmap) obj, zk7Var);
        }
    }

    public mq0(Bitmap bitmap, zk7 zk7Var) {
        this.a = bitmap;
        this.b = zk7Var;
    }

    @Override // defpackage.lu3
    public final Object a(r02<? super ku3> r02Var) {
        return new u73(new BitmapDrawable(this.b.a.getResources(), this.a), false, jf2.u);
    }
}
