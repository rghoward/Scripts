package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class us5 implements kt8<BitmapDrawable>, fc5 {
    public final Resources t;
    public final kt8<Bitmap> u;

    public us5(Resources resources, kt8<Bitmap> kt8Var) {
        ov9.d(resources, "Argument must not be null");
        this.t = resources;
        ov9.d(kt8Var, "Argument must not be null");
        this.u = kt8Var;
    }

    @Override // defpackage.kt8
    public final void a() {
        this.u.a();
    }

    @Override // defpackage.fc5
    public final void b() {
        kt8<Bitmap> kt8Var = this.u;
        if (kt8Var instanceof fc5) {
            ((fc5) kt8Var).b();
        }
    }

    @Override // defpackage.kt8
    public final Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.kt8
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.t, this.u.get());
    }

    @Override // defpackage.kt8
    public final int getSize() {
        return this.u.getSize();
    }
}
