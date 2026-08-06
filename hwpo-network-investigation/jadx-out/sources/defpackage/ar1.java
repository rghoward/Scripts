package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ar1 implements kq1, rq1 {
    public static final vq1 h = new vq1();
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashSet d;
    public final hm3 e;
    public final AtomicReference<Boolean> f;
    public final tq1 g;

    public ar1(ArrayList arrayList, ArrayList arrayList2, tq1 tq1Var) {
        m1b m1bVar = m1b.t;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference<>();
        hm3 hm3Var = new hm3();
        this.e = hm3Var;
        this.g = tq1Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(qp1.c(hm3Var, hm3.class, m4a.class, wf8.class));
        int i = 0;
        arrayList3.add(qp1.c(this, rq1.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            qp1 qp1Var = (qp1) obj;
            if (qp1Var != null) {
                arrayList3.add(qp1Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((of8) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (hk5 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                for (Object obj3 : ((qp1) it2.next()).b.toArray()) {
                    if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.d.contains(obj3.toString())) {
                            it2.remove();
                            break;
                        }
                        this.d.add(obj3.toString());
                    }
                }
            }
            if (this.a.isEmpty()) {
                vd2.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                vd2.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                final qp1 qp1Var2 = (qp1) obj4;
                this.a.put(qp1Var2, new ts5(new of8() { // from class: wq1
                    @Override // defpackage.of8
                    public final Object get() {
                        qp1 qp1Var3 = qp1Var2;
                        return qp1Var3.f.a(new xu8(qp1Var3, this.a));
                    }
                }));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = this.f.get();
        if (bool != null) {
            h(this.a, bool.booleanValue());
        }
    }

    @Override // defpackage.kq1
    public final synchronized <T> of8<Set<T>> d(fg8<T> fg8Var) {
        p06 p06Var = (p06) this.c.get(fg8Var);
        if (p06Var != null) {
            return p06Var;
        }
        return h;
    }

    @Override // defpackage.kq1
    public final <T> tv2<T> e(fg8<T> fg8Var) {
        of8<T> of8VarF = f(fg8Var);
        if (of8VarF == null) {
            return new wk7(wk7.c, wk7.d);
        }
        return of8VarF instanceof wk7 ? (wk7) of8VarF : new wk7(null, of8VarF);
    }

    @Override // defpackage.kq1
    public final synchronized <T> of8<T> f(fg8<T> fg8Var) {
        yl7.b(fg8Var, "Null interface requested.");
        return (of8) this.b.get(fg8Var);
    }

    public final void h(HashMap map, boolean z) {
        ArrayDeque<fm3> arrayDeque;
        Set<Map.Entry> setEntrySet;
        for (Map.Entry entry : map.entrySet()) {
            qp1 qp1Var = (qp1) entry.getKey();
            of8 of8Var = (of8) entry.getValue();
            int i = qp1Var.d;
            if (i == 1 || (i == 2 && z)) {
                of8Var.get();
            }
        }
        hm3 hm3Var = this.e;
        synchronized (hm3Var) {
            try {
                arrayDeque = hm3Var.b;
                if (arrayDeque != null) {
                    hm3Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            for (fm3 fm3Var : arrayDeque) {
                fm3Var.getClass();
                synchronized (hm3Var) {
                    try {
                        ArrayDeque arrayDeque2 = hm3Var.b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(fm3Var);
                        } else {
                            synchronized (hm3Var) {
                                try {
                                    Map map2 = (Map) hm3Var.a.get(null);
                                    setEntrySet = map2 == null ? Collections.EMPTY_SET : map2.entrySet();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            for (Map.Entry entry2 : setEntrySet) {
                                ((Executor) entry2.getValue()).execute(new y13(1, entry2, fm3Var));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void i() {
        HashMap map = this.b;
        HashMap map2 = this.c;
        for (qp1 qp1Var : this.a.keySet()) {
            for (ay2 ay2Var : qp1Var.c) {
                boolean z = ay2Var.b == 2;
                fg8<?> fg8Var = ay2Var.a;
                if (z && !map2.containsKey(fg8Var)) {
                    Set set = Collections.EMPTY_SET;
                    p06 p06Var = new p06();
                    p06Var.b = null;
                    p06Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    p06Var.a.addAll(set);
                    map2.put(fg8Var, p06Var);
                } else if (map.containsKey(fg8Var)) {
                    continue;
                } else {
                    int i = ay2Var.b;
                    if (i == 1) {
                        throw new lv6("Unsatisfied dependency for component " + qp1Var + ": " + fg8Var);
                    }
                    if (i != 2) {
                        map.put(fg8Var, new wk7(wk7.c, wk7.d));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qp1 qp1Var = (qp1) obj;
            if (qp1Var.e == 0) {
                final of8 of8Var = (of8) this.a.get(qp1Var);
                Iterator it = qp1Var.b.iterator();
                while (it.hasNext()) {
                    fg8 fg8Var = (fg8) it.next();
                    HashMap map = this.b;
                    if (map.containsKey(fg8Var)) {
                        final wk7 wk7Var = (wk7) ((of8) map.get(fg8Var));
                        arrayList2.add(new Runnable() { // from class: xq1
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // java.lang.Runnable
                            public final void run() {
                                tv2.a<T> aVar;
                                wk7 wk7Var2 = wk7Var;
                                of8<T> of8Var2 = of8Var;
                                if (wk7Var2.b != wk7.d) {
                                    aa0.c("provide() can be called only once.");
                                    return;
                                }
                                synchronized (wk7Var2) {
                                    aVar = wk7Var2.a;
                                    wk7Var2.a = null;
                                    wk7Var2.b = of8Var2;
                                }
                                aVar.a(of8Var2);
                            }
                        });
                    } else {
                        map.put(fg8Var, of8Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final ArrayList k() {
        HashMap map = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            qp1 qp1Var = (qp1) entry.getKey();
            if (qp1Var.e != 0) {
                of8 of8Var = (of8) entry.getValue();
                Iterator it = qp1Var.b.iterator();
                while (it.hasNext()) {
                    fg8 fg8Var = (fg8) it.next();
                    if (!map2.containsKey(fg8Var)) {
                        map2.put(fg8Var, new HashSet());
                    }
                    ((Set) map2.get(fg8Var)).add(of8Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                final p06 p06Var = (p06) map.get(entry2.getKey());
                for (final of8 of8Var2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: yq1
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // java.lang.Runnable
                        public final void run() {
                            p06 p06Var2 = p06Var;
                            of8 of8Var3 = of8Var2;
                            synchronized (p06Var2) {
                                try {
                                    if (p06Var2.b == 0) {
                                        p06Var2.a.add((of8<T>) of8Var3);
                                    } else {
                                        p06Var2.b.add((T) of8Var3.get());
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                }
            } else {
                fg8 fg8Var2 = (fg8) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                p06 p06Var2 = new p06();
                p06Var2.b = null;
                p06Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                p06Var2.a.addAll(set);
                map.put(fg8Var2, p06Var2);
            }
        }
        return arrayList;
    }
}
