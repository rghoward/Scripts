package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oz6 extends Drawable implements Animatable {
    public Canvas A;
    public Bitmap B;
    public float E;
    public float F;
    public boolean G;
    public long H;
    public long I;
    public Picture K;
    public boolean M;
    public final Movie t;
    public final Bitmap.Config u;
    public final s39 v;
    public final Paint w = new Paint(3);
    public final ArrayList x = new ArrayList();
    public final Rect y = new Rect();
    public final Rect z = new Rect();
    public float C = 1.0f;
    public float D = 1.0f;
    public int J = -1;
    public gz7 L = gz7.t;

    public oz6(Movie movie, Bitmap.Config config, s39 s39Var) {
        this.t = movie;
        this.u = config;
        this.v = s39Var;
        if (j.a(config)) {
            z90.a("Bitmap config must not be hardware.");
            throw null;
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = this.w;
        Canvas canvas2 = this.A;
        Bitmap bitmap = this.B;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.C;
            canvas2.scale(f, f);
            this.t.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.K;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.E, this.F);
                float f2 = this.D;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.y;
        if (xj5.a(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.t;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        s39 s39Var = this.v;
        double dG = eo7.g(iWidth2, iHeight2, iWidth, iHeight, s39Var);
        if (!this.M && dG > 1.0d) {
            dG = 1.0d;
        }
        float f = (float) dG;
        this.C = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.u);
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.B = bitmapCreateBitmap;
        this.A = new Canvas(bitmapCreateBitmap);
        if (this.M) {
            this.D = 1.0f;
            this.E = 0.0f;
            this.F = 0.0f;
        } else {
            float fG = (float) eo7.g(i, i2, iWidth, iHeight, s39Var);
            this.D = fG;
            this.E = ((iWidth - (i * fG)) / 2.0f) + rect.left;
            this.F = ((iHeight - (fG * i2)) / 2.0f) + rect.top;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Movie movie = this.t;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z = false;
        } else {
            if (this.G) {
                this.I = SystemClock.uptimeMillis();
            }
            int i = (int) (this.I - this.H);
            int i2 = i / iDuration;
            int i3 = this.J;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                iDuration = i - (i2 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.M) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.z;
            rect.set(0, 0, width, height);
            b(rect);
            int iSave = canvas.save();
            try {
                float f = 1.0f / this.C;
                canvas.scale(f, f);
                a(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.G && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.t.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.t.width();
    }

    @Override // android.graphics.drawable.Drawable
    @gy2
    public final int getOpacity() {
        if (this.w.getAlpha() != 255) {
            return -3;
        }
        gz7 gz7Var = this.L;
        if (gz7Var != gz7.v) {
            return (gz7Var == gz7.t && this.t.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            ca0.a(pp2.a(i, "Invalid alpha: "));
        } else {
            this.w.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.G) {
            return;
        }
        this.G = true;
        this.H = SystemClock.uptimeMillis();
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((tt) arrayList.get(i)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.G) {
            this.G = false;
            ArrayList arrayList = this.x;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((tt) arrayList.get(i)).a(this);
            }
        }
    }
}
