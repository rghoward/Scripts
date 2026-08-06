package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xz2 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ r47 t;
        public final /* synthetic */ a03 u;
        public final /* synthetic */ f09 v;
        public final /* synthetic */ fv9<r47> w;
        public final /* synthetic */ a03.a x;

        public a(r47 r47Var, a03 a03Var, l09 l09Var, fv9 fv9Var, a03.a aVar) {
            this.t = r47Var;
            this.u = a03Var;
            this.v = l09Var;
            this.w = fv9Var;
            this.x = aVar;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            if ((num.intValue() & 3) == 2 && jt1Var2.r()) {
                jt1Var2.u();
            } else {
                final r47 r47Var = this.t;
                boolean zJ = jt1Var2.j(r47Var);
                final a03 a03Var = this.u;
                boolean zJ2 = zJ | jt1Var2.j(a03Var);
                Object objF = jt1Var2.f();
                if (zJ2 || objF == jt1.a.a) {
                    final fv9<r47> fv9Var = this.w;
                    objF = new oh4() { // from class: uz2
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            fv9 fv9Var2 = fv9Var;
                            r47 r47Var2 = r47Var;
                            fv9Var2.add(r47Var2);
                            return new wz2(a03Var, r47Var2, fv9Var2);
                        }
                    };
                    jt1Var2.C(objF);
                }
                wd3.a(r47Var, (oh4) objF, jt1Var2);
                uy0.a(r47Var, this.v, gr1.b(-497631156, new vz2(this.x, r47Var), jt1Var2), jt1Var2, 384);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public final /* synthetic */ h37 t;
        public final /* synthetic */ a03 u;
        public final /* synthetic */ fv9<r47> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h37 h37Var, a03 a03Var, fv9 fv9Var, r02 r02Var) {
            super(2, r02Var);
            this.t = h37Var;
            this.u = a03Var;
            this.v = fv9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(this.t, this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            for (r47 r47Var : (Set) this.t.getValue()) {
                a03 a03Var = this.u;
                if (!((List) a03Var.b().e.t.getValue()).contains(r47Var) && !this.v.contains(r47Var)) {
                    a03Var.b().b(r47Var);
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements b33 {
        public final /* synthetic */ r47 a;
        public final /* synthetic */ tz2 b;

        public c(r47 r47Var, tz2 tz2Var) {
            this.a = r47Var;
            this.b = tz2Var;
        }

        @Override // defpackage.b33
        public final void dispose() {
            this.a.A.j.c(this.b);
        }
    }

    public static final void a(final a03 a03Var, jt1 jt1Var, final int i) {
        final a03 a03Var2;
        bj4 bj4VarO = jt1Var.o(294589392);
        if ((((bj4VarO.j(a03Var) ? 4 : 2) | i) & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
            a03Var2 = a03Var;
        } else {
            l09 l09VarB = kt7.b(bj4VarO);
            h37 h37VarC = bl7.c(a03Var.b().e, bj4VarO, 0);
            List list = (List) h37VarC.getValue();
            boolean zBooleanValue = ((Boolean) bj4VarO.F(me5.a)).booleanValue();
            boolean zJ = bj4VarO.J(list);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            Object obj = objF;
            if (zJ || objF == c0187a) {
                fv9 fv9Var = new fv9();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    r47 r47Var = (r47) obj2;
                    if (zBooleanValue || r47Var.A.j.d.compareTo(s66.b.w) >= 0) {
                        arrayList.add(obj2);
                    }
                }
                fv9Var.addAll(arrayList);
                bj4VarO.C(fv9Var);
                obj = fv9Var;
            }
            fv9 fv9Var2 = (fv9) obj;
            b(fv9Var2, (List) h37VarC.getValue(), bj4VarO, 0);
            h37 h37VarC2 = bl7.c(a03Var.b().f, bj4VarO, 0);
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = new fv9();
                bj4VarO.C(objF2);
            }
            fv9 fv9Var3 = (fv9) objF2;
            bj4VarO.K(-367418626);
            ListIterator listIterator = fv9Var2.listIterator();
            while (true) {
                h0a h0aVar = (h0a) listIterator;
                if (!h0aVar.hasNext()) {
                    break;
                }
                final r47 r47Var2 = (r47) h0aVar.next();
                c67 c67Var = r47Var2.u;
                c67Var.getClass();
                a03.a aVar = (a03.a) c67Var;
                boolean zJ2 = bj4VarO.j(a03Var) | bj4VarO.j(r47Var2);
                Object objF3 = bj4VarO.f();
                if (zJ2 || objF3 == c0187a) {
                    objF3 = new mh4() { // from class: pz2
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            a03Var.e(r47Var2, false);
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF3);
                }
                a03 a03Var3 = a03Var;
                wn.a((mh4) objF3, aVar.y, gr1.b(1129586364, new a(r47Var2, a03Var3, l09VarB, fv9Var3, aVar), bj4VarO), bj4VarO, 384, 0);
                a03Var = a03Var3;
            }
            a03Var2 = a03Var;
            bj4VarO.U(false);
            Set set = (Set) h37VarC2.getValue();
            boolean zJ3 = bj4VarO.J(h37VarC2) | bj4VarO.j(a03Var2);
            Object objF4 = bj4VarO.f();
            if (zJ3 || objF4 == c0187a) {
                objF4 = new b(h37VarC2, a03Var2, fv9Var3, null);
                bj4VarO.C(objF4);
            }
            wd3.f(set, fv9Var3, (ci4) objF4, bj4VarO);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i) { // from class: qz2
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iS = gz3.s(1);
                    xz2.a(this.t, (jt1) obj3, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final List<r47> list, final Collection<r47> collection, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1537894851);
        if ((((bj4VarO.j(list) ? 4 : 2) | i | (bj4VarO.j(collection) ? 32 : 16)) & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            boolean zBooleanValue = ((Boolean) bj4VarO.F(me5.a)).booleanValue();
            for (r47 r47Var : collection) {
                n76 n76Var = r47Var.A.j;
                boolean zC = bj4VarO.c(zBooleanValue) | bj4VarO.j(list) | bj4VarO.j(r47Var);
                Object objF = bj4VarO.f();
                if (zC || objF == jt1.a.a) {
                    objF = new rz2(r47Var, list, zBooleanValue);
                    bj4VarO.C(objF);
                }
                wd3.a(n76Var, (oh4) objF, bj4VarO);
            }
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(list, collection, i) { // from class: sz2
                public final /* synthetic */ List t;
                public final /* synthetic */ Collection u;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    xz2.b(this.t, this.u, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
