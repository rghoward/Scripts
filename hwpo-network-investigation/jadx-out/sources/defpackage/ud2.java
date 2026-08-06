package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ud2 extends kk6 {
    public static final /* synthetic */ int b0 = 0;
    public a a0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends ud2 {
        @Override // defpackage.kk6
        public final void d(Canvas canvas) {
            if (this.a0.q.isEmpty()) {
                super.d(canvas);
                return;
            }
            canvas.save();
            int i = Build.VERSION.SDK_INT;
            a aVar = this.a0;
            if (i >= 26) {
                canvas.clipOutRect(aVar.q);
            } else {
                canvas.clipRect(aVar.q, Region.Op.DIFFERENCE);
            }
            super.d(canvas);
            canvas.restore();
        }
    }

    @Override // defpackage.kk6, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a0 = new a(this.a0);
        return this;
    }

    public final void x(float f, float f2, float f3, float f4) {
        RectF rectF = this.a0.q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends kk6.c {
        public final RectF q;

        public a(a aVar) {
            super(aVar);
            this.q = aVar.q;
        }

        @Override // kk6.c, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.a0 = this;
            bVar.invalidateSelf();
            return bVar;
        }

        public a(ll9 ll9Var, RectF rectF) {
            super(ll9Var);
            this.q = rectF;
        }
    }
}
