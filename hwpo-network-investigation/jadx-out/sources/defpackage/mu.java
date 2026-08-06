package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mu implements fl6 {
    public final su<?> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ jz7[] u;
        public final /* synthetic */ mu v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jz7[] jz7VarArr, mu muVar, int i, int i2) {
            super(1);
            this.u = jz7VarArr;
            this.v = muVar;
            this.w = i;
            this.x = i2;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            jz7.a aVar2 = aVar;
            for (jz7 jz7Var : this.u) {
                if (jz7Var != null) {
                    long jA = this.v.a.b.a((((long) jz7Var.t) << 32) | (((long) jz7Var.u) & 4294967295L), (((long) this.w) << 32) | (((long) this.x) & 4294967295L), tq5.t);
                    aVar2.l(jz7Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
                }
            }
            return g2b.a;
        }
    }

    public mu(su<?> suVar) {
        this.a = suVar;
    }

    @Override // defpackage.fl6
    public final int a(qj5 qj5Var, List<? extends pj5> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).C(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).C(i));
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        jz7 jz7Var;
        int i;
        jz7 jz7Var2;
        int i2;
        int i3;
        int size = list.size();
        jz7[] jz7VarArr = new jz7[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            jz7Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            cl6 cl6Var = list.get(i4);
            Object objG = cl6Var.g();
            su.a aVar = objG instanceof su.a ? (su.a) objG : null;
            if (aVar != null && ((Boolean) aVar.t.getValue()).booleanValue()) {
                jz7 jz7VarE = cl6Var.E(j);
                long j3 = (((long) jz7VarE.u) & 4294967295L) | (((long) jz7VarE.t) << 32);
                g2b g2bVar = g2b.a;
                jz7VarArr[i4] = jz7VarE;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            cl6 cl6Var2 = list.get(i5);
            if (jz7VarArr[i5] == null) {
                jz7VarArr[i5] = cl6Var2.E(j);
            }
        }
        if (hl6Var.P0()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size != 0) {
                jz7Var2 = jz7VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = jz7Var2 != null ? jz7Var2.t : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            jz7 jz7Var3 = jz7VarArr[i8];
                            int i9 = jz7Var3 != null ? jz7Var3.t : 0;
                            if (i7 < i9) {
                                jz7Var2 = jz7Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            } else {
                jz7Var2 = null;
            }
            i2 = jz7Var2 != null ? jz7Var2.t : 0;
        }
        if (hl6Var.P0()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                jz7Var = jz7VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = jz7Var != null ? jz7Var.u : 0;
                    if (1 <= i10) {
                        while (true) {
                            jz7 jz7Var4 = jz7VarArr[i];
                            int i12 = jz7Var4 != null ? jz7Var4.u : 0;
                            if (i11 < i12) {
                                jz7Var = jz7Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = jz7Var != null ? jz7Var.u : 0;
        }
        if (!hl6Var.P0()) {
            this.a.c.setValue(new kg5((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return hl6Var.y0(i2, i3, if3.t, new a(jz7VarArr, this, i2, i3));
    }

    @Override // defpackage.fl6
    public final int e(qj5 qj5Var, List<? extends pj5> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).A(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).A(i));
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.fl6
    public final int g(qj5 qj5Var, List<? extends pj5> list, int i) {
        Integer numValueOf;
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.fl6
    public final int i(qj5 qj5Var, List<? extends pj5> list, int i) {
        Integer numValueOf;
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
