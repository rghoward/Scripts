package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class am4 implements dva<xl4> {
    public final dva<Bitmap> b;

    public am4(dva<Bitmap> dvaVar) {
        ov9.d(dvaVar, "Argument must not be null");
        this.b = dvaVar;
    }

    @Override // defpackage.dva
    public final kt8<xl4> a(Context context, kt8<xl4> kt8Var, int i, int i2) {
        xl4 xl4Var = kt8Var.get();
        sq0 sq0Var = new sq0(a.a(context).t, xl4Var.t.a.l);
        dva<Bitmap> dvaVar = this.b;
        kt8<Bitmap> kt8VarA = dvaVar.a(context, sq0Var, i, i2);
        if (sq0Var != kt8VarA) {
            sq0Var.a();
        }
        xl4Var.t.a.c(dvaVar, kt8VarA.get());
        return kt8Var;
    }

    @Override // defpackage.ko5
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.ko5
    public final boolean equals(Object obj) {
        if (obj instanceof am4) {
            return this.b.equals(((am4) obj).b);
        }
        return false;
    }

    @Override // defpackage.ko5
    public final int hashCode() {
        return this.b.hashCode();
    }
}
