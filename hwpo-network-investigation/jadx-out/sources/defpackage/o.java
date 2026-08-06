package defpackage;

import io.ably.lib.util.AgentHeaderCreator;
import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static final g01 a;
    public static final g01 b;
    public static final g01 c;
    public static final g01 d;
    public static final g01 e;

    static {
        g01 g01Var = g01.w;
        a = g01.a.c(AgentHeaderCreator.AGENT_DIVIDER);
        b = g01.a.c("\\");
        c = g01.a.c("/\\");
        d = g01.a.c(".");
        e = g01.a.c("..");
    }

    public static final int a(du7 du7Var) {
        g01 g01Var = du7Var.t;
        if (g01Var.g() != 0) {
            if (g01Var.l(0) != 47) {
                if (g01Var.l(0) == 92) {
                    if (g01Var.g() > 2 && g01Var.l(1) == 92) {
                        g01 g01Var2 = b;
                        g01Var2.getClass();
                        int i = g01Var.i(g01Var2.k(), 2);
                        return i == -1 ? g01Var.g() : i;
                    }
                } else if (g01Var.g() > 2 && g01Var.l(1) == 58 && g01Var.l(2) == 92) {
                    char cL = (char) g01Var.l(0);
                    if ('a' <= cL && cL < '{') {
                        return 3;
                    }
                    if ('A' <= cL && cL < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final du7 b(du7 du7Var, du7 du7Var2, boolean z) {
        du7Var2.getClass();
        if (a(du7Var2) != -1 || du7Var2.h() != null) {
            return du7Var2;
        }
        g01 g01VarC = c(du7Var);
        if (g01VarC == null && (g01VarC = c(du7Var2)) == null) {
            g01VarC = f(du7.u);
        }
        tx0 tx0Var = new tx0();
        tx0Var.Y(du7Var.t);
        if (tx0Var.u > 0) {
            tx0Var.Y(g01VarC);
        }
        tx0Var.Y(du7Var2.t);
        return d(tx0Var, z);
    }

    public static final g01 c(du7 du7Var) {
        g01 g01Var = du7Var.t;
        g01 g01Var2 = a;
        if (g01.j(g01Var, g01Var2) != -1) {
            return g01Var2;
        }
        g01 g01Var3 = du7Var.t;
        g01 g01Var4 = b;
        if (g01.j(g01Var3, g01Var4) != -1) {
            return g01Var4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113 A[EDGE_INSN: B:100:0x0113->B:82:0x0113 BREAK  A[LOOP:1: B:54:0x00ae->B:113:0x00ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0131  */
    public static final du7 d(tx0 tx0Var, boolean z) throws EOFException {
        g01 g01Var;
        long j;
        char cU;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        g01 g01Var2;
        int size;
        int i;
        long jY;
        g01 g01VarR;
        g01 g01Var3;
        tx0 tx0Var2 = new tx0();
        g01 g01VarE = null;
        int i2 = 0;
        while (true) {
            if (!tx0Var.q(0L, a)) {
                g01Var = b;
                if (!tx0Var.q(0L, g01Var)) {
                    break;
                }
            }
            byte b2 = tx0Var.readByte();
            if (g01VarE == null) {
                g01VarE = e(b2);
            }
            i2++;
        }
        boolean z4 = i2 >= 2 && xj5.a(g01VarE, g01Var);
        g01 g01Var4 = c;
        if (!z4) {
            if (i2 > 0) {
                g01VarE.getClass();
                tx0Var2.Y(g01VarE);
            } else {
                long jY2 = tx0Var.y(g01Var4);
                if (g01VarE == null) {
                    g01VarE = jY2 == -1 ? f(du7.u) : e(tx0Var.u(jY2));
                }
                if (xj5.a(g01VarE, g01Var) && tx0Var.u >= 2) {
                    j = -1;
                    if (tx0Var.u(1L) == 58 && (('a' <= (cU = (char) tx0Var.u(0L)) && cU < '{') || ('A' <= cU && cU < '['))) {
                        if (jY2 == 2) {
                            tx0Var2.i0(tx0Var, 3L);
                        } else {
                            tx0Var2.i0(tx0Var, 2L);
                        }
                    }
                } else {
                    j = -1;
                }
                g2b g2bVar = g2b.a;
            }
            if (tx0Var2.u > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList = new ArrayList();
            while (true) {
                z3 = tx0Var.z();
                g01Var2 = d;
                if (!z3) {
                    break;
                }
                jY = tx0Var.y(g01Var4);
                if (jY == j) {
                    g01VarR = tx0Var.r(tx0Var.u);
                } else {
                    g01VarR = tx0Var.r(jY);
                    tx0Var.readByte();
                }
                g01Var3 = e;
                if (xj5.a(g01VarR, g01Var3)) {
                    if (z2 || !arrayList.isEmpty()) {
                        if (z || (!z2 && (arrayList.isEmpty() || xj5.a(th1.G(arrayList), g01Var3)))) {
                            arrayList.add(g01VarR);
                        } else if (!z4 || arrayList.size() != 1) {
                            rh1.s(arrayList);
                        }
                    }
                } else if (xj5.a(g01VarR, g01Var2) && !xj5.a(g01VarR, g01.w)) {
                    arrayList.add(g01VarR);
                }
            }
            size = arrayList.size();
            for (i = 0; i < size; i++) {
                if (i > 0) {
                    tx0Var2.Y(g01VarE);
                }
                tx0Var2.Y((g01) arrayList.get(i));
            }
            if (tx0Var2.u == 0) {
                tx0Var2.Y(g01Var2);
            }
            return new du7(tx0Var2.r(tx0Var2.u));
        }
        g01VarE.getClass();
        tx0Var2.Y(g01VarE);
        tx0Var2.Y(g01VarE);
        j = -1;
        if (tx0Var2.u > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            z3 = tx0Var.z();
            g01Var2 = d;
            if (!z3) {
                break;
                break;
            }
            jY = tx0Var.y(g01Var4);
            if (jY == j) {
                g01VarR = tx0Var.r(tx0Var.u);
            } else {
                g01VarR = tx0Var.r(jY);
                tx0Var.readByte();
            }
            g01Var3 = e;
            if (xj5.a(g01VarR, g01Var3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(g01VarR);
            } else if (xj5.a(g01VarR, g01Var2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                tx0Var2.Y(g01VarE);
            }
            tx0Var2.Y((g01) arrayList.get(i));
        }
        if (tx0Var2.u == 0) {
            tx0Var2.Y(g01Var2);
        }
        return new du7(tx0Var2.r(tx0Var2.u));
    }

    public static final g01 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        z90.a(pp2.a(b2, "not a directory separator: "));
        return null;
    }

    public static final g01 f(String str) {
        if (xj5.a(str, AgentHeaderCreator.AGENT_DIVIDER)) {
            return a;
        }
        if (xj5.a(str, "\\")) {
            return b;
        }
        z90.a(ct1.a("not a directory separator: ", str));
        return null;
    }
}
