package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tr7<T> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> extends tr7<T> {
        public final int a;
        public final ArrayList b;
        public final int c;
        public final int d;

        public a(int i, ArrayList arrayList, int i2, int i3) {
            this.a = i;
            this.b = arrayList;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && xj5.a(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + Integer.hashCode(this.c) + this.b.hashCode() + Integer.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
            ArrayList arrayList = this.b;
            sb.append(arrayList.size());
            sb.append(" items (\n                    |   startIndex: ");
            sb.append(this.a);
            sb.append("\n                    |   first item: ");
            sb.append(th1.A(arrayList));
            sb.append("\n                    |   last item: ");
            sb.append(th1.H(arrayList));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.d);
            sb.append("\n                    |)\n                    |");
            return s2a.c(sb.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> extends tr7<T> {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public b(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
            int i = this.b;
            sb.append(i);
            sb.append(" items (\n                    |   startIndex: ");
            p23.a(sb, this.a, "\n                    |   dropCount: ", i, "\n                    |   newPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.d);
            sb.append("\n                    |)\n                    |");
            return s2a.c(sb.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<T> extends tr7<T> {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
            int i = this.a;
            p23.a(sb, i, " items (\n                    |   dropCount: ", i, "\n                    |   newPlaceholdersBefore: ");
            sb.append(this.b);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |)\n                    |");
            return s2a.c(sb.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d<T> extends tr7<T> {
        public final ArrayList a;
        public final int b;
        public final int c;

        public d(ArrayList arrayList, int i, int i2) {
            this.a = arrayList;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return xj5.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + Integer.hashCode(this.b) + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
            ArrayList arrayList = this.a;
            sb.append(arrayList.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(th1.A(arrayList));
            sb.append("\n                    |   last item: ");
            sb.append(th1.H(arrayList));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.b);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |)\n                    |");
            return s2a.c(sb.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e<T> extends tr7<T> {
        public final mp7 a;
        public final tz7<T> b;

        public e(mp7 mp7Var, tz7 tz7Var) {
            tz7Var.getClass();
            this.a = mp7Var;
            this.b = tz7Var;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            mp7 mp7Var = this.a;
            int i = mp7Var.c;
            e eVar = (e) obj;
            tz7<T> tz7Var = eVar.b;
            mp7 mp7Var2 = eVar.a;
            if (i != mp7Var2.c || mp7Var.d != mp7Var2.d || mp7Var.getSize() != mp7Var2.getSize() || mp7Var.b != mp7Var2.b) {
                return false;
            }
            tz7<T> tz7Var2 = this.b;
            return tz7Var2.b() == tz7Var.b() && tz7Var2.c() == tz7Var.c() && tz7Var2.getSize() == tz7Var.getSize() && tz7Var2.a() == tz7Var.a();
        }

        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
            mp7 mp7Var = this.a;
            sb.append(mp7Var.c);
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(mp7Var.d);
            sb.append("\n                    |       size: ");
            sb.append(mp7Var.getSize());
            sb.append("\n                    |       dataCount: ");
            sb.append(mp7Var.b);
            sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
            tz7<T> tz7Var = this.b;
            sb.append(tz7Var.b());
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(tz7Var.c());
            sb.append("\n                    |       size: ");
            sb.append(tz7Var.getSize());
            sb.append("\n                    |       dataCount: ");
            sb.append(tz7Var.a());
            sb.append("\n                    |   )\n                    |");
            return s2a.c(sb.toString());
        }
    }
}
