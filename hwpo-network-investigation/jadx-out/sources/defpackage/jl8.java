package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jl8 implements wu9 {
    public static final jl8 u = new jl8();
    public final /* synthetic */ int t = 0;

    public static final void a(wn5 wn5Var, String str) {
        String string;
        wn5Var.getClass();
        String str2 = "in the polymorphic scope of '" + wn5Var.c() + '\'';
        if (str == null) {
            string = eca.a('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbA = vb0.a("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            ux1.b(sbA, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbA.append(wn5Var.c());
            sbA.append("' has to be sealed and '@Serializable'.");
            string = sbA.toString();
        }
        throw new td9(string);
    }

    @Override // defpackage.wu9
    public boolean b(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String toString() {
        switch (this.t) {
            case 0:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }
}
