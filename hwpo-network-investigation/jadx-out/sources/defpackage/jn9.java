package defpackage;

import android.content.res.TypedArray;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jn9 {
    public final float[] a = new float[4];
    public final int[] b = new int[4];
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public long s;
    public long t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b<T extends b<T>> {
        public final jn9 a = new jn9();

        public final jn9 a() {
            jn9 jn9Var = this.a;
            int i = jn9Var.f;
            int[] iArr = jn9Var.b;
            if (i != 1) {
                int i2 = jn9Var.e;
                iArr[0] = i2;
                int i3 = jn9Var.d;
                iArr[1] = i3;
                iArr[2] = i3;
                iArr[3] = i2;
            } else {
                int i4 = jn9Var.d;
                iArr[0] = i4;
                iArr[1] = i4;
                int i5 = jn9Var.e;
                iArr[2] = i5;
                iArr[3] = i5;
            }
            float[] fArr = jn9Var.a;
            if (i != 1) {
                fArr[0] = Math.max(((1.0f - jn9Var.k) - jn9Var.l) / 2.0f, 0.0f);
                fArr[1] = Math.max(((1.0f - jn9Var.k) - 0.001f) / 2.0f, 0.0f);
                fArr[2] = Math.min(((jn9Var.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                fArr[3] = Math.min(((jn9Var.k + 1.0f) + jn9Var.l) / 2.0f, 1.0f);
                return jn9Var;
            }
            fArr[0] = 0.0f;
            fArr[1] = Math.min(jn9Var.k, 1.0f);
            fArr[2] = Math.min(jn9Var.k + jn9Var.l, 1.0f);
            fArr[3] = 1.0f;
            return jn9Var;
        }

        public T b(TypedArray typedArray) {
            boolean zHasValue = typedArray.hasValue(3);
            jn9 jn9Var = this.a;
            if (zHasValue) {
                jn9Var.n = typedArray.getBoolean(3, jn9Var.n);
            }
            if (typedArray.hasValue(0)) {
                jn9Var.o = typedArray.getBoolean(0, jn9Var.o);
            }
            if (typedArray.hasValue(1)) {
                jn9Var.e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (jn9Var.e & 16777215);
            }
            if (typedArray.hasValue(11)) {
                e(typedArray.getFloat(11, 1.0f));
            }
            if (typedArray.hasValue(7)) {
                d(typedArray.getInt(7, (int) jn9Var.s));
            }
            if (typedArray.hasValue(14)) {
                jn9Var.q = typedArray.getInt(14, jn9Var.q);
            }
            if (typedArray.hasValue(15)) {
                g(typedArray.getInt(15, (int) jn9Var.t));
            }
            if (typedArray.hasValue(16)) {
                jn9Var.r = typedArray.getInt(16, jn9Var.r);
            }
            if (typedArray.hasValue(5)) {
                int i = typedArray.getInt(5, jn9Var.c);
                if (i == 1) {
                    jn9Var.c = 1;
                } else if (i == 2) {
                    jn9Var.c = 2;
                } else if (i != 3) {
                    jn9Var.c = 0;
                } else {
                    jn9Var.c = 3;
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, jn9Var.f) != 1) {
                    jn9Var.f = 0;
                } else {
                    jn9Var.f = 1;
                }
            }
            if (typedArray.hasValue(6)) {
                float f = typedArray.getFloat(6, jn9Var.l);
                if (f < 0.0f) {
                    on5.a("Given invalid dropoff value: ", f);
                    return null;
                }
                jn9Var.l = f;
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, jn9Var.g);
                if (dimensionPixelSize < 0) {
                    z90.a(pp2.a(dimensionPixelSize, "Given invalid width: "));
                    return null;
                }
                jn9Var.g = dimensionPixelSize;
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, jn9Var.h);
                if (dimensionPixelSize2 < 0) {
                    z90.a(pp2.a(dimensionPixelSize2, "Given invalid height: "));
                    return null;
                }
                jn9Var.h = dimensionPixelSize2;
            }
            if (typedArray.hasValue(13)) {
                f(typedArray.getFloat(13, jn9Var.k));
            }
            if (typedArray.hasValue(19)) {
                float f2 = typedArray.getFloat(19, jn9Var.i);
                if (f2 < 0.0f) {
                    on5.a("Given invalid width ratio: ", f2);
                    return null;
                }
                jn9Var.i = f2;
            }
            if (typedArray.hasValue(10)) {
                float f3 = typedArray.getFloat(10, jn9Var.j);
                if (f3 < 0.0f) {
                    on5.a("Given invalid height ratio: ", f3);
                    return null;
                }
                jn9Var.j = f3;
            }
            if (typedArray.hasValue(18)) {
                jn9Var.m = typedArray.getFloat(18, jn9Var.m);
            }
            return (T) c();
        }

        public abstract T c();

        public final T d(long j) {
            if (j >= 0) {
                this.a.s = j;
                return (T) c();
            }
            z90.a(d43.b(j, "Given a negative duration: "));
            return null;
        }

        public final T e(float f) {
            int iMin = ((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24;
            jn9 jn9Var = this.a;
            jn9Var.d = iMin | (jn9Var.d & 16777215);
            return (T) c();
        }

        public final T f(float f) {
            if (f >= 0.0f) {
                this.a.k = f;
                return (T) c();
            }
            on5.a("Given invalid intensity value: ", f);
            return null;
        }

        public final T g(long j) {
            if (j >= 0) {
                this.a.t = j;
                return (T) c();
            }
            z90.a(d43.b(j, "Given a negative repeat delay: "));
            return null;
        }
    }

    public jn9() {
        new RectF();
        this.c = 0;
        this.d = -1;
        this.e = 1291845631;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 1.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 20.0f;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = -1;
        this.r = 1;
        this.s = 1000L;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends b<a> {
        public a() {
            this.a.p = true;
        }

        @Override // jn9.b
        public final b c() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends b<c> {
        @Override // jn9.b
        public final b b(TypedArray typedArray) {
            super.b(typedArray);
            boolean zHasValue = typedArray.hasValue(2);
            jn9 jn9Var = this.a;
            if (zHasValue) {
                jn9Var.e = (typedArray.getColor(2, jn9Var.e) & 16777215) | (jn9Var.e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                jn9Var.d = typedArray.getColor(12, jn9Var.d);
            }
            return this;
        }

        @Override // jn9.b
        public final b c() {
            return this;
        }
    }
}
