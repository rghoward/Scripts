package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class sw7<K, V> extends e2<K, V> {
    public x17 t;
    public yxa<K, V> u;
    public V v;
    public int w;
    public int x;

    public qw7<K, V> a() {
        throw null;
    }

    public final void b(int i) {
        this.x = i;
        this.w++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.u = yxa.e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.u.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return (V) this.u.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.v = null;
        this.u = this.u.l(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        qw7<K, V> qw7VarA = null;
        qw7<K, V> qw7Var = map instanceof qw7 ? (qw7) map : null;
        if (qw7Var == null) {
            sw7 sw7Var = map instanceof sw7 ? (sw7) map : null;
            if (sw7Var != null) {
                qw7VarA = sw7Var.a();
            }
        } else {
            qw7VarA = qw7Var;
        }
        if (qw7VarA == null) {
            super.putAll(map);
            return;
        }
        sx2 sx2Var = new sx2();
        sx2Var.a = 0;
        int i = this.x;
        yxa<K, V> yxaVar = this.u;
        yxa<K, V> yxaVar2 = qw7VarA.t;
        yxaVar2.getClass();
        this.u = yxaVar.m(yxaVar2, 0, sx2Var, this);
        int i2 = (qw7VarA.u + i) - sx2Var.a;
        if (i != i2) {
            b(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.x;
        yxa<K, V> yxaVarO = this.u.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (yxaVarO == null) {
            yxaVarO = yxa.e;
        }
        this.u = yxaVarO;
        return i != this.x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.v = null;
        yxa<K, V> yxaVarN = this.u.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (yxaVarN == null) {
            yxaVarN = yxa.e;
        }
        this.u = yxaVarN;
        return this.v;
    }
}
