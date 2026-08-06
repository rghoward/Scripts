package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r57 extends mhb implements o77 {
    public final LinkedHashMap t = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static r57 a(vhb vhbVar) {
            ic5 ic5Var = t57.a;
            lb2.a aVar = lb2.a.b;
            ic5Var.getClass();
            aVar.getClass();
            uhb uhbVar = new uhb(vhbVar, ic5Var, aVar);
            sd1 sd1VarA = ll8.a(r57.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (r57) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }
    }

    @Override // defpackage.o77
    public final vhb a(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.t;
        vhb vhbVar = (vhb) linkedHashMap.get(str);
        if (vhbVar != null) {
            return vhbVar;
        }
        vhb vhbVar2 = new vhb();
        linkedHashMap.put(str, vhbVar2);
        return vhbVar2;
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.t;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((vhb) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        ta1.a(16);
        sb.append(yq5.f(16, ((long) iIdentityHashCode) & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.t.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
