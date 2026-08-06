package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eq0<DataType> implements pt8<DataType, BitmapDrawable> {
    public final pt8<DataType, Bitmap> a;
    public final Resources b;

    public eq0(Resources resources, pt8<DataType, Bitmap> pt8Var) {
        this.b = resources;
        this.a = pt8Var;
    }

    @Override // defpackage.pt8
    public final kt8<BitmapDrawable> a(DataType datatype, int i, int i2, xk7 xk7Var) {
        kt8<Bitmap> kt8VarA = this.a.a(datatype, i, i2, xk7Var);
        if (kt8VarA == null) {
            return null;
        }
        return new us5(this.b, kt8VarA);
    }

    @Override // defpackage.pt8
    public final boolean b(DataType datatype, xk7 xk7Var) {
        return this.a.b(datatype, xk7Var);
    }
}
