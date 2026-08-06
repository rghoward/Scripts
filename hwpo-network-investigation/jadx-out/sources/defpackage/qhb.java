package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qhb {
    public static final mhb a(sd1 sd1Var, whb whbVar, String str, thb.c cVar, lb2 lb2Var, jt1 jt1Var) {
        thb thbVarA;
        if (cVar != null) {
            vhb viewModelStore = whbVar.getViewModelStore();
            viewModelStore.getClass();
            lb2Var.getClass();
            thbVarA = new thb(viewModelStore, cVar, lb2Var);
        } else if (whbVar instanceof wt4) {
            vhb viewModelStore2 = whbVar.getViewModelStore();
            thb.c defaultViewModelProviderFactory = ((wt4) whbVar).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            lb2Var.getClass();
            thbVarA = new thb(viewModelStore2, defaultViewModelProviderFactory, lb2Var);
        } else {
            thbVarA = thb.b.a(whbVar, null, 6);
        }
        return str != null ? thbVarA.a.a(sd1Var, str) : thbVarA.a(sd1Var);
    }
}
