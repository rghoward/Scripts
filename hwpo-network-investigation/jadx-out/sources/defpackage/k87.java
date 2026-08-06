package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k87 {
    public final a0a a = b0a.b(l87.a.a);
    public final a0a b;
    public final li8 c;
    public final h30<g87<?>> d;
    public final h30<g87<?>> e;
    public g87<?> f;
    public int g;
    public j87 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public k87() {
        a0a a0aVarB = b0a.b(new h87());
        this.b = a0aVarB;
        this.c = yk2.b(a0aVarB);
        this.d = new h30<>();
        this.e = new h30<>();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(e87 e87Var, j87 j87Var, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        e87Var.getClass();
        if (j87Var.a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(j87Var);
            e87 e87Var2 = j87Var.a;
            sb.append("' is already added to dispatcher ");
            sb.append(e87Var2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.i : this.j;
        } else {
            linkedHashSet = this.k;
        }
        linkedHashSet.add(j87Var);
        j87Var.a = e87Var;
        ((h87) this.c.t.getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.n : this.l;
        } else {
            z = this.m;
        }
        j87Var.b(z);
    }

    public final void b() {
        boolean z;
        boolean z2;
        h87 h87Var;
        h30<g87<?>> h30Var = this.d;
        if (h30Var != null && h30Var.isEmpty()) {
            z = false;
            break;
        }
        Iterator<g87<?>> it = h30Var.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().d) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        h30<g87<?>> h30Var2 = this.e;
        if (h30Var2 != null && h30Var2.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator<g87<?>> it2 = h30Var2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().d) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((j87) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((j87) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((j87) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        g87<?> g87VarC = this.f;
        if (g87VarC == null) {
            g87VarC = c(0);
        }
        g87<?> g87VarC2 = this.f;
        if (g87VarC2 == null) {
            g87VarC2 = c(0);
        }
        if (xj5.a(g87VarC2, g87VarC)) {
            if (g87VarC2 == null) {
                h87Var = new h87();
            } else {
                ArrayList arrayList = new ArrayList();
                for (g87<?> g87Var : h30Var) {
                    if (g87Var.d) {
                        g87Var.b.getClass();
                    }
                }
                for (g87<?> g87Var2 : h30Var2) {
                    if (g87Var2.d) {
                        g87Var2.b.getClass();
                    }
                }
                T t = g87VarC2.a;
                hf3 hf3Var = g87VarC2.c;
                t.getClass();
                hf3Var.getClass();
                e96 e96VarF = ws0.f();
                rh1.o(arrayList, e96VarF);
                e96VarF.add(t);
                rh1.o(hf3Var, e96VarF);
                h87Var = new h87(arrayList.size(), ws0.e(e96VarF));
            }
            a0a a0aVar = this.b;
            if (xj5.a((h87) a0aVar.getValue(), h87Var)) {
                return;
            }
            a0aVar.l(null, h87Var);
            Iterator it6 = linkedHashSet.iterator();
            while (it6.hasNext()) {
                ((j87) it6.next()).getClass();
            }
            Iterator it7 = linkedHashSet2.iterator();
            while (it7.hasNext()) {
                ((j87) it7.next()).getClass();
            }
            Iterator it8 = linkedHashSet3.iterator();
            while (it8.hasNext()) {
                ((j87) it8.next()).getClass();
            }
        }
    }

    public final g87<?> c(int i) {
        g87<?> next;
        g87<?> next2;
        h30<g87<?>> h30Var = this.e;
        h30<g87<?>> h30Var2 = this.d;
        g87<?> g87Var = null;
        if (i == -1) {
            Iterator<g87<?>> it = h30Var2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.d);
            g87<?> g87Var2 = next;
            if (g87Var2 != null) {
                return g87Var2;
            }
            for (g87<?> g87Var3 : h30Var) {
                if (g87Var3.d) {
                    g87Var = g87Var3;
                    break;
                }
            }
            return g87Var;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator<g87<?>> it2 = h30Var2.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
            Iterator<g87<?>> it3 = h30Var.iterator();
            while (it3.hasNext()) {
                it3.next().getClass();
            }
            return null;
        }
        Iterator<g87<?>> it4 = h30Var2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!next2.d);
        g87<?> g87Var4 = next2;
        if (g87Var4 != null) {
            return g87Var4;
        }
        for (g87<?> g87Var5 : h30Var) {
            if (g87Var5.d) {
                g87Var = g87Var5;
                break;
            }
        }
        return g87Var;
    }
}
