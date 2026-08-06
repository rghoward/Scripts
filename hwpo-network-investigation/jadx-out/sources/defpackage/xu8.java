package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xu8 implements kq1 {
    public final Set<fg8<?>> a;
    public final Set<fg8<?>> b;
    public final Set<fg8<?>> c;
    public final Set<fg8<?>> d;
    public final Set<fg8<?>> e;
    public final Set<Class<?>> f;
    public final kq1 g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements wf8 {
        public final Set<Class<?>> a;
        public final wf8 b;

        public a(Set<Class<?>> set, wf8 wf8Var) {
            this.a = set;
            this.b = wf8Var;
        }
    }

    public xu8(qp1<?> qp1Var, kq1 kq1Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<ay2> set = qp1Var.c;
        Set<Class<?>> set2 = qp1Var.g;
        for (ay2 ay2Var : set) {
            int i = ay2Var.c;
            int i2 = ay2Var.b;
            boolean z = i == 0;
            fg8<?> fg8Var = ay2Var.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(fg8Var);
                } else {
                    hashSet.add(fg8Var);
                }
            } else if (i == 2) {
                hashSet3.add(fg8Var);
            } else if (i2 == 2) {
                hashSet5.add(fg8Var);
            } else {
                hashSet2.add(fg8Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(fg8.a(wf8.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = set2;
        this.g = kq1Var;
    }

    @Override // defpackage.kq1
    public final <T> T a(Class<T> cls) {
        if (this.a.contains(fg8.a(cls))) {
            T t = (T) this.g.a(cls);
            return !cls.equals(wf8.class) ? t : (T) new a(this.f, (wf8) t);
        }
        wu8.a(cls, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // defpackage.kq1
    public final <T> Set<T> b(fg8<T> fg8Var) {
        if (this.d.contains(fg8Var)) {
            return this.g.b(fg8Var);
        }
        wu8.a(fg8Var, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // defpackage.kq1
    public final <T> of8<T> c(Class<T> cls) {
        return f(fg8.a(cls));
    }

    @Override // defpackage.kq1
    public final <T> of8<Set<T>> d(fg8<T> fg8Var) {
        if (this.e.contains(fg8Var)) {
            return this.g.d(fg8Var);
        }
        wu8.a(fg8Var, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    @Override // defpackage.kq1
    public final <T> tv2<T> e(fg8<T> fg8Var) {
        if (this.c.contains(fg8Var)) {
            return this.g.e(fg8Var);
        }
        wu8.a(fg8Var, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    @Override // defpackage.kq1
    public final <T> of8<T> f(fg8<T> fg8Var) {
        if (this.b.contains(fg8Var)) {
            return this.g.f(fg8Var);
        }
        wu8.a(fg8Var, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // defpackage.kq1
    public final <T> T g(fg8<T> fg8Var) {
        if (this.a.contains(fg8Var)) {
            return (T) this.g.g(fg8Var);
        }
        wu8.a(fg8Var, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    public final <T> tv2<T> h(Class<T> cls) {
        return e(fg8.a(cls));
    }
}
