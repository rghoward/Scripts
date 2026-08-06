package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x78 extends ek4<x78, a> implements cu6 {
    private static final x78 DEFAULT_INSTANCE;
    private static volatile tt7<x78> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private xi5.c<String> strings_ = af8.w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ek4.a<x78, a> implements cu6 {
        public a() {
            super(x78.DEFAULT_INSTANCE);
        }
    }

    static {
        x78 x78Var = new x78();
        DEFAULT_INSTANCE = x78Var;
        ek4.o(x78.class, x78Var);
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
    public static void q(x78 x78Var, Iterable iterable) {
        xi5.c<String> cVar = x78Var.strings_;
        if (!cVar.s()) {
            int size = cVar.size();
            x78Var.strings_ = cVar.h(size == 0 ? 10 : size * 2);
        }
        List list = x78Var.strings_;
        Charset charset = xi5.a;
        if (!(iterable instanceof i26)) {
            if (iterable instanceof l98) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    ac4.c(str);
                    return;
                }
                list.add(obj);
            }
            return;
        }
        List<?> listM = ((i26) iterable).m();
        i26 i26Var = (i26) list;
        int size4 = list.size();
        for (Object obj2 : listM) {
            if (obj2 == null) {
                String str2 = "Element at index " + (i26Var.size() - size4) + " is null.";
                for (int size5 = i26Var.size() - 1; size5 >= size4; size5--) {
                    i26Var.remove(size5);
                }
                ac4.c(str2);
                return;
            }
            if (obj2 instanceof e01) {
                i26Var.K();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                e01.f(bArr, 0, bArr.length);
                i26Var.K();
            } else {
                i26Var.add((String) obj2);
            }
        }
    }

    public static x78 r() {
        return DEFAULT_INSTANCE;
    }

    public static a t() {
        return (a) ((ek4.a) DEFAULT_INSTANCE.h(ek4.f.x));
    }

    @Override // defpackage.ek4
    public final Object h(ek4.f fVar) {
        tt7 bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new yh8(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new x78();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                tt7<x78> tt7Var = PARSER;
                if (tt7Var != null) {
                    return tt7Var;
                }
                synchronized (x78.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new ek4.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                e44.b();
                return null;
        }
    }

    public final xi5.c s() {
        return this.strings_;
    }
}
