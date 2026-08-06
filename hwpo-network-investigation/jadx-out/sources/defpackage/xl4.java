package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xl4 extends Drawable implements cm4.b, Animatable {
    public boolean A;
    public Paint B;
    public Rect C;
    public final a t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public final int z;

    public xl4() {
        throw null;
    }

    public xl4(a aVar) {
        this.x = true;
        this.z = -1;
        this.t = aVar;
    }

    @Override // cm4.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        cm4 cm4Var = this.t.a;
        cm4.a aVar = cm4Var.i;
        if ((aVar != null ? aVar.x : -1) == cm4Var.a.l.c - 1) {
            this.y++;
        }
        int i = this.z;
        if (i == -1 || this.y < i) {
            return;
        }
        stop();
    }

    public final void b() {
        ov9.b("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.w);
        cm4 cm4Var = this.t.a;
        if (cm4Var.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.u) {
            return;
        }
        this.u = true;
        ArrayList arrayList = cm4Var.c;
        if (cm4Var.j) {
            aa0.c("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            aa0.c("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !cm4Var.f) {
            cm4Var.f = true;
            cm4Var.j = false;
            cm4Var.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.w) {
            return;
        }
        if (this.A) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.C == null) {
                this.C = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.C);
            this.A = false;
        }
        cm4 cm4Var = this.t.a;
        cm4.a aVar = cm4Var.i;
        Bitmap bitmap = aVar != null ? aVar.z : cm4Var.l;
        if (this.C == null) {
            this.C = new Rect();
        }
        Rect rect = this.C;
        if (this.B == null) {
            this.B = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.B);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.t.a.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.t.a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.B == null) {
            this.B = new Paint(2);
        }
        this.B.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.B == null) {
            this.B = new Paint(2);
        }
        this.B.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        ov9.b("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.w);
        this.x = z;
        if (!z) {
            this.u = false;
            cm4 cm4Var = this.t.a;
            ArrayList arrayList = cm4Var.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                cm4Var.f = false;
            }
        } else if (this.v) {
            b();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.v = true;
        this.y = 0;
        if (this.x) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.v = false;
        this.u = false;
        cm4 cm4Var = this.t.a;
        ArrayList arrayList = cm4Var.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            cm4Var.f = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends Drawable.ConstantState {
        public final cm4 a;

        public a(cm4 cm4Var) {
            this.a = cm4Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new xl4(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new xl4(this);
        }
    }
}
