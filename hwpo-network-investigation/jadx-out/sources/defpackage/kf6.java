package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kf6 implements o30 {
    public final gp4<a, Object> a = new gp4<>();
    public final b b = new b(1);
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements t58 {
        public final b a;
        public int b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.t58
        public final void a() {
            this.a.e(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends l4c {
        public final t58 u() {
            return new a(this);
        }
    }

    public kf6(int i) {
        this.e = i;
    }

    @Override // defpackage.o30
    public final synchronized void a(int i) {
        try {
            if (i >= 40) {
                b();
            } else if (i >= 20 || i == 15) {
                f(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.o30
    public final synchronized void b() {
        f(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o30
    public final synchronized <T> T c(int i, Class<T> cls) {
        a aVar;
        int i2;
        try {
            Integer numCeilingKey = i(cls).ceilingKey(Integer.valueOf(i));
            boolean z = numCeilingKey != null && ((i2 = this.f) == 0 || this.e / i2 >= 2 || numCeilingKey.intValue() <= i * 8);
            b bVar = this.b;
            if (z) {
                int iIntValue = numCeilingKey.intValue();
                t58 t58VarU = (t58) ((ArrayDeque) bVar.a).poll();
                if (t58VarU == null) {
                    t58VarU = bVar.u();
                }
                aVar = (a) t58VarU;
                aVar.b = iIntValue;
                aVar.c = cls;
            } else {
                t58 t58VarU2 = (t58) ((ArrayDeque) bVar.a).poll();
                if (t58VarU2 == null) {
                    t58VarU2 = bVar.u();
                }
                aVar = (a) t58VarU2;
                aVar.b = i;
                aVar.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T) h(aVar, cls);
    }

    @Override // defpackage.o30
    public final synchronized Object d() {
        a aVar;
        b bVar = this.b;
        t58 t58VarU = (t58) ((ArrayDeque) bVar.a).poll();
        if (t58VarU == null) {
            t58VarU = bVar.u();
        }
        aVar = (a) t58VarU;
        aVar.b = 8;
        aVar.c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapI = i(cls);
        Integer num = navigableMapI.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapI.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapI.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void f(int i) {
        while (this.f > i) {
            Object objC = this.a.c();
            ov9.c(objC);
            e30 e30VarG = g(objC.getClass());
            this.f -= e30VarG.a() * e30VarG.c(objC);
            e(e30VarG.c(objC), objC.getClass());
            if (Log.isLoggable(e30VarG.b(), 2)) {
                Log.v(e30VarG.b(), "evicted: " + e30VarG.c(objC));
            }
        }
    }

    public final <T> e30<T> g(Class<T> cls) {
        e30<T> mz0Var;
        HashMap map = this.d;
        e30<T> e30Var = (e30) map.get(cls);
        if (e30Var != null) {
            return e30Var;
        }
        if (cls.equals(int[].class)) {
            mz0Var = new ng5();
        } else {
            if (!cls.equals(byte[].class)) {
                z90.a("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            mz0Var = new mz0();
        }
        map.put(cls, mz0Var);
        return mz0Var;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        e30<T> e30VarG = g(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f -= e30VarG.a() * e30VarG.c(t);
            e(e30VarG.c(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(e30VarG.b(), 2)) {
            Log.v(e30VarG.b(), "Allocated " + aVar.b + " bytes");
        }
        return e30VarG.newArray(aVar.b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap map = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    @Override // defpackage.o30
    public final synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        e30<T> e30VarG = g(cls);
        int iC = e30VarG.c(t);
        int iA = e30VarG.a() * iC;
        if (iA <= this.e / 2) {
            b bVar = this.b;
            t58 t58VarU = (t58) ((ArrayDeque) bVar.a).poll();
            if (t58VarU == null) {
                t58VarU = bVar.u();
            }
            a aVar = (a) t58VarU;
            aVar.b = iC;
            aVar.c = cls;
            this.a.b(aVar, t);
            NavigableMap<Integer, Integer> navigableMapI = i(cls);
            Integer num = navigableMapI.get(Integer.valueOf(aVar.b));
            Integer numValueOf = Integer.valueOf(aVar.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapI.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iA;
            f(this.e);
        }
    }
}
