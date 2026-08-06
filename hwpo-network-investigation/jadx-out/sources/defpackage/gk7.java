package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gk7 {
    public final int a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends gk7 {
        public static final a c = new a(1, 0, 2);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            cs9Var.a(aVar.a(0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a0 extends gk7 {
        public static final a0 c;

        static {
            int i = 1;
            c = new a0(0, i, i);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            hm8Var.g.d((mh4) aVar.b(0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends gk7 {
        public static final b c = new b(0, 2, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            vi4 vi4Var = (vi4) aVar.b(0);
            Object objB = aVar.b(1);
            if (objB instanceof jm8) {
                hm8Var.h((jm8) objB);
            }
            if (cs9Var.n != 0) {
                pt1.a("Can only append a slot if not current inserting");
            }
            int i = cs9Var.i;
            int i2 = cs9Var.j;
            int iC = cs9Var.c(vi4Var);
            int iG = cs9Var.g(cs9Var.b, cs9Var.r(iC + 1));
            cs9Var.i = iG;
            cs9Var.j = iG;
            cs9Var.x(1, iC);
            if (i >= iG) {
                i++;
                i2++;
            }
            cs9Var.c[iG] = objB;
            cs9Var.i = i;
            cs9Var.j = i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b0 extends gk7 {
        public static final b0 c;

        static {
            int i = 0;
            c = new b0(i, i, 3);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            cs9Var.O();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends gk7 {
        public static final c c = new c(0, 2, 1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            hg5 hg5Var = (hg5) aVar.b(1);
            int i = hg5Var != null ? hg5Var.a : 0;
            i81 i81Var = (i81) aVar.b(0);
            if (i > 0) {
                p20Var = new wf7(p20Var, i);
            }
            i81Var.h1(p20Var, cs9Var, hm8Var, hk7Var != null ? new jk7(hk7Var, cs9Var) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c0 extends gk7 {
        public static final c0 c;

        static {
            int i = 1;
            c = new c0(0, i, i);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            xj8 xj8Var = (xj8) aVar.b(0);
            c37<xj8, qu7> c37Var = hm8Var.i;
            qu7 qu7VarD = c37Var != null ? c37Var.d(xj8Var) : null;
            if (qu7VarD != null) {
                ArrayList<k37<jm8>> arrayList = hm8Var.j;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    hm8Var.j = arrayList;
                }
                arrayList.add(hm8Var.e);
                hm8Var.e = qu7VarD.u;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends gk7 {
        public static final d c = new d(0, 2, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            int i = ((hg5) aVar.b(0)).a;
            List list = (List) aVar.b(1);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                p20Var.c(i3, obj);
                p20Var.i(i3, obj);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d0 extends gk7 {
        public static final d0 c = new d0(1, 0, 2);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            int iA = aVar.a(0);
            int i = cs9Var.v;
            int iP = cs9Var.P(cs9Var.b, cs9Var.r(i));
            int iG = cs9Var.g(cs9Var.b, cs9Var.r(i + 1));
            for (int iMax = Math.max(iP, iG - iA); iMax < iG; iMax++) {
                Object obj = cs9Var.c[cs9Var.h(iMax)];
                if (obj instanceof jm8) {
                    hm8Var.e((jm8) obj);
                } else if (obj instanceof xj8) {
                    ((xj8) obj).c();
                }
            }
            if (iA <= 0) {
                pt1.a("Check failed");
            }
            int i2 = cs9Var.v;
            int iP2 = cs9Var.P(cs9Var.b, cs9Var.r(i2));
            int iG2 = cs9Var.g(cs9Var.b, cs9Var.r(i2 + 1)) - iA;
            if (iG2 < iP2) {
                pt1.a("Check failed");
            }
            cs9Var.L(iG2, iA, i2);
            int i3 = cs9Var.i;
            if (i3 >= iP2) {
                cs9Var.i = i3 - iA;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends gk7 {
        public static final e c = new e(0, 4, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            mz6 mz6Var = (mz6) aVar.b(2);
            mz6 mz6Var2 = (mz6) aVar.b(3);
            yt1 yt1Var = (yt1) aVar.b(1);
            lz6 lz6VarO = (lz6) aVar.b(0);
            if (lz6VarO == null && (lz6VarO = yt1Var.o(mz6Var)) == null) {
                pt1.b("Could not resolve state for movable content");
                fl.a();
                return;
            }
            zr9 zr9VarE = bs9.e(lz6VarO.a);
            if (cs9Var.n > 0 || cs9Var.u(cs9Var.t + 1) != 1) {
                pt1.a("Check failed");
            }
            int i = cs9Var.t;
            int i2 = cs9Var.i;
            int i3 = cs9Var.j;
            cs9Var.a(1);
            cs9Var.R();
            cs9Var.d();
            cs9 cs9VarM1 = zr9VarE.m1();
            try {
                List listA = cs9.a.a(cs9VarM1, 2, cs9Var, false, true, true);
                cs9VarM1.e(true);
                cs9Var.k();
                cs9Var.j();
                cs9Var.t = i;
                cs9Var.i = i2;
                cs9Var.j = i3;
                x02 x02Var = mz6Var2.c;
                x02Var.getClass();
                xj8.a.a(cs9Var, listA, (yj8) x02Var);
            } catch (Throwable th) {
                cs9VarM1.e(false);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e0 extends gk7 {
        public static final e0 c = new e0(1, 2);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            Object objB = aVar.b(0);
            vi4 vi4Var = (vi4) aVar.b(1);
            int iA = aVar.a(0);
            if (objB instanceof jm8) {
                hm8Var.h((jm8) objB);
            }
            Object objM = cs9Var.M(cs9Var.c(vi4Var), iA, objB);
            if (objM instanceof jm8) {
                hm8Var.e((jm8) objM);
            } else if (objM instanceof xj8) {
                ((xj8) objM).c();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends gk7 {
        public static final f c;

        static {
            int i = 0;
            c = new f(i, i, 3);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            cs9Var.n(cs9Var.t, new ej4(hm8Var, cs9Var));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f0 extends gk7 {
        public static final f0 c;

        static {
            int i = 1;
            c = new f0(0, i, i);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            cs9Var.V(aVar.b(0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends gk7 {
        public static final g c = new g(0, 2, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            int i;
            hg5 hg5Var = (hg5) aVar.b(0);
            int iC = cs9Var.c((vi4) aVar.b(1));
            if (cs9Var.t >= iC) {
                pt1.a("Check failed");
            }
            sm3.h(cs9Var, p20Var, iC);
            int i2 = cs9Var.t;
            int iG = cs9Var.v;
            while (iG >= 0 && !cs9Var.y(iG)) {
                iG = cs9Var.G(cs9Var.b, iG);
            }
            int iU = iG + 1;
            int iN = 0;
            while (iU < i2) {
                if (cs9Var.v(i2, iU)) {
                    if (cs9Var.y(iU)) {
                        iN = 0;
                    }
                    iU++;
                } else {
                    iN += cs9Var.y(iU) ? 1 : cs9Var.F(iU);
                    iU += cs9Var.u(iU);
                }
            }
            while (true) {
                i = cs9Var.t;
                if (i >= iC) {
                    break;
                }
                if (cs9Var.v(iC, i)) {
                    int i3 = cs9Var.t;
                    if (i3 < cs9Var.u && (cs9Var.b[(cs9Var.r(i3) * 5) + 1] & 1073741824) != 0) {
                        p20Var.d(cs9Var.E(cs9Var.t));
                        iN = 0;
                    }
                    cs9Var.R();
                } else {
                    iN += cs9Var.N();
                }
            }
            if (i != iC) {
                pt1.a("Check failed");
            }
            hg5Var.a = iN;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g0 extends gk7 {
        public static final g0 c = new g0(0, 2, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            p20Var.b((ci4) aVar.b(1), aVar.b(0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends gk7 {
        public static final h c;

        static {
            int i = 1;
            c = new h(0, i, i);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            for (Object obj : (Object[]) aVar.b(0)) {
                p20Var.d(obj);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h0 extends gk7 {
        public static final h0 c = new h0(1, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            Object objB = aVar.b(0);
            int iA = aVar.a(0);
            if (objB instanceof jm8) {
                hm8Var.h((jm8) objB);
            }
            Object objM = cs9Var.M(cs9Var.t, iA, objB);
            if (objM instanceof jm8) {
                hm8Var.e((jm8) objM);
            } else if (objM instanceof xj8) {
                ((xj8) objM).c();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i extends gk7 {
        public static final i c = new i(0, 2, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            ((oh4) aVar.b(0)).invoke((xt1) aVar.b(1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i0 extends gk7 {
        public static final i0 c = new i0(1, 0, 2);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            int iA = aVar.a(0);
            for (int i = 0; i < iA; i++) {
                p20Var.h();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j extends gk7 {
        public static final j c;

        static {
            int i = 0;
            c = new j(i, i, 3);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            cs9Var.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j0 extends gk7 {
        public static final j0 c;

        static {
            int i = 0;
            c = new j0(i, i, 3);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            p20Var.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k extends gk7 {
        public static final k c;

        static {
            int i = 0;
            c = new k(i, i, 3);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            sm3.h(cs9Var, p20Var, 0);
            cs9Var.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l extends gk7 {
        public static final l c;

        static {
            int i = 1;
            c = new l(0, i, i);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            k37<jm8> k37VarRemove;
            xj8 xj8Var = (xj8) aVar.b(0);
            c37<xj8, qu7> c37Var = hm8Var.i;
            if (c37Var == null || c37Var.d(xj8Var) == null) {
                return;
            }
            ArrayList<k37<jm8>> arrayList = hm8Var.j;
            if (arrayList != null && (k37VarRemove = arrayList.remove(arrayList.size() - 1)) != null) {
                hm8Var.e = k37VarRemove;
            }
            c37Var.k(xj8Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m extends gk7 {
        public static final m c;

        static {
            int i = 1;
            c = new m(0, i, i);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            vi4 vi4Var = (vi4) aVar.b(0);
            vi4Var.getClass();
            cs9Var.l(cs9Var.c(vi4Var));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n extends gk7 {
        public static final n c;

        static {
            int i = 0;
            c = new n(i, i, 3);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            cs9Var.l(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o extends gk7 {
        public static final o c = new o(1, 2);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            Object objInvoke = ((mh4) aVar.b(0)).invoke();
            vi4 vi4Var = (vi4) aVar.b(1);
            int iA = aVar.a(0);
            vi4Var.getClass();
            cs9Var.X(cs9Var.c(vi4Var), objInvoke);
            p20Var.i(iA, objInvoke);
            p20Var.d(objInvoke);
        }

        @Override // defpackage.gk7
        public final vi4 b(kk7.a aVar) {
            return (vi4) aVar.b(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class p extends gk7 {
        public static final p c = new p(0, 2, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            zr9 zr9Var = (zr9) aVar.b(1);
            vi4 vi4Var = (vi4) aVar.b(0);
            cs9Var.d();
            vi4Var.getClass();
            cs9Var.A(zr9Var, zr9Var.h1(vi4Var));
            cs9Var.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class q extends gk7 {
        public static final q c = new q(0, 3, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            jk7 jk7Var;
            zr9 zr9Var = (zr9) aVar.b(1);
            vi4 vi4Var = (vi4) aVar.b(0);
            o34 o34Var = (o34) aVar.b(2);
            cs9 cs9VarM1 = zr9Var.m1();
            if (hk7Var != null) {
                try {
                    jk7Var = new jk7(hk7Var, cs9Var);
                } catch (Throwable th) {
                    cs9VarM1.e(false);
                    throw th;
                }
            } else {
                jk7Var = null;
            }
            if (!o34Var.y.isEmpty()) {
                pt1.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            o34Var.x.h1(p20Var, cs9VarM1, hm8Var, jk7Var);
            g2b g2bVar = g2b.a;
            cs9VarM1.e(true);
            cs9Var.d();
            vi4Var.getClass();
            cs9Var.A(zr9Var, zr9Var.h1(vi4Var));
            cs9Var.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class r extends gk7 {
        public static final r c = new r(1, 0, 2);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            int[] iArr;
            vi4 vi4Var;
            int iC;
            int iA = aVar.a(0);
            if (cs9Var.n != 0) {
                pt1.a("Cannot move a group while inserting");
            }
            if (iA < 0) {
                pt1.a("Parameter offset is out of bounds");
            }
            if (iA == 0) {
                return;
            }
            int i = cs9Var.t;
            int i2 = cs9Var.v;
            int i3 = cs9Var.u;
            int iA2 = i;
            while (true) {
                iArr = cs9Var.b;
                if (iA <= 0) {
                    break;
                }
                iA2 += bs9.a(iArr, cs9Var.r(iA2));
                if (iA2 > i3) {
                    pt1.a("Parameter offset is out of bounds");
                }
                iA--;
            }
            int iA3 = bs9.a(iArr, cs9Var.r(iA2));
            int iG = cs9Var.g(cs9Var.b, cs9Var.r(cs9Var.t));
            int iG2 = cs9Var.g(cs9Var.b, cs9Var.r(iA2));
            int i4 = iA2 + iA3;
            int iG3 = cs9Var.g(cs9Var.b, cs9Var.r(i4));
            int i5 = iG3 - iG2;
            cs9Var.x(i5, Math.max(cs9Var.t - 1, 0));
            cs9Var.w(iA3);
            int[] iArr2 = cs9Var.b;
            int iR = cs9Var.r(i4) * 5;
            gz3.e(cs9Var.r(i) * 5, iR, (iA3 * 5) + iR, iArr2, iArr2);
            if (i5 > 0) {
                Object[] objArr = cs9Var.c;
                int iH = cs9Var.h(iG2 + i5);
                System.arraycopy(objArr, iH, objArr, iG, cs9Var.h(iG3 + i5) - iH);
            }
            int i6 = iG2 + i5;
            int i7 = i6 - iG;
            int i8 = cs9Var.k;
            int i9 = cs9Var.l;
            int length = cs9Var.c.length;
            int i10 = cs9Var.m;
            int i11 = i + iA3;
            int i12 = i;
            while (i12 < i11) {
                int iR2 = cs9Var.r(i12);
                int i13 = i7;
                int[] iArr3 = iArr2;
                iArr3[(iR2 * 5) + 4] = cs9.i(cs9.i(cs9Var.g(iArr2, iR2) - i13, i10 < iR2 ? 0 : i8, i9, length), cs9Var.k, cs9Var.l, cs9Var.c.length);
                i12++;
                i7 = i13;
                iArr2 = iArr3;
                i8 = i8;
            }
            int i14 = i4 + iA3;
            int iP = cs9Var.p();
            int iB = bs9.b(cs9Var.d, i4, iP);
            ArrayList arrayList = new ArrayList();
            if (iB >= 0) {
                while (iB < cs9Var.d.size() && (iC = cs9Var.c((vi4Var = cs9Var.d.get(iB)))) >= i4 && iC < i14) {
                    arrayList.add(vi4Var);
                    cs9Var.d.remove(iB);
                }
            }
            int i15 = i - i4;
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                vi4 vi4Var2 = (vi4) arrayList.get(i16);
                int iC2 = cs9Var.c(vi4Var2) + i15;
                if (iC2 >= cs9Var.g) {
                    vi4Var2.a = -(iP - iC2);
                } else {
                    vi4Var2.a = iC2;
                }
                cs9Var.d.add(bs9.b(cs9Var.d, iC2, iP), vi4Var2);
            }
            if (cs9Var.K(i4, iA3)) {
                pt1.a("Unexpectedly removed anchors");
            }
            cs9Var.m(i2, cs9Var.u, i);
            if (i5 > 0) {
                cs9Var.L(i6, i5, i4 - 1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class s extends gk7 {
        public static final s c = new s(3, 0, 2);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            p20Var.f(aVar.a(0), aVar.a(1), aVar.a(2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class t extends gk7 {
        public static final t c = new t(1, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            vi4 vi4Var = (vi4) aVar.b(0);
            int iA = aVar.a(0);
            p20Var.h();
            vi4Var.getClass();
            p20Var.c(iA, cs9Var.E(cs9Var.c(vi4Var)));
        }

        @Override // defpackage.gk7
        public final vi4 b(kk7.a aVar) {
            return (vi4) aVar.b(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class u extends gk7 {
        public static final u c = new u(0, 3, 1);

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            x02 x02Var = (x02) aVar.b(0);
            mz6 mz6Var = (mz6) aVar.b(2);
            ((yt1) aVar.b(1)).n(mz6Var, pt1.c(x02Var, mz6Var, cs9Var, null), p20Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class v extends gk7 {
        public static final v c;

        static {
            int i = 1;
            c = new v(0, i, i);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            hm8Var.h((jm8) aVar.b(0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class w extends gk7 {
        public static final w c;

        static {
            int i = 1;
            c = new w(0, i, i);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            xj8 xj8Var = (xj8) aVar.b(0);
            Set<im8> set = hm8Var.a;
            if (set == null) {
                return;
            }
            qu7 qu7Var = new qu7(set);
            c37<xj8, qu7> c37VarB = hm8Var.i;
            if (c37VarB == null) {
                c37VarB = z39.b();
                hm8Var.i = c37VarB;
            }
            c37VarB.m(xj8Var, qu7Var);
            hm8Var.e.d(new jj4(qu7Var, -1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class x extends gk7 {
        public static final x c;

        static {
            int i = 0;
            c = new x(i, i, 3);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            cs9Var.n(cs9Var.t, new ot1(hm8Var));
            cs9Var.J();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class y extends gk7 {
        public static final y c;

        static {
            int i = 2;
            c = new y(i, 0, i);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            p20Var.g(aVar.a(0), aVar.a(1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class z extends gk7 {
        public static final z c;

        static {
            int i = 0;
            c = new z(i, i, 3);
        }

        @Override // defpackage.gk7
        public final void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
            if (cs9Var.n != 0) {
                pt1.a("Cannot reset when inserting");
            }
            cs9Var.I();
            cs9Var.t = 0;
            cs9Var.u = cs9Var.o() - cs9Var.h;
            cs9Var.i = 0;
            cs9Var.j = 0;
            cs9Var.o = 0;
        }
    }

    public /* synthetic */ gk7(int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }

    public abstract void a(kk7.a aVar, p20 p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var);

    public vi4 b(kk7.a aVar) {
        return null;
    }

    public final String toString() {
        String strC = ll8.a(getClass()).c();
        return strC == null ? BuildConfig.FLAVOR : strC;
    }

    public gk7(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }
}
