package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gp5<T> implements m93<T> {
    public final b<T> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> extends o3 {
        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(aVar.a, this.a) && xj5.a((aa3) aVar.b, (aa3) this.b);
        }

        public final int hashCode() {
            Object obj = this.a;
            return ((aa3) this.b).hashCode() + os2.a(0, (obj != null ? obj.hashCode() : 0) * 31, 31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> extends hp5<T, a<T>> {
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
        public final a a(int i, Object obj) {
            do2 do2Var = ca3.c;
            a aVar = new a();
            aVar.a = obj;
            aVar.b = do2Var;
            this.b.i(i, aVar);
            return aVar;
        }
    }

    public gp5(b<T> bVar) {
        this.a = bVar;
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
    @Override // defpackage.m93, defpackage.wv
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final <V extends fw> odb<V> a(cza<T, V> czaVar) {
        int[] iArr;
        Object[] objArr;
        b<T> bVar = this.a;
        zf5 zf5Var = bVar.b;
        d27 d27Var = new d27(zf5Var.e + 2);
        e27 e27Var = new e27(zf5Var.e);
        int[] iArr2 = zf5Var.b;
        Object[] objArr2 = zf5Var.c;
        long[] jArr = zf5Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            a aVar = (a) objArr2[i5];
                            d27Var.c(i6);
                            e27Var.i(i6, new ndb((fw) czaVar.a().invoke(aVar.a), (aa3) aVar.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!zf5Var.a(0)) {
            int i7 = d27Var.b;
            if (i7 < 0) {
                r.b("Index must be between 0 and size");
                return null;
            }
            d27Var.d(i7 + 1);
            int[] iArr3 = d27Var.a;
            int i8 = d27Var.b;
            if (i8 != 0) {
                gz3.e(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            d27Var.b++;
        }
        if (!zf5Var.a(bVar.a)) {
            d27Var.c(bVar.a);
        }
        int i9 = d27Var.b;
        if (i9 != 0) {
            int[] iArr4 = d27Var.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new odb<>(d27Var, e27Var, bVar.a, ca3.c);
    }
}
