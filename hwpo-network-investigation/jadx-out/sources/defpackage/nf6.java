package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class nf6<K, V> {
    public final int a;
    public final of6<K, V> b;
    public final ym c;
    public int d;
    public int e;
    public int f;

    public nf6(int i) {
        this.a = i;
        if (i <= 0) {
            z90.a("maxSize <= 0");
            throw null;
        }
        this.b = new of6<>();
        this.c = new ym();
    }

    public V a(K k) {
        k.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final V c(K k) {
        V vPut;
        k.getClass();
        synchronized (this.c) {
            of6<K, V> of6Var = this.b;
            of6Var.getClass();
            V v = of6Var.a.get(k);
            if (v != null) {
                this.e++;
                return v;
            }
            this.f++;
            V vA = a(k);
            if (vA == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    of6<K, V> of6Var2 = this.b;
                    of6Var2.getClass();
                    vPut = of6Var2.a.put(k, vA);
                    if (vPut != null) {
                        of6<K, V> of6Var3 = this.b;
                        of6Var3.getClass();
                        of6Var3.a.put(k, vPut);
                    } else {
                        this.d += f(k, vA);
                        g2b g2bVar = g2b.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (vPut != null) {
                b(k, vA, vPut);
                return vPut;
            }
            h(this.a);
            return vA;
        }
    }

    public final V d(K k, V v) {
        V vPut;
        k.getClass();
        synchronized (this.c) {
            try {
                this.d += f(k, v);
                of6<K, V> of6Var = this.b;
                of6Var.getClass();
                vPut = of6Var.a.put(k, v);
                if (vPut != null) {
                    this.d -= f(k, vPut);
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            b(k, vPut, v);
        }
        h(this.a);
        return vPut;
    }

    public final V e(K k) {
        V vRemove;
        k.getClass();
        synchronized (this.c) {
            try {
                of6<K, V> of6Var = this.b;
                of6Var.getClass();
                vRemove = of6Var.a.remove(k);
                if (vRemove != null) {
                    this.d -= f(k, vRemove);
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            b(k, vRemove, null);
        }
        return vRemove;
    }

    public final int f(K k, V v) {
        int iG = g(k, v);
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException("Negative size: " + k + '=' + v);
    }

    public int g(K k, V v) {
        k.getClass();
        v.getClass();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d > i && !this.b.a.isEmpty()) {
                        Set<Map.Entry<K, V>> setEntrySet = this.b.a.entrySet();
                        setEntrySet.getClass();
                        Map.Entry entry = (Map.Entry) th1.z(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        of6<K, V> of6Var = this.b;
                        of6Var.getClass();
                        key.getClass();
                        of6Var.a.remove(key);
                        this.d -= f(key, value);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
