package defpackage;

import oe7.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oe7<T extends a> {
    public static int g;
    public int a;
    public int b;
    public Object[] c;
    public int d;
    public T e;
    public float f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {
        public int a = -1;

        public abstract a a();
    }

    public oe7() {
        throw null;
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (wrap java.lang.Class:0x0000: CONST_CLASS  A[WRAPPED] (LINE:1) oe7.class) */
    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized oe7 a(int i, a aVar) {
        oe7 oe7Var;
        synchronized (oe7.class) {
            oe7Var = new oe7();
            if (i <= 0) {
                throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
            }
            oe7Var.b = i;
            oe7Var.c = new Object[i];
            oe7Var.d = 0;
            oe7Var.e = aVar;
            oe7Var.f = 1.0f;
            oe7Var.d();
            int i2 = g;
            oe7Var.a = i2;
            g = i2 + 1;
        }
        return oe7Var;
    }

    public final synchronized T b() {
        T t;
        try {
            if (this.d == -1 && this.f > 0.0f) {
                d();
            }
            Object[] objArr = this.c;
            int i = this.d;
            t = (T) objArr[i];
            t.a = -1;
            this.d = i - 1;
        } catch (Throwable th) {
            throw th;
        }
        return t;
    }

    public final synchronized void c(T t) {
        try {
            int i = t.a;
            if (i != -1) {
                if (i == this.a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.c.length) {
                int i3 = this.b;
                int i4 = i3 * 2;
                this.b = i4;
                Object[] objArr = new Object[i4];
                for (int i5 = 0; i5 < i3; i5++) {
                    objArr[i5] = this.c[i5];
                }
                this.c = objArr;
            }
            t.a = this.a;
            this.c[this.d] = t;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        float f = this.f;
        int i = this.b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c[i3] = this.e.a();
        }
        this.d = i - 1;
    }
}
