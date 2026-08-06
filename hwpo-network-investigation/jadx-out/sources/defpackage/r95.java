package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r95<E> extends q95<E> implements NavigableSet<E>, ew9<E> {
    public static final /* synthetic */ int y = 0;
    public final transient Comparator<? super E> w;
    public transient r95<E> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<E> extends q95.a<E> {
        public final Comparator<? super E> d;

        public a(Comparator<? super E> comparator) {
            super(4);
            comparator.getClass();
            this.d = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q95.a, b95.b
        public final b95.b a(Object obj) {
            super.a(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q95.a
        /* JADX INFO: renamed from: f */
        public final q95.a a(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // q95.a
        public final /* bridge */ /* synthetic */ q95 g() {
            throw null;
        }

        public final xl8 h() {
            xl8 xl8Var;
            Object[] objArrCopyOf = this.a;
            int i = this.b;
            Comparator<? super E> comparator = this.d;
            if (i == 0) {
                xl8Var = r95.t(comparator);
            } else {
                pp0.b(i, objArrCopyOf);
                Arrays.sort(objArrCopyOf, 0, i, comparator);
                int i2 = 1;
                for (int i3 = 1; i3 < i; i3++) {
                    Object obj = objArrCopyOf[i3];
                    if (comparator.compare(obj, objArrCopyOf[i2 - 1]) != 0) {
                        objArrCopyOf[i2] = obj;
                        i2++;
                    }
                }
                Arrays.fill(objArrCopyOf, i2, i, (Object) null);
                if (i2 < objArrCopyOf.length / 2) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                }
                xl8Var = new xl8(k95.n(i2, objArrCopyOf), comparator);
            }
            this.b = xl8Var.z.size();
            this.c = true;
            return xl8Var;
        }
    }

    public r95(Comparator<? super E> comparator) {
        this.w = comparator;
    }

    public static <E> xl8<E> t(Comparator<? super E> comparator) {
        return n47.t.equals(comparator) ? (xl8<E>) xl8.A : new xl8<>(ul8.x, comparator);
    }

    @Override // java.util.SortedSet, defpackage.ew9
    public final Comparator<? super E> comparator() {
        return this.w;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        r95<E> r95VarT = this.x;
        if (r95VarT == null) {
            xl8 xl8Var = (xl8) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(xl8Var.w);
            r95VarT = xl8Var.isEmpty() ? t(comparatorReverseOrder) : new xl8(xl8Var.z.z(), comparatorReverseOrder);
            this.x = r95VarT;
            r95VarT.x = this;
        }
        return r95VarT;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        xl8 xl8Var = (xl8) this;
        return xl8Var.v(0, xl8Var.w(obj, z));
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        xl8 xl8Var = (xl8) this;
        return xl8Var.v(xl8Var.x(obj, true), xl8Var.z.size());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final xl8 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        xl7.g(this.w.compare(obj, obj2) <= 0);
        xl8 xl8Var = (xl8) this;
        xl8<E> xl8VarV = xl8Var.v(xl8Var.x(obj, z), xl8Var.z.size());
        return xl8VarV.v(0, xl8VarV.w(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        xl8 xl8Var = (xl8) this;
        return xl8Var.v(0, xl8Var.w(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        xl8 xl8Var = (xl8) this;
        return xl8Var.v(xl8Var.x(obj, z), xl8Var.z.size());
    }
}
