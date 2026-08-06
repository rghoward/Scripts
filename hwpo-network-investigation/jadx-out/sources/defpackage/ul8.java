package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ul8<E> extends k95<E> {
    public static final ul8 x = new ul8(0, new Object[0]);
    public final transient Object[] v;
    public final transient int w;

    public ul8(int i, Object[] objArr) {
        this.v = objArr;
        this.w = i;
    }

    @Override // defpackage.k95, defpackage.b95
    public final int e(int i, Object[] objArr) {
        Object[] objArr2 = this.v;
        int i2 = this.w;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.b95
    public final Object[] f() {
        return this.v;
    }

    @Override // java.util.List
    public final E get(int i) {
        xl7.k(i, this.w);
        E e = (E) this.v[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // defpackage.b95
    public final int i() {
        return this.w;
    }

    @Override // defpackage.b95
    public final int j() {
        return 0;
    }

    @Override // defpackage.b95
    public final boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
