package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iw implements CharSequence {
    public final List<c<? extends a>> t;
    public final String u;
    public final ArrayList v;
    public final ArrayList w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return eo7.f(Integer.valueOf(((c) t).b), Integer.valueOf(((c) t2).b));
        }
    }

    static {
        au3 au3Var = t29.a;
    }

    public iw() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iw(List<? extends c<? extends a>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.t = list;
        this.u = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                c cVar = (c) list.get(i);
                T t = cVar.a;
                if (t instanceof ww9) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(cVar);
                } else if (t instanceof ss7) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(cVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.v = arrayList;
        this.w = arrayList2;
        List listN = arrayList2 != null ? th1.N(arrayList2, new d()) : null;
        if (listN == null || listN.isEmpty()) {
            return;
        }
        int i2 = ((c) th1.y(listN)).c;
        d27 d27Var = vf5.a;
        d27 d27Var2 = new d27(1);
        d27Var2.c(i2);
        int size2 = listN.size();
        for (int i3 = 1; i3 < size2; i3++) {
            c cVar2 = (c) listN.get(i3);
            while (d27Var2.b != 0) {
                int iB = d27Var2.b();
                int i4 = cVar2.b;
                int i5 = cVar2.c;
                if (i4 < iB) {
                    if (i5 > iB) {
                        vc5.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + iB);
                        break;
                    }
                    break;
                }
                d27Var2.f(d27Var2.b - 1);
            }
            d27Var2.c(cVar2.c);
        }
    }

    public final List a(int i) {
        List<c<? extends a>> list = this.t;
        if (list == null) {
            return hf3.t;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c<? extends a> cVar = list.get(i2);
            c<? extends a> cVar2 = cVar;
            if ((cVar2.a instanceof l86) && lw.b(0, i, cVar2.b, cVar2.c)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final iw b(oh4<? super c<? extends a>, ? extends c<? extends a>> oh4Var) {
        b bVar = new b(this);
        ArrayList arrayList = bVar.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c<? extends a> cVarInvoke = oh4Var.invoke(((b.a) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new b.a(cVarInvoke.a, cVarInvoke.b, cVarInvoke.c, cVarInvoke.d));
        }
        return bVar.i();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final iw subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            vc5.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.u;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        iw iwVar = lw.a;
        if (i > i2) {
            vc5.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List<c<? extends a>> list = this.t;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c<? extends a> cVar = list.get(i3);
                int i4 = cVar.b;
                int i5 = cVar.c;
                if (lw.b(i, i2, i4, i5)) {
                    arrayList.add(new c(cVar.a, Math.max(i, cVar.b) - i, Math.min(i2, i5) - i, cVar.d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new iw(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.u.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw)) {
            return false;
        }
        iw iwVar = (iw) obj;
        return xj5.a(this.u, iwVar.u) && xj5.a(this.t, iwVar.t);
    }

    public final int hashCode() {
        int iHashCode = this.u.hashCode() * 31;
        List<c<? extends a>> list = this.t;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.u.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.u;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements Appendable {
        public final StringBuilder t;
        public final ArrayList u;
        public final ArrayList v;

        public b() {
            this.t = new StringBuilder(16);
            this.u = new ArrayList();
            this.v = new ArrayList();
            new ArrayList();
        }

        public final void a(ww9 ww9Var, int i, int i2) {
            this.v.add(new a(ww9Var, i, i2, 8));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            boolean z = charSequence instanceof iw;
            StringBuilder sb = this.t;
            if (!z) {
                sb.append(charSequence, i, i2);
                return this;
            }
            iw iwVar = (iw) charSequence;
            int length = sb.length();
            sb.append((CharSequence) iwVar.u, i, i2);
            List listA = lw.a(iwVar, i, i2, null);
            if (listA != null) {
                int size = listA.size();
                for (int i3 = 0; i3 < size; i3++) {
                    c cVar = (c) listA.get(i3);
                    this.v.add(new a(cVar.a, cVar.b + length, cVar.c + length, cVar.d));
                }
            }
            return this;
        }

        public final void b(iw iwVar) {
            StringBuilder sb = this.t;
            int length = sb.length();
            sb.append(iwVar.u);
            List<c<? extends a>> list = iwVar.t;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    c<? extends a> cVar = list.get(i);
                    this.v.add(new a(cVar.a, cVar.b + length, cVar.c + length, cVar.d));
                }
            }
        }

        public final void c(String str) {
            this.t.append(str);
        }

        public final void d() {
            ArrayList arrayList = this.u;
            if (arrayList.isEmpty()) {
                vc5.c("Nothing to pop.");
            }
            ((a) arrayList.remove(arrayList.size() - 1)).c = this.t.length();
        }

        public final void e(int i) {
            ArrayList arrayList = this.u;
            if (i >= arrayList.size()) {
                vc5.c(i + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i) {
                d();
            }
        }

        public final int f(l86.a aVar) {
            a aVar2 = new a(aVar, this.t.length(), 0, 12);
            ArrayList arrayList = this.u;
            arrayList.add(aVar2);
            this.v.add(aVar2);
            return arrayList.size() - 1;
        }

        public final int g(ss7 ss7Var) {
            a aVar = new a(ss7Var, this.t.length(), 0, 12);
            ArrayList arrayList = this.u;
            arrayList.add(aVar);
            this.v.add(aVar);
            return arrayList.size() - 1;
        }

        public final int h(ww9 ww9Var) {
            a aVar = new a(ww9Var, this.t.length(), 0, 12);
            ArrayList arrayList = this.u;
            arrayList.add(aVar);
            this.v.add(aVar);
            return arrayList.size() - 1;
        }

        public final iw i() {
            StringBuilder sb = this.t;
            String string = sb.toString();
            ArrayList arrayList = this.v;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((a) arrayList.get(i)).a(sb.length()));
            }
            return new iw(string, arrayList2);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a<T> {
            public final T a;
            public final int b;
            public int c;
            public final String d;

            public /* synthetic */ a(a aVar, int i, int i2, int i3) {
                this(aVar, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? BuildConfig.FLAVOR : "androidx.compose.foundation.text.inlineContent");
            }

            public final c<T> a(int i) {
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (!(i != Integer.MIN_VALUE)) {
                    vc5.c("Item.end should be set first");
                }
                return new c<>(this.a, this.b, i, this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return xj5.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && xj5.a(this.d, aVar.d);
            }

            public final int hashCode() {
                T t = this.a;
                return this.d.hashCode() + os2.a(this.c, os2.a(this.b, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.a);
                sb.append(", start=");
                sb.append(this.b);
                sb.append(", end=");
                sb.append(this.c);
                sb.append(", tag=");
                return wu0.a(sb, this.d, ')');
            }

            public a(T t, int i, int i2, String str) {
                this.a = t;
                this.b = i;
                this.c = i2;
                this.d = str;
            }
        }

        public b(iw iwVar) {
            this();
            b(iwVar);
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence instanceof iw) {
                b((iw) charSequence);
                return this;
            }
            this.t.append(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            this.t.append(c);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<T> {
        public final T a;
        public final int b;
        public final int c;
        public final String d;

        public c(T t, int i, int i2, String str) {
            this.a = t;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i <= i2) {
                return;
            }
            vc5.a("Reversed range is not supported");
        }

        public static c a(c cVar, a aVar, int i, int i2) {
            if ((i2 & 1) != 0) {
                aVar = cVar.a;
            }
            int i3 = cVar.b;
            if ((i2 & 4) != 0) {
                i = cVar.c;
            }
            String str = cVar.d;
            cVar.getClass();
            return new c(aVar, i3, i, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return xj5.a(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && xj5.a(this.d, cVar.d);
        }

        public final int hashCode() {
            T t = this.a;
            return this.d.hashCode() + os2.a(this.c, os2.a(this.b, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.a);
            sb.append(", start=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", tag=");
            return wu0.a(sb, this.d, ')');
        }

        public c(int i, int i2, Object obj) {
            this(obj, i, i2, BuildConfig.FLAVOR);
        }
    }

    public /* synthetic */ iw(String str) {
        this(str, hf3.t);
    }

    public iw(String str, List<? extends c<? extends a>> list) {
        this(list.isEmpty() ? null : list, str);
    }
}
