package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uh0 extends mhb {
    public final String t;
    public nkb<f09> u;

    public uh0(q09 q09Var) {
        String string = (String) q09Var.a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            q09Var.b(string, "SaveableStateHolder_BackStackEntryKey");
        }
        this.t = string;
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        super.onCleared();
        nkb<f09> nkbVar = this.u;
        if (nkbVar == null) {
            xj5.e("saveableStateHolderRef");
            throw null;
        }
        f09 f09Var = nkbVar.a.get();
        if (f09Var != null) {
            f09Var.f(this.t);
        }
        nkb<f09> nkbVar2 = this.u;
        if (nkbVar2 != null) {
            nkbVar2.a.clear();
        } else {
            xj5.e("saveableStateHolderRef");
            throw null;
        }
    }
}
