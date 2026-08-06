package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class tw7<K, V, T> extends rw7<K, V, T> {
    public final sw7<K, V> w;
    public K x;
    public boolean y;
    public int z;

    public tw7(sw7<K, V> sw7Var, zxa<K, V, T>[] zxaVarArr) {
        super(sw7Var.u, zxaVarArr);
        this.w = sw7Var;
        this.z = sw7Var.w;
    }

    public final void c(int i, yxa<?, ?> yxaVar, K k, int i2) {
        int i3 = i2 * 5;
        zxa<K, V, T>[] zxaVarArr = this.t;
        if (i3 <= 30) {
            int iG = 1 << hu1.g(i, i3);
            if (yxaVar.h(iG)) {
                zxaVarArr[i2].a(Integer.bitCount(yxaVar.a) * 2, yxaVar.f(iG), yxaVar.d);
                this.u = i2;
                return;
            }
            int iT = yxaVar.t(iG);
            yxa<?, ?> yxaVarS = yxaVar.s(iT);
            zxaVarArr[i2].a(Integer.bitCount(yxaVar.a) * 2, iT, yxaVar.d);
            c(i, yxaVarS, k, i2 + 1);
            return;
        }
        zxa<K, V, T> zxaVar = zxaVarArr[i2];
        Object[] objArr = yxaVar.d;
        zxaVar.a(objArr.length, 0, objArr);
        while (true) {
            zxa<K, V, T> zxaVar2 = zxaVarArr[i2];
            if (xj5.a(zxaVar2.t[zxaVar2.v], k)) {
                this.u = i2;
                return;
            } else {
                zxaVarArr[i2].v += 2;
            }
        }
    }

    @Override // defpackage.rw7, java.util.Iterator
    public final T next() {
        if (this.w.w != this.z) {
            yk.b();
            return null;
        }
        if (!this.v) {
            vl.b();
            return null;
        }
        zxa<K, V, T> zxaVar = this.t[this.u];
        this.x = (K) zxaVar.t[zxaVar.v];
        this.y = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw7, java.util.Iterator
    public final void remove() {
        if (!this.y) {
            d43.c();
            return;
        }
        boolean z = this.v;
        sw7<K, V> sw7Var = this.w;
        if (!z) {
            fza.a(sw7Var).remove(this.x);
        } else {
            if (!z) {
                vl.b();
                return;
            }
            zxa<K, V, T> zxaVar = this.t[this.u];
            Object obj = zxaVar.t[zxaVar.v];
            fza.a(sw7Var).remove(this.x);
            c(obj != null ? obj.hashCode() : 0, sw7Var.u, obj, 0);
        }
        this.x = null;
        this.y = false;
        this.z = sw7Var.w;
    }
}
