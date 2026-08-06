package defpackage;

import android.util.Log;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hn2<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends pt8<DataType, ResourceType>> b;
    public final eu8<ResourceType, Transcode> c;
    public final w58<List<Throwable>> d;
    public final String e;

    public hn2(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends pt8<DataType, ResourceType>> list, eu8<ResourceType, Transcode> eu8Var, w58<List<Throwable>> w58Var) {
        this.a = cls;
        this.b = list;
        this.c = eu8Var;
        this.d = w58Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
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
    public final kt8 a(int i, int i2, gn2.a aVar, xk7 xk7Var, a aVar2) {
        kt8 kt8VarA;
        dva dvaVar;
        uf3 uf3VarA;
        st8 st8Var;
        kt8 kt8Var;
        boolean z;
        ko5 pe2Var;
        w58<List<Throwable>> w58Var = this.d;
        List<Throwable> listB = w58Var.b();
        ov9.d(listB, "Argument must not be null");
        try {
            kt8<ResourceType> kt8VarB = b(aVar2, i, i2, xk7Var, listB);
            w58Var.a(listB);
            gn2 gn2Var = gn2.this;
            kf2 kf2Var = aVar.a;
            en2<R> en2Var = gn2Var.t;
            Class<?> cls = kt8VarB.get().getClass();
            if (kf2Var != kf2.w) {
                dva dvaVarE = en2Var.e((Class<Z>) cls);
                dvaVar = dvaVarE;
                kt8VarA = dvaVarE.a(gn2Var.A, kt8VarB, gn2Var.E, gn2Var.F);
            } else {
                kt8VarA = kt8VarB;
                dvaVar = null;
            }
            if (!kt8VarB.equals(kt8VarA)) {
                kt8VarB.a();
            }
            if (en2Var.c.a().d.a(kt8VarA.c()) != null) {
                st8 st8VarA = en2Var.c.a().d.a(kt8VarA.c());
                if (st8VarA == null) {
                    throw new sl8.d(kt8VarA.c());
                }
                uf3VarA = st8VarA.a(gn2Var.H);
                st8Var = st8VarA;
            } else {
                uf3VarA = uf3.v;
                st8Var = null;
            }
            ko5 ko5Var = gn2Var.R;
            ArrayList arrayListB = en2Var.b();
            int size = arrayListB.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    kt8Var = null;
                    z = false;
                    break;
                }
                kt8Var = null;
                if (((kx6.a) arrayListB.get(i3)).a.equals(ko5Var)) {
                    z = true;
                    break;
                }
                i3++;
            }
            Object obj = kt8VarA;
            if (gn2Var.G.d(!z, kf2Var, uf3VarA)) {
                if (st8Var == null) {
                    throw new sl8.d(kt8VarA.get().getClass());
                }
                int iOrdinal = uf3VarA.ordinal();
                if (iOrdinal == 0) {
                    pe2Var = new pe2(gn2Var.R, gn2Var.B);
                } else {
                    if (iOrdinal != 1) {
                        u.c(uf3VarA, "Unknown strategy: ");
                        return kt8Var;
                    }
                    pe2Var = new nt8(en2Var.c.a, gn2Var.R, gn2Var.B, gn2Var.E, gn2Var.F, dvaVar, cls, gn2Var.H);
                }
                kd6<Z> kd6Var = (kd6) kd6.x.b();
                kd6Var.w = false;
                kd6Var.v = 1;
                kd6Var.u = kt8VarA;
                gn2.b<?> bVar = gn2Var.y;
                bVar.a = pe2Var;
                bVar.b = st8Var;
                bVar.c = kd6Var;
                obj = kd6Var;
            }
            return this.c.a(obj, xk7Var);
        } catch (Throwable th) {
            w58Var.a(listB);
            throw th;
        }
    }

    public final kt8<ResourceType> b(a<DataType> aVar, int i, int i2, xk7 xk7Var, List<Throwable> list) throws rm4 {
        List<? extends pt8<DataType, ResourceType>> list2 = this.b;
        int size = list2.size();
        kt8<ResourceType> kt8VarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            pt8<DataType, ResourceType> pt8Var = list2.get(i3);
            try {
                if (pt8Var.b(aVar.a(), xk7Var)) {
                    kt8VarA = pt8Var.a(aVar.a(), i, i2, xk7Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + pt8Var, e);
                }
                list.add(e);
            }
            if (kt8VarA != null) {
                break;
            }
        }
        if (kt8VarA != null) {
            return kt8VarA;
        }
        throw new rm4(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
