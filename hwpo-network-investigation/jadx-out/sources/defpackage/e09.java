package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e09<T> implements k19, im8 {
    public i19<T, Object> t;
    public m09 u;
    public String v;
    public T w;
    public Object[] x;
    public m09.a y;
    public final r15 z = new r15(1, this);

    public e09(i19<T, Object> i19Var, m09 m09Var, String str, T t, Object[] objArr) {
        this.t = i19Var;
        this.u = m09Var;
        this.v = str;
        this.w = t;
        this.x = objArr;
    }

    @Override // defpackage.k19
    public final boolean a(Object obj) {
        m09 m09Var = this.u;
        return m09Var == null || m09Var.a(obj);
    }

    @Override // defpackage.im8
    public final void b() {
        m09.a aVar = this.y;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // defpackage.im8
    public final void c() {
        m09.a aVar = this.y;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // defpackage.im8
    public final void d() {
        e();
    }

    public final void e() {
        String strB;
        m09 m09Var = this.u;
        if (this.y != null) {
            ca0.c(this.y, ") is not null", "entry(");
            return;
        }
        if (m09Var != null) {
            r15 r15Var = this.z;
            Object objInvoke = r15Var.invoke();
            if (objInvoke == null || m09Var.a(objInvoke)) {
                this.y = m09Var.b(r15Var, this.v);
                return;
            }
            if (objInvoke instanceof uu9) {
                uu9 uu9Var = (uu9) objInvoke;
                if (uu9Var.a() == ha7.u || uu9Var.a() == d3a.u || uu9Var.a() == jl8.u) {
                    strB = "MutableState containing " + uu9Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strB = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strB = mm8.b(objInvoke);
            }
            throw new IllegalArgumentException(strB);
        }
    }
}
