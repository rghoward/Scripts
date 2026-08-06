package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xxa<E> extends n1<E> {
    public int v;
    public Object[] w;
    public boolean x;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public xxa(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.v = i3;
        Object[] objArr2 = new Object[i3];
        this.w = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.x = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final E a() {
        int i = this.t & 31;
        Object obj = this.w[this.v - 1];
        obj.getClass();
        return (E) ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.v - i2) * 5;
        while (i2 < this.v) {
            Object[] objArr = this.w;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[t2.c(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (t2.c(this.t, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.t, ((this.v - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            vl.b();
            return null;
        }
        E eA = a();
        int i = this.t + 1;
        this.t = i;
        if (i == this.u) {
            this.x = true;
            return eA;
        }
        c(0);
        return eA;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            vl.b();
            return null;
        }
        this.t--;
        if (this.x) {
            this.x = false;
            return a();
        }
        c(31);
        return a();
    }
}
