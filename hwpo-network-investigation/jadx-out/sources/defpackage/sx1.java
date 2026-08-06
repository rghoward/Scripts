package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sx1 {
    public int b;
    public boolean c;
    public final vx1 d;
    public final a e;
    public sx1 f;
    public bw9 i;
    public HashSet<sx1> a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a A;
        public static final /* synthetic */ a[] B;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("NONE", 0);
            a aVar2 = new a("LEFT", 1);
            t = aVar2;
            a aVar3 = new a("TOP", 2);
            u = aVar3;
            a aVar4 = new a("RIGHT", 3);
            v = aVar4;
            a aVar5 = new a("BOTTOM", 4);
            w = aVar5;
            a aVar6 = new a("BASELINE", 5);
            x = aVar6;
            a aVar7 = new a("CENTER", 6);
            y = aVar7;
            a aVar8 = new a("CENTER_X", 7);
            z = aVar8;
            a aVar9 = new a("CENTER_Y", 8);
            A = aVar9;
            B = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) B.clone();
        }
    }

    public sx1(vx1 vx1Var, a aVar) {
        this.d = vx1Var;
        this.e = aVar;
    }

    public final void a(sx1 sx1Var, int i, int i2) {
        if (sx1Var == null) {
            g();
            return;
        }
        this.f = sx1Var;
        if (sx1Var.a == null) {
            sx1Var.a = new HashSet<>();
        }
        HashSet<sx1> hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
    }

    public final void b(int i, cmb cmbVar, ArrayList arrayList) {
        HashSet<sx1> hashSet = this.a;
        if (hashSet != null) {
            Iterator<sx1> it = hashSet.iterator();
            while (it.hasNext()) {
                rp4.a(it.next().d, i, arrayList, cmbVar);
            }
        }
    }

    public final int c() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int d() {
        sx1 sx1Var;
        if (this.d.i0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (sx1Var = this.f) == null || sx1Var.d.i0 != 8) ? this.g : i;
    }

    public final boolean e() {
        sx1 sx1Var;
        HashSet<sx1> hashSet = this.a;
        if (hashSet != null) {
            for (sx1 sx1Var2 : hashSet) {
                vx1 vx1Var = sx1Var2.d;
                a aVar = sx1Var2.e;
                switch (aVar.ordinal()) {
                    case 0:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        sx1Var = null;
                        break;
                    case 1:
                        sx1Var = vx1Var.L;
                        break;
                    case 2:
                        sx1Var = vx1Var.M;
                        break;
                    case 3:
                        sx1Var = vx1Var.J;
                        break;
                    case 4:
                        sx1Var = vx1Var.K;
                        break;
                    default:
                        sx0.a(aVar.name());
                        return false;
                }
                if (sx1Var.f()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f != null;
    }

    public final void g() {
        HashSet<sx1> hashSet;
        sx1 sx1Var = this.f;
        if (sx1Var != null && (hashSet = sx1Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void h() {
        bw9 bw9Var = this.i;
        if (bw9Var == null) {
            this.i = new bw9(bw9.a.t);
        } else {
            bw9Var.f();
        }
    }

    public final void i(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.j0 + ":" + this.e.toString();
    }
}
