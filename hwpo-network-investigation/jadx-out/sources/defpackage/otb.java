package defpackage;

import io.ably.lib.util.AgentHeaderCreator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class otb {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = du7.u;
        du7 du7VarA = du7.a.a(AgentHeaderCreator.AGENT_DIVIDER);
        js7[] js7VarArr = {new js7(du7VarA, new itb(du7VarA, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(pi6.g(1));
        qi6.j(linkedHashMap, js7VarArr);
        for (itb itbVar : th1.N(arrayList, new ntb())) {
            if (((itb) linkedHashMap.put(itbVar.a, itbVar)) == null) {
                while (true) {
                    du7 du7Var = itbVar.a;
                    du7 du7VarE = du7Var.e();
                    if (du7VarE == null) {
                        break;
                    }
                    itb itbVar2 = (itb) linkedHashMap.get(du7VarE);
                    if (itbVar2 != null) {
                        itbVar2.q.add(du7Var);
                        break;
                    }
                    itb itbVar3 = new itb(du7VarE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMap.put(du7VarE, itbVar3);
                    itbVar3.q.add(du7Var);
                    itbVar = itbVar3;
                }
            }
        }
        return linkedHashMap;
    }

    public static final String b(int i) {
        ta1.a(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final itb c(final ni8 ni8Var) throws IOException {
        int iM = ni8Var.m();
        if (iM != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iM));
        }
        ni8Var.skip(4L);
        short sT = ni8Var.t();
        int i = sT & 65535;
        if ((sT & 1) != 0) {
            o03.a("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        int iT = ni8Var.t() & 65535;
        int iT2 = ni8Var.t() & 65535;
        int iT3 = ni8Var.t() & 65535;
        long jM = ((long) ni8Var.m()) & 4294967295L;
        final fl8 fl8Var = new fl8();
        fl8Var.t = ((long) ni8Var.m()) & 4294967295L;
        final fl8 fl8Var2 = new fl8();
        fl8Var2.t = ((long) ni8Var.m()) & 4294967295L;
        int iT4 = ni8Var.t() & 65535;
        int iT5 = ni8Var.t() & 65535;
        int iT6 = ni8Var.t() & 65535;
        ni8Var.skip(8L);
        final fl8 fl8Var3 = new fl8();
        fl8Var3.t = ((long) ni8Var.m()) & 4294967295L;
        String strU = ni8Var.u(iT4);
        if (z2a.p(strU, (char) 0)) {
            o03.a("bad zip: filename contains 0x00");
            return null;
        }
        long j = fl8Var2.t == 4294967295L ? 8L : 0L;
        if (fl8Var.t == 4294967295L) {
            j += 8;
        }
        if (fl8Var3.t == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final gl8 gl8Var = new gl8();
        final gl8 gl8Var2 = new gl8();
        final gl8 gl8Var3 = new gl8();
        final cl8 cl8Var = new cl8();
        d(ni8Var, iT5, new ci4() { // from class: ltb
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                final ni8 ni8Var2 = ni8Var;
                if (iIntValue == 1) {
                    cl8 cl8Var2 = cl8Var;
                    if (cl8Var2.t) {
                        o03.a("bad zip: zip64 extra repeated");
                        return null;
                    }
                    cl8Var2.t = true;
                    if (jLongValue < j2) {
                        o03.a("bad zip: zip64 extra too short");
                        return null;
                    }
                    fl8 fl8Var4 = fl8Var2;
                    long jP = fl8Var4.t;
                    if (jP == 4294967295L) {
                        jP = ni8Var2.p();
                    }
                    fl8Var4.t = jP;
                    fl8 fl8Var5 = fl8Var;
                    fl8Var5.t = fl8Var5.t == 4294967295L ? ni8Var2.p() : 0L;
                    fl8 fl8Var6 = fl8Var3;
                    fl8Var6.t = fl8Var6.t == 4294967295L ? ni8Var2.p() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        o03.a("bad zip: NTFS extra too short");
                        return null;
                    }
                    ni8Var2.skip(4L);
                    int i2 = (int) (jLongValue - 4);
                    final gl8 gl8Var4 = gl8Var;
                    final gl8 gl8Var5 = gl8Var2;
                    final gl8 gl8Var6 = gl8Var3;
                    otb.d(ni8Var2, i2, new ci4() { // from class: mtb
                        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.Long] */
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj3, Object obj4) throws IOException {
                            int iIntValue2 = ((Integer) obj3).intValue();
                            long jLongValue2 = ((Long) obj4).longValue();
                            if (iIntValue2 == 1) {
                                gl8 gl8Var7 = gl8Var4;
                                if (gl8Var7.t != 0) {
                                    o03.a("bad zip: NTFS extra attribute tag 0x0001 repeated");
                                    return null;
                                }
                                if (jLongValue2 != 24) {
                                    o03.a("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                                    return null;
                                }
                                ni8 ni8Var3 = ni8Var2;
                                gl8Var7.t = Long.valueOf(ni8Var3.p());
                                gl8Var5.t = Long.valueOf(ni8Var3.p());
                                gl8Var6.t = Long.valueOf(ni8Var3.p());
                            }
                            return g2b.a;
                        }
                    });
                }
                return g2b.a;
            }
        });
        if (j2 > 0 && !cl8Var.t) {
            o03.a("bad zip: zip64 extra required but absent");
            return null;
        }
        String strU2 = ni8Var.u(iT6);
        String str = du7.u;
        return new itb(du7.a.a(AgentHeaderCreator.AGENT_DIVIDER).g(strU), w2a.h(strU, AgentHeaderCreator.AGENT_DIVIDER, false), strU2, jM, fl8Var.t, fl8Var2.t, iT, fl8Var3.t, iT3, iT2, (Long) gl8Var.t, (Long) gl8Var2.t, (Long) gl8Var3.t, 57344);
    }

    public static final void d(ni8 ni8Var, int i, ci4 ci4Var) throws IOException {
        tx0 tx0Var = ni8Var.u;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                o03.a("bad zip: truncated header in extra field");
                return;
            }
            int iT = ni8Var.t() & 65535;
            long jT = ((long) ni8Var.t()) & 65535;
            long j2 = j - 4;
            if (j2 < jT) {
                o03.a("bad zip: truncated value in extra field");
                return;
            }
            ni8Var.n0(jT);
            long j3 = tx0Var.u;
            ci4Var.invoke(Integer.valueOf(iT), Long.valueOf(jT));
            long j4 = (tx0Var.u + jT) - j3;
            if (j4 < 0) {
                o03.a(pp2.a(iT, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    tx0Var.skip(j4);
                }
                j = j2 - jT;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final itb e(final ni8 ni8Var, itb itbVar) throws IOException {
        int iM = ni8Var.m();
        if (iM != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iM));
        }
        ni8Var.skip(2L);
        short sT = ni8Var.t();
        int i = sT & 65535;
        if ((sT & 1) != 0) {
            o03.a("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        ni8Var.skip(18L);
        long jT = ((long) ni8Var.t()) & 65535;
        int iT = ni8Var.t() & 65535;
        ni8Var.skip(jT);
        if (itbVar == null) {
            ni8Var.skip(iT);
            return null;
        }
        final gl8 gl8Var = new gl8();
        final gl8 gl8Var2 = new gl8();
        final gl8 gl8Var3 = new gl8();
        d(ni8Var, iT, new ci4() { // from class: ktb
            /* JADX WARN: Type inference failed for: r13v11, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r13v13, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r13v9, types: [T, java.lang.Integer] */
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        o03.a("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    ni8 ni8Var2 = ni8Var;
                    byte b = ni8Var2.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        o03.a("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    if (z) {
                        gl8Var.t = Integer.valueOf(ni8Var2.m());
                    }
                    if (z2) {
                        gl8Var2.t = Integer.valueOf(ni8Var2.m());
                    }
                    if (z3) {
                        gl8Var3.t = Integer.valueOf(ni8Var2.m());
                    }
                }
                return g2b.a;
            }
        });
        return new itb(itbVar.a, itbVar.b, itbVar.c, itbVar.d, itbVar.e, itbVar.f, itbVar.g, itbVar.h, itbVar.i, itbVar.j, itbVar.k, itbVar.l, itbVar.m, (Integer) gl8Var.t, (Integer) gl8Var2.t, (Integer) gl8Var3.t);
    }
}
