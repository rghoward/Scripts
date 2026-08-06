package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w73 implements dva<Drawable> {
    public final dva<Bitmap> b;
    public final boolean c;

    public w73(dva<Bitmap> dvaVar, boolean z) {
        this.b = dvaVar;
        this.c = z;
    }

    @Override // defpackage.dva
    public final kt8<Drawable> a(Context context, kt8<Drawable> kt8Var, int i, int i2) {
        qq0 qq0Var = a.a(context).t;
        Drawable drawable = kt8Var.get();
        sq0 sq0VarA = v73.a(qq0Var, drawable, i, i2);
        if (sq0VarA == null) {
            if (!this.c) {
                return kt8Var;
            }
            x24.b(drawable, " to a Bitmap", "Unable to convert ");
            return null;
        }
        kt8<Bitmap> kt8VarA = this.b.a(context, sq0VarA, i, i2);
        if (!kt8VarA.equals(sq0VarA)) {
            return new us5(context.getResources(), kt8VarA);
        }
        kt8VarA.a();
        return kt8Var;
    }

    @Override // defpackage.ko5
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.ko5
    public final boolean equals(Object obj) {
        if (obj instanceof w73) {
            return this.b.equals(((w73) obj).b);
        }
        return false;
    }

    @Override // defpackage.ko5
    public final int hashCode() {
        return this.b.hashCode();
    }
}
