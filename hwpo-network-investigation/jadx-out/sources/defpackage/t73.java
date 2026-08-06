package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t73<T extends Drawable> implements kt8<T>, fc5 {
    public final T t;

    public t73(T t) {
        ov9.d(t, "Argument must not be null");
        this.t = t;
    }

    @Override // defpackage.fc5
    public void b() {
        T t = this.t;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof xl4) {
            ((xl4) t).t.a.l.prepareToDraw();
        }
    }

    @Override // defpackage.kt8
    public final Object get() {
        T t = this.t;
        Drawable.ConstantState constantState = t.getConstantState();
        return constantState == null ? t : constantState.newDrawable();
    }
}
