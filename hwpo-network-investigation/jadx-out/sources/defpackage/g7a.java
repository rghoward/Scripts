package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g7a extends p.g {
    public static final b Companion = new b();
    public final a e;
    public Rect f;
    public final Drawable g;
    public final int h;
    public final int i;
    public final GradientDrawable j;
    public int k;
    public final Paint l;
    public c m;
    public float n;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public interface a {
        void a(int i);

        void b(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class c {
        public static final c t;
        public static final c u;
        public static final /* synthetic */ c[] v;

        static {
            c cVar = new c("LEFT", 0);
            t = cVar;
            c cVar2 = new c("RIGHT", 1);
            u = cVar2;
            v = new c[]{cVar, cVar2};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) v.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public g7a(Context context, a aVar) {
        aVar.getClass();
        this.a = -1;
        this.d = 4;
        this.e = aVar;
        Drawable drawable = context.getDrawable(R.drawable.ic_delete);
        if (drawable == null) {
            z90.a("Drawable must not be null");
            throw null;
        }
        this.g = drawable;
        this.h = drawable.getIntrinsicWidth();
        this.i = drawable.getIntrinsicHeight();
        GradientDrawable gradientDrawable = new GradientDrawable();
        float dimension = context.getResources().getDimension(R.dimen.l_radius);
        gradientDrawable.setColor(context.getColor(R.color.labelError));
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, dimension, dimension, dimension, dimension, 0.0f, 0.0f});
        this.j = gradientDrawable;
        this.k = -1;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.l = paint;
    }

    @Override // androidx.recyclerview.widget.p.d
    public final void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f, float f2, int i, boolean z) {
        canvas.getClass();
        e0Var.getClass();
        View view = e0Var.a;
        view.getClass();
        int bottom = view.getBottom() - view.getTop();
        int i2 = this.i;
        int i3 = (bottom - i2) / 2;
        int top = view.getTop() + i3;
        int right = view.getRight() - i3;
        int i4 = this.h;
        int i5 = right - i4;
        int right2 = view.getRight() - i3;
        int i6 = i2 + top;
        this.n = (i3 * 2.0f) + i4;
        if (f == 0.0f && !z) {
            canvas.drawRect(view.getRight() + f, view.getTop(), view.getRight(), view.getBottom(), this.l);
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                view2.setOnTouchListener(null);
                g2b g2bVar = g2b.a;
            }
            super.e(canvas, recyclerView, e0Var, f, f2, i, false);
            return;
        }
        if (z) {
            this.m = f - 0.0f <= 0.0f ? c.t : c.u;
        }
        float f3 = f / 4.0f;
        Rect rect = new Rect((int) (view.getRight() + f3), view.getTop(), view.getRight(), view.getBottom());
        this.f = rect;
        GradientDrawable gradientDrawable = this.j;
        gradientDrawable.setBounds(rect);
        gradientDrawable.draw(canvas);
        Drawable drawable = this.g;
        drawable.setBounds(i5, top, right2, i6);
        drawable.draw(canvas);
        super.e(canvas, recyclerView, e0Var, uh8.f(f3, -this.n, 0.0f), f2, i, z);
        view.setElevation(view.getResources().getDimension(R.dimen.elevation_big_element));
    }

    public final float g(RecyclerView.e0 e0Var) {
        e0Var.getClass();
        c cVar = this.m;
        return (cVar == null ? -1 : d.a[cVar.ordinal()]) == 1 ? 0.9f : 0.1f;
    }
}
