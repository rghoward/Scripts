package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jw7 extends qw7<hf8, oab<Object>> implements kw7 {
    public static final jw7 w = new jw7(yxa.e, 0);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends sw7<hf8, oab<Object>> {
        public jw7 y;

        public a(jw7 jw7Var) {
            this.t = new x17();
            this.u = jw7Var.t;
            this.x = jw7Var.u;
            this.y = jw7Var;
        }

        @Override // defpackage.sw7
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final jw7 a() {
            Object obj = this.u;
            jw7 jw7Var = this.y;
            if (obj != jw7Var.t) {
                this.t = new x17();
                jw7Var = new jw7(this.u, this.x);
            }
            this.y = jw7Var;
            return jw7Var;
        }

        @Override // defpackage.sw7, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof hf8) {
                return super.containsKey((hf8) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof oab) {
                return super.containsValue((oab) obj);
            }
            return false;
        }

        @Override // defpackage.sw7, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof hf8) {
                return (oab) super.get((hf8) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof hf8) ? obj2 : (oab) super.getOrDefault((hf8) obj, (oab) obj2);
        }

        @Override // defpackage.sw7, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof hf8) {
                return (oab) super.remove((hf8) obj);
            }
            return null;
        }
    }

    @Override // defpackage.ou1
    public final <T> T a(hf8 hf8Var) {
        return (T) pu1.a(this, hf8Var);
    }

    @Override // defpackage.kw7
    public final a builder() {
        return new a(this);
    }

    @Override // defpackage.qw7, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof hf8) {
            return super.containsKey((hf8) obj);
        }
        return false;
    }

    @Override // defpackage.t1, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof oab) {
            return super.containsValue((oab) obj);
        }
        return false;
    }

    @Override // defpackage.qw7, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof hf8) {
            return (oab) super.get((hf8) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof hf8) ? obj2 : (oab) super.getOrDefault((hf8) obj, (oab) obj2);
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
    @Override // defpackage.kw7
    public final jw7 x0(hf8 hf8Var, oab oabVar) {
        yxa.a aVarU = this.t.u(hf8Var.hashCode(), 0, hf8Var, oabVar);
        return aVarU == null ? this : new jw7(aVarU.a, this.u + aVarU.b);
    }
}
