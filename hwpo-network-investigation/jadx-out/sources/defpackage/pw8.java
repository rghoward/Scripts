package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pw8<T> extends m1<T> implements RandomAccess {
    public final Object[] t;
    public final int u;
    public int v;
    public int w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends k1<T> {
        public int v;
        public int w;
        public final /* synthetic */ pw8<T> x;

        public a(pw8<T> pw8Var) {
            this.x = pw8Var;
            this.v = pw8Var.w;
            this.w = pw8Var.v;
        }

        @Override // defpackage.k1
        public final void a() {
            int i = this.v;
            if (i == 0) {
                this.t = 2;
                return;
            }
            pw8<T> pw8Var = this.x;
            Object[] objArr = pw8Var.t;
            int i2 = this.w;
            this.u = (T) objArr[i2];
            this.t = 1;
            this.w = (i2 + 1) % pw8Var.u;
            this.v = i - 1;
        }
    }

    public pw8(int i, Object[] objArr) {
        this.t = objArr;
        if (i < 0) {
            ca0.a(pp2.a(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.u = objArr.length;
            this.w = i;
        } else {
            rx0.a(objArr.length, t43.b(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    @Override // defpackage.s0
    public final int d() {
        return this.w;
    }

    public final void e(int i) {
        if (i < 0) {
            ca0.a(pp2.a(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.w) {
            rx0.a(this.w, t43.b(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.v;
            int i3 = this.u;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.t;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.v = i4;
            this.w -= i;
        }
    }

    @Override // java.util.List
    public final T get(int i) {
        int i2 = this.w;
        if (i < 0 || i >= i2) {
            r.b(u.a(i, i2, "index: ", ", size: "));
            return null;
        }
        return (T) this.t[(this.v + i) % this.u];
    }

    @Override // defpackage.m1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    @Override // defpackage.s0, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr;
        tArr.getClass();
        int length = tArr.length;
        int i = this.w;
        if (length < i) {
            tArr = (T[]) Arrays.copyOf(tArr, i);
        }
        int i2 = this.w;
        int i3 = this.v;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.t;
            if (i5 >= i2 || i3 >= this.u) {
                break;
            }
            tArr[i5] = objArr[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            tArr[i5] = objArr[i4];
            i5++;
            i4++;
        }
        if (i2 < tArr.length) {
            tArr[i2] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s0, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[d()]);
    }
}
