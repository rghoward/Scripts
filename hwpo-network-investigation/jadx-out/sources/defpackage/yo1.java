package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yo1 {
    public static final a a = new a();
    public static final b b = new b(-1);
    public static final b c = new b(1);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends yo1 {
        public static yo1 f(int i) {
            if (i < 0) {
                return yo1.b;
            }
            return i > 0 ? yo1.c : yo1.a;
        }

        @Override // defpackage.yo1
        public final yo1 a(int i, int i2) {
            return f(Integer.compare(i, i2));
        }

        @Override // defpackage.yo1
        public final <T> yo1 b(T t, T t2, Comparator<T> comparator) {
            return f(comparator.compare(t, t2));
        }

        @Override // defpackage.yo1
        public final yo1 c(boolean z, boolean z2) {
            return f(Boolean.compare(z, z2));
        }

        @Override // defpackage.yo1
        public final yo1 d(boolean z, boolean z2) {
            return f(Boolean.compare(z2, z));
        }

        @Override // defpackage.yo1
        public final int e() {
            return 0;
        }
    }

    public abstract yo1 a(int i, int i2);

    public abstract <T> yo1 b(T t, T t2, Comparator<T> comparator);

    public abstract yo1 c(boolean z, boolean z2);

    public abstract yo1 d(boolean z, boolean z2);

    public abstract int e();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends yo1 {
        public final int d;

        public b(int i) {
            this.d = i;
        }

        @Override // defpackage.yo1
        public final int e() {
            return this.d;
        }

        @Override // defpackage.yo1
        public final yo1 a(int i, int i2) {
            return this;
        }

        @Override // defpackage.yo1
        public final yo1 c(boolean z, boolean z2) {
            return this;
        }

        @Override // defpackage.yo1
        public final yo1 d(boolean z, boolean z2) {
            return this;
        }

        @Override // defpackage.yo1
        public final <T> yo1 b(T t, T t2, Comparator<T> comparator) {
            return this;
        }
    }
}
