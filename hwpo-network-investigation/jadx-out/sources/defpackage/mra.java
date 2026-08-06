package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mra implements fl6 {
    public final v44 a;
    public final di.b b;
    public final float c;

    public mra(v44 v44Var, di.b bVar, float f) {
        this.a = v44Var;
        this.b = bVar;
        this.c = f;
    }

    @Override // defpackage.fl6
    public final int a(qj5 qj5Var, List<? extends pj5> list, int i) {
        int size = list.size();
        int iC = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iC += list.get(i2).C(i);
        }
        return iC;
    }

    @Override // defpackage.fl6
    public final gl6 d(final hl6 hl6Var, List<? extends cl6> list, final long j) {
        int iH;
        int size = list.size();
        final int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cl6 cl6Var = list.get(i2);
            if (xj5.a(yq5.c(cl6Var), "navigationIcon")) {
                final jz7 jz7VarE = cl6Var.E(xx1.a(0, 0, 0, 0, 14, j));
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    cl6 cl6Var2 = list.get(i3);
                    if (xj5.a(yq5.c(cl6Var2), "actionIcons")) {
                        final jz7 jz7VarE2 = cl6Var2.E(xx1.a(0, 0, 0, 0, 14, j));
                        if (xx1.h(j) == Integer.MAX_VALUE) {
                            iH = xx1.h(j);
                        } else {
                            iH = (xx1.h(j) - jz7VarE.t) - jz7VarE2.t;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i4 = iH;
                        int size3 = list.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            cl6 cl6Var3 = list.get(i5);
                            if (xj5.a(yq5.c(cl6Var3), "title")) {
                                final jz7 jz7VarE3 = cl6Var3.E(xx1.a(0, i4, 0, 0, 12, j));
                                e15 e15Var = fi.b;
                                int iR = jz7VarE3.R(e15Var) != Integer.MIN_VALUE ? jz7VarE3.R(e15Var) : 0;
                                float fInvoke = this.a.invoke();
                                int iB = Float.isNaN(fInvoke) ? 0 : wk6.b(fInvoke);
                                final int iMax = Math.max(hl6Var.n1(this.c), jz7VarE3.u);
                                if (xx1.g(j) == Integer.MAX_VALUE) {
                                    i = iMax;
                                } else {
                                    int i6 = iB + iMax;
                                    if (i6 >= 0) {
                                        i = i6;
                                    }
                                }
                                final int i7 = iR;
                                return hl6Var.y0(xx1.h(j), i, if3.t, new oh4(i, jz7VarE3, jz7VarE2, j, hl6Var, this, i7, iMax) { // from class: lra
                                    public final /* synthetic */ int u;
                                    public final /* synthetic */ jz7 v;
                                    public final /* synthetic */ jz7 w;
                                    public final /* synthetic */ long x;
                                    public final /* synthetic */ hl6 y;
                                    public final /* synthetic */ mra z;

                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        int iH2;
                                        jz7.a aVar = (jz7.a) obj;
                                        jz7 jz7Var = this.t;
                                        int i8 = jz7Var.u;
                                        int i9 = this.u;
                                        jz7.a.t(aVar, jz7Var, 0, (i9 - i8) / 2);
                                        int iMax2 = Math.max(this.y.n1(py.c), jz7Var.t);
                                        jz7 jz7Var2 = this.w;
                                        int i10 = jz7Var2.t;
                                        di.b bVar = this.z.b;
                                        jz7 jz7Var3 = this.v;
                                        int i11 = jz7Var3.t;
                                        long j2 = this.x;
                                        int iA = bVar.a(i11, xx1.h(j2), tq5.t);
                                        if (iA >= iMax2) {
                                            if (jz7Var3.t + iA > xx1.h(j2) - i10) {
                                                iH2 = (xx1.h(j2) - i10) - (jz7Var3.t + iA);
                                            }
                                            jz7.a.t(aVar, jz7Var3, iA, (i9 - jz7Var3.u) / 2);
                                            jz7.a.t(aVar, jz7Var2, xx1.h(j2) - jz7Var2.t, (i9 - jz7Var2.u) / 2);
                                            return g2b.a;
                                        }
                                        iH2 = iMax2 - iA;
                                        iA += iH2;
                                        jz7.a.t(aVar, jz7Var3, iA, (i9 - jz7Var3.u) / 2);
                                        jz7.a.t(aVar, jz7Var2, xx1.h(j2) - jz7Var2.t, (i9 - jz7Var2.u) / 2);
                                        return g2b.a;
                                    }
                                });
                            }
                            i5++;
                            this = this;
                        }
                        ab6.b("Collection contains no element matching the predicate.");
                        fl.a();
                        return null;
                    }
                    i3++;
                    this = this;
                }
                ab6.b("Collection contains no element matching the predicate.");
                fl.a();
                return null;
            }
        }
        ab6.b("Collection contains no element matching the predicate.");
        fl.a();
        return null;
    }

    @Override // defpackage.fl6
    public final int e(qj5 qj5Var, List<? extends pj5> list, int i) {
        int size = list.size();
        int iA = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA += list.get(i2).A(i);
        }
        return iA;
    }

    @Override // defpackage.fl6
    public final int g(qj5 qj5Var, List<? extends pj5> list, int i) {
        Integer numValueOf;
        int iN1 = qj5Var.n1(this.c);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).o(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).o(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iN1, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.fl6
    public final int i(qj5 qj5Var, List<? extends pj5> list, int i) {
        Integer numValueOf;
        int iN1 = qj5Var.n1(this.c);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).c0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).c0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iN1, numValueOf != null ? numValueOf.intValue() : 0);
    }
}
