package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nx7<T> extends n1<T> {
    public final lx7<T> v;
    public int w;
    public xxa<? extends T> x;
    public int y;

    public nx7(lx7<T> lx7Var, int i) {
        super(i, lx7Var.A);
        this.v = lx7Var;
        this.w = lx7Var.j();
        this.y = -1;
        b();
    }

    public final void a() {
        if (this.w == this.v.j()) {
            return;
        }
        yk.b();
    }

    @Override // defpackage.n1, java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.t;
        lx7<T> lx7Var = this.v;
        lx7Var.add(i, t);
        this.t++;
        this.u = lx7Var.d();
        this.w = lx7Var.j();
        this.y = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        lx7<T> lx7Var = this.v;
        Object[] objArr = lx7Var.y;
        if (objArr == null) {
            this.x = null;
            return;
        }
        int i = (lx7Var.A - 1) & (-32);
        int i2 = this.t;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (lx7Var.w / 5) + 1;
        xxa<? extends T> xxaVar = this.x;
        if (xxaVar == null) {
            this.x = new xxa<>(objArr, i2, i, i3);
            return;
        }
        xxaVar.t = i2;
        xxaVar.u = i;
        xxaVar.v = i3;
        if (xxaVar.w.length < i3) {
            xxaVar.w = new Object[i3];
        }
        xxaVar.w[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        xxaVar.x = r0;
        xxaVar.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        if (!hasNext()) {
            vl.b();
            return null;
        }
        int i = this.t;
        this.y = i;
        xxa<? extends T> xxaVar = this.x;
        lx7<T> lx7Var = this.v;
        if (xxaVar == null) {
            Object[] objArr = lx7Var.z;
            this.t = i + 1;
            return (T) objArr[i];
        }
        if (xxaVar.hasNext()) {
            this.t++;
            return xxaVar.next();
        }
        Object[] objArr2 = lx7Var.z;
        int i2 = this.t;
        this.t = i2 + 1;
        return (T) objArr2[i2 - xxaVar.u];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        if (!hasPrevious()) {
            vl.b();
            return null;
        }
        int i = this.t;
        this.y = i - 1;
        xxa<? extends T> xxaVar = this.x;
        lx7<T> lx7Var = this.v;
        if (xxaVar == null) {
            Object[] objArr = lx7Var.z;
            int i2 = i - 1;
            this.t = i2;
            return (T) objArr[i2];
        }
        int i3 = xxaVar.u;
        if (i <= i3) {
            this.t = i - 1;
            return xxaVar.previous();
        }
        Object[] objArr2 = lx7Var.z;
        int i4 = i - 1;
        this.t = i4;
        return (T) objArr2[i4 - i3];
    }

    @Override // defpackage.n1, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.y;
        if (i == -1) {
            d43.c();
            return;
        }
        lx7<T> lx7Var = this.v;
        lx7Var.e(i);
        int i2 = this.y;
        if (i2 < this.t) {
            this.t = i2;
        }
        this.u = lx7Var.d();
        this.w = lx7Var.j();
        this.y = -1;
        b();
    }

    @Override // defpackage.n1, java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.y;
        if (i == -1) {
            d43.c();
            return;
        }
        lx7<T> lx7Var = this.v;
        lx7Var.set(i, t);
        this.w = lx7Var.j();
        b();
    }
}
