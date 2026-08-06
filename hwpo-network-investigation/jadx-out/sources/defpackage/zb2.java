package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zb2 {
    public static final void a(tva tvaVar, ox6 ox6Var, a04 a04Var, oh4 oh4Var, fr1 fr1Var, jt1 jt1Var, int i) {
        oh4 oh4Var2;
        l4c l4cVar = tvaVar.a;
        bj4 bj4VarO = jt1Var.o(-1877370462);
        int i2 = (i & 6) == 0 ? (bj4VarO.J(tvaVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(a04Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= bj4VarO.j(fr1Var) ? 16384 : 8192;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 9363) != 9362)) {
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = sb2.u;
                bj4VarO.C(objF);
            }
            oh4Var2 = (oh4) objF;
            Object objF2 = bj4VarO.f();
            Object obj = objF2;
            if (objF2 == c0187a) {
                fv9 fv9Var = new fv9();
                fv9Var.add(l4cVar.b());
                bj4VarO.C(fv9Var);
                obj = fv9Var;
            }
            fv9 fv9Var2 = (fv9) obj;
            Object objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = z39.b();
                bj4VarO.C(objF3);
            }
            c37 c37Var = (c37) objF3;
            dt7 dt7Var = tvaVar.d;
            if (xj5.a(l4cVar.b(), dt7Var.getValue())) {
                bj4VarO.K(321145192);
                if (fv9Var2.size() == 1 && xj5.a(fv9Var2.get(0), dt7Var.getValue())) {
                    bj4VarO.K(321469824);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(321279546);
                    boolean z = (i3 & 14) == 4;
                    Object objF4 = bj4VarO.f();
                    if (z || objF4 == c0187a) {
                        objF4 = new tb2(tvaVar);
                        bj4VarO.C(objF4);
                    }
                    rh1.p((oh4) objF4, fv9Var2);
                    c37Var.g();
                    bj4VarO.U(false);
                }
                bj4VarO.U(false);
            } else {
                bj4VarO.K(321475776);
                bj4VarO.U(false);
            }
            if (c37Var.a(dt7Var.getValue())) {
                bj4VarO.K(322279296);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(321536443);
                ListIterator listIterator = fv9Var2.listIterator();
                int i4 = 0;
                while (true) {
                    h0a h0aVar = (h0a) listIterator;
                    if (!h0aVar.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (xj5.a(oh4Var2.invoke(h0aVar.next()), oh4Var2.invoke(dt7Var.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    fv9Var2.add(dt7Var.getValue());
                } else {
                    fv9Var2.set(i4, dt7Var.getValue());
                }
                c37Var.g();
                int size = fv9Var2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj2 = fv9Var2.get(i5);
                    c37Var.m(obj2, gr1.b(-934471669, new xb2(tvaVar, a04Var, obj2, fr1Var), bj4VarO));
                }
                bj4VarO.U(false);
            }
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.l()) {
                bj4VarO.b(bVar, numValueOf);
            }
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-1312707512);
            int size2 = fv9Var2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Object obj3 = fv9Var2.get(i6);
                bj4VarO.p(1171574969, oh4Var2.invoke(obj3));
                ci4 ci4Var = (ci4) c37Var.d(obj3);
                if (ci4Var == null) {
                    bj4VarO.K(1959122128);
                } else {
                    bj4VarO.K(1171576145);
                    ci4Var.invoke(bj4VarO, 0);
                }
                bj4VarO.U(false);
                bj4VarO.U(false);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
            oh4Var2 = oh4Var;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new yb2(tvaVar, ox6Var, a04Var, oh4Var2, fr1Var, i);
        }
    }

    public static final void b(Object obj, ox6 ox6Var, a04 a04Var, String str, fr1 fr1Var, jt1 jt1Var, int i) {
        a04 a04Var2;
        fr1 fr1Var2;
        ox6 ox6Var2;
        String str2;
        bj4 bj4VarO = jt1Var.o(-513216493);
        int i2 = (bj4VarO.J(obj) ? 4 : 2) | i | (bj4VarO.J(ox6Var) ? 32 : 16) | (bj4VarO.j(a04Var) ? 256 : 128) | 3072;
        if (bj4VarO.A(i2 & 1, (i2 & 9363) != 9362)) {
            a04Var2 = a04Var;
            a(owa.f(obj, "Crossfade", bj4VarO, (i2 & 14) | 48), ox6Var, a04Var2, null, fr1Var, bj4VarO, i2 & 58352);
            ox6Var2 = ox6Var;
            fr1Var2 = fr1Var;
            str2 = "Crossfade";
        } else {
            a04Var2 = a04Var;
            fr1Var2 = fr1Var;
            ox6Var2 = ox6Var;
            bj4VarO.u();
            str2 = str;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new rb2(obj, ox6Var2, a04Var2, str2, fr1Var2, i);
        }
    }
}
