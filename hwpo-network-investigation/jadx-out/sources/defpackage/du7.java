package defpackage;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class du7 implements Comparable<du7> {
    public static final String u;
    public final g01 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static du7 a(String str) {
            str.getClass();
            g01 g01Var = o.a;
            tx0 tx0Var = new tx0();
            tx0Var.g0(str);
            return o.d(tx0Var, false);
        }

        public static du7 b(File file) {
            String str = du7.u;
            file.getClass();
            String string = file.toString();
            string.getClass();
            return a(string);
        }
    }

    static {
        String str = File.separator;
        str.getClass();
        u = str;
    }

    public du7(g01 g01Var) {
        g01Var.getClass();
        this.t = g01Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = o.a(this);
        g01 g01Var = this.t;
        if (iA == -1) {
            iA = 0;
        } else if (iA < g01Var.g() && g01Var.l(iA) == 92) {
            iA++;
        }
        int iG = g01Var.g();
        int i = iA;
        while (iA < iG) {
            if (g01Var.l(iA) == 47 || g01Var.l(iA) == 92) {
                arrayList.add(g01Var.s(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < g01Var.g()) {
            arrayList.add(g01Var.s(i, g01Var.g()));
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    public final int compareTo(du7 du7Var) {
        du7 du7Var2 = du7Var;
        du7Var2.getClass();
        return this.t.compareTo(du7Var2.t);
    }

    public final du7 e() {
        g01 g01Var = o.d;
        g01 g01Var2 = this.t;
        if (xj5.a(g01Var2, g01Var)) {
            return null;
        }
        g01 g01Var3 = o.a;
        if (xj5.a(g01Var2, g01Var3)) {
            return null;
        }
        g01 g01Var4 = o.b;
        if (xj5.a(g01Var2, g01Var4)) {
            return null;
        }
        g01 g01Var5 = o.e;
        g01Var2.getClass();
        g01Var5.getClass();
        int iG = g01Var2.g();
        byte[] bArr = g01Var5.t;
        if (g01Var2.o(iG - bArr.length, g01Var5, bArr.length) && (g01Var2.g() == 2 || g01Var2.o(g01Var2.g() - 3, g01Var3, 1) || g01Var2.o(g01Var2.g() - 3, g01Var4, 1))) {
            return null;
        }
        int iN = g01.n(g01Var2, g01Var3);
        if (iN == -1) {
            iN = g01.n(g01Var2, g01Var4);
        }
        if (iN == 2 && h() != null) {
            if (g01Var2.g() == 3) {
                return null;
            }
            return new du7(g01.t(g01Var2, 0, 3, 1));
        }
        if (iN == 1) {
            g01Var4.getClass();
            if (g01Var2.o(0, g01Var4, g01Var4.g())) {
                return null;
            }
        }
        if (iN != -1 || h() == null) {
            if (iN == -1) {
                return new du7(g01Var);
            }
            return iN == 0 ? new du7(g01.t(g01Var2, 0, 1, 1)) : new du7(g01.t(g01Var2, 0, iN, 1));
        }
        if (g01Var2.g() == 2) {
            return null;
        }
        return new du7(g01.t(g01Var2, 0, 2, 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof du7) && xj5.a(((du7) obj).t, this.t);
    }

    public final du7 f(du7 du7Var) {
        du7Var.getClass();
        g01 g01Var = du7Var.t;
        int iA = o.a(this);
        g01 g01Var2 = this.t;
        du7 du7Var2 = iA == -1 ? null : new du7(g01Var2.s(0, iA));
        int iA2 = o.a(du7Var);
        if (!xj5.a(du7Var2, iA2 == -1 ? null : new du7(g01Var.s(0, iA2)))) {
            p51.d("Paths of different roots cannot be relative to each other: ", this, " and ", du7Var);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = du7Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && xj5.a(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && g01Var2.g() == g01Var.g()) {
            return a.a(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(o.e) != -1) {
            p51.d("Impossible relative path to resolve: ", this, " and ", du7Var);
            return null;
        }
        if (xj5.a(g01Var, o.d)) {
            return this;
        }
        tx0 tx0Var = new tx0();
        g01 g01VarC = o.c(du7Var);
        if (g01VarC == null && (g01VarC = o.c(this)) == null) {
            g01VarC = o.f(u);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            tx0Var.Y(o.e);
            tx0Var.Y(g01VarC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            tx0Var.Y((g01) arrayListA.get(i));
            tx0Var.Y(g01VarC);
            i++;
        }
        return o.d(tx0Var, false);
    }

    public final du7 g(String str) {
        str.getClass();
        tx0 tx0Var = new tx0();
        tx0Var.g0(str);
        return o.b(this, o.d(tx0Var, false), false);
    }

    public final Character h() {
        g01 g01Var = o.a;
        g01 g01Var2 = this.t;
        if (g01.j(g01Var2, g01Var) != -1 || g01Var2.g() < 2 || g01Var2.l(1) != 58) {
            return null;
        }
        char cL = (char) g01Var2.l(0);
        if (('a' > cL || cL >= '{') && ('A' > cL || cL >= '[')) {
            return null;
        }
        return Character.valueOf(cL);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final File toFile() {
        return new File(this.t.w());
    }

    public final String toString() {
        return this.t.w();
    }
}
