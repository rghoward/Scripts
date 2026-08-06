package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n76 extends s66 {
    public final boolean b;
    public rt3<l76, a> c = new rt3<>();
    public s66.b d;
    public final WeakReference<m76> e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList<s66.b> i;
    public final a0a j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public s66.b a;
        public g76 b;

        public final void a(m76 m76Var, s66.a aVar) {
            s66.b bVarA = aVar.a();
            s66.b bVar = this.a;
            bVar.getClass();
            if (bVarA.compareTo(bVar) < 0) {
                bVar = bVarA;
            }
            this.a = bVar;
            this.b.t(m76Var, aVar);
            this.a = bVarA;
        }
    }

    public n76(m76 m76Var, boolean z) {
        this.b = z;
        s66.b bVar = s66.b.u;
        this.d = bVar;
        this.i = new ArrayList<>();
        this.e = new WeakReference<>(m76Var);
        this.j = b0a.b(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.s66
    public final void a(l76 l76Var) {
        g76 nl8Var;
        a aVar;
        m76 m76Var;
        s66.a aVar2;
        l76Var.getClass();
        e("addObserver");
        s66.b bVar = this.d;
        s66.b bVar2 = s66.b.t;
        if (bVar != bVar2) {
            bVar2 = s66.b.u;
        }
        a aVar3 = new a();
        HashMap map = w76.a;
        boolean z = l76Var instanceof g76;
        boolean z2 = l76Var instanceof as2;
        if (z && z2) {
            nl8Var = new bs2((as2) l76Var, (g76) l76Var);
        } else if (z2) {
            nl8Var = new bs2((as2) l76Var, null);
        } else if (z) {
            nl8Var = (g76) l76Var;
        } else {
            Class<?> cls = l76Var.getClass();
            if (w76.b(cls) == 2) {
                Object obj = w76.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    nl8Var = new bq9(w76.a((Constructor) list.get(0), l76Var));
                } else {
                    int size = list.size();
                    yj4[] yj4VarArr = new yj4[size];
                    for (int i = 0; i < size; i++) {
                        yj4VarArr[i] = w76.a((Constructor) list.get(i), l76Var);
                    }
                    nl8Var = new tt1(yj4VarArr);
                }
            } else {
                nl8Var = new nl8(l76Var);
            }
        }
        aVar3.b = nl8Var;
        aVar3.a = bVar2;
        rt3<l76, a> rt3Var = this.c;
        pz8.c<l76, a> cVarD = rt3Var.d(l76Var);
        if (cVarD != null) {
            aVar = cVarD.u;
        } else {
            HashMap<K, pz8.c<K, V>> map2 = rt3Var.x;
            pz8.c<K, V> cVar = new pz8.c<>(l76Var, aVar3);
            rt3Var.w++;
            pz8.c<K, V> cVar2 = rt3Var.u;
            if (cVar2 == 0) {
                rt3Var.t = cVar;
                rt3Var.u = cVar;
            } else {
                cVar2.v = cVar;
                cVar.w = cVar2;
                rt3Var.u = cVar;
            }
            map2.put((K) l76Var, cVar);
            aVar = null;
        }
        if (aVar == null && (m76Var = this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            s66.b bVarD = d(l76Var);
            this.f++;
            while (aVar3.a.compareTo(bVarD) < 0 && this.c.x.containsKey(l76Var)) {
                s66.b bVar3 = aVar3.a;
                ArrayList<s66.b> arrayList = this.i;
                arrayList.add(bVar3);
                s66.a.C0240a c0240a = s66.a.Companion;
                s66.b bVar4 = aVar3.a;
                c0240a.getClass();
                bVar4.getClass();
                int iOrdinal = bVar4.ordinal();
                if (iOrdinal == 1) {
                    aVar2 = s66.a.ON_CREATE;
                } else if (iOrdinal != 2) {
                    aVar2 = iOrdinal != 3 ? null : s66.a.ON_RESUME;
                } else {
                    aVar2 = s66.a.ON_START;
                }
                if (aVar2 == null) {
                    v92.b(aVar3.a, "no event up from ");
                    return;
                } else {
                    aVar3.a(m76Var, aVar2);
                    arrayList.remove(arrayList.size() - 1);
                    bVarD = d(l76Var);
                }
            }
            if (!z3) {
                i();
            }
            this.f--;
        }
    }

    @Override // defpackage.s66
    public final s66.b b() {
        return this.d;
    }

    @Override // defpackage.s66
    public final void c(l76 l76Var) {
        l76Var.getClass();
        e("removeObserver");
        this.c.e(l76Var);
    }

    public final s66.b d(l76 l76Var) {
        HashMap<l76, pz8.c<l76, a>> map = this.c.x;
        pz8.c<l76, a> cVar = map.containsKey(l76Var) ? map.get(l76Var).w : null;
        s66.b bVar = cVar != null ? cVar.u.a : null;
        ArrayList<s66.b> arrayList = this.i;
        s66.b bVar2 = arrayList.isEmpty() ? null : (s66.b) p51.b(1, arrayList);
        s66.b bVar3 = this.d;
        bVar3.getClass();
        if (bVar == null || bVar.compareTo(bVar3) >= 0) {
            bVar = bVar3;
        }
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public final void e(String str) {
        if (this.b) {
            x20.h1().x.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            p.a(sk0.c("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(s66.a aVar) {
        aVar.getClass();
        e("handleLifecycleEvent");
        g(aVar.a());
    }

    public final void g(s66.b bVar) {
        if (this.d == bVar) {
            return;
        }
        m76 m76Var = this.e.get();
        s66.b bVar2 = this.d;
        bVar2.getClass();
        bVar.getClass();
        s66.b bVar3 = s66.b.u;
        s66.b bVar4 = s66.b.t;
        if (bVar2 == bVar3 && bVar == bVar4) {
            throw new IllegalStateException(("State must be at least '" + s66.b.v + "' to be moved to '" + bVar + "' in component " + m76Var).toString());
        }
        if (bVar2 == bVar4 && bVar2 != bVar) {
            throw new IllegalStateException(("State is '" + bVar4 + "' and cannot be moved to `" + bVar + "` in component " + m76Var).toString());
        }
        this.d = bVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        i();
        this.g = false;
        if (this.d == bVar4) {
            this.c = new rt3<>();
        }
    }

    public final void h(s66.b bVar) {
        bVar.getClass();
        e("setCurrentState");
        g(bVar);
    }

    public final void i() {
        s66.a aVar;
        m76 m76Var = this.e.get();
        if (m76Var == null) {
            aa0.c("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            rt3<l76, a> rt3Var = this.c;
            if (rt3Var.w != 0) {
                pz8.c<l76, a> cVar = rt3Var.t;
                cVar.getClass();
                s66.b bVar = cVar.u.a;
                pz8.c<l76, a> cVar2 = this.c.u;
                cVar2.getClass();
                s66.b bVar2 = cVar2.u.a;
                if (bVar == bVar2 && this.d == bVar2) {
                    break;
                }
                this.h = false;
                s66.b bVar3 = this.d;
                pz8.c<l76, a> cVar3 = this.c.t;
                cVar3.getClass();
                int iCompareTo = bVar3.compareTo(cVar3.u.a);
                ArrayList<s66.b> arrayList = this.i;
                if (iCompareTo < 0) {
                    rt3<l76, a> rt3Var2 = this.c;
                    pz8.b bVar4 = new pz8.b(rt3Var2.u, rt3Var2.t);
                    rt3Var2.v.put(bVar4, Boolean.FALSE);
                    while (bVar4.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) bVar4.next();
                        entry.getClass();
                        l76 l76Var = (l76) entry.getKey();
                        a aVar2 = (a) entry.getValue();
                        while (aVar2.a.compareTo(this.d) > 0 && !this.h && this.c.x.containsKey(l76Var)) {
                            s66.a.C0240a c0240a = s66.a.Companion;
                            s66.b bVar5 = aVar2.a;
                            c0240a.getClass();
                            s66.a aVarA = s66.a.C0240a.a(bVar5);
                            if (aVarA == null) {
                                v92.b(aVar2.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(aVarA.a());
                                aVar2.a(m76Var, aVarA);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                pz8.c<l76, a> cVar4 = this.c.u;
                if (!this.h && cVar4 != null && this.d.compareTo(cVar4.u.a) > 0) {
                    rt3<l76, a> rt3Var3 = this.c;
                    rt3Var3.getClass();
                    pz8.d dVar = new pz8.d();
                    rt3Var3.v.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        l76 l76Var2 = (l76) entry2.getKey();
                        a aVar3 = (a) entry2.getValue();
                        while (aVar3.a.compareTo(this.d) < 0 && !this.h && this.c.x.containsKey(l76Var2)) {
                            arrayList.add(aVar3.a);
                            s66.a.C0240a c0240a2 = s66.a.Companion;
                            s66.b bVar6 = aVar3.a;
                            c0240a2.getClass();
                            bVar6.getClass();
                            int iOrdinal = bVar6.ordinal();
                            if (iOrdinal == 1) {
                                aVar = s66.a.ON_CREATE;
                            } else if (iOrdinal != 2) {
                                aVar = iOrdinal != 3 ? null : s66.a.ON_RESUME;
                            } else {
                                aVar = s66.a.ON_START;
                            }
                            if (aVar == null) {
                                v92.b(aVar3.a, "no event up from ");
                                return;
                            } else {
                                aVar3.a(m76Var, aVar);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.h = false;
        this.j.setValue(this.d);
    }
}
