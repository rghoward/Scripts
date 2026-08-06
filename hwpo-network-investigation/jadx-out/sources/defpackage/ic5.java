package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ic5 implements thb.c {
    public final phb<?>[] a;

    public ic5(phb<?>... phbVarArr) {
        this.a = phbVarArr;
    }

    @Override // thb.c
    public final <VM extends mhb> VM create(Class<VM> cls, lb2 lb2Var) {
        phb phbVar;
        oh4<lb2, T> oh4Var;
        lb2Var.getClass();
        sd1 sd1VarA = ll8.a(cls);
        phb<?>[] phbVarArr = this.a;
        phb[] phbVarArr2 = (phb[]) Arrays.copyOf(phbVarArr, phbVarArr.length);
        int length = phbVarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                phbVar = null;
                break;
            }
            phbVar = phbVarArr2[i];
            if (phbVar.a.equals(sd1VarA)) {
                break;
            }
            i++;
        }
        VM vm = (phbVar == null || (oh4Var = phbVar.b) == 0) ? null : (VM) oh4Var.invoke(lb2Var);
        if (vm != null) {
            return vm;
        }
        r.a(sd1VarA.e(), "No initializer set for given class ");
        return null;
    }
}
