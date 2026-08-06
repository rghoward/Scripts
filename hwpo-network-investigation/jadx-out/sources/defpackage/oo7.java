package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oo7<T> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> extends oo7<T> {
        public final int b() {
            return (0 - 0) + 1;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> extends oo7<T> {
        public static final b<Object> g;
        public final wb6 a;
        public final List<cva<T>> b;
        public final int c;
        public final int d;
        public final vb6 e;
        public final vb6 f;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a {
            public static b a(List list, int i, int i2, vb6 vb6Var, vb6 vb6Var2) {
                vb6Var.getClass();
                return new b(wb6.t, list, i, i2, vb6Var, vb6Var2);
            }
        }

        /* JADX INFO: renamed from: oo7$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {140}, m = "map", v = 1)
        public static final class C0215b<R> extends u02 {
            public Collection A;
            public Iterator B;
            public Collection C;
            public Collection D;
            public /* synthetic */ Object E;
            public int G;
            public ci4 t;
            public b u;
            public wb6 v;
            public Collection w;
            public Iterator x;
            public cva y;
            public int[] z;

            public C0215b(u02 u02Var) {
                super(u02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.E = obj;
                this.G |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        static {
            List listH = ws0.h(cva.d);
            ub6.c cVar = ub6.c.c;
            ub6.c cVar2 = ub6.c.b;
            g = a.a(listH, 0, 0, new vb6(cVar, cVar2, cVar2), null);
        }

        public b(wb6 wb6Var, List<cva<T>> list, int i, int i2, vb6 vb6Var, vb6 vb6Var2) {
            this.a = wb6Var;
            this.b = list;
            this.c = i;
            this.d = i2;
            this.e = vb6Var;
            this.f = vb6Var2;
            if (wb6Var != wb6.v && i < 0) {
                ca0.a(pp2.a(i, "Prepend insert defining placeholdersBefore must be > 0, but was "));
                throw null;
            }
            if (wb6Var != wb6.u && i2 < 0) {
                ca0.a(pp2.a(i2, "Append insert defining placeholdersAfter must be > 0, but was "));
                throw null;
            }
            if (wb6Var == wb6.t && list.isEmpty()) {
                z90.a("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0073  */
        /* JADX WARN: Code duplicated, block: B:20:0x009a  */
        /* JADX WARN: Code duplicated, block: B:22:0x00c7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:25:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:18:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c8 -> B:24:0x00cc). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oo7
        public final <R> java.lang.Object a(defpackage.ci4<? super T, ? super defpackage.r02<? super R>, ? extends java.lang.Object> r14, defpackage.r02<? super defpackage.oo7<R>> r15) {
            /*
                Method dump skipped, instruction units count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oo7.b.a(ci4, r02):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && xj5.a(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && xj5.a(this.e, bVar.e) && xj5.a(this.f, bVar.f);
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + os2.a(this.d, os2.a(this.c, ho2.a(this.a.hashCode() * 31, 31, this.b), 31), 31)) * 31;
            vb6 vb6Var = this.f;
            return iHashCode + (vb6Var == null ? 0 : vb6Var.hashCode());
        }

        public final String toString() {
            List<T> list;
            List<T> list2;
            List<cva<T>> list3 = this.b;
            Iterator<T> it = list3.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((cva) it.next()).b.size();
            }
            int i = this.c;
            String strValueOf = i != -1 ? String.valueOf(i) : "none";
            int i2 = this.d;
            String strValueOf2 = i2 != -1 ? String.valueOf(i2) : "none";
            StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
            sb.append(this.a);
            sb.append(", with ");
            sb.append(size);
            sb.append(" items (\n                    |   first item: ");
            cva cvaVar = (cva) th1.A(list3);
            Object objH = null;
            sb.append((cvaVar == null || (list2 = cvaVar.b) == null) ? null : th1.A(list2));
            sb.append("\n                    |   last item: ");
            cva cvaVar2 = (cva) th1.H(list3);
            if (cvaVar2 != null && (list = cvaVar2.b) != null) {
                objH = th1.H(list);
            }
            sb.append(objH);
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(strValueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(strValueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.e);
            sb.append("\n                    ");
            String string = sb.toString();
            vb6 vb6Var = this.f;
            if (vb6Var != null) {
                string = string + "|   mediatorLoadStates: " + vb6Var + '\n';
            }
            return s2a.c(string.concat("|)"));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<T> extends oo7<T> {
        public final vb6 a;
        public final vb6 b;

        public c(vb6 vb6Var, vb6 vb6Var2) {
            vb6Var.getClass();
            this.a = vb6Var;
            this.b = vb6Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return xj5.a(this.a, cVar.a) && xj5.a(this.b, cVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            vb6 vb6Var = this.b;
            return iHashCode + (vb6Var == null ? 0 : vb6Var.hashCode());
        }

        public final String toString() {
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ";
            vb6 vb6Var = this.b;
            if (vb6Var != null) {
                str = str + "|   mediatorLoadStates: " + vb6Var + '\n';
            }
            return s2a.c(str.concat("|)"));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d<T> extends oo7<T> {
        public final List<T> a;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {50}, m = "map", v = 1)
        public static final class a<R> extends u02 {
            public ci4 t;
            public Collection u;
            public Iterator v;
            public Collection w;
            public /* synthetic */ Object x;
            public int z;

            public a(u02 u02Var) {
                super(u02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.x = obj;
                this.z |= Integer.MIN_VALUE;
                return d.this.a(null, this);
            }
        }

        public d(List list) {
            list.getClass();
            this.a = list;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0058  */
        /* JADX WARN: Code duplicated, block: B:19:0x0071 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0072  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:21:0x0075). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oo7
        public final <R> java.lang.Object a(defpackage.ci4<? super T, ? super defpackage.r02<? super R>, ? extends java.lang.Object> r6, defpackage.r02<? super defpackage.oo7<R>> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof oo7.d.a
                if (r0 == 0) goto L13
                r0 = r7
                oo7$d$a r0 = (oo7.d.a) r0
                int r1 = r0.z
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.z = r1
                goto L1a
            L13:
                oo7$d$a r0 = new oo7$d$a
                u02 r7 = (defpackage.u02) r7
                r0.<init>(r7)
            L1a:
                java.lang.Object r7 = r0.x
                int r1 = r0.z
                r2 = 1
                if (r1 == 0) goto L3a
                if (r1 != r2) goto L33
                java.util.Collection r5 = r0.w
                java.util.Collection r5 = (java.util.Collection) r5
                java.util.Iterator r6 = r0.v
                java.util.Collection r1 = r0.u
                java.util.Collection r1 = (java.util.Collection) r1
                ci4 r3 = r0.t
                defpackage.dv8.b(r7)
                goto L75
            L33:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r5)
                r5 = 0
                return r5
            L3a:
                defpackage.dv8.b(r7)
                java.util.ArrayList r7 = new java.util.ArrayList
                r1 = 10
                java.util.List<T> r5 = r5.a
                int r1 = defpackage.ph1.n(r5, r1)
                r7.<init>(r1)
                java.util.Iterator r5 = r5.iterator()
                r4 = r6
                r6 = r5
                r5 = r7
                r7 = r4
            L52:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L7b
                java.lang.Object r1 = r6.next()
                r0.t = r7
                r3 = r5
                java.util.Collection r3 = (java.util.Collection) r3
                r0.u = r3
                r0.v = r6
                r0.w = r3
                r0.z = r2
                java.lang.Object r1 = r7.invoke(r1, r0)
                v72 r3 = defpackage.v72.t
                if (r1 != r3) goto L72
                return r3
            L72:
                r3 = r7
                r7 = r1
                r1 = r5
            L75:
                r5.add(r7)
                r5 = r1
                r7 = r3
                goto L52
            L7b:
                java.util.List r5 = (java.util.List) r5
                oo7$d r6 = new oo7$d
                r6.<init>(r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: oo7.d.a(ci4, r02):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && xj5.a(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(0) + os2.a(0, this.a.hashCode() * 29791, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
            List<T> list = this.a;
            sb.append(list.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(th1.A(list));
            sb.append("\n                    |   last item: ");
            sb.append(th1.H(list));
            sb.append("\n                    |   sourceLoadStates: null,\n                    |   placeholdersBefore: 0,\n                    |   placeholdersAfter: 0,\n                    ");
            return s2a.c(sb.toString().concat("|)"));
        }
    }

    public <R> Object a(ci4<? super T, ? super r02<? super R>, ? extends Object> ci4Var, r02<? super oo7<R>> r02Var) {
        return this;
    }
}
