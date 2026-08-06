package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qp1<T> {
    public final String a;
    public final Set<fg8<? super T>> b;
    public final Set<ay2> c;
    public final int d;
    public final int e;
    public final qq1<T> f;
    public final Set<Class<?>> g;

    public qp1(String str, Set<fg8<? super T>> set, Set<ay2> set2, int i, int i2, qq1<T> qq1Var, Set<Class<?>> set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = qq1Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(fg8<T> fg8Var) {
        return new a<>(fg8Var, new fg8[0]);
    }

    public static <T> a<T> b(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> qp1<T> c(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(fg8.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            yl7.b(cls2, "Null interface");
            hashSet.add(fg8.a(cls2));
        }
        return new qp1<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new pp1(t), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<T> {
        public String a = null;
        public final HashSet b;
        public final HashSet c;
        public int d;
        public int e;
        public qq1<T> f;
        public final HashSet g;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(fg8.a(cls));
            for (Class cls2 : clsArr) {
                yl7.b(cls2, "Null interface");
                this.b.add(fg8.a(cls2));
            }
        }

        public final void a(ay2 ay2Var) {
            if (this.b.contains(ay2Var.a)) {
                z90.a("Components are not allowed to depend on interfaces they themselves provide.");
            } else {
                this.c.add(ay2Var);
            }
        }

        public final qp1<T> b() {
            if (this.f != null) {
                return new qp1<>(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
            }
            aa0.c("Missing required property: factory.");
            return null;
        }

        public final void c(int i) {
            if (this.d == 0) {
                this.d = i;
            } else {
                aa0.c("Instantiation type has already been set.");
            }
        }

        public a(fg8 fg8Var, fg8[] fg8VarArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(fg8Var);
            for (fg8 fg8Var2 : fg8VarArr) {
                yl7.b(fg8Var2, "Null interface");
            }
            Collections.addAll(this.b, fg8VarArr);
        }
    }
}
