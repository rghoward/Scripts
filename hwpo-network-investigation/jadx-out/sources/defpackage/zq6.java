package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zq6 implements fi8 {
    public final /* synthetic */ ah9 a;
    public final /* synthetic */ xg9.a b;

    public zq6(ah9 ah9Var, xg9.a aVar) {
        this.a = ah9Var;
        this.b = aVar;
    }

    @Override // defpackage.fi8
    public final Object a(Object obj, ho5<?> ho5Var) {
        ho5Var.getClass();
        Object obj2 = this.a.get(ho5Var.getName());
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke = this.b.invoke();
        b(null, ho5Var, objInvoke);
        return objInvoke;
    }

    public final void b(Object obj, ho5<?> ho5Var, Object obj2) {
        ho5Var.getClass();
        ah9 ah9Var = this.a;
        if (obj2 == null) {
            ah9Var.remove(ho5Var.getName());
            return;
        }
        String name = ho5Var.getName();
        name.getClass();
        ah9Var.t.put(name, obj2);
    }
}
