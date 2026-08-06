package defpackage;

import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class en2<Transcode> {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public c c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public gn2.c h;
    public xk7 i;
    public Map<Class<?>, dva<?>> j;
    public Class<Transcode> k;
    public boolean l;
    public boolean m;
    public ko5 n;
    public p98 o;
    public k13 p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                kx6.a aVar = (kx6.a) arrayListB.get(i);
                ko5 ko5Var = aVar.a;
                List<ko5> list = aVar.b;
                if (!arrayList.contains(ko5Var)) {
                    arrayList.add(aVar.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listF = this.c.a().f(this.d);
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                kx6.a aVarA = ((kx6) listF.get(i)).a(this.d, this.e, this.f, this.i);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v16 sb6<?, ?, ?>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final <Data> defpackage.sb6<Data, ?, Transcode> c(java.lang.Class<Data> r24) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en2.c(java.lang.Class):sb6");
    }

    public final <X> xf3<X> d(X x) {
        xf3<X> xf3Var;
        zf3 zf3Var = this.c.a().b;
        Class<?> cls = x.getClass();
        synchronized (zf3Var) {
            ArrayList arrayList = zf3Var.a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    xf3Var = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                zf3.a aVar = (zf3.a) obj;
                if (aVar.a.isAssignableFrom(cls)) {
                    xf3Var = (xf3<X>) aVar.b;
                    break;
                }
            }
        }
        if (xf3Var != null) {
            return xf3Var;
        }
        throw new sl8.e("Failed to find source encoder for data class: " + x.getClass());
    }

    public final <Z> dva<Z> e(Class<Z> cls) {
        dva<Z> dvaVar = (dva) this.j.get(cls);
        if (dvaVar == null) {
            for (Map.Entry<Class<?>, dva<?>> entry : this.j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    dvaVar = (dva) entry.getValue();
                    break;
                }
            }
        }
        if (dvaVar != null) {
            return dvaVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return l2b.b;
        }
        x24.b(cls, ". If you wish to ignore unknown resource types, use the optional transformation methods.", "Missing transformation for ");
        return null;
    }
}
