package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ba {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<O> {
        public final n9<O> a;
        public final o9<?, O> b;

        public a(o9 o9Var, n9 n9Var) {
            n9Var.getClass();
            o9Var.getClass();
            this.a = n9Var;
            this.b = o9Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final s66 a;
        public final ArrayList b = new ArrayList();

        public b(s66 s66Var) {
            this.a = s66Var;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v2 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final boolean a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.LinkedHashMap r0 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r3 = 0
            return r3
        L10:
            java.util.LinkedHashMap r0 = r3.e
            java.lang.Object r0 = r0.get(r4)
            ba$a r0 = (ba.a) r0
            if (r0 == 0) goto L1d
            n9<O> r1 = r0.a
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L37
            java.util.ArrayList r1 = r3.d
            boolean r2 = r1.contains(r4)
            if (r2 == 0) goto L37
            n9<O> r3 = r0.a
            o9<?, O> r0 = r0.b
            java.lang.Object r5 = r0.parseResult(r5, r6)
            r3.a(r5)
            r1.remove(r4)
            goto L46
        L37:
            java.util.LinkedHashMap r0 = r3.f
            r0.remove(r4)
            m9 r0 = new m9
            r0.<init>(r5, r6)
            android.os.Bundle r3 = r3.g
            r3.putParcelable(r4, r0)
        L46:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba.a(int, int, android.content.Intent):boolean");
    }

    public abstract void b(int i, o9 o9Var, Object obj);

    public final ca c(final String str, m76 m76Var, final o9 o9Var, final n9 n9Var) {
        str.getClass();
        o9Var.getClass();
        n9Var.getClass();
        s66 lifecycle = m76Var.getLifecycle();
        if (lifecycle.b().compareTo(s66.b.w) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(m76Var);
            s66.b bVarB = lifecycle.b();
            sb.append(" is attempting to register while current state is ");
            sb.append(bVarB);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        b bVar = (b) linkedHashMap.get(str);
        if (bVar == null) {
            bVar = new b(lifecycle);
        }
        g76 g76Var = new g76() { // from class: y9
            @Override // defpackage.g76
            public final void t(m76 m76Var2, s66.a aVar) {
                ba baVar = this.t;
                LinkedHashMap linkedHashMap2 = baVar.e;
                s66.a aVar2 = s66.a.ON_START;
                String str2 = str;
                if (aVar2 != aVar) {
                    if (s66.a.ON_STOP == aVar) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (s66.a.ON_DESTROY == aVar) {
                            baVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = baVar.g;
                LinkedHashMap linkedHashMap3 = baVar.f;
                o9 o9Var2 = o9Var;
                n9 n9Var2 = n9Var;
                linkedHashMap2.put(str2, new ba.a(o9Var2, n9Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    n9Var2.a(obj);
                }
                m9 m9Var = (m9) ty0.a(bundle, str2, m9.class);
                if (m9Var != null) {
                    bundle.remove(str2);
                    n9Var2.a(o9Var2.parseResult(m9Var.t, m9Var.u));
                }
            }
        };
        bVar.a.a(g76Var);
        bVar.b.add(g76Var);
        linkedHashMap.put(str, bVar);
        return new ca(this, str, o9Var);
    }

    public final da d(String str, o9 o9Var, n9 n9Var) {
        str.getClass();
        e(str);
        this.e.put(str, new a(o9Var, n9Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            n9Var.a(obj);
        }
        Bundle bundle = this.g;
        m9 m9Var = (m9) ty0.a(bundle, str, m9.class);
        if (m9Var != null) {
            bundle.remove(str);
            n9Var.a(o9Var.parseResult(m9Var.t, m9Var.u));
        }
        return new da(this, str, o9Var);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        final z9 z9Var = new z9(0);
        for (Number number : new rx1(new ik4(z9Var, new oh4() { // from class: dd9
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                obj.getClass();
                return z9Var.invoke();
            }
        }))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        px1.b("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbA = aa.a("Dropping pending result for request ", str, ": ");
            sbA.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbA.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((m9) ty0.a(bundle, str, m9.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        b bVar = (b) linkedHashMap2.get(str);
        if (bVar != null) {
            ArrayList arrayList = bVar.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                bVar.a.c((g76) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
