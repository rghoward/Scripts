package defpackage;

import defpackage.mhb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class shb<VM extends mhb> implements ss5<VM> {
    public final sd1 t;
    public final mh4<vhb> u;
    public final mh4<thb.c> v;
    public final mh4<lb2> w;
    public VM x;

    public shb(sd1 sd1Var, mh4 mh4Var, mh4 mh4Var2, mh4 mh4Var3) {
        this.t = sd1Var;
        this.u = mh4Var;
        this.v = mh4Var2;
        this.w = mh4Var3;
    }

    @Override // defpackage.ss5
    public final Object getValue() {
        VM vm = this.x;
        if (vm != null) {
            return vm;
        }
        vhb vhbVarInvoke = this.u.invoke();
        thb.c cVarInvoke = this.v.invoke();
        lb2 lb2VarInvoke = this.w.invoke();
        vhbVarInvoke.getClass();
        cVarInvoke.getClass();
        lb2VarInvoke.getClass();
        uhb uhbVar = new uhb(vhbVarInvoke, cVarInvoke, lb2VarInvoke);
        sd1 sd1Var = this.t;
        String strE = sd1Var.e();
        if (strE == null) {
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }
        VM vm2 = (VM) uhbVar.a(sd1Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
        this.x = vm2;
        return vm2;
    }
}
