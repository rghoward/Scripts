package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q57 {
    public final g57 a;
    public final d57 b;
    public h67 c;
    public Bundle d;
    public Bundle[] e;
    public final h30<r47> f = new h30<>();
    public final a0a g;
    public final a0a h;
    public final li8 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public m76 n;
    public r57 o;
    public final ArrayList p;
    public s66.b q;
    public final i57 r;
    public final r87 s;
    public final LinkedHashMap t;
    public oh4<? super r47, g2b> u;
    public j57 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final am9 z;

    /* JADX WARN: Type inference failed for: r1v11, types: [i57] */
    public q57(g57 g57Var, d57 d57Var) {
        this.a = g57Var;
        this.b = d57Var;
        hf3 hf3Var = hf3.t;
        this.g = b0a.b(hf3Var);
        a0a a0aVarB = b0a.b(hf3Var);
        this.h = a0aVarB;
        this.i = yk2.b(a0aVarB);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = s66.b.u;
        this.r = new g76() { // from class: i57
            @Override // defpackage.g76
            public final void t(m76 m76Var, s66.a aVar) {
                s66.b bVarA = aVar.a();
                q57 q57Var = this.t;
                q57Var.q = bVarA;
                if (q57Var.c != null) {
                    ArrayList arrayListU = th1.U(q57Var.f);
                    int size = arrayListU.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListU.get(i);
                        i++;
                        r47 r47Var = (r47) obj;
                        r47Var.getClass();
                        u47 u47Var = r47Var.A;
                        u47Var.getClass();
                        u47Var.a.w = aVar.a();
                        u47Var.d = aVar.a();
                        u47Var.b();
                    }
                }
            }
        };
        this.s = new r87();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = ty1.b(2, xx0.u);
    }

    public static c67 e(int i, c67 c67Var, c67 c67Var2, boolean z) {
        if (c67Var.u.d == i && (c67Var2 == null || (c67Var.equals(c67Var2) && xj5.a(c67Var.v, c67Var2.v)))) {
            return c67Var;
        }
        h67 h67Var = c67Var instanceof h67 ? (h67) c67Var : null;
        if (h67Var == null) {
            h67Var = c67Var.v;
            h67Var.getClass();
        }
        return h67Var.y.c(i, h67Var, c67Var2, z);
    }

    public static /* synthetic */ void p(q57 q57Var, r47 r47Var) {
        q57Var.o(r47Var, false, new h30<>());
    }

    public final void a(c67 c67Var, Bundle bundle, r47 r47Var, List<r47> list) {
        r47 r47VarPrevious;
        r47 r47VarPrevious2;
        c57 c57Var = this.a.c;
        c67 c67Var2 = r47Var.u;
        boolean z = c67Var2 instanceof q54;
        h30<r47> h30Var = this.f;
        if (!z) {
            while (!h30Var.isEmpty() && (h30Var.last().u instanceof q54) && n(h30Var.last().u.u.d, true, false)) {
            }
        }
        h30<r47> h30Var2 = new h30();
        r47 r47Var2 = null;
        if (c67Var instanceof h67) {
            c67 c67Var3 = c67Var2;
            do {
                c67Var3.getClass();
                c67Var3 = c67Var3.v;
                if (c67Var3 != null) {
                    ListIterator<r47> listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            r47VarPrevious2 = null;
                            break;
                        }
                        r47VarPrevious2 = listIterator.previous();
                    } while (!xj5.a(r47VarPrevious2.u, c67Var3));
                    r47 r47VarA = r47VarPrevious2;
                    if (r47VarA == null) {
                        r47VarA = r47.a.a(c57Var, c67Var3, bundle, i(), this.o);
                    }
                    h30Var2.addFirst(r47VarA);
                    if (!h30Var.isEmpty() && h30Var.last().u == c67Var3) {
                        p(this, h30Var.last());
                    }
                }
                if (c67Var3 == null) {
                    break;
                }
            } while (c67Var3 != c67Var);
        }
        c67 c67Var4 = h30Var2.isEmpty() ? c67Var2 : ((r47) h30Var2.first()).u;
        while (c67Var4 != null && d(c67Var4.u.d, c67Var4) != c67Var4) {
            c67Var4 = c67Var4.v;
            if (c67Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<r47> listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        r47VarPrevious = null;
                        break;
                    }
                    r47VarPrevious = listIterator2.previous();
                } while (!xj5.a(r47VarPrevious.u, c67Var4));
                r47 r47VarA2 = r47VarPrevious;
                if (r47VarA2 == null) {
                    r47VarA2 = r47.a.a(c57Var, c67Var4, c67Var4.d(bundle2), i(), this.o);
                }
                h30Var2.addFirst(r47VarA2);
            }
        }
        if (!h30Var2.isEmpty()) {
            c67Var2 = ((r47) h30Var2.first()).u;
        }
        while (!h30Var.isEmpty() && (h30Var.last().u instanceof h67)) {
            c67 c67Var5 = h30Var.last().u;
            c67Var5.getClass();
            if (((h67) c67Var5).y.b.c(c67Var2.u.d) != null) {
                break;
            } else {
                p(this, h30Var.last());
            }
        }
        r47 r47VarJ = h30Var.j();
        if (r47VarJ == null) {
            r47VarJ = (r47) h30Var2.j();
        }
        if (!xj5.a(r47VarJ != null ? r47VarJ.u : null, this.c)) {
            ListIterator<r47> listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                r47 r47VarPrevious3 = listIterator3.previous();
                c67 c67Var6 = r47VarPrevious3.u;
                h67 h67Var = this.c;
                h67Var.getClass();
                if (xj5.a(c67Var6, h67Var)) {
                    r47Var2 = r47VarPrevious3;
                    break;
                }
            }
            r47 r47VarA3 = r47Var2;
            if (r47VarA3 == null) {
                h67 h67Var2 = this.c;
                h67Var2.getClass();
                h67 h67Var3 = this.c;
                h67Var3.getClass();
                r47VarA3 = r47.a.a(c57Var, h67Var2, h67Var3.d(bundle), i(), this.o);
            }
            h30Var2.addFirst(r47VarA3);
        }
        for (r47 r47Var3 : h30Var2) {
            Object obj = this.t.get(this.s.b(r47Var3.u.t));
            if (obj == null) {
                p.a(av.a(new StringBuilder("NavigatorBackStack for "), c67Var.t, " should already be created"));
                return;
            }
            ((g57.a) obj).g(r47Var3);
        }
        h30Var.addAll(h30Var2);
        h30Var.addLast(r47Var);
        ArrayList arrayListL = th1.L(h30Var2, r47Var);
        int size = arrayListL.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListL.get(i);
            i++;
            r47 r47Var4 = (r47) obj2;
            h67 h67Var4 = r47Var4.u.v;
            if (h67Var4 != null) {
                k(r47Var4, f(h67Var4.u.d));
            }
        }
    }

    public final boolean b() {
        h30<r47> h30Var;
        while (true) {
            h30Var = this.f;
            if (h30Var.isEmpty() || !(h30Var.last().u instanceof h67)) {
                break;
            }
            p(this, h30Var.last());
        }
        r47 r47VarL = h30Var.l();
        ArrayList arrayList = this.y;
        if (r47VarL != null) {
            arrayList.add(r47VarL);
        }
        this.x++;
        t();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList arrayListU = th1.U(arrayList);
            arrayList.clear();
            int size = arrayListU.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListU.get(i2);
                i2++;
                r47 r47Var = (r47) obj;
                for (g57.b bVar : th1.T(this.p)) {
                    c67 c67Var = r47Var.u;
                    r47Var.A.a();
                    bVar.a();
                }
                this.z.f(r47Var);
            }
            ArrayList arrayList2 = new ArrayList(h30Var);
            a0a a0aVar = this.g;
            a0aVar.getClass();
            a0aVar.l(null, arrayList2);
            ArrayList arrayListQ = q();
            a0a a0aVar2 = this.h;
            a0aVar2.getClass();
            a0aVar2.l(null, arrayListQ);
        }
        return r47VarL != null;
    }

    public final boolean c(ArrayList arrayList, c67 c67Var, boolean z, boolean z2) {
        boolean z3;
        cl8 cl8Var = new cl8();
        h30 h30Var = new h30();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z3 = z2;
                break;
            }
            int i3 = i2 + 1;
            p87 p87Var = (p87) arrayList.get(i2);
            cl8 cl8Var2 = new cl8();
            r47 r47VarLast = this.f.last();
            z3 = z2;
            j57 j57Var = new j57(cl8Var2, cl8Var, this, z3, h30Var);
            p87Var.getClass();
            r47VarLast.getClass();
            this.v = j57Var;
            p87Var.e(r47VarLast, z3);
            this.v = null;
            if (!cl8Var2.t) {
                break;
            }
            i2 = i3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.l;
            if (!z) {
                n8a.a aVar = new n8a.a(new n8a(ed9.d(c67Var, new k57()), new l57(i, this)));
                while (aVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((c67) aVar.next()).u.d);
                    z47 z47Var = (z47) h30Var.j();
                    linkedHashMap.put(numValueOf, z47Var != null ? z47Var.a.a : null);
                }
            }
            if (!h30Var.isEmpty()) {
                a57 a57Var = ((z47) h30Var.first()).a;
                n8a.a aVar2 = new n8a.a(new n8a(ed9.d(d(a57Var.b, null), new m57(i)), new n57(i, this)));
                while (aVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((c67) aVar2.next()).u.d), a57Var.a);
                }
                if (linkedHashMap.values().contains(a57Var.a)) {
                    this.m.put(a57Var.a, h30Var);
                }
            }
        }
        this.b.invoke();
        return cl8Var.t;
    }

    public final c67 d(int i, c67 c67Var) {
        c67 c67Var2;
        h67 h67Var = this.c;
        if (h67Var == null) {
            return null;
        }
        if (h67Var.u.d == i) {
            if (c67Var == null) {
                return h67Var;
            }
            if (xj5.a(h67Var, c67Var) && c67Var.v == null) {
                return this.c;
            }
        }
        r47 r47VarL = this.f.l();
        if (r47VarL == null || (c67Var2 = r47VarL.u) == null) {
            c67Var2 = this.c;
            c67Var2.getClass();
        }
        return e(i, c67Var2, c67Var, false);
    }

    public final r47 f(int i) {
        r47 r47VarPrevious;
        h30<r47> h30Var = this.f;
        ListIterator<r47> listIterator = h30Var.listIterator(h30Var.size());
        do {
            if (!listIterator.hasPrevious()) {
                r47VarPrevious = null;
                break;
            }
            r47VarPrevious = listIterator.previous();
        } while (r47VarPrevious.u.u.d != i);
        r47 r47Var = r47VarPrevious;
        if (r47Var != null) {
            return r47Var;
        }
        StringBuilder sbB = t43.b(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbB.append(g());
        throw new IllegalArgumentException(sbB.toString().toString());
    }

    public final c67 g() {
        r47 r47VarL = this.f.l();
        if (r47VarL != null) {
            return r47VarL.u;
        }
        return null;
    }

    public final h67 h() {
        h67 h67Var = this.c;
        if (h67Var != null) {
            h67Var.getClass();
            return h67Var;
        }
        aa0.c("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final s66.b i() {
        return this.n == null ? s66.b.v : this.q;
    }

    public final h67 j() {
        c67 c67Var;
        r47 r47VarL = this.f.l();
        if (r47VarL == null || (c67Var = r47VarL.u) == null) {
            c67Var = this.c;
            c67Var.getClass();
        }
        h67 h67Var = c67Var instanceof h67 ? (h67) c67Var : null;
        if (h67Var != null) {
            return h67Var;
        }
        h67 h67Var2 = c67Var.v;
        h67Var2.getClass();
        return h67Var2;
    }

    public final void k(r47 r47Var, r47 r47Var2) {
        this.j.put(r47Var, r47Var2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(r47Var2) == null) {
            linkedHashMap.put(r47Var2, new j60());
        }
        Object obj = linkedHashMap.get(r47Var2);
        obj.getClass();
        ((j60) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x021b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0228 A[LOOP:5: B:109:0x0220->B:111:0x0228, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0285  */
    /* JADX WARN: Code duplicated, block: B:117:0x0291  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:131:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:137:0x031e A[Catch: all -> 0x0333, TryCatch #0 {all -> 0x0333, blocks: (B:134:0x0302, B:135:0x0318, B:137:0x031e, B:139:0x032e, B:143:0x0336), top: B:166:0x0302 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x034b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0302 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x02c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0335 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[LOOP:8: B:135:0x0318->B:188:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0089 A[PHI: r11
      0x0089: PHI (r11v20 java.util.ListIterator<r47>) = 
      (r11v10 java.util.ListIterator<r47>)
      (r11v10 java.util.ListIterator<r47>)
      (r11v10 java.util.ListIterator<r47>)
      (r11v11 java.util.ListIterator<r47>)
     binds: [B:24:0x0087, B:27:0x008f, B:28:0x0091, B:190:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    public final void l(final c67 c67Var, Bundle bundle, k77 k77Var) {
        boolean zN;
        boolean z;
        boolean z2;
        int iNextIndex;
        c67 c67Var2;
        h30<r47> h30Var;
        p87 p87VarB;
        c67 c67Var3;
        l77 l77Var;
        k77.a aVar;
        String str;
        int i;
        s87 s87VarB;
        ListIterator listIterator;
        int iNextIndex2;
        h67 h67Var;
        r47 r47VarPrevious;
        ListIterator<r47> listIterator2;
        boolean z3;
        c67Var.getClass();
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            ((g57.a) it.next()).d = true;
        }
        final cl8 cl8Var = new cl8();
        if (k77Var == null) {
            zN = false;
        } else {
            String str2 = k77Var.j;
            if (str2 != null) {
                boolean z4 = k77Var.d;
                boolean z5 = k77Var.e;
                str2.getClass();
                h30<r47> h30Var2 = this.f;
                if (h30Var2.isEmpty()) {
                    zN = false;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ListIterator<r47> listIterator3 = h30Var2.listIterator(h30Var2.d());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            r47VarPrevious = null;
                            break;
                        }
                        r47VarPrevious = listIterator3.previous();
                        r47 r47Var = r47VarPrevious;
                        c67 c67Var4 = r47Var.u;
                        Bundle bundleA = r47Var.A.a();
                        c67Var4.getClass();
                        f67 f67Var = c67Var4.u;
                        f67Var.getClass();
                        if (xj5.a(f67Var.e, str2)) {
                            listIterator2 = listIterator3;
                            z3 = true;
                        } else {
                            c67.b bVarA = f67Var.a(str2);
                            if (f67Var.a.equals(bVarA != null ? bVarA.t : null)) {
                                Bundle bundle2 = bVarA.u;
                                if (bundleA == null || bundle2 == null) {
                                    listIterator2 = listIterator3;
                                } else {
                                    Set<String> setKeySet = bundle2.keySet();
                                    setKeySet.getClass();
                                    Iterator<T> it2 = setKeySet.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            String str3 = (String) it2.next();
                                            str3.getClass();
                                            if (bundleA.containsKey(str3)) {
                                                listIterator2 = listIterator3;
                                                p47 p47Var = bVarA.t.f().get(str3);
                                                m77<Object> m77Var = p47Var != null ? p47Var.a : null;
                                                Object obj = m77Var != null ? m77Var.get(bundle2, str3) : null;
                                                Object obj2 = m77Var != null ? m77Var.get(bundleA, str3) : null;
                                                if (m77Var == null || m77Var.valueEquals(obj, obj2)) {
                                                    listIterator3 = listIterator2;
                                                    bundle2 = bundle2;
                                                }
                                            } else {
                                                listIterator2 = listIterator3;
                                            }
                                        } else {
                                            listIterator2 = listIterator3;
                                            z3 = true;
                                        }
                                    }
                                }
                            } else {
                                listIterator2 = listIterator3;
                            }
                            z3 = false;
                        }
                        if (z4 || !z3) {
                            arrayList.add(this.s.b(r47Var.u.t));
                        }
                        if (z3) {
                            break;
                        } else {
                            listIterator3 = listIterator2;
                        }
                    }
                    r47 r47Var2 = r47VarPrevious;
                    c67 c67Var5 = r47Var2 != null ? r47Var2.u : null;
                    if (c67Var5 == null) {
                        Log.i("NavController", "Ignoring popBackStack to route " + str2 + " as it was not found on the current back stack");
                        zN = false;
                    } else {
                        zN = c(arrayList, c67Var5, z4, z5);
                    }
                }
            } else {
                int i2 = k77Var.c;
                if (i2 != -1) {
                    zN = n(i2, k77Var.d, k77Var.e);
                } else {
                    zN = false;
                }
            }
        }
        final Bundle bundleD = c67Var.d(bundle);
        if (k77Var != null && k77Var.b && this.l.containsKey(Integer.valueOf(c67Var.u.d))) {
            cl8Var.t = r(c67Var.u.d, bundleD, k77Var);
            z2 = false;
        } else {
            if (k77Var == null || !k77Var.a) {
                z = false;
            } else {
                r47 r47VarL = this.f.l();
                h30<r47> h30Var3 = this.f;
                ListIterator<r47> listIterator4 = h30Var3.listIterator(h30Var3.d());
                while (true) {
                    if (listIterator4.hasPrevious()) {
                        if (listIterator4.previous().u == c67Var) {
                            iNextIndex = listIterator4.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z = false;
                } else if (c67Var instanceof h67) {
                    int i3 = h67.z;
                    int i4 = 0;
                    List listE = cd9.e(new pva(ed9.d((h67) c67Var, new g67(i4)), new o57(i4)));
                    if (this.f.v - iNextIndex == listE.size()) {
                        h30<r47> h30Var4 = this.f;
                        List<r47> listSubList = h30Var4.subList(iNextIndex, h30Var4.v);
                        ArrayList arrayList2 = new ArrayList(ph1.n(listSubList, 10));
                        Iterator<T> it3 = listSubList.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(Integer.valueOf(((r47) it3.next()).u.u.d));
                        }
                        if (arrayList2.equals(listE)) {
                            h30Var = new h30();
                            while (ws0.g(this.f) >= iNextIndex) {
                                r47 r47Var3 = (r47) rh1.r(this.f);
                                s(r47Var3);
                                r47 r47Var4 = new r47(r47Var3.t, r47Var3.u, r47Var3.u.d(bundle), r47Var3.w, r47Var3.x, r47Var3.y, r47Var3.z);
                                u47 u47Var = r47Var4.A;
                                s66.b bVar = r47Var3.w;
                                u47Var.getClass();
                                bVar.getClass();
                                u47Var.d = bVar;
                                u47 u47Var2 = r47Var4.A;
                                s66.b bVar2 = r47Var3.A.k;
                                u47Var2.getClass();
                                bVar2.getClass();
                                u47Var2.k = bVar2;
                                u47Var2.b();
                                h30Var.addFirst(r47Var4);
                            }
                            for (r47 r47Var5 : h30Var) {
                                h67Var = r47Var5.u.v;
                                if (h67Var != null) {
                                    k(r47Var5, f(h67Var.u.d));
                                }
                                this.f.addLast(r47Var5);
                            }
                            for (r47 r47Var6 : h30Var) {
                                p87VarB = this.s.b(r47Var6.u.t);
                                c67Var3 = r47Var6.u;
                                if (c67Var3 == null) {
                                    c67Var3 = null;
                                }
                                if (c67Var3 == null) {
                                    l77Var = new l77();
                                    l77Var.b = true;
                                    g2b g2bVar = g2b.a;
                                    aVar = l77Var.a;
                                    aVar.a = true;
                                    aVar.b = l77Var.c;
                                    str = l77Var.e;
                                    if (str != null) {
                                        boolean z6 = l77Var.f;
                                        boolean z7 = l77Var.g;
                                        aVar.d = str;
                                        i = -1;
                                        aVar.c = -1;
                                        aVar.e = z6;
                                        aVar.f = z7;
                                    } else {
                                        i = -1;
                                        aVar.b(l77Var.d, l77Var.f, l77Var.g);
                                    }
                                    aVar.a();
                                    p87VarB.c(c67Var3);
                                    s87VarB = p87VarB.b();
                                    synchronized (s87VarB.a) {
                                        try {
                                            ArrayList arrayListU = th1.U((Collection) s87VarB.e.t.getValue());
                                            listIterator = arrayListU.listIterator(arrayListU.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    if (xj5.a(((r47) listIterator.previous()).y, r47Var6.y)) {
                                                        iNextIndex2 = listIterator.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = i;
                                                    break;
                                                }
                                            }
                                            arrayListU.set(iNextIndex2, r47Var6);
                                            a0a a0aVar = s87VarB.b;
                                            a0aVar.getClass();
                                            a0aVar.l(null, arrayListU);
                                            g2b g2bVar2 = g2b.a;
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                } else if (r47VarL == null || (c67Var2 = r47VarL.u) == null || c67Var.u.d != c67Var2.u.d) {
                    z = false;
                } else {
                    h30Var = new h30();
                    while (ws0.g(this.f) >= iNextIndex) {
                        r47 r47Var7 = (r47) rh1.r(this.f);
                        s(r47Var7);
                        r47 r47Var8 = new r47(r47Var7.t, r47Var7.u, r47Var7.u.d(bundle), r47Var7.w, r47Var7.x, r47Var7.y, r47Var7.z);
                        u47 u47Var3 = r47Var8.A;
                        s66.b bVar3 = r47Var7.w;
                        u47Var3.getClass();
                        bVar3.getClass();
                        u47Var3.d = bVar3;
                        u47 u47Var4 = r47Var8.A;
                        s66.b bVar4 = r47Var7.A.k;
                        u47Var4.getClass();
                        bVar4.getClass();
                        u47Var4.k = bVar4;
                        u47Var4.b();
                        h30Var.addFirst(r47Var8);
                    }
                    while (r7.hasNext()) {
                        h67Var = r47Var5.u.v;
                        if (h67Var != null) {
                            k(r47Var5, f(h67Var.u.d));
                        }
                        this.f.addLast(r47Var5);
                    }
                    while (r6.hasNext()) {
                        p87VarB = this.s.b(r47Var6.u.t);
                        c67Var3 = r47Var6.u;
                        if (c67Var3 == null) {
                            c67Var3 = null;
                        }
                        if (c67Var3 == null) {
                            l77Var = new l77();
                            l77Var.b = true;
                            g2b g2bVar3 = g2b.a;
                            aVar = l77Var.a;
                            aVar.a = true;
                            aVar.b = l77Var.c;
                            str = l77Var.e;
                            if (str != null) {
                                boolean z8 = l77Var.f;
                                boolean z9 = l77Var.g;
                                aVar.d = str;
                                i = -1;
                                aVar.c = -1;
                                aVar.e = z8;
                                aVar.f = z9;
                            } else {
                                i = -1;
                                aVar.b(l77Var.d, l77Var.f, l77Var.g);
                            }
                            aVar.a();
                            p87VarB.c(c67Var3);
                            s87VarB = p87VarB.b();
                            synchronized (s87VarB.a) {
                                ArrayList arrayListU2 = th1.U((Collection) s87VarB.e.t.getValue());
                                listIterator = arrayListU2.listIterator(arrayListU2.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (xj5.a(((r47) listIterator.previous()).y, r47Var6.y)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = i;
                                        break;
                                    }
                                }
                                arrayListU2.set(iNextIndex2, r47Var6);
                                a0a a0aVar2 = s87VarB.b;
                                a0aVar2.getClass();
                                a0aVar2.l(null, arrayListU2);
                                g2b g2bVar4 = g2b.a;
                            }
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                r47 r47VarA = r47.a.a(this.a.c, c67Var, bundleD, i(), this.o);
                p87 p87VarB2 = this.s.b(c67Var.t);
                List listH = ws0.h(r47VarA);
                this.u = new oh4() { // from class: h57
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        r47 r47Var9 = (r47) obj3;
                        r47Var9.getClass();
                        cl8Var.t = true;
                        this.a(c67Var, bundleD, r47Var9, hf3.t);
                        return g2b.a;
                    }
                };
                p87VarB2.d(listH, k77Var);
                this.u = null;
            }
            z2 = z;
        }
        this.b.invoke();
        Iterator it4 = this.t.values().iterator();
        while (it4.hasNext()) {
            ((g57.a) it4.next()).d = false;
        }
        if (zN || cl8Var.t || z2) {
            b();
        } else {
            t();
        }
    }

    public final void m(String str, k77 k77Var) {
        str.getClass();
        if (this.c == null) {
            v92.c("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, 46);
            return;
        }
        h67 h67VarJ = j();
        c67.b bVarK = h67VarJ.k(str, true, h67VarJ);
        if (bVarK == null) {
            sa1.a(aa.a("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), this.c);
            return;
        }
        c67 c67Var = bVarK.t;
        Bundle bundleD = c67Var.d(bVarK.u);
        if (bundleD == null) {
            bundleD = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
        }
        int i = c67.x;
        String str2 = c67Var.u.e;
        Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : BuildConfig.FLAVOR);
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleD.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        l(c67Var, bundleD, k77Var);
    }

    public final boolean n(int i, boolean z, boolean z2) {
        c67 c67Var;
        f67 f67Var;
        h30<r47> h30Var = this.f;
        if (h30Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = th1.M(h30Var).iterator();
        do {
            if (!it.hasNext()) {
                c67Var = null;
                break;
            }
            c67Var = ((r47) it.next()).u;
            String str = c67Var.t;
            f67Var = c67Var.u;
            p87 p87VarB = this.s.b(str);
            if (z || f67Var.d != i) {
                arrayList.add(p87VarB);
            }
        } while (f67Var.d != i);
        if (c67Var != null) {
            return c(arrayList, c67Var, z, z2);
        }
        int i2 = c67.x;
        Log.i("NavController", "Ignoring popBackStack to destination " + c67.a.a(this.a.c, i) + " as it was not found on the current back stack");
        return false;
    }

    public final void o(r47 r47Var, boolean z, h30<z47> h30Var) {
        r57 r57Var;
        li8 li8Var;
        Set set;
        r47Var.getClass();
        h30<r47> h30Var2 = this.f;
        r47 r47VarLast = h30Var2.last();
        if (!xj5.a(r47VarLast, r47Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(r47Var.u);
            c67 c67Var = r47VarLast.u;
            sb.append(", which is not the top of the back stack (");
            sb.append(c67Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        rh1.r(h30Var2);
        g57.a aVar = (g57.a) this.t.get(this.s.b(r47VarLast.u.t));
        boolean z2 = true;
        if ((aVar == null || (li8Var = aVar.f) == null || (set = (Set) li8Var.t.getValue()) == null || !set.contains(r47VarLast)) && !this.k.containsKey(r47VarLast)) {
            z2 = false;
        }
        s66.b bVar = r47VarLast.A.j.d;
        s66.b bVar2 = s66.b.v;
        if (bVar.compareTo(bVar2) >= 0) {
            if (z) {
                r47VarLast.a(bVar2);
                h30Var.addFirst(new z47(r47VarLast));
            }
            if (z2) {
                r47VarLast.a(bVar2);
            } else {
                r47VarLast.a(s66.b.t);
                s(r47VarLast);
            }
        }
        if (z || z2 || (r57Var = this.o) == null) {
            return;
        }
        String str = r47VarLast.y;
        str.getClass();
        vhb vhbVar = (vhb) r57Var.t.remove(str);
        if (vhbVar != null) {
            vhbVar.a();
        }
    }

    public final ArrayList q() {
        s66.b bVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bVar = s66.b.w;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((g57.a) it.next()).f.t.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                r47 r47Var = (r47) obj;
                if (!arrayList.contains(r47Var) && r47Var.A.k.compareTo(bVar) < 0) {
                    arrayList2.add(obj);
                }
            }
            rh1.o(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (r47 r47Var2 : this.f) {
            r47 r47Var3 = r47Var2;
            if (!arrayList.contains(r47Var3) && r47Var3.A.k.compareTo(bVar) >= 0) {
                arrayList3.add(r47Var2);
            }
        }
        rh1.o(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((r47) obj2).u instanceof h67)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean r(int i, final Bundle bundle, k77 k77Var) {
        c67 c67VarH;
        r47 r47Var;
        c67 c67Var;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        int i2 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (xj5.a((String) it.next(), str)) {
                it.remove();
            }
        }
        h30<z47> h30Var = (h30) fza.a(this.m).remove(str);
        c57 c57Var = this.a.c;
        ArrayList arrayList = new ArrayList();
        r47 r47VarL = this.f.l();
        if (r47VarL == null || (c67VarH = r47VarL.u) == null) {
            c67VarH = h();
        }
        if (h30Var != null) {
            for (z47 z47Var : h30Var) {
                a57 a57Var = z47Var.a;
                a57 a57Var2 = z47Var.a;
                c67 c67VarE = e(a57Var.b, c67VarH, null, true);
                if (c67VarE == null) {
                    int i3 = c67.x;
                    n87.b("Restore State failed: destination ", c67.a.a(c57Var, a57Var2.b), " cannot be found from the current destination ", c67VarH);
                    return false;
                }
                s66.b bVarI = i();
                r57 r57Var = this.o;
                c57Var.getClass();
                bVarI.getClass();
                Bundle bundle3 = a57Var2.c;
                if (bundle3 != null) {
                    Context context = c57Var.a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = a57Var2.a;
                Bundle bundle4 = a57Var2.d;
                str2.getClass();
                arrayList.add(new r47(c57Var, c67VarE, bundle2, bVarI, r57Var, str2, bundle4));
                c67VarH = c67VarE;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((r47) obj).u instanceof h67)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            r47 r47Var2 = (r47) obj2;
            List list = (List) th1.H(arrayList2);
            if (xj5.a((list == null || (r47Var = (r47) th1.G(list)) == null || (c67Var = r47Var.u) == null) ? null : c67Var.t, r47Var2.u.t)) {
                list.add(r47Var2);
            } else {
                arrayList2.add(ws0.j(r47Var2));
            }
        }
        final cl8 cl8Var = new cl8();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            p87 p87VarB = this.s.b(((r47) th1.y(list2)).u.t);
            final el8 el8Var = new el8();
            final ArrayList arrayList4 = arrayList;
            this.u = new oh4() { // from class: p57
                @Override // defpackage.oh4
                public final Object invoke(Object obj4) {
                    List<r47> listSubList;
                    r47 r47Var3 = (r47) obj4;
                    r47Var3.getClass();
                    cl8Var.t = true;
                    ArrayList arrayList5 = arrayList4;
                    int iIndexOf = arrayList5.indexOf(r47Var3);
                    if (iIndexOf != -1) {
                        el8 el8Var2 = el8Var;
                        int i6 = iIndexOf + 1;
                        listSubList = arrayList5.subList(el8Var2.t, i6);
                        el8Var2.t = i6;
                    } else {
                        listSubList = hf3.t;
                    }
                    this.a(r47Var3.u, bundle, r47Var3, listSubList);
                    return g2b.a;
                }
            };
            p87VarB.d(list2, k77Var);
            this.u = null;
            arrayList = arrayList4;
        }
        return cl8Var.t;
    }

    public final void s(r47 r47Var) {
        r47Var.getClass();
        r47 r47Var2 = (r47) this.j.remove(r47Var);
        if (r47Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        j60 j60Var = (j60) linkedHashMap.get(r47Var2);
        Integer numValueOf = j60Var != null ? Integer.valueOf(j60Var.a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            g57.a aVar = (g57.a) this.t.get(this.s.b(r47Var2.u.t));
            if (aVar != null) {
                aVar.b(r47Var2);
            }
            linkedHashMap.remove(r47Var2);
        }
    }

    public final void t() {
        j60 j60Var;
        li8 li8Var;
        Set set;
        ArrayList arrayListU = th1.U(this.f);
        if (arrayListU.isEmpty()) {
            return;
        }
        ArrayList arrayListJ = ws0.j(((r47) th1.G(arrayListU)).u);
        ArrayList arrayList = new ArrayList();
        if (th1.G(arrayListJ) instanceof q54) {
            Iterator it = th1.M(arrayListU).iterator();
            while (it.hasNext()) {
                c67 c67Var = ((r47) it.next()).u;
                arrayList.add(c67Var);
                if (!(c67Var instanceof q54) && !(c67Var instanceof h67)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (r47 r47Var : th1.M(arrayListU)) {
            s66.b bVar = r47Var.A.k;
            c67 c67Var2 = r47Var.u;
            c67 c67Var3 = (c67) th1.A(arrayListJ);
            s66.b bVar2 = s66.b.x;
            s66.b bVar3 = s66.b.w;
            if (c67Var3 != null && c67Var3.u.d == c67Var2.u.d) {
                if (bVar != bVar2) {
                    g57.a aVar = (g57.a) this.t.get(this.s.b(r47Var.u.t));
                    if (xj5.a((aVar == null || (li8Var = aVar.f) == null || (set = (Set) li8Var.t.getValue()) == null) ? null : Boolean.valueOf(set.contains(r47Var)), Boolean.TRUE) || ((j60Var = (j60) this.k.get(r47Var)) != null && j60Var.a.get() == 0)) {
                        map.put(r47Var, bVar3);
                    } else {
                        map.put(r47Var, bVar2);
                    }
                }
                c67 c67Var4 = (c67) th1.A(arrayList);
                if (c67Var4 != null && c67Var4.u.d == c67Var2.u.d) {
                    rh1.q(arrayList);
                }
                rh1.q(arrayListJ);
                h67 h67Var = c67Var2.v;
                if (h67Var != null) {
                    arrayListJ.add(h67Var);
                }
            } else if (arrayList.isEmpty() || c67Var2.u.d != ((c67) th1.y(arrayList)).u.d) {
                r47Var.a(s66.b.v);
            } else {
                c67 c67Var5 = (c67) rh1.q(arrayList);
                if (bVar == bVar2) {
                    r47Var.a(bVar3);
                } else if (bVar != bVar3) {
                    map.put(r47Var, bVar3);
                }
                h67 h67Var2 = c67Var5.v;
                if (h67Var2 != null && !arrayList.contains(h67Var2)) {
                    arrayList.add(h67Var2);
                }
            }
        }
        int size = arrayListU.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListU.get(i);
            i++;
            r47 r47Var2 = (r47) obj;
            s66.b bVar4 = (s66.b) map.get(r47Var2);
            if (bVar4 != null) {
                r47Var2.a(bVar4);
            } else {
                r47Var2.A.b();
            }
        }
    }
}
