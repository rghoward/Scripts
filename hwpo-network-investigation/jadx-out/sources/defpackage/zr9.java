package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zr9 extends ln4 implements au1, Iterable<Object>, zn5 {
    public int A;
    public int B;
    public final Object C;
    public boolean D;
    public int E;
    public ArrayList<vi4> F;
    public HashMap<vi4, gj4> G;
    public e27<f27> H;
    public int[] x;
    public int y;
    public Object[] z;

    public zr9() {
        super(21);
        this.x = new int[0];
        this.z = new Object[0];
        this.C = new Object();
        this.F = new ArrayList<>();
    }

    public static final void k1(cs9 cs9Var, int i) {
        while (cs9Var.v >= 0 && cs9Var.u <= i) {
            cs9Var.O();
            cs9Var.j();
        }
    }

    public final int h1(vi4 vi4Var) {
        if (this.D) {
            pt1.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!vi4Var.a()) {
            c78.a("Anchor refers to a group that was removed");
        }
        return vi4Var.a;
    }

    public final void i1() {
        this.G = new HashMap<>();
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new cp4(this, 0, this.y);
    }

    public final c37 j1(p20 p20Var, le7 le7Var) {
        int i;
        Object[] objArr = le7Var.a;
        int i2 = le7Var.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        for (int i7 = 0; i7 < i2; i7++) {
            if (!n1(od3.d(((mz6) objArr[i7]).e))) {
                t27 t27Var = new t27((Object) null);
                Object[] objArr2 = le7Var.a;
                int i8 = le7Var.b;
                for (int i9 = i3; i9 < i8; i9++) {
                    Object obj = objArr2[i9];
                    if (n1(od3.d(((mz6) obj).e))) {
                        t27Var.g(obj);
                    }
                }
                le7Var = t27Var;
                break;
            }
        }
        int i10 = 1;
        int i11 = 1;
        int i12 = 1;
        boolean z2 = true;
        vk3 vk3Var = new vk3(1 == true ? 1 : 0, this);
        if (le7Var.b > i10) {
            Comparable comparable = (Comparable) vk3Var.invoke(le7Var.b(i5));
            int i13 = le7Var.b;
            int i14 = i12;
            while (i14 < i13) {
                Comparable comparable2 = (Comparable) vk3Var.invoke(le7Var.b(i14));
                if (comparable.compareTo(comparable2) > 0) {
                    t27 t27Var2 = new t27(le7Var.b);
                    Object[] objArr3 = le7Var.a;
                    int i15 = le7Var.b;
                    for (int i16 = i4; i16 < i15; i16++) {
                        t27Var2.g(objArr3[i16]);
                    }
                    t27.b bVar = t27Var2.c;
                    if (bVar == null) {
                        bVar = new t27.b(t27Var2);
                        t27Var2.c = bVar;
                    }
                    if (bVar.t.b > i11) {
                        rh1.t(new ds3(vk3Var), bVar);
                    }
                    le7Var = t27Var2;
                    break;
                }
                i14++;
                comparable = comparable2;
            }
        }
        if (le7Var.d()) {
            c37 c37Var = z39.b;
            c37Var.getClass();
            return c37Var;
        }
        c37 c37VarB = z39.b();
        cs9 cs9VarM1 = m1();
        try {
            Object[] objArr4 = le7Var.a;
            int i17 = le7Var.b;
            for (int i18 = i6; i18 < i17; i18++) {
                mz6 mz6Var = (mz6) objArr4[i18];
                int iC = cs9VarM1.c(od3.d(mz6Var.e));
                int iG = cs9VarM1.G(cs9VarM1.b, iC);
                k1(cs9VarM1, iG);
                k1(cs9VarM1, iG);
                while (true) {
                    i = cs9VarM1.t;
                    if (i == iG || i == cs9VarM1.u) {
                        break;
                        break;
                    }
                    if (iG < cs9VarM1.u(i) + i) {
                        cs9VarM1.R();
                    } else {
                        cs9VarM1.N();
                    }
                }
                if (i != iG) {
                    pt1.a("Unexpected slot table structure");
                }
                cs9VarM1.R();
                cs9VarM1.a(iC - cs9VarM1.t);
                c37VarB.m(mz6Var, pt1.c(mz6Var.c, mz6Var, cs9VarM1, p20Var));
            }
            k1(cs9VarM1, Integer.MAX_VALUE);
            g2b g2bVar = g2b.a;
            return c37VarB;
        } finally {
            cs9VarM1.e(z);
        }
    }

    public final yr9 l1() {
        if (this.D) {
            aa0.c("Cannot read while a writer is pending");
            return null;
        }
        this.B++;
        return new yr9(this);
    }

    public final cs9 m1() {
        if (this.D) {
            pt1.a("Cannot start a writer when another writer is pending");
        }
        if (this.B > 0) {
            pt1.a("Cannot start a writer when a reader is pending");
        }
        this.D = true;
        this.E++;
        return new cs9(this);
    }

    public final boolean n1(vi4 vi4Var) {
        int iF;
        return vi4Var.a() && (iF = bs9.f(this.F, vi4Var.a, this.y)) >= 0 && xj5.a(this.F.get(iF), vi4Var);
    }

    public final gj4 o1(int i) {
        int i2;
        ArrayList<vi4> arrayList;
        int iF;
        HashMap<vi4, gj4> map = this.G;
        if (map != null) {
            if (this.D) {
                pt1.a("use active SlotWriter to crate an anchor for location instead");
            }
            vi4 vi4Var = (i < 0 || i >= (i2 = this.y) || (iF = bs9.f((arrayList = this.F), i, i2)) < 0) ? null : arrayList.get(iF);
            if (vi4Var != null) {
                return map.get(vi4Var);
            }
        }
        return null;
    }
}
