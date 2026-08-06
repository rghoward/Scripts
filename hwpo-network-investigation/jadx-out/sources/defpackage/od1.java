package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface od1 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements TypeEvaluator<d> {
        public static final a b = new a();
        public final d a = new d();

        @Override // android.animation.TypeEvaluator
        public final d evaluate(float f, d dVar, d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            float f2 = dVar3.a;
            float f3 = 1.0f - f;
            float f4 = (dVar4.a * f) + (f2 * f3);
            float f5 = dVar3.b;
            float f6 = (dVar4.b * f) + (f5 * f3);
            float f7 = dVar3.c;
            float f8 = f * dVar4.c;
            d dVar5 = this.a;
            dVar5.a = f4;
            dVar5.b = f6;
            dVar5.c = f8 + (f3 * f7);
            return dVar5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends Property<od1, d> {
        public static final b a = new b(d.class, "circularReveal");

        @Override // android.util.Property
        public final d get(od1 od1Var) {
            return od1Var.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(od1 od1Var, d dVar) {
            od1Var.setRevealInfo(dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends Property<od1, Integer> {
        public static final c a = new c(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        public final Integer get(od1 od1Var) {
            return Integer.valueOf(od1Var.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(od1 od1Var, Integer num) {
            od1Var.setCircularRevealScrimColor(num.intValue());
        }
    }

    void b();

    void c();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(d dVar);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d {
        public float a;
        public float b;
        public float c;

        public d(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public d() {
        }
    }
}
