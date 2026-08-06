package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fq0 implements st8<BitmapDrawable> {
    public final qq0 a;
    public final hq0 b;

    public fq0(qq0 qq0Var, hq0 hq0Var) {
        this.a = qq0Var;
        this.b = hq0Var;
    }

    @Override // defpackage.st8
    public final uf3 a(xk7 xk7Var) {
        return uf3.u;
    }

    @Override // defpackage.xf3
    public final boolean b(Object obj, File file, xk7 xk7Var) {
        return this.b.b(new sq0(this.a, ((BitmapDrawable) ((kt8) obj).get()).getBitmap()), file, xk7Var);
    }
}
