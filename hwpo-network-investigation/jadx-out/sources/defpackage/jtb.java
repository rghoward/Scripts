package defpackage;

import io.ably.lib.util.AgentHeaderCreator;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jtb extends fy3 {
    public static final du7 x;
    public final du7 u;
    public final fy3 v;
    public final LinkedHashMap w;

    static {
        String str = du7.u;
        x = du7.a.a(AgentHeaderCreator.AGENT_DIVIDER);
    }

    public jtb(du7 du7Var, fy3 fy3Var, LinkedHashMap linkedHashMap) {
        fy3Var.getClass();
        this.u = du7Var;
        this.v = fy3Var;
        this.w = linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    @Override // defpackage.fy3
    public final hx3 E(du7 du7Var) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        du7Var.getClass();
        du7 du7Var2 = x;
        du7Var2.getClass();
        itb itbVarE = (itb) this.w.get(o.b(du7Var2, du7Var, true));
        if (itbVarE == null) {
            return null;
        }
        long j = itbVarE.h;
        if (j != -1) {
            zw3 zw3VarH = this.v.H(this.u);
            try {
                ni8 ni8Var = new ni8(zw3VarH.p(j));
                try {
                    itbVarE = otb.e(ni8Var, itbVarE);
                    itbVarE.getClass();
                    try {
                        ni8Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        ni8Var.close();
                    } catch (Throwable th5) {
                        fn3.b(th4, th5);
                    }
                    th2 = th4;
                    itbVarE = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    zw3VarH.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (zw3VarH != null) {
                    try {
                        zw3VarH.close();
                    } catch (Throwable th8) {
                        fn3.b(th7, th8);
                    }
                }
                th = th7;
                itbVarE = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = itbVarE.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(itbVarE.f);
        Long l2 = itbVarE.m;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = itbVarE.p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = itbVarE.k;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = itbVarE.n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = itbVarE.j;
                if (i != -1) {
                    int i2 = itbVarE.i;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = itbVarE.l;
        if (l4 == null) {
            Integer num3 = itbVarE.o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new hx3(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new hx3(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
    }

    @Override // defpackage.fy3
    public final zw3 H(du7 du7Var) {
        du7Var.getClass();
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.fy3
    public final yq9 J(du7 du7Var) throws IOException {
        du7Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.fy3
    public final kw9 K(du7 du7Var) throws Throwable {
        Throwable th;
        ni8 ni8Var;
        du7Var.getClass();
        du7 du7Var2 = x;
        du7Var2.getClass();
        itb itbVar = (itb) this.w.get(o.b(du7Var2, du7Var, true));
        if (itbVar == null) {
            fk.a(du7Var, "no such file: ");
            return null;
        }
        long j = itbVar.f;
        zw3 zw3VarH = this.v.H(this.u);
        try {
            ni8Var = new ni8(zw3VarH.p(itbVar.h));
            try {
                zw3VarH.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (zw3VarH != null) {
                try {
                    zw3VarH.close();
                } catch (Throwable th4) {
                    fn3.b(th3, th4);
                }
            }
            th = th3;
            ni8Var = null;
        }
        if (th != null) {
            throw th;
        }
        ni8Var.getClass();
        otb.e(ni8Var, null);
        return itbVar.g == 0 ? new k34(ni8Var, j, true) : new k34(new dc5(new k34(ni8Var, itbVar.e, true), new Inflater(true)), j, false);
    }

    @Override // defpackage.fy3
    public final yq9 h(du7 du7Var) throws IOException {
        du7Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.fy3
    public final void k(du7 du7Var, du7 du7Var2) throws IOException {
        du7Var.getClass();
        du7Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.fy3
    public final void p(du7 du7Var) throws IOException {
        du7Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.fy3
    public final void t(du7 du7Var) throws IOException {
        du7Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.fy3
    public final List<du7> y(du7 du7Var) throws IOException {
        du7Var.getClass();
        du7 du7Var2 = x;
        du7Var2.getClass();
        itb itbVar = (itb) this.w.get(o.b(du7Var2, du7Var, true));
        if (itbVar != null) {
            return th1.T(itbVar.q);
        }
        i34.c(du7Var, "not a directory: ");
        return null;
    }
}
