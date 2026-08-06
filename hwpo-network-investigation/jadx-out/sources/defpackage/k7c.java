package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k7c extends c5c {
    public static final k7c x = new k7c(0, new Object[0]);
    public final transient Object[] v;
    public final transient int w;

    public k7c(int i, Object[] objArr) {
        this.v = objArr;
        this.w = i;
    }

    @Override // defpackage.a0c
    public final Object[] d() {
        return this.v;
    }

    @Override // defpackage.a0c
    public final int e() {
        return 0;
    }

    @Override // defpackage.a0c
    public final int f() {
        return this.w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p1d.a(i, this.w);
        Object obj = this.v[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.c5c, defpackage.a0c
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.v;
        int i = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
