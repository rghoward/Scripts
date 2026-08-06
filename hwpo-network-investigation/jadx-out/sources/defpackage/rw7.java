package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rw7<K, V, T> implements Iterator<T>, zn5 {
    public final zxa<K, V, T>[] t;
    public int u;
    public boolean v = true;

    public rw7(yxa<K, V> yxaVar, zxa<K, V, T>[] zxaVarArr) {
        this.t = zxaVarArr;
        zxaVarArr[0].a(Integer.bitCount(yxaVar.a) * 2, 0, yxaVar.d);
        this.u = 0;
        a();
    }

    public final void a() {
        int i = this.u;
        zxa<K, V, T>[] zxaVarArr = this.t;
        zxa<K, V, T> zxaVar = zxaVarArr[i];
        if (zxaVar.v < zxaVar.u) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                zxa<K, V, T> zxaVar2 = zxaVarArr[i];
                int i2 = zxaVar2.v;
                Object[] objArr = zxaVar2.t;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    zxaVar2.v = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.u = iB;
                return;
            }
            if (i > 0) {
                zxa<K, V, T> zxaVar3 = zxaVarArr[i - 1];
                int i3 = zxaVar3.v;
                int length2 = zxaVar3.t.length;
                zxaVar3.v = i3 + 1;
            }
            zxaVarArr[i].a(0, 0, yxa.e.d);
            i--;
        }
        this.v = false;
    }

    public final int b(int i) {
        zxa<K, V, T>[] zxaVarArr = this.t;
        zxa<K, V, T> zxaVar = zxaVarArr[i];
        int i2 = zxaVar.v;
        if (i2 < zxaVar.u) {
            return i;
        }
        Object[] objArr = zxaVar.t;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        yxa yxaVar = (yxa) obj;
        if (i == 6) {
            zxa<K, V, T> zxaVar2 = zxaVarArr[i + 1];
            Object[] objArr2 = yxaVar.d;
            zxaVar2.a(objArr2.length, 0, objArr2);
        } else {
            zxaVarArr[i + 1].a(Integer.bitCount(yxaVar.a) * 2, 0, yxaVar.d);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.v;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.v) {
            vl.b();
            return null;
        }
        T next = this.t[this.u].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
