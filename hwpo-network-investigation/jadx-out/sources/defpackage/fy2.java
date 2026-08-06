package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class fy2 implements by2 {
    public final dmb d;
    public int f;
    public int g;
    public dmb a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.t;
    public int h = 1;
    public t03 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

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

        static {
            a aVar = new a("UNKNOWN", 0);
            t = aVar;
            a aVar2 = new a("HORIZONTAL_DIMENSION", 1);
            u = aVar2;
            a aVar3 = new a("VERTICAL_DIMENSION", 2);
            v = aVar3;
            a aVar4 = new a("LEFT", 3);
            w = aVar4;
            a aVar5 = new a("RIGHT", 4);
            x = aVar5;
            a aVar6 = new a("TOP", 5);
            y = aVar6;
            a aVar7 = new a("BOTTOM", 6);
            z = aVar7;
            a aVar8 = new a("BASELINE", 7);
            A = aVar8;
            B = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
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

    public fy2(dmb dmbVar) {
        this.d = dmbVar;
    }

    @Override // defpackage.by2
    public final void a(by2 by2Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((fy2) obj).j) {
                return;
            }
        }
        this.c = true;
        dmb dmbVar = this.a;
        if (dmbVar != null) {
            dmbVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        fy2 fy2Var = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            fy2 fy2Var2 = (fy2) obj2;
            if (!(fy2Var2 instanceof t03)) {
                i++;
                fy2Var = fy2Var2;
            }
        }
        if (fy2Var != null && i == 1 && fy2Var.j) {
            t03 t03Var = this.i;
            if (t03Var != null) {
                if (!t03Var.j) {
                    return;
                } else {
                    this.f = this.h * t03Var.g;
                }
            }
            d(fy2Var.g + this.f);
        }
        dmb dmbVar2 = this.a;
        if (dmbVar2 != null) {
            dmbVar2.a(this);
        }
    }

    public final void b(dmb dmbVar) {
        this.k.add(dmbVar);
        if (this.j) {
            dmbVar.a(dmbVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            by2 by2Var = (by2) obj;
            by2Var.a(by2Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.j0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
